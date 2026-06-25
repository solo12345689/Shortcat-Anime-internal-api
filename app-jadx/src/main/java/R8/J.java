package R8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        int iR = -1;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        String strF = null;
        String strF2 = null;
        long jT = 0;
        long jT2 = 0;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            switch (S8.b.k(iP)) {
                case 1:
                    iR2 = S8.b.r(parcel, iP);
                    break;
                case 2:
                    iR3 = S8.b.r(parcel, iP);
                    break;
                case 3:
                    iR4 = S8.b.r(parcel, iP);
                    break;
                case 4:
                    jT = S8.b.t(parcel, iP);
                    break;
                case 5:
                    jT2 = S8.b.t(parcel, iP);
                    break;
                case 6:
                    strF = S8.b.f(parcel, iP);
                    break;
                case 7:
                    strF2 = S8.b.f(parcel, iP);
                    break;
                case 8:
                    iR5 = S8.b.r(parcel, iP);
                    break;
                case 9:
                    iR = S8.b.r(parcel, iP);
                    break;
                default:
                    S8.b.w(parcel, iP);
                    break;
            }
        }
        S8.b.j(parcel, iX);
        return new C2112m(iR2, iR3, iR4, jT, jT2, strF, strF2, iR5, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2112m[i10];
    }
}
