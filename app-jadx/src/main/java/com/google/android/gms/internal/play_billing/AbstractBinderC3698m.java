package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3698m extends AbstractBinderC3683j implements InterfaceC3703n {
    public static InterfaceC3703n e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3703n ? (InterfaceC3703n) iInterfaceQueryLocalInterface : new C3693l(iBinder);
    }
}
