package io.sentry.android.core;

import io.sentry.F0;
import io.sentry.InterfaceC5192e0;
import io.sentry.T3;
import io.sentry.V2;
import io.sentry.Y3;
import io.sentry.a4;
import io.sentry.android.core.performance.h;
import io.sentry.protocol.C5251a;
import io.sentry.protocol.C5261k;
import io.sentry.util.C5288a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class S0 implements io.sentry.C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5134i f49584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f49585c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f49583a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5288a f49586d = new C5288a();

    S0(SentryAndroidOptions sentryAndroidOptions, C5134i c5134i) {
        this.f49585c = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f49584b = (C5134i) io.sentry.util.w.c(c5134i, "ActivityFramesTracker is required");
    }

    private void c(io.sentry.android.core.performance.h hVar, io.sentry.protocol.E e10) {
        T3 t3J;
        Y3 y3E;
        if (hVar.n() == h.a.COLD && (t3J = e10.C().j()) != null) {
            io.sentry.protocol.x xVarP = t3J.p();
            Iterator it = e10.o0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    y3E = null;
                    break;
                }
                io.sentry.protocol.A a10 = (io.sentry.protocol.A) it.next();
                if (a10.d().contentEquals("app.start.cold")) {
                    y3E = a10.e();
                    break;
                }
            }
            io.sentry.android.core.performance.i iVarG = hVar.g();
            if (iVarG.u() && Math.abs(iVarG.c()) <= 10000) {
                e10.o0().add(h(iVarG, y3E, xVarP, "process.load"));
            }
            List listP = hVar.p();
            if (!listP.isEmpty()) {
                Iterator it2 = listP.iterator();
                while (it2.hasNext()) {
                    e10.o0().add(h((io.sentry.android.core.performance.i) it2.next(), y3E, xVarP, "contentprovider.load"));
                }
            }
            io.sentry.android.core.performance.i iVarO = hVar.o();
            if (iVarO.v()) {
                e10.o0().add(h(iVarO, y3E, xVarP, "application.load"));
            }
        }
    }

    private boolean d(io.sentry.protocol.E e10) {
        for (io.sentry.protocol.A a10 : e10.o0()) {
            if (a10.d().contentEquals("app.start.cold") || a10.d().contentEquals("app.start.warm")) {
                return true;
            }
        }
        T3 t3J = e10.C().j();
        if (t3J != null) {
            return t3J.f().equals("app.start.cold") || t3J.f().equals("app.start.warm");
        }
        return false;
    }

    private static boolean e(double d10, io.sentry.protocol.A a10) {
        if (d10 >= a10.f().doubleValue()) {
            return a10.g() == null || d10 <= a10.g().doubleValue();
        }
        return false;
    }

    private void f(io.sentry.protocol.E e10) {
        Object obj;
        io.sentry.protocol.A a10 = null;
        io.sentry.protocol.A a11 = null;
        for (io.sentry.protocol.A a12 : e10.o0()) {
            if ("ui.load.initial_display".equals(a12.d())) {
                a10 = a12;
            } else if ("ui.load.full_display".equals(a12.d())) {
                a11 = a12;
            }
            if (a10 != null && a11 != null) {
                break;
            }
        }
        if (a10 == null && a11 == null) {
            return;
        }
        for (io.sentry.protocol.A a13 : e10.o0()) {
            if (a13 != a10 && a13 != a11) {
                Map mapB = a13.b();
                boolean z10 = false;
                boolean z11 = a10 != null && e(a13.f().doubleValue(), a10) && (mapB == null || (obj = mapB.get("thread.name")) == null || "main".equals(obj));
                if (a11 != null && e(a13.f().doubleValue(), a11)) {
                    z10 = true;
                }
                if (z11 || z10) {
                    Map mapB2 = a13.b();
                    if (mapB2 == null) {
                        mapB2 = new ConcurrentHashMap();
                        a13.h(mapB2);
                    }
                    if (z11) {
                        mapB2.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z10) {
                        mapB2.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    private static io.sentry.protocol.A h(io.sentry.android.core.performance.i iVar, Y3 y32, io.sentry.protocol.x xVar, String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.l.f49906b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        return new io.sentry.protocol.A(Double.valueOf(iVar.q()), Double.valueOf(iVar.m()), xVar, new Y3(), y32, str, iVar.b(), a4.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E g(io.sentry.protocol.E e10, io.sentry.H h10) {
        Map mapN;
        InterfaceC5192e0 interfaceC5192e0A = this.f49586d.a();
        try {
            if (!this.f49585c.isTracingEnabled()) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return e10;
            }
            io.sentry.android.core.performance.h hVarQ = io.sentry.android.core.performance.h.q();
            if (d(e10)) {
                if (hVarQ.z()) {
                    long jC = hVarQ.m(this.f49585c).c();
                    if (jC != 0) {
                        e10.m0().put(hVarQ.n() == h.a.COLD ? "app_start_cold" : "app_start_warm", new C5261k(Float.valueOf(jC), F0.a.MILLISECOND.apiName()));
                        c(hVarQ, e10);
                        hVarQ.t();
                    }
                }
                C5251a c5251aD = e10.C().d();
                if (c5251aD == null) {
                    c5251aD = new C5251a();
                    e10.C().o(c5251aD);
                }
                c5251aD.v(hVarQ.n() == h.a.COLD ? "cold" : "warm");
            }
            f(e10);
            io.sentry.protocol.x xVarG = e10.G();
            T3 t3J = e10.C().j();
            if (xVarG != null && t3J != null && t3J.f().contentEquals("ui.load") && (mapN = this.f49584b.n(xVarG)) != null) {
                e10.m0().putAll(mapN);
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return e10;
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

    @Override // io.sentry.C
    public V2 b(V2 v22, io.sentry.H h10) {
        return v22;
    }
}
