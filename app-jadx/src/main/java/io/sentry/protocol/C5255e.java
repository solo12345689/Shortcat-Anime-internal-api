package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.util.AbstractC5290c;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5255e implements B0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f51014A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f51015B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private String f51016C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Float f51017D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Integer f51018E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Double f51019F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private String f51020G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private String f51021H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Map f51022I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f51026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f51028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f51029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Float f51030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f51031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f51032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f51033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f51034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Long f51035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Long f51036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Long f51037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f51038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Long f51039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Long f51040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Long f51041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Long f51042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Integer f51043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f51044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Float f51045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Integer f51046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Date f51047y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private TimeZone f51048z;

    /* JADX INFO: renamed from: io.sentry.protocol.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5255e a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            C5255e c5255e = new C5255e();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "timezone":
                        c5255e.f51048z = interfaceC5218j1.c0(iLogger);
                        break;
                    case "boot_time":
                        if (interfaceC5218j1.peek() != io.sentry.vendor.gson.stream.b.STRING) {
                            break;
                        } else {
                            c5255e.f51047y = interfaceC5218j1.u0(iLogger);
                            break;
                        }
                        break;
                    case "simulator":
                        c5255e.f51034l = interfaceC5218j1.w0();
                        break;
                    case "manufacturer":
                        c5255e.f51024b = interfaceC5218j1.i1();
                        break;
                    case "processor_count":
                        c5255e.f51018E = interfaceC5218j1.b1();
                        break;
                    case "orientation":
                        c5255e.f51033k = (b) interfaceC5218j1.C0(iLogger, new b.a());
                        break;
                    case "battery_temperature":
                        c5255e.f51017D = interfaceC5218j1.H1();
                        break;
                    case "family":
                        c5255e.f51026d = interfaceC5218j1.i1();
                        break;
                    case "locale":
                        c5255e.f51015B = interfaceC5218j1.i1();
                        break;
                    case "online":
                        c5255e.f51032j = interfaceC5218j1.w0();
                        break;
                    case "battery_level":
                        c5255e.f51030h = interfaceC5218j1.H1();
                        break;
                    case "model_id":
                        c5255e.f51028f = interfaceC5218j1.i1();
                        break;
                    case "screen_density":
                        c5255e.f51045w = interfaceC5218j1.H1();
                        break;
                    case "screen_dpi":
                        c5255e.f51046x = interfaceC5218j1.b1();
                        break;
                    case "free_memory":
                        c5255e.f51036n = interfaceC5218j1.d1();
                        break;
                    case "id":
                        c5255e.f51014A = interfaceC5218j1.i1();
                        break;
                    case "name":
                        c5255e.f51023a = interfaceC5218j1.i1();
                        break;
                    case "low_memory":
                        c5255e.f51038p = interfaceC5218j1.w0();
                        break;
                    case "archs":
                        List list = (List) interfaceC5218j1.N1();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            c5255e.f51029g = strArr;
                            break;
                        }
                        break;
                    case "brand":
                        c5255e.f51025c = interfaceC5218j1.i1();
                        break;
                    case "model":
                        c5255e.f51027e = interfaceC5218j1.i1();
                        break;
                    case "cpu_description":
                        c5255e.f51020G = interfaceC5218j1.i1();
                        break;
                    case "processor_frequency":
                        c5255e.f51019F = interfaceC5218j1.q0();
                        break;
                    case "connection_type":
                        c5255e.f51016C = interfaceC5218j1.i1();
                        break;
                    case "chipset":
                        c5255e.f51021H = interfaceC5218j1.i1();
                        break;
                    case "screen_width_pixels":
                        c5255e.f51043u = interfaceC5218j1.b1();
                        break;
                    case "external_storage_size":
                        c5255e.f51041s = interfaceC5218j1.d1();
                        break;
                    case "storage_size":
                        c5255e.f51039q = interfaceC5218j1.d1();
                        break;
                    case "usable_memory":
                        c5255e.f51037o = interfaceC5218j1.d1();
                        break;
                    case "memory_size":
                        c5255e.f51035m = interfaceC5218j1.d1();
                        break;
                    case "charging":
                        c5255e.f51031i = interfaceC5218j1.w0();
                        break;
                    case "external_free_storage":
                        c5255e.f51042t = interfaceC5218j1.d1();
                        break;
                    case "free_storage":
                        c5255e.f51040r = interfaceC5218j1.d1();
                        break;
                    case "screen_height_pixels":
                        c5255e.f51044v = interfaceC5218j1.b1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            c5255e.q0(concurrentHashMap);
            interfaceC5218j1.I();
            return c5255e;
        }
    }

    /* JADX INFO: renamed from: io.sentry.protocol.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b implements B0 {
        PORTRAIT,
        LANDSCAPE;

        /* JADX INFO: renamed from: io.sentry.protocol.e$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements InterfaceC5267r0 {
            @Override // io.sentry.InterfaceC5267r0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
                return b.valueOf(interfaceC5218j1.X0().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.B0
        public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
            interfaceC5223k1.f(toString().toLowerCase(Locale.ROOT));
        }
    }

    public C5255e() {
    }

    public String I() {
        return this.f51016C;
    }

    public String J() {
        return this.f51014A;
    }

    public String K() {
        return this.f51015B;
    }

    public void L(String[] strArr) {
        this.f51029g = strArr;
    }

    public void M(Float f10) {
        this.f51030h = f10;
    }

    public void N(Float f10) {
        this.f51017D = f10;
    }

    public void O(Date date) {
        this.f51047y = date;
    }

    public void P(String str) {
        this.f51025c = str;
    }

    public void Q(Boolean bool) {
        this.f51031i = bool;
    }

    public void R(String str) {
        this.f51021H = str;
    }

    public void S(String str) {
        this.f51016C = str;
    }

    public void T(Long l10) {
        this.f51042t = l10;
    }

    public void U(Long l10) {
        this.f51041s = l10;
    }

    public void V(String str) {
        this.f51026d = str;
    }

    public void W(Long l10) {
        this.f51036n = l10;
    }

    public void X(Long l10) {
        this.f51040r = l10;
    }

    public void Y(String str) {
        this.f51014A = str;
    }

    public void Z(String str) {
        this.f51015B = str;
    }

    public void a0(Boolean bool) {
        this.f51038p = bool;
    }

    public void b0(String str) {
        this.f51024b = str;
    }

    public void c0(Long l10) {
        this.f51035m = l10;
    }

    public void d0(String str) {
        this.f51027e = str;
    }

    public void e0(String str) {
        this.f51028f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5255e.class == obj.getClass()) {
            C5255e c5255e = (C5255e) obj;
            if (io.sentry.util.w.a(this.f51023a, c5255e.f51023a) && io.sentry.util.w.a(this.f51024b, c5255e.f51024b) && io.sentry.util.w.a(this.f51025c, c5255e.f51025c) && io.sentry.util.w.a(this.f51026d, c5255e.f51026d) && io.sentry.util.w.a(this.f51027e, c5255e.f51027e) && io.sentry.util.w.a(this.f51028f, c5255e.f51028f) && Arrays.equals(this.f51029g, c5255e.f51029g) && io.sentry.util.w.a(this.f51030h, c5255e.f51030h) && io.sentry.util.w.a(this.f51031i, c5255e.f51031i) && io.sentry.util.w.a(this.f51032j, c5255e.f51032j) && this.f51033k == c5255e.f51033k && io.sentry.util.w.a(this.f51034l, c5255e.f51034l) && io.sentry.util.w.a(this.f51035m, c5255e.f51035m) && io.sentry.util.w.a(this.f51036n, c5255e.f51036n) && io.sentry.util.w.a(this.f51037o, c5255e.f51037o) && io.sentry.util.w.a(this.f51038p, c5255e.f51038p) && io.sentry.util.w.a(this.f51039q, c5255e.f51039q) && io.sentry.util.w.a(this.f51040r, c5255e.f51040r) && io.sentry.util.w.a(this.f51041s, c5255e.f51041s) && io.sentry.util.w.a(this.f51042t, c5255e.f51042t) && io.sentry.util.w.a(this.f51043u, c5255e.f51043u) && io.sentry.util.w.a(this.f51044v, c5255e.f51044v) && io.sentry.util.w.a(this.f51045w, c5255e.f51045w) && io.sentry.util.w.a(this.f51046x, c5255e.f51046x) && io.sentry.util.w.a(this.f51047y, c5255e.f51047y) && io.sentry.util.w.a(this.f51014A, c5255e.f51014A) && io.sentry.util.w.a(this.f51015B, c5255e.f51015B) && io.sentry.util.w.a(this.f51016C, c5255e.f51016C) && io.sentry.util.w.a(this.f51017D, c5255e.f51017D) && io.sentry.util.w.a(this.f51018E, c5255e.f51018E) && io.sentry.util.w.a(this.f51019F, c5255e.f51019F) && io.sentry.util.w.a(this.f51020G, c5255e.f51020G) && io.sentry.util.w.a(this.f51021H, c5255e.f51021H)) {
                return true;
            }
        }
        return false;
    }

    public void f0(Boolean bool) {
        this.f51032j = bool;
    }

    public void g0(b bVar) {
        this.f51033k = bVar;
    }

    public void h0(Integer num) {
        this.f51018E = num;
    }

    public int hashCode() {
        return (io.sentry.util.w.b(this.f51023a, this.f51024b, this.f51025c, this.f51026d, this.f51027e, this.f51028f, this.f51030h, this.f51031i, this.f51032j, this.f51033k, this.f51034l, this.f51035m, this.f51036n, this.f51037o, this.f51038p, this.f51039q, this.f51040r, this.f51041s, this.f51042t, this.f51043u, this.f51044v, this.f51045w, this.f51046x, this.f51047y, this.f51048z, this.f51014A, this.f51015B, this.f51016C, this.f51017D, this.f51018E, this.f51019F, this.f51020G, this.f51021H) * 31) + Arrays.hashCode(this.f51029g);
    }

    public void i0(Double d10) {
        this.f51019F = d10;
    }

    public void j0(Float f10) {
        this.f51045w = f10;
    }

    public void k0(Integer num) {
        this.f51046x = num;
    }

    public void l0(Integer num) {
        this.f51044v = num;
    }

    public void m0(Integer num) {
        this.f51043u = num;
    }

    public void n0(Boolean bool) {
        this.f51034l = bool;
    }

    public void o0(Long l10) {
        this.f51039q = l10;
    }

    public void p0(TimeZone timeZone) {
        this.f51048z = timeZone;
    }

    public void q0(Map map) {
        this.f51022I = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51023a != null) {
            interfaceC5223k1.e("name").f(this.f51023a);
        }
        if (this.f51024b != null) {
            interfaceC5223k1.e("manufacturer").f(this.f51024b);
        }
        if (this.f51025c != null) {
            interfaceC5223k1.e("brand").f(this.f51025c);
        }
        if (this.f51026d != null) {
            interfaceC5223k1.e("family").f(this.f51026d);
        }
        if (this.f51027e != null) {
            interfaceC5223k1.e("model").f(this.f51027e);
        }
        if (this.f51028f != null) {
            interfaceC5223k1.e("model_id").f(this.f51028f);
        }
        if (this.f51029g != null) {
            interfaceC5223k1.e("archs").j(iLogger, this.f51029g);
        }
        if (this.f51030h != null) {
            interfaceC5223k1.e("battery_level").i(this.f51030h);
        }
        if (this.f51031i != null) {
            interfaceC5223k1.e("charging").k(this.f51031i);
        }
        if (this.f51032j != null) {
            interfaceC5223k1.e("online").k(this.f51032j);
        }
        if (this.f51033k != null) {
            interfaceC5223k1.e("orientation").j(iLogger, this.f51033k);
        }
        if (this.f51034l != null) {
            interfaceC5223k1.e("simulator").k(this.f51034l);
        }
        if (this.f51035m != null) {
            interfaceC5223k1.e("memory_size").i(this.f51035m);
        }
        if (this.f51036n != null) {
            interfaceC5223k1.e("free_memory").i(this.f51036n);
        }
        if (this.f51037o != null) {
            interfaceC5223k1.e("usable_memory").i(this.f51037o);
        }
        if (this.f51038p != null) {
            interfaceC5223k1.e("low_memory").k(this.f51038p);
        }
        if (this.f51039q != null) {
            interfaceC5223k1.e("storage_size").i(this.f51039q);
        }
        if (this.f51040r != null) {
            interfaceC5223k1.e("free_storage").i(this.f51040r);
        }
        if (this.f51041s != null) {
            interfaceC5223k1.e("external_storage_size").i(this.f51041s);
        }
        if (this.f51042t != null) {
            interfaceC5223k1.e("external_free_storage").i(this.f51042t);
        }
        if (this.f51043u != null) {
            interfaceC5223k1.e("screen_width_pixels").i(this.f51043u);
        }
        if (this.f51044v != null) {
            interfaceC5223k1.e("screen_height_pixels").i(this.f51044v);
        }
        if (this.f51045w != null) {
            interfaceC5223k1.e("screen_density").i(this.f51045w);
        }
        if (this.f51046x != null) {
            interfaceC5223k1.e("screen_dpi").i(this.f51046x);
        }
        if (this.f51047y != null) {
            interfaceC5223k1.e("boot_time").j(iLogger, this.f51047y);
        }
        if (this.f51048z != null) {
            interfaceC5223k1.e("timezone").j(iLogger, this.f51048z);
        }
        if (this.f51014A != null) {
            interfaceC5223k1.e(DiagnosticsEntry.ID_KEY).f(this.f51014A);
        }
        if (this.f51016C != null) {
            interfaceC5223k1.e("connection_type").f(this.f51016C);
        }
        if (this.f51017D != null) {
            interfaceC5223k1.e("battery_temperature").i(this.f51017D);
        }
        if (this.f51015B != null) {
            interfaceC5223k1.e("locale").f(this.f51015B);
        }
        if (this.f51018E != null) {
            interfaceC5223k1.e("processor_count").i(this.f51018E);
        }
        if (this.f51019F != null) {
            interfaceC5223k1.e("processor_frequency").i(this.f51019F);
        }
        if (this.f51020G != null) {
            interfaceC5223k1.e("cpu_description").f(this.f51020G);
        }
        if (this.f51021H != null) {
            interfaceC5223k1.e("chipset").f(this.f51021H);
        }
        Map map = this.f51022I;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51022I.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    C5255e(C5255e c5255e) {
        this.f51023a = c5255e.f51023a;
        this.f51024b = c5255e.f51024b;
        this.f51025c = c5255e.f51025c;
        this.f51026d = c5255e.f51026d;
        this.f51027e = c5255e.f51027e;
        this.f51028f = c5255e.f51028f;
        this.f51031i = c5255e.f51031i;
        this.f51032j = c5255e.f51032j;
        this.f51033k = c5255e.f51033k;
        this.f51034l = c5255e.f51034l;
        this.f51035m = c5255e.f51035m;
        this.f51036n = c5255e.f51036n;
        this.f51037o = c5255e.f51037o;
        this.f51038p = c5255e.f51038p;
        this.f51039q = c5255e.f51039q;
        this.f51040r = c5255e.f51040r;
        this.f51041s = c5255e.f51041s;
        this.f51042t = c5255e.f51042t;
        this.f51043u = c5255e.f51043u;
        this.f51044v = c5255e.f51044v;
        this.f51045w = c5255e.f51045w;
        this.f51046x = c5255e.f51046x;
        this.f51047y = c5255e.f51047y;
        this.f51014A = c5255e.f51014A;
        this.f51016C = c5255e.f51016C;
        this.f51017D = c5255e.f51017D;
        this.f51030h = c5255e.f51030h;
        String[] strArr = c5255e.f51029g;
        this.f51029g = strArr != null ? (String[]) strArr.clone() : null;
        this.f51015B = c5255e.f51015B;
        TimeZone timeZone = c5255e.f51048z;
        this.f51048z = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.f51018E = c5255e.f51018E;
        this.f51019F = c5255e.f51019F;
        this.f51020G = c5255e.f51020G;
        this.f51021H = c5255e.f51021H;
        this.f51022I = AbstractC5290c.b(c5255e.f51022I);
    }
}
