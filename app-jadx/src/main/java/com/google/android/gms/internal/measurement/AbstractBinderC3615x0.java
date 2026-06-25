package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3615x0 extends P implements InterfaceC3623y0 {
    public AbstractBinderC3615x0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) Q.b(parcel, Bundle.CREATOR);
        Q.f(parcel);
        f(bundle);
        parcel2.writeNoException();
        return true;
    }
}
