package w5;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements RunnableFuture, ScheduledFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f62925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FutureTask f62926b;

    public f(Handler handler, Callable callable) {
        this.f62925a = handler;
        this.f62926b = new FutureTask(callable);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f62926b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f62926b.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f62926b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f62926b.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f62926b.run();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f62926b.get(j10, timeUnit);
    }

    public f(Handler handler, Runnable runnable, Object obj) {
        this.f62925a = handler;
        this.f62926b = new FutureTask(runnable, obj);
    }
}
