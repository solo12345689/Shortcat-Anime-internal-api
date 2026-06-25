package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24138e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f24134a = parcel.readInt();
        this.f24136c = parcel.readInt();
        this.f24137d = parcel.readInt();
        this.f24138e = parcel.readInt();
        this.f24135b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f24134a);
        parcel.writeInt(this.f24136c);
        parcel.writeInt(this.f24137d);
        parcel.writeInt(this.f24138e);
        parcel.writeInt(this.f24135b);
    }
}
