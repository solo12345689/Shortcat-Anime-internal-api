package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import com.android.vending.billing.IInAppBillingService;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3658e extends AbstractBinderC3683j implements InterfaceC3663f {
    public static InterfaceC3663f e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IInAppBillingService.DESCRIPTOR);
        return iInterfaceQueryLocalInterface instanceof InterfaceC3663f ? (InterfaceC3663f) iInterfaceQueryLocalInterface : new C3653d(iBinder);
    }
}
