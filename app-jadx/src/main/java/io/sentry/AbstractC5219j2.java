package io.sentry;

import io.sentry.C5191e;
import io.sentry.protocol.C5253c;
import io.sentry.protocol.C5254d;
import io.sentry.protocol.I;
import io.sentry.protocol.o;
import io.sentry.protocol.r;
import io.sentry.protocol.x;
import io.sentry.util.AbstractC5290c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.j2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5219j2 {

    /* JADX INFO: renamed from: a */
    private io.sentry.protocol.x f50771a;

    /* JADX INFO: renamed from: b */
    private final C5253c f50772b;

    /* JADX INFO: renamed from: c */
    private io.sentry.protocol.r f50773c;

    /* JADX INFO: renamed from: d */
    private io.sentry.protocol.o f50774d;

    /* JADX INFO: renamed from: e */
    private Map f50775e;

    /* JADX INFO: renamed from: f */
    private String f50776f;

    /* JADX INFO: renamed from: g */
    private String f50777g;

    /* JADX INFO: renamed from: h */
    private String f50778h;

    /* JADX INFO: renamed from: i */
    private io.sentry.protocol.I f50779i;

    /* JADX INFO: renamed from: j */
    protected transient Throwable f50780j;

    /* JADX INFO: renamed from: k */
    private String f50781k;

    /* JADX INFO: renamed from: l */
    private String f50782l;

    /* JADX INFO: renamed from: m */
    private List f50783m;

    /* JADX INFO: renamed from: n */
    private C5254d f50784n;

    /* JADX INFO: renamed from: o */
    private Map f50785o;

    /* JADX INFO: renamed from: io.sentry.j2$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public boolean a(AbstractC5219j2 abstractC5219j2, String str, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            str.getClass();
            switch (str) {
                case "debug_meta":
                    abstractC5219j2.f50784n = (C5254d) interfaceC5218j1.C0(iLogger, new C5254d.a());
                    return true;
                case "server_name":
                    abstractC5219j2.f50781k = interfaceC5218j1.i1();
                    return true;
                case "contexts":
                    abstractC5219j2.f50772b.m(new C5253c.a().a(interfaceC5218j1, iLogger));
                    return true;
                case "environment":
                    abstractC5219j2.f50777g = interfaceC5218j1.i1();
                    return true;
                case "breadcrumbs":
                    abstractC5219j2.f50783m = interfaceC5218j1.T1(iLogger, new C5191e.a());
                    return true;
                case "sdk":
                    abstractC5219j2.f50773c = (io.sentry.protocol.r) interfaceC5218j1.C0(iLogger, new r.a());
                    return true;
                case "dist":
                    abstractC5219j2.f50782l = interfaceC5218j1.i1();
                    return true;
                case "tags":
                    abstractC5219j2.f50775e = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                    return true;
                case "user":
                    abstractC5219j2.f50779i = (io.sentry.protocol.I) interfaceC5218j1.C0(iLogger, new I.a());
                    return true;
                case "extra":
                    abstractC5219j2.f50785o = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                    return true;
                case "event_id":
                    abstractC5219j2.f50771a = (io.sentry.protocol.x) interfaceC5218j1.C0(iLogger, new x.a());
                    return true;
                case "release":
                    abstractC5219j2.f50776f = interfaceC5218j1.i1();
                    return true;
                case "request":
                    abstractC5219j2.f50774d = (io.sentry.protocol.o) interfaceC5218j1.C0(iLogger, new o.a());
                    return true;
                case "platform":
                    abstractC5219j2.f50778h = interfaceC5218j1.i1();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.j2$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public void a(AbstractC5219j2 abstractC5219j2, InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
            if (abstractC5219j2.f50771a != null) {
                interfaceC5223k1.e("event_id").j(iLogger, abstractC5219j2.f50771a);
            }
            interfaceC5223k1.e("contexts").j(iLogger, abstractC5219j2.f50772b);
            if (abstractC5219j2.f50773c != null) {
                interfaceC5223k1.e("sdk").j(iLogger, abstractC5219j2.f50773c);
            }
            if (abstractC5219j2.f50774d != null) {
                interfaceC5223k1.e("request").j(iLogger, abstractC5219j2.f50774d);
            }
            if (abstractC5219j2.f50775e != null && !abstractC5219j2.f50775e.isEmpty()) {
                interfaceC5223k1.e("tags").j(iLogger, abstractC5219j2.f50775e);
            }
            if (abstractC5219j2.f50776f != null) {
                interfaceC5223k1.e("release").f(abstractC5219j2.f50776f);
            }
            if (abstractC5219j2.f50777g != null) {
                interfaceC5223k1.e("environment").f(abstractC5219j2.f50777g);
            }
            if (abstractC5219j2.f50778h != null) {
                interfaceC5223k1.e("platform").f(abstractC5219j2.f50778h);
            }
            if (abstractC5219j2.f50779i != null) {
                interfaceC5223k1.e("user").j(iLogger, abstractC5219j2.f50779i);
            }
            if (abstractC5219j2.f50781k != null) {
                interfaceC5223k1.e("server_name").f(abstractC5219j2.f50781k);
            }
            if (abstractC5219j2.f50782l != null) {
                interfaceC5223k1.e("dist").f(abstractC5219j2.f50782l);
            }
            if (abstractC5219j2.f50783m != null && !abstractC5219j2.f50783m.isEmpty()) {
                interfaceC5223k1.e("breadcrumbs").j(iLogger, abstractC5219j2.f50783m);
            }
            if (abstractC5219j2.f50784n != null) {
                interfaceC5223k1.e("debug_meta").j(iLogger, abstractC5219j2.f50784n);
            }
            if (abstractC5219j2.f50785o == null || abstractC5219j2.f50785o.isEmpty()) {
                return;
            }
            interfaceC5223k1.e("extra").j(iLogger, abstractC5219j2.f50785o);
        }
    }

    protected AbstractC5219j2(io.sentry.protocol.x xVar) {
        this.f50772b = new C5253c();
        this.f50771a = xVar;
    }

    public List B() {
        return this.f50783m;
    }

    public C5253c C() {
        return this.f50772b;
    }

    public C5254d D() {
        return this.f50784n;
    }

    public String E() {
        return this.f50782l;
    }

    public String F() {
        return this.f50777g;
    }

    public io.sentry.protocol.x G() {
        return this.f50771a;
    }

    public Map H() {
        return this.f50785o;
    }

    public String I() {
        return this.f50778h;
    }

    public String J() {
        return this.f50776f;
    }

    public io.sentry.protocol.o K() {
        return this.f50774d;
    }

    public io.sentry.protocol.r L() {
        return this.f50773c;
    }

    public String M() {
        return this.f50781k;
    }

    public Map N() {
        return this.f50775e;
    }

    public Throwable O() {
        Throwable th2 = this.f50780j;
        return th2 instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th2).c() : th2;
    }

    public Throwable P() {
        return this.f50780j;
    }

    public io.sentry.protocol.I Q() {
        return this.f50779i;
    }

    public void R(String str) {
        Map map = this.f50775e;
        if (map == null || str == null) {
            return;
        }
        map.remove(str);
    }

    public void S(List list) {
        this.f50783m = AbstractC5290c.a(list);
    }

    public void T(C5254d c5254d) {
        this.f50784n = c5254d;
    }

    public void U(String str) {
        this.f50782l = str;
    }

    public void V(String str) {
        this.f50777g = str;
    }

    public void W(io.sentry.protocol.x xVar) {
        this.f50771a = xVar;
    }

    public void X(Map map) {
        this.f50785o = AbstractC5290c.c(map);
    }

    public void Y(String str) {
        this.f50778h = str;
    }

    public void Z(String str) {
        this.f50776f = str;
    }

    public void a0(io.sentry.protocol.o oVar) {
        this.f50774d = oVar;
    }

    public void b0(io.sentry.protocol.r rVar) {
        this.f50773c = rVar;
    }

    public void c0(String str) {
        this.f50781k = str;
    }

    public void d0(String str, String str2) {
        if (this.f50775e == null) {
            this.f50775e = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 == null) {
            R(str);
        } else {
            this.f50775e.put(str, str2);
        }
    }

    public void e0(Map map) {
        this.f50775e = AbstractC5290c.c(map);
    }

    public void f0(io.sentry.protocol.I i10) {
        this.f50779i = i10;
    }

    protected AbstractC5219j2() {
        this(new io.sentry.protocol.x());
    }
}
