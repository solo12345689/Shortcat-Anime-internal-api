package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f24139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f24140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f24141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f24142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f24143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f24144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CharSequence f24145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f24146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    List f24147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final long f24148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Bundle f24149k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f24151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f24152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bundle f24153d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f24150a = parcel.readString();
            this.f24151b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f24152c = parcel.readInt();
            this.f24153d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f24151b) + ", mIcon=" + this.f24152c + ", mExtras=" + this.f24153d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f24150a);
            TextUtils.writeToParcel(this.f24151b, parcel, i10);
            parcel.writeInt(this.f24152c);
            parcel.writeBundle(this.f24153d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f24139a = parcel.readInt();
        this.f24140b = parcel.readLong();
        this.f24142d = parcel.readFloat();
        this.f24146h = parcel.readLong();
        this.f24141c = parcel.readLong();
        this.f24143e = parcel.readLong();
        this.f24145g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f24147i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f24148j = parcel.readLong();
        this.f24149k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f24144f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f24139a + ", position=" + this.f24140b + ", buffered position=" + this.f24141c + ", speed=" + this.f24142d + ", updated=" + this.f24146h + ", actions=" + this.f24143e + ", error code=" + this.f24144f + ", error message=" + this.f24145g + ", custom actions=" + this.f24147i + ", active item id=" + this.f24148j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f24139a);
        parcel.writeLong(this.f24140b);
        parcel.writeFloat(this.f24142d);
        parcel.writeLong(this.f24146h);
        parcel.writeLong(this.f24141c);
        parcel.writeLong(this.f24143e);
        TextUtils.writeToParcel(this.f24145g, parcel, i10);
        parcel.writeTypedList(this.f24147i);
        parcel.writeLong(this.f24148j);
        parcel.writeBundle(this.f24149k);
        parcel.writeInt(this.f24144f);
    }
}
