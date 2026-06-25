package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        String strF = null;
        ConnectionResult connectionResult = null;
        int iR = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                iR = S8.b.r(parcel, iP);
            } else if (iK == 2) {
                strF = S8.b.f(parcel, iP);
            } else if (iK == 3) {
                pendingIntent = (PendingIntent) S8.b.e(parcel, iP, PendingIntent.CREATOR);
            } else if (iK != 4) {
                S8.b.w(parcel, iP);
            } else {
                connectionResult = (ConnectionResult) S8.b.e(parcel, iP, ConnectionResult.CREATOR);
            }
        }
        S8.b.j(parcel, iX);
        return new Status(iR, strF, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
