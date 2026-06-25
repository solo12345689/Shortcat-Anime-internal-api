package io.sentry.clientreport;

import io.sentry.B0;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f50621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f50622d;

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
        public g a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) throws Exception {
            String strR0;
            interfaceC5218j1.x();
            String strI1 = null;
            String strI12 = null;
            Long lD1 = null;
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "quantity":
                        lD1 = interfaceC5218j1.d1();
                        break;
                    case "reason":
                        strI1 = interfaceC5218j1.i1();
                        break;
                    case "category":
                        strI12 = interfaceC5218j1.i1();
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
            if (strI1 == null) {
                throw c("reason", iLogger);
            }
            if (strI12 == null) {
                throw c("category", iLogger);
            }
            if (lD1 == null) {
                throw c("quantity", iLogger);
            }
            g gVar = new g(strI1, strI12, lD1);
            gVar.d(map);
            return gVar;
        }
    }

    public g(String str, String str2, Long l10) {
        this.f50619a = str;
        this.f50620b = str2;
        this.f50621c = l10;
    }

    public String a() {
        return this.f50620b;
    }

    public Long b() {
        return this.f50621c;
    }

    public String c() {
        return this.f50619a;
    }

    public void d(Map map) {
        this.f50622d = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("reason").f(this.f50619a);
        interfaceC5223k1.e("category").f(this.f50620b);
        interfaceC5223k1.e("quantity").i(this.f50621c);
        Map map = this.f50622d;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f50622d.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f50619a + "', category='" + this.f50620b + "', quantity=" + this.f50621c + '}';
    }
}
