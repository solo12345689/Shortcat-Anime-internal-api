package io.sentry.util;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f51442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f51443b;

    static {
        try {
            f51442a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f51442a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f51443b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f51443b = false;
            }
        } catch (Throwable unused2) {
            f51443b = false;
        }
    }

    public static boolean a() {
        return f51442a;
    }

    public static boolean b() {
        return f51443b;
    }

    public static boolean c() {
        return !f51442a;
    }
}
