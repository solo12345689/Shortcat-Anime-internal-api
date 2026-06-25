package H1;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class k {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7679b;

        /* JADX INFO: renamed from: H1.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0098a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f7680a;

            C0098a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f7680a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f7680a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f7678a = str;
            this.f7679b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0098a(runnable, this.f7678a, this.f7679b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f7681a;

        b(Handler handler) {
            this.f7681a = (Handler) K1.f.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f7681a.post((Runnable) K1.f.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f7681a + " is shutting down");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Callable f7682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private K1.a f7683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f7684c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ K1.a f7685a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f7686b;

            a(K1.a aVar, Object obj) {
                this.f7685a = aVar;
                this.f7686b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f7685a.accept(this.f7686b);
            }
        }

        c(Handler handler, Callable callable, K1.a aVar) {
            this.f7682a = callable;
            this.f7683b = aVar;
            this.f7684c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f7682a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f7684c.post(new a(this.f7683b, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, K1.a aVar) {
        executor.execute(new c(H1.b.a(), callable, aVar));
    }

    static Object d(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
