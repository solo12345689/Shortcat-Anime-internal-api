package io.sentry;

import io.sentry.util.C5288a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class Z2 implements InterfaceC5187d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f49387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5288a f49388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f49389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5322z3 f49390d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements Future {
        private b() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49391a;

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryExecutorServiceThreadFactory-");
            int i10 = this.f49391a;
            this.f49391a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    Z2(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, C5322z3 c5322z3) {
        this.f49388b = new C5288a();
        this.f49389c = new Runnable() { // from class: io.sentry.X2
            @Override // java.lang.Runnable
            public final void run() {
                Z2.d();
            }
        };
        this.f49387a = scheduledThreadPoolExecutor;
        this.f49390d = c5322z3;
    }

    public static /* synthetic */ void c(Z2 z22) {
        z22.getClass();
        for (int i10 = 0; i10 < 40; i10++) {
            try {
                z22.f49387a.schedule(z22.f49389c, 365L, TimeUnit.DAYS).cancel(true);
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        z22.f49387a.purge();
    }

    private boolean e() {
        if (this.f49387a.getQueue().size() >= 271) {
            this.f49387a.purge();
        }
        return this.f49387a.getQueue().size() < 271;
    }

    @Override // io.sentry.InterfaceC5187d0
    public void a(long j10) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49388b.a();
        try {
            if (!this.f49387a.isShutdown()) {
                this.f49387a.shutdown();
                try {
                    if (!this.f49387a.awaitTermination(j10, TimeUnit.MILLISECONDS)) {
                        this.f49387a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f49387a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC5187d0
    public void b() {
        try {
            this.f49387a.submit(new Runnable() { // from class: io.sentry.Y2
                @Override // java.lang.Runnable
                public final void run() {
                    Z2.c(this.f49383a);
                }
            });
        } catch (RejectedExecutionException e10) {
            C5322z3 c5322z3 = this.f49390d;
            if (c5322z3 != null) {
                c5322z3.getLogger().b(EnumC5215i3.WARNING, "Prewarm task rejected from " + this.f49387a, e10);
            }
        }
    }

    @Override // io.sentry.InterfaceC5187d0
    public boolean isClosed() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49388b.a();
        try {
            boolean zIsShutdown = this.f49387a.isShutdown();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zIsShutdown;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC5187d0
    public Future schedule(Runnable runnable, long j10) {
        return this.f49387a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC5187d0
    public Future submit(Runnable runnable) {
        if (e()) {
            return this.f49387a.submit(runnable);
        }
        C5322z3 c5322z3 = this.f49390d;
        if (c5322z3 != null) {
            c5322z3.getLogger().c(EnumC5215i3.WARNING, "Task " + runnable + " rejected from " + this.f49387a, new Object[0]);
        }
        return new b();
    }

    public Z2(C5322z3 c5322z3) {
        this(new ScheduledThreadPoolExecutor(1, new c()), c5322z3);
    }

    public Z2() {
        this(new ScheduledThreadPoolExecutor(1, new c()), null);
    }

    public static /* synthetic */ void d() {
    }
}
