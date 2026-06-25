package l9;

import R8.O;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l9.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5580k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        O o10 = null;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                iR = S8.b.r(parcel, iP);
            } else if (iK != 2) {
                S8.b.w(parcel, iP);
            } else {
                o10 = (O) S8.b.e(parcel, iP, O.CREATOR);
            }
        }
        S8.b.j(parcel, iX);
        return new C5579j(iR, o10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5579j[i10];
    }
}
