package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class J0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    M0 f40214a;

    J0(M0 m02) {
        this.f40214a = m02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G0 g02;
        M0 m02 = this.f40214a;
        if (m02 == null || (g02 = m02.f40228h) == null) {
            return;
        }
        this.f40214a = null;
        if (g02.isDone()) {
            m02.s(g02);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = m02.f40229i;
            m02.f40229i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    m02.r(new K0(str, null));
                    throw th2;
                }
            }
            m02.r(new K0(str + ": " + g02.toString(), null));
        } finally {
            g02.cancel(true);
        }
    }
}
