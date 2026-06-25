package io.sentry;

import io.sentry.C5250p3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.q3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5266q3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f51169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f51170b;

    /* JADX INFO: renamed from: io.sentry.q3$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5266q3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            List listT1 = null;
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("items")) {
                    listT1 = interfaceC5218j1.T1(iLogger, new C5250p3.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            interfaceC5218j1.I();
            if (listT1 != null) {
                C5266q3 c5266q3 = new C5266q3(listT1);
                c5266q3.b(map);
                return c5266q3;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            iLogger.b(EnumC5215i3.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C5266q3(List list) {
        this.f51169a = list;
    }

    public List a() {
        return this.f51169a;
    }

    public void b(Map map) {
        this.f51170b = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("items").j(iLogger, this.f51169a);
        Map map = this.f51170b;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51170b.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
