package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B0 extends D0 {
    public static G0 a(Object obj) {
        return new E0(obj);
    }

    public static G0 b(G0 g02, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return g02.isDone() ? g02 : M0.z(g02, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void c(G0 g02, InterfaceC3759z0 interfaceC3759z0, Executor executor) {
        g02.p(new A0(g02, interfaceC3759z0), executor);
    }
}
