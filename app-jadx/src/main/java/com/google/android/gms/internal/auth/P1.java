package com.google.android.gms.internal.auth;

import Q8.InterfaceC2056d;
import Q8.InterfaceC2064l;
import R8.AbstractC2106g;
import R8.C2103d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class P1 extends AbstractC2106g {
    P1(Context context, Looper looper, C2103d c2103d, InterfaceC2056d interfaceC2056d, InterfaceC2064l interfaceC2064l) {
        super(context, looper, 224, c2103d, interfaceC2056d, interfaceC2064l);
    }

    @Override // R8.AbstractC2102c
    protected final String D() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // R8.AbstractC2102c
    protected final String E() {
        return "com.google.android.gms.auth.account.authapi.START";
    }

    @Override // R8.AbstractC2102c
    protected final boolean H() {
        return true;
    }

    @Override // R8.AbstractC2102c
    public final boolean R() {
        return true;
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final void b(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.b(str);
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final int k() {
        return 17895000;
    }

    @Override // R8.AbstractC2102c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return iInterfaceQueryLocalInterface instanceof S1 ? (S1) iInterfaceQueryLocalInterface : new S1(iBinder);
    }

    @Override // R8.AbstractC2102c
    public final O8.c[] t() {
        return new O8.c[]{G8.e.f7408l, G8.e.f7407k, G8.e.f7397a};
    }
}
