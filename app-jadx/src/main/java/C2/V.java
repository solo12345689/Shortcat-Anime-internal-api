package C2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f2674a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2674a.post(runnable);
    }
}
