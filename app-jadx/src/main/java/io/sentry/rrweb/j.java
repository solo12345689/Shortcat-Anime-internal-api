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
public final class j extends b implements B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f51318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f51319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f51320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f51321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f51324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f51325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f51326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f51327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f51328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map f51329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f51330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f51331r;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        private void c(j jVar, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("payload")) {
                    d(jVar, interfaceC5218j1, iLogger);
                } else if (strR0.equals("tag")) {
                    String strI1 = interfaceC5218j1.i1();
                    if (strI1 == null) {
                        strI1 = "";
                    }
                    jVar.f51316c = strI1;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            jVar.v(concurrentHashMap);
            interfaceC5218j1.I();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void d(j jVar, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                byte b10 = -1;
                switch (strR0.hashCode()) {
                    case -1992012396:
                        if (strR0.equals("duration")) {
                            b10 = 0;
                        }
                        break;
                    case -1627805778:
                        if (strR0.equals("segmentId")) {
                            b10 = 1;
                        }
                        break;
                    case -1221029593:
                        if (strR0.equals("height")) {
                            b10 = 2;
                        }
                        break;
                    case -410956671:
                        if (strR0.equals("container")) {
                            b10 = 3;
                        }
                        break;
                    case -296512606:
                        if (strR0.equals("frameCount")) {
                            b10 = 4;
                        }
                        break;
                    case 115029:
                        if (strR0.equals("top")) {
                            b10 = 5;
                        }
                        break;
                    case 3317767:
                        if (strR0.equals("left")) {
                            b10 = 6;
                        }
                        break;
                    case 3530753:
                        if (strR0.equals("size")) {
                            b10 = 7;
                        }
                        break;
                    case 113126854:
                        if (strR0.equals("width")) {
                            b10 = 8;
                        }
                        break;
                    case 545057773:
                        if (strR0.equals("frameRate")) {
                            b10 = 9;
                        }
                        break;
                    case 1711222099:
                        if (strR0.equals("encoding")) {
                            b10 = 10;
                        }
                        break;
                    case 2135109831:
                        if (strR0.equals("frameRateType")) {
                            b10 = 11;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        jVar.f51319f = interfaceC5218j1.nextLong();
                        break;
                    case 1:
                        jVar.f51317d = interfaceC5218j1.nextInt();
                        break;
                    case 2:
                        Integer numB1 = interfaceC5218j1.b1();
                        jVar.f51322i = numB1 != null ? numB1.intValue() : 0;
                        break;
                    case 3:
                        String strI1 = interfaceC5218j1.i1();
                        jVar.f51321h = strI1 != null ? strI1 : "";
                        break;
                    case 4:
                        Integer numB12 = interfaceC5218j1.b1();
                        jVar.f51324k = numB12 != null ? numB12.intValue() : 0;
                        break;
                    case 5:
                        Integer numB13 = interfaceC5218j1.b1();
                        jVar.f51328o = numB13 != null ? numB13.intValue() : 0;
                        break;
                    case 6:
                        Integer numB14 = interfaceC5218j1.b1();
                        jVar.f51327n = numB14 != null ? numB14.intValue() : 0;
                        break;
                    case 7:
                        Long lD1 = interfaceC5218j1.d1();
                        jVar.f51318e = lD1 == null ? 0L : lD1.longValue();
                        break;
                    case 8:
                        Integer numB15 = interfaceC5218j1.b1();
                        jVar.f51323j = numB15 != null ? numB15.intValue() : 0;
                        break;
                    case 9:
                        Integer numB16 = interfaceC5218j1.b1();
                        jVar.f51326m = numB16 != null ? numB16.intValue() : 0;
                        break;
                    case 10:
                        String strI12 = interfaceC5218j1.i1();
                        jVar.f51320g = strI12 != null ? strI12 : "";
                        break;
                    case 11:
                        String strI13 = interfaceC5218j1.i1();
                        jVar.f51325l = strI13 != null ? strI13 : "";
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            jVar.B(concurrentHashMap);
            interfaceC5218j1.I();
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            j jVar = new j();
            b.a aVar = new b.a();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("data")) {
                    c(jVar, interfaceC5218j1, iLogger);
                } else if (!aVar.a(jVar, strR0, interfaceC5218j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            jVar.F(map);
            interfaceC5218j1.I();
            return jVar;
        }
    }

    public j() {
        super(c.Custom);
        this.f51320g = "h264";
        this.f51321h = "mp4";
        this.f51325l = "constant";
        this.f51316c = "video";
    }

    private void t(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("tag").f(this.f51316c);
        interfaceC5223k1.e("payload");
        u(interfaceC5223k1, iLogger);
        Map map = this.f51331r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51331r.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    private void u(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("segmentId").a(this.f51317d);
        interfaceC5223k1.e("size").a(this.f51318e);
        interfaceC5223k1.e("duration").a(this.f51319f);
        interfaceC5223k1.e("encoding").f(this.f51320g);
        interfaceC5223k1.e("container").f(this.f51321h);
        interfaceC5223k1.e("height").a(this.f51322i);
        interfaceC5223k1.e("width").a(this.f51323j);
        interfaceC5223k1.e("frameCount").a(this.f51324k);
        interfaceC5223k1.e("frameRate").a(this.f51326m);
        interfaceC5223k1.e("frameRateType").f(this.f51325l);
        interfaceC5223k1.e("left").a(this.f51327n);
        interfaceC5223k1.e("top").a(this.f51328o);
        Map map = this.f51330q;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51330q.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public void A(int i10) {
        this.f51327n = i10;
    }

    public void B(Map map) {
        this.f51330q = map;
    }

    public void C(int i10) {
        this.f51317d = i10;
    }

    public void D(long j10) {
        this.f51318e = j10;
    }

    public void E(int i10) {
        this.f51328o = i10;
    }

    public void F(Map map) {
        this.f51329p = map;
    }

    public void G(int i10) {
        this.f51323j = i10;
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f51317d == jVar.f51317d && this.f51318e == jVar.f51318e && this.f51319f == jVar.f51319f && this.f51322i == jVar.f51322i && this.f51323j == jVar.f51323j && this.f51324k == jVar.f51324k && this.f51326m == jVar.f51326m && this.f51327n == jVar.f51327n && this.f51328o == jVar.f51328o && w.a(this.f51316c, jVar.f51316c) && w.a(this.f51320g, jVar.f51320g) && w.a(this.f51321h, jVar.f51321h) && w.a(this.f51325l, jVar.f51325l);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return w.b(Integer.valueOf(super.hashCode()), this.f51316c, Integer.valueOf(this.f51317d), Long.valueOf(this.f51318e), Long.valueOf(this.f51319f), this.f51320g, this.f51321h, Integer.valueOf(this.f51322i), Integer.valueOf(this.f51323j), Integer.valueOf(this.f51324k), this.f51325l, Integer.valueOf(this.f51326m), Integer.valueOf(this.f51327n), Integer.valueOf(this.f51328o));
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        new b.C0804b().a(this, interfaceC5223k1, iLogger);
        interfaceC5223k1.e("data");
        t(interfaceC5223k1, iLogger);
        Map map = this.f51329p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51329p.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public void v(Map map) {
        this.f51331r = map;
    }

    public void w(long j10) {
        this.f51319f = j10;
    }

    public void x(int i10) {
        this.f51324k = i10;
    }

    public void y(int i10) {
        this.f51326m = i10;
    }

    public void z(int i10) {
        this.f51322i = i10;
    }
}
