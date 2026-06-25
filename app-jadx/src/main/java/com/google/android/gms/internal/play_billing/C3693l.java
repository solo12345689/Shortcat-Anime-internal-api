package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3693l extends AbstractC3678i implements InterfaceC3703n {
    C3693l(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC3703n
    public final void t1(String str, String str2, InterfaceC3713p interfaceC3713p) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        int i10 = AbstractC3688k.f40495a;
        parcelG3.writeStrongBinder(interfaceC3713p);
        J3(1, parcelG3);
    }
}
