package io.sentry;

import io.sentry.Y3;
import io.sentry.a4;
import io.sentry.protocol.x;
import io.sentry.util.AbstractC5290c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class T3 implements B0 {

    /* JADX INFO: renamed from: a */
    private final io.sentry.protocol.x f49329a;

    /* JADX INFO: renamed from: b */
    private final Y3 f49330b;

    /* JADX INFO: renamed from: c */
    private Y3 f49331c;

    /* JADX INFO: renamed from: d */
    private transient h4 f49332d;

    /* JADX INFO: renamed from: e */
    protected String f49333e;

    /* JADX INFO: renamed from: f */
    protected String f49334f;

    /* JADX INFO: renamed from: g */
    protected a4 f49335g;

    /* JADX INFO: renamed from: h */
    protected Map f49336h;

    /* JADX INFO: renamed from: i */
    protected String f49337i;

    /* JADX INFO: renamed from: j */
    protected Map f49338j;

    /* JADX INFO: renamed from: k */
    private Map f49339k;

    /* JADX INFO: renamed from: l */
    private EnumC5242o0 f49340l;

    /* JADX INFO: renamed from: m */
    protected C5186d f49341m;

    /* JADX INFO: renamed from: n */
    protected io.sentry.featureflags.b f49342n;

    /* JADX INFO: renamed from: o */
    private io.sentry.protocol.x f49343o;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public T3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            String strX0 = null;
            io.sentry.protocol.x xVarA = null;
            Y3 y3A = null;
            Y3 y32 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String strX02 = null;
            a4 a4Var = null;
            String strX03 = null;
            Map mapB = null;
            Map map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "span_id":
                        y3A = new Y3.a().a(interfaceC5218j1, iLogger);
                        break;
                    case "parent_span_id":
                        y32 = (Y3) interfaceC5218j1.C0(iLogger, new Y3.a());
                        break;
                    case "description":
                        strX02 = interfaceC5218j1.X0();
                        break;
                    case "origin":
                        strX03 = interfaceC5218j1.X0();
                        break;
                    case "status":
                        a4Var = (a4) interfaceC5218j1.C0(iLogger, new a4.a());
                        break;
                    case "op":
                        strX0 = interfaceC5218j1.X0();
                        break;
                    case "data":
                        map = (Map) interfaceC5218j1.N1();
                        break;
                    case "tags":
                        mapB = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                        break;
                    case "trace_id":
                        xVarA = new x.a().a(interfaceC5218j1, iLogger);
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            if (xVarA == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (y3A == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"span_id\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strX0 == null) {
                strX0 = "";
            }
            T3 t32 = new T3(xVarA, y3A, strX0, y32, null);
            t32.r(strX02);
            t32.v(a4Var);
            t32.t(strX03);
            if (mapB != null) {
                t32.f49336h = mapB;
            }
            if (map != null) {
                t32.f49338j = map;
            }
            t32.w(concurrentHashMap);
            interfaceC5218j1.I();
            return t32;
        }
    }

    public T3(String str) {
        this(new io.sentry.protocol.x(), new Y3(), str, null, null);
    }

    public T3 a(String str, Y3 y32, Y3 y33) {
        io.sentry.protocol.x xVar = this.f49329a;
        if (y33 == null) {
            y33 = new Y3();
        }
        return new T3(xVar, y33, y32, str, null, this.f49332d, null, "manual");
    }

    public C5186d b() {
        return this.f49341m;
    }

    public String c() {
        return this.f49334f;
    }

    public io.sentry.featureflags.b d() {
        return this.f49342n;
    }

    public EnumC5242o0 e() {
        return this.f49340l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T3)) {
            return false;
        }
        T3 t32 = (T3) obj;
        return this.f49329a.equals(t32.f49329a) && this.f49330b.equals(t32.f49330b) && io.sentry.util.w.a(this.f49331c, t32.f49331c) && this.f49333e.equals(t32.f49333e) && io.sentry.util.w.a(this.f49334f, t32.f49334f) && n() == t32.n();
    }

    public String f() {
        return this.f49333e;
    }

    public String g() {
        return this.f49337i;
    }

    public Y3 h() {
        return this.f49331c;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f49329a, this.f49330b, this.f49331c, this.f49333e, this.f49334f, n());
    }

    public Boolean i() {
        h4 h4Var = this.f49332d;
        if (h4Var == null) {
            return null;
        }
        return h4Var.b();
    }

    public io.sentry.protocol.x j() {
        return this.f49343o;
    }

    public Boolean k() {
        h4 h4Var = this.f49332d;
        if (h4Var == null) {
            return null;
        }
        return h4Var.e();
    }

    public h4 l() {
        return this.f49332d;
    }

    public Y3 m() {
        return this.f49330b;
    }

    public a4 n() {
        return this.f49335g;
    }

    public Map o() {
        return this.f49336h;
    }

    public io.sentry.protocol.x p() {
        return this.f49329a;
    }

    public void q(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f49338j.remove(str);
        } else {
            this.f49338j.put(str, obj);
        }
    }

    public void r(String str) {
        this.f49334f = str;
    }

    public void s(EnumC5242o0 enumC5242o0) {
        this.f49340l = enumC5242o0;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("trace_id");
        this.f49329a.serialize(interfaceC5223k1, iLogger);
        interfaceC5223k1.e("span_id");
        this.f49330b.serialize(interfaceC5223k1, iLogger);
        if (this.f49331c != null) {
            interfaceC5223k1.e("parent_span_id");
            this.f49331c.serialize(interfaceC5223k1, iLogger);
        }
        interfaceC5223k1.e("op").f(this.f49333e);
        if (this.f49334f != null) {
            interfaceC5223k1.e(com.amazon.a.a.o.b.f34645c).f(this.f49334f);
        }
        if (n() != null) {
            interfaceC5223k1.e("status").j(iLogger, n());
        }
        if (this.f49337i != null) {
            interfaceC5223k1.e("origin").j(iLogger, this.f49337i);
        }
        if (!this.f49336h.isEmpty()) {
            interfaceC5223k1.e("tags").j(iLogger, this.f49336h);
        }
        if (!this.f49338j.isEmpty()) {
            interfaceC5223k1.e("data").j(iLogger, this.f49338j);
        }
        Map map = this.f49339k;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f49339k.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    public void t(String str) {
        this.f49337i = str;
    }

    public void u(h4 h4Var) {
        this.f49332d = h4Var;
        C5186d c5186d = this.f49341m;
        if (c5186d != null) {
            c5186d.G(h4Var);
        }
    }

    public void v(a4 a4Var) {
        this.f49335g = a4Var;
    }

    public void w(Map map) {
        this.f49339k = map;
    }

    public T3(io.sentry.protocol.x xVar, Y3 y32, String str, Y3 y33, h4 h4Var) {
        this(xVar, y32, y33, str, null, h4Var, null, "manual");
    }

    public T3(io.sentry.protocol.x xVar, Y3 y32, Y3 y33, String str, String str2, h4 h4Var, a4 a4Var, String str3) {
        this.f49336h = new ConcurrentHashMap();
        this.f49337i = "manual";
        this.f49338j = new ConcurrentHashMap();
        this.f49340l = EnumC5242o0.SENTRY;
        this.f49342n = io.sentry.featureflags.d.a();
        this.f49343o = io.sentry.protocol.x.f51153b;
        this.f49329a = (io.sentry.protocol.x) io.sentry.util.w.c(xVar, "traceId is required");
        this.f49330b = (Y3) io.sentry.util.w.c(y32, "spanId is required");
        this.f49333e = (String) io.sentry.util.w.c(str, "operation is required");
        this.f49331c = y33;
        this.f49334f = str2;
        this.f49335g = a4Var;
        this.f49337i = str3;
        u(h4Var);
        io.sentry.util.thread.a threadChecker = Q1.b().h().getThreadChecker();
        this.f49338j.put("thread.id", String.valueOf(threadChecker.c()));
        this.f49338j.put("thread.name", threadChecker.b());
    }

    public T3(T3 t32) {
        this.f49336h = new ConcurrentHashMap();
        this.f49337i = "manual";
        this.f49338j = new ConcurrentHashMap();
        this.f49340l = EnumC5242o0.SENTRY;
        this.f49342n = io.sentry.featureflags.d.a();
        this.f49343o = io.sentry.protocol.x.f51153b;
        this.f49329a = t32.f49329a;
        this.f49330b = t32.f49330b;
        this.f49331c = t32.f49331c;
        u(t32.f49332d);
        this.f49333e = t32.f49333e;
        this.f49334f = t32.f49334f;
        this.f49335g = t32.f49335g;
        Map mapB = AbstractC5290c.b(t32.f49336h);
        if (mapB != null) {
            this.f49336h = mapB;
        }
        Map mapB2 = AbstractC5290c.b(t32.f49339k);
        if (mapB2 != null) {
            this.f49339k = mapB2;
        }
        this.f49341m = t32.f49341m;
        Map mapB3 = AbstractC5290c.b(t32.f49338j);
        if (mapB3 != null) {
            this.f49338j = mapB3;
        }
    }
}
