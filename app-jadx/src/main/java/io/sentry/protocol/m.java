package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f51092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f51093d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "params":
                        List list = (List) interfaceC5218j1.N1();
                        if (list == null) {
                            break;
                        } else {
                            mVar.f51092c = list;
                            break;
                        }
                        break;
                    case "message":
                        mVar.f51091b = interfaceC5218j1.i1();
                        break;
                    case "formatted":
                        mVar.f51090a = interfaceC5218j1.i1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            mVar.g(concurrentHashMap);
            interfaceC5218j1.I();
            return mVar;
        }
    }

    public String d() {
        return this.f51090a;
    }

    public String e() {
        return this.f51091b;
    }

    public void f(String str) {
        this.f51090a = str;
    }

    public void g(Map map) {
        this.f51093d = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51090a != null) {
            interfaceC5223k1.e("formatted").f(this.f51090a);
        }
        if (this.f51091b != null) {
            interfaceC5223k1.e("message").f(this.f51091b);
        }
        List list = this.f51092c;
        if (list != null && !list.isEmpty()) {
            interfaceC5223k1.e("params").j(iLogger, this.f51092c);
        }
        Map map = this.f51093d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51093d.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }
}
