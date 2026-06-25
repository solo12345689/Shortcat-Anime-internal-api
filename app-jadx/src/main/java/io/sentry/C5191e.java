package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.EnumC5215i3;
import io.sentry.util.AbstractC5290c;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5191e implements B0, Comparable {

    /* JADX INFO: renamed from: a */
    private final Long f50646a;

    /* JADX INFO: renamed from: b */
    private Date f50647b;

    /* JADX INFO: renamed from: c */
    private final Long f50648c;

    /* JADX INFO: renamed from: d */
    private String f50649d;

    /* JADX INFO: renamed from: e */
    private String f50650e;

    /* JADX INFO: renamed from: f */
    private Map f50651f;

    /* JADX INFO: renamed from: g */
    private String f50652g;

    /* JADX INFO: renamed from: h */
    private String f50653h;

    /* JADX INFO: renamed from: i */
    private EnumC5215i3 f50654i;

    /* JADX INFO: renamed from: j */
    private Map f50655j;

    /* JADX INFO: renamed from: io.sentry.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public C5191e a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            Date dateD = AbstractC5226l.d();
            Map concurrentHashMap = new ConcurrentHashMap();
            String strI1 = null;
            String strI12 = null;
            String strI13 = null;
            String strI14 = null;
            EnumC5215i3 enumC5215i3A = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "origin":
                        strI14 = interfaceC5218j1.i1();
                        break;
                    case "data":
                        Map mapB = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                        if (mapB == null) {
                            break;
                        } else {
                            concurrentHashMap = mapB;
                            break;
                        }
                        break;
                    case "type":
                        strI12 = interfaceC5218j1.i1();
                        break;
                    case "category":
                        strI13 = interfaceC5218j1.i1();
                        break;
                    case "timestamp":
                        Date dateU0 = interfaceC5218j1.u0(iLogger);
                        if (dateU0 == null) {
                            break;
                        } else {
                            dateD = dateU0;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            enumC5215i3A = new EnumC5215i3.a().a(interfaceC5218j1, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.a(EnumC5215i3.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strI1 = interfaceC5218j1.i1();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap2, strR0);
                        break;
                }
            }
            C5191e c5191e = new C5191e(dateD);
            c5191e.f50649d = strI1;
            c5191e.f50650e = strI12;
            c5191e.f50651f = concurrentHashMap;
            c5191e.f50652g = strI13;
            c5191e.f50653h = strI14;
            c5191e.f50654i = enumC5215i3A;
            c5191e.I(concurrentHashMap2);
            interfaceC5218j1.I();
            return c5191e;
        }
    }

    public C5191e(Date date) {
        this.f50651f = new ConcurrentHashMap();
        this.f50648c = Long.valueOf(System.nanoTime());
        this.f50647b = date;
        this.f50646a = null;
    }

    private static int A(C5191e c5191e) {
        return io.sentry.util.w.b(Long.valueOf(c5191e.x().getTime()), c5191e.f50649d, c5191e.f50650e, c5191e.f50652g, c5191e.f50653h, c5191e.f50654i, c5191e.s("status_code"), c5191e.s("url"), c5191e.s("method"), c5191e.s("http.fragment"), c5191e.s("http.query"));
    }

    public static C5191e J(String str, String str2, String str3, String str4, Map map) {
        C5191e c5191e = new C5191e();
        c5191e.H("user");
        c5191e.C("ui." + str);
        if (str2 != null) {
            c5191e.D("view.id", str2);
        }
        if (str3 != null) {
            c5191e.D("view.class", str3);
        }
        if (str4 != null) {
            c5191e.D("view.tag", str4);
        }
        for (Map.Entry entry : map.entrySet()) {
            c5191e.t().put((String) entry.getKey(), entry.getValue());
        }
        c5191e.E(EnumC5215i3.INFO);
        return c5191e;
    }

    private static boolean n(C5191e c5191e, C5191e c5191e2) {
        return c5191e.x().getTime() == c5191e2.x().getTime() && io.sentry.util.w.a(c5191e.f50649d, c5191e2.f50649d) && io.sentry.util.w.a(c5191e.f50650e, c5191e2.f50650e) && io.sentry.util.w.a(c5191e.f50652g, c5191e2.f50652g) && io.sentry.util.w.a(c5191e.f50653h, c5191e2.f50653h) && c5191e.f50654i == c5191e2.f50654i;
    }

    private static int p(C5191e c5191e) {
        return io.sentry.util.w.b(Long.valueOf(c5191e.x().getTime()), c5191e.f50649d, c5191e.f50650e, c5191e.f50652g, c5191e.f50653h, c5191e.f50654i);
    }

    private static boolean z(C5191e c5191e, C5191e c5191e2) {
        return n(c5191e, c5191e2) && io.sentry.util.w.a(c5191e.s("status_code"), c5191e2.s("status_code")) && io.sentry.util.w.a(c5191e.s("url"), c5191e2.s("url")) && io.sentry.util.w.a(c5191e.s("method"), c5191e2.s("method")) && io.sentry.util.w.a(c5191e.s("http.fragment"), c5191e2.s("http.fragment")) && io.sentry.util.w.a(c5191e.s("http.query"), c5191e2.s("http.query"));
    }

    public void B(String str) {
        if (str == null) {
            return;
        }
        this.f50651f.remove(str);
    }

    public void C(String str) {
        this.f50652g = str;
    }

    public void D(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            B(str);
        } else {
            this.f50651f.put(str, obj);
        }
    }

    public void E(EnumC5215i3 enumC5215i3) {
        this.f50654i = enumC5215i3;
    }

    public void F(String str) {
        this.f50649d = str;
    }

    public void G(String str) {
        this.f50653h = str;
    }

    public void H(String str) {
        this.f50650e = str;
    }

    public void I(Map map) {
        this.f50655j = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5191e.class != obj.getClass()) {
            return false;
        }
        C5191e c5191e = (C5191e) obj;
        return "http".equals(this.f50650e) ? z(this, c5191e) : n(this, c5191e);
    }

    public int hashCode() {
        return "http".equals(this.f50650e) ? A(this) : p(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q */
    public int compareTo(C5191e c5191e) {
        return this.f50648c.compareTo(c5191e.f50648c);
    }

    public String r() {
        return this.f50652g;
    }

    public Object s(String str) {
        if (str == null) {
            return null;
        }
        return this.f50651f.get(str);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, x());
        if (this.f50649d != null) {
            interfaceC5223k1.e("message").f(this.f50649d);
        }
        if (this.f50650e != null) {
            interfaceC5223k1.e("type").f(this.f50650e);
        }
        interfaceC5223k1.e("data").j(iLogger, this.f50651f);
        if (this.f50652g != null) {
            interfaceC5223k1.e("category").f(this.f50652g);
        }
        if (this.f50653h != null) {
            interfaceC5223k1.e("origin").f(this.f50653h);
        }
        if (this.f50654i != null) {
            interfaceC5223k1.e("level").j(iLogger, this.f50654i);
        }
        Map map = this.f50655j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50655j.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public Map t() {
        return this.f50651f;
    }

    public EnumC5215i3 u() {
        return this.f50654i;
    }

    public String v() {
        return this.f50649d;
    }

    public String w() {
        return this.f50653h;
    }

    public Date x() {
        Date date = this.f50647b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l10 = this.f50646a;
        if (l10 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateE = AbstractC5226l.e(l10.longValue());
        this.f50647b = dateE;
        return dateE;
    }

    public String y() {
        return this.f50650e;
    }

    public C5191e(long j10) {
        this.f50651f = new ConcurrentHashMap();
        this.f50648c = Long.valueOf(System.nanoTime());
        this.f50646a = Long.valueOf(j10);
        this.f50647b = null;
    }

    C5191e(C5191e c5191e) {
        this.f50651f = new ConcurrentHashMap();
        this.f50648c = Long.valueOf(System.nanoTime());
        this.f50647b = c5191e.f50647b;
        this.f50646a = c5191e.f50646a;
        this.f50649d = c5191e.f50649d;
        this.f50650e = c5191e.f50650e;
        this.f50652g = c5191e.f50652g;
        this.f50653h = c5191e.f50653h;
        Map mapB = AbstractC5290c.b(c5191e.f50651f);
        if (mapB != null) {
            this.f50651f = mapB;
        }
        this.f50655j = AbstractC5290c.b(c5191e.f50655j);
        this.f50654i = c5191e.f50654i;
    }

    public C5191e() {
        this(System.currentTimeMillis());
    }
}
