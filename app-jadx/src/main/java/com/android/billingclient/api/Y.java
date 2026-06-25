package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.w3;
import p8.AbstractC5939d;
import p8.C5938c;
import p8.InterfaceC5942g;
import p8.InterfaceC5943h;
import r8.C6294t;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5943h f35357b;

    Y(Context context) {
        try {
            C6294t.f(context);
            this.f35357b = C6294t.c().g(com.google.android.datatransport.cct.a.f38808g).a("PLAY_BILLING_LIBRARY", w3.class, C5938c.b("proto"), new InterfaceC5942g() { // from class: N4.A
                @Override // p8.InterfaceC5942g
                public final Object apply(Object obj) {
                    return ((w3) obj).b();
                }
            });
        } catch (Throwable unused) {
            this.f35356a = true;
        }
    }

    public final void a(w3 w3Var) {
        if (this.f35356a) {
            com.google.android.gms.internal.play_billing.V.m("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f35357b.a(AbstractC5939d.e(w3Var));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.V.m("BillingLogger", "logging failed.");
        }
    }
}
