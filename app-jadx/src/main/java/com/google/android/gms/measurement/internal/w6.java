package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class w6 implements Parcelable.Creator {
    static void a(v6 v6Var, Parcel parcel, int i10) {
        int i11 = v6Var.f41668a;
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, i11);
        S8.c.q(parcel, 2, v6Var.f41669b, false);
        S8.c.n(parcel, 3, v6Var.f41670c);
        S8.c.o(parcel, 4, v6Var.f41671d, false);
        S8.c.h(parcel, 5, null, false);
        S8.c.q(parcel, 6, v6Var.f41672e, false);
        S8.c.q(parcel, 7, v6Var.f41673f, false);
        S8.c.g(parcel, 8, v6Var.f41674g, false);
        S8.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        String strF = null;
        Long lU = null;
        Float fO = null;
        String strF2 = null;
        String strF3 = null;
        Double dN = null;
        long jT = 0;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            switch (S8.b.k(iP)) {
                case 1:
                    iR = S8.b.r(parcel, iP);
                    break;
                case 2:
                    strF = S8.b.f(parcel, iP);
                    break;
                case 3:
                    jT = S8.b.t(parcel, iP);
                    break;
                case 4:
                    lU = S8.b.u(parcel, iP);
                    break;
                case 5:
                    fO = S8.b.o(parcel, iP);
                    break;
                case 6:
                    strF2 = S8.b.f(parcel, iP);
                    break;
                case 7:
                    strF3 = S8.b.f(parcel, iP);
                    break;
                case 8:
                    dN = S8.b.n(parcel, iP);
                    break;
                default:
                    S8.b.w(parcel, iP);
                    break;
            }
        }
        S8.b.j(parcel, iX);
        return new v6(iR, strF, jT, lU, fO, strF2, strF3, dN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v6[i10];
    }
}
