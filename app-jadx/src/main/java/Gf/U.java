package Gf;

import Gf.AbstractC1622m0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class U extends AbstractC1622m0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final U f7538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f7539j;

    static {
        Long l10;
        U u10 = new U();
        f7538i = u10;
        AbstractC1620l0.h2(u10, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f7539j = timeUnit.toNanos(l10.longValue());
    }

    private U() {
    }

    private final synchronized void H2() {
        if (K2()) {
            debugStatus = 3;
            B2();
            AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread I2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f7538i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean J2() {
        return debugStatus == 4;
    }

    private final boolean K2() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean L2() {
        if (K2()) {
            return false;
        }
        debugStatus = 1;
        AbstractC5504s.f(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void M2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Gf.AbstractC1622m0, Gf.Y
    public InterfaceC1612h0 B0(long j10, Runnable runnable, Zd.i iVar) {
        return E2(j10, runnable);
    }

    @Override // Gf.AbstractC1624n0
    protected Thread n2() {
        Thread thread = _thread;
        return thread == null ? I2() : thread;
    }

    @Override // Gf.AbstractC1624n0
    protected void o2(long j10, AbstractC1622m0.c cVar) {
        M2();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zZ2;
        Z0.f7544a.d(this);
        AbstractC1601c.a();
        try {
            if (!L2()) {
                if (zZ2) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jK2 = k2();
                if (jK2 == Long.MAX_VALUE) {
                    AbstractC1601c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f7539j + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        H2();
                        AbstractC1601c.a();
                        if (z2()) {
                            return;
                        }
                        n2();
                        return;
                    }
                    jK2 = AbstractC5874j.j(jK2, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jK2 > 0) {
                    if (K2()) {
                        _thread = null;
                        H2();
                        AbstractC1601c.a();
                        if (z2()) {
                            return;
                        }
                        n2();
                        return;
                    }
                    AbstractC1601c.a();
                    LockSupport.parkNanos(this, jK2);
                }
            }
        } finally {
            _thread = null;
            H2();
            AbstractC1601c.a();
            if (!z2()) {
                n2();
            }
        }
    }

    @Override // Gf.AbstractC1622m0, Gf.AbstractC1620l0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // Gf.AbstractC1622m0
    public void t2(Runnable runnable) {
        if (J2()) {
            M2();
        }
        super.t2(runnable);
    }

    @Override // Gf.K
    public String toString() {
        return "DefaultExecutor";
    }
}
