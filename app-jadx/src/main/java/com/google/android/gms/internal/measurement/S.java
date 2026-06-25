package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class S extends O implements U {
    S(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.U
    public final Bundle l2(Bundle bundle) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, bundle);
        Parcel parcelC = c(1, parcelG3);
        Bundle bundle2 = (Bundle) Q.b(parcelC, Bundle.CREATOR);
        parcelC.recycle();
        return bundle2;
    }
}
