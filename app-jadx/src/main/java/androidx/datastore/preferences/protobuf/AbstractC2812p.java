package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2812p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC2810n f29415a = new C2811o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC2810n f29416b = c();

    static AbstractC2810n a() {
        AbstractC2810n abstractC2810n = f29416b;
        if (abstractC2810n != null) {
            return abstractC2810n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC2810n b() {
        return f29415a;
    }

    private static AbstractC2810n c() {
        if (W.f29251d) {
            return null;
        }
        try {
            return (AbstractC2810n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
