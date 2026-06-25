package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.protocol.C5259i;
import io.sentry.util.AbstractC5290c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class I implements B0 {

    /* JADX INFO: renamed from: a */
    private String f50969a;

    /* JADX INFO: renamed from: b */
    private String f50970b;

    /* JADX INFO: renamed from: c */
    private String f50971c;

    /* JADX INFO: renamed from: d */
    private String f50972d;

    /* JADX INFO: renamed from: e */
    private String f50973e;

    /* JADX INFO: renamed from: f */
    private C5259i f50974f;

    /* JADX INFO: renamed from: g */
    private Map f50975g;

    /* JADX INFO: renamed from: h */
    private Map f50976h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public I a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            I i10 = new I();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "username":
                        i10.f50971c = interfaceC5218j1.i1();
                        break;
                    case "id":
                        i10.f50970b = interfaceC5218j1.i1();
                        break;
                    case "geo":
                        i10.f50974f = new C5259i.a().a(interfaceC5218j1, iLogger);
                        break;
                    case "data":
                        i10.f50975g = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                        break;
                    case "name":
                        i10.f50973e = interfaceC5218j1.i1();
                        break;
                    case "email":
                        i10.f50969a = interfaceC5218j1.i1();
                        break;
                    case "ip_address":
                        i10.f50972d = interfaceC5218j1.i1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            i10.q(concurrentHashMap);
            interfaceC5218j1.I();
            return i10;
        }
    }

    public I() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I.class == obj.getClass()) {
            I i10 = (I) obj;
            if (io.sentry.util.w.a(this.f50969a, i10.f50969a) && io.sentry.util.w.a(this.f50970b, i10.f50970b) && io.sentry.util.w.a(this.f50971c, i10.f50971c) && io.sentry.util.w.a(this.f50972d, i10.f50972d)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f50969a;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f50969a, this.f50970b, this.f50971c, this.f50972d);
    }

    public String i() {
        return this.f50970b;
    }

    public String j() {
        return this.f50972d;
    }

    public String k() {
        return this.f50971c;
    }

    public void l(Map map) {
        this.f50975g = AbstractC5290c.b(map);
    }

    public void m(String str) {
        this.f50969a = str;
    }

    public void n(C5259i c5259i) {
        this.f50974f = c5259i;
    }

    public void o(String str) {
        this.f50970b = str;
    }

    public void p(String str) {
        this.f50972d = str;
    }

    public void q(Map map) {
        this.f50976h = map;
    }

    public void r(String str) {
        this.f50971c = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f50969a != null) {
            interfaceC5223k1.e("email").f(this.f50969a);
        }
        if (this.f50970b != null) {
            interfaceC5223k1.e(DiagnosticsEntry.ID_KEY).f(this.f50970b);
        }
        if (this.f50971c != null) {
            interfaceC5223k1.e("username").f(this.f50971c);
        }
        if (this.f50972d != null) {
            interfaceC5223k1.e("ip_address").f(this.f50972d);
        }
        if (this.f50973e != null) {
            interfaceC5223k1.e("name").f(this.f50973e);
        }
        if (this.f50974f != null) {
            interfaceC5223k1.e("geo");
            this.f50974f.serialize(interfaceC5223k1, iLogger);
        }
        if (this.f50975g != null) {
            interfaceC5223k1.e("data").j(iLogger, this.f50975g);
        }
        Map map = this.f50976h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50976h.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public I(I i10) {
        this.f50969a = i10.f50969a;
        this.f50971c = i10.f50971c;
        this.f50970b = i10.f50970b;
        this.f50972d = i10.f50972d;
        this.f50973e = i10.f50973e;
        this.f50974f = i10.f50974f;
        this.f50975g = AbstractC5290c.b(i10.f50975g);
        this.f50976h = AbstractC5290c.b(i10.f50976h);
    }
}
