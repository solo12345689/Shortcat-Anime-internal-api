package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        String strF = null;
        Long lU = null;
        ArrayList arrayListG = null;
        String strF2 = null;
        int iR = 0;
        boolean zL = false;
        boolean zL2 = false;
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
                    lU = S8.b.u(parcel, iP);
                    break;
                case 4:
                    zL = S8.b.l(parcel, iP);
                    break;
                case 5:
                    zL2 = S8.b.l(parcel, iP);
                    break;
                case 6:
                    arrayListG = S8.b.g(parcel, iP);
                    break;
                case 7:
                    strF2 = S8.b.f(parcel, iP);
                    break;
                default:
                    S8.b.w(parcel, iP);
                    break;
            }
        }
        S8.b.j(parcel, iX);
        return new TokenData(iR, strF, lU, zL, zL2, arrayListG, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
