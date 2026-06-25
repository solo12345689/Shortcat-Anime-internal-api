package y7;

import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f64878a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f64879b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Executor f64880c = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            AbstractC5504s.h(command, "command");
            command.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            AbstractC5504s.h(command, "command");
            UiThreadUtil.runOnUiThread(command);
        }
    }

    private c() {
    }
}
