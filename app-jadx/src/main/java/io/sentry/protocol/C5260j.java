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

/* JADX INFO: renamed from: io.sentry.protocol.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5260j implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f51066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f51068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f51069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f51070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f51071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f51072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f51073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f51074j;

    /* JADX INFO: renamed from: io.sentry.protocol.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5260j a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            C5260j c5260j = new C5260j();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "npot_support":
                        c5260j.f51073i = interfaceC5218j1.i1();
                        break;
                    case "vendor_id":
                        c5260j.f51067c = interfaceC5218j1.i1();
                        break;
                    case "multi_threaded_rendering":
                        c5260j.f51071g = interfaceC5218j1.w0();
                        break;
                    case "id":
                        c5260j.f51066b = interfaceC5218j1.b1();
                        break;
                    case "name":
                        c5260j.f51065a = interfaceC5218j1.i1();
                        break;
                    case "vendor_name":
                        c5260j.f51068d = interfaceC5218j1.i1();
                        break;
                    case "version":
                        c5260j.f51072h = interfaceC5218j1.i1();
                        break;
                    case "api_type":
                        c5260j.f51070f = interfaceC5218j1.i1();
                        break;
                    case "memory_size":
                        c5260j.f51069e = interfaceC5218j1.b1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            c5260j.j(concurrentHashMap);
            interfaceC5218j1.I();
            return c5260j;
        }
    }

    public C5260j() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5260j.class == obj.getClass()) {
            C5260j c5260j = (C5260j) obj;
            if (io.sentry.util.w.a(this.f51065a, c5260j.f51065a) && io.sentry.util.w.a(this.f51066b, c5260j.f51066b) && io.sentry.util.w.a(this.f51067c, c5260j.f51067c) && io.sentry.util.w.a(this.f51068d, c5260j.f51068d) && io.sentry.util.w.a(this.f51069e, c5260j.f51069e) && io.sentry.util.w.a(this.f51070f, c5260j.f51070f) && io.sentry.util.w.a(this.f51071g, c5260j.f51071g) && io.sentry.util.w.a(this.f51072h, c5260j.f51072h) && io.sentry.util.w.a(this.f51073i, c5260j.f51073i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f51065a, this.f51066b, this.f51067c, this.f51068d, this.f51069e, this.f51070f, this.f51071g, this.f51072h, this.f51073i);
    }

    public void j(Map map) {
        this.f51074j = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51065a != null) {
            interfaceC5223k1.e("name").f(this.f51065a);
        }
        if (this.f51066b != null) {
            interfaceC5223k1.e(DiagnosticsEntry.ID_KEY).i(this.f51066b);
        }
        if (this.f51067c != null) {
            interfaceC5223k1.e("vendor_id").f(this.f51067c);
        }
        if (this.f51068d != null) {
            interfaceC5223k1.e("vendor_name").f(this.f51068d);
        }
        if (this.f51069e != null) {
            interfaceC5223k1.e("memory_size").i(this.f51069e);
        }
        if (this.f51070f != null) {
            interfaceC5223k1.e("api_type").f(this.f51070f);
        }
        if (this.f51071g != null) {
            interfaceC5223k1.e("multi_threaded_rendering").k(this.f51071g);
        }
        if (this.f51072h != null) {
            interfaceC5223k1.e(DiagnosticsEntry.VERSION_KEY).f(this.f51072h);
        }
        if (this.f51073i != null) {
            interfaceC5223k1.e("npot_support").f(this.f51073i);
        }
        Map map = this.f51074j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51074j.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    C5260j(C5260j c5260j) {
        this.f51065a = c5260j.f51065a;
        this.f51066b = c5260j.f51066b;
        this.f51067c = c5260j.f51067c;
        this.f51068d = c5260j.f51068d;
        this.f51069e = c5260j.f51069e;
        this.f51070f = c5260j.f51070f;
        this.f51071g = c5260j.f51071g;
        this.f51072h = c5260j.f51072h;
        this.f51073i = c5260j.f51073i;
        this.f51074j = AbstractC5290c.b(c5260j.f51074j);
    }
}
