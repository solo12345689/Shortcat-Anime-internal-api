package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.verification.SigningManager;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3834j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        String strF = null;
        String strF2 = null;
        v6 v6Var = null;
        String strF3 = null;
        G g10 = null;
        G g11 = null;
        G g12 = null;
        long jT = 0;
        long jT2 = 0;
        long jT3 = 0;
        boolean zL = false;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            switch (S8.b.k(iP)) {
                case 2:
                    strF = S8.b.f(parcel, iP);
                    break;
                case 3:
                    strF2 = S8.b.f(parcel, iP);
                    break;
                case 4:
                    v6Var = (v6) S8.b.e(parcel, iP, v6.CREATOR);
                    break;
                case 5:
                    jT = S8.b.t(parcel, iP);
                    break;
                case 6:
                    zL = S8.b.l(parcel, iP);
                    break;
                case 7:
                    strF3 = S8.b.f(parcel, iP);
                    break;
                case 8:
                    g10 = (G) S8.b.e(parcel, iP, G.CREATOR);
                    break;
                case 9:
                    jT2 = S8.b.t(parcel, iP);
                    break;
                case 10:
                    g11 = (G) S8.b.e(parcel, iP, G.CREATOR);
                    break;
                case 11:
                    jT3 = S8.b.t(parcel, iP);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    g12 = (G) S8.b.e(parcel, iP, G.CREATOR);
                    break;
                default:
                    S8.b.w(parcel, iP);
                    break;
            }
        }
        S8.b.j(parcel, iX);
        return new C3826i(strF, strF2, v6Var, jT, zL, strF3, g10, jT2, g11, jT3, g12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3826i[i10];
    }
}
