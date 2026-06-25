package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f29218a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final F f29219b = new G();

    static F a() {
        return f29218a;
    }

    static F b() {
        return f29219b;
    }

    private static F c() {
        if (W.f29251d) {
            return null;
        }
        try {
            return (F) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
