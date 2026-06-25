package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P f29244a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final P f29245b = new Q();

    static P a() {
        return f29244a;
    }

    static P b() {
        return f29245b;
    }

    private static P c() {
        if (W.f29251d) {
            return null;
        }
        try {
            return (P) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
