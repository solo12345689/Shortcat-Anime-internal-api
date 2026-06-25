package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2800d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f29266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f29267b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f29268c;

    static {
        f29268c = (f29266a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f29267b;
    }

    static boolean c() {
        if (f29266a) {
            return true;
        }
        return (f29267b == null || f29268c) ? false : true;
    }
}
