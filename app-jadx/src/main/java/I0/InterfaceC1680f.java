package I0;

/* JADX INFO: renamed from: I0.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1680f {

    /* JADX INFO: renamed from: a */
    public static final a f8703a = a.f8704a;

    /* JADX INFO: renamed from: I0.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f8704a = new a();

        /* JADX INFO: renamed from: b */
        private static final InterfaceC1680f f8705b = new C0115a();

        /* JADX INFO: renamed from: c */
        private static final InterfaceC1680f f8706c = new e();

        /* JADX INFO: renamed from: d */
        private static final InterfaceC1680f f8707d = new c();

        /* JADX INFO: renamed from: e */
        private static final InterfaceC1680f f8708e = new d();

        /* JADX INFO: renamed from: f */
        private static final InterfaceC1680f f8709f = new C0116f();

        /* JADX INFO: renamed from: g */
        private static final C1683i f8710g = new C1683i(1.0f);

        /* JADX INFO: renamed from: h */
        private static final InterfaceC1680f f8711h = new b();

        /* JADX INFO: renamed from: I0.f$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0115a implements InterfaceC1680f {
            C0115a() {
            }

            @Override // I0.InterfaceC1680f
            public long a(long j10, long j11) {
                float fC = AbstractC1681g.c(j10, j11);
                return N.a((((long) Float.floatToRawIntBits(fC)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fC))));
            }
        }

        /* JADX INFO: renamed from: I0.f$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b implements InterfaceC1680f {
            b() {
            }

            @Override // I0.InterfaceC1680f
            public long a(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L));
                return N.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: I0.f$a$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c implements InterfaceC1680f {
            c() {
            }

            @Override // I0.InterfaceC1680f
            public long a(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L));
                return N.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: I0.f$a$d */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class d implements InterfaceC1680f {
            d() {
            }

            @Override // I0.InterfaceC1680f
            public long a(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                return N.a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: I0.f$a$e */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class e implements InterfaceC1680f {
            e() {
            }

            @Override // I0.InterfaceC1680f
            public long a(long j10, long j11) {
                float fD = AbstractC1681g.d(j10, j11);
                return N.a((((long) Float.floatToRawIntBits(fD)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fD))));
            }
        }

        /* JADX INFO: renamed from: I0.f$a$f */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0116f implements InterfaceC1680f {
            C0116f() {
            }

            @Override // I0.InterfaceC1680f
            public long a(long j10, long j11) {
                if (Float.intBitsToFloat((int) (j10 >> 32)) <= Float.intBitsToFloat((int) (j11 >> 32)) && Float.intBitsToFloat((int) (j10 & 4294967295L)) <= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
                    return N.a((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                }
                float fD = AbstractC1681g.d(j10, j11);
                return N.a((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L));
            }
        }

        private a() {
        }

        public final InterfaceC1680f a() {
            return f8705b;
        }

        public final InterfaceC1680f b() {
            return f8706c;
        }

        public final InterfaceC1680f c() {
            return f8709f;
        }

        public final C1683i d() {
            return f8710g;
        }
    }

    long a(long j10, long j11);
}
