package xa;

/* JADX INFO: renamed from: xa.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC7083i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f64235a = c();

    public static C7084j a() {
        C7084j c7084jB = b("getEmptyRegistry");
        return c7084jB != null ? c7084jB : C7084j.f64238d;
    }

    private static final C7084j b(String str) {
        Class cls = f64235a;
        if (cls == null) {
            return null;
        }
        try {
            return (C7084j) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
