package xa;

/* JADX INFO: renamed from: xa.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC7067A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC7098y f64070a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC7098y f64071b = new C7099z();

    static InterfaceC7098y a() {
        return f64070a;
    }

    static InterfaceC7098y b() {
        return f64071b;
    }

    private static InterfaceC7098y c() {
        try {
            return (InterfaceC7098y) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
