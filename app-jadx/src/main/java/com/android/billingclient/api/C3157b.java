package com.android.billingclient.api;

import N4.C1961a;
import N4.C1966f;
import N4.C1968h;
import N4.InterfaceC1962b;
import N4.InterfaceC1964d;
import N4.InterfaceC1965e;
import N4.InterfaceC1967g;
import N4.InterfaceC1969i;
import N4.InterfaceC1971k;
import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.AbstractC3156a;
import com.android.billingclient.api.C3159d;
import com.android.billingclient.api.C3163h;
import com.android.billingclient.api.C3164i;
import com.google.android.gms.internal.play_billing.AbstractC3727s;
import com.google.android.gms.internal.play_billing.B0;
import com.google.android.gms.internal.play_billing.C3638a;
import com.google.android.gms.internal.play_billing.C3657d3;
import com.google.android.gms.internal.play_billing.C3667f3;
import com.google.android.gms.internal.play_billing.C3687j3;
import com.google.android.gms.internal.play_billing.C3702m3;
import com.google.android.gms.internal.play_billing.G0;
import com.google.android.gms.internal.play_billing.H2;
import com.google.android.gms.internal.play_billing.H3;
import com.google.android.gms.internal.play_billing.InterfaceC3663f;
import com.google.android.gms.internal.play_billing.J2;
import com.google.android.gms.internal.play_billing.J3;
import com.google.android.gms.internal.play_billing.L2;
import com.google.android.gms.internal.play_billing.O2;
import com.google.android.gms.internal.play_billing.O3;
import com.google.android.gms.internal.play_billing.P2;
import com.google.android.gms.internal.play_billing.Q3;
import com.google.android.gms.internal.play_billing.R0;
import com.google.android.gms.internal.play_billing.R2;
import com.google.android.gms.internal.play_billing.S0;
import com.google.android.gms.internal.play_billing.T2;
import com.google.android.gms.internal.play_billing.T3;
import com.google.android.gms.internal.play_billing.V;
import com.google.android.gms.internal.play_billing.Y2;
import com.revenuecat.purchases.api.BuildConfig;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.google.history.BillingConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C3157b extends AbstractC3156a {

    /* JADX INFO: renamed from: A */
    private boolean f35365A;

    /* JADX INFO: renamed from: B */
    private boolean f35366B;

    /* JADX INFO: renamed from: C */
    private boolean f35367C;

    /* JADX INFO: renamed from: D */
    private C3162g f35368D;

    /* JADX INFO: renamed from: E */
    private boolean f35369E;

    /* JADX INFO: renamed from: F */
    private boolean f35370F;

    /* JADX INFO: renamed from: G */
    private volatile InterfaceC1964d f35371G;

    /* JADX INFO: renamed from: H */
    private ExecutorService f35372H;

    /* JADX INFO: renamed from: I */
    private final Long f35373I;

    /* JADX INFO: renamed from: J */
    private com.google.android.gms.internal.play_billing.F f35374J;

    /* JADX INFO: renamed from: a */
    private final Object f35375a;

    /* JADX INFO: renamed from: b */
    private volatile int f35376b;

    /* JADX INFO: renamed from: c */
    private final String f35377c;

    /* JADX INFO: renamed from: d */
    private final String f35378d;

    /* JADX INFO: renamed from: e */
    private final Handler f35379e;

    /* JADX INFO: renamed from: f */
    private volatile e0 f35380f;

    /* JADX INFO: renamed from: g */
    private Context f35381g;

    /* JADX INFO: renamed from: h */
    private V f35382h;

    /* JADX INFO: renamed from: i */
    private volatile InterfaceC3663f f35383i;

    /* JADX INFO: renamed from: j */
    private volatile E f35384j;

    /* JADX INFO: renamed from: k */
    private boolean f35385k;

    /* JADX INFO: renamed from: l */
    private boolean f35386l;

    /* JADX INFO: renamed from: m */
    private int f35387m;

    /* JADX INFO: renamed from: n */
    private boolean f35388n;

    /* JADX INFO: renamed from: o */
    private boolean f35389o;

    /* JADX INFO: renamed from: p */
    private boolean f35390p;

    /* JADX INFO: renamed from: q */
    private boolean f35391q;

    /* JADX INFO: renamed from: r */
    private boolean f35392r;

    /* JADX INFO: renamed from: s */
    private boolean f35393s;

    /* JADX INFO: renamed from: t */
    private boolean f35394t;

    /* JADX INFO: renamed from: u */
    private boolean f35395u;

    /* JADX INFO: renamed from: v */
    private boolean f35396v;

    /* JADX INFO: renamed from: w */
    private boolean f35397w;

    /* JADX INFO: renamed from: x */
    private boolean f35398x;

    /* JADX INFO: renamed from: y */
    private boolean f35399y;

    /* JADX INFO: renamed from: z */
    private boolean f35400z;

    C3157b(String str, Context context, V v10, ExecutorService executorService, AbstractC3156a.C0594a c0594a) {
        this.f35375a = new Object();
        this.f35376b = 0;
        this.f35379e = new Handler(Looper.getMainLooper());
        this.f35387m = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f35373I = lValueOf;
        this.f35374J = AbstractC3727s.a();
        this.f35377c = BuildConfig.BILLING_CLIENT_VERSION;
        String strO0 = o0();
        this.f35378d = strO0;
        this.f35381g = context.getApplicationContext();
        C3657d3 c3657d3M = C3667f3.M();
        c3657d3M.x(BuildConfig.BILLING_CLIENT_VERSION);
        if (strO0 != null) {
            c3657d3M.y(strO0);
        }
        c3657d3M.u(this.f35381g.getPackageName());
        c3657d3M.r(lValueOf.longValue());
        c3657d3M.v(c0594a.f35363f);
        c3657d3M.n(Build.VERSION.SDK_INT);
        c3657d3M.t(772604006L);
        try {
            c3657d3M.p(this.f35381g.getPackageManager().getPackageInfo(this.f35381g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Error getting app version code.", th2);
        }
        this.f35382h = new X(this.f35381g, (C3667f3) c3657d3M.i());
        this.f35381g.getPackageName();
        this.f35369E = c0594a.f35363f;
    }

    /* JADX WARN: Finally extract failed */
    private final void B(C1966f c1966f, InterfaceC1967g interfaceC1967g) throws Throwable {
        InterfaceC3663f interfaceC3663f;
        int iR;
        String strI;
        String strA = c1966f.a();
        try {
            com.google.android.gms.internal.play_billing.V.l("BillingClient", "Consuming purchase with token: " + strA);
            synchronized (this.f35375a) {
                try {
                    try {
                        interfaceC3663f = this.f35383i;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (DeadObjectException e10) {
                    e = e10;
                    D(interfaceC1967g, strA, W.f35337j, R2.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e11) {
                    e = e11;
                    D(interfaceC1967g, strA, W.f35335h, R2.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (interfaceC3663f == null) {
                try {
                    D(interfaceC1967g, strA, W.f35337j, R2.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e12) {
                    e = e12;
                    D(interfaceC1967g, strA, W.f35337j, R2.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e13) {
                    e = e13;
                    D(interfaceC1967g, strA, W.f35335h, R2.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.f35390p) {
                String packageName = this.f35381g.getPackageName();
                boolean z10 = this.f35390p;
                String str = this.f35377c;
                String str2 = this.f35378d;
                long jLongValue = this.f35373I.longValue();
                Bundle bundle = new Bundle();
                if (z10) {
                    com.google.android.gms.internal.play_billing.V.c(bundle, str, str2, jLongValue);
                }
                Bundle bundleQ1 = interfaceC3663f.Q1(9, packageName, strA, bundle);
                iR = bundleQ1.getInt(BillingConstants.RESPONSE_CODE);
                strI = com.google.android.gms.internal.play_billing.V.i(bundleQ1, "BillingClient");
            } else {
                iR = interfaceC3663f.R(3, this.f35381g.getPackageName(), strA);
                strI = "";
            }
            C3160e c3160eA = W.a(iR, strI);
            if (iR == 0) {
                com.google.android.gms.internal.play_billing.V.l("BillingClient", "Successfully consumed purchase.");
                interfaceC1967g.a(c3160eA, strA);
                return;
            }
            D(interfaceC1967g, strA, c3160eA, R2.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + iR, null);
        } catch (DeadObjectException e14) {
            e = e14;
        } catch (Exception e15) {
            e = e15;
        }
    }

    private final void C(InterfaceC1962b interfaceC1962b, C3160e c3160e, R2 r22, Exception exc) {
        com.google.android.gms.internal.play_billing.V.n("BillingClient", "Error in acknowledge purchase!", exc);
        v0(r22, 3, c3160e, U.a(exc));
        interfaceC1962b.a(c3160e);
    }

    private final void D(InterfaceC1967g interfaceC1967g, String str, C3160e c3160e, R2 r22, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.V.n("BillingClient", str2, exc);
        v0(r22, 4, c3160e, U.a(exc));
        interfaceC1967g.a(c3160e, str);
    }

    private final void E(InterfaceC1965e interfaceC1965e, C3160e c3160e, R2 r22, Exception exc) {
        com.google.android.gms.internal.play_billing.V.n("BillingClient", "getBillingConfig got an exception.", exc);
        v0(r22, 13, c3160e, U.a(exc));
        interfaceC1965e.a(c3160e, null);
    }

    private final void F(int i10, R2 r22, Exception exc) {
        J2 j22;
        com.google.android.gms.internal.play_billing.V.n("BillingClient", "showInAppMessages error.", exc);
        V v10 = this.f35382h;
        String strA = U.a(exc);
        try {
            P2 p2H = T2.H();
            p2H.s(i10);
            if (r22 != null) {
                p2H.r(r22);
            }
            if (strA != null) {
                p2H.n(strA);
            }
            H2 h2K = J2.K();
            h2K.p(p2H);
            h2K.t(30);
            j22 = (J2) h2K.i();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to create logging payload", th2);
            j22 = null;
        }
        v10.b(j22);
    }

    public final void G(J2 j22) {
        try {
            this.f35382h.k(j22, this.f35387m);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
    }

    private final void H(J2 j22, long j10, boolean z10) {
        try {
            this.f35382h.a(j22, this.f35387m, j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void I(O2 o22) {
        try {
            this.f35382h.f(o22, this.f35387m);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
    }

    static /* bridge */ /* synthetic */ C3160e I0(Exception exc) {
        return exc instanceof DeadObjectException ? W.f35337j : W.f35335h;
    }

    public final void J(R2 r22, C3160e c3160e, int i10) {
        try {
            int i11 = U.f35320a;
            H2 h22 = (H2) U.b(r22, 6, c3160e, null, Y2.BROADCAST_ACTION_UNSPECIFIED).p();
            H3 h3G = J3.G();
            h3G.n(i10 > 0);
            h3G.p(i10);
            h22.s(h3G);
            G((J2) h22.i());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
    }

    public final void K(int i10) {
        synchronized (this.f35375a) {
            try {
                if (this.f35376b == 3) {
                    return;
                }
                com.google.android.gms.internal.play_billing.V.l("BillingClient", "Setting clientState from " + R(this.f35376b) + " to " + R(i10));
                this.f35376b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final synchronized void L() {
        ExecutorService executorService = this.f35372H;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f35372H = null;
        }
    }

    private final void M(InterfaceC1964d interfaceC1964d, int i10) {
        R2 r22;
        C3160e c3160eH0;
        C3160e c3160e;
        synchronized (this.f35375a) {
            try {
                if (Q()) {
                    c3160eH0 = h0(i10);
                } else {
                    if (this.f35376b == 1) {
                        com.google.android.gms.internal.play_billing.V.m("BillingClient", "Client is already in the process of connecting to billing service.");
                        R2 r23 = R2.BILLING_CLIENT_CONNECTING;
                        c3160e = W.f35331d;
                        J(r23, c3160e, i10);
                    } else if (this.f35376b == 3) {
                        com.google.android.gms.internal.play_billing.V.m("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        R2 r24 = R2.BILLING_CLIENT_CLOSED;
                        c3160e = W.f35337j;
                        J(r24, c3160e, i10);
                    } else {
                        K(1);
                        if (i10 == 0) {
                            this.f35371G = interfaceC1964d;
                            i10 = 0;
                        }
                        N();
                        com.google.android.gms.internal.play_billing.V.l("BillingClient", "Starting in-app billing setup.");
                        this.f35384j = new E(this, interfaceC1964d, i10, null);
                        this.f35384j.c();
                        Intent intent = new Intent(BillingConstants.BILLING_SERVICE_ACTION);
                        intent.setPackage(BillingConstants.VENDING_PACKAGE);
                        List<ResolveInfo> listQueryIntentServices = this.f35381g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            r22 = R2.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, BillingConstants.VENDING_PACKAGE) || str2 == null) {
                                    r22 = R2.INVALID_PHONESKY_PACKAGE;
                                    com.google.android.gms.internal.play_billing.V.m("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f35377c);
                                    synchronized (this.f35375a) {
                                        try {
                                            if (this.f35376b == 2) {
                                                c3160eH0 = h0(i10);
                                            } else if (this.f35376b != 1) {
                                                com.google.android.gms.internal.play_billing.V.m("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                R2 r25 = R2.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                c3160e = W.f35337j;
                                                J(r25, c3160e, i10);
                                            } else {
                                                E e10 = this.f35384j;
                                                if ((i10 <= 0 || Build.VERSION.SDK_INT < 29) ? this.f35381g.bindService(intent2, e10, 1) : this.f35381g.bindService(intent2, 1, n(), e10)) {
                                                    com.google.android.gms.internal.play_billing.V.l("BillingClient", "Service was bonded successfully.");
                                                    c3160eH0 = null;
                                                } else {
                                                    r22 = R2.BILLING_SERVICE_BLOCKED;
                                                    com.google.android.gms.internal.play_billing.V.m("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                r22 = R2.INVALID_PHONESKY_PACKAGE;
                                com.google.android.gms.internal.play_billing.V.m("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        K(0);
                        com.google.android.gms.internal.play_billing.V.l("BillingClient", "Billing service unavailable on device.");
                        C3160e c3160e2 = W.f35329b;
                        J(r22, c3160e2, i10);
                        c3160eH0 = c3160e2;
                    }
                    c3160eH0 = c3160e;
                }
            } finally {
            }
        }
        if (c3160eH0 != null) {
            interfaceC1964d.onBillingSetupFinished(c3160eH0);
        }
    }

    public final void N() {
        synchronized (this.f35375a) {
            if (this.f35384j != null) {
                try {
                    this.f35381g.unbindService(this.f35384j);
                } catch (Throwable th2) {
                    try {
                        com.google.android.gms.internal.play_billing.V.n("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f35383i = null;
                        this.f35384j = null;
                    } finally {
                        this.f35383i = null;
                        this.f35384j = null;
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object N0(C3157b c3157b, int i10, O3 o32) {
        c3157b.M(new B(c3157b, o32), i10);
        return "reconnectIfNeeded";
    }

    private final boolean O(long j10) {
        try {
            C3160e c3160e = (C3160e) j0(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS);
            if (c3160e.c() == 0) {
                com.google.android.gms.internal.play_billing.V.l("BillingClient", "Reconnection succeeded with result: " + c3160e.c());
            } else {
                com.google.android.gms.internal.play_billing.V.m("BillingClient", "Reconnection failed with result: " + c3160e.c());
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Error during reconnection attempt: ", e10);
        }
        return Q();
    }

    public static /* synthetic */ Object O0(C3157b c3157b, InterfaceC1967g interfaceC1967g, C1966f c1966f) throws Throwable {
        if (c3157b.P(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS)) {
            c3157b.B(c1966f, interfaceC1967g);
            return null;
        }
        R2 r22 = R2.SERVICE_CONNECTION_NOT_READY;
        C3160e c3160e = W.f35337j;
        c3157b.t0(r22, 4, c3160e);
        interfaceC1967g.a(c3160e, c1966f.a());
        return null;
    }

    public final boolean P(long j10) {
        long jMax;
        com.google.android.gms.internal.play_billing.C cB = com.google.android.gms.internal.play_billing.C.b(this.f35374J);
        long jA = 30000;
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                jMax = Math.max(0L, jA);
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.V.n("BillingClient", "Error during reconnection attempt: ", e10);
            }
            if (jMax <= 0) {
                com.google.android.gms.internal.play_billing.V.m("BillingClient", "No time remaining for reconnection attempt.");
                return Q();
            }
            C3160e c3160e = (C3160e) j0(i10).get(jMax, TimeUnit.MILLISECONDS);
            if (c3160e.c() == 0) {
                com.google.android.gms.internal.play_billing.V.l("BillingClient", "Reconnection succeeded with result: " + c3160e.c());
                return Q();
            }
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Reconnection failed with result: " + c3160e.c());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jA = HTTPTimeoutManager.DEFAULT_TIMEOUT_MS - cB.a(timeUnit);
            long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
            if (jA < jPow) {
                com.google.android.gms.internal.play_billing.V.m("BillingClient", "Reconnection failed due to timeout limit reached.");
                return Q();
            }
            if (i10 < 3 && jPow > 0) {
                try {
                    Thread.sleep(jPow);
                    jA = HTTPTimeoutManager.DEFAULT_TIMEOUT_MS - cB.a(timeUnit);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "Error sleeping during reconnection attempt: ", e11);
                }
            }
        }
        com.google.android.gms.internal.play_billing.V.m("BillingClient", "Max retries reached.");
        return Q();
    }

    public static /* synthetic */ Object P0(C3157b c3157b, InterfaceC1971k interfaceC1971k, C3164i c3164i) {
        if (!c3157b.P(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS)) {
            R2 r22 = R2.SERVICE_CONNECTION_NOT_READY;
            C3160e c3160e = W.f35337j;
            c3157b.t0(r22, 7, c3160e);
            interfaceC1971k.a(c3160e, new C3165j(com.google.android.gms.internal.play_billing.N.t(), com.google.android.gms.internal.play_billing.N.t()));
            return null;
        }
        if (c3157b.f35395u) {
            H hD0 = c3157b.D0(c3164i);
            interfaceC1971k.a(W.a(hD0.a(), hD0.b()), new C3165j(hD0.c(), hD0.d()));
            return null;
        }
        com.google.android.gms.internal.play_billing.V.m("BillingClient", "Querying product details is not supported.");
        R2 r23 = R2.PRODUCT_DETAILS_NOT_SUPPORTED;
        C3160e c3160e2 = W.f35345r;
        c3157b.t0(r23, 7, c3160e2);
        interfaceC1971k.a(c3160e2, new C3165j(com.google.android.gms.internal.play_billing.N.t(), com.google.android.gms.internal.play_billing.N.t()));
        return null;
    }

    private final boolean Q() {
        boolean z10;
        synchronized (this.f35375a) {
            try {
                z10 = false;
                if (this.f35376b == 2 && this.f35383i != null && this.f35384j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public static /* synthetic */ Object Q0(C3157b c3157b, InterfaceC1962b interfaceC1962b, C1961a c1961a) {
        c3157b.k0(interfaceC1962b, c1961a);
        return null;
    }

    private static final String R(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    public static /* synthetic */ Object R0(C3157b c3157b, Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        c3157b.m0(bundle, activity, resultReceiver);
        return null;
    }

    public static /* synthetic */ Object S0(C3157b c3157b, InterfaceC1965e interfaceC1965e) {
        c3157b.l0(interfaceC1965e);
        return null;
    }

    static /* bridge */ /* synthetic */ void U(C3157b c3157b, int i10) {
        c3157b.f35387m = i10;
        c3157b.f35367C = i10 >= 26;
        c3157b.f35366B = i10 >= 24;
        c3157b.f35365A = i10 >= 23;
        c3157b.f35400z = i10 >= 22;
        c3157b.f35399y = i10 >= 21;
        c3157b.f35398x = i10 >= 20;
        c3157b.f35397w = i10 >= 19;
        c3157b.f35396v = i10 >= 18;
        c3157b.f35395u = i10 >= 17;
        c3157b.f35394t = i10 >= 16;
        c3157b.f35393s = i10 >= 15;
        c3157b.f35392r = i10 >= 14;
        c3157b.f35391q = i10 >= 12;
        c3157b.f35390p = i10 >= 9;
        c3157b.f35389o = i10 >= 8;
        c3157b.f35388n = i10 >= 6;
    }

    static /* bridge */ /* synthetic */ void W(C3157b c3157b, int i10) {
        if (i10 != 0) {
            c3157b.K(0);
            return;
        }
        synchronized (c3157b.f35375a) {
            try {
                if (c3157b.f35376b == 3) {
                    return;
                }
                c3157b.K(2);
                e0 e0Var = c3157b.f35380f != null ? c3157b.f35380f : null;
                if (e0Var != null) {
                    e0Var.g(c3157b.f35399y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean a0(C3157b c3157b) {
        boolean z10;
        synchronized (c3157b.f35375a) {
            z10 = true;
            if (c3157b.f35376b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public final /* synthetic */ Bundle d0(int i10, String str, String str2, C3159d c3159d, Bundle bundle) {
        InterfaceC3663f interfaceC3663f;
        try {
            synchronized (this.f35375a) {
                interfaceC3663f = this.f35383i;
            }
            return interfaceC3663f == null ? com.google.android.gms.internal.play_billing.V.d(W.f35337j, R2.SERVICE_RESET_TO_NULL) : interfaceC3663f.R0(i10, this.f35381g.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e10) {
            return com.google.android.gms.internal.play_billing.V.e(W.f35337j, R2.LAUNCH_BILLING_FLOW_EXCEPTION, U.a(e10));
        } catch (Exception e11) {
            return com.google.android.gms.internal.play_billing.V.e(W.f35335h, R2.LAUNCH_BILLING_FLOW_EXCEPTION, U.a(e11));
        }
    }

    public final /* synthetic */ Bundle e0(String str, String str2) {
        InterfaceC3663f interfaceC3663f;
        try {
            synchronized (this.f35375a) {
                interfaceC3663f = this.f35383i;
            }
            return interfaceC3663f == null ? com.google.android.gms.internal.play_billing.V.d(W.f35337j, R2.SERVICE_RESET_TO_NULL) : interfaceC3663f.p2(3, this.f35381g.getPackageName(), str, str2, null);
        } catch (DeadObjectException e10) {
            return com.google.android.gms.internal.play_billing.V.e(W.f35337j, R2.LAUNCH_BILLING_FLOW_EXCEPTION, U.a(e10));
        } catch (Exception e11) {
            return com.google.android.gms.internal.play_billing.V.e(W.f35335h, R2.LAUNCH_BILLING_FLOW_EXCEPTION, U.a(e11));
        }
    }

    public final Handler f0() {
        return Looper.myLooper() == null ? this.f35379e : new Handler(Looper.myLooper());
    }

    private final H g0(C3160e c3160e, R2 r22, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.V.n("BillingClient", str, exc);
        v0(r22, 7, c3160e, U.a(exc));
        return new H(c3160e.c(), c3160e.a(), new ArrayList(), new ArrayList());
    }

    private final C3160e h0(int i10) {
        com.google.android.gms.internal.play_billing.V.l("BillingClient", "Service connection is valid. No need to re-initialize.");
        L2 l2I = O2.I();
        l2I.s(6);
        H3 h3G = J3.G();
        h3G.r(true);
        h3G.n(i10 > 0);
        h3G.p(i10);
        l2I.r(h3G);
        I((O2) l2I.i());
        return W.f35336i;
    }

    public final C3160e i0() {
        int[] iArr = {0, 3};
        synchronized (this.f35375a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f35376b == iArr[i10]) {
                    return W.f35337j;
                }
            }
            return W.f35335h;
        }
    }

    private final G0 j0(final int i10) {
        if (this.f35369E && !Q()) {
            return T3.a(new Q3() { // from class: com.android.billingclient.api.f0
                @Override // com.google.android.gms.internal.play_billing.Q3
                public final Object a(O3 o32) {
                    return C3157b.N0(this.f35445a, i10, o32);
                }
            });
        }
        com.google.android.gms.internal.play_billing.V.l("BillingClient", "Already connected or not opted into auto reconnection.");
        return B0.a(W.f35336i);
    }

    private final /* synthetic */ Object k0(InterfaceC1962b interfaceC1962b, C1961a c1961a) {
        InterfaceC3663f interfaceC3663f;
        try {
            if (!P(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS)) {
                R2 r22 = R2.SERVICE_CONNECTION_NOT_READY;
                C3160e c3160e = W.f35337j;
                t0(r22, 3, c3160e);
                interfaceC1962b.a(c3160e);
            } else if (TextUtils.isEmpty(c1961a.a())) {
                com.google.android.gms.internal.play_billing.V.m("BillingClient", "Please provide a valid purchase token.");
                R2 r23 = R2.EMPTY_PURCHASE_TOKEN;
                C3160e c3160e2 = W.f35334g;
                t0(r23, 3, c3160e2);
                interfaceC1962b.a(c3160e2);
            } else if (this.f35390p) {
                synchronized (this.f35375a) {
                    interfaceC3663f = this.f35383i;
                }
                if (interfaceC3663f != null) {
                    String packageName = this.f35381g.getPackageName();
                    String strA = c1961a.a();
                    String str = this.f35377c;
                    String str2 = this.f35378d;
                    long jLongValue = this.f35373I.longValue();
                    int i10 = com.google.android.gms.internal.play_billing.V.f40412a;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.V.c(bundle, str, str2, jLongValue);
                    Bundle bundleA3 = interfaceC3663f.A3(9, packageName, strA, bundle);
                    interfaceC1962b.a(W.a(com.google.android.gms.internal.play_billing.V.b(bundleA3, "BillingClient"), com.google.android.gms.internal.play_billing.V.i(bundleA3, "BillingClient")));
                    return null;
                }
                C(interfaceC1962b, W.f35337j, R2.SERVICE_RESET_TO_NULL, null);
            } else {
                R2 r24 = R2.API_VERSION_NOT_V9;
                C3160e c3160e3 = W.f35328a;
                t0(r24, 3, c3160e3);
                interfaceC1962b.a(c3160e3);
            }
            return null;
        } catch (DeadObjectException e10) {
            C(interfaceC1962b, W.f35337j, R2.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e10);
            return null;
        } catch (Exception e11) {
            C(interfaceC1962b, W.f35335h, R2.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
            return null;
        }
    }

    private final /* synthetic */ Object l0(InterfaceC1965e interfaceC1965e) {
        InterfaceC3663f interfaceC3663f;
        try {
            if (!P(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS)) {
                com.google.android.gms.internal.play_billing.V.m("BillingClient", "Service disconnected.");
                R2 r22 = R2.SERVICE_CONNECTION_NOT_READY;
                C3160e c3160e = W.f35337j;
                t0(r22, 13, c3160e);
                interfaceC1965e.a(c3160e, null);
            } else if (this.f35396v) {
                synchronized (this.f35375a) {
                    interfaceC3663f = this.f35383i;
                }
                if (interfaceC3663f == null) {
                    E(interfaceC1965e, W.f35337j, R2.SERVICE_RESET_TO_NULL, null);
                } else {
                    String packageName = this.f35381g.getPackageName();
                    String str = this.f35377c;
                    String str2 = this.f35378d;
                    long jLongValue = this.f35373I.longValue();
                    int i10 = com.google.android.gms.internal.play_billing.V.f40412a;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.V.c(bundle, str, str2, jLongValue);
                    interfaceC3663f.V0(18, packageName, bundle, new F(interfaceC1965e, this.f35382h, this.f35387m, null));
                }
            } else {
                com.google.android.gms.internal.play_billing.V.m("BillingClient", "Current client doesn't support get billing config.");
                R2 r23 = R2.GET_BILLING_CONFIG_NOT_SUPPORTED;
                C3160e c3160e2 = W.f35352y;
                t0(r23, 13, c3160e2);
                interfaceC1965e.a(c3160e2, null);
            }
        } catch (DeadObjectException e10) {
            E(interfaceC1965e, W.f35337j, R2.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            E(interfaceC1965e, W.f35335h, R2.GET_BILLING_CONFIG_SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private void m(Context context, N4.m mVar, C3162g c3162g, N4.s sVar, String str, V v10, AbstractC3156a.C0594a c0594a) {
        this.f35381g = context.getApplicationContext();
        C3657d3 c3657d3M = C3667f3.M();
        c3657d3M.x(str);
        String str2 = this.f35378d;
        if (str2 != null) {
            c3657d3M.y(str2);
        }
        c3657d3M.u(this.f35381g.getPackageName());
        c3657d3M.r(this.f35373I.longValue());
        c3657d3M.v(c0594a.f35363f);
        c3657d3M.n(Build.VERSION.SDK_INT);
        c3657d3M.t(772604006L);
        try {
            c3657d3M.p(this.f35381g.getPackageManager().getPackageInfo(this.f35381g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Error getting app version code.", th2);
        }
        if (v10 != null) {
            this.f35382h = v10;
        } else {
            this.f35382h = new X(this.f35381g, (C3667f3) c3657d3M.i());
        }
        if (mVar == null) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f35380f = new e0(this.f35381g, mVar, null, sVar, null, this.f35382h);
        this.f35368D = c3162g;
        this.f35370F = sVar != null;
        this.f35381g.getPackageName();
        this.f35369E = c0594a.f35363f;
    }

    private final /* synthetic */ Object m0(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        InterfaceC3663f interfaceC3663f;
        try {
            synchronized (this.f35375a) {
                interfaceC3663f = this.f35383i;
            }
            if (interfaceC3663f == null) {
                F(-1, R2.SERVICE_RESET_TO_NULL, null);
            } else {
                interfaceC3663f.q2(12, this.f35381g.getPackageName(), bundle, new G(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            F(-1, R2.SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            F(6, R2.SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final String n0(C3164i c3164i) {
        if (TextUtils.isEmpty(null)) {
            return this.f35381g.getPackageName();
        }
        return null;
    }

    static Future o(Callable callable, long j10, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: N4.r
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    V.m("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    private static String o0() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ void p(C3157b c3157b, InterfaceC1967g interfaceC1967g, C1966f c1966f) {
        R2 r22 = R2.EXECUTE_ASYNC_TIMEOUT;
        C3160e c3160e = W.f35338k;
        c3157b.t0(r22, 4, c3160e);
        interfaceC1967g.a(c3160e, c1966f.a());
    }

    public static /* synthetic */ void q(C3157b c3157b, N4.l lVar) {
        R2 r22 = R2.EXECUTE_ASYNC_TIMEOUT;
        C3160e c3160e = W.f35338k;
        c3157b.t0(r22, 9, c3160e);
        lVar.a(c3160e, com.google.android.gms.internal.play_billing.N.t());
    }

    private final N4.F q0(int i10, C3160e c3160e, R2 r22, String str, Exception exc) {
        v0(r22, 9, c3160e, U.a(exc));
        com.google.android.gms.internal.play_billing.V.n("BillingClient", str, exc);
        return new N4.F(c3160e, null);
    }

    public static /* synthetic */ void r(C3157b c3157b, InterfaceC1965e interfaceC1965e) {
        R2 r22 = R2.EXECUTE_ASYNC_TIMEOUT;
        C3160e c3160e = W.f35338k;
        c3157b.t0(r22, 13, c3160e);
        interfaceC1965e.a(c3160e, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0165 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final N4.F r0(java.lang.String r17, boolean r18, int r19) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C3157b.r0(java.lang.String, boolean, int):N4.F");
    }

    public static /* synthetic */ void s(C3157b c3157b, InterfaceC1962b interfaceC1962b) {
        R2 r22 = R2.EXECUTE_ASYNC_TIMEOUT;
        C3160e c3160e = W.f35338k;
        c3157b.t0(r22, 3, c3160e);
        interfaceC1962b.a(c3160e);
    }

    private final void s0(C3160e c3160e, R2 r22, int i10) {
        O2 o22 = null;
        J2 j22 = null;
        if (c3160e.c() == 0) {
            int i11 = U.f35320a;
            try {
                L2 l2I = O2.I();
                l2I.s(5);
                C3687j3 c3687j3D = C3702m3.D();
                c3687j3D.n(i10);
                l2I.p((C3702m3) c3687j3D.i());
                o22 = (O2) l2I.i();
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to create logging payload", e10);
            }
            I(o22);
            return;
        }
        int i12 = U.f35320a;
        try {
            H2 h2K = J2.K();
            P2 p2H = T2.H();
            p2H.s(c3160e.c());
            p2H.p(c3160e.a());
            p2H.r(r22);
            h2K.p(p2H);
            h2K.t(5);
            C3687j3 c3687j3D2 = C3702m3.D();
            c3687j3D2.n(i10);
            h2K.q((C3702m3) c3687j3D2.i());
            j22 = (J2) h2K.i();
        } catch (Exception e11) {
            com.google.android.gms.internal.play_billing.V.n("BillingLogger", "Unable to create logging payload", e11);
        }
        G(j22);
    }

    public static /* synthetic */ void t(C3157b c3157b, InterfaceC1971k interfaceC1971k) {
        R2 r22 = R2.EXECUTE_ASYNC_TIMEOUT;
        C3160e c3160e = W.f35338k;
        c3157b.t0(r22, 7, c3160e);
        interfaceC1971k.a(c3160e, new C3165j(com.google.android.gms.internal.play_billing.N.t(), com.google.android.gms.internal.play_billing.N.t()));
    }

    public void t0(R2 r22, int i10, C3160e c3160e) {
        try {
            int i11 = U.f35320a;
            G(U.b(r22, i10, c3160e, null, Y2.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
    }

    public static /* synthetic */ void u(C3157b c3157b, C3160e c3160e) {
        if (c3157b.f35380f.d() != null) {
            c3157b.f35380f.d().onPurchasesUpdated(c3160e, null);
        } else {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    private final void u0(R2 r22, int i10, C3160e c3160e, long j10) {
        try {
            int i11 = U.f35320a;
            try {
                this.f35382h.d(U.b(r22, 2, c3160e, null, Y2.BROADCAST_ACTION_UNSPECIFIED), this.f35387m, j10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th3);
        }
    }

    private final void v0(R2 r22, int i10, C3160e c3160e, String str) {
        try {
            int i11 = U.f35320a;
            G(U.b(r22, i10, c3160e, str, Y2.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
    }

    private final void w0(R2 r22, int i10, C3160e c3160e, long j10, boolean z10) {
        try {
            int i11 = U.f35320a;
            H(U.b(r22, 2, c3160e, null, Y2.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
    }

    private final void x0(R2 r22, int i10, C3160e c3160e, String str, long j10, boolean z10) {
        try {
            int i11 = U.f35320a;
            H(U.b(r22, 2, c3160e, str, Y2.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
    }

    private void y0(int i10) {
        try {
            int i11 = U.f35320a;
            I(U.c(i10, Y2.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Unable to log.", th2);
        }
    }

    final H D0(C3164i c3164i) {
        InterfaceC3663f interfaceC3663f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strC = c3164i.c();
        com.google.android.gms.internal.play_billing.N nB = c3164i.b();
        int size = nB.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 20;
            ArrayList<C3164i.b> arrayList3 = new ArrayList(nB.subList(i10, i11 > size ? size : i11));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList4.add(((C3164i.b) arrayList3.get(i12)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.f35377c;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.f35375a) {
                    interfaceC3663f = this.f35383i;
                }
                if (interfaceC3663f == null) {
                    return g0(W.f35337j, R2.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z10 = this.f35397w && this.f35368D.b();
                n0(c3164i);
                n0(c3164i);
                n0(c3164i);
                n0(c3164i);
                Bundle bundleL3 = interfaceC3663f.l3(true != this.f35398x ? 17 : 20, this.f35381g.getPackageName(), strC, bundle, com.google.android.gms.internal.play_billing.V.f(str, this.f35378d, arrayList3, null, null, C3638a.a(z10, true, false, true, false, true), this.f35373I.longValue()));
                if (bundleL3 == null) {
                    return g0(W.f35323B, R2.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleL3.containsKey("DETAILS_LIST")) {
                    int iB = com.google.android.gms.internal.play_billing.V.b(bundleL3, "BillingClient");
                    String strI = com.google.android.gms.internal.play_billing.V.i(bundleL3, "BillingClient");
                    if (iB == 0) {
                        return g0(W.a(6, strI), R2.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return g0(W.a(iB, strI), R2.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iB, null);
                }
                ArrayList<String> stringArrayList = bundleL3.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return g0(W.f35323B, R2.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    try {
                        C3163h c3163h = new C3163h(stringArrayList.get(i13));
                        com.google.android.gms.internal.play_billing.V.l("BillingClient", "Got product details: ".concat(c3163h.toString()));
                        arrayList5.add(c3163h);
                    } catch (JSONException e10) {
                        return g0(W.a(6, "Error trying to decode SkuDetails."), R2.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                ArrayList<String> stringArrayList2 = bundleL3.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 == null) {
                        for (C3164i.b bVar : arrayList3) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    arrayList6.add(new C3166k(new JSONObject().put("productId", bVar.b()).put("type", bVar.c()).put("statusCode", 0).toString()));
                                    break;
                                }
                                C3163h c3163h2 = (C3163h) it.next();
                                if (!bVar.b().equals(c3163h2.e()) || !bVar.c().equals(c3163h2.f())) {
                                }
                            }
                        }
                    } else {
                        Iterator<String> it2 = stringArrayList2.iterator();
                        while (it2.hasNext()) {
                            C3166k c3166k = new C3166k(it2.next());
                            com.google.android.gms.internal.play_billing.V.l("BillingClient", "Got unfetchedProduct: ".concat(c3166k.toString()));
                            arrayList6.add(c3166k);
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i10 = i11;
                } catch (JSONException e11) {
                    return g0(W.a(6, "Error trying to decode SkuDetails."), R2.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                }
            } catch (DeadObjectException e12) {
                return g0(W.f35337j, R2.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            } catch (Exception e13) {
                return g0(W.f35335h, R2.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e13);
            }
        }
        return new H(0, "", arrayList, arrayList2);
    }

    final V G0() {
        return this.f35382h;
    }

    public final C3160e J0(final C3160e c3160e) {
        if (Thread.interrupted()) {
            return c3160e;
        }
        this.f35379e.post(new Runnable() { // from class: com.android.billingclient.api.n
            @Override // java.lang.Runnable
            public final void run() {
                C3157b.u(this.f35529a, c3160e);
            }
        });
        return c3160e;
    }

    public final void Y(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f35379e.post(runnable);
        }
    }

    @Override // com.android.billingclient.api.AbstractC3156a
    public void a(final C1961a c1961a, final InterfaceC1962b interfaceC1962b) {
        if (o(new Callable() { // from class: com.android.billingclient.api.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3157b.Q0(this.f35524a, interfaceC1962b, c1961a);
                return null;
            }
        }, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.m
            @Override // java.lang.Runnable
            public final void run() {
                C3157b.s(this.f35527a, interfaceC1962b);
            }
        }, f0(), n()) == null) {
            C3160e c3160eI0 = i0();
            t0(R2.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, c3160eI0);
            interfaceC1962b.a(c3160eI0);
        }
    }

    @Override // com.android.billingclient.api.AbstractC3156a
    public void b(final C1966f c1966f, final InterfaceC1967g interfaceC1967g) {
        if (o(new Callable() { // from class: com.android.billingclient.api.q
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                C3157b.O0(this.f35535a, interfaceC1967g, c1966f);
                return null;
            }
        }, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.s
            @Override // java.lang.Runnable
            public final void run() {
                C3157b.p(this.f35541a, interfaceC1967g, c1966f);
            }
        }, f0(), n()) == null) {
            C3160e c3160eI0 = i0();
            t0(R2.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, c3160eI0);
            interfaceC1967g.a(c3160eI0, c1966f.a());
        }
    }

    @Override // com.android.billingclient.api.AbstractC3156a
    public void c() {
        y0(12);
        synchronized (this.f35375a) {
            try {
            } finally {
            }
            if (this.f35380f != null) {
                this.f35380f.f();
                try {
                    com.google.android.gms.internal.play_billing.V.l("BillingClient", "Unbinding from service.");
                    N();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                }
                try {
                    L();
                } finally {
                    try {
                    } finally {
                    }
                }
            } else {
                com.google.android.gms.internal.play_billing.V.l("BillingClient", "Unbinding from service.");
                N();
                L();
            }
        }
    }

    @Override // com.android.billingclient.api.AbstractC3156a
    public void d(C1968h c1968h, final InterfaceC1965e interfaceC1965e) {
        if (o(new Callable() { // from class: com.android.billingclient.api.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3157b.S0(this.f35531a, interfaceC1965e);
                return null;
            }
        }, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.p
            @Override // java.lang.Runnable
            public final void run() {
                C3157b.r(this.f35533a, interfaceC1965e);
            }
        }, f0(), n()) == null) {
            C3160e c3160eI0 = i0();
            t0(R2.MISSING_RESULT_FROM_EXECUTE_ASYNC, 13, c3160eI0);
            interfaceC1965e.a(c3160eI0, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.android.billingclient.api.AbstractC3156a
    public final C3160e e(String str) {
        if (!O(3000L)) {
            C3160e c3160e = W.f35337j;
            R2 r22 = R2.SERVICE_CONNECTION_NOT_READY;
            if (c3160e.c() != 0) {
                t0(r22, 5, c3160e);
                return c3160e;
            }
            y0(5);
            return c3160e;
        }
        C3160e c3160e2 = W.f35328a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    C3160e c3160e3 = this.f35386l ? W.f35336i : W.f35340m;
                    s0(c3160e3, R2.SUBSCRIPTIONS_UPDATE_NOT_SUPPORTED, 3);
                    return c3160e3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    C3160e c3160e4 = this.f35393s ? W.f35336i : W.f35342o;
                    s0(c3160e4, R2.CROSS_APP_NOT_SUPPORTED, 6);
                    return c3160e4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    C3160e c3160e5 = this.f35391q ? W.f35336i : W.f35346s;
                    s0(c3160e5, R2.IN_APP_MESSAGE_NOT_SUPPORTED, 5);
                    return c3160e5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    C3160e c3160e6 = this.f35394t ? W.f35336i : W.f35343p;
                    s0(c3160e6, R2.MULTI_ITEM_NOT_SUPPORTED, 8);
                    return c3160e6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    C3160e c3160e7 = this.f35392r ? W.f35336i : W.f35344q;
                    s0(c3160e7, R2.OFFER_ID_TOKEN_NOT_SUPPORTED, 7);
                    return c3160e7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    C3160e c3160e8 = this.f35394t ? W.f35336i : W.f35343p;
                    s0(c3160e8, R2.PBL_FOR_PAYMENTS_GATEWAY_BUYFLOW_NOT_SUPPORTED, 9);
                    return c3160e8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    C3160e c3160e9 = this.f35395u ? W.f35336i : W.f35345r;
                    s0(c3160e9, R2.PRODUCT_DETAILS_NOT_SUPPORTED, 10);
                    return c3160e9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    C3160e c3160e10 = this.f35396v ? W.f35336i : W.f35352y;
                    s0(c3160e10, R2.GET_BILLING_CONFIG_NOT_SUPPORTED, 11);
                    return c3160e10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    C3160e c3160e11 = this.f35396v ? W.f35336i : W.f35353z;
                    s0(c3160e11, R2.QUERY_PRODUCT_DETAILS_WITH_SERIALIZED_DOCID_NOT_SUPPORTED, 12);
                    return c3160e11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    C3160e c3160e12 = this.f35398x ? W.f35336i : W.f35324C;
                    s0(c3160e12, R2.QUERY_PRODUCT_DETAILS_WITH_DEVELOPER_SPECIFIED_ACCOUNT_NOT_SUPPORTED, 13);
                    return c3160e12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    C3160e c3160e13 = this.f35399y ? W.f35336i : W.f35325D;
                    s0(c3160e13, R2.ALTERNATIVE_BILLING_ONLY_NOT_SUPPORTED, 14);
                    return c3160e13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    C3160e c3160e14 = this.f35366B ? W.f35336i : W.f35322A;
                    s0(c3160e14, R2.LAUNCH_EXTERNAL_OFFER_FLOW_NOT_SUPPORTED, 18);
                    return c3160e14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    C3160e c3160e15 = this.f35365A ? W.f35336i : W.f35348u;
                    s0(c3160e15, R2.MULTI_ITEM_WITH_SEASON_PASS_NOT_SUPPORTED, 19);
                    return c3160e15;
                }
                break;
            case 108237:
                if (str.equals("mmm")) {
                    C3160e c3160e16 = this.f35366B ? W.f35336i : W.f35349v;
                    s0(c3160e16, R2.AUTO_PAY_NOT_SUPPORTED, 20);
                    return c3160e16;
                }
                break;
            case 109230:
                if (str.equals("nnn")) {
                    C3160e c3160e17 = this.f35367C ? W.f35336i : W.f35350w;
                    s0(c3160e17, R2.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, 21);
                    return c3160e17;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    C3160e c3160e18 = this.f35389o ? W.f35336i : W.f35341n;
                    s0(c3160e18, R2.PRICE_CHANGE_CONFIRMATION_NOT_SUPPORTED, 4);
                    return c3160e18;
                }
                break;
            case 1987365622:
                if (str.equals(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS)) {
                    C3160e c3160e19 = this.f35385k ? W.f35336i : W.f35339l;
                    s0(c3160e19, R2.SUBSCRIPTIONS_NOT_SUPPORTED, 2);
                    return c3160e19;
                }
                break;
        }
        com.google.android.gms.internal.play_billing.V.m("BillingClient", "Unsupported feature: ".concat(str));
        C3160e c3160e20 = W.f35351x;
        s0(c3160e20, R2.UNKNOWN_FEATURE, 1);
        return c3160e20;
    }

    @Override // com.android.billingclient.api.AbstractC3156a
    public final boolean f() {
        if (this.f35369E) {
            return true;
        }
        return Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.android.billingclient.api.b] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [long] */
    @Override // com.android.billingclient.api.AbstractC3156a
    public C3160e g(Activity activity, C3159d c3159d) {
        boolean zD;
        long j10;
        Future futureO;
        ?? r52;
        ?? r53;
        ?? r54;
        R2 r22;
        C3160e c3160e;
        boolean z10;
        long j11;
        R2 r2A;
        Object obj;
        String str;
        boolean z11;
        C3159d.b bVar;
        long j12;
        boolean z12;
        long jNextLong = new Random().nextLong();
        if (this.f35380f == null || this.f35380f.d() == null) {
            R2 r23 = R2.MISSING_LISTENER;
            C3160e c3160e2 = W.f35326E;
            u0(r23, 2, c3160e2, jNextLong);
            return c3160e2;
        }
        if (!O(3000L)) {
            R2 r24 = R2.SERVICE_CONNECTION_NOT_READY;
            C3160e c3160e3 = W.f35337j;
            u0(r24, 2, c3160e3, jNextLong);
            J0(c3160e3);
            return c3160e3;
        }
        synchronized (this.f35375a) {
            try {
                zD = this.f35384j != null ? this.f35384j.d() : false;
            } finally {
            }
        }
        ArrayList arrayListK = c3159d.k();
        List listL = c3159d.l();
        String string = null;
        android.support.v4.media.session.b.a(com.google.android.gms.internal.play_billing.T.a(arrayListK, null));
        C3159d.b bVar2 = (C3159d.b) com.google.android.gms.internal.play_billing.T.a(listL, null);
        final String strE = bVar2.b().e();
        final String strF = bVar2.b().f();
        if (strF.equals("subs") && !this.f35385k) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Current client doesn't support subscriptions.");
            R2 r25 = R2.SUBSCRIPTIONS_NOT_SUPPORTED;
            C3160e c3160e4 = W.f35339l;
            w0(r25, 2, c3160e4, jNextLong, zD);
            J0(c3160e4);
            return c3160e4;
        }
        if (c3159d.u() && !this.f35388n) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Current client doesn't support extra params for buy intent.");
            R2 r26 = R2.EXTRA_PARAMS_NOT_SUPPORTED;
            C3160e c3160e5 = W.f35333f;
            w0(r26, 2, c3160e5, jNextLong, zD);
            J0(c3160e5);
            return c3160e5;
        }
        if (arrayListK.size() > 1 && !this.f35394t) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Current client doesn't support multi-item purchases.");
            R2 r27 = R2.MULTI_ITEM_NOT_SUPPORTED;
            C3160e c3160e6 = W.f35343p;
            w0(r27, 2, c3160e6, jNextLong, zD);
            J0(c3160e6);
            return c3160e6;
        }
        if (!listL.isEmpty() && !this.f35395u) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            R2 r28 = R2.PRODUCT_DETAILS_NOT_SUPPORTED;
            C3160e c3160e7 = W.f35345r;
            w0(r28, 2, c3160e7, jNextLong, zD);
            J0(c3160e7);
            return c3160e7;
        }
        C3160e c3160eE = c3159d.e();
        if (c3160eE != W.f35336i) {
            w0(R2.INVALID_BILLING_FLOW_PARAMS, 2, c3160eE, jNextLong, zD);
            J0(c3160eE);
            return c3160eE;
        }
        if (this.f35388n) {
            boolean z13 = this.f35390p;
            boolean z14 = this.f35397w;
            boolean zA = this.f35368D.a();
            boolean zB = this.f35368D.b();
            boolean z15 = this.f35370F;
            String str2 = this.f35377c;
            String str3 = this.f35378d;
            boolean z16 = zD;
            long jLongValue = this.f35373I.longValue();
            this.f35381g.getPackageName();
            int i10 = com.google.android.gms.internal.play_billing.V.f40412a;
            final Bundle bundle = new Bundle();
            com.google.android.gms.internal.play_billing.V.c(bundle, str2, str3, jLongValue);
            bundle.putLong("billingClientTransactionId", jNextLong);
            if (c3159d.c() != 0) {
                bundle.putInt(com.amazon.a.a.o.b.f34654l, c3159d.c());
            }
            if (!TextUtils.isEmpty(c3159d.f())) {
                bundle.putString("accountId", c3159d.f());
            }
            if (!TextUtils.isEmpty(c3159d.g())) {
                bundle.putString("obfuscatedProfileId", c3159d.g());
            }
            if (c3159d.t()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(c3159d.i())) {
                bundle.putString("oldSkuPurchaseToken", c3159d.i());
            }
            c3159d.h();
            if (TextUtils.isEmpty(null)) {
                str = null;
            } else {
                c3159d.h();
                str = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(c3159d.j())) {
                bundle.putString("originalExternalTransactionId", c3159d.j());
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("paymentsPurchaseParams", str);
            }
            if (z13 && zA) {
                z11 = true;
                bundle.putBoolean(com.amazon.a.a.o.b.f34637ac, true);
            } else {
                z11 = true;
            }
            if (z14 && zB) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z11);
            }
            if (z15) {
                bundle.putBoolean("enableAlternativeBilling", z11);
            }
            c3159d.d();
            c3159d.b();
            ArrayList arrayList = new ArrayList();
            for (C3159d.b bVar3 : c3159d.l()) {
            }
            if (!arrayList.isEmpty()) {
                R0 r0C = S0.C();
                r0C.n(arrayList);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((S0) r0C.i()).b());
            }
            if (arrayListK.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(listL.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(listL.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                long j13 = jNextLong;
                for (int i11 = 0; i11 < listL.size(); i11++) {
                    C3159d.b bVar4 = (C3159d.b) listL.get(i11);
                    C3163h c3163hB = bVar4.b();
                    if (c3163hB.j().isEmpty()) {
                        bVar = bVar4;
                    } else {
                        bVar = bVar4;
                        arrayList4.add(c3163hB.j());
                    }
                    arrayList5.add(bVar.c());
                    String strK = c3163hB.k();
                    if (c3163hB.l() != null && !c3163hB.l().isEmpty()) {
                        Iterator it = c3163hB.l().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C3163h.b bVar5 = (C3163h.b) it.next();
                            if (!TextUtils.isEmpty(bVar5.f())) {
                                strK = bVar5.f();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strK)) {
                        arrayList6.add(strK);
                    }
                    if (i11 > 0) {
                        arrayList2.add(((C3159d.b) listL.get(i11)).b().e());
                        arrayList3.add(((C3159d.b) listL.get(i11)).b().f());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList7.isEmpty()) {
                    bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                }
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                j12 = j13;
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                    j12 = j13;
                }
            } else {
                ArrayList<String> arrayList8 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = arrayListK.iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    throw null;
                }
                if (!arrayList8.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList8);
                }
                if (arrayListK.size() > 1) {
                    ArrayList<String> arrayList9 = new ArrayList<>(arrayListK.size() - 1);
                    ArrayList<String> arrayList10 = new ArrayList<>(arrayListK.size() - 1);
                    if (1 < arrayListK.size()) {
                        android.support.v4.media.session.b.a(arrayListK.get(1));
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList9);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList10);
                }
                j12 = jNextLong;
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f35392r) {
                R2 r29 = R2.OFFER_ID_TOKEN_NOT_SUPPORTED;
                C3160e c3160e8 = W.f35344q;
                w0(r29, 2, c3160e8, j12, z16);
                J0(c3160e8);
                return c3160e8;
            }
            zD = z16;
            if (bVar2 == null || TextUtils.isEmpty(bVar2.b().i())) {
                string = null;
                z12 = false;
            } else {
                bundle.putString("skuPackageName", bVar2.b().i());
                string = null;
                z12 = true;
            }
            if (!TextUtils.isEmpty(string)) {
                bundle.putString("accountName", string);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                com.google.android.gms.internal.play_billing.V.m("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    bundle.putString("proxyPackageVersion", this.f35381g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle.putString("proxyPackageVersion", "package not found");
                }
            }
            final int i12 = (!this.f35395u || listL.isEmpty()) ? (this.f35393s && z12) ? 15 : this.f35390p ? 9 : 6 : 17;
            final C3159d c3159d2 = c3159d;
            futureO = o(new Callable() { // from class: com.android.billingclient.api.g0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f35451a.d0(i12, strE, strF, c3159d2, bundle);
                }
            }, HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, null, this.f35379e, n());
            r52 = c3159d2;
            j10 = j12;
        } else {
            j10 = jNextLong;
            futureO = o(new Callable() { // from class: com.android.billingclient.api.h0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f35508a.e0(strE, strF);
                }
            }, HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, null, this.f35379e, n());
            r52 = jNextLong;
        }
        try {
            if (futureO == null) {
                try {
                    r22 = R2.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    c3160e = W.f35330c;
                    z10 = zD;
                    j11 = j10;
                } catch (CancellationException e10) {
                    e = e10;
                    r54 = j10;
                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    R2 r210 = R2.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C3160e c3160e9 = W.f35338k;
                    x0(r210, 2, c3160e9, U.a(e), r54, zD);
                    J0(c3160e9);
                    return c3160e9;
                } catch (TimeoutException e11) {
                    e = e11;
                    r54 = j10;
                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    R2 r2102 = R2.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C3160e c3160e92 = W.f35338k;
                    x0(r2102, 2, c3160e92, U.a(e), r54, zD);
                    J0(c3160e92);
                    return c3160e92;
                } catch (Exception e12) {
                    e = e12;
                    r53 = j10;
                }
                try {
                    w0(r22, 2, c3160e, j11, z10);
                    J0(c3160e);
                    return c3160e;
                } catch (CancellationException e13) {
                    e = e13;
                    zD = z10;
                    r54 = j11;
                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    R2 r21022 = R2.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C3160e c3160e922 = W.f35338k;
                    x0(r21022, 2, c3160e922, U.a(e), r54, zD);
                    J0(c3160e922);
                    return c3160e922;
                } catch (TimeoutException e14) {
                    e = e14;
                    zD = z10;
                    r54 = j11;
                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    R2 r210222 = R2.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C3160e c3160e9222 = W.f35338k;
                    x0(r210222, 2, c3160e9222, U.a(e), r54, zD);
                    J0(c3160e9222);
                    return c3160e9222;
                } catch (Exception e15) {
                    e = e15;
                    zD = z10;
                    r53 = j11;
                    com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    R2 r211 = R2.LAUNCH_BILLING_FLOW_EXCEPTION;
                    C3160e c3160e10 = W.f35337j;
                    x0(r211, 2, c3160e10, U.a(e), r53, zD);
                    J0(c3160e10);
                    return c3160e10;
                }
            }
            long j14 = j10;
            Bundle bundle2 = (Bundle) futureO.get(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, TimeUnit.MILLISECONDS);
            int iB = com.google.android.gms.internal.play_billing.V.b(bundle2, "BillingClient");
            String strI = com.google.android.gms.internal.play_billing.V.i(bundle2, "BillingClient");
            if (iB == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j14);
                intent2.putExtra("wasServiceAutoReconnected", zD);
                activity.startActivity(intent2);
                return W.f35336i;
            }
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Unable to buy item, Error response code: " + iB);
            C3160e c3160eA = W.a(iB, strI);
            try {
                if (bundle2 == null || (obj = bundle2.get("LOG_REASON")) == null) {
                    r2A = R2.REASON_UNSPECIFIED;
                } else if (obj instanceof Integer) {
                    r2A = R2.a(((Integer) obj).intValue());
                } else {
                    com.google.android.gms.internal.play_billing.V.m("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                    r2A = R2.REASON_UNSPECIFIED;
                }
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.V.m("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                r2A = R2.REASON_UNSPECIFIED;
            }
            if (r2A == R2.REASON_UNSPECIFIED) {
                r2A = R2.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            R2 r212 = r2A;
            if (bundle2 != null) {
                try {
                    string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.V.m("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                }
            }
            try {
                x0(r212, 2, c3160eA, string, j14, zD);
                J0(c3160eA);
                return c3160eA;
            } catch (CancellationException e16) {
                e = e16;
                r54 = j14;
                com.google.android.gms.internal.play_billing.V.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                R2 r2102222 = R2.LAUNCH_BILLING_FLOW_TIMEOUT;
                C3160e c3160e92222 = W.f35338k;
                x0(r2102222, 2, c3160e92222, U.a(e), r54, zD);
                J0(c3160e92222);
                return c3160e92222;
            } catch (TimeoutException e17) {
                e = e17;
                r54 = j14;
                com.google.android.gms.internal.play_billing.V.n("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                R2 r21022222 = R2.LAUNCH_BILLING_FLOW_TIMEOUT;
                C3160e c3160e922222 = W.f35338k;
                x0(r21022222, 2, c3160e922222, U.a(e), r54, zD);
                J0(c3160e922222);
                return c3160e922222;
            } catch (Exception e18) {
                e = e18;
                r53 = j14;
                com.google.android.gms.internal.play_billing.V.n("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                R2 r2112 = R2.LAUNCH_BILLING_FLOW_EXCEPTION;
                C3160e c3160e102 = W.f35337j;
                x0(r2112, 2, c3160e102, U.a(e), r53, zD);
                J0(c3160e102);
                return c3160e102;
            }
        } catch (CancellationException e19) {
            e = e19;
        } catch (TimeoutException e20) {
            e = e20;
            r54 = r52;
        } catch (Exception e21) {
            e = e21;
        }
    }

    @Override // com.android.billingclient.api.AbstractC3156a
    public void i(final C3164i c3164i, final InterfaceC1971k interfaceC1971k) {
        if (o(new Callable() { // from class: com.android.billingclient.api.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3157b.P0(this.f35538a, interfaceC1971k, c3164i);
                return null;
            }
        }, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.t
            @Override // java.lang.Runnable
            public final void run() {
                C3157b.t(this.f35544a, interfaceC1971k);
            }
        }, f0(), n()) == null) {
            C3160e c3160eI0 = i0();
            t0(R2.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, c3160eI0);
            interfaceC1971k.a(c3160eI0, new C3165j(com.google.android.gms.internal.play_billing.N.t(), com.google.android.gms.internal.play_billing.N.t()));
        }
    }

    @Override // com.android.billingclient.api.AbstractC3156a
    public final void j(N4.o oVar, final N4.l lVar) {
        if (o(new CallableC3178x(this, lVar, oVar.b(), false), HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, new Runnable() { // from class: com.android.billingclient.api.v
            @Override // java.lang.Runnable
            public final void run() {
                C3157b.q(this.f35550a, lVar);
            }
        }, f0(), n()) == null) {
            C3160e c3160eI0 = i0();
            t0(R2.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, c3160eI0);
            lVar.a(c3160eI0, com.google.android.gms.internal.play_billing.N.t());
        }
    }

    @Override // com.android.billingclient.api.AbstractC3156a
    public final C3160e k(final Activity activity, C3161f c3161f, InterfaceC1969i interfaceC1969i) {
        if (!O(3000L)) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Service disconnected.");
            return W.f35337j;
        }
        if (!this.f35391q) {
            com.google.android.gms.internal.play_billing.V.m("BillingClient", "Current client doesn't support showing in-app messages.");
            return W.f35346s;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        androidx.core.app.h.b(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f35377c);
        String str = this.f35378d;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", c3161f.b());
        Handler handler = this.f35379e;
        final ResultReceiverC3179y resultReceiverC3179y = new ResultReceiverC3179y(this, handler, interfaceC1969i);
        o(new Callable() { // from class: com.android.billingclient.api.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3157b.R0(this.f35546a, bundle, activity, resultReceiverC3179y);
                return null;
            }
        }, HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, null, handler, n());
        return W.f35336i;
    }

    @Override // com.android.billingclient.api.AbstractC3156a
    public void l(InterfaceC1964d interfaceC1964d) {
        M(interfaceC1964d, 0);
    }

    final synchronized ExecutorService n() {
        try {
            if (this.f35372H == null) {
                this.f35372H = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.V.f40412a, new ThreadFactoryC3177w(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f35372H;
    }

    C3157b(String str, C3162g c3162g, Context context, N4.B b10, V v10, ExecutorService executorService, AbstractC3156a.C0594a c0594a) {
        this.f35375a = new Object();
        this.f35376b = 0;
        this.f35379e = new Handler(Looper.getMainLooper());
        this.f35387m = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f35373I = lValueOf;
        this.f35374J = AbstractC3727s.a();
        this.f35377c = BuildConfig.BILLING_CLIENT_VERSION;
        String strO0 = o0();
        this.f35378d = strO0;
        this.f35381g = context.getApplicationContext();
        C3657d3 c3657d3M = C3667f3.M();
        c3657d3M.x(BuildConfig.BILLING_CLIENT_VERSION);
        if (strO0 != null) {
            c3657d3M.y(strO0);
        }
        c3657d3M.u(this.f35381g.getPackageName());
        c3657d3M.r(lValueOf.longValue());
        c3657d3M.v(c0594a.f35363f);
        c3657d3M.n(Build.VERSION.SDK_INT);
        c3657d3M.t(772604006L);
        try {
            c3657d3M.p(this.f35381g.getPackageManager().getPackageInfo(this.f35381g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.V.n("BillingClient", "Error getting app version code.", th2);
        }
        this.f35382h = new X(this.f35381g, (C3667f3) c3657d3M.i());
        com.google.android.gms.internal.play_billing.V.m("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f35380f = new e0(this.f35381g, null, null, null, null, this.f35382h);
        this.f35368D = c3162g;
        this.f35381g.getPackageName();
        this.f35369E = c0594a.f35363f;
    }

    C3157b(String str, C3162g c3162g, Context context, N4.m mVar, N4.s sVar, V v10, ExecutorService executorService, AbstractC3156a.C0594a c0594a) {
        this.f35375a = new Object();
        this.f35376b = 0;
        this.f35379e = new Handler(Looper.getMainLooper());
        this.f35387m = 0;
        this.f35373I = Long.valueOf(new Random().nextLong());
        this.f35374J = AbstractC3727s.a();
        this.f35377c = BuildConfig.BILLING_CLIENT_VERSION;
        this.f35378d = o0();
        m(context, mVar, c3162g, null, BuildConfig.BILLING_CLIENT_VERSION, null, c0594a);
    }
}
