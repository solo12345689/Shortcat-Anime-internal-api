package w5;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: w5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6944a extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6944a f62914a = new C6944a();

    private C6944a() {
    }

    public static C6944a b() {
        return f62914a;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return true;
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        z1.f.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
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
    public List shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }
}
