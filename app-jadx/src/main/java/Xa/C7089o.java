package xa;

/* JADX INFO: renamed from: xa.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C7089o implements InterfaceC7069C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C7089o f64244a = new C7089o();

    private C7089o() {
    }

    public static C7089o c() {
        return f64244a;
    }

    @Override // xa.InterfaceC7069C
    public InterfaceC7068B a(Class cls) {
        if (!AbstractC7090p.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC7068B) AbstractC7090p.m(cls.asSubclass(AbstractC7090p.class)).d();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // xa.InterfaceC7069C
    public boolean b(Class cls) {
        return AbstractC7090p.class.isAssignableFrom(cls);
    }
}
