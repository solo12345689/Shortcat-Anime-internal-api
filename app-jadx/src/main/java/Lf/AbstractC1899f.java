package Lf;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: Lf.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1899f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection f11568a = Cf.l.T(Cf.l.g(ServiceLoader.load(Gf.L.class, Gf.L.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f11568a;
    }

    public static final void b(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}
