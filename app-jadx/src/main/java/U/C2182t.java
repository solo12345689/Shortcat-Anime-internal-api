package U;

import ie.InterfaceC5082a;
import r0.AbstractC6225g;
import r0.C6224f;
import w.InterfaceC6904i;
import w.InterfaceC6921z;

/* JADX INFO: renamed from: U.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2182t implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f18653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6904i f18654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6921z f18655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5082a f18656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f18657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private D0.a f18658f = new a();

    /* JADX INFO: renamed from: U.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements D0.a {

        /* JADX INFO: renamed from: U.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0317a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f18660a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            long f18661b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f18662c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f18664e;

            C0317a(Zd.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f18662c = obj;
                this.f18664e |= Integer.MIN_VALUE;
                return a.this.L0(0L, 0L, this);
            }
        }

        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // D0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object L0(long r9, long r11, Zd.e r13) {
            /*
                r8 = this;
                boolean r0 = r13 instanceof U.C2182t.a.C0317a
                if (r0 == 0) goto L14
                r0 = r13
                U.t$a$a r0 = (U.C2182t.a.C0317a) r0
                int r1 = r0.f18664e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.f18664e = r1
            L12:
                r6 = r0
                goto L1a
            L14:
                U.t$a$a r0 = new U.t$a$a
                r0.<init>(r13)
                goto L12
            L1a:
                java.lang.Object r13 = r6.f18662c
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r6.f18664e
                r7 = 2
                r2 = 1
                if (r1 == 0) goto L42
                if (r1 == r2) goto L38
                if (r1 != r7) goto L30
                long r9 = r6.f18661b
                Td.v.b(r13)
                goto L82
            L30:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L38:
                long r11 = r6.f18661b
                java.lang.Object r9 = r6.f18660a
                U.t$a r9 = (U.C2182t.a) r9
                Td.v.b(r13)
                goto L57
            L42:
                Td.v.b(r13)
                r6.f18660a = r8
                r6.f18661b = r11
                r6.f18664e = r2
                r1 = r8
                r2 = r9
                r4 = r11
                java.lang.Object r13 = super.L0(r2, r4, r6)
                if (r13 != r0) goto L55
                goto L80
            L55:
                r9 = r8
                r11 = r4
            L57:
                i1.y r13 = (i1.y) r13
                long r1 = r13.o()
                U.t r10 = U.C2182t.this
                U.n0 r10 = r10.getState()
                float r11 = i1.y.i(r11)
                U.t r12 = U.C2182t.this
                w.z r12 = r12.c()
                U.t r9 = U.C2182t.this
                w.i r9 = r9.d()
                r13 = 0
                r6.f18660a = r13
                r6.f18661b = r1
                r6.f18664e = r7
                java.lang.Object r13 = U.AbstractC2167d.l(r10, r11, r12, r9, r6)
                if (r13 != r0) goto L81
            L80:
                return r0
            L81:
                r9 = r1
            L82:
                i1.y r13 = (i1.y) r13
                long r11 = r13.o()
                long r9 = i1.y.l(r9, r11)
                i1.y r9 = i1.y.b(r9)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: U.C2182t.a.L0(long, long, Zd.e):java.lang.Object");
        }

        @Override // D0.a
        public long i1(long j10, int i10) {
            if (!((Boolean) C2182t.this.e().invoke()).booleanValue() || C6224f.n(j10) > 0.0f) {
                return C6224f.f58329b.c();
            }
            float fD = C2182t.this.getState().d();
            C2182t.this.getState().h(C2182t.this.getState().d() + C6224f.n(j10));
            return fD == C2182t.this.getState().d() ? C6224f.f58329b.c() : C6224f.g(j10, 0.0f, 0.0f, 2, null);
        }

        @Override // D0.a
        public long y0(long j10, long j11, int i10) {
            if (!((Boolean) C2182t.this.e().invoke()).booleanValue()) {
                return C6224f.f58329b.c();
            }
            n0 state = C2182t.this.getState();
            state.g(state.c() + C6224f.n(j10));
            if (C6224f.n(j11) < 0.0f || C6224f.n(j10) < 0.0f) {
                float fD = C2182t.this.getState().d();
                C2182t.this.getState().h(C2182t.this.getState().d() + C6224f.n(j10));
                return AbstractC6225g.a(0.0f, C2182t.this.getState().d() - fD);
            }
            if (C6224f.n(j10) == 0.0f && C6224f.n(j11) > 0.0f) {
                C2182t.this.getState().g(0.0f);
            }
            if (C6224f.n(j11) <= 0.0f) {
                return C6224f.f58329b.c();
            }
            float fD2 = C2182t.this.getState().d();
            C2182t.this.getState().h(C2182t.this.getState().d() + C6224f.n(j11));
            return AbstractC6225g.a(0.0f, C2182t.this.getState().d() - fD2);
        }
    }

    public C2182t(n0 n0Var, InterfaceC6904i interfaceC6904i, InterfaceC6921z interfaceC6921z, InterfaceC5082a interfaceC5082a) {
        this.f18653a = n0Var;
        this.f18654b = interfaceC6904i;
        this.f18655c = interfaceC6921z;
        this.f18656d = interfaceC5082a;
    }

    @Override // U.m0
    public D0.a a() {
        return this.f18658f;
    }

    @Override // U.m0
    public boolean b() {
        return this.f18657e;
    }

    @Override // U.m0
    public InterfaceC6921z c() {
        return this.f18655c;
    }

    @Override // U.m0
    public InterfaceC6904i d() {
        return this.f18654b;
    }

    public final InterfaceC5082a e() {
        return this.f18656d;
    }

    @Override // U.m0
    public n0 getState() {
        return this.f18653a;
    }
}
