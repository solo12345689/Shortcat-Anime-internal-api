package io.sentry.rrweb;

import io.sentry.B0;
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
public final class i extends b implements B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f51308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f51310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f51311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f51312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f51313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f51314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f51315k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        private void c(i iVar, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("payload")) {
                    d(iVar, interfaceC5218j1, iLogger);
                } else if (strR0.equals("tag")) {
                    String strI1 = interfaceC5218j1.i1();
                    if (strI1 == null) {
                        strI1 = "";
                    }
                    iVar.f51307c = strI1;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            iVar.p(concurrentHashMap);
            interfaceC5218j1.I();
        }

        private void d(i iVar, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "description":
                        iVar.f51309e = interfaceC5218j1.i1();
                        break;
                    case "endTimestamp":
                        iVar.f51311g = interfaceC5218j1.nextDouble();
                        break;
                    case "startTimestamp":
                        iVar.f51310f = interfaceC5218j1.nextDouble();
                        break;
                    case "op":
                        iVar.f51308d = interfaceC5218j1.i1();
                        break;
                    case "data":
                        Map mapB = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                        if (mapB == null) {
                            break;
                        } else {
                            iVar.f51312h = mapB;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            iVar.t(concurrentHashMap);
            interfaceC5218j1.I();
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            i iVar = new i();
            b.a aVar = new b.a();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("data")) {
                    c(iVar, interfaceC5218j1, iLogger);
                } else if (!aVar.a(iVar, strR0, interfaceC5218j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            iVar.v(map);
            interfaceC5218j1.I();
            return iVar;
        }
    }

    public i() {
        super(c.Custom);
        this.f51307c = "performanceSpan";
    }

    private void m(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("tag").f(this.f51307c);
        interfaceC5223k1.e("payload");
        n(interfaceC5223k1, iLogger);
        Map map = this.f51315k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51315k.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    private void n(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51308d != null) {
            interfaceC5223k1.e("op").f(this.f51308d);
        }
        if (this.f51309e != null) {
            interfaceC5223k1.e(com.amazon.a.a.o.b.f34645c).f(this.f51309e);
        }
        interfaceC5223k1.e("startTimestamp").j(iLogger, BigDecimal.valueOf(this.f51310f));
        interfaceC5223k1.e("endTimestamp").j(iLogger, BigDecimal.valueOf(this.f51311g));
        if (this.f51312h != null) {
            interfaceC5223k1.e("data").j(iLogger, this.f51312h);
        }
        Map map = this.f51314j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51314j.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public void o(Map map) {
        this.f51312h = map == null ? null : new ConcurrentHashMap(map);
    }

    public void p(Map map) {
        this.f51315k = map;
    }

    public void q(String str) {
        this.f51309e = str;
    }

    public void r(double d10) {
        this.f51311g = d10;
    }

    public void s(String str) {
        this.f51308d = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        new b.C0804b().a(this, interfaceC5223k1, iLogger);
        interfaceC5223k1.e("data");
        m(interfaceC5223k1, iLogger);
        Map map = this.f51313i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51313i.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public void t(Map map) {
        this.f51314j = map;
    }

    public void u(double d10) {
        this.f51310f = d10;
    }

    public void v(Map map) {
        this.f51313i = map;
    }
}
