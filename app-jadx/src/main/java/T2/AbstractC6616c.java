package t2;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: t2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6616c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Executor f60583a;

    public static synchronized Executor a() {
        try {
            if (f60583a == null) {
                f60583a = a0.W0("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f60583a;
    }
}
