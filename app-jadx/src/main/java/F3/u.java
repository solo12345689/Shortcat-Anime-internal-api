package F3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6491e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i10) {
            return new u[i10];
        }
    }

    public u(Parcel parcel) {
        this.f6487a = parcel.readInt();
        this.f6489c = parcel.readInt();
        this.f6490d = parcel.readInt();
        this.f6491e = parcel.readInt();
        this.f6488b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6487a);
        parcel.writeInt(this.f6489c);
        parcel.writeInt(this.f6490d);
        parcel.writeInt(this.f6491e);
        parcel.writeInt(this.f6488b);
    }
}
