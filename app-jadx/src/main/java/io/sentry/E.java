package io.sentry;

import io.sentry.C5322z3;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class E {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Boolean f49099A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Boolean f49100B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Boolean f49101C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private String f49102D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private List f49103E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private List f49104F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Boolean f49105G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Boolean f49106H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Boolean f49107I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Boolean f49108J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Boolean f49109K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Boolean f49110L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Double f49111M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private String f49112N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private EnumC5278t1 f49113O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private C5322z3.f f49114P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f49118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f49119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f49120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f49121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f49122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Double f49123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Double f49124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C5322z3.n f49125k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C5322z3.m f49127m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f49132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Long f49133s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f49135u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f49136v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Boolean f49137w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Boolean f49139y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f49140z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f49126l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f49128n = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f49129o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f49130p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f49131q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f49134t = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set f49138x = new CopyOnWriteArraySet();

    public static E g(io.sentry.config.f fVar, ILogger iLogger) {
        E e10 = new E();
        e10.b0(fVar.getProperty("dsn"));
        e10.k0(fVar.getProperty("environment"));
        e10.z0(fVar.getProperty("release"));
        e10.a0(fVar.getProperty("dist"));
        e10.D0(fVar.getProperty("servername"));
        e10.i0(fVar.e("uncaught.handler.enabled"));
        e10.s0(fVar.e("uncaught.handler.print-stacktrace"));
        e10.G0(fVar.c("traces-sample-rate"));
        e10.v0(fVar.c("profiles-sample-rate"));
        e10.Z(fVar.e("debug"));
        e10.d0(fVar.e("enable-deduplication"));
        e10.A0(fVar.e("send-client-reports"));
        e10.l0(fVar.e("force-init"));
        String property = fVar.getProperty("max-request-body-size");
        if (property != null) {
            e10.r0(C5322z3.n.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry entry : fVar.getMap("tags").entrySet()) {
            e10.F0((String) entry.getKey(), (String) entry.getValue());
        }
        String property2 = fVar.getProperty("proxy.host");
        String property3 = fVar.getProperty("proxy.user");
        String property4 = fVar.getProperty("proxy.pass");
        String strD = fVar.d("proxy.port", "80");
        if (property2 != null) {
            e10.y0(new C5322z3.m(property2, strD, property3, property4));
        }
        Iterator it = fVar.a("in-app-includes").iterator();
        while (it.hasNext()) {
            e10.e((String) it.next());
        }
        Iterator it2 = fVar.a("in-app-excludes").iterator();
        while (it2.hasNext()) {
            e10.d((String) it2.next());
        }
        List listA = fVar.getProperty("trace-propagation-targets") != null ? fVar.a("trace-propagation-targets") : null;
        if (listA == null && fVar.getProperty("tracing-origins") != null) {
            listA = fVar.a("tracing-origins");
        }
        if (listA != null) {
            Iterator it3 = listA.iterator();
            while (it3.hasNext()) {
                e10.f((String) it3.next());
            }
        }
        Iterator it4 = fVar.a("context-tags").iterator();
        while (it4.hasNext()) {
            e10.b((String) it4.next());
        }
        e10.x0(fVar.getProperty("proguard-uuid"));
        Iterator it5 = fVar.a("bundle-ids").iterator();
        while (it5.hasNext()) {
            e10.a((String) it5.next());
        }
        e10.n0(fVar.b("idle-timeout"));
        e10.p0(fVar.f("ignored-errors"));
        e10.j0(fVar.e("enabled"));
        e10.g0(fVar.e("enable-pretty-serialization-output"));
        e10.C0(fVar.e("send-modules"));
        e10.B0(fVar.e("send-default-pii"));
        e10.o0(fVar.f("ignored-checkins"));
        e10.q0(fVar.f("ignored-transactions"));
        e10.c0(fVar.e("enable-backpressure-handling"));
        e10.m0(fVar.e("global-hub-mode"));
        e10.X(fVar.e("capture-open-telemetry-events"));
        e10.e0(fVar.e("logs.enabled"));
        e10.f0(fVar.e("metrics.enabled"));
        for (String str : fVar.a("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    e10.c(cls);
                } else {
                    iLogger.c(EnumC5215i3.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.c(EnumC5215i3.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        Long lB = fVar.b("cron.default-checkin-margin");
        Long lB2 = fVar.b("cron.default-max-runtime");
        String property5 = fVar.getProperty("cron.default-timezone");
        Long lB3 = fVar.b("cron.default-failure-issue-threshold");
        Long lB4 = fVar.b("cron.default-recovery-threshold");
        if (lB != null || lB2 != null || property5 != null || lB3 != null || lB4 != null) {
            C5322z3.f fVar2 = new C5322z3.f();
            fVar2.f(lB);
            fVar2.h(lB2);
            fVar2.j(property5);
            fVar2.g(lB3);
            fVar2.i(lB4);
            e10.Y(fVar2);
        }
        e10.h0(fVar.e("enable-spotlight"));
        e10.E0(fVar.getProperty("spotlight-connection-url"));
        e10.u0(fVar.c("profile-session-sample-rate"));
        e10.w0(fVar.getProperty("profiling-traces-dir-path"));
        String property6 = fVar.getProperty("profile-lifecycle");
        if (property6 != null && !property6.isEmpty()) {
            e10.t0(EnumC5278t1.valueOf(property6.toUpperCase()));
        }
        return e10;
    }

    public Double A() {
        return this.f49111M;
    }

    public void A0(Boolean bool) {
        this.f49137w = bool;
    }

    public Double B() {
        return this.f49124j;
    }

    public void B0(Boolean bool) {
        this.f49106H = bool;
    }

    public String C() {
        return this.f49112N;
    }

    public void C0(Boolean bool) {
        this.f49105G = bool;
    }

    public String D() {
        return this.f49132r;
    }

    public void D0(String str) {
        this.f49119e = str;
    }

    public C5322z3.m E() {
        return this.f49127m;
    }

    public void E0(String str) {
        this.f49102D = str;
    }

    public String F() {
        return this.f49117c;
    }

    public void F0(String str, String str2) {
        this.f49126l.put(str, str2);
    }

    public Boolean G() {
        return this.f49137w;
    }

    public void G0(Double d10) {
        this.f49123i = d10;
    }

    public String H() {
        return this.f49119e;
    }

    public String I() {
        return this.f49102D;
    }

    public Map J() {
        return this.f49126l;
    }

    public List K() {
        return this.f49130p;
    }

    public Double L() {
        return this.f49123i;
    }

    public Boolean M() {
        return this.f49110L;
    }

    public Boolean N() {
        return this.f49107I;
    }

    public Boolean O() {
        return this.f49100B;
    }

    public Boolean P() {
        return this.f49101C;
    }

    public Boolean Q() {
        return this.f49140z;
    }

    public Boolean R() {
        return this.f49099A;
    }

    public Boolean S() {
        return this.f49139y;
    }

    public Boolean T() {
        return this.f49109K;
    }

    public Boolean U() {
        return this.f49108J;
    }

    public Boolean V() {
        return this.f49106H;
    }

    public Boolean W() {
        return this.f49105G;
    }

    public void X(Boolean bool) {
        this.f49110L = bool;
    }

    public void Y(C5322z3.f fVar) {
        this.f49114P = fVar;
    }

    public void Z(Boolean bool) {
        this.f49121g = bool;
    }

    public void a(String str) {
        this.f49138x.add(str);
    }

    public void a0(String str) {
        this.f49118d = str;
    }

    public void b(String str) {
        this.f49131q.add(str);
    }

    public void b0(String str) {
        this.f49115a = str;
    }

    public void c(Class cls) {
        this.f49134t.add(cls);
    }

    public void c0(Boolean bool) {
        this.f49107I = bool;
    }

    public void d(String str) {
        this.f49128n.add(str);
    }

    public void d0(Boolean bool) {
        this.f49122h = bool;
    }

    public void e(String str) {
        this.f49129o.add(str);
    }

    public void e0(Boolean bool) {
        this.f49100B = bool;
    }

    public void f(String str) {
        if (this.f49130p == null) {
            this.f49130p = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.f49130p.add(str);
    }

    public void f0(Boolean bool) {
        this.f49101C = bool;
    }

    public void g0(Boolean bool) {
        this.f49140z = bool;
    }

    public Set h() {
        return this.f49138x;
    }

    public void h0(Boolean bool) {
        this.f49099A = bool;
    }

    public List i() {
        return this.f49131q;
    }

    public void i0(Boolean bool) {
        this.f49120f = bool;
    }

    public C5322z3.f j() {
        return this.f49114P;
    }

    public void j0(Boolean bool) {
        this.f49139y = bool;
    }

    public Boolean k() {
        return this.f49121g;
    }

    public void k0(String str) {
        this.f49116b = str;
    }

    public String l() {
        return this.f49118d;
    }

    public void l0(Boolean bool) {
        this.f49109K = bool;
    }

    public String m() {
        return this.f49115a;
    }

    public void m0(Boolean bool) {
        this.f49108J = bool;
    }

    public Boolean n() {
        return this.f49122h;
    }

    public void n0(Long l10) {
        this.f49133s = l10;
    }

    public Boolean o() {
        return this.f49120f;
    }

    public void o0(List list) {
        this.f49103E = list;
    }

    public String p() {
        return this.f49116b;
    }

    public void p0(List list) {
        this.f49135u = list;
    }

    public Long q() {
        return this.f49133s;
    }

    public void q0(List list) {
        this.f49104F = list;
    }

    public List r() {
        return this.f49103E;
    }

    public void r0(C5322z3.n nVar) {
        this.f49125k = nVar;
    }

    public List s() {
        return this.f49135u;
    }

    public void s0(Boolean bool) {
        this.f49136v = bool;
    }

    public Set t() {
        return this.f49134t;
    }

    public void t0(EnumC5278t1 enumC5278t1) {
        this.f49113O = enumC5278t1;
    }

    public List u() {
        return this.f49104F;
    }

    public void u0(Double d10) {
        this.f49111M = d10;
    }

    public List v() {
        return this.f49128n;
    }

    public void v0(Double d10) {
        this.f49124j = d10;
    }

    public List w() {
        return this.f49129o;
    }

    public void w0(String str) {
        this.f49112N = str;
    }

    public C5322z3.n x() {
        return this.f49125k;
    }

    public void x0(String str) {
        this.f49132r = str;
    }

    public Boolean y() {
        return this.f49136v;
    }

    public void y0(C5322z3.m mVar) {
        this.f49127m = mVar;
    }

    public EnumC5278t1 z() {
        return this.f49113O;
    }

    public void z0(String str) {
        this.f49117c = str;
    }
}
