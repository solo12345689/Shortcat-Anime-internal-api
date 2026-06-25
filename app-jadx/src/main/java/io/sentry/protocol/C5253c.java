package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.C5273s1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.T3;
import io.sentry.protocol.C5251a;
import io.sentry.protocol.C5252b;
import io.sentry.protocol.C5255e;
import io.sentry.protocol.C5257g;
import io.sentry.protocol.C5258h;
import io.sentry.protocol.C5260j;
import io.sentry.protocol.F;
import io.sentry.protocol.n;
import io.sentry.protocol.p;
import io.sentry.protocol.z;
import io.sentry.util.C5288a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5253c implements B0 {

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap f51009a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    protected final C5288a f51010b = new C5288a();

    /* JADX INFO: renamed from: io.sentry.protocol.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public C5253c a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            C5253c c5253c = new C5253c();
            interfaceC5218j1.x();
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "device":
                        c5253c.q(new C5255e.a().a(interfaceC5218j1, iLogger));
                        break;
                    case "spring":
                        c5253c.y(new F.a().a(interfaceC5218j1, iLogger));
                        break;
                    case "response":
                        c5253c.w(new p.a().a(interfaceC5218j1, iLogger));
                        break;
                    case "profile":
                        c5253c.v(new C5273s1.a().a(interfaceC5218j1, iLogger));
                        break;
                    case "feedback":
                        c5253c.s(new C5258h.a().a(interfaceC5218j1, iLogger));
                        break;
                    case "os":
                        c5253c.u(new n.a().a(interfaceC5218j1, iLogger));
                        break;
                    case "app":
                        c5253c.o(new C5251a.C0800a().a(interfaceC5218j1, iLogger));
                        break;
                    case "gpu":
                        c5253c.t(new C5260j.a().a(interfaceC5218j1, iLogger));
                        break;
                    case "flags":
                        c5253c.r(new C5257g.a().a(interfaceC5218j1, iLogger));
                        break;
                    case "trace":
                        c5253c.z(new T3.a().a(interfaceC5218j1, iLogger));
                        break;
                    case "browser":
                        c5253c.p(new C5252b.a().a(interfaceC5218j1, iLogger));
                        break;
                    case "runtime":
                        c5253c.x(new z.a().a(interfaceC5218j1, iLogger));
                        break;
                    default:
                        Object objN1 = interfaceC5218j1.N1();
                        if (objN1 == null) {
                            break;
                        } else {
                            c5253c.l(strR0, objN1);
                            break;
                        }
                        break;
                }
            }
            interfaceC5218j1.I();
            return c5253c;
        }
    }

    public C5253c() {
    }

    private Object A(String str, Class cls) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f51009a.containsKey(obj);
    }

    public Set b() {
        return this.f51009a.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f51009a.get(obj);
    }

    public C5251a d() {
        return (C5251a) A("app", C5251a.class);
    }

    public C5255e e() {
        return (C5255e) A("device", C5255e.class);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5253c)) {
            return false;
        }
        return this.f51009a.equals(((C5253c) obj).f51009a);
    }

    public C5257g f() {
        return (C5257g) A("flags", C5257g.class);
    }

    public C5258h g() {
        return (C5258h) A("feedback", C5258h.class);
    }

    public n h() {
        return (n) A("os", n.class);
    }

    public int hashCode() {
        return this.f51009a.hashCode();
    }

    public z i() {
        return (z) A("runtime", z.class);
    }

    public T3 j() {
        return (T3) A("trace", T3.class);
    }

    public Enumeration k() {
        return this.f51009a.keys();
    }

    public Object l(String str, Object obj) {
        if (str == null) {
            return null;
        }
        return obj == null ? this.f51009a.remove(str) : this.f51009a.put(str, obj);
    }

    public void m(C5253c c5253c) {
        if (c5253c == null) {
            return;
        }
        this.f51009a.putAll(c5253c.f51009a);
    }

    public Object n(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f51009a.remove(obj);
    }

    public void o(C5251a c5251a) {
        l("app", c5251a);
    }

    public void p(C5252b c5252b) {
        l("browser", c5252b);
    }

    public void q(C5255e c5255e) {
        l("device", c5255e);
    }

    public void r(C5257g c5257g) {
        l("flags", c5257g);
    }

    public void s(C5258h c5258h) {
        l("feedback", c5258h);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        ArrayList<String> list = Collections.list(k());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                interfaceC5223k1.e(str).j(iLogger, objC);
            }
        }
        interfaceC5223k1.I();
    }

    public void t(C5260j c5260j) {
        l("gpu", c5260j);
    }

    public void u(n nVar) {
        l("os", nVar);
    }

    public void v(C5273s1 c5273s1) {
        io.sentry.util.w.c(c5273s1, "profileContext is required");
        l("profile", c5273s1);
    }

    public void w(p pVar) {
        InterfaceC5192e0 interfaceC5192e0A = this.f51010b.a();
        try {
            l("response", pVar);
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

    public void x(z zVar) {
        l("runtime", zVar);
    }

    public void y(F f10) {
        l("spring", f10);
    }

    public void z(T3 t32) {
        io.sentry.util.w.c(t32, "traceContext is required");
        l("trace", t32);
    }

    public C5253c(C5253c c5253c) {
        for (Map.Entry entry : c5253c.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C5251a)) {
                    o(new C5251a((C5251a) value));
                } else if ("browser".equals(entry.getKey()) && (value instanceof C5252b)) {
                    p(new C5252b((C5252b) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof C5255e)) {
                    q(new C5255e((C5255e) value));
                } else if ("os".equals(entry.getKey()) && (value instanceof n)) {
                    u(new n((n) value));
                } else if ("runtime".equals(entry.getKey()) && (value instanceof z)) {
                    x(new z((z) value));
                } else if ("feedback".equals(entry.getKey()) && (value instanceof C5258h)) {
                    s(new C5258h((C5258h) value));
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C5260j)) {
                    t(new C5260j((C5260j) value));
                } else if ("trace".equals(entry.getKey()) && (value instanceof T3)) {
                    z(new T3((T3) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof C5273s1)) {
                    v(new C5273s1((C5273s1) value));
                } else if ("response".equals(entry.getKey()) && (value instanceof p)) {
                    w(new p((p) value));
                } else if ("spring".equals(entry.getKey()) && (value instanceof F)) {
                    y(new F((F) value));
                } else {
                    l((String) entry.getKey(), value);
                }
            }
        }
    }
}
