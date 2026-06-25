package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C implements b0 {

    /* JADX INFO: renamed from: b */
    private static final J f29205b = new a();

    /* JADX INFO: renamed from: a */
    private final J f29206a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements J {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.J
        public I a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.J
        public boolean b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f29207a;

        static {
            int[] iArr = new int[V.values().length];
            f29207a = iArr;
            try {
                iArr[V.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c implements J {

        /* JADX INFO: renamed from: a */
        private J[] f29208a;

        c(J... jArr) {
            this.f29208a = jArr;
        }

        @Override // androidx.datastore.preferences.protobuf.J
        public I a(Class cls) {
            for (J j10 : this.f29208a) {
                if (j10.b(cls)) {
                    return j10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.J
        public boolean b(Class cls) {
            for (J j10 : this.f29208a) {
                if (j10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C() {
        this(c());
    }

    private static boolean b(I i10) {
        return b.f29207a[i10.c().ordinal()] != 1;
    }

    private static J c() {
        return new c(C2814s.c(), d());
    }

    private static J d() {
        if (W.f29251d) {
            return f29205b;
        }
        try {
            return (J) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f29205b;
        }
    }

    private static a0 e(Class cls, I i10) {
        if (f(cls)) {
            return N.N(cls, i10, S.b(), B.b(), c0.K(), b(i10) ? AbstractC2812p.b() : null, H.b());
        }
        P pA = S.a();
        AbstractC2810n abstractC2810nA = null;
        InterfaceC2821z interfaceC2821zA = B.a();
        h0 h0VarJ = c0.J();
        if (b(i10)) {
            abstractC2810nA = AbstractC2812p.a();
        }
        return N.N(cls, i10, pA, interfaceC2821zA, h0VarJ, abstractC2810nA, H.a());
    }

    private static boolean f(Class cls) {
        return W.f29251d || AbstractC2815t.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public a0 a(Class cls) {
        c0.G(cls);
        I iA = this.f29206a.a(cls);
        return iA.a() ? f(cls) ? O.l(c0.K(), AbstractC2812p.b(), iA.b()) : O.l(c0.J(), AbstractC2812p.a(), iA.b()) : e(cls, iA);
    }

    private C(J j10) {
        this.f29206a = (J) AbstractC2816u.b(j10, "messageInfoFactory");
    }
}
