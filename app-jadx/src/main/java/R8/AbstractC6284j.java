package r8;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: r8.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6284j {
    static Executor a() {
        return new ExecutorC6287m(Executors.newSingleThreadExecutor());
    }
}
