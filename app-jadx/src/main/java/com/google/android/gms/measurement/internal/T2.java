package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class T2 extends B3 {

    /* JADX INFO: renamed from: k */
    private static final AtomicLong f40968k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c */
    private S2 f40969c;

    /* JADX INFO: renamed from: d */
    private S2 f40970d;

    /* JADX INFO: renamed from: e */
    private final PriorityBlockingQueue f40971e;

    /* JADX INFO: renamed from: f */
    private final BlockingQueue f40972f;

    /* JADX INFO: renamed from: g */
    private final Thread.UncaughtExceptionHandler f40973g;

    /* JADX INFO: renamed from: h */
    private final Thread.UncaughtExceptionHandler f40974h;

    /* JADX INFO: renamed from: i */
    private final Object f40975i;

    /* JADX INFO: renamed from: j */
    private final Semaphore f40976j;

    T2(X2 x22) {
        super(x22);
        this.f40975i = new Object();
        this.f40976j = new Semaphore(2);
        this.f40971e = new PriorityBlockingQueue();
        this.f40972f = new LinkedBlockingQueue();
        this.f40973g = new Q2(this, "Thread death: Uncaught exception on worker thread");
        this.f40974h = new Q2(this, "Thread death: Uncaught exception on network thread");
    }

    private final void F(R2 r22) {
        synchronized (this.f40975i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f40971e;
                priorityBlockingQueue.add(r22);
                S2 s22 = this.f40969c;
                if (s22 == null) {
                    S2 s23 = new S2(this, "Measurement Worker", priorityBlockingQueue);
                    this.f40969c = s23;
                    s23.setUncaughtExceptionHandler(this.f40973g);
                    this.f40969c.start();
                } else {
                    s22.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void A(S2 s22) {
        this.f40970d = null;
    }

    final /* synthetic */ Object B() {
        return this.f40975i;
    }

    final /* synthetic */ Semaphore C() {
        return this.f40976j;
    }

    final /* synthetic */ boolean D() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.A3
    public final void g() {
        if (Thread.currentThread() != this.f40970d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.A3
    public final void h() {
        if (Thread.currentThread() != this.f40969c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.f40969c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f40969c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.f40970d;
    }

    public final Future r(Callable callable) {
        l();
        AbstractC2115p.l(callable);
        R2 r22 = new R2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f40969c) {
            F(r22);
            return r22;
        }
        if (!this.f40971e.isEmpty()) {
            this.f40611a.a().r().a("Callable skipped the worker queue.");
        }
        r22.run();
        return r22;
    }

    public final Future s(Callable callable) {
        l();
        AbstractC2115p.l(callable);
        R2 r22 = new R2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f40969c) {
            r22.run();
            return r22;
        }
        F(r22);
        return r22;
    }

    public final void t(Runnable runnable) {
        l();
        AbstractC2115p.l(runnable);
        F(new R2(this, runnable, false, "Task exception on worker thread"));
    }

    final Object u(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f40611a.b().t(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                C3873o2 c3873o2R = this.f40611a.a().r();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                c3873o2R.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f40611a.a().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) {
        l();
        AbstractC2115p.l(runnable);
        F(new R2(this, runnable, true, "Task exception on worker thread"));
    }

    public final void w(Runnable runnable) {
        l();
        AbstractC2115p.l(runnable);
        R2 r22 = new R2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f40975i) {
            try {
                BlockingQueue blockingQueue = this.f40972f;
                blockingQueue.add(r22);
                S2 s22 = this.f40970d;
                if (s22 == null) {
                    S2 s23 = new S2(this, "Measurement Network", blockingQueue);
                    this.f40970d = s23;
                    s23.setUncaughtExceptionHandler(this.f40974h);
                    this.f40970d.start();
                } else {
                    s22.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ S2 x() {
        return this.f40969c;
    }

    final /* synthetic */ void y(S2 s22) {
        this.f40969c = null;
    }

    final /* synthetic */ S2 z() {
        return this.f40970d;
    }
}
