package l0;

import android.os.Handler;
import android.os.Looper;
import ie.InterfaceC5082a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f52303a = new Handler(Looper.getMainLooper());

    public static final long b() {
        return System.currentTimeMillis();
    }

    public static final Object c(long j10, final InterfaceC5082a interfaceC5082a) {
        Runnable runnable = new Runnable() { // from class: l0.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(interfaceC5082a);
            }
        };
        f52303a.postDelayed(runnable, j10);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5082a interfaceC5082a) {
        interfaceC5082a.invoke();
    }

    public static final void e(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        f52303a.removeCallbacks((Runnable) obj);
    }
}
