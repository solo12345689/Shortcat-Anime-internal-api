package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC5219j2;
import io.sentry.EnumC5215i3;
import io.sentry.protocol.D;
import io.sentry.protocol.m;
import io.sentry.protocol.s;
import io.sentry.util.AbstractC5290c;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class V2 extends AbstractC5219j2 implements B0 {

    /* JADX INFO: renamed from: p */
    private Date f49367p;

    /* JADX INFO: renamed from: q */
    private io.sentry.protocol.m f49368q;

    /* JADX INFO: renamed from: r */
    private String f49369r;

    /* JADX INFO: renamed from: s */
    private N3 f49370s;

    /* JADX INFO: renamed from: t */
    private N3 f49371t;

    /* JADX INFO: renamed from: u */
    private EnumC5215i3 f49372u;

    /* JADX INFO: renamed from: v */
    private String f49373v;

    /* JADX INFO: renamed from: w */
    private List f49374w;

    /* JADX INFO: renamed from: x */
    private Map f49375x;

    /* JADX INFO: renamed from: y */
    private Map f49376y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public V2 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            V2 v22 = new V2();
            AbstractC5219j2.a aVar = new AbstractC5219j2.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "fingerprint":
                        List list = (List) interfaceC5218j1.N1();
                        if (list == null) {
                            break;
                        } else {
                            v22.f49374w = list;
                            break;
                        }
                        break;
                    case "threads":
                        interfaceC5218j1.x();
                        interfaceC5218j1.r0();
                        v22.f49370s = new N3(interfaceC5218j1.T1(iLogger, new D.a()));
                        interfaceC5218j1.I();
                        break;
                    case "logger":
                        v22.f49369r = interfaceC5218j1.i1();
                        break;
                    case "timestamp":
                        Date dateU0 = interfaceC5218j1.u0(iLogger);
                        if (dateU0 == null) {
                            break;
                        } else {
                            v22.f49367p = dateU0;
                            break;
                        }
                        break;
                    case "level":
                        v22.f49372u = (EnumC5215i3) interfaceC5218j1.C0(iLogger, new EnumC5215i3.a());
                        break;
                    case "message":
                        v22.f49368q = (io.sentry.protocol.m) interfaceC5218j1.C0(iLogger, new m.a());
                        break;
                    case "modules":
                        v22.f49376y = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                        break;
                    case "exception":
                        interfaceC5218j1.x();
                        interfaceC5218j1.r0();
                        v22.f49371t = new N3(interfaceC5218j1.T1(iLogger, new s.a()));
                        interfaceC5218j1.I();
                        break;
                    case "transaction":
                        v22.f49373v = interfaceC5218j1.i1();
                        break;
                    default:
                        if (!aVar.a(v22, strR0, interfaceC5218j1, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            v22.I0(concurrentHashMap);
            interfaceC5218j1.I();
            return v22;
        }
    }

    V2(io.sentry.protocol.x xVar, Date date) {
        super(xVar);
        this.f49367p = date;
    }

    public void A0(List list) {
        this.f49371t = new N3(list);
    }

    public void B0(List list) {
        this.f49374w = list != null ? new ArrayList(list) : null;
    }

    public void C0(EnumC5215i3 enumC5215i3) {
        this.f49372u = enumC5215i3;
    }

    public void D0(io.sentry.protocol.m mVar) {
        this.f49368q = mVar;
    }

    public void E0(Map map) {
        this.f49376y = AbstractC5290c.c(map);
    }

    public void F0(List list) {
        this.f49370s = new N3(list);
    }

    public void G0(Date date) {
        this.f49367p = date;
    }

    public void H0(String str) {
        this.f49373v = str;
    }

    public void I0(Map map) {
        this.f49375x = map;
    }

    public List p0() {
        N3 n32 = this.f49371t;
        if (n32 == null) {
            return null;
        }
        return n32.a();
    }

    public List q0() {
        return this.f49374w;
    }

    public EnumC5215i3 r0() {
        return this.f49372u;
    }

    public io.sentry.protocol.m s0() {
        return this.f49368q;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, this.f49367p);
        if (this.f49368q != null) {
            interfaceC5223k1.e("message").j(iLogger, this.f49368q);
        }
        if (this.f49369r != null) {
            interfaceC5223k1.e("logger").f(this.f49369r);
        }
        N3 n32 = this.f49370s;
        if (n32 != null && !n32.a().isEmpty()) {
            interfaceC5223k1.e("threads");
            interfaceC5223k1.x();
            interfaceC5223k1.e("values").j(iLogger, this.f49370s.a());
            interfaceC5223k1.I();
        }
        N3 n33 = this.f49371t;
        if (n33 != null && !n33.a().isEmpty()) {
            interfaceC5223k1.e("exception");
            interfaceC5223k1.x();
            interfaceC5223k1.e("values").j(iLogger, this.f49371t.a());
            interfaceC5223k1.I();
        }
        if (this.f49372u != null) {
            interfaceC5223k1.e("level").j(iLogger, this.f49372u);
        }
        if (this.f49373v != null) {
            interfaceC5223k1.e("transaction").f(this.f49373v);
        }
        if (this.f49374w != null) {
            interfaceC5223k1.e("fingerprint").j(iLogger, this.f49374w);
        }
        if (this.f49376y != null) {
            interfaceC5223k1.e("modules").j(iLogger, this.f49376y);
        }
        new AbstractC5219j2.b().a(this, interfaceC5223k1, iLogger);
        Map map = this.f49375x;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f49375x.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    Map t0() {
        return this.f49376y;
    }

    public List u0() {
        N3 n32 = this.f49370s;
        if (n32 != null) {
            return n32.a();
        }
        return null;
    }

    public Date v0() {
        return (Date) this.f49367p.clone();
    }

    public String w0() {
        return this.f49373v;
    }

    public io.sentry.protocol.s x0() {
        N3 n32 = this.f49371t;
        if (n32 == null) {
            return null;
        }
        for (io.sentry.protocol.s sVar : n32.a()) {
            if (sVar.g() != null && sVar.g().l() != null && !sVar.g().l().booleanValue()) {
                return sVar;
            }
        }
        return null;
    }

    public boolean y0() {
        return x0() != null;
    }

    public boolean z0() {
        N3 n32 = this.f49371t;
        return (n32 == null || n32.a().isEmpty()) ? false : true;
    }

    public V2(Throwable th2) {
        this();
        this.f50780j = th2;
    }

    public V2() {
        this(new io.sentry.protocol.x(), AbstractC5226l.d());
    }
}
