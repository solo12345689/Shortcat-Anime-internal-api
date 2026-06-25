package io.sentry.rrweb;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.rrweb.b;
import io.sentry.util.w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends b implements B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f51301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f51302g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        private void c(g gVar, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "height":
                        Integer numB1 = interfaceC5218j1.b1();
                        gVar.f51299d = numB1 != null ? numB1.intValue() : 0;
                        break;
                    case "href":
                        String strI1 = interfaceC5218j1.i1();
                        if (strI1 == null) {
                            strI1 = "";
                        }
                        gVar.f51298c = strI1;
                        break;
                    case "width":
                        Integer numB12 = interfaceC5218j1.b1();
                        gVar.f51300e = numB12 != null ? numB12.intValue() : 0;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            gVar.k(concurrentHashMap);
            interfaceC5218j1.I();
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            g gVar = new g();
            b.a aVar = new b.a();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("data")) {
                    c(gVar, interfaceC5218j1, iLogger);
                } else if (!aVar.a(gVar, strR0, interfaceC5218j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            gVar.m(map);
            interfaceC5218j1.I();
            return gVar;
        }
    }

    public g() {
        super(c.Meta);
        this.f51298c = "";
    }

    private void j(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("href").f(this.f51298c);
        interfaceC5223k1.e("height").a(this.f51299d);
        interfaceC5223k1.e("width").a(this.f51300e);
        Map map = this.f51301f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51301f.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f51299d == gVar.f51299d && this.f51300e == gVar.f51300e && w.a(this.f51298c, gVar.f51298c);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return w.b(Integer.valueOf(super.hashCode()), this.f51298c, Integer.valueOf(this.f51299d), Integer.valueOf(this.f51300e));
    }

    public void k(Map map) {
        this.f51302g = map;
    }

    public void l(int i10) {
        this.f51299d = i10;
    }

    public void m(Map map) {
        this.f51301f = map;
    }

    public void n(int i10) {
        this.f51300e = i10;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        new b.C0804b().a(this, interfaceC5223k1, iLogger);
        interfaceC5223k1.e("data");
        j(interfaceC5223k1, iLogger);
        interfaceC5223k1.I();
    }
}
