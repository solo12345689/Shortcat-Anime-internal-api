package io.sentry.protocol.profiling;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements B0 {

    /* JADX INFO: renamed from: a */
    private String f51128a;

    /* JADX INFO: renamed from: b */
    private int f51129b;

    /* JADX INFO: renamed from: c */
    private Map f51130c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public c a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            c cVar = new c();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("priority")) {
                    cVar.f51129b = interfaceC5218j1.nextInt();
                } else if (strR0.equals("name")) {
                    cVar.f51128a = interfaceC5218j1.i1();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            cVar.c(map);
            interfaceC5218j1.I();
            return cVar;
        }
    }

    public void c(Map map) {
        this.f51130c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51128a != null) {
            interfaceC5223k1.e("name").j(iLogger, this.f51128a);
        }
        interfaceC5223k1.e("priority").j(iLogger, Integer.valueOf(this.f51129b));
        Map map = this.f51130c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51130c.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
