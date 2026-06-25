package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SingleThreadCachedScheduler implements ThreadScheduler {
    private ThreadPoolExecutor threadPoolExecutor;
    private final List<Runnable> queue = new ArrayList();
    private boolean isThreadProcessing = false;
    private boolean isTeardown = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a implements RejectedExecutionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34174a;

        public a(String str) {
            this.f34174a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f34174a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f34175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f34176b;

        public b(long j10, Runnable runnable) {
            this.f34175a = j10;
            this.f34176b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep(this.f34175a);
            } catch (InterruptedException e10) {
                AdjustFactory.getLogger().warn("Sleep delay exception: %s", e10.getMessage());
            }
            SingleThreadCachedScheduler.this.submit(this.f34176b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f34178a;

        public c(Runnable runnable) {
            this.f34178a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable;
            SingleThreadCachedScheduler.this.tryExecuteRunnable(this.f34178a);
            while (true) {
                synchronized (SingleThreadCachedScheduler.this.queue) {
                    try {
                        if (SingleThreadCachedScheduler.this.isTeardown) {
                            return;
                        }
                        if (SingleThreadCachedScheduler.this.queue.isEmpty()) {
                            SingleThreadCachedScheduler.this.isThreadProcessing = false;
                            return;
                        } else {
                            runnable = (Runnable) SingleThreadCachedScheduler.this.queue.get(0);
                            SingleThreadCachedScheduler.this.queue.remove(0);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                SingleThreadCachedScheduler.this.tryExecuteRunnable(runnable);
            }
        }
    }

    public SingleThreadCachedScheduler(String str) {
        this.threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryWrapper(str), new a(str));
    }

    private void processQueue(Runnable runnable) {
        this.threadPoolExecutor.submit(new c(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryExecuteRunnable(Runnable runnable) {
        try {
            if (this.isTeardown) {
                return;
            }
            runnable.run();
        } catch (Throwable th2) {
            AdjustFactory.getLogger().warn("Execution failed: %s", th2.getMessage());
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadScheduler
    public void schedule(Runnable runnable, long j10) {
        synchronized (this.queue) {
            try {
                if (this.isTeardown) {
                    return;
                }
                this.threadPoolExecutor.submit(new b(j10, runnable));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void submit(Runnable runnable) {
        synchronized (this.queue) {
            try {
                if (this.isTeardown) {
                    return;
                }
                if (this.isThreadProcessing) {
                    this.queue.add(runnable);
                } else {
                    this.isThreadProcessing = true;
                    processQueue(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void teardown() {
        synchronized (this.queue) {
            this.isTeardown = true;
            this.queue.clear();
            this.threadPoolExecutor.shutdown();
        }
    }
}
