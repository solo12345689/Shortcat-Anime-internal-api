package io.sentry.rrweb;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.rrweb.b;
import io.sentry.rrweb.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends d implements B0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f51290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f51291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f51292g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        private void c(f fVar, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            d.a aVar = new d.a();
            interfaceC5218j1.x();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("pointerId")) {
                    fVar.f51289d = interfaceC5218j1.nextInt();
                } else if (strR0.equals("positions")) {
                    fVar.f51290e = interfaceC5218j1.T1(iLogger, new b.a());
                } else if (!aVar.a(fVar, strR0, interfaceC5218j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            fVar.l(map);
            interfaceC5218j1.I();
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            f fVar = new f();
            b.a aVar = new b.a();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("data")) {
                    c(fVar, interfaceC5218j1, iLogger);
                } else if (!aVar.a(fVar, strR0, interfaceC5218j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            fVar.o(map);
            interfaceC5218j1.I();
            return fVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements B0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f51294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f51295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f51296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f51297e;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements InterfaceC5267r0 {
            @Override // io.sentry.InterfaceC5267r0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
                String strR0;
                interfaceC5218j1.x();
                b bVar = new b();
                HashMap map = null;
                while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strR0 = interfaceC5218j1.r0();
                    strR0.getClass();
                    switch (strR0) {
                        case "x":
                            bVar.f51294b = interfaceC5218j1.nextFloat();
                            break;
                        case "y":
                            bVar.f51295c = interfaceC5218j1.nextFloat();
                            break;
                        case "id":
                            bVar.f51293a = interfaceC5218j1.nextInt();
                            break;
                        case "timeOffset":
                            bVar.f51296d = interfaceC5218j1.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            interfaceC5218j1.l1(iLogger, map, strR0);
                            break;
                    }
                }
                bVar.h(map);
                interfaceC5218j1.I();
                return bVar;
            }
        }

        public long e() {
            return this.f51296d;
        }

        public void f(int i10) {
            this.f51293a = i10;
        }

        public void g(long j10) {
            this.f51296d = j10;
        }

        public void h(Map map) {
            this.f51297e = map;
        }

        public void i(float f10) {
            this.f51294b = f10;
        }

        public void j(float f10) {
            this.f51295c = f10;
        }

        @Override // io.sentry.B0
        public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
            interfaceC5223k1.x();
            interfaceC5223k1.e(DiagnosticsEntry.ID_KEY).a(this.f51293a);
            interfaceC5223k1.e("x").c(this.f51294b);
            interfaceC5223k1.e("y").c(this.f51295c);
            interfaceC5223k1.e("timeOffset").a(this.f51296d);
            Map map = this.f51297e;
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = this.f51297e.get(str);
                    interfaceC5223k1.e(str);
                    interfaceC5223k1.j(iLogger, obj);
                }
            }
            interfaceC5223k1.I();
        }
    }

    public f() {
        super(d.b.TouchMove);
    }

    private void k(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        new d.c().a(this, interfaceC5223k1, iLogger);
        List list = this.f51290e;
        if (list != null && !list.isEmpty()) {
            interfaceC5223k1.e("positions").j(iLogger, this.f51290e);
        }
        interfaceC5223k1.e("pointerId").a(this.f51289d);
        Map map = this.f51292g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51292g.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public void l(Map map) {
        this.f51292g = map;
    }

    public void m(int i10) {
        this.f51289d = i10;
    }

    public void n(List list) {
        this.f51290e = list;
    }

    public void o(Map map) {
        this.f51291f = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        new b.C0804b().a(this, interfaceC5223k1, iLogger);
        interfaceC5223k1.e("data");
        k(interfaceC5223k1, iLogger);
        Map map = this.f51291f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51291f.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }
}
