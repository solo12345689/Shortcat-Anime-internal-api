package Lf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract /* synthetic */ class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f11552a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f11552a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
