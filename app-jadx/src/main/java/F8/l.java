package F8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class l implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f6583a = new AtomicInteger();

    /* synthetic */ l(k kVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int iIncrementAndGet = f6583a.incrementAndGet();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("measurement-");
        sb2.append(iIncrementAndGet);
        return new m(runnable, sb2.toString());
    }
}
