package w5;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: w5.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractScheduledExecutorServiceC6948e extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f62924a;

    public AbstractScheduledExecutorServiceC6948e(Handler handler) {
        this.f62924a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean b() {
        return Thread.currentThread() == this.f62924a.getLooper().getThread();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        z1.f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f62924a.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public f newTaskFor(Runnable runnable, Object obj) {
        return new f(this.f62924a, runnable, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f newTaskFor(Callable callable) {
        return new f(this.f62924a, callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Runnable runnable, Object obj) {
        runnable.getClass();
        f fVarNewTaskFor = newTaskFor(runnable, obj);
        execute(fVarNewTaskFor);
        return fVarNewTaskFor;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Callable callable) {
        callable.getClass();
        f fVarNewTaskFor = newTaskFor(callable);
        execute(fVarNewTaskFor);
        return fVarNewTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        f fVarNewTaskFor = newTaskFor(runnable, null);
        this.f62924a.postDelayed(fVarNewTaskFor, timeUnit.toMillis(j10));
        return fVarNewTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        f fVarNewTaskFor = newTaskFor(callable);
        this.f62924a.postDelayed(fVarNewTaskFor, timeUnit.toMillis(j10));
        return fVarNewTaskFor;
    }
}
