package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        byte[] bArrB = null;
        String strF = null;
        Bundle bundleA = null;
        String strF2 = null;
        long jT = 0;
        long jT2 = 0;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            switch (S8.b.k(iP)) {
                case 1:
                    jT = S8.b.t(parcel, iP);
                    break;
                case 2:
                    bArrB = S8.b.b(parcel, iP);
                    break;
                case 3:
                    strF = S8.b.f(parcel, iP);
                    break;
                case 4:
                    bundleA = S8.b.a(parcel, iP);
                    break;
                case 5:
                    iR = S8.b.r(parcel, iP);
                    break;
                case 6:
                    jT2 = S8.b.t(parcel, iP);
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
        return new X5(jT, bArrB, strF, bundleA, iR, jT2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new X5[i10];
    }
}
