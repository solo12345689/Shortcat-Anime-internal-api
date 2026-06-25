package w5;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: w5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6945b extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Class f62915h = AbstractC6945b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f62917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f62918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BlockingQueue f62919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f62920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f62921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicInteger f62922g;

    /* JADX INFO: renamed from: w5.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) AbstractC6945b.this.f62919d.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    AbstractC7283a.y(AbstractC6945b.f62915h, "%s: Worker has nothing to run", AbstractC6945b.this.f62916a);
                }
                int iDecrementAndGet = AbstractC6945b.this.f62921f.decrementAndGet();
                if (AbstractC6945b.this.f62919d.isEmpty()) {
                    AbstractC7283a.z(AbstractC6945b.f62915h, "%s: worker finished; %d workers left", AbstractC6945b.this.f62916a, Integer.valueOf(iDecrementAndGet));
                } else {
                    AbstractC6945b.this.l();
                }
            } catch (Throwable th2) {
                int iDecrementAndGet2 = AbstractC6945b.this.f62921f.decrementAndGet();
                if (AbstractC6945b.this.f62919d.isEmpty()) {
                    AbstractC7283a.z(AbstractC6945b.f62915h, "%s: worker finished; %d workers left", AbstractC6945b.this.f62916a, Integer.valueOf(iDecrementAndGet2));
                } else {
                    AbstractC6945b.this.l();
                }
                throw th2;
            }
        }

        private a() {
        }
    }

    public AbstractC6945b(String str, int i10, Executor executor, BlockingQueue blockingQueue) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("max concurrency must be > 0");
        }
        this.f62916a = str;
        this.f62917b = executor;
        this.f62918c = i10;
        this.f62919d = blockingQueue;
        this.f62920e = new a();
        this.f62921f = new AtomicInteger(0);
        this.f62922g = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        int i10 = this.f62921f.get();
        while (i10 < this.f62918c) {
            int i11 = i10 + 1;
            if (this.f62921f.compareAndSet(i10, i11)) {
                AbstractC7283a.A(f62915h, "%s: starting worker %d of %d", this.f62916a, Integer.valueOf(i11), Integer.valueOf(this.f62918c));
                this.f62917b.execute(this.f62920e);
                return;
            } else {
                AbstractC7283a.y(f62915h, "%s: race in startWorkerIfNeeded; retrying", this.f62916a);
                i10 = this.f62921f.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        z1.f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        if (!this.f62919d.offer(runnable)) {
            throw new RejectedExecutionException(this.f62916a + " queue is full, size=" + this.f62919d.size());
        }
        int size = this.f62919d.size();
        int i10 = this.f62922g.get();
        if (size > i10 && this.f62922g.compareAndSet(i10, size)) {
            AbstractC7283a.z(f62915h, "%s: max pending work in queue = %d", this.f62916a, Integer.valueOf(size));
        }
        l();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
