package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5222k0;
import io.sentry.N;
import io.sentry.N0;
import io.sentry.android.core.AbstractC5156p0;
import io.sentry.android.core.C5131g0;
import io.sentry.android.core.C5158q0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.t;
import io.sentry.h4;
import io.sentry.util.C5288a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class h extends io.sentry.android.core.performance.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static volatile h f49977p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static long f49976o = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C5288a f49978q = new C5288a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f49979a = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC5222k0 f49986h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private N f49987i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h4 f49988j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f49989k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f49990l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicInteger f49991m = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f49992n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f49981c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f49982d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f49983e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f49984f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f49985g = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49980b = AbstractC5156p0.s();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        UNKNOWN,
        COLD,
        WARM
    }

    public static /* synthetic */ void a(h hVar) {
        if (hVar.f49991m.get() == 0) {
            hVar.f49980b = false;
            InterfaceC5222k0 interfaceC5222k0 = hVar.f49986h;
            if (interfaceC5222k0 != null && interfaceC5222k0.isRunning()) {
                hVar.f49986h.close();
                hVar.f49986h = null;
            }
            N n10 = hVar.f49987i;
            if (n10 == null || !n10.isRunning()) {
                return;
            }
            hVar.f49987i.c(true);
            hVar.f49987i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.g
            @Override // java.lang.Runnable
            public final void run() {
                h.a(this.f49975a);
            }
        });
    }

    public static h q() {
        if (f49977p == null) {
            InterfaceC5192e0 interfaceC5192e0A = f49978q.a();
            try {
                if (f49977p == null) {
                    f49977p = new h();
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
        return f49977p;
    }

    public void e(c cVar) {
        this.f49985g.add(cVar);
    }

    public i g() {
        i iVar = new i();
        iVar.y("Process Initialization", this.f49981c.p(), this.f49981c.r(), f49976o);
        return iVar;
    }

    public List h() {
        ArrayList arrayList = new ArrayList(this.f49985g);
        Collections.sort(arrayList);
        return arrayList;
    }

    public N i() {
        return this.f49987i;
    }

    public InterfaceC5222k0 j() {
        return this.f49986h;
    }

    public h4 k() {
        return this.f49988j;
    }

    public i l() {
        return this.f49981c;
    }

    public i m(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f49979a != a.UNKNOWN && this.f49980b) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                i iVarL = l();
                if (iVarL.u() && iVarL.c() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return iVarL;
                }
            }
            i iVarR = r();
            if (iVarR.u() && iVarR.c() <= TimeUnit.MINUTES.toMillis(1L)) {
                return iVarR;
            }
        }
        return new i();
    }

    public a n() {
        return this.f49979a;
    }

    public i o() {
        return this.f49983e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C5158q0.c().d(activity);
        if (this.f49991m.incrementAndGet() == 1 && !this.f49992n.get()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jR = jUptimeMillis - this.f49981c.r();
            if (!this.f49980b || jR > TimeUnit.MINUTES.toMillis(1L)) {
                this.f49979a = a.WARM;
                this.f49990l = true;
                this.f49981c.w();
                this.f49981c.z();
                this.f49981c.x(jUptimeMillis);
                f49976o = jUptimeMillis;
                this.f49984f.clear();
                this.f49983e.w();
            } else {
                this.f49979a = bundle == null ? a.COLD : a.WARM;
            }
        }
        this.f49980b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C5158q0.c().a(activity);
        if (this.f49991m.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f49980b = false;
        this.f49990l = true;
        this.f49992n.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C5158q0.c().a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C5158q0.c().d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C5158q0.c().d(activity);
        if (this.f49992n.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            t.d(activity, new Runnable() { // from class: io.sentry.android.core.performance.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49973a.u();
                }
            }, new C5131g0(N0.e()));
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49974a.u();
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C5158q0.c().a(activity);
    }

    public List p() {
        ArrayList arrayList = new ArrayList(this.f49984f.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public i r() {
        return this.f49982d;
    }

    public boolean s() {
        return this.f49980b;
    }

    public void t() {
        this.f49990l = false;
        this.f49984f.clear();
        this.f49985g.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void u() {
        if (!this.f49992n.getAndSet(true)) {
            h hVarQ = q();
            hVarQ.r().A();
            hVarQ.l().A();
        }
    }

    public void v(Application application) {
        if (this.f49989k) {
            return;
        }
        boolean z10 = true;
        this.f49989k = true;
        if (!this.f49980b && !AbstractC5156p0.s()) {
            z10 = false;
        }
        this.f49980b = z10;
        application.registerActivityLifecycleCallbacks(f49977p);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f49972a.f();
            }
        });
    }

    public void w(N n10) {
        this.f49987i = n10;
    }

    public void x(InterfaceC5222k0 interfaceC5222k0) {
        this.f49986h = interfaceC5222k0;
    }

    public void y(h4 h4Var) {
        this.f49988j = h4Var;
    }

    public boolean z() {
        return this.f49990l && this.f49980b;
    }
}
