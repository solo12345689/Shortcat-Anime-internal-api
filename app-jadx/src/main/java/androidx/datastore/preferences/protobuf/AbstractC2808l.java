package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2808l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f29369a = c();

    public static C2809m a() {
        C2809m c2809mB = b("getEmptyRegistry");
        return c2809mB != null ? c2809mB : C2809m.f29372c;
    }

    private static final C2809m b(String str) {
        Class cls = f29369a;
        if (cls == null) {
            return null;
        }
        try {
            return (C2809m) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
