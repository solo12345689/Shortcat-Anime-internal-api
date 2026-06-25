package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.w1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5305w1 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f51540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f51541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f51542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f51543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f51544h;

    /* JADX INFO: renamed from: io.sentry.w1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5305w1 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            C5305w1 c5305w1 = new C5305w1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "relative_start_ns":
                        Long lD1 = interfaceC5218j1.d1();
                        if (lD1 == null) {
                            break;
                        } else {
                            c5305w1.f51540d = lD1;
                            break;
                        }
                        break;
                    case "relative_end_ns":
                        Long lD12 = interfaceC5218j1.d1();
                        if (lD12 == null) {
                            break;
                        } else {
                            c5305w1.f51541e = lD12;
                            break;
                        }
                        break;
                    case "id":
                        String strI1 = interfaceC5218j1.i1();
                        if (strI1 == null) {
                            break;
                        } else {
                            c5305w1.f51537a = strI1;
                            break;
                        }
                        break;
                    case "name":
                        String strI12 = interfaceC5218j1.i1();
                        if (strI12 == null) {
                            break;
                        } else {
                            c5305w1.f51539c = strI12;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strI13 = interfaceC5218j1.i1();
                        if (strI13 == null) {
                            break;
                        } else {
                            c5305w1.f51538b = strI13;
                            break;
                        }
                        break;
                    case "relative_cpu_end_ms":
                        Long lD13 = interfaceC5218j1.d1();
                        if (lD13 == null) {
                            break;
                        } else {
                            c5305w1.f51543g = lD13;
                            break;
                        }
                        break;
                    case "relative_cpu_start_ms":
                        Long lD14 = interfaceC5218j1.d1();
                        if (lD14 == null) {
                            break;
                        } else {
                            c5305w1.f51542f = lD14;
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
            c5305w1.l(concurrentHashMap);
            interfaceC5218j1.I();
            return c5305w1;
        }
    }

    public C5305w1() {
        this(C5198f1.u(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5305w1.class == obj.getClass()) {
            C5305w1 c5305w1 = (C5305w1) obj;
            if (this.f51537a.equals(c5305w1.f51537a) && this.f51538b.equals(c5305w1.f51538b) && this.f51539c.equals(c5305w1.f51539c) && this.f51540d.equals(c5305w1.f51540d) && this.f51542f.equals(c5305w1.f51542f) && io.sentry.util.w.a(this.f51543g, c5305w1.f51543g) && io.sentry.util.w.a(this.f51541e, c5305w1.f51541e) && io.sentry.util.w.a(this.f51544h, c5305w1.f51544h)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f51537a;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f51537a, this.f51538b, this.f51539c, this.f51540d, this.f51541e, this.f51542f, this.f51543g, this.f51544h);
    }

    public String i() {
        return this.f51539c;
    }

    public String j() {
        return this.f51538b;
    }

    public void k(Long l10, Long l11, Long l12, Long l13) {
        if (this.f51541e == null) {
            this.f51541e = Long.valueOf(l10.longValue() - l11.longValue());
            this.f51540d = Long.valueOf(this.f51540d.longValue() - l11.longValue());
            this.f51543g = Long.valueOf(l12.longValue() - l13.longValue());
            this.f51542f = Long.valueOf(this.f51542f.longValue() - l13.longValue());
        }
    }

    public void l(Map map) {
        this.f51544h = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e(DiagnosticsEntry.ID_KEY).j(iLogger, this.f51537a);
        interfaceC5223k1.e("trace_id").j(iLogger, this.f51538b);
        interfaceC5223k1.e("name").j(iLogger, this.f51539c);
        interfaceC5223k1.e("relative_start_ns").j(iLogger, this.f51540d);
        interfaceC5223k1.e("relative_end_ns").j(iLogger, this.f51541e);
        interfaceC5223k1.e("relative_cpu_start_ms").j(iLogger, this.f51542f);
        interfaceC5223k1.e("relative_cpu_end_ms").j(iLogger, this.f51543g);
        Map map = this.f51544h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51544h.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public C5305w1(InterfaceC5217j0 interfaceC5217j0, Long l10, Long l11) {
        this.f51537a = interfaceC5217j0.f().toString();
        this.f51538b = interfaceC5217j0.q().p().toString();
        this.f51539c = interfaceC5217j0.getName().isEmpty() ? "unknown" : interfaceC5217j0.getName();
        this.f51540d = l10;
        this.f51542f = l11;
    }
}
