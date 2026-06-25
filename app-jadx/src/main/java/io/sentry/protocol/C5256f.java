package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5256f implements B0 {

    /* JADX INFO: renamed from: a */
    private String f51049a;

    /* JADX INFO: renamed from: b */
    private boolean f51050b;

    /* JADX INFO: renamed from: c */
    private Map f51051c;

    /* JADX INFO: renamed from: io.sentry.protocol.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public C5256f a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            String strI1 = null;
            Boolean boolW0 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("result")) {
                    boolW0 = interfaceC5218j1.w0();
                } else if (strR0.equals("flag")) {
                    strI1 = interfaceC5218j1.i1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            if (strI1 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"flag\"", illegalStateException);
                throw illegalStateException;
            }
            if (boolW0 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"result\"", illegalStateException2);
                throw illegalStateException2;
            }
            C5256f c5256f = new C5256f(strI1, boolW0.booleanValue());
            c5256f.c(concurrentHashMap);
            interfaceC5218j1.I();
            return c5256f;
        }
    }

    public C5256f(String str, boolean z10) {
        this.f51049a = str;
        this.f51050b = z10;
    }

    public String a() {
        return this.f51049a;
    }

    public Boolean b() {
        return Boolean.valueOf(this.f51050b);
    }

    public void c(Map map) {
        this.f51051c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5256f.class == obj.getClass()) {
            C5256f c5256f = (C5256f) obj;
            if (io.sentry.util.w.a(this.f51049a, c5256f.f51049a) && io.sentry.util.w.a(Boolean.valueOf(this.f51050b), Boolean.valueOf(c5256f.f51050b))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f51049a, Boolean.valueOf(this.f51050b));
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("flag").f(this.f51049a);
        interfaceC5223k1.e("result").d(this.f51050b);
        Map map = this.f51051c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51051c.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
