package xa;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final I f64096a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final I f64097b = new J();

    static I a() {
        return f64096a;
    }

    static I b() {
        return f64097b;
    }

    private static I c() {
        try {
            return (I) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
