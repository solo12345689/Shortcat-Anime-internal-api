package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.util.AbstractC5290c;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5251a implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f50993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f50996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f50997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f50998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f50999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f51000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f51001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f51002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f51003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f51004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map f51005n;

    /* JADX INFO: renamed from: io.sentry.protocol.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0800a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5251a a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            C5251a c5251a = new C5251a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "split_names":
                        List list = (List) interfaceC5218j1.N1();
                        if (list == null) {
                            break;
                        } else {
                            c5251a.u(list);
                            break;
                        }
                        break;
                    case "device_app_hash":
                        c5251a.f50994c = interfaceC5218j1.i1();
                        break;
                    case "start_type":
                        c5251a.f51001j = interfaceC5218j1.i1();
                        break;
                    case "view_names":
                        List list2 = (List) interfaceC5218j1.N1();
                        if (list2 == null) {
                            break;
                        } else {
                            c5251a.x(list2);
                            break;
                        }
                        break;
                    case "app_version":
                        c5251a.f50997f = interfaceC5218j1.i1();
                        break;
                    case "in_foreground":
                        c5251a.f51002k = interfaceC5218j1.w0();
                        break;
                    case "build_type":
                        c5251a.f50995d = interfaceC5218j1.i1();
                        break;
                    case "app_identifier":
                        c5251a.f50992a = interfaceC5218j1.i1();
                        break;
                    case "app_start_time":
                        c5251a.f50993b = interfaceC5218j1.u0(iLogger);
                        break;
                    case "permissions":
                        c5251a.f50999h = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                        break;
                    case "app_name":
                        c5251a.f50996e = interfaceC5218j1.i1();
                        break;
                    case "app_build":
                        c5251a.f50998g = interfaceC5218j1.i1();
                        break;
                    case "is_split_apks":
                        c5251a.f51003l = interfaceC5218j1.w0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            c5251a.w(concurrentHashMap);
            interfaceC5218j1.I();
            return c5251a;
        }
    }

    public C5251a() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5251a.class == obj.getClass()) {
            C5251a c5251a = (C5251a) obj;
            if (io.sentry.util.w.a(this.f50992a, c5251a.f50992a) && io.sentry.util.w.a(this.f50993b, c5251a.f50993b) && io.sentry.util.w.a(this.f50994c, c5251a.f50994c) && io.sentry.util.w.a(this.f50995d, c5251a.f50995d) && io.sentry.util.w.a(this.f50996e, c5251a.f50996e) && io.sentry.util.w.a(this.f50997f, c5251a.f50997f) && io.sentry.util.w.a(this.f50998g, c5251a.f50998g) && io.sentry.util.w.a(this.f50999h, c5251a.f50999h) && io.sentry.util.w.a(this.f51002k, c5251a.f51002k) && io.sentry.util.w.a(this.f51000i, c5251a.f51000i) && io.sentry.util.w.a(this.f51001j, c5251a.f51001j) && io.sentry.util.w.a(this.f51003l, c5251a.f51003l) && io.sentry.util.w.a(this.f51004m, c5251a.f51004m)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f50992a, this.f50993b, this.f50994c, this.f50995d, this.f50996e, this.f50997f, this.f50998g, this.f50999h, this.f51002k, this.f51000i, this.f51001j, this.f51003l, this.f51004m);
    }

    public Boolean l() {
        return this.f51002k;
    }

    public void m(String str) {
        this.f50998g = str;
    }

    public void n(String str) {
        this.f50992a = str;
    }

    public void o(String str) {
        this.f50996e = str;
    }

    public void p(Date date) {
        this.f50993b = date;
    }

    public void q(String str) {
        this.f50997f = str;
    }

    public void r(Boolean bool) {
        this.f51002k = bool;
    }

    public void s(Map map) {
        this.f50999h = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f50992a != null) {
            interfaceC5223k1.e("app_identifier").f(this.f50992a);
        }
        if (this.f50993b != null) {
            interfaceC5223k1.e("app_start_time").j(iLogger, this.f50993b);
        }
        if (this.f50994c != null) {
            interfaceC5223k1.e("device_app_hash").f(this.f50994c);
        }
        if (this.f50995d != null) {
            interfaceC5223k1.e("build_type").f(this.f50995d);
        }
        if (this.f50996e != null) {
            interfaceC5223k1.e("app_name").f(this.f50996e);
        }
        if (this.f50997f != null) {
            interfaceC5223k1.e("app_version").f(this.f50997f);
        }
        if (this.f50998g != null) {
            interfaceC5223k1.e("app_build").f(this.f50998g);
        }
        Map map = this.f50999h;
        if (map != null && !map.isEmpty()) {
            interfaceC5223k1.e("permissions").j(iLogger, this.f50999h);
        }
        if (this.f51002k != null) {
            interfaceC5223k1.e("in_foreground").k(this.f51002k);
        }
        if (this.f51000i != null) {
            interfaceC5223k1.e("view_names").j(iLogger, this.f51000i);
        }
        if (this.f51001j != null) {
            interfaceC5223k1.e("start_type").f(this.f51001j);
        }
        if (this.f51003l != null) {
            interfaceC5223k1.e("is_split_apks").k(this.f51003l);
        }
        List list = this.f51004m;
        if (list != null && !list.isEmpty()) {
            interfaceC5223k1.e("split_names").j(iLogger, this.f51004m);
        }
        Map map2 = this.f51005n;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51005n.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    public void t(Boolean bool) {
        this.f51003l = bool;
    }

    public void u(List list) {
        this.f51004m = list;
    }

    public void v(String str) {
        this.f51001j = str;
    }

    public void w(Map map) {
        this.f51005n = map;
    }

    public void x(List list) {
        this.f51000i = list;
    }

    C5251a(C5251a c5251a) {
        this.f50998g = c5251a.f50998g;
        this.f50992a = c5251a.f50992a;
        this.f50996e = c5251a.f50996e;
        this.f50993b = c5251a.f50993b;
        this.f50997f = c5251a.f50997f;
        this.f50995d = c5251a.f50995d;
        this.f50994c = c5251a.f50994c;
        this.f50999h = AbstractC5290c.b(c5251a.f50999h);
        this.f51002k = c5251a.f51002k;
        this.f51000i = AbstractC5290c.a(c5251a.f51000i);
        this.f51001j = c5251a.f51001j;
        this.f51003l = c5251a.f51003l;
        this.f51004m = c5251a.f51004m;
        this.f51005n = AbstractC5290c.b(c5251a.f51005n);
    }
}
