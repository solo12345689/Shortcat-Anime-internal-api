package xa;

/* JADX INFO: renamed from: xa.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C7095v implements T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC7069C f64273b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7069C f64274a;

    /* JADX INFO: renamed from: xa.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements InterfaceC7069C {
        a() {
        }

        @Override // xa.InterfaceC7069C
        public InterfaceC7068B a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // xa.InterfaceC7069C
        public boolean b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: xa.v$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64275a;

        static {
            int[] iArr = new int[M.values().length];
            f64275a = iArr;
            try {
                iArr[M.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: xa.v$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements InterfaceC7069C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC7069C[] f64276a;

        c(InterfaceC7069C... interfaceC7069CArr) {
            this.f64276a = interfaceC7069CArr;
        }

        @Override // xa.InterfaceC7069C
        public InterfaceC7068B a(Class cls) {
            for (InterfaceC7069C interfaceC7069C : this.f64276a) {
                if (interfaceC7069C.b(cls)) {
                    return interfaceC7069C.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // xa.InterfaceC7069C
        public boolean b(Class cls) {
            for (InterfaceC7069C interfaceC7069C : this.f64276a) {
                if (interfaceC7069C.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C7095v() {
        this(c());
    }

    private static boolean b(InterfaceC7068B interfaceC7068B) {
        return b.f64275a[interfaceC7068B.c().ordinal()] != 1;
    }

    private static InterfaceC7069C c() {
        return new c(C7089o.c(), d());
    }

    private static InterfaceC7069C d() {
        try {
            return (InterfaceC7069C) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f64273b;
        }
    }

    private static S e(Class cls, InterfaceC7068B interfaceC7068B) {
        return AbstractC7090p.class.isAssignableFrom(cls) ? b(interfaceC7068B) ? C7073G.F(cls, interfaceC7068B, K.b(), AbstractC7094u.b(), U.l(), AbstractC7087m.b(), AbstractC7067A.b()) : C7073G.F(cls, interfaceC7068B, K.b(), AbstractC7094u.b(), U.l(), null, AbstractC7067A.b()) : b(interfaceC7068B) ? C7073G.F(cls, interfaceC7068B, K.a(), AbstractC7094u.a(), U.k(), AbstractC7087m.a(), AbstractC7067A.a()) : C7073G.F(cls, interfaceC7068B, K.a(), AbstractC7094u.a(), U.k(), null, AbstractC7067A.a());
    }

    @Override // xa.T
    public S a(Class cls) {
        U.h(cls);
        InterfaceC7068B interfaceC7068BA = this.f64274a.a(cls);
        return interfaceC7068BA.a() ? AbstractC7090p.class.isAssignableFrom(cls) ? C7074H.i(U.l(), AbstractC7087m.b(), interfaceC7068BA.b()) : C7074H.i(U.k(), AbstractC7087m.a(), interfaceC7068BA.b()) : e(cls, interfaceC7068BA);
    }

    private C7095v(InterfaceC7069C interfaceC7069C) {
        this.f64274a = (InterfaceC7069C) AbstractC7091q.b(interfaceC7069C, "messageInfoFactory");
    }
}
