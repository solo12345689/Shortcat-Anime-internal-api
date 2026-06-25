package w5;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class i extends AbstractScheduledExecutorServiceC6948e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static i f62928b;

    private i() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static i o() {
        if (f62928b == null) {
            f62928b = new i();
        }
        return f62928b;
    }

    @Override // w5.AbstractScheduledExecutorServiceC6948e, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
