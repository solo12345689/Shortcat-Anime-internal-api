package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f35437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N4.m f35438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f35439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f35440d = new d0(this, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f35441e = new d0(this, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35442f;

    e0(Context context, N4.m mVar, N4.B b10, N4.s sVar, N4.p pVar, V v10) {
        this.f35437a = context;
        this.f35438b = mVar;
        this.f35439c = v10;
    }

    static /* bridge */ /* synthetic */ N4.s a(e0 e0Var) {
        e0Var.getClass();
        return null;
    }

    static /* bridge */ /* synthetic */ N4.p e(e0 e0Var) {
        e0Var.getClass();
        return null;
    }

    final N4.m d() {
        return this.f35438b;
    }

    final void f() {
        d0 d0Var = this.f35440d;
        Context context = this.f35437a;
        d0Var.c(context);
        this.f35441e.c(context);
    }

    final void g(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f35442f = z10;
        d0 d0Var = this.f35441e;
        Context context = this.f35437a;
        d0Var.a(context, intentFilter2);
        if (this.f35442f) {
            this.f35440d.b(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f35440d.a(context, intentFilter);
        }
    }
}
