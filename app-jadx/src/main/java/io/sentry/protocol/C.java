package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.protocol.B;
import io.sentry.util.AbstractC5290c;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C implements B0 {

    /* JADX INFO: renamed from: a */
    private List f50941a;

    /* JADX INFO: renamed from: b */
    private Map f50942b;

    /* JADX INFO: renamed from: c */
    private Boolean f50943c;

    /* JADX INFO: renamed from: d */
    private b f50944d;

    /* JADX INFO: renamed from: e */
    private Map f50945e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public C a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            C c10 = new C();
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "frames":
                        c10.f50941a = interfaceC5218j1.T1(iLogger, new B.a());
                        break;
                    case "instruction_addr_adjustment":
                        c10.f50944d = (b) interfaceC5218j1.C0(iLogger, new b.a());
                        break;
                    case "registers":
                        c10.f50942b = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                        break;
                    case "snapshot":
                        c10.f50943c = interfaceC5218j1.w0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            c10.j(concurrentHashMap);
            interfaceC5218j1.I();
            return c10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b implements B0 {
        AUTO,
        ALL,
        ALL_BUT_FIRST,
        NONE;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements InterfaceC5267r0 {
            @Override // io.sentry.InterfaceC5267r0
            /* JADX INFO: renamed from: b */
            public b a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
                return b.valueOf(interfaceC5218j1.X0().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.B0
        public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
            interfaceC5223k1.f(toString().toLowerCase(Locale.ROOT));
        }
    }

    public C() {
    }

    public List e() {
        return this.f50941a;
    }

    public void f(List list) {
        this.f50941a = list;
    }

    public void g(b bVar) {
        this.f50944d = bVar;
    }

    public void h(Map map) {
        this.f50942b = map;
    }

    public void i(Boolean bool) {
        this.f50943c = bool;
    }

    public void j(Map map) {
        this.f50945e = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f50941a != null) {
            interfaceC5223k1.e("frames").j(iLogger, this.f50941a);
        }
        if (this.f50942b != null) {
            interfaceC5223k1.e("registers").j(iLogger, this.f50942b);
        }
        if (this.f50943c != null) {
            interfaceC5223k1.e("snapshot").k(this.f50943c);
        }
        if (this.f50944d != null) {
            interfaceC5223k1.e("instruction_addr_adjustment").j(iLogger, this.f50944d);
        }
        Map map = this.f50945e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50945e.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public C(List list) {
        this.f50941a = list;
    }
}
