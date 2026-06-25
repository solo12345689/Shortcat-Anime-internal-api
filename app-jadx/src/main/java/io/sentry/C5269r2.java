package io.sentry;

import io.sentry.f4;
import io.sentry.protocol.r;
import io.sentry.protocol.x;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.r2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5269r2 implements B0 {

    /* JADX INFO: renamed from: a */
    private final io.sentry.protocol.x f51193a;

    /* JADX INFO: renamed from: b */
    private final io.sentry.protocol.r f51194b;

    /* JADX INFO: renamed from: c */
    private final f4 f51195c;

    /* JADX INFO: renamed from: d */
    private Date f51196d;

    /* JADX INFO: renamed from: e */
    private Map f51197e;

    /* JADX INFO: renamed from: io.sentry.r2$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public C5269r2 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            io.sentry.protocol.x xVar = null;
            io.sentry.protocol.r rVar = null;
            f4 f4Var = null;
            Date dateU0 = null;
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "sdk":
                        rVar = (io.sentry.protocol.r) interfaceC5218j1.C0(iLogger, new r.a());
                        break;
                    case "trace":
                        f4Var = (f4) interfaceC5218j1.C0(iLogger, new f4.a());
                        break;
                    case "event_id":
                        xVar = (io.sentry.protocol.x) interfaceC5218j1.C0(iLogger, new x.a());
                        break;
                    case "sent_at":
                        dateU0 = interfaceC5218j1.u0(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC5218j1.l1(iLogger, map, strR0);
                        break;
                }
            }
            C5269r2 c5269r2 = new C5269r2(xVar, rVar, f4Var);
            c5269r2.d(dateU0);
            c5269r2.e(map);
            interfaceC5218j1.I();
            return c5269r2;
        }
    }

    public C5269r2(io.sentry.protocol.x xVar, io.sentry.protocol.r rVar) {
        this(xVar, rVar, null);
    }

    public io.sentry.protocol.x a() {
        return this.f51193a;
    }

    public io.sentry.protocol.r b() {
        return this.f51194b;
    }

    public f4 c() {
        return this.f51195c;
    }

    public void d(Date date) {
        this.f51196d = date;
    }

    public void e(Map map) {
        this.f51197e = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51193a != null) {
            interfaceC5223k1.e("event_id").j(iLogger, this.f51193a);
        }
        if (this.f51194b != null) {
            interfaceC5223k1.e("sdk").j(iLogger, this.f51194b);
        }
        if (this.f51195c != null) {
            interfaceC5223k1.e("trace").j(iLogger, this.f51195c);
        }
        if (this.f51196d != null) {
            interfaceC5223k1.e("sent_at").j(iLogger, AbstractC5226l.h(this.f51196d));
        }
        Map map = this.f51197e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51197e.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public C5269r2(io.sentry.protocol.x xVar, io.sentry.protocol.r rVar, f4 f4Var) {
        this.f51193a = xVar;
        this.f51194b = rVar;
        this.f51195c = f4Var;
    }
}
