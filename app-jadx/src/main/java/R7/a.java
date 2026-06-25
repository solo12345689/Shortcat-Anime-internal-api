package R7;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f15199a;

    public static void a(b bVar) {
        synchronized (a.class) {
            try {
                if (f15199a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f15199a = bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(b bVar) {
        if (c()) {
            return;
        }
        a(bVar);
    }

    public static boolean c() {
        boolean z10;
        synchronized (a.class) {
            z10 = f15199a != null;
        }
        return z10;
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i10) {
        b bVar;
        synchronized (a.class) {
            bVar = f15199a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.a(str, i10);
    }
}
