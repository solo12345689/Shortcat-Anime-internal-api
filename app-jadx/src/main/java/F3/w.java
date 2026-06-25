package F3;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f6525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f6526c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w createFromParcel(Parcel parcel) {
            return new w(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w[] newArray(int i10) {
            return new w[i10];
        }
    }

    w(int i10, float f10) {
        this.f6524a = i10;
        this.f6525b = f10;
    }

    public static w a(Object obj) {
        w wVarM = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        wVarM = i(rating.hasHeart());
                        break;
                    case 2:
                        wVarM = l(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        wVarM = k(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        wVarM = j(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                wVarM = m(ratingStyle);
            }
            ((w) AbstractC6614a.e(wVarM)).f6526c = obj;
        }
        return wVarM;
    }

    public static w i(boolean z10) {
        return new w(1, z10 ? 1.0f : 0.0f);
    }

    public static w j(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new w(6, f10);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static w k(int i10, float f10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else {
            if (i10 != 5) {
                Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
                return null;
            }
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new w(i10, f10);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static w l(boolean z10) {
        return new w(2, z10 ? 1.0f : 0.0f);
    }

    public static w m(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new w(i10, -1.0f);
            default:
                return null;
        }
    }

    public float b() {
        if (this.f6524a == 6 && g()) {
            return this.f6525b;
        }
        return -1.0f;
    }

    public Object c() {
        if (this.f6526c == null) {
            if (g()) {
                int i10 = this.f6524a;
                switch (i10) {
                    case 1:
                        this.f6526c = Rating.newHeartRating(f());
                        break;
                    case 2:
                        this.f6526c = Rating.newThumbRating(h());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f6526c = Rating.newStarRating(i10, e());
                        break;
                    case 6:
                        this.f6526c = Rating.newPercentageRating(b());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f6526c = Rating.newUnratedRating(this.f6524a);
            }
        }
        return this.f6526c;
    }

    public int d() {
        return this.f6524a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f6524a;
    }

    public float e() {
        int i10 = this.f6524a;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && g()) {
            return this.f6525b;
        }
        return -1.0f;
    }

    public boolean f() {
        return this.f6524a == 1 && this.f6525b == 1.0f;
    }

    public boolean g() {
        return this.f6525b >= 0.0f;
    }

    public boolean h() {
        return this.f6524a == 2 && this.f6525b == 1.0f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f6524a);
        sb2.append(" rating=");
        float f10 = this.f6525b;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6524a);
        parcel.writeFloat(this.f6525b);
    }
}
