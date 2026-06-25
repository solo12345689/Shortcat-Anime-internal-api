package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.C5230l3;
import io.sentry.EnumC5240n3;
import io.sentry.Y3;
import io.sentry.protocol.x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5225k3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f50792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Y3 f50793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Double f50794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC5240n3 f50796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f50797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f50798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f50799h;

    /* JADX INFO: renamed from: io.sentry.k3$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5225k3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            io.sentry.protocol.x xVar = null;
            Double dQ0 = null;
            String strI1 = null;
            HashMap map = null;
            EnumC5240n3 enumC5240n3 = null;
            Map mapK1 = null;
            Integer numB1 = null;
            Y3 y32 = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "span_id":
                        y32 = (Y3) interfaceC5218j1.C0(iLogger, new Y3.a());
                        break;
                    case "severity_number":
                        numB1 = interfaceC5218j1.b1();
                        break;
                    case "body":
                        strI1 = interfaceC5218j1.i1();
                        break;
                    case "timestamp":
                        dQ0 = interfaceC5218j1.q0();
                        break;
                    case "level":
                        enumC5240n3 = (EnumC5240n3) interfaceC5218j1.C0(iLogger, new EnumC5240n3.a());
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
            if (strI1 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (enumC5240n3 == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            C5225k3 c5225k3 = new C5225k3(xVar, dQ0, strI1, enumC5240n3);
            c5225k3.a(mapK1);
            c5225k3.b(numB1);
            c5225k3.c(y32);
            c5225k3.d(map);
            return c5225k3;
        }
    }

    public C5225k3(io.sentry.protocol.x xVar, Double d10, String str, EnumC5240n3 enumC5240n3) {
        this.f50792a = xVar;
        this.f50794c = d10;
        this.f50795d = str;
        this.f50796e = enumC5240n3;
    }

    public void a(Map map) {
        this.f50798g = map;
    }

    public void b(Integer num) {
        this.f50797f = num;
    }

    public void c(Y3 y32) {
        this.f50793b = y32;
    }

    public void d(Map map) {
        this.f50799h = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, AbstractC5226l.c(this.f50794c));
        interfaceC5223k1.e("trace_id").j(iLogger, this.f50792a);
        if (this.f50793b != null) {
            interfaceC5223k1.e("span_id").j(iLogger, this.f50793b);
        }
        interfaceC5223k1.e("body").f(this.f50795d);
        interfaceC5223k1.e("level").j(iLogger, this.f50796e);
        if (this.f50797f != null) {
            interfaceC5223k1.e("severity_number").j(iLogger, this.f50797f);
        }
        if (this.f50798g != null) {
            interfaceC5223k1.e("attributes").j(iLogger, this.f50798g);
        }
        Map map = this.f50799h;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f50799h.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
