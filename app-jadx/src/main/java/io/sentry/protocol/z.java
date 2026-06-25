package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
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
public final class z implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f51161d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            z zVar = new z();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "raw_description":
                        zVar.f51160c = interfaceC5218j1.i1();
                        break;
                    case "name":
                        zVar.f51158a = interfaceC5218j1.i1();
                        break;
                    case "version":
                        zVar.f51159b = interfaceC5218j1.i1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            zVar.g(concurrentHashMap);
            interfaceC5218j1.I();
            return zVar;
        }
    }

    public z() {
    }

    public String d() {
        return this.f51158a;
    }

    public String e() {
        return this.f51159b;
    }

    public void f(String str) {
        this.f51158a = str;
    }

    public void g(Map map) {
        this.f51161d = map;
    }

    public void h(String str) {
        this.f51159b = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51158a != null) {
            interfaceC5223k1.e("name").f(this.f51158a);
        }
        if (this.f51159b != null) {
            interfaceC5223k1.e(DiagnosticsEntry.VERSION_KEY).f(this.f51159b);
        }
        if (this.f51160c != null) {
            interfaceC5223k1.e("raw_description").f(this.f51160c);
        }
        Map map = this.f51161d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51161d.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    z(z zVar) {
        this.f51158a = zVar.f51158a;
        this.f51159b = zVar.f51159b;
        this.f51160c = zVar.f51160c;
        this.f51161d = AbstractC5290c.b(zVar.f51161d);
    }
}
