package com.android.billingclient.api;

import N4.InterfaceC1964d;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.A3;
import com.google.android.gms.internal.play_billing.AbstractBinderC3658e;
import com.google.android.gms.internal.play_billing.C3;
import com.google.android.gms.internal.play_billing.G3;
import com.google.android.gms.internal.play_billing.H2;
import com.google.android.gms.internal.play_billing.H3;
import com.google.android.gms.internal.play_billing.InterfaceC3663f;
import com.google.android.gms.internal.play_billing.J2;
import com.google.android.gms.internal.play_billing.J3;
import com.google.android.gms.internal.play_billing.L2;
import com.google.android.gms.internal.play_billing.O2;
import com.google.android.gms.internal.play_billing.P2;
import com.google.android.gms.internal.play_billing.R2;
import com.google.android.gms.internal.play_billing.T2;
import com.google.android.gms.internal.play_billing.W2;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class E implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1964d f35264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.C f35265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.C f35266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f35267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3157b f35268e;

    /* synthetic */ E(C3157b c3157b, InterfaceC1964d interfaceC1964d, int i10, N4.t tVar) {
        Objects.requireNonNull(c3157b);
        this.f35268e = c3157b;
        this.f35265b = com.google.android.gms.internal.play_billing.C.c(c3157b.f35374J);
        this.f35266c = com.google.android.gms.internal.play_billing.C.c(c3157b.f35374J);
        this.f35264a = interfaceC1964d;
        this.f35267d = i10;
    }

    public static /* synthetic */ Object a(E e10) {
        Bundle bundle;
        InterfaceC3663f interfaceC3663f;
        C3157b c3157b = e10.f35268e;
        synchronized (c3157b.f35375a) {
            try {
                if (c3157b.f35376b != 3) {
                    boolean z10 = c3157b.f35376b == 1;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        com.google.android.gms.internal.play_billing.V.c(bundle, c3157b.f35377c, c3157b.f35378d, c3157b.f35373I.longValue());
                    }
                    R2 r22 = R2.REASON_UNSPECIFIED;
                    synchronized (c3157b.f35375a) {
                        interfaceC3663f = c3157b.f35383i;
                    }
                    if (interfaceC3663f == null) {
                        C3157b c3157b2 = e10.f35268e;
                        c3157b2.K(0);
                        int i10 = e10.f35267d;
                        R2 r23 = R2.SERVICE_RESET_TO_NULL;
                        C3160e c3160e = W.f35337j;
                        c3157b2.J(r23, c3160e, i10);
                        e10.g(c3160e);
                    } else {
                        C3157b c3157b3 = e10.f35268e;
                        String packageName = c3157b3.f35381g.getPackageName();
                        int i11 = 25;
                        int iD1 = 3;
                        int i12 = 25;
                        while (true) {
                            if (i12 < 3) {
                                i12 = 0;
                                break;
                            }
                            if (bundle == null) {
                                try {
                                    iD1 = interfaceC3663f.D1(i12, packageName, "subs");
                                } catch (Exception e11) {
                                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception while checking if billing is supported; try to reconnect", e11);
                                    R2 r24 = e11 instanceof DeadObjectException ? R2.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION : e11 instanceof RemoteException ? R2.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION : e11 instanceof SecurityException ? R2.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : R2.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                    String strA = r24.equals(R2.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? U.a(e11) : null;
                                    e10.f35268e.K(0);
                                    e10.f(C3157b.I0(e11), r24, strA, z10);
                                    e10.g(C3157b.I0(e11));
                                }
                            } else {
                                iD1 = interfaceC3663f.i3(i12, packageName, "subs", bundle);
                            }
                            if (iD1 == 0) {
                                com.google.android.gms.internal.play_billing.V.l("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                break;
                            }
                            i12--;
                        }
                        c3157b3.f35386l = i12 >= 5;
                        c3157b3.f35385k = i12 >= 3;
                        if (i12 < 3) {
                            r22 = R2.SUBSCRIPTIONS_NOT_SUPPORTED;
                            com.google.android.gms.internal.play_billing.V.l("BillingClient", "In-app billing API does not support subscription on this device.");
                        }
                        while (true) {
                            if (i11 < 3) {
                                break;
                            }
                            iD1 = bundle == null ? interfaceC3663f.D1(i11, packageName, "inapp") : interfaceC3663f.i3(i11, packageName, "inapp", bundle);
                            if (iD1 == 0) {
                                c3157b3.f35387m = i11;
                                com.google.android.gms.internal.play_billing.V.l("BillingClient", "mHighestLevelSupportedForInApp: " + c3157b3.f35387m);
                                break;
                            }
                            i11--;
                        }
                        C3157b.U(c3157b3, c3157b3.f35387m);
                        if (c3157b3.f35387m < 3) {
                            r22 = R2.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                            com.google.android.gms.internal.play_billing.V.m("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        }
                        C3157b.W(c3157b3, iD1);
                        if (iD1 != 0) {
                            C3160e c3160e2 = W.f35329b;
                            e10.f(c3160e2, r22, null, z10);
                            e10.g(c3160e2);
                        } else {
                            try {
                                Long lE = e10.e(z10);
                                if (z10) {
                                    L2 l2I = O2.I();
                                    l2I.s(6);
                                    H3 h3G = J3.G();
                                    int i13 = e10.f35267d;
                                    h3G.n(i13 > 0);
                                    h3G.p(i13);
                                    if (lE != null) {
                                        h3G.q(lE.longValue());
                                    }
                                    C3157b c3157b4 = e10.f35268e;
                                    l2I.r(h3G);
                                    c3157b4.I((O2) l2I.i());
                                } else {
                                    A3 a3E = C3.E();
                                    P2 p2H = T2.H();
                                    p2H.s(0);
                                    a3E.n(p2H);
                                    if (lE != null) {
                                        a3E.p(lE.longValue());
                                    }
                                    e10.f35268e.f35382h.g((C3) a3E.i());
                                }
                            } catch (Throwable th2) {
                                com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
                            }
                            e10.g(W.f35336i);
                        }
                    }
                }
            } finally {
            }
        }
        return null;
    }

    public static /* synthetic */ void b(E e10) {
        C3157b c3157b = e10.f35268e;
        c3157b.K(0);
        R2 r22 = R2.EXECUTE_ASYNC_TIMEOUT;
        C3160e c3160e = W.f35338k;
        c3157b.J(r22, c3160e, e10.f35267d);
        e10.g(c3160e);
    }

    private final Long e(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.C c10 = this.f35265b;
            if (!c10.g()) {
                return null;
            }
            c10.f();
            return Long.valueOf(c10.a(TimeUnit.MILLISECONDS));
        }
        com.google.android.gms.internal.play_billing.C c11 = this.f35266c;
        if (!c11.g()) {
            return null;
        }
        c11.f();
        return Long.valueOf(c11.a(TimeUnit.MILLISECONDS));
    }

    private final void f(C3160e c3160e, R2 r22, String str, boolean z10) {
        try {
            P2 p2H = T2.H();
            p2H.s(c3160e.c());
            p2H.p(c3160e.a());
            p2H.r(r22);
            if (str != null) {
                p2H.n(str);
            }
            Long lE = e(z10);
            if (!z10) {
                A3 a3E = C3.E();
                a3E.n(p2H);
                if (lE != null) {
                    a3E.p(lE.longValue());
                }
                this.f35268e.f35382h.g((C3) a3E.i());
                return;
            }
            H3 h3G = J3.G();
            int i10 = this.f35267d;
            h3G.n(i10 > 0);
            h3G.p(i10);
            if (lE != null) {
                h3G.q(lE.longValue());
            }
            C3157b c3157b = this.f35268e;
            H2 h2K = J2.K();
            h2K.p(p2H);
            h2K.t(6);
            h2K.s(h3G);
            c3157b.G((J2) h2K.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
    }

    private final void g(C3160e c3160e) {
        C3157b c3157b = this.f35268e;
        synchronized (c3157b.f35375a) {
            try {
                if (c3157b.f35376b == 3) {
                    return;
                }
                try {
                    this.f35264a.onBillingSetupFinished(c3160e);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c() {
        com.google.android.gms.internal.play_billing.C c10 = this.f35265b;
        c10.d();
        c10.e();
    }

    final boolean d() {
        return this.f35267d > 0;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.V.m("BillingClient", "Billing service died.");
        try {
            C3157b c3157b = this.f35268e;
            if (C3157b.a0(c3157b)) {
                V v10 = c3157b.f35382h;
                H2 h2K = J2.K();
                h2K.t(6);
                P2 p2H = T2.H();
                p2H.r(R2.BINDING_DIED);
                h2K.p(p2H);
                H3 h3G = J3.G();
                int i10 = this.f35267d;
                h3G.n(i10 > 0);
                h3G.p(i10);
                h2K.s(h3G);
                v10.b((J2) h2K.i());
            } else {
                c3157b.f35382h.e(W2.D());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
        C3157b c3157b2 = this.f35268e;
        synchronized (c3157b2.f35375a) {
            if (c3157b2.f35376b != 3 && c3157b2.f35376b != 0) {
                c3157b2.K(0);
                c3157b2.N();
                try {
                    this.f35264a.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.V.l("BillingClient", "Billing service connected.");
        C3157b c3157b = this.f35268e;
        synchronized (c3157b.f35375a) {
            try {
                if (c3157b.f35376b == 3) {
                    return;
                }
                c3157b.f35383i = AbstractBinderC3658e.e(iBinder);
                if (C3157b.o(new Callable() { // from class: com.android.billingclient.api.C
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        E.a(this.f35262a);
                        return null;
                    }
                }, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.b(this.f35263a);
                    }
                }, c3157b.f0(), c3157b.n()) == null) {
                    int i10 = this.f35267d;
                    C3160e c3160eI0 = c3157b.i0();
                    c3157b.J(R2.MISSING_RESULT_FROM_EXECUTE_ASYNC, c3160eI0, i10);
                    g(c3160eI0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.V.m("BillingClient", "Billing service disconnected.");
        try {
            C3157b c3157b = this.f35268e;
            if (C3157b.a0(c3157b)) {
                V v10 = c3157b.f35382h;
                H2 h2K = J2.K();
                h2K.t(6);
                P2 p2H = T2.H();
                p2H.r(R2.SERVICE_DISCONNECTED);
                h2K.p(p2H);
                H3 h3G = J3.G();
                int i10 = this.f35267d;
                h3G.n(i10 > 0);
                h3G.p(i10);
                h2K.s(h3G);
                v10.b((J2) h2K.i());
            } else {
                c3157b.f35382h.j(G3.D());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.C c10 = this.f35266c;
        c10.d();
        c10.e();
        C3157b c3157b2 = this.f35268e;
        synchronized (c3157b2.f35375a) {
            try {
                if (c3157b2.f35376b == 3) {
                    return;
                }
                c3157b2.K(0);
                try {
                    this.f35264a.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } finally {
            }
        }
    }
}
