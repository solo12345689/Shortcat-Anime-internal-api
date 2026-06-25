package R5;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    private static a f15160a;

    /* JADX INFO: renamed from: R5.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0262a {
        void a();
    }

    public static synchronized a b() {
        try {
            if (f15160a == null) {
                f15160a = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f15160a;
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0262a interfaceC0262a);

    public abstract void d(InterfaceC0262a interfaceC0262a);
}
