package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC5226l;
import io.sentry.B0;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.S3;
import io.sentry.Y3;
import io.sentry.a4;
import io.sentry.protocol.C5261k;
import io.sentry.protocol.x;
import io.sentry.util.AbstractC5290c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class A implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f50905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f50906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f50907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Y3 f50908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y3 f50909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f50910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f50911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a4 f50912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f50913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f50914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f50915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f50916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map f50917m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC5215i3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public A a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) throws Exception {
            String strR0;
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            Double dValueOf = null;
            Map map = null;
            x xVarA = null;
            Y3 y3A = null;
            Map map2 = null;
            String strI1 = null;
            Double dValueOf2 = null;
            Y3 y32 = null;
            String strI12 = null;
            a4 a4Var = null;
            String strI13 = null;
            Map map3 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Double d10 = dValueOf;
                Map map4 = map;
                x xVar = xVarA;
                Y3 y33 = y3A;
                if (interfaceC5218j1.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (d10 == null) {
                        throw c("start_timestamp", iLogger);
                    }
                    if (xVar == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (y33 == null) {
                        throw c("span_id", iLogger);
                    }
                    if (strI1 == null) {
                        throw c("op", iLogger);
                    }
                    Map map5 = map4 == null ? new HashMap() : map4;
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    A a10 = new A(d10, dValueOf2, xVar, y33, y32, strI1, strI12, a4Var, strI13, map5, map2, map3);
                    a10.i(concurrentHashMap2);
                    interfaceC5218j1.I();
                    return a10;
                }
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "span_id":
                        y3A = new Y3.a().a(interfaceC5218j1, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        xVarA = xVar;
                        break;
                    case "parent_span_id":
                        y32 = (Y3) interfaceC5218j1.C0(iLogger, new Y3.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                    case "description":
                        strI12 = interfaceC5218j1.i1();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                    case "start_timestamp":
                        try {
                            dValueOf = interfaceC5218j1.q0();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateU0 = interfaceC5218j1.u0(iLogger);
                            dValueOf = dateU0 != null ? Double.valueOf(AbstractC5226l.b(dateU0)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        map = map4;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                    case "origin":
                        strI13 = interfaceC5218j1.i1();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                    case "status":
                        a4Var = (a4) interfaceC5218j1.C0(iLogger, new a4.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                    case "measurements":
                        map2 = interfaceC5218j1.k1(iLogger, new C5261k.a());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                    case "op":
                        strI1 = interfaceC5218j1.i1();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                    case "data":
                        map3 = (Map) interfaceC5218j1.N1();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                    case "tags":
                        map = (Map) interfaceC5218j1.N1();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                    case "timestamp":
                        try {
                            dValueOf2 = interfaceC5218j1.q0();
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateU02 = interfaceC5218j1.u0(iLogger);
                            dValueOf2 = dateU02 != null ? Double.valueOf(AbstractC5226l.b(dateU02)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                    case "trace_id":
                        xVarA = new x.a().a(interfaceC5218j1, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        y3A = y33;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        dValueOf = d10;
                        map = map4;
                        xVarA = xVar;
                        y3A = y33;
                        break;
                }
            }
        }
    }

    public A(S3 s32) {
        this(s32, s32.u());
    }

    private BigDecimal a(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public Map b() {
        return this.f50915k;
    }

    public Map c() {
        return this.f50916l;
    }

    public String d() {
        return this.f50910f;
    }

    public Y3 e() {
        return this.f50908d;
    }

    public Double f() {
        return this.f50905a;
    }

    public Double g() {
        return this.f50906b;
    }

    public void h(Map map) {
        this.f50915k = map;
    }

    public void i(Map map) {
        this.f50917m = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("start_timestamp").j(iLogger, a(this.f50905a));
        if (this.f50906b != null) {
            interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, a(this.f50906b));
        }
        interfaceC5223k1.e("trace_id").j(iLogger, this.f50907c);
        interfaceC5223k1.e("span_id").j(iLogger, this.f50908d);
        if (this.f50909e != null) {
            interfaceC5223k1.e("parent_span_id").j(iLogger, this.f50909e);
        }
        interfaceC5223k1.e("op").f(this.f50910f);
        if (this.f50911g != null) {
            interfaceC5223k1.e(com.amazon.a.a.o.b.f34645c).f(this.f50911g);
        }
        if (this.f50912h != null) {
            interfaceC5223k1.e("status").j(iLogger, this.f50912h);
        }
        if (this.f50913i != null) {
            interfaceC5223k1.e("origin").j(iLogger, this.f50913i);
        }
        if (!this.f50914j.isEmpty()) {
            interfaceC5223k1.e("tags").j(iLogger, this.f50914j);
        }
        if (this.f50915k != null) {
            interfaceC5223k1.e("data").j(iLogger, this.f50915k);
        }
        if (!this.f50916l.isEmpty()) {
            interfaceC5223k1.e("measurements").j(iLogger, this.f50916l);
        }
        Map map = this.f50917m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50917m.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public A(S3 s32, Map map) {
        io.sentry.util.w.c(s32, "span is required");
        this.f50911g = s32.getDescription();
        this.f50910f = s32.x();
        this.f50908d = s32.C();
        this.f50909e = s32.z();
        this.f50907c = s32.E();
        this.f50912h = s32.b();
        this.f50913i = s32.q().g();
        Map mapB = AbstractC5290c.b(s32.D());
        this.f50914j = mapB == null ? new ConcurrentHashMap() : mapB;
        Map mapB2 = AbstractC5290c.b(s32.w());
        this.f50916l = mapB2 == null ? new ConcurrentHashMap() : mapB2;
        this.f50906b = s32.r() == null ? null : Double.valueOf(AbstractC5226l.m(s32.t().k(s32.r())));
        this.f50905a = Double.valueOf(AbstractC5226l.m(s32.t().m()));
        this.f50915k = map;
        C5257g c5257gN = s32.q().d().n();
        if (c5257gN != null) {
            if (this.f50915k == null) {
                this.f50915k = new HashMap();
            }
            for (C5256f c5256f : c5257gN.a()) {
                this.f50915k.put("flag.evaluation." + c5256f.a(), c5256f.b());
            }
        }
    }

    public A(Double d10, Double d11, x xVar, Y3 y32, Y3 y33, String str, String str2, a4 a4Var, String str3, Map map, Map map2, Map map3) {
        this.f50905a = d10;
        this.f50906b = d11;
        this.f50907c = xVar;
        this.f50908d = y32;
        this.f50909e = y33;
        this.f50910f = str;
        this.f50911g = str2;
        this.f50912h = a4Var;
        this.f50913i = str3;
        this.f50914j = map;
        this.f50916l = map2;
        this.f50915k = map3;
    }
}
