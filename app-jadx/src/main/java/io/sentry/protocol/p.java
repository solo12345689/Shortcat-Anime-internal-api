package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.util.AbstractC5290c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f51114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f51115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f51116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f51117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f51118f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            p pVar = new p();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "status_code":
                        pVar.f51115c = interfaceC5218j1.b1();
                        break;
                    case "data":
                        pVar.f51117e = interfaceC5218j1.N1();
                        break;
                    case "headers":
                        Map map = (Map) interfaceC5218j1.N1();
                        if (map == null) {
                            break;
                        } else {
                            pVar.f51114b = AbstractC5290c.b(map);
                            break;
                        }
                        break;
                    case "cookies":
                        pVar.f51113a = interfaceC5218j1.i1();
                        break;
                    case "body_size":
                        pVar.f51116d = interfaceC5218j1.d1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            pVar.f(concurrentHashMap);
            interfaceC5218j1.I();
            return pVar;
        }
    }

    public p() {
    }

    public void f(Map map) {
        this.f51118f = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51113a != null) {
            interfaceC5223k1.e("cookies").f(this.f51113a);
        }
        if (this.f51114b != null) {
            interfaceC5223k1.e("headers").j(iLogger, this.f51114b);
        }
        if (this.f51115c != null) {
            interfaceC5223k1.e("status_code").j(iLogger, this.f51115c);
        }
        if (this.f51116d != null) {
            interfaceC5223k1.e("body_size").j(iLogger, this.f51116d);
        }
        if (this.f51117e != null) {
            interfaceC5223k1.e("data").j(iLogger, this.f51117e);
        }
        Map map = this.f51118f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51118f.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public p(p pVar) {
        this.f51113a = pVar.f51113a;
        this.f51114b = AbstractC5290c.b(pVar.f51114b);
        this.f51118f = AbstractC5290c.b(pVar.f51118f);
        this.f51115c = pVar.f51115c;
        this.f51116d = pVar.f51116d;
        this.f51117e = pVar.f51117e;
    }
}
