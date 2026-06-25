package com.android.billingclient.api;

import N4.C1961a;
import N4.C1966f;
import N4.InterfaceC1962b;
import N4.InterfaceC1964d;
import N4.InterfaceC1967g;
import N4.InterfaceC1971k;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.android.billingclient.api.AbstractC3156a;
import com.android.billingclient.api.C3160e;
import com.google.android.gms.internal.play_billing.B0;
import com.google.android.gms.internal.play_billing.G0;
import com.google.android.gms.internal.play_billing.InterfaceC3703n;
import com.google.android.gms.internal.play_billing.J2;
import com.google.android.gms.internal.play_billing.O2;
import com.google.android.gms.internal.play_billing.O3;
import com.google.android.gms.internal.play_billing.Q3;
import com.google.android.gms.internal.play_billing.R2;
import com.google.android.gms.internal.play_billing.T3;
import com.google.android.gms.internal.play_billing.Y2;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class T extends C3157b {

    /* JADX INFO: renamed from: K */
    private final Context f35315K;

    /* JADX INFO: renamed from: L */
    private volatile int f35316L;

    /* JADX INFO: renamed from: M */
    private volatile InterfaceC3703n f35317M;

    /* JADX INFO: renamed from: N */
    private volatile S f35318N;

    /* JADX INFO: renamed from: O */
    private volatile ScheduledExecutorService f35319O;

    T(String str, Context context, V v10, ExecutorService executorService, AbstractC3156a.C0594a c0594a) {
        super(null, context, null, null, c0594a);
        this.f35316L = 0;
        this.f35315K = context;
    }

    private final synchronized void W0() {
        c1(27);
        try {
            try {
                if (this.f35318N != null && this.f35317M != null) {
                    com.google.android.gms.internal.play_billing.V.l("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.f35315K.unbindService(this.f35318N);
                    this.f35318N = new S(this, null);
                }
                this.f35317M = null;
                if (this.f35319O != null) {
                    this.f35319O.shutdownNow();
                    this.f35319O = null;
                }
            } catch (RuntimeException e10) {
                com.google.android.gms.internal.play_billing.V.n("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
            }
            this.f35316L = 3;
        } catch (Throwable th2) {
            this.f35316L = 3;
            throw th2;
        }
    }

    private final synchronized void X0() {
        if (m1()) {
            com.google.android.gms.internal.play_billing.V.l("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            c1(26);
            return;
        }
        if (this.f35316L == 1) {
            com.google.android.gms.internal.play_billing.V.m("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f35316L == 3) {
            com.google.android.gms.internal.play_billing.V.m("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            b1(R2.BILLING_CLIENT_CLOSED, 26, W.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f35316L = 1;
        com.google.android.gms.internal.play_billing.V.l("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f35318N = new S(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.f35315K;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        R2 r22 = R2.REASON_UNSPECIFIED;
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            r22 = R2.INTENT_SERVICE_NOT_FOUND;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    r22 = R2.BILLING_SERVICE_BLOCKED;
                    com.google.android.gms.internal.play_billing.V.m("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.f35318N, 1)) {
                        com.google.android.gms.internal.play_billing.V.l("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        r22 = R2.BILLING_SERVICE_BLOCKED;
                        com.google.android.gms.internal.play_billing.V.m("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.f35316L = 0;
        com.google.android.gms.internal.play_billing.V.l("BillingClientTesting", "Billing Override Service unavailable on device.");
        b1(r22, 26, W.a(2, "Billing Override Service unavailable on device."));
    }

    public static final boolean Y0(int i10) {
        return i10 > 0;
    }

    public final C3160e Z0(int i10, int i11) {
        C3160e c3160eA = W.a(i11, "Billing override value was set by a license tester.");
        b1(R2.LICENSE_TESTER_BILLING_OVERRIDE, i10, c3160eA);
        return c3160eA;
    }

    private final G0 a1(final int i10) {
        if (m1()) {
            return T3.a(new Q3() { // from class: com.android.billingclient.api.L
                @Override // com.google.android.gms.internal.play_billing.Q3
                public final Object a(O3 o32) {
                    return T.o1(this.f35285a, i10, o32);
                }
            });
        }
        com.google.android.gms.internal.play_billing.V.m("BillingClientTesting", "Billing Override Service is not ready.");
        b1(R2.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, W.a(-1, "Billing Override Service connection is disconnected."));
        return B0.a(0);
    }

    public final void b1(R2 r22, int i10, C3160e c3160e) {
        int i11 = U.f35320a;
        J2 j2B = U.b(r22, i10, c3160e, null, Y2.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(j2B, "ApiFailure should not be null");
        G0().b(j2B);
    }

    public final void c1(int i10) {
        int i11 = U.f35320a;
        O2 o2C = U.c(i10, Y2.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(o2C, "ApiSuccess should not be null");
        G0().i(o2C);
    }

    private final void d1(int i10, K1.a aVar, Runnable runnable) {
        B0.c(B0.b(a1(i10), 28500L, TimeUnit.MILLISECONDS, s1()), new P(this, i10, aVar, runnable), n());
    }

    public static /* synthetic */ Object o1(T t10, int i10, O3 o32) {
        try {
            if (t10.f35317M == null) {
                throw null;
            }
            t10.f35317M.t1(t10.f35315K.getPackageName(), i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW", new Q(o32));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            t10.b1(R2.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, W.f35327F);
            com.google.android.gms.internal.play_billing.V.n("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            o32.b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    private final int r1(G0 g02) {
        try {
            return ((Integer) g02.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            b1(R2.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, W.f35327F);
            com.google.android.gms.internal.play_billing.V.n("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
            return 0;
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            b1(R2.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, W.f35327F);
            com.google.android.gms.internal.play_billing.V.n("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
            return 0;
        }
    }

    private final synchronized ScheduledExecutorService s1() {
        try {
            if (this.f35319O == null) {
                this.f35319O = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f35319O;
    }

    @Override // com.android.billingclient.api.C3157b, com.android.billingclient.api.AbstractC3156a
    public final void a(final C1961a c1961a, final InterfaceC1962b interfaceC1962b) {
        Objects.requireNonNull(interfaceC1962b);
        d1(3, new K1.a() { // from class: N4.v
            @Override // K1.a
            public final void accept(Object obj) {
                interfaceC1962b.a((C3160e) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.M
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.a(c1961a, interfaceC1962b);
            }
        });
    }

    @Override // com.android.billingclient.api.C3157b, com.android.billingclient.api.AbstractC3156a
    public final void b(final C1966f c1966f, final InterfaceC1967g interfaceC1967g) {
        d1(4, new K1.a() { // from class: N4.u
            @Override // K1.a
            public final void accept(Object obj) {
                interfaceC1967g.a((C3160e) obj, c1966f.a());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.K
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.b(c1966f, interfaceC1967g);
            }
        });
    }

    @Override // com.android.billingclient.api.C3157b, com.android.billingclient.api.AbstractC3156a
    public final void c() {
        W0();
        super.c();
    }

    @Override // com.android.billingclient.api.C3157b, com.android.billingclient.api.AbstractC3156a
    public final C3160e g(final Activity activity, final C3159d c3159d) {
        K1.a aVar = new K1.a() { // from class: com.android.billingclient.api.N
            @Override // K1.a
            public final void accept(Object obj) {
                super/*com.android.billingclient.api.b*/.J0((C3160e) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.O
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return super/*com.android.billingclient.api.b*/.g(activity, c3159d);
            }
        };
        int iR1 = r1(a1(2));
        if (Y0(iR1)) {
            C3160e c3160eZ0 = Z0(2, iR1);
            aVar.accept(c3160eZ0);
            return c3160eZ0;
        }
        try {
            return (C3160e) callable.call();
        } catch (Exception e10) {
            R2 r22 = R2.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            C3160e c3160e = W.f35335h;
            b1(r22, 2, c3160e);
            com.google.android.gms.internal.play_billing.V.n("BillingClientTesting", "An internal error occurred.", e10);
            return c3160e;
        }
    }

    @Override // com.android.billingclient.api.C3157b, com.android.billingclient.api.AbstractC3156a
    public final void i(final C3164i c3164i, final InterfaceC1971k interfaceC1971k) {
        d1(7, new K1.a() { // from class: com.android.billingclient.api.I
            @Override // K1.a
            public final void accept(Object obj) {
                C3165j c3165j = new C3165j(new ArrayList(), new ArrayList());
                interfaceC1971k.a((C3160e) obj, c3165j);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.J
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.i(c3164i, interfaceC1971k);
            }
        });
    }

    @Override // com.android.billingclient.api.C3157b, com.android.billingclient.api.AbstractC3156a
    public final void l(InterfaceC1964d interfaceC1964d) {
        X0();
        super.l(interfaceC1964d);
    }

    public final synchronized boolean m1() {
        if (this.f35316L == 2 && this.f35317M != null) {
            if (this.f35318N != null) {
                return true;
            }
        }
        return false;
    }

    T(String str, C3162g c3162g, Context context, N4.B b10, V v10, ExecutorService executorService, AbstractC3156a.C0594a c0594a) {
        super(null, c3162g, context, null, null, null, c0594a);
        this.f35316L = 0;
        this.f35315K = context;
    }

    T(String str, C3162g c3162g, Context context, N4.m mVar, N4.s sVar, V v10, ExecutorService executorService, AbstractC3156a.C0594a c0594a) {
        super(null, c3162g, context, mVar, null, null, null, c0594a);
        this.f35316L = 0;
        this.f35315K = context;
    }
}
