package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class K implements B0 {

    /* JADX INFO: renamed from: a */
    private String f50980a;

    /* JADX INFO: renamed from: b */
    private String f50981b;

    /* JADX INFO: renamed from: c */
    private String f50982c;

    /* JADX INFO: renamed from: d */
    private String f50983d;

    /* JADX INFO: renamed from: e */
    private Double f50984e;

    /* JADX INFO: renamed from: f */
    private Double f50985f;

    /* JADX INFO: renamed from: g */
    private Double f50986g;

    /* JADX INFO: renamed from: h */
    private Double f50987h;

    /* JADX INFO: renamed from: i */
    private String f50988i;

    /* JADX INFO: renamed from: j */
    private Double f50989j;

    /* JADX INFO: renamed from: k */
    private List f50990k;

    /* JADX INFO: renamed from: l */
    private Map f50991l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public K a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            K k10 = new K();
            interfaceC5218j1.x();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "rendering_system":
                        k10.f50980a = interfaceC5218j1.i1();
                        break;
                    case "identifier":
                        k10.f50982c = interfaceC5218j1.i1();
                        break;
                    case "height":
                        k10.f50985f = interfaceC5218j1.q0();
                        break;
                    case "x":
                        k10.f50986g = interfaceC5218j1.q0();
                        break;
                    case "y":
                        k10.f50987h = interfaceC5218j1.q0();
                        break;
                    case "tag":
                        k10.f50983d = interfaceC5218j1.i1();
                        break;
                    case "type":
                        k10.f50981b = interfaceC5218j1.i1();
                        break;
                    case "alpha":
                        k10.f50989j = interfaceC5218j1.q0();
                        break;
                    case "width":
                        k10.f50984e = interfaceC5218j1.q0();
                        break;
                    case "children":
                        k10.f50990k = interfaceC5218j1.T1(iLogger, this);
                        break;
                    case "visibility":
                        k10.f50988i = interfaceC5218j1.i1();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC5218j1.l1(iLogger, map, strR0);
                        break;
                }
            }
            interfaceC5218j1.I();
            k10.q(map);
            return k10;
        }
    }

    public void l(Double d10) {
        this.f50989j = d10;
    }

    public void m(List list) {
        this.f50990k = list;
    }

    public void n(Double d10) {
        this.f50985f = d10;
    }

    public void o(String str) {
        this.f50982c = str;
    }

    public void p(String str) {
        this.f50981b = str;
    }

    public void q(Map map) {
        this.f50991l = map;
    }

    public void r(String str) {
        this.f50988i = str;
    }

    public void s(Double d10) {
        this.f50984e = d10;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f50980a != null) {
            interfaceC5223k1.e("rendering_system").f(this.f50980a);
        }
        if (this.f50981b != null) {
            interfaceC5223k1.e("type").f(this.f50981b);
        }
        if (this.f50982c != null) {
            interfaceC5223k1.e("identifier").f(this.f50982c);
        }
        if (this.f50983d != null) {
            interfaceC5223k1.e("tag").f(this.f50983d);
        }
        if (this.f50984e != null) {
            interfaceC5223k1.e("width").i(this.f50984e);
        }
        if (this.f50985f != null) {
            interfaceC5223k1.e("height").i(this.f50985f);
        }
        if (this.f50986g != null) {
            interfaceC5223k1.e("x").i(this.f50986g);
        }
        if (this.f50987h != null) {
            interfaceC5223k1.e("y").i(this.f50987h);
        }
        if (this.f50988i != null) {
            interfaceC5223k1.e("visibility").f(this.f50988i);
        }
        if (this.f50989j != null) {
            interfaceC5223k1.e("alpha").i(this.f50989j);
        }
        List list = this.f50990k;
        if (list != null && !list.isEmpty()) {
            interfaceC5223k1.e("children").j(iLogger, this.f50990k);
        }
        Map map = this.f50991l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f50991l.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    public void t(Double d10) {
        this.f50986g = d10;
    }

    public void u(Double d10) {
        this.f50987h = d10;
    }
}
