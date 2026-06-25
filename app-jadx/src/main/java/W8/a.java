package W8;

import R8.AbstractC2115p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadFactory f20785b = Executors.defaultThreadFactory();

    public a(String str) {
        AbstractC2115p.m(str, "Name must not be null");
        this.f20784a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f20785b.newThread(new b(runnable, 0));
        threadNewThread.setName(this.f20784a);
        return threadNewThread;
    }
}
