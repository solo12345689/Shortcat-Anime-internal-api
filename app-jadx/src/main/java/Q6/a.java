package Q6;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static void a(boolean z10) {
        if (!z10) {
            throw new AssertionError();
        }
    }

    public static void b(boolean z10, String str) {
        if (!z10) {
            throw new AssertionError(str);
        }
    }

    public static Object c(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new AssertionError();
    }

    public static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new AssertionError(str);
    }

    public static Object e(Object obj) {
        return obj;
    }
}
