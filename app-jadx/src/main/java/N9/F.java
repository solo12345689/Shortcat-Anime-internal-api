package n9;

import android.os.Handler;
import android.os.Looper;
import h9.HandlerC4924a;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class F implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f54008a = new HandlerC4924a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f54008a.post(runnable);
    }
}
