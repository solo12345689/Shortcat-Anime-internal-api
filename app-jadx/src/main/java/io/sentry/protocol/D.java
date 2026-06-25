package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.B0;
import io.sentry.C5220j3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.protocol.C;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class D implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f50946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f50947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f50950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f50951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f50952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f50953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C f50954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f50955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f50956k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public D a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            D d10 = new D();
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "daemon":
                        d10.f50952g = interfaceC5218j1.w0();
                        break;
                    case "priority":
                        d10.f50947b = interfaceC5218j1.b1();
                        break;
                    case "held_locks":
                        Map mapK1 = interfaceC5218j1.k1(iLogger, new C5220j3.a());
                        if (mapK1 == null) {
                            break;
                        } else {
                            d10.f50955j = new HashMap(mapK1);
                            break;
                        }
                        break;
                    case "id":
                        d10.f50946a = interfaceC5218j1.d1();
                        break;
                    case "main":
                        d10.f50953h = interfaceC5218j1.w0();
                        break;
                    case "name":
                        d10.f50948c = interfaceC5218j1.i1();
                        break;
                    case "state":
                        d10.f50949d = interfaceC5218j1.i1();
                        break;
                    case "crashed":
                        d10.f50950e = interfaceC5218j1.w0();
                        break;
                    case "current":
                        d10.f50951f = interfaceC5218j1.w0();
                        break;
                    case "stacktrace":
                        d10.f50954i = (C) interfaceC5218j1.C0(iLogger, new C.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            d10.A(concurrentHashMap);
            interfaceC5218j1.I();
            return d10;
        }
    }

    public void A(Map map) {
        this.f50956k = map;
    }

    public Map k() {
        return this.f50955j;
    }

    public Long l() {
        return this.f50946a;
    }

    public String m() {
        return this.f50948c;
    }

    public C n() {
        return this.f50954i;
    }

    public Boolean o() {
        return this.f50951f;
    }

    public Boolean p() {
        return this.f50953h;
    }

    public void q(Boolean bool) {
        this.f50950e = bool;
    }

    public void r(Boolean bool) {
        this.f50951f = bool;
    }

    public void s(Boolean bool) {
        this.f50952g = bool;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f50946a != null) {
            interfaceC5223k1.e(DiagnosticsEntry.ID_KEY).i(this.f50946a);
        }
        if (this.f50947b != null) {
            interfaceC5223k1.e("priority").i(this.f50947b);
        }
        if (this.f50948c != null) {
            interfaceC5223k1.e("name").f(this.f50948c);
        }
        if (this.f50949d != null) {
            interfaceC5223k1.e("state").f(this.f50949d);
        }
        if (this.f50950e != null) {
            interfaceC5223k1.e("crashed").k(this.f50950e);
        }
        if (this.f50951f != null) {
            interfaceC5223k1.e("current").k(this.f50951f);
        }
        if (this.f50952g != null) {
            interfaceC5223k1.e("daemon").k(this.f50952g);
        }
        if (this.f50953h != null) {
            interfaceC5223k1.e("main").k(this.f50953h);
        }
        if (this.f50954i != null) {
            interfaceC5223k1.e("stacktrace").j(iLogger, this.f50954i);
        }
        if (this.f50955j != null) {
            interfaceC5223k1.e("held_locks").j(iLogger, this.f50955j);
        }
        Map map = this.f50956k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50956k.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public void t(Map map) {
        this.f50955j = map;
    }

    public void u(Long l10) {
        this.f50946a = l10;
    }

    public void v(Boolean bool) {
        this.f50953h = bool;
    }

    public void w(String str) {
        this.f50948c = str;
    }

    public void x(Integer num) {
        this.f50947b = num;
    }

    public void y(C c10) {
        this.f50954i = c10;
    }

    public void z(String str) {
        this.f50949d = str;
    }
}
