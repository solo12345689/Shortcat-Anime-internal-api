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
public final class n implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f51097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f51099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f51100g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "rooted":
                        nVar.f51099f = interfaceC5218j1.w0();
                        break;
                    case "raw_description":
                        nVar.f51096c = interfaceC5218j1.i1();
                        break;
                    case "name":
                        nVar.f51094a = interfaceC5218j1.i1();
                        break;
                    case "build":
                        nVar.f51097d = interfaceC5218j1.i1();
                        break;
                    case "version":
                        nVar.f51095b = interfaceC5218j1.i1();
                        break;
                    case "kernel_version":
                        nVar.f51098e = interfaceC5218j1.i1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            nVar.l(concurrentHashMap);
            interfaceC5218j1.I();
            return nVar;
        }
    }

    public n() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (io.sentry.util.w.a(this.f51094a, nVar.f51094a) && io.sentry.util.w.a(this.f51095b, nVar.f51095b) && io.sentry.util.w.a(this.f51096c, nVar.f51096c) && io.sentry.util.w.a(this.f51097d, nVar.f51097d) && io.sentry.util.w.a(this.f51098e, nVar.f51098e) && io.sentry.util.w.a(this.f51099f, nVar.f51099f)) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        return this.f51094a;
    }

    public void h(String str) {
        this.f51097d = str;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f51094a, this.f51095b, this.f51096c, this.f51097d, this.f51098e, this.f51099f);
    }

    public void i(String str) {
        this.f51098e = str;
    }

    public void j(String str) {
        this.f51094a = str;
    }

    public void k(Boolean bool) {
        this.f51099f = bool;
    }

    public void l(Map map) {
        this.f51100g = map;
    }

    public void m(String str) {
        this.f51095b = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51094a != null) {
            interfaceC5223k1.e("name").f(this.f51094a);
        }
        if (this.f51095b != null) {
            interfaceC5223k1.e(DiagnosticsEntry.VERSION_KEY).f(this.f51095b);
        }
        if (this.f51096c != null) {
            interfaceC5223k1.e("raw_description").f(this.f51096c);
        }
        if (this.f51097d != null) {
            interfaceC5223k1.e("build").f(this.f51097d);
        }
        if (this.f51098e != null) {
            interfaceC5223k1.e("kernel_version").f(this.f51098e);
        }
        if (this.f51099f != null) {
            interfaceC5223k1.e("rooted").k(this.f51099f);
        }
        Map map = this.f51100g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51100g.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    n(n nVar) {
        this.f51094a = nVar.f51094a;
        this.f51095b = nVar.f51095b;
        this.f51096c = nVar.f51096c;
        this.f51097d = nVar.f51097d;
        this.f51098e = nVar.f51098e;
        this.f51099f = nVar.f51099f;
        this.f51100g = AbstractC5290c.b(nVar.f51100g);
    }
}
