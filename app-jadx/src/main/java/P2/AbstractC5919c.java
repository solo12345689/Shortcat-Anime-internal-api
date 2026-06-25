package p2;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: p2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5919c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Handler f55720e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f55722b = e.PENDING;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f55723c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f55724d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FutureTask f55721a = new b(new a());

    /* JADX INFO: renamed from: p2.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractC5919c.this.f55724d.set(true);
            Object objB = null;
            try {
                Process.setThreadPriority(10);
                objB = AbstractC5919c.this.b();
                Binder.flushPendingCommands();
                return objB;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: p2.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends FutureTask {
        b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC5919c.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                AbstractC5919c.this.j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* JADX INFO: renamed from: p2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class RunnableC0855c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f55727a;

        RunnableC0855c(Object obj) {
            this.f55727a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC5919c.this.d(this.f55727a);
        }
    }

    /* JADX INFO: renamed from: p2.c$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55729a;

        static {
            int[] iArr = new int[e.values().length];
            f55729a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55729a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: p2.c$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    AbstractC5919c() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (AbstractC5919c.class) {
            try {
                if (f55720e == null) {
                    f55720e = new Handler(Looper.getMainLooper());
                }
                handler = f55720e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f55723c.set(true);
        return this.f55721a.cancel(z10);
    }

    protected abstract Object b();

    public final void c(Executor executor) {
        if (this.f55722b == e.PENDING) {
            this.f55722b = e.RUNNING;
            executor.execute(this.f55721a);
            return;
        }
        int i10 = d.f55729a[this.f55722b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.f55722b = e.FINISHED;
    }

    public final boolean f() {
        return this.f55723c.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    void i(Object obj) {
        e().post(new RunnableC0855c(obj));
    }

    void j(Object obj) {
        if (this.f55724d.get()) {
            return;
        }
        i(obj);
    }
}
