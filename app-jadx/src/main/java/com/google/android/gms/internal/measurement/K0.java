package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class K0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        String strF = null;
        int iR = 0;
        Intent intent = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                iR = S8.b.r(parcel, iP);
            } else if (iK == 2) {
                strF = S8.b.f(parcel, iP);
            } else if (iK != 3) {
                S8.b.w(parcel, iP);
            } else {
                intent = (Intent) S8.b.e(parcel, iP, Intent.CREATOR);
            }
        }
        S8.b.j(parcel, iX);
        return new J0(iR, strF, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new J0[i10];
    }
}
