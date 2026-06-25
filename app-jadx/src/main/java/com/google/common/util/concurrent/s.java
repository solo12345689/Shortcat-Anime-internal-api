package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
import com.google.common.util.concurrent.h;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Executor {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Executor f43178a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ com.google.common.util.concurrent.a f43179b;

        a(Executor executor, com.google.common.util.concurrent.a aVar) {
            this.f43178a = executor;
            this.f43179b = aVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f43178a.execute(runnable);
            } catch (RejectedExecutionException e10) {
                this.f43179b.G(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends com.google.common.util.concurrent.b {

        /* JADX INFO: renamed from: a */
        private final ExecutorService f43180a;

        b(ExecutorService executorService) {
            this.f43180a = (ExecutorService) O9.n.j(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f43180a.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f43180a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f43180a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f43180a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f43180a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            return this.f43180a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f43180a + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends b implements ScheduledExecutorService, r {

        /* JADX INFO: renamed from: b */
        final ScheduledExecutorService f43181b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class a extends h.a implements q {

            /* JADX INFO: renamed from: b */
            private final ScheduledFuture f43182b;

            public a(p pVar, ScheduledFuture scheduledFuture) {
                super(pVar);
                this.f43182b = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.g, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean zCancel = super.cancel(z10);
                if (zCancel) {
                    this.f43182b.cancel(z10);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f43182b.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: m */
            public int compareTo(Delayed delayed) {
                return this.f43182b.compareTo(delayed);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class b extends a.j implements Runnable {

            /* JADX INFO: renamed from: h */
            private final Runnable f43183h;

            public b(Runnable runnable) {
                this.f43183h = (Runnable) O9.n.j(runnable);
            }

            @Override // com.google.common.util.concurrent.a
            protected String C() {
                return "task=[" + this.f43183h + "]";
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f43183h.run();
                } catch (Throwable th2) {
                    G(th2);
                    throw th2;
                }
            }
        }

        c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f43181b = (ScheduledExecutorService) O9.n.j(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: h */
        public q schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            x xVarJ = x.J(runnable, null);
            return new a(xVarJ, this.f43181b.schedule(xVarJ, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: j */
        public q schedule(Callable callable, long j10, TimeUnit timeUnit) {
            x xVarK = x.K(callable);
            return new a(xVarK, this.f43181b.schedule(xVarK, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: k */
        public q scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f43181b.scheduleAtFixedRate(bVar, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: l */
        public q scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f43181b.scheduleWithFixedDelay(bVar, j10, j11, timeUnit));
        }
    }

    public static Executor a() {
        return e.INSTANCE;
    }

    public static r b(ExecutorService executorService) {
        return executorService instanceof r ? (r) executorService : executorService instanceof ScheduledExecutorService ? new c((ScheduledExecutorService) executorService) : new b(executorService);
    }

    static Executor c(Executor executor, com.google.common.util.concurrent.a aVar) {
        O9.n.j(executor);
        O9.n.j(aVar);
        return executor == a() ? executor : new a(executor, aVar);
    }
}
