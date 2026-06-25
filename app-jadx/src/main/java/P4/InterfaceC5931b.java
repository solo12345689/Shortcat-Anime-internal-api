package p4;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: p4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5931b {
    Executor a();

    InterfaceExecutorC5930a b();

    default void c(Runnable runnable) {
        b().execute(runnable);
    }
}
