package io.sentry.android.replay.util;

import Td.L;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f50433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5322z3 f50434b;

    public l(ScheduledExecutorService delegate, C5322z3 options) {
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(options, "options");
        this.f50433a = delegate;
        this.f50434b = options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Runnable runnable, l lVar) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            ILogger logger = lVar.f50434b.getLogger();
            EnumC5215i3 enumC5215i3 = EnumC5215i3.ERROR;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to execute task ");
            sb2.append(runnable instanceof m ? ((m) runnable).a() : "");
            logger.b(enumC5215i3, sb2.toString(), th2);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f50433a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        z1.f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f50433a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f50433a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f50433a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f50433a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f50433a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f50433a.schedule(runnable, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f50433a.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f50433a.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this) {
            if (!isShutdown()) {
                this.f50433a.shutdown();
            }
            try {
            } catch (InterruptedException unused) {
                shutdownNow();
                Thread.currentThread().interrupt();
            }
            if (awaitTermination(this.f50434b.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                L l10 = L.f17438a;
            } else {
                shutdownNow();
                L l102 = L.f17438a;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f50433a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f50433a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f50433a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f50433a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        return this.f50433a.schedule(callable, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f50433a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(final Runnable task) {
        AbstractC5504s.h(task, "task");
        String name = Thread.currentThread().getName();
        AbstractC5504s.g(name, "getName(...)");
        if (Df.r.Q(name, "SentryReplayIntegration", false, 2, null)) {
            task.run();
            return null;
        }
        try {
            return this.f50433a.submit(new Runnable() { // from class: io.sentry.android.replay.util.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.g(task, this);
                }
            });
        } catch (Throwable th2) {
            ILogger logger = this.f50434b.getLogger();
            EnumC5215i3 enumC5215i3 = EnumC5215i3.ERROR;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to submit task ");
            sb2.append(task instanceof m ? ((m) task).a() : "");
            sb2.append(" to executor");
            logger.b(enumC5215i3, sb2.toString(), th2);
            return null;
        }
    }
}
