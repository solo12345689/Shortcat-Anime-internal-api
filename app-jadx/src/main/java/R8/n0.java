package R8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        r rVar = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zL = false;
        boolean zL2 = false;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            switch (S8.b.k(iP)) {
                case 1:
                    rVar = (r) S8.b.e(parcel, iP, r.CREATOR);
                    break;
                case 2:
                    zL = S8.b.l(parcel, iP);
                    break;
                case 3:
                    zL2 = S8.b.l(parcel, iP);
                    break;
                case 4:
                    iArrC = S8.b.c(parcel, iP);
                    break;
                case 5:
                    iR = S8.b.r(parcel, iP);
                    break;
                case 6:
                    iArrC2 = S8.b.c(parcel, iP);
                    break;
                default:
                    S8.b.w(parcel, iP);
                    break;
            }
        }
        S8.b.j(parcel, iX);
        return new C2104e(rVar, zL, zL2, iArrC, iR, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2104e[i10];
    }
}
