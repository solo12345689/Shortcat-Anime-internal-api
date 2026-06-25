package u4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: u4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6731a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C6731a f61366b = new C6731a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f61367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f61368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f61369e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f61370a = new b();

    /* JADX INFO: renamed from: u4.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f61367c = iAvailableProcessors;
        f61368d = iAvailableProcessors + 1;
        f61369e = (iAvailableProcessors * 2) + 1;
    }

    private C6731a() {
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z10) {
        threadPoolExecutor.allowCoreThreadTimeOut(z10);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f61368d, f61369e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f61366b.f61370a;
    }
}
