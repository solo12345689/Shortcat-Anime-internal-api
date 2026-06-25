package t8;

/* JADX INFO: renamed from: t8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6652c implements InterfaceC6651b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C6652c f60862b = new C6652c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f60863a;

    private C6652c(Object obj) {
        this.f60863a = obj;
    }

    public static InterfaceC6651b a(Object obj) {
        return new C6652c(AbstractC6653d.c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f60863a;
    }
}
