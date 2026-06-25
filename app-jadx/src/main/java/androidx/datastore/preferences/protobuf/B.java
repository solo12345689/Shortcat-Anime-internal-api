package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC2821z f29203a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC2821z f29204b = new A();

    static InterfaceC2821z a() {
        return f29203a;
    }

    static InterfaceC2821z b() {
        return f29204b;
    }

    private static InterfaceC2821z c() {
        if (W.f29251d) {
            return null;
        }
        try {
            return (InterfaceC2821z) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
