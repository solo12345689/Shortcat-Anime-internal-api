package io.sentry.rrweb;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.B0;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.rrweb.b;
import io.sentry.util.AbstractC5290c;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends b implements B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f51269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f51271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f51272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private EnumC5215i3 f51273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f51274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f51275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f51276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f51277l;

    /* JADX INFO: renamed from: io.sentry.rrweb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0803a implements InterfaceC5267r0 {
        private void c(a aVar, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("payload")) {
                    d(aVar, interfaceC5218j1, iLogger);
                } else if (strR0.equals("tag")) {
                    String strI1 = interfaceC5218j1.i1();
                    if (strI1 == null) {
                        strI1 = "";
                    }
                    aVar.f51268c = strI1;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            aVar.v(concurrentHashMap);
            interfaceC5218j1.I();
        }

        private void d(a aVar, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "data":
                        Map mapB = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                        if (mapB == null) {
                            break;
                        } else {
                            aVar.f51274i = mapB;
                            break;
                        }
                        break;
                    case "type":
                        aVar.f51270e = interfaceC5218j1.i1();
                        break;
                    case "category":
                        aVar.f51271f = interfaceC5218j1.i1();
                        break;
                    case "timestamp":
                        aVar.f51269d = interfaceC5218j1.nextDouble();
                        break;
                    case "level":
                        try {
                            aVar.f51273h = new EnumC5215i3.a().a(interfaceC5218j1, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.a(EnumC5215i3.DEBUG, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        aVar.f51272g = interfaceC5218j1.i1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            aVar.y(concurrentHashMap);
            interfaceC5218j1.I();
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            a aVar = new a();
            b.a aVar2 = new b.a();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("data")) {
                    c(aVar, interfaceC5218j1, iLogger);
                } else if (!aVar2.a(aVar, strR0, interfaceC5218j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            aVar.z(map);
            interfaceC5218j1.I();
            return aVar;
        }
    }

    public a() {
        super(c.Custom);
        this.f51268c = "breadcrumb";
    }

    private void p(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("tag").f(this.f51268c);
        interfaceC5223k1.e("payload");
        q(interfaceC5223k1, iLogger);
        Map map = this.f51277l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51277l.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    private void q(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51270e != null) {
            interfaceC5223k1.e("type").f(this.f51270e);
        }
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, BigDecimal.valueOf(this.f51269d));
        if (this.f51271f != null) {
            interfaceC5223k1.e("category").f(this.f51271f);
        }
        if (this.f51272g != null) {
            interfaceC5223k1.e("message").f(this.f51272g);
        }
        if (this.f51273h != null) {
            interfaceC5223k1.e("level").j(iLogger, this.f51273h);
        }
        if (this.f51274i != null) {
            interfaceC5223k1.e("data").j(iLogger, this.f51274i);
        }
        Map map = this.f51276k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51276k.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public String n() {
        return this.f51271f;
    }

    public Map o() {
        return this.f51274i;
    }

    public void r(double d10) {
        this.f51269d = d10;
    }

    public void s(String str) {
        this.f51270e = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        new b.C0804b().a(this, interfaceC5223k1, iLogger);
        interfaceC5223k1.e("data");
        p(interfaceC5223k1, iLogger);
        Map map = this.f51275j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51275j.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public void t(String str) {
        this.f51271f = str;
    }

    public void u(Map map) {
        this.f51274i = map == null ? null : new ConcurrentHashMap(map);
    }

    public void v(Map map) {
        this.f51277l = map;
    }

    public void w(EnumC5215i3 enumC5215i3) {
        this.f51273h = enumC5215i3;
    }

    public void x(String str) {
        this.f51272g = str;
    }

    public void y(Map map) {
        this.f51276k = map;
    }

    public void z(Map map) {
        this.f51275j = map;
    }
}
