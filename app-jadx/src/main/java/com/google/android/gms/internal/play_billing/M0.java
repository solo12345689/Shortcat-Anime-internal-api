package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class M0 extends AbstractC3751x0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private G0 f40228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ScheduledFuture f40229i;

    private M0(G0 g02) {
        this.f40228h = g02;
    }

    static G0 z(G0 g02, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        M0 m02 = new M0(g02);
        J0 j02 = new J0(m02);
        m02.f40229i = scheduledExecutorService.schedule(j02, 28500L, timeUnit);
        g02.p(j02, EnumC3747w0.INSTANCE);
        return m02;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3689k0
    protected final String m() {
        G0 g02 = this.f40228h;
        ScheduledFuture scheduledFuture = this.f40229i;
        if (g02 == null) {
            return null;
        }
        String str = "inputFuture=[" + g02.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3689k0
    protected final void o() {
        G0 g02 = this.f40228h;
        if ((this.f40539a instanceof C3664f0) & (g02 != null)) {
            Object obj = this.f40539a;
            g02.cancel((obj instanceof C3664f0) && ((C3664f0) obj).f40457a);
        }
        ScheduledFuture scheduledFuture = this.f40229i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f40228h = null;
        this.f40229i = null;
    }
}
