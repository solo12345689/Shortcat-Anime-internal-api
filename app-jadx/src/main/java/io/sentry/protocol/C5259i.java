package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5259i implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f51064d;

    /* JADX INFO: renamed from: io.sentry.protocol.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5259i a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            C5259i c5259i = new C5259i();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "region":
                        c5259i.f51063c = interfaceC5218j1.i1();
                        break;
                    case "city":
                        c5259i.f51061a = interfaceC5218j1.i1();
                        break;
                    case "country_code":
                        c5259i.f51062b = interfaceC5218j1.i1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            c5259i.g(concurrentHashMap);
            interfaceC5218j1.I();
            return c5259i;
        }
    }

    public void d(String str) {
        this.f51061a = str;
    }

    public void e(String str) {
        this.f51062b = str;
    }

    public void f(String str) {
        this.f51063c = str;
    }

    public void g(Map map) {
        this.f51064d = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51061a != null) {
            interfaceC5223k1.e("city").f(this.f51061a);
        }
        if (this.f51062b != null) {
            interfaceC5223k1.e("country_code").f(this.f51062b);
        }
        if (this.f51063c != null) {
            interfaceC5223k1.e("region").f(this.f51063c);
        }
        Map map = this.f51064d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51064d.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }
}
