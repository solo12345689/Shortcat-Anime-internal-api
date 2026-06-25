package X4;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import z1.f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f21631b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile int f21632c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f21633a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f21634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ThreadFactory f21637d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f21638e = e.f21652d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f21639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f21640g;

        b(boolean z10) {
            this.f21634a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f21639f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f21639f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f21635b, this.f21636c, this.f21640g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f21637d, this.f21639f, this.f21638e, this.f21634a));
            if (this.f21640g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f21639f = str;
            return this;
        }

        public b c(int i10) {
            this.f21635b = i10;
            this.f21636c = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: X4.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0369a extends Thread {
            C0369a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0369a(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadFactory f21642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f21643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f21644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f21645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicInteger f21646e = new AtomicInteger();

        /* JADX INFO: renamed from: X4.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class RunnableC0370a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f21647a;

            RunnableC0370a(Runnable runnable) {
                this.f21647a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f21645d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f21647a.run();
                } catch (Throwable th2) {
                    d.this.f21644c.a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f21642a = threadFactory;
            this.f21643b = str;
            this.f21644c = eVar;
            this.f21645d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f21642a.newThread(new RunnableC0370a(runnable));
            threadNewThread.setName("glide-" + this.f21643b + "-thread-" + this.f21646e.getAndIncrement());
            return threadNewThread;
        }
    }

    a(ExecutorService executorService) {
        this.f21633a = executorService;
    }

    static int b() {
        return g() >= 4 ? 2 : 1;
    }

    public static int g() {
        if (f21632c == 0) {
            f21632c = Math.min(4, X4.b.a());
        }
        return f21632c;
    }

    public static b h() {
        return new b(true).c(b()).b("animation");
    }

    public static a j() {
        return h().a();
    }

    public static b k() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a l() {
        return k().a();
    }

    public static b o() {
        return new b(false).c(g()).b("source");
    }

    public static a q() {
        return o().a();
    }

    public static a w() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f21631b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f21652d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f21633a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f21633a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f21633a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f21633a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f21633a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f21633a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f21633a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f21633a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f21633a.submit(runnable);
    }

    public String toString() {
        return this.f21633a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f21633a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f21633a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f21633a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f21633a.submit(callable);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f21649a = new C0371a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f21651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f21652d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b implements e {
            b() {
            }

            @Override // X4.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class c implements e {
            c() {
            }

            @Override // X4.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f21650b = bVar;
            f21651c = new c();
            f21652d = bVar;
        }

        void a(Throwable th2);

        /* JADX INFO: renamed from: X4.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0371a implements e {
            C0371a() {
            }

            @Override // X4.a.e
            public void a(Throwable th2) {
            }
        }
    }
}
