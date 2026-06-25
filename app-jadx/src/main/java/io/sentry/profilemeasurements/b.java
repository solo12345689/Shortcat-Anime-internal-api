package io.sentry.profilemeasurements;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC5226l;
import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.util.w;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f50901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f50902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f50904d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            Double dValueOf;
            interfaceC5218j1.x();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "elapsed_since_start_ns":
                        String strI1 = interfaceC5218j1.i1();
                        if (strI1 == null) {
                            break;
                        } else {
                            bVar.f50903c = strI1;
                            break;
                        }
                        break;
                    case "timestamp":
                        try {
                            dValueOf = interfaceC5218j1.q0();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateU0 = interfaceC5218j1.u0(iLogger);
                            dValueOf = dateU0 != null ? Double.valueOf(AbstractC5226l.b(dateU0)) : null;
                        }
                        if (dValueOf == null) {
                            break;
                        } else {
                            bVar.f50902b = dValueOf.doubleValue();
                            break;
                        }
                        break;
                    case "value":
                        Double dQ0 = interfaceC5218j1.q0();
                        if (dQ0 == null) {
                            break;
                        } else {
                            bVar.f50904d = dQ0.doubleValue();
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
            bVar.e(concurrentHashMap);
            interfaceC5218j1.I();
            return bVar;
        }
    }

    public b() {
        this(0L, 0, 0L);
    }

    private BigDecimal d(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void e(Map map) {
        this.f50901a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (w.a(this.f50901a, bVar.f50901a) && this.f50903c.equals(bVar.f50903c) && this.f50904d == bVar.f50904d && this.f50902b == bVar.f50902b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return w.b(this.f50901a, this.f50903c, Double.valueOf(this.f50904d));
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("value").j(iLogger, Double.valueOf(this.f50904d));
        interfaceC5223k1.e("elapsed_since_start_ns").j(iLogger, this.f50903c);
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, d(Double.valueOf(this.f50902b)));
        Map map = this.f50901a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50901a.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public b(Long l10, Number number, long j10) {
        this.f50903c = l10.toString();
        this.f50904d = number.doubleValue();
        this.f50902b = AbstractC5226l.m(j10);
    }
}
