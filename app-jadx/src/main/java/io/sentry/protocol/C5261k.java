package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5261k implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Number f51075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f51077c;

    /* JADX INFO: renamed from: io.sentry.protocol.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5261k a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            Number number = null;
            String strI1 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("unit")) {
                    strI1 = interfaceC5218j1.i1();
                } else if (strR0.equals("value")) {
                    number = (Number) interfaceC5218j1.N1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            interfaceC5218j1.I();
            if (number != null) {
                C5261k c5261k = new C5261k(number, strI1);
                c5261k.a(concurrentHashMap);
                return c5261k;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.b(EnumC5215i3.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C5261k(Number number, String str) {
        this.f51075a = number;
        this.f51076b = str;
    }

    public void a(Map map) {
        this.f51077c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("value").i(this.f51075a);
        if (this.f51076b != null) {
            interfaceC5223k1.e("unit").f(this.f51076b);
        }
        Map map = this.f51077c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51077c.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }
}
