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

/* JADX INFO: renamed from: io.sentry.protocol.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5252b implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f51008c;

    /* JADX INFO: renamed from: io.sentry.protocol.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5252b a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            C5252b c5252b = new C5252b();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("name")) {
                    c5252b.f51006a = interfaceC5218j1.i1();
                } else if (strR0.equals(DiagnosticsEntry.VERSION_KEY)) {
                    c5252b.f51007b = interfaceC5218j1.i1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            c5252b.c(concurrentHashMap);
            interfaceC5218j1.I();
            return c5252b;
        }
    }

    public C5252b() {
    }

    public void c(Map map) {
        this.f51008c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5252b.class == obj.getClass()) {
            C5252b c5252b = (C5252b) obj;
            if (io.sentry.util.w.a(this.f51006a, c5252b.f51006a) && io.sentry.util.w.a(this.f51007b, c5252b.f51007b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f51006a, this.f51007b);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51006a != null) {
            interfaceC5223k1.e("name").f(this.f51006a);
        }
        if (this.f51007b != null) {
            interfaceC5223k1.e(DiagnosticsEntry.VERSION_KEY).f(this.f51007b);
        }
        Map map = this.f51008c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51008c.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    C5252b(C5252b c5252b) {
        this.f51006a = c5252b.f51006a;
        this.f51007b = c5252b.f51007b;
        this.f51008c = AbstractC5290c.b(c5252b.f51008c);
    }
}
