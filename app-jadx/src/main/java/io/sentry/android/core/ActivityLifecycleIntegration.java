package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.sentry.AbstractC5244o2;
import io.sentry.C5198f1;
import io.sentry.C5270r3;
import io.sentry.C5322z3;
import io.sentry.E1;
import io.sentry.EnumC5215i3;
import io.sentry.EnumC5242o0;
import io.sentry.F0;
import io.sentry.G;
import io.sentry.G1;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5207h0;
import io.sentry.InterfaceC5217j0;
import io.sentry.InterfaceC5247p0;
import io.sentry.Z3;
import io.sentry.a4;
import io.sentry.android.core.performance.h;
import io.sentry.h4;
import io.sentry.i4;
import io.sentry.j4;
import io.sentry.k4;
import io.sentry.util.C5288a;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityLifecycleIntegration implements InterfaceC5247p0, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f49424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5131g0 f49425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5114a0 f49426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SentryAndroidOptions f49427d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49430g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC5207h0 f49433j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C5134i f49440q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f49428e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f49429f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49431h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private io.sentry.G f49432i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakHashMap f49434k = new WeakHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final WeakHashMap f49435l = new WeakHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final WeakHashMap f49436m = new WeakHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AbstractC5244o2 f49437n = new C5270r3(new Date(0), 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Future f49438o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final WeakHashMap f49439p = new WeakHashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C5288a f49441r = new C5288a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f49442s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C5288a f49443t = new C5288a();

    public ActivityLifecycleIntegration(Application application, C5131g0 c5131g0, C5134i c5134i) {
        this.f49424a = (Application) io.sentry.util.w.c(application, "Application is required");
        this.f49425b = (C5131g0) io.sentry.util.w.c(c5131g0, "BuildInfoProvider is required");
        this.f49440q = (C5134i) io.sentry.util.w.c(c5134i, "ActivityFramesTracker is required");
        if (c5131g0.d() >= 29) {
            this.f49430g = true;
        }
    }

    private void A1() {
        for (Map.Entry entry : this.f49439p.entrySet()) {
            h0((InterfaceC5217j0) entry.getValue(), (InterfaceC5207h0) this.f49434k.get(entry.getKey()), (InterfaceC5207h0) this.f49435l.get(entry.getKey()));
        }
    }

    private String B0(boolean z10) {
        return z10 ? "app.start.cold" : "app.start.warm";
    }

    private void C() {
        this.f49431h = false;
        this.f49437n = new C5270r3(new Date(0L), 0L);
        this.f49436m.clear();
    }

    private void D1(Activity activity, boolean z10) {
        if (this.f49428e && z10) {
            h0((InterfaceC5217j0) this.f49439p.get(activity), null, null);
        }
    }

    private void E() {
        AbstractC5244o2 abstractC5244o2H = io.sentry.android.core.performance.h.q().m(this.f49427d).h();
        if (!this.f49428e || abstractC5244o2H == null) {
            return;
        }
        O(this.f49433j, abstractC5244o2H);
    }

    private String F0(InterfaceC5207h0 interfaceC5207h0) {
        String description = interfaceC5207h0.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return interfaceC5207h0.getDescription() + " - Deadline Exceeded";
    }

    private String G0(String str) {
        return str + " full display";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(InterfaceC5207h0 interfaceC5207h0, InterfaceC5207h0 interfaceC5207h02) {
        if (interfaceC5207h0 == null || interfaceC5207h0.isFinished()) {
            return;
        }
        interfaceC5207h0.e(F0(interfaceC5207h0));
        AbstractC5244o2 abstractC5244o2R = interfaceC5207h02 != null ? interfaceC5207h02.r() : null;
        if (abstractC5244o2R == null) {
            abstractC5244o2R = interfaceC5207h0.t();
        }
        S(interfaceC5207h0, abstractC5244o2R, a4.DEADLINE_EXCEEDED);
    }

    private void J(InterfaceC5207h0 interfaceC5207h0) {
        if (interfaceC5207h0 == null || interfaceC5207h0.isFinished()) {
            return;
        }
        interfaceC5207h0.d();
    }

    private String M0(String str) {
        return str + " initial display";
    }

    private void O(InterfaceC5207h0 interfaceC5207h0, AbstractC5244o2 abstractC5244o2) {
        S(interfaceC5207h0, abstractC5244o2, null);
    }

    private void S(InterfaceC5207h0 interfaceC5207h0, AbstractC5244o2 abstractC5244o2, a4 a4Var) {
        if (interfaceC5207h0 == null || interfaceC5207h0.isFinished()) {
            return;
        }
        if (a4Var == null) {
            a4Var = interfaceC5207h0.b() != null ? interfaceC5207h0.b() : a4.OK;
        }
        interfaceC5207h0.s(a4Var, abstractC5244o2);
    }

    private void Y(InterfaceC5207h0 interfaceC5207h0, a4 a4Var) {
        if (interfaceC5207h0 == null || interfaceC5207h0.isFinished()) {
            return;
        }
        interfaceC5207h0.j(a4Var);
    }

    private boolean a1(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    private void h0(final InterfaceC5217j0 interfaceC5217j0, InterfaceC5207h0 interfaceC5207h0, InterfaceC5207h0 interfaceC5207h02) {
        if (interfaceC5217j0 == null || interfaceC5217j0.isFinished()) {
            return;
        }
        Y(interfaceC5207h0, a4.DEADLINE_EXCEEDED);
        H(interfaceC5207h02, interfaceC5207h0);
        z();
        a4 a4VarB = interfaceC5217j0.b();
        if (a4VarB == null) {
            a4VarB = a4.OK;
        }
        interfaceC5217j0.j(a4VarB);
        InterfaceC5114a0 interfaceC5114a0 = this.f49426c;
        if (interfaceC5114a0 != null) {
            interfaceC5114a0.r(new G1() { // from class: io.sentry.android.core.n
                @Override // io.sentry.G1
                public final void a(io.sentry.Y y10) {
                    this.f49949a.D(y10, interfaceC5217j0);
                }
            });
        }
    }

    public static /* synthetic */ void j(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.Y y10, InterfaceC5217j0 interfaceC5217j0, InterfaceC5217j0 interfaceC5217j02) {
        if (interfaceC5217j02 == null) {
            activityLifecycleIntegration.getClass();
            y10.x(interfaceC5217j0);
        } else {
            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f49427d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC5217j0.getName());
            }
        }
    }

    private String k0(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    public static /* synthetic */ void m(ActivityLifecycleIntegration activityLifecycleIntegration, WeakReference weakReference, String str, InterfaceC5217j0 interfaceC5217j0) {
        activityLifecycleIntegration.getClass();
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            activityLifecycleIntegration.f49440q.k(activity, interfaceC5217j0.f());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f49427d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC5215i3.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    public static /* synthetic */ void o(InterfaceC5217j0 interfaceC5217j0, io.sentry.Y y10, InterfaceC5217j0 interfaceC5217j02) {
        if (interfaceC5217j02 == interfaceC5217j0) {
            y10.B();
        }
    }

    private String p0(boolean z10) {
        return z10 ? "Cold Start" : "Warm Start";
    }

    private boolean q1(Activity activity) {
        return this.f49439p.containsKey(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1(InterfaceC5207h0 interfaceC5207h0, InterfaceC5207h0 interfaceC5207h02) {
        io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
        io.sentry.android.core.performance.i iVarL = hVarQ.l();
        io.sentry.android.core.performance.i iVarR = hVarQ.r();
        if (iVarL.u() && iVarL.t()) {
            iVarL.A();
        }
        if (iVarR.u() && iVarR.t()) {
            iVarR.A();
        }
        E();
        InterfaceC5192e0 interfaceC5192e0A = this.f49443t.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f49427d;
            if (sentryAndroidOptions == null || interfaceC5207h02 == null) {
                J(interfaceC5207h02);
                if (this.f49442s) {
                    J(interfaceC5207h0);
                }
            } else {
                AbstractC5244o2 abstractC5244o2Now = sentryAndroidOptions.getDateProvider().now();
                long millis = TimeUnit.NANOSECONDS.toMillis(abstractC5244o2Now.b(interfaceC5207h02.t()));
                Long lValueOf = Long.valueOf(millis);
                F0.a aVar = F0.a.MILLISECOND;
                interfaceC5207h02.l("time_to_initial_display", lValueOf, aVar);
                if (interfaceC5207h0 != null && this.f49442s) {
                    this.f49442s = false;
                    interfaceC5207h02.l("time_to_full_display", Long.valueOf(millis), aVar);
                    interfaceC5207h0.l("time_to_full_display", Long.valueOf(millis), aVar);
                    O(interfaceC5207h0, abstractC5244o2Now);
                }
                O(interfaceC5207h02, abstractC5244o2Now);
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void u1(Z3 z32) {
        z32.g("auto.ui.activity");
    }

    private void y1(Activity activity) {
        Boolean boolValueOf;
        AbstractC5244o2 abstractC5244o2;
        AbstractC5244o2 abstractC5244o22;
        final InterfaceC5217j0 interfaceC5217j0;
        Z3 z32;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f49426c == null || q1(activity)) {
            return;
        }
        if (!this.f49428e) {
            this.f49439p.put(activity, C5198f1.u());
            if (this.f49427d.isEnableAutoTraceIdGeneration()) {
                io.sentry.util.H.h(this.f49426c);
                return;
            }
            return;
        }
        A1();
        final String strK0 = k0(activity);
        io.sentry.android.core.performance.i iVarM = io.sentry.android.core.performance.h.q().m(this.f49427d);
        h4 h4Var = null;
        if (AbstractC5156p0.s() && iVarM.u()) {
            AbstractC5244o2 abstractC5244o2N = iVarM.n();
            boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.h.q().n() == h.a.COLD);
            abstractC5244o2 = abstractC5244o2N;
        } else {
            boolValueOf = null;
            abstractC5244o2 = null;
        }
        k4 k4Var = new k4();
        long deadlineTimeout = this.f49427d.getDeadlineTimeout();
        k4Var.s(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        if (this.f49427d.isEnableActivityLifecycleTracingAutoFinish()) {
            k4Var.t(this.f49427d.getIdleTimeout());
            k4Var.i(true);
        }
        k4Var.v(true);
        k4Var.u(new j4() { // from class: io.sentry.android.core.p
            @Override // io.sentry.j4
            public final void a(InterfaceC5217j0 interfaceC5217j02) {
                ActivityLifecycleIntegration.m(this.f49953a, weakReference, strK0, interfaceC5217j02);
            }
        });
        if (this.f49431h || abstractC5244o2 == null || boolValueOf == null) {
            abstractC5244o22 = this.f49437n;
        } else {
            h4 h4VarK = io.sentry.android.core.performance.h.q().k();
            io.sentry.android.core.performance.h.q().y(null);
            h4Var = h4VarK;
            abstractC5244o22 = abstractC5244o2;
        }
        k4Var.h(abstractC5244o22);
        k4Var.r(h4Var != null);
        u1(k4Var);
        InterfaceC5217j0 interfaceC5217j0Z = this.f49426c.z(new i4(strK0, io.sentry.protocol.H.COMPONENT, "ui.load", h4Var), k4Var);
        Z3 z33 = new Z3();
        u1(z33);
        if (this.f49431h || abstractC5244o2 == null || boolValueOf == null) {
            interfaceC5217j0 = interfaceC5217j0Z;
            z32 = z33;
        } else {
            interfaceC5217j0 = interfaceC5217j0Z;
            z32 = z33;
            this.f49433j = interfaceC5217j0.o(B0(boolValueOf.booleanValue()), p0(boolValueOf.booleanValue()), abstractC5244o2, EnumC5242o0.SENTRY, z33);
            E();
        }
        String strM0 = M0(strK0);
        EnumC5242o0 enumC5242o0 = EnumC5242o0.SENTRY;
        AbstractC5244o2 abstractC5244o23 = abstractC5244o22;
        final InterfaceC5207h0 interfaceC5207h0O = interfaceC5217j0.o("ui.load.initial_display", strM0, abstractC5244o23, enumC5242o0, z32);
        this.f49434k.put(activity, interfaceC5207h0O);
        if (this.f49429f && this.f49432i != null && this.f49427d != null) {
            final InterfaceC5207h0 interfaceC5207h0O2 = interfaceC5217j0.o("ui.load.full_display", G0(strK0), abstractC5244o23, enumC5242o0, z32);
            try {
                this.f49435l.put(activity, interfaceC5207h0O2);
                this.f49438o = this.f49427d.getExecutorService().schedule(new Runnable() { // from class: io.sentry.android.core.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49998a.H(interfaceC5207h0O2, interfaceC5207h0O);
                    }
                }, 25000L);
            } catch (RejectedExecutionException e10) {
                this.f49427d.getLogger().b(EnumC5215i3.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e10);
            }
        }
        this.f49426c.r(new G1() { // from class: io.sentry.android.core.r
            @Override // io.sentry.G1
            public final void a(io.sentry.Y y10) {
                this.f50003a.w(y10, interfaceC5217j0);
            }
        });
        this.f49439p.put(activity, interfaceC5217j0);
    }

    private void z() {
        Future future = this.f49438o;
        if (future != null) {
            future.cancel(false);
            this.f49438o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(final io.sentry.Y y10, final InterfaceC5217j0 interfaceC5217j0) {
        y10.O(new E1.c() { // from class: io.sentry.android.core.o
            @Override // io.sentry.E1.c
            public final void a(InterfaceC5217j0 interfaceC5217j02) {
                ActivityLifecycleIntegration.o(interfaceC5217j0, y10, interfaceC5217j02);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f49424a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f49427d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f49440q.m();
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        this.f49427d = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        this.f49426c = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        this.f49428e = a1(this.f49427d);
        this.f49432i = this.f49427d.getFullyDisplayedReporter();
        this.f49429f = this.f49427d.isEnableTimeToFullDisplayTracing();
        this.f49424a.registerActivityLifecycleCallbacks(this);
        this.f49427d.getLogger().c(EnumC5215i3.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.n.a("ActivityLifecycle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.G g10;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f49430g) {
            onActivityPreCreated(activity, bundle);
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f49441r.a();
        try {
            if (this.f49426c != null && (sentryAndroidOptions = this.f49427d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                final String strA = io.sentry.android.core.internal.util.m.a(activity);
                this.f49426c.r(new G1() { // from class: io.sentry.android.core.j
                    @Override // io.sentry.G1
                    public final void a(io.sentry.Y y10) {
                        y10.I(strA);
                    }
                });
            }
            y1(activity);
            final InterfaceC5207h0 interfaceC5207h0 = (InterfaceC5207h0) this.f49434k.get(activity);
            final InterfaceC5207h0 interfaceC5207h02 = (InterfaceC5207h0) this.f49435l.get(activity);
            this.f49431h = true;
            if (this.f49428e && interfaceC5207h0 != null && interfaceC5207h02 != null && (g10 = this.f49432i) != null) {
                g10.b(new G.a() { // from class: io.sentry.android.core.k
                });
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49441r.a();
        try {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f49436m.remove(activity);
            if (bVar != null) {
                bVar.a();
            }
            if (this.f49428e) {
                Y(this.f49433j, a4.CANCELLED);
                InterfaceC5207h0 interfaceC5207h0 = (InterfaceC5207h0) this.f49434k.get(activity);
                InterfaceC5207h0 interfaceC5207h02 = (InterfaceC5207h0) this.f49435l.get(activity);
                Y(interfaceC5207h0, a4.DEADLINE_EXCEEDED);
                H(interfaceC5207h02, interfaceC5207h0);
                z();
                D1(activity, true);
                this.f49433j = null;
                this.f49434k.remove(activity);
                this.f49435l.remove(activity);
            }
            this.f49439p.remove(activity);
            if (this.f49439p.isEmpty() && !activity.isChangingConfigurations()) {
                C();
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49441r.a();
        try {
            if (!this.f49430g) {
                onActivityPrePaused(activity);
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f49436m.get(activity);
        if (bVar != null) {
            InterfaceC5207h0 interfaceC5207h0 = this.f49433j;
            if (interfaceC5207h0 == null) {
                interfaceC5207h0 = (InterfaceC5207h0) this.f49439p.get(activity);
            }
            bVar.b(interfaceC5207h0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f49436m.get(activity);
        if (bVar != null) {
            InterfaceC5207h0 interfaceC5207h0 = this.f49433j;
            if (interfaceC5207h0 == null) {
                interfaceC5207h0 = (InterfaceC5207h0) this.f49439p.get(activity);
            }
            bVar.c(interfaceC5207h0);
            bVar.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.f49436m.put(activity, bVar);
        if (this.f49431h) {
            return;
        }
        InterfaceC5114a0 interfaceC5114a0 = this.f49426c;
        AbstractC5244o2 abstractC5244o2Now = interfaceC5114a0 != null ? interfaceC5114a0.h().getDateProvider().now() : AbstractC5170x.a();
        this.f49437n = abstractC5244o2Now;
        bVar.g(abstractC5244o2Now);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        this.f49431h = true;
        InterfaceC5114a0 interfaceC5114a0 = this.f49426c;
        this.f49437n = interfaceC5114a0 != null ? interfaceC5114a0.h().getDateProvider().now() : AbstractC5170x.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.f49436m.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f49427d;
            bVar.h(sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().now() : AbstractC5170x.a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49441r.a();
        try {
            if (!this.f49430g) {
                onActivityPostStarted(activity);
            }
            if (this.f49428e) {
                final InterfaceC5207h0 interfaceC5207h0 = (InterfaceC5207h0) this.f49434k.get(activity);
                final InterfaceC5207h0 interfaceC5207h02 = (InterfaceC5207h0) this.f49435l.get(activity);
                if (activity.getWindow() != null) {
                    io.sentry.android.core.internal.util.t.d(activity, new Runnable() { // from class: io.sentry.android.core.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49943a.t1(interfaceC5207h02, interfaceC5207h0);
                        }
                    }, this.f49425b);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f49946a.t1(interfaceC5207h02, interfaceC5207h0);
                        }
                    });
                }
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49441r.a();
        try {
            if (!this.f49430g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f49428e) {
                this.f49440q.f(activity);
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(final io.sentry.Y y10, final InterfaceC5217j0 interfaceC5217j0) {
        y10.O(new E1.c() { // from class: io.sentry.android.core.s
            @Override // io.sentry.E1.c
            public final void a(InterfaceC5217j0 interfaceC5217j02) {
                ActivityLifecycleIntegration.j(this.f50005a, y10, interfaceC5217j0, interfaceC5217j02);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
