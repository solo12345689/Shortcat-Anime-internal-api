package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class T5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        int iR = 0;
        long jT = 0;
        String strF = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                strF = S8.b.f(parcel, iP);
            } else if (iK == 2) {
                jT = S8.b.t(parcel, iP);
            } else if (iK != 3) {
                S8.b.w(parcel, iP);
            } else {
                iR = S8.b.r(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new S5(strF, jT, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new S5[i10];
    }
}
