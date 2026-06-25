package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.profilemeasurements.a;
import io.sentry.protocol.C5254d;
import io.sentry.protocol.profiling.a;
import io.sentry.protocol.r;
import io.sentry.protocol.x;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.r1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5268r1 implements B0 {

    /* JADX INFO: renamed from: a */
    private C5254d f51173a;

    /* JADX INFO: renamed from: b */
    private io.sentry.protocol.x f51174b;

    /* JADX INFO: renamed from: c */
    private io.sentry.protocol.x f51175c;

    /* JADX INFO: renamed from: d */
    private io.sentry.protocol.r f51176d;

    /* JADX INFO: renamed from: e */
    private final Map f51177e;

    /* JADX INFO: renamed from: f */
    private String f51178f;

    /* JADX INFO: renamed from: g */
    private String f51179g;

    /* JADX INFO: renamed from: h */
    private String f51180h;

    /* JADX INFO: renamed from: i */
    private String f51181i;

    /* JADX INFO: renamed from: j */
    private double f51182j;

    /* JADX INFO: renamed from: k */
    private final File f51183k;

    /* JADX INFO: renamed from: l */
    private String f51184l;

    /* JADX INFO: renamed from: m */
    private io.sentry.protocol.profiling.a f51185m;

    /* JADX INFO: renamed from: n */
    private Map f51186n;

    /* JADX INFO: renamed from: io.sentry.r1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final io.sentry.protocol.x f51187a;

        /* JADX INFO: renamed from: b */
        private final io.sentry.protocol.x f51188b;

        /* JADX INFO: renamed from: c */
        private final Map f51189c;

        /* JADX INFO: renamed from: d */
        private final File f51190d;

        /* JADX INFO: renamed from: e */
        private final double f51191e;

        /* JADX INFO: renamed from: f */
        private final String f51192f;

        public a(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, Map map, File file, AbstractC5244o2 abstractC5244o2, String str) {
            this.f51187a = xVar;
            this.f51188b = xVar2;
            this.f51189c = new ConcurrentHashMap(map);
            this.f51190d = file;
            this.f51191e = AbstractC5226l.m(abstractC5244o2.m());
            this.f51192f = str;
        }

        public C5268r1 a(C5322z3 c5322z3) {
            return new C5268r1(this.f51187a, this.f51188b, this.f51190d, this.f51189c, Double.valueOf(this.f51191e), this.f51192f, c5322z3);
        }
    }

    /* JADX INFO: renamed from: io.sentry.r1$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public C5268r1 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            C5268r1 c5268r1 = new C5268r1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "debug_meta":
                        C5254d c5254d = (C5254d) interfaceC5218j1.C0(iLogger, new C5254d.a());
                        if (c5254d == null) {
                            break;
                        } else {
                            c5268r1.f51173a = c5254d;
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapK1 = interfaceC5218j1.k1(iLogger, new a.C0799a());
                        if (mapK1 == null) {
                            break;
                        } else {
                            c5268r1.f51177e.putAll(mapK1);
                            break;
                        }
                        break;
                    case "profile":
                        io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) interfaceC5218j1.C0(iLogger, new a.b());
                        if (aVar == null) {
                            break;
                        } else {
                            c5268r1.f51185m = aVar;
                            break;
                        }
                        break;
                    case "environment":
                        String strI1 = interfaceC5218j1.i1();
                        if (strI1 == null) {
                            break;
                        } else {
                            c5268r1.f51180h = strI1;
                            break;
                        }
                        break;
                    case "timestamp":
                        Double dQ0 = interfaceC5218j1.q0();
                        if (dQ0 == null) {
                            break;
                        } else {
                            c5268r1.f51182j = dQ0.doubleValue();
                            break;
                        }
                        break;
                    case "profiler_id":
                        io.sentry.protocol.x xVar = (io.sentry.protocol.x) interfaceC5218j1.C0(iLogger, new x.a());
                        if (xVar == null) {
                            break;
                        } else {
                            c5268r1.f51174b = xVar;
                            break;
                        }
                        break;
                    case "version":
                        String strI12 = interfaceC5218j1.i1();
                        if (strI12 == null) {
                            break;
                        } else {
                            c5268r1.f51181i = strI12;
                            break;
                        }
                        break;
                    case "release":
                        String strI13 = interfaceC5218j1.i1();
                        if (strI13 == null) {
                            break;
                        } else {
                            c5268r1.f51179g = strI13;
                            break;
                        }
                        break;
                    case "client_sdk":
                        io.sentry.protocol.r rVar = (io.sentry.protocol.r) interfaceC5218j1.C0(iLogger, new r.a());
                        if (rVar == null) {
                            break;
                        } else {
                            c5268r1.f51176d = rVar;
                            break;
                        }
                        break;
                    case "platform":
                        String strI14 = interfaceC5218j1.i1();
                        if (strI14 == null) {
                            break;
                        } else {
                            c5268r1.f51178f = strI14;
                            break;
                        }
                        break;
                    case "sampled_profile":
                        String strI15 = interfaceC5218j1.i1();
                        if (strI15 == null) {
                            break;
                        } else {
                            c5268r1.f51184l = strI15;
                            break;
                        }
                        break;
                    case "chunk_id":
                        io.sentry.protocol.x xVar2 = (io.sentry.protocol.x) interfaceC5218j1.C0(iLogger, new x.a());
                        if (xVar2 == null) {
                            break;
                        } else {
                            c5268r1.f51175c = xVar2;
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
            c5268r1.u(concurrentHashMap);
            interfaceC5218j1.I();
            return c5268r1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5268r1() {
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f51153b;
        this(xVar, xVar, new File("dummy"), new HashMap(), Double.valueOf(0.0d), "android", C5322z3.empty());
    }

    private BigDecimal m(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5268r1)) {
            return false;
        }
        C5268r1 c5268r1 = (C5268r1) obj;
        return Objects.equals(this.f51173a, c5268r1.f51173a) && Objects.equals(this.f51174b, c5268r1.f51174b) && Objects.equals(this.f51175c, c5268r1.f51175c) && Objects.equals(this.f51176d, c5268r1.f51176d) && Objects.equals(this.f51177e, c5268r1.f51177e) && Objects.equals(this.f51178f, c5268r1.f51178f) && Objects.equals(this.f51179g, c5268r1.f51179g) && Objects.equals(this.f51180h, c5268r1.f51180h) && Objects.equals(this.f51181i, c5268r1.f51181i) && Objects.equals(this.f51184l, c5268r1.f51184l) && Objects.equals(this.f51186n, c5268r1.f51186n) && Objects.equals(this.f51185m, c5268r1.f51185m);
    }

    public int hashCode() {
        return Objects.hash(this.f51173a, this.f51174b, this.f51175c, this.f51176d, this.f51177e, this.f51178f, this.f51179g, this.f51180h, this.f51181i, this.f51184l, this.f51185m, this.f51186n);
    }

    public io.sentry.protocol.x n() {
        return this.f51175c;
    }

    public C5254d o() {
        return this.f51173a;
    }

    public String p() {
        return this.f51178f;
    }

    public File q() {
        return this.f51183k;
    }

    public void r(C5254d c5254d) {
        this.f51173a = c5254d;
    }

    public void s(String str) {
        this.f51184l = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51173a != null) {
            interfaceC5223k1.e("debug_meta").j(iLogger, this.f51173a);
        }
        interfaceC5223k1.e("profiler_id").j(iLogger, this.f51174b);
        interfaceC5223k1.e("chunk_id").j(iLogger, this.f51175c);
        if (this.f51176d != null) {
            interfaceC5223k1.e("client_sdk").j(iLogger, this.f51176d);
        }
        if (!this.f51177e.isEmpty()) {
            String strB = interfaceC5223k1.b();
            interfaceC5223k1.h("");
            interfaceC5223k1.e("measurements").j(iLogger, this.f51177e);
            interfaceC5223k1.h(strB);
        }
        interfaceC5223k1.e("platform").j(iLogger, this.f51178f);
        interfaceC5223k1.e("release").j(iLogger, this.f51179g);
        if (this.f51180h != null) {
            interfaceC5223k1.e("environment").j(iLogger, this.f51180h);
        }
        interfaceC5223k1.e(DiagnosticsEntry.VERSION_KEY).j(iLogger, this.f51181i);
        if (this.f51184l != null) {
            interfaceC5223k1.e("sampled_profile").j(iLogger, this.f51184l);
        }
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, m(Double.valueOf(this.f51182j)));
        if (this.f51185m != null) {
            interfaceC5223k1.e("profile").j(iLogger, this.f51185m);
        }
        Map map = this.f51186n;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51186n.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    public void t(io.sentry.protocol.profiling.a aVar) {
        this.f51185m = aVar;
    }

    public void u(Map map) {
        this.f51186n = map;
    }

    public C5268r1(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, File file, Map map, Double d10, String str, C5322z3 c5322z3) {
        this.f51184l = null;
        this.f51174b = xVar;
        this.f51175c = xVar2;
        this.f51183k = file;
        this.f51177e = map;
        this.f51173a = null;
        this.f51176d = c5322z3.getSdkVersion();
        this.f51179g = c5322z3.getRelease() != null ? c5322z3.getRelease() : "";
        this.f51180h = c5322z3.getEnvironment();
        this.f51178f = str;
        this.f51181i = "2";
        this.f51182j = d10.doubleValue();
    }
}
