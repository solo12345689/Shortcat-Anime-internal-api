package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        PendingIntent pendingIntent = null;
        String strF = null;
        Integer numS = null;
        int iR = 0;
        int iR2 = 0;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                iR = S8.b.r(parcel, iP);
            } else if (iK == 2) {
                iR2 = S8.b.r(parcel, iP);
            } else if (iK == 3) {
                pendingIntent = (PendingIntent) S8.b.e(parcel, iP, PendingIntent.CREATOR);
            } else if (iK == 4) {
                strF = S8.b.f(parcel, iP);
            } else if (iK != 5) {
                S8.b.w(parcel, iP);
            } else {
                numS = S8.b.s(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new ConnectionResult(iR, iR2, pendingIntent, strF, numS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionResult[i10];
    }
}
