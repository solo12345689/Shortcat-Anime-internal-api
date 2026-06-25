package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class n extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f43172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f43173b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f43174a;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public String toString() {
            return this.f43174a.toString();
        }

        private b(n nVar) {
            this.f43174a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f43172a = new c();
        f43173b = new c();
    }

    n() {
    }

    private void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        b bVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof b;
            if (!z11 && runnable != f43173b) {
                break;
            }
            if (z11) {
                bVar = (b) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f43173b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    abstract void a(Throwable th2);

    abstract void b(Object obj);

    final void c() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.b(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(f43172a)) == f43173b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean d();

    abstract Object e();

    abstract String f();

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th2) {
                    try {
                        v.a(th2);
                        if (!compareAndSet(threadCurrentThread, f43172a)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th2);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, f43172a)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(t.a(null));
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f43172a) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + f();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
