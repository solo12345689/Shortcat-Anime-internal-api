package io.sentry;

import io.sentry.util.C5288a;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5186d {

    /* JADX INFO: renamed from: i */
    static final Integer f50632i = 8192;

    /* JADX INFO: renamed from: j */
    static final Integer f50633j = 64;

    /* JADX INFO: renamed from: k */
    private static final c f50634k = new c();

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap f50635a;

    /* JADX INFO: renamed from: b */
    private final C5288a f50636b;

    /* JADX INFO: renamed from: c */
    private Double f50637c;

    /* JADX INFO: renamed from: d */
    private Double f50638d;

    /* JADX INFO: renamed from: e */
    private final String f50639e;

    /* JADX INFO: renamed from: f */
    private boolean f50640f;

    /* JADX INFO: renamed from: g */
    private final boolean f50641g;

    /* JADX INFO: renamed from: h */
    final ILogger f50642h;

    /* JADX INFO: renamed from: io.sentry.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final List f50643a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-transaction", "sentry-sample_rate", "sentry-sample_rand", "sentry-sampled", "sentry-replay_id");
    }

    /* JADX INFO: renamed from: io.sentry.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends ThreadLocal {
        private c() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a */
        public DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    public C5186d(ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, true, false, iLogger);
    }

    public static C5186d c(AbstractC5219j2 abstractC5219j2, String str, C5322z3 c5322z3) {
        C5186d c5186d = new C5186d(c5322z3.getLogger());
        T3 t3J = abstractC5219j2.C().j();
        c5186d.E(t3J != null ? t3J.p().toString() : null);
        c5186d.y(c5322z3.retrieveParsedDsn().a());
        c5186d.z(abstractC5219j2.J());
        c5186d.x(abstractC5219j2.F());
        c5186d.F(str);
        c5186d.C(null);
        c5186d.D(null);
        c5186d.B(null);
        Object objC = abstractC5219j2.C().c("replay_id");
        if (objC != null && !objC.toString().equals(io.sentry.protocol.x.f51153b.toString())) {
            c5186d.A(objC.toString());
            abstractC5219j2.C().n("replay_id");
        }
        c5186d.b();
        return c5186d;
    }

    private static boolean p(io.sentry.protocol.H h10) {
        return (h10 == null || io.sentry.protocol.H.URL.equals(h10)) ? false : true;
    }

    private static Double s(h4 h4Var) {
        if (h4Var == null) {
            return null;
        }
        return h4Var.c();
    }

    private static Double t(h4 h4Var) {
        if (h4Var == null) {
            return null;
        }
        return h4Var.d();
    }

    private static String u(Double d10) {
        if (io.sentry.util.A.h(d10, false)) {
            return ((DecimalFormat) f50634k.get()).format(d10);
        }
        return null;
    }

    private static Boolean v(h4 h4Var) {
        if (h4Var == null) {
            return null;
        }
        return h4Var.e();
    }

    public void A(String str) {
        w("sentry-replay_id", str);
    }

    public void B(Double d10) {
        if (q()) {
            this.f50638d = d10;
        }
    }

    public void C(Double d10) {
        if (q()) {
            this.f50637c = d10;
        }
    }

    public void D(String str) {
        w("sentry-sampled", str);
    }

    public void E(String str) {
        w("sentry-trace_id", str);
    }

    public void F(String str) {
        w("sentry-transaction", str);
    }

    public void G(h4 h4Var) {
        if (h4Var == null) {
            return;
        }
        D(io.sentry.util.D.g(v(h4Var)));
        if (h4Var.c() != null) {
            B(s(h4Var));
        }
        if (h4Var.d() != null) {
            a(t(h4Var));
        }
    }

    public void H(Y y10, C5322z3 c5322z3) {
        C5310x1 c5310x1H = y10.H();
        io.sentry.protocol.x xVarG = y10.G();
        E(c5310x1H.e().toString());
        y(c5322z3.retrieveParsedDsn().a());
        z(c5322z3.getRelease());
        x(c5322z3.getEnvironment());
        if (!io.sentry.protocol.x.f51153b.equals(xVarG)) {
            A(xVarG.toString());
        }
        F(null);
        C(null);
        D(null);
    }

    public void I(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, C5322z3 c5322z3, h4 h4Var, String str, io.sentry.protocol.H h10) {
        E(xVar.toString());
        y(c5322z3.retrieveParsedDsn().a());
        z(c5322z3.getRelease());
        x(c5322z3.getEnvironment());
        if (!p(h10)) {
            str = null;
        }
        F(str);
        if (xVar2 != null && !io.sentry.protocol.x.f51153b.equals(xVar2)) {
            A(xVar2.toString());
        }
        C(t(h4Var));
        D(io.sentry.util.D.g(v(h4Var)));
        B(s(h4Var));
    }

    public f4 J() {
        String strL = l();
        String strH = h();
        String strF = f();
        if (strL == null || strF == null) {
            return null;
        }
        io.sentry.protocol.x xVar = new io.sentry.protocol.x(strL);
        io.sentry.protocol.x xVar2 = null;
        String strG = g();
        String strE = e();
        String strO = o();
        String strM = m();
        String strU = u(j());
        String strK = k();
        if (strH != null) {
            xVar2 = new io.sentry.protocol.x(strH);
        }
        f4 f4Var = new f4(xVar, strF, strG, strE, strO, strM, strU, strK, xVar2, u(i()));
        f4Var.c(n());
        return f4Var;
    }

    public void a(Double d10) {
        this.f50637c = d10;
    }

    public void b() {
        this.f50640f = false;
    }

    public String d(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.f50635a.get(str);
    }

    public String e() {
        return d("sentry-environment");
    }

    public String f() {
        return d("sentry-public_key");
    }

    public String g() {
        return d("sentry-release");
    }

    public String h() {
        return d("sentry-replay_id");
    }

    public Double i() {
        return this.f50638d;
    }

    public Double j() {
        return this.f50637c;
    }

    public String k() {
        return d("sentry-sampled");
    }

    public String l() {
        return d("sentry-trace_id");
    }

    public String m() {
        return d("sentry-transaction");
    }

    public Map n() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        InterfaceC5192e0 interfaceC5192e0A = this.f50636b.a();
        try {
            for (Map.Entry entry : this.f50635a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!b.f50643a.contains(str) && str2 != null) {
                    concurrentHashMap.put(str.replaceFirst("sentry-", ""), str2);
                }
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return concurrentHashMap;
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

    public String o() {
        return d("sentry-user_id");
    }

    public boolean q() {
        return this.f50640f;
    }

    public boolean r() {
        return this.f50641g;
    }

    public void w(String str, String str2) {
        if (this.f50640f) {
            if (str2 == null) {
                this.f50635a.remove(str);
            } else {
                this.f50635a.put(str, str2);
            }
        }
    }

    public void x(String str) {
        w("sentry-environment", str);
    }

    public void y(String str) {
        w("sentry-public_key", str);
    }

    public void z(String str) {
        w("sentry-release", str);
    }

    public C5186d(ConcurrentHashMap concurrentHashMap, Double d10, Double d11, String str, boolean z10, boolean z11, ILogger iLogger) {
        this.f50636b = new C5288a();
        this.f50635a = concurrentHashMap;
        this.f50637c = d10;
        this.f50638d = d11;
        this.f50642h = iLogger;
        this.f50639e = str;
        this.f50640f = z10;
        this.f50641g = z11;
    }
}
