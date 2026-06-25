package O9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f13090a = b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements l {
        private b() {
        }
    }

    static String a(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }

    private static l b() {
        return new b();
    }

    static String c(String str) {
        return str == null ? "" : str;
    }

    static boolean d(String str) {
        return str == null || str.isEmpty();
    }
}
