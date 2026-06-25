package io.sentry.rrweb;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.rrweb.c;
import io.sentry.util.w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    private c f51278a;

    /* JADX INFO: renamed from: b */
    private long f51279b = System.currentTimeMillis();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public boolean a(b bVar, String str, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            str.getClass();
            if (str.equals("type")) {
                bVar.f51278a = (c) w.c((c) interfaceC5218j1.C0(iLogger, new c.a()), "");
                return true;
            }
            if (!str.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                return false;
            }
            bVar.f51279b = interfaceC5218j1.nextLong();
            return true;
        }
    }

    /* JADX INFO: renamed from: io.sentry.rrweb.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0804b {
        public void a(b bVar, InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
            interfaceC5223k1.e("type").j(iLogger, bVar.f51278a);
            interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).a(bVar.f51279b);
        }
    }

    protected b(c cVar) {
        this.f51278a = cVar;
    }

    public long e() {
        return this.f51279b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f51279b == bVar.f51279b && this.f51278a == bVar.f51278a;
    }

    public void f(long j10) {
        this.f51279b = j10;
    }

    public int hashCode() {
        return w.b(this.f51278a, Long.valueOf(this.f51279b));
    }
}
