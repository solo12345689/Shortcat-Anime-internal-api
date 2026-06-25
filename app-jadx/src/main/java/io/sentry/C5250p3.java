package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C5230l3;
import io.sentry.Y3;
import io.sentry.protocol.x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.p3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5250p3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f50889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Y3 f50890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Double f50891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f50893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f50894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Double f50895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f50896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f50897i;

    /* JADX INFO: renamed from: io.sentry.p3$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5250p3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            HashMap map = null;
            io.sentry.protocol.x xVar = null;
            Double dQ0 = null;
            String strI1 = null;
            String strI12 = null;
            Double dQ02 = null;
            Map mapK1 = null;
            Y3 y32 = null;
            String strI13 = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "span_id":
                        y32 = (Y3) interfaceC5218j1.C0(iLogger, new Y3.a());
                        break;
                    case "name":
                        strI1 = interfaceC5218j1.i1();
                        break;
                    case "type":
                        strI12 = interfaceC5218j1.i1();
                        break;
                    case "unit":
                        strI13 = interfaceC5218j1.i1();
                        break;
                    case "timestamp":
                        dQ0 = interfaceC5218j1.q0();
                        break;
                    case "value":
                        dQ02 = interfaceC5218j1.q0();
                        break;
                    case "attributes":
                        mapK1 = interfaceC5218j1.k1(iLogger, new C5230l3.a());
                        break;
                    case "trace_id":
                        xVar = (io.sentry.protocol.x) interfaceC5218j1.C0(iLogger, new x.a());
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC5218j1.l1(iLogger, map, strR0);
                        break;
                }
            }
            interfaceC5218j1.I();
            if (xVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (dQ0 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strI12 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"type\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"type\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (strI1 == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"name\"", illegalStateException4);
                throw illegalStateException4;
            }
            if (dQ02 == null) {
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"value\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"value\"", illegalStateException5);
                throw illegalStateException5;
            }
            C5250p3 c5250p3 = new C5250p3(xVar, dQ0, strI1, strI12, dQ02);
            c5250p3.a(mapK1);
            c5250p3.b(y32);
            c5250p3.c(strI13);
            c5250p3.d(map);
            return c5250p3;
        }
    }

    public C5250p3(io.sentry.protocol.x xVar, Double d10, String str, String str2, Double d11) {
        this.f50889a = xVar;
        this.f50891c = d10;
        this.f50892d = str;
        this.f50894f = str2;
        this.f50895g = d11;
    }

    public void a(Map map) {
        this.f50896h = map;
    }

    public void b(Y3 y32) {
        this.f50890b = y32;
    }

    public void c(String str) {
        this.f50893e = str;
    }

    public void d(Map map) {
        this.f50897i = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, AbstractC5226l.c(this.f50891c));
        interfaceC5223k1.e("type").f(this.f50894f);
        interfaceC5223k1.e("name").f(this.f50892d);
        interfaceC5223k1.e("value").i(this.f50895g);
        interfaceC5223k1.e("trace_id").j(iLogger, this.f50889a);
        if (this.f50890b != null) {
            interfaceC5223k1.e("span_id").j(iLogger, this.f50890b);
        }
        if (this.f50893e != null) {
            interfaceC5223k1.e("unit").j(iLogger, this.f50893e);
        }
        if (this.f50896h != null) {
            interfaceC5223k1.e("attributes").j(iLogger, this.f50896h);
        }
        Map map = this.f50897i;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f50897i.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
