package com.google.android.gms.internal.auth;

import Q8.InterfaceC2056d;
import Q8.InterfaceC2064l;
import R8.AbstractC2106g;
import R8.C2103d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3343d extends AbstractC2106g {

    /* JADX INFO: renamed from: I */
    private final Bundle f39151I;

    public C3343d(Context context, Looper looper, C2103d c2103d, H8.c cVar, InterfaceC2056d interfaceC2056d, InterfaceC2064l interfaceC2064l) {
        super(context, looper, 16, c2103d, interfaceC2056d, interfaceC2064l);
        this.f39151I = new Bundle();
    }

    @Override // R8.AbstractC2102c
    protected final String D() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // R8.AbstractC2102c
    protected final String E() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // R8.AbstractC2102c
    public final boolean R() {
        return true;
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final boolean f() {
        C2103d c2103dI0 = i0();
        return (TextUtils.isEmpty(c2103dI0.b()) || c2103dI0.e(H8.b.f8178a).isEmpty()) ? false : true;
    }

    @Override // R8.AbstractC2102c, P8.a.f
    public final int k() {
        return 12451000;
    }

    @Override // R8.AbstractC2102c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof C3346e ? (C3346e) iInterfaceQueryLocalInterface : new C3346e(iBinder);
    }

    @Override // R8.AbstractC2102c
    protected final Bundle y() {
        return this.f39151I;
    }
}
