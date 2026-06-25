package Gf;

import Lf.AbstractC1894a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Gf.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1635t0 extends AbstractC1633s0 implements Y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f7611d;

    public C1635t0(Executor executor) {
        this.f7611d = executor;
        AbstractC1894a.a(b2());
    }

    private final void c2(Zd.i iVar, RejectedExecutionException rejectedExecutionException) {
        F0.d(iVar, AbstractC1630q0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture d2(ScheduledExecutorService scheduledExecutorService, Runnable runnable, Zd.i iVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            c2(iVar, e10);
            return null;
        }
    }

    @Override // Gf.Y
    public InterfaceC1612h0 B0(long j10, Runnable runnable, Zd.i iVar) {
        long j11;
        Runnable runnable2;
        Zd.i iVar2;
        Executor executorB2 = b2();
        ScheduledFuture scheduledFutureD2 = null;
        ScheduledExecutorService scheduledExecutorService = executorB2 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorB2 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            iVar2 = iVar;
            scheduledFutureD2 = d2(scheduledExecutorService, runnable2, iVar2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            iVar2 = iVar;
        }
        return scheduledFutureD2 != null ? new C1610g0(scheduledFutureD2) : U.f7538i.B0(j11, runnable2, iVar2);
    }

    @Override // Gf.K
    public void D1(Zd.i iVar, Runnable runnable) {
        try {
            Executor executorB2 = b2();
            AbstractC1601c.a();
            executorB2.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC1601c.a();
            c2(iVar, e10);
            C1608f0.b().D1(iVar, runnable);
        }
    }

    @Override // Gf.Y
    public void G0(long j10, InterfaceC1623n interfaceC1623n) {
        long j11;
        Executor executorB2 = b2();
        ScheduledFuture scheduledFutureD2 = null;
        ScheduledExecutorService scheduledExecutorService = executorB2 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorB2 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureD2 = d2(scheduledExecutorService, new U0(this, interfaceC1623n), interfaceC1623n.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureD2 != null) {
            r.c(interfaceC1623n, new C1619l(scheduledFutureD2));
        } else {
            U.f7538i.G0(j11, interfaceC1623n);
        }
    }

    @Override // Gf.AbstractC1633s0
    public Executor b2() {
        return this.f7611d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorB2 = b2();
        ExecutorService executorService = executorB2 instanceof ExecutorService ? (ExecutorService) executorB2 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1635t0) && ((C1635t0) obj).b2() == b2();
    }

    public int hashCode() {
        return System.identityHashCode(b2());
    }

    @Override // Gf.K
    public String toString() {
        return b2().toString();
    }
}
