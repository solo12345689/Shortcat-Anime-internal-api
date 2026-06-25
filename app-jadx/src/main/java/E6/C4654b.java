package e6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: e6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4654b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4654b f45810a = new C4654b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadFactory f45811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ExecutorService f45812c;

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: e6.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C4654b.c(runnable);
            }
        };
        f45811b = threadFactory;
        f45812c = Executors.newCachedThreadPool(threadFactory);
    }

    private C4654b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }

    public final void b(Runnable task) {
        AbstractC5504s.h(task, "task");
        f45812c.execute(task);
    }
}
