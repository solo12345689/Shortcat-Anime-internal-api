package O8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        long jT = -1;
        boolean zL = false;
        int iR = 0;
        int iR2 = 0;
        String strF = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                zL = S8.b.l(parcel, iP);
            } else if (iK == 2) {
                strF = S8.b.f(parcel, iP);
            } else if (iK == 3) {
                iR = S8.b.r(parcel, iP);
            } else if (iK == 4) {
                iR2 = S8.b.r(parcel, iP);
            } else if (iK != 5) {
                S8.b.w(parcel, iP);
            } else {
                jT = S8.b.t(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new q(zL, strF, iR, iR2, jT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new q[i10];
    }
}
