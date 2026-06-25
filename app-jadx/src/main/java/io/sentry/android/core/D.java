package io.sentry.android.core;

import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5182c0;
import io.sentry.android.core.C5123c0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class D extends io.sentry.metrics.g implements C5123c0.a {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D.this.d(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS);
        }
    }

    public D(C5322z3 c5322z3, InterfaceC5182c0 interfaceC5182c0) {
        super(c5322z3, interfaceC5182c0);
        C5123c0.l().h(this);
    }

    @Override // io.sentry.android.core.C5123c0.a
    public void b() {
        try {
            this.f50846a.getExecutorService().submit(new a());
        } catch (Throwable th2) {
            this.f50846a.getLogger().a(EnumC5215i3.ERROR, th2, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }

    @Override // io.sentry.metrics.g, io.sentry.metrics.c
    public void c(boolean z10) {
        C5123c0.l().q(this);
        super.c(z10);
    }

    @Override // io.sentry.android.core.C5123c0.a
    public void a() {
    }
}
