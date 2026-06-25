package xa;

/* JADX INFO: renamed from: xa.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC7078d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f64157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f64158b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f64159c;

    static {
        f64159c = (f64157a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f64158b;
    }

    static boolean c() {
        if (f64157a) {
            return true;
        }
        return (f64158b == null || f64159c) ? false : true;
    }
}
