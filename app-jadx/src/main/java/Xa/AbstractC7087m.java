package xa;

/* JADX INFO: renamed from: xa.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC7087m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC7085k f64242a = new C7086l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC7085k f64243b = c();

    static AbstractC7085k a() {
        AbstractC7085k abstractC7085k = f64243b;
        if (abstractC7085k != null) {
            return abstractC7085k;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC7085k b() {
        return f64242a;
    }

    private static AbstractC7085k c() {
        try {
            return (AbstractC7085k) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
