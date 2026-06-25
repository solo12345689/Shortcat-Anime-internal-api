package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3818h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        long jT = 0;
        long jT2 = 0;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                jT = S8.b.t(parcel, iP);
            } else if (iK == 2) {
                iR = S8.b.r(parcel, iP);
            } else if (iK != 3) {
                S8.b.w(parcel, iP);
            } else {
                jT2 = S8.b.t(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new C3810g(jT, iR, jT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3810g[i10];
    }
}
