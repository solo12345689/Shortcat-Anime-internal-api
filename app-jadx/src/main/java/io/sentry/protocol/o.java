package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.util.AbstractC5290c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements B0 {

    /* JADX INFO: renamed from: a */
    private String f51101a;

    /* JADX INFO: renamed from: b */
    private String f51102b;

    /* JADX INFO: renamed from: c */
    private String f51103c;

    /* JADX INFO: renamed from: d */
    private Object f51104d;

    /* JADX INFO: renamed from: e */
    private String f51105e;

    /* JADX INFO: renamed from: f */
    private Map f51106f;

    /* JADX INFO: renamed from: g */
    private Map f51107g;

    /* JADX INFO: renamed from: h */
    private Long f51108h;

    /* JADX INFO: renamed from: i */
    private Map f51109i;

    /* JADX INFO: renamed from: j */
    private String f51110j;

    /* JADX INFO: renamed from: k */
    private String f51111k;

    /* JADX INFO: renamed from: l */
    private Map f51112l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public o a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            o oVar = new o();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "fragment":
                        oVar.f51110j = interfaceC5218j1.i1();
                        break;
                    case "method":
                        oVar.f51102b = interfaceC5218j1.i1();
                        break;
                    case "env":
                        Map map = (Map) interfaceC5218j1.N1();
                        if (map == null) {
                            break;
                        } else {
                            oVar.f51107g = AbstractC5290c.b(map);
                            break;
                        }
                        break;
                    case "url":
                        oVar.f51101a = interfaceC5218j1.i1();
                        break;
                    case "data":
                        oVar.f51104d = interfaceC5218j1.N1();
                        break;
                    case "other":
                        Map map2 = (Map) interfaceC5218j1.N1();
                        if (map2 == null) {
                            break;
                        } else {
                            oVar.f51109i = AbstractC5290c.b(map2);
                            break;
                        }
                        break;
                    case "headers":
                        Map map3 = (Map) interfaceC5218j1.N1();
                        if (map3 == null) {
                            break;
                        } else {
                            oVar.f51106f = AbstractC5290c.b(map3);
                            break;
                        }
                        break;
                    case "cookies":
                        oVar.f51105e = interfaceC5218j1.i1();
                        break;
                    case "body_size":
                        oVar.f51108h = interfaceC5218j1.d1();
                        break;
                    case "query_string":
                        oVar.f51103c = interfaceC5218j1.i1();
                        break;
                    case "api_target":
                        oVar.f51111k = interfaceC5218j1.i1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            oVar.m(concurrentHashMap);
            interfaceC5218j1.I();
            return oVar;
        }
    }

    public o() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (io.sentry.util.w.a(this.f51101a, oVar.f51101a) && io.sentry.util.w.a(this.f51102b, oVar.f51102b) && io.sentry.util.w.a(this.f51103c, oVar.f51103c) && io.sentry.util.w.a(this.f51105e, oVar.f51105e) && io.sentry.util.w.a(this.f51106f, oVar.f51106f) && io.sentry.util.w.a(this.f51107g, oVar.f51107g) && io.sentry.util.w.a(this.f51108h, oVar.f51108h) && io.sentry.util.w.a(this.f51110j, oVar.f51110j) && io.sentry.util.w.a(this.f51111k, oVar.f51111k)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f51101a, this.f51102b, this.f51103c, this.f51105e, this.f51106f, this.f51107g, this.f51108h, this.f51110j, this.f51111k);
    }

    public Map l() {
        return this.f51106f;
    }

    public void m(Map map) {
        this.f51112l = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51101a != null) {
            interfaceC5223k1.e("url").f(this.f51101a);
        }
        if (this.f51102b != null) {
            interfaceC5223k1.e("method").f(this.f51102b);
        }
        if (this.f51103c != null) {
            interfaceC5223k1.e("query_string").f(this.f51103c);
        }
        if (this.f51104d != null) {
            interfaceC5223k1.e("data").j(iLogger, this.f51104d);
        }
        if (this.f51105e != null) {
            interfaceC5223k1.e("cookies").f(this.f51105e);
        }
        if (this.f51106f != null) {
            interfaceC5223k1.e("headers").j(iLogger, this.f51106f);
        }
        if (this.f51107g != null) {
            interfaceC5223k1.e("env").j(iLogger, this.f51107g);
        }
        if (this.f51109i != null) {
            interfaceC5223k1.e("other").j(iLogger, this.f51109i);
        }
        if (this.f51110j != null) {
            interfaceC5223k1.e("fragment").j(iLogger, this.f51110j);
        }
        if (this.f51108h != null) {
            interfaceC5223k1.e("body_size").j(iLogger, this.f51108h);
        }
        if (this.f51111k != null) {
            interfaceC5223k1.e("api_target").j(iLogger, this.f51111k);
        }
        Map map = this.f51112l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51112l.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public o(o oVar) {
        this.f51101a = oVar.f51101a;
        this.f51105e = oVar.f51105e;
        this.f51102b = oVar.f51102b;
        this.f51103c = oVar.f51103c;
        this.f51106f = AbstractC5290c.b(oVar.f51106f);
        this.f51107g = AbstractC5290c.b(oVar.f51107g);
        this.f51109i = AbstractC5290c.b(oVar.f51109i);
        this.f51112l = AbstractC5290c.b(oVar.f51112l);
        this.f51104d = oVar.f51104d;
        this.f51110j = oVar.f51110j;
        this.f51108h = oVar.f51108h;
        this.f51111k = oVar.f51111k;
    }
}
