package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.util.C5288a;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class O3 implements B0 {

    /* JADX INFO: renamed from: a */
    private final Date f49262a;

    /* JADX INFO: renamed from: b */
    private Date f49263b;

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f49264c;

    /* JADX INFO: renamed from: d */
    private final String f49265d;

    /* JADX INFO: renamed from: e */
    private final String f49266e;

    /* JADX INFO: renamed from: f */
    private Boolean f49267f;

    /* JADX INFO: renamed from: g */
    private b f49268g;

    /* JADX INFO: renamed from: h */
    private Long f49269h;

    /* JADX INFO: renamed from: i */
    private Double f49270i;

    /* JADX INFO: renamed from: j */
    private final String f49271j;

    /* JADX INFO: renamed from: k */
    private String f49272k;

    /* JADX INFO: renamed from: l */
    private final String f49273l;

    /* JADX INFO: renamed from: m */
    private final String f49274m;

    /* JADX INFO: renamed from: n */
    private String f49275n;

    /* JADX INFO: renamed from: o */
    private final C5288a f49276o;

    /* JADX INFO: renamed from: p */
    private Map f49277p;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC5215i3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public O3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) throws Exception {
            String strR0;
            interfaceC5218j1.x();
            Integer numB1 = null;
            ConcurrentHashMap concurrentHashMap = null;
            b bVarValueOf = null;
            Date dateU0 = null;
            Date dateU02 = null;
            String strI1 = null;
            String str = null;
            Boolean boolW0 = null;
            Long lD1 = null;
            Double dQ0 = null;
            String strI12 = null;
            String strI13 = null;
            String strI14 = null;
            String strI15 = null;
            String strI16 = null;
            while (true) {
                Integer num = numB1;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                b bVar = bVarValueOf;
                Date date = dateU0;
                Date date2 = dateU02;
                if (interfaceC5218j1.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (bVar == null) {
                        throw c("status", iLogger);
                    }
                    if (date == null) {
                        throw c("started", iLogger);
                    }
                    if (num == null) {
                        throw c("errors", iLogger);
                    }
                    if (strI15 == null) {
                        throw c("release", iLogger);
                    }
                    O3 o32 = new O3(bVar, date, date2, num.intValue(), strI1, str, boolW0, lD1, dQ0, strI12, strI13, strI14, strI15, strI16);
                    o32.o(concurrentHashMap2);
                    interfaceC5218j1.I();
                    return o32;
                }
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "duration":
                        dQ0 = interfaceC5218j1.q0();
                        numB1 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        dateU02 = date2;
                        break;
                    case "started":
                        dateU0 = interfaceC5218j1.u0(iLogger);
                        numB1 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU02 = date2;
                        break;
                    case "errors":
                        numB1 = interfaceC5218j1.b1();
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        dateU02 = date2;
                        break;
                    case "status":
                        String strC = io.sentry.util.D.c(interfaceC5218j1.i1());
                        if (strC != null) {
                            bVarValueOf = b.valueOf(strC);
                            numB1 = num;
                            concurrentHashMap = concurrentHashMap2;
                            dateU0 = date;
                            dateU02 = date2;
                            break;
                        }
                        numB1 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        dateU02 = date2;
                        break;
                    case "did":
                        strI1 = interfaceC5218j1.i1();
                        numB1 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        dateU02 = date2;
                        break;
                    case "seq":
                        lD1 = interfaceC5218j1.d1();
                        numB1 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        dateU02 = date2;
                        break;
                    case "sid":
                        String strI17 = interfaceC5218j1.i1();
                        if (strI17 == null || !(strI17.length() == 36 || strI17.length() == 32)) {
                            iLogger.c(EnumC5215i3.ERROR, "%s sid is not valid.", strI17);
                        } else {
                            str = strI17;
                        }
                        numB1 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        dateU02 = date2;
                        break;
                    case "init":
                        boolW0 = interfaceC5218j1.w0();
                        numB1 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        dateU02 = date2;
                        break;
                    case "timestamp":
                        dateU02 = interfaceC5218j1.u0(iLogger);
                        numB1 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        break;
                    case "attrs":
                        interfaceC5218j1.x();
                        while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strR02 = interfaceC5218j1.r0();
                            strR02.getClass();
                            switch (strR02) {
                                case "environment":
                                    strI14 = interfaceC5218j1.i1();
                                    break;
                                case "release":
                                    strI15 = interfaceC5218j1.i1();
                                    break;
                                case "ip_address":
                                    strI12 = interfaceC5218j1.i1();
                                    break;
                                case "user_agent":
                                    strI13 = interfaceC5218j1.i1();
                                    break;
                                default:
                                    interfaceC5218j1.W();
                                    break;
                            }
                        }
                        interfaceC5218j1.I();
                        numB1 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        dateU02 = date2;
                        break;
                    case "abnormal_mechanism":
                        strI16 = interfaceC5218j1.i1();
                        numB1 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        dateU02 = date2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        numB1 = num;
                        bVarValueOf = bVar;
                        dateU0 = date;
                        dateU02 = date2;
                        break;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public O3(b bVar, Date date, Date date2, int i10, String str, String str2, Boolean bool, Long l10, Double d10, String str3, String str4, String str5, String str6, String str7) {
        this.f49276o = new C5288a();
        this.f49268g = bVar;
        this.f49262a = date;
        this.f49263b = date2;
        this.f49264c = new AtomicInteger(i10);
        this.f49265d = str;
        this.f49266e = str2;
        this.f49267f = bool;
        this.f49269h = l10;
        this.f49270i = d10;
        this.f49271j = str3;
        this.f49272k = str4;
        this.f49273l = str5;
        this.f49274m = str6;
        this.f49275n = str7;
    }

    private double a(Date date) {
        return Math.abs(date.getTime() - this.f49262a.getTime()) / 1000.0d;
    }

    private long i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* JADX INFO: renamed from: b */
    public O3 clone() {
        return new O3(this.f49268g, this.f49262a, this.f49263b, this.f49264c.get(), this.f49265d, this.f49266e, this.f49267f, this.f49269h, this.f49270i, this.f49271j, this.f49272k, this.f49273l, this.f49274m, this.f49275n);
    }

    public void c() {
        d(AbstractC5226l.d());
    }

    public void d(Date date) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49276o.a();
        try {
            this.f49267f = null;
            if (this.f49268g == b.Ok) {
                this.f49268g = b.Exited;
            }
            if (date != null) {
                this.f49263b = date;
            } else {
                this.f49263b = AbstractC5226l.d();
            }
            Date date2 = this.f49263b;
            if (date2 != null) {
                this.f49270i = Double.valueOf(a(date2));
                this.f49269h = Long.valueOf(i(this.f49263b));
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public int e() {
        return this.f49264c.get();
    }

    public String f() {
        return this.f49275n;
    }

    public Boolean g() {
        return this.f49267f;
    }

    public String h() {
        return this.f49274m;
    }

    public String j() {
        return this.f49266e;
    }

    public Date k() {
        Date date = this.f49262a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public b l() {
        return this.f49268g;
    }

    public boolean m() {
        return this.f49268g != b.Ok;
    }

    public void n() {
        this.f49267f = Boolean.TRUE;
    }

    public void o(Map map) {
        this.f49277p = map;
    }

    public boolean p(b bVar, String str, boolean z10) {
        return q(bVar, str, z10, null);
    }

    public boolean q(b bVar, String str, boolean z10, String str2) {
        boolean z11;
        InterfaceC5192e0 interfaceC5192e0A = this.f49276o.a();
        boolean z12 = true;
        if (bVar != null) {
            try {
                this.f49268g = bVar;
                z11 = true;
            } catch (Throwable th2) {
                if (interfaceC5192e0A != null) {
                    try {
                        interfaceC5192e0A.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } else {
            z11 = false;
        }
        if (str != null) {
            this.f49272k = str;
            z11 = true;
        }
        if (z10) {
            this.f49264c.addAndGet(1);
            z11 = true;
        }
        if (str2 != null) {
            this.f49275n = str2;
        } else {
            z12 = z11;
        }
        if (z12) {
            this.f49267f = null;
            Date dateD = AbstractC5226l.d();
            this.f49263b = dateD;
            if (dateD != null) {
                this.f49269h = Long.valueOf(i(dateD));
            }
        }
        if (interfaceC5192e0A != null) {
            interfaceC5192e0A.close();
        }
        return z12;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f49266e != null) {
            interfaceC5223k1.e("sid").f(this.f49266e);
        }
        if (this.f49265d != null) {
            interfaceC5223k1.e("did").f(this.f49265d);
        }
        if (this.f49267f != null) {
            interfaceC5223k1.e("init").k(this.f49267f);
        }
        interfaceC5223k1.e("started").j(iLogger, this.f49262a);
        interfaceC5223k1.e("status").j(iLogger, this.f49268g.name().toLowerCase(Locale.ROOT));
        if (this.f49269h != null) {
            interfaceC5223k1.e("seq").i(this.f49269h);
        }
        interfaceC5223k1.e("errors").a(this.f49264c.intValue());
        if (this.f49270i != null) {
            interfaceC5223k1.e("duration").i(this.f49270i);
        }
        if (this.f49263b != null) {
            interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, this.f49263b);
        }
        if (this.f49275n != null) {
            interfaceC5223k1.e("abnormal_mechanism").j(iLogger, this.f49275n);
        }
        interfaceC5223k1.e("attrs");
        interfaceC5223k1.x();
        interfaceC5223k1.e("release").j(iLogger, this.f49274m);
        if (this.f49273l != null) {
            interfaceC5223k1.e("environment").j(iLogger, this.f49273l);
        }
        if (this.f49271j != null) {
            interfaceC5223k1.e("ip_address").j(iLogger, this.f49271j);
        }
        if (this.f49272k != null) {
            interfaceC5223k1.e("user_agent").j(iLogger, this.f49272k);
        }
        interfaceC5223k1.I();
        Map map = this.f49277p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f49277p.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public O3(String str, io.sentry.protocol.I i10, String str2, String str3) {
        this(b.Ok, AbstractC5226l.d(), AbstractC5226l.d(), 0, str, M3.a(), Boolean.TRUE, null, null, i10 != null ? i10.j() : null, null, str2, str3, null);
    }
}
