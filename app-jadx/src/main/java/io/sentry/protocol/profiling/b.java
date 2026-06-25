package io.sentry.protocol.profiling;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements B0 {

    /* JADX INFO: renamed from: a */
    private double f51124a;

    /* JADX INFO: renamed from: b */
    private int f51125b;

    /* JADX INFO: renamed from: c */
    private String f51126c;

    /* JADX INFO: renamed from: d */
    private Map f51127d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public b a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            b bVar = new b();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "thread_id":
                        bVar.f51126c = interfaceC5218j1.i1();
                        break;
                    case "timestamp":
                        bVar.f51124a = interfaceC5218j1.nextDouble();
                        break;
                    case "stack_id":
                        bVar.f51125b = interfaceC5218j1.nextInt();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC5218j1.l1(iLogger, map, strR0);
                        break;
                }
            }
            bVar.e(map);
            interfaceC5218j1.I();
            return bVar;
        }
    }

    private BigDecimal d(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void e(Map map) {
        this.f51127d = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, d(Double.valueOf(this.f51124a)));
        interfaceC5223k1.e("stack_id").j(iLogger, Integer.valueOf(this.f51125b));
        if (this.f51126c != null) {
            interfaceC5223k1.e("thread_id").j(iLogger, this.f51126c);
        }
        Map map = this.f51127d;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51127d.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
