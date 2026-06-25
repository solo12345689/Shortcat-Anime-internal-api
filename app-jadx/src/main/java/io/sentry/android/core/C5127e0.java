package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.AbstractC5219j2;
import io.sentry.C5322z3;
import io.sentry.D3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5181c;
import io.sentry.T3;
import io.sentry.V2;
import io.sentry.W2;
import io.sentry.android.core.AbstractC5156p0;
import io.sentry.protocol.C5251a;
import io.sentry.protocol.C5253c;
import io.sentry.protocol.C5254d;
import io.sentry.protocol.C5255e;
import io.sentry.protocol.DebugImage;
import io.sentry.util.runtime.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.android.core.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5127e0 implements InterfaceC5181c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f49721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5131g0 f49722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W2 f49723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.cache.t f49724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f49725f = Collections.singletonList(new b());

    /* JADX INFO: renamed from: io.sentry.android.core.e0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements c {
        private b() {
        }

        private io.sentry.protocol.D d(List list) {
            if (list == null) {
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                io.sentry.protocol.D d10 = (io.sentry.protocol.D) it.next();
                String strM = d10.m();
                if (strM != null && strM.equals("main")) {
                    return d10;
                }
            }
            return null;
        }

        private boolean e(Object obj) {
            if (obj instanceof io.sentry.hints.a) {
                return "anr_background".equals(((io.sentry.hints.a) obj).h());
            }
            return false;
        }

        private void f(V2 v22, io.sentry.hints.c cVar, boolean z10) {
            if (v22.p0() != null) {
                return;
            }
            io.sentry.protocol.l lVar = new io.sentry.protocol.l();
            if (cVar.b()) {
                lVar.r("AppExitInfo");
            } else {
                lVar.r("HistoricalAppExitInfo");
            }
            String str = "ANR";
            if (z10) {
                str = "Background ANR";
            }
            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
            io.sentry.protocol.D d10 = d(v22.u0());
            if (d10 == null) {
                d10 = new io.sentry.protocol.D();
                d10.y(new io.sentry.protocol.C());
            }
            v22.A0(C5127e0.this.f49723d.f(d10, lVar, applicationNotResponding));
        }

        private void g(AbstractC5219j2 abstractC5219j2, boolean z10) {
            C5251a c5251aD = abstractC5219j2.C().d();
            if (c5251aD == null) {
                c5251aD = new C5251a();
                abstractC5219j2.C().o(c5251aD);
            }
            if (c5251aD.l() == null) {
                c5251aD.r(Boolean.valueOf(z10));
            }
        }

        private void h(V2 v22, boolean z10) {
            if (v22.q0() == null) {
                v22.B0(Arrays.asList("{{ default }}", z10 ? "background-anr" : "foreground-anr"));
            }
        }

        @Override // io.sentry.android.core.C5127e0.c
        public void a(V2 v22, io.sentry.hints.c cVar, Object obj) {
            boolean zE = e(obj);
            C5127e0.this.u(v22);
            f(v22, cVar, zE);
        }

        @Override // io.sentry.android.core.C5127e0.c
        public boolean b(Object obj) {
            return obj instanceof io.sentry.hints.a;
        }

        @Override // io.sentry.android.core.C5127e0.c
        public void c(V2 v22, io.sentry.hints.c cVar, Object obj) {
            boolean zE = e(obj);
            g(v22, !zE);
            h(v22, zE);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.core.e0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface c {
        void a(V2 v22, io.sentry.hints.c cVar, Object obj);

        boolean b(Object obj);

        void c(V2 v22, io.sentry.hints.c cVar, Object obj);
    }

    public C5127e0(Context context, SentryAndroidOptions sentryAndroidOptions, C5131g0 c5131g0) {
        this.f49720a = AbstractC5156p0.g(context);
        this.f49721b = sentryAndroidOptions;
        this.f49722c = c5131g0;
        this.f49724e = sentryAndroidOptions.findPersistingScopeObserver();
        this.f49723d = new W2(new D3(sentryAndroidOptions));
    }

    private void A(V2 v22) {
        EnumC5215i3 enumC5215i3 = (EnumC5215i3) o(this.f49721b, "level.json", EnumC5215i3.class);
        if (v22.r0() == null) {
            v22.C0(enumC5215i3);
        }
    }

    private void B(AbstractC5219j2 abstractC5219j2) {
        Map map = (Map) io.sentry.cache.h.b(this.f49721b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC5219j2.N() == null) {
            abstractC5219j2.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC5219j2.N().containsKey(entry.getKey())) {
                abstractC5219j2.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void C(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.J() == null) {
            abstractC5219j2.Z((String) io.sentry.cache.h.b(this.f49721b, "release.json", String.class));
        }
    }

    private void D(V2 v22) {
        String str = (String) o(this.f49721b, "replay.json", String.class);
        String cacheDirPath = this.f49721b.getCacheDirPath();
        if (cacheDirPath == null) {
            return;
        }
        if (!new File(cacheDirPath, "replay_" + str).exists()) {
            if (!p(v22)) {
                return;
            }
            File[] fileArrListFiles = new File(cacheDirPath).listFiles();
            String strSubstring = null;
            if (fileArrListFiles != null) {
                long jLastModified = Long.MIN_VALUE;
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= v22.v0().getTime()) {
                        jLastModified = file.lastModified();
                        strSubstring = file.getName().substring(7);
                    }
                }
            }
            str = strSubstring;
        }
        if (str == null) {
            return;
        }
        io.sentry.cache.t.E(this.f49721b, str, "replay.json");
        v22.C().l("replay_id", str);
    }

    private void E(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.K() == null) {
            abstractC5219j2.a0((io.sentry.protocol.o) o(this.f49721b, "request.json", io.sentry.protocol.o.class));
        }
    }

    private void F(AbstractC5219j2 abstractC5219j2) {
        Map map = (Map) o(this.f49721b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC5219j2.N() == null) {
            abstractC5219j2.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC5219j2.N().containsKey(entry.getKey())) {
                abstractC5219j2.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void G(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.L() == null) {
            abstractC5219j2.b0((io.sentry.protocol.r) io.sentry.cache.h.b(this.f49721b, "sdk-version.json", io.sentry.protocol.r.class));
        }
    }

    private void H(AbstractC5219j2 abstractC5219j2) {
        try {
            AbstractC5156p0.a aVarN = C5175z0.k(this.f49720a, this.f49721b).n();
            if (aVarN != null) {
                for (Map.Entry entry : aVarN.a().entrySet()) {
                    abstractC5219j2.d0((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f49721b.getLogger().b(EnumC5215i3.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void I(V2 v22) {
        n(v22);
        H(v22);
    }

    private void J(V2 v22) {
        T3 t32 = (T3) o(this.f49721b, "trace.json", T3.class);
        if (v22.C().j() != null || t32 == null) {
            return;
        }
        v22.C().z(t32);
    }

    private void K(V2 v22) {
        String str = (String) o(this.f49721b, "transaction.json", String.class);
        if (v22.w0() == null) {
            v22.H0(str);
        }
    }

    private void L(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.Q() == null) {
            abstractC5219j2.f0((io.sentry.protocol.I) o(this.f49721b, "user.json", io.sentry.protocol.I.class));
        }
    }

    private void f(V2 v22) {
        C(v22);
        x(v22);
        w(v22);
        t(v22);
        G(v22);
        q(v22);
        B(v22);
    }

    private void h(V2 v22) {
        E(v22);
        L(v22);
        F(v22);
        r(v22);
        y(v22);
        s(v22);
        K(v22);
        z(v22);
        A(v22);
        J(v22);
        D(v22);
    }

    private c i(Object obj) {
        for (c cVar : this.f49725f) {
            if (cVar.b(obj)) {
                return cVar;
            }
        }
        return null;
    }

    private C5255e j() {
        C5255e c5255e = new C5255e();
        c5255e.b0(Build.MANUFACTURER);
        c5255e.P(Build.BRAND);
        c5255e.V(AbstractC5156p0.l(this.f49721b.getLogger()));
        c5255e.d0(Build.MODEL);
        c5255e.e0(Build.ID);
        c5255e.L(AbstractC5156p0.j());
        ActivityManager.MemoryInfo memoryInfoN = AbstractC5156p0.n(this.f49720a, this.f49721b.getLogger());
        if (memoryInfoN != null) {
            c5255e.c0(l(memoryInfoN));
        }
        c5255e.n0(this.f49722c.f());
        DisplayMetrics displayMetricsK = AbstractC5156p0.k(this.f49720a, this.f49721b.getLogger());
        if (displayMetricsK != null) {
            c5255e.m0(Integer.valueOf(displayMetricsK.widthPixels));
            c5255e.l0(Integer.valueOf(displayMetricsK.heightPixels));
            c5255e.j0(Float.valueOf(displayMetricsK.density));
            c5255e.k0(Integer.valueOf(displayMetricsK.densityDpi));
        }
        if (c5255e.J() == null) {
            c5255e.Y(k());
        }
        List listC = io.sentry.android.core.internal.util.o.a().c();
        if (!listC.isEmpty()) {
            c5255e.i0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            c5255e.h0(Integer.valueOf(listC.size()));
        }
        return c5255e;
    }

    private String k() {
        try {
            return (String) this.f49721b.getRuntimeManager().a(new a.InterfaceC0806a() { // from class: io.sentry.android.core.d0
                @Override // io.sentry.util.runtime.a.InterfaceC0806a
                public final Object run() {
                    return E0.a(this.f49701a.f49720a);
                }
            });
        } catch (Throwable th2) {
            this.f49721b.getLogger().b(EnumC5215i3.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    private Long l(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    private void m(AbstractC5219j2 abstractC5219j2) {
        String str;
        io.sentry.protocol.n nVarH = abstractC5219j2.C().h();
        abstractC5219j2.C().u(C5175z0.k(this.f49720a, this.f49721b).l());
        if (nVarH != null) {
            String strG = nVarH.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            abstractC5219j2.C().l(str, nVarH);
        }
    }

    private void n(AbstractC5219j2 abstractC5219j2) {
        io.sentry.protocol.I iQ = abstractC5219j2.Q();
        if (iQ == null) {
            iQ = new io.sentry.protocol.I();
            abstractC5219j2.f0(iQ);
        }
        if (iQ.i() == null) {
            iQ.o(k());
        }
        if (iQ.j() == null && this.f49721b.isSendDefaultPii()) {
            iQ.p("{{auto}}");
        }
    }

    private Object o(C5322z3 c5322z3, String str, Class cls) {
        io.sentry.cache.t tVar = this.f49724e;
        if (tVar == null) {
            return null;
        }
        return tVar.B(c5322z3, str, cls);
    }

    private boolean p(V2 v22) {
        String str = (String) io.sentry.cache.h.b(this.f49721b, "replay-error-sample-rate.json", String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= io.sentry.util.B.a().c()) {
                return true;
            }
            this.f49721b.getLogger().c(EnumC5215i3.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", v22.G());
            return false;
        } catch (Throwable th2) {
            this.f49721b.getLogger().b(EnumC5215i3.ERROR, "Error parsing replay sample rate.", th2);
            return false;
        }
    }

    private void q(AbstractC5219j2 abstractC5219j2) {
        C5251a c5251aD = abstractC5219j2.C().d();
        if (c5251aD == null) {
            c5251aD = new C5251a();
        }
        c5251aD.o(AbstractC5156p0.i(this.f49720a));
        PackageInfo packageInfoP = AbstractC5156p0.p(this.f49720a, this.f49722c);
        if (packageInfoP != null) {
            c5251aD.n(packageInfoP.packageName);
        }
        String strJ = abstractC5219j2.J() != null ? abstractC5219j2.J() : (String) io.sentry.cache.h.b(this.f49721b, "release.json", String.class);
        if (strJ != null) {
            try {
                String strSubstring = strJ.substring(strJ.indexOf(64) + 1, strJ.indexOf(43));
                String strSubstring2 = strJ.substring(strJ.indexOf(43) + 1);
                c5251aD.q(strSubstring);
                c5251aD.m(strSubstring2);
            } catch (Throwable unused) {
                this.f49721b.getLogger().c(EnumC5215i3.WARNING, "Failed to parse release from scope cache: %s", strJ);
            }
        }
        try {
            AbstractC5156p0.b bVarO = C5175z0.k(this.f49720a, this.f49721b).o();
            if (bVarO != null) {
                c5251aD.t(Boolean.valueOf(bVarO.b()));
                if (bVarO.a() != null) {
                    c5251aD.u(Arrays.asList(bVarO.a()));
                }
            }
        } catch (Throwable th2) {
            this.f49721b.getLogger().b(EnumC5215i3.ERROR, "Error getting split apks info.", th2);
        }
        abstractC5219j2.C().o(c5251aD);
    }

    private void r(AbstractC5219j2 abstractC5219j2) {
        List list = (List) o(this.f49721b, "breadcrumbs.json", List.class);
        if (list == null) {
            return;
        }
        if (abstractC5219j2.B() == null) {
            abstractC5219j2.S(list);
        } else {
            abstractC5219j2.B().addAll(list);
        }
    }

    private void s(AbstractC5219j2 abstractC5219j2) {
        C5253c c5253c = (C5253c) o(this.f49721b, "contexts.json", C5253c.class);
        if (c5253c == null) {
            return;
        }
        C5253c c5253cC = abstractC5219j2.C();
        for (Map.Entry entry : new C5253c(c5253c).b()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof T3)) {
                if (!c5253cC.a(entry.getKey())) {
                    c5253cC.l((String) entry.getKey(), value);
                }
            }
        }
    }

    private void t(AbstractC5219j2 abstractC5219j2) {
        C5254d c5254dD = abstractC5219j2.D();
        if (c5254dD == null) {
            c5254dD = new C5254d();
        }
        if (c5254dD.d() == null) {
            c5254dD.e(new ArrayList());
        }
        List listD = c5254dD.d();
        if (listD != null) {
            String str = (String) io.sentry.cache.h.b(this.f49721b, "proguard-uuid.json", String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                listD.add(debugImage);
            }
            abstractC5219j2.T(c5254dD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.I() == null) {
            abstractC5219j2.Y("java");
        }
    }

    private void v(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.C().e() == null) {
            abstractC5219j2.C().q(j());
        }
    }

    private void w(AbstractC5219j2 abstractC5219j2) {
        String str;
        if (abstractC5219j2.E() == null) {
            abstractC5219j2.U((String) io.sentry.cache.h.b(this.f49721b, "dist.json", String.class));
        }
        if (abstractC5219j2.E() != null || (str = (String) io.sentry.cache.h.b(this.f49721b, "release.json", String.class)) == null) {
            return;
        }
        try {
            abstractC5219j2.U(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f49721b.getLogger().c(EnumC5215i3.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    private void x(AbstractC5219j2 abstractC5219j2) {
        if (abstractC5219j2.F() == null) {
            String environment = (String) io.sentry.cache.h.b(this.f49721b, "environment.json", String.class);
            if (environment == null) {
                environment = this.f49721b.getEnvironment();
            }
            abstractC5219j2.V(environment);
        }
    }

    private void y(AbstractC5219j2 abstractC5219j2) {
        Map map = (Map) o(this.f49721b, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC5219j2.H() == null) {
            abstractC5219j2.X(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC5219j2.H().containsKey(entry.getKey())) {
                abstractC5219j2.H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    private void z(V2 v22) {
        List list = (List) o(this.f49721b, "fingerprint.json", List.class);
        if (v22.q0() == null) {
            v22.B0(list);
        }
    }

    @Override // io.sentry.C
    public V2 b(V2 v22, io.sentry.H h10) {
        Object objE = io.sentry.util.l.e(h10);
        if (!(objE instanceof io.sentry.hints.c)) {
            this.f49721b.getLogger().c(EnumC5215i3.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return v22;
        }
        io.sentry.hints.c cVar = (io.sentry.hints.c) objE;
        c cVarI = i(objE);
        if (cVarI != null) {
            cVarI.a(v22, cVar, objE);
        }
        m(v22);
        v(v22);
        if (!cVar.b()) {
            this.f49721b.getLogger().c(EnumC5215i3.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return v22;
        }
        h(v22);
        f(v22);
        I(v22);
        if (cVarI != null) {
            cVarI.c(v22, cVar, objE);
        }
        return v22;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E g(io.sentry.protocol.E e10, io.sentry.H h10) {
        return e10;
    }
}
