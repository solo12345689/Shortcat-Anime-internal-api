package io.sentry;

import io.sentry.protocol.x;
import io.sentry.util.AbstractC5290c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.s1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5273s1 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f51334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f51335b;

    /* JADX INFO: renamed from: io.sentry.s1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5273s1 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            C5273s1 c5273s1 = new C5273s1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("profiler_id")) {
                    io.sentry.protocol.x xVar = (io.sentry.protocol.x) interfaceC5218j1.C0(iLogger, new x.a());
                    if (xVar != null) {
                        c5273s1.f51334a = xVar;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            c5273s1.b(concurrentHashMap);
            interfaceC5218j1.I();
            return c5273s1;
        }
    }

    public C5273s1() {
        this(io.sentry.protocol.x.f51153b);
    }

    public void b(Map map) {
        this.f51335b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5273s1) {
            return this.f51334a.equals(((C5273s1) obj).f51334a);
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f51334a);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("profiler_id").j(iLogger, this.f51334a);
        Map map = this.f51335b;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51335b.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    public C5273s1(io.sentry.protocol.x xVar) {
        this.f51334a = xVar;
    }

    public C5273s1(C5273s1 c5273s1) {
        this.f51334a = c5273s1.f51334a;
        Map mapB = AbstractC5290c.b(c5273s1.f51335b);
        if (mapB != null) {
            this.f51335b = mapB;
        }
    }
}
