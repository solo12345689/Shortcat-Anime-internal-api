package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class G implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f50968b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public G a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            String strI1 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("source")) {
                    strI1 = interfaceC5218j1.i1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            G g10 = new G(strI1);
            g10.a(concurrentHashMap);
            interfaceC5218j1.I();
            return g10;
        }
    }

    public G(String str) {
        this.f50967a = str;
    }

    public void a(Map map) {
        this.f50968b = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f50967a != null) {
            interfaceC5223k1.e("source").j(iLogger, this.f50967a);
        }
        Map map = this.f50968b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50968b.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }
}
