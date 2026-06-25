package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SingleThreadFutureScheduler implements FutureScheduler {
    private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a implements RejectedExecutionHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f34180a;

        public a(String str) {
            this.f34180a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f34180a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class b implements Callable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callable f34181a;

        public b(Callable callable) {
            this.f34181a = callable;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                return this.f34181a.call();
            } catch (Throwable th2) {
                AdjustFactory.getLogger().error("Callable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
                return null;
            }
        }
    }

    public SingleThreadFutureScheduler(String str, boolean z10) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryWrapper(str), new a(str));
        this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
        if (z10) {
            return;
        }
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
        this.scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public ScheduledFuture<?> scheduleFuture(Runnable runnable, long j10) {
        return this.scheduledThreadPoolExecutor.schedule(new RunnableWrapper(runnable), j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j10, long j11) {
        return this.scheduledThreadPoolExecutor.scheduleWithFixedDelay(new RunnableWrapper(runnable), j10, j11, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j10) {
        return this.scheduledThreadPoolExecutor.schedule(new b(callable), j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public void teardown() {
        this.scheduledThreadPoolExecutor.shutdownNow();
    }
}
