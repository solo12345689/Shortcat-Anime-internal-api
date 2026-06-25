package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.B0;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements B0 {

    /* JADX INFO: renamed from: a */
    private String f51155a;

    /* JADX INFO: renamed from: b */
    private String f51156b;

    /* JADX INFO: renamed from: c */
    private Map f51157c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public y a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            String strX0 = null;
            String strX02 = null;
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("name")) {
                    strX0 = interfaceC5218j1.X0();
                } else if (strR0.equals(DiagnosticsEntry.VERSION_KEY)) {
                    strX02 = interfaceC5218j1.X0();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            interfaceC5218j1.I();
            if (strX0 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strX02 != null) {
                y yVar = new y(strX0, strX02);
                yVar.c(map);
                return yVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.b(EnumC5215i3.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public y(String str, String str2) {
        this.f51155a = (String) io.sentry.util.w.c(str, "name is required.");
        this.f51156b = (String) io.sentry.util.w.c(str2, "version is required.");
    }

    public String a() {
        return this.f51155a;
    }

    public String b() {
        return this.f51156b;
    }

    public void c(Map map) {
        this.f51157c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (Objects.equals(this.f51155a, yVar.f51155a) && Objects.equals(this.f51156b, yVar.f51156b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f51155a, this.f51156b);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("name").f(this.f51155a);
        interfaceC5223k1.e(DiagnosticsEntry.VERSION_KEY).f(this.f51156b);
        Map map = this.f51157c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51157c.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
