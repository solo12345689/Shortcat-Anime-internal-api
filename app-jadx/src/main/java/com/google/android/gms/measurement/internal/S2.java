package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.os.Process;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class S2 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f40951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ T2 f40953d;

    public S2(T2 t22, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(t22);
        this.f40953d = t22;
        this.f40952c = false;
        AbstractC2115p.l(str);
        AbstractC2115p.l(blockingQueue);
        this.f40950a = new Object();
        this.f40951b = blockingQueue;
        setName(str);
    }

    private final void b() {
        T2 t22 = this.f40953d;
        synchronized (t22.B()) {
            try {
                if (!this.f40952c) {
                    t22.C().release();
                    t22.B().notifyAll();
                    if (this == t22.x()) {
                        t22.y(null);
                    } else if (this == t22.z()) {
                        t22.A(null);
                    } else {
                        t22.f40611a.a().o().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f40952c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f40953d.f40611a.a().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        Object obj = this.f40950a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f40953d.C().acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f40951b;
                R2 r22 = (R2) blockingQueue.poll();
                if (r22 != null) {
                    Process.setThreadPriority(true != r22.f40931b ? 10 : threadPriority);
                    r22.run();
                } else {
                    Object obj = this.f40950a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f40953d.D();
                            try {
                                obj.wait(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    synchronized (this.f40953d.B()) {
                        if (this.f40951b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            b();
            throw th2;
        }
    }
}
