package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class I0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        Bundle bundleA = null;
        String strF = null;
        boolean zL = false;
        long jT = 0;
        long jT2 = 0;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                jT = S8.b.t(parcel, iP);
            } else if (iK == 2) {
                jT2 = S8.b.t(parcel, iP);
            } else if (iK == 3) {
                zL = S8.b.l(parcel, iP);
            } else if (iK == 7) {
                bundleA = S8.b.a(parcel, iP);
            } else if (iK != 8) {
                S8.b.w(parcel, iP);
            } else {
                strF = S8.b.f(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new H0(jT, jT2, zL, bundleA, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new H0[i10];
    }
}
