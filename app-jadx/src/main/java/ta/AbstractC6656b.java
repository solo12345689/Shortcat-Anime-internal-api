package ta;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ta.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6656b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC6655a f60864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile InterfaceC6655a f60865b;

    /* JADX INFO: renamed from: ta.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0909b implements InterfaceC6655a {
        private C0909b() {
        }

        @Override // ta.InterfaceC6655a
        public ExecutorService a(ThreadFactory threadFactory, EnumC6657c enumC6657c) {
            return b(1, threadFactory, enumC6657c);
        }

        public ExecutorService b(int i10, ThreadFactory threadFactory, EnumC6657c enumC6657c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0909b c0909b = new C0909b();
        f60864a = c0909b;
        f60865b = c0909b;
    }

    public static InterfaceC6655a a() {
        return f60865b;
    }
}
