package F8;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class j extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f6582a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.f6582a = nVar;
        setThreadFactory(new l(null));
        allowCoreThreadTimeOut(true);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        z1.f.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new i(this, runnable, obj);
    }
}
