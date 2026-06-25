package w;

import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.b2;
import Y.h2;
import a0.C2507c;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: w.N, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6885N {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f62380f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2507c f62382b = new C2507c(new a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y.C0 f62383c = b2.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f62384d = Long.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y.C0 f62385e = b2.e(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: w.N$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class a implements h2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f62386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f62387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s0 f62388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f62389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Y.C0 f62390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC6904i f62391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private n0 f62392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f62393h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f62394i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f62395j;

        public a(Object obj, Object obj2, s0 s0Var, InterfaceC6904i interfaceC6904i, String str) {
            this.f62386a = obj;
            this.f62387b = obj2;
            this.f62388c = s0Var;
            this.f62389d = str;
            this.f62390e = b2.e(obj, null, 2, null);
            this.f62391f = interfaceC6904i;
            this.f62392g = new n0(this.f62391f, s0Var, this.f62386a, this.f62387b, null, 16, null);
        }

        @Override // Y.h2
        public Object getValue() {
            return this.f62390e.getValue();
        }

        public final Object i() {
            return this.f62386a;
        }

        public final Object l() {
            return this.f62387b;
        }

        public final boolean n() {
            return this.f62393h;
        }

        public final void p(long j10) {
            C6885N.this.l(false);
            if (this.f62394i) {
                this.f62394i = false;
                this.f62395j = j10;
            }
            long j11 = j10 - this.f62395j;
            r(this.f62392g.f(j11));
            this.f62393h = this.f62392g.c(j11);
        }

        public final void q() {
            this.f62394i = true;
        }

        public void r(Object obj) {
            this.f62390e.setValue(obj);
        }

        public final void s() {
            r(this.f62392g.g());
            this.f62394i = true;
        }

        public final void t(Object obj, Object obj2, InterfaceC6904i interfaceC6904i) {
            this.f62386a = obj;
            this.f62387b = obj2;
            this.f62391f = interfaceC6904i;
            this.f62392g = new n0(interfaceC6904i, this.f62388c, obj, obj2, null, 16, null);
            C6885N.this.l(true);
            this.f62393h = false;
            this.f62394i = true;
        }
    }

    /* JADX INFO: renamed from: w.N$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f62397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f62398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f62399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y.C0 f62400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C6885N f62401e;

        /* JADX INFO: renamed from: w.N$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Y.C0 f62402a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6885N f62403b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.K f62404c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Gf.O f62405d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Y.C0 c02, C6885N c6885n, kotlin.jvm.internal.K k10, Gf.O o10) {
                super(1);
                this.f62402a = c02;
                this.f62403b = c6885n;
                this.f62404c = k10;
                this.f62405d = o10;
            }

            public final void a(long j10) {
                h2 h2Var = (h2) this.f62402a.getValue();
                long jLongValue = h2Var != null ? ((Number) h2Var.getValue()).longValue() : j10;
                int i10 = 0;
                if (this.f62403b.f62384d == Long.MIN_VALUE || this.f62404c.f52256a != m0.n(this.f62405d.getCoroutineContext())) {
                    this.f62403b.f62384d = j10;
                    C2507c c2507c = this.f62403b.f62382b;
                    int iP = c2507c.p();
                    if (iP > 0) {
                        Object[] objArrO = c2507c.o();
                        int i11 = 0;
                        do {
                            ((a) objArrO[i11]).q();
                            i11++;
                        } while (i11 < iP);
                    }
                    this.f62404c.f52256a = m0.n(this.f62405d.getCoroutineContext());
                }
                if (this.f62404c.f52256a != 0.0f) {
                    this.f62403b.i((long) ((jLongValue - this.f62403b.f62384d) / this.f62404c.f52256a));
                    return;
                }
                C2507c c2507c2 = this.f62403b.f62382b;
                int iP2 = c2507c2.p();
                if (iP2 > 0) {
                    Object[] objArrO2 = c2507c2.o();
                    do {
                        ((a) objArrO2[i10]).s();
                        i10++;
                    } while (i10 < iP2);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return Td.L.f17438a;
            }
        }

        /* JADX INFO: renamed from: w.N$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0935b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Gf.O f62406a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0935b(Gf.O o10) {
                super(0);
                this.f62406a = o10;
            }

            @Override // ie.InterfaceC5082a
            public final Float invoke() {
                return Float.valueOf(m0.n(this.f62406a.getCoroutineContext()));
            }
        }

        /* JADX INFO: renamed from: w.N$b$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f62407a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ float f62408b;

            c(Zd.e eVar) {
                super(2, eVar);
            }

            public final Object a(float f10, Zd.e eVar) {
                return ((c) create(Float.valueOf(f10), eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                c cVar = new c(eVar);
                cVar.f62408b = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).floatValue(), (Zd.e) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f62407a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f62408b > 0.0f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Y.C0 c02, C6885N c6885n, Zd.e eVar) {
            super(2, eVar);
            this.f62400d = c02;
            this.f62401e = c6885n;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f62400d, this.f62401e, eVar);
            bVar.f62399c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Path cross not found for [B:11:0x0040, B:16:0x005d], limit reached: 18 */
        /* JADX WARN: Path cross not found for [B:16:0x005d, B:11:0x0040], limit reached: 18 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[PHI: r1 r8
  0x0056: PHI (r1v2 kotlin.jvm.internal.K) = (r1v3 kotlin.jvm.internal.K), (r1v5 kotlin.jvm.internal.K) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r8v3 Gf.O) = (r8v4 Gf.O), (r8v5 Gf.O) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r7.f62398b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f62397a
                kotlin.jvm.internal.K r1 = (kotlin.jvm.internal.K) r1
                java.lang.Object r4 = r7.f62399c
                Gf.O r4 = (Gf.O) r4
                Td.v.b(r8)
                r8 = r4
                goto L40
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.f62397a
                kotlin.jvm.internal.K r1 = (kotlin.jvm.internal.K) r1
                java.lang.Object r4 = r7.f62399c
                Gf.O r4 = (Gf.O) r4
                Td.v.b(r8)
                r8 = r4
                goto L56
            L30:
                Td.v.b(r8)
                java.lang.Object r8 = r7.f62399c
                Gf.O r8 = (Gf.O) r8
                kotlin.jvm.internal.K r1 = new kotlin.jvm.internal.K
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f52256a = r4
            L40:
                w.N$b$a r4 = new w.N$b$a
                Y.C0 r5 = r7.f62400d
                w.N r6 = r7.f62401e
                r4.<init>(r5, r6, r1, r8)
                r7.f62399c = r8
                r7.f62397a = r1
                r7.f62398b = r3
                java.lang.Object r4 = w.AbstractC6883L.a(r4, r7)
                if (r4 != r0) goto L56
                goto L78
            L56:
                float r4 = r1.f52256a
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L40
                w.N$b$b r4 = new w.N$b$b
                r4.<init>(r8)
                Jf.e r4 = Y.U1.p(r4)
                w.N$b$c r5 = new w.N$b$c
                r6 = 0
                r5.<init>(r6)
                r7.f62399c = r8
                r7.f62397a = r1
                r7.f62398b = r2
                java.lang.Object r4 = Jf.AbstractC1744g.o(r4, r5, r7)
                if (r4 != r0) goto L40
            L78:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w.C6885N.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: w.N$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f62410b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(2);
            this.f62410b = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            C6885N.this.k(interfaceC2425m, AbstractC2409g1.a(this.f62410b | 1));
        }
    }

    public C6885N(String str) {
        this.f62381a = str;
    }

    private final boolean g() {
        return ((Boolean) this.f62383c.getValue()).booleanValue();
    }

    private final boolean h() {
        return ((Boolean) this.f62385e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long j10) {
        boolean z10;
        C2507c c2507c = this.f62382b;
        int iP = c2507c.p();
        if (iP > 0) {
            Object[] objArrO = c2507c.o();
            z10 = true;
            int i10 = 0;
            do {
                a aVar = (a) objArrO[i10];
                if (!aVar.n()) {
                    aVar.p(j10);
                }
                if (!aVar.n()) {
                    z10 = false;
                }
                i10++;
            } while (i10 < iP);
        } else {
            z10 = true;
        }
        m(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z10) {
        this.f62383c.setValue(Boolean.valueOf(z10));
    }

    private final void m(boolean z10) {
        this.f62385e.setValue(Boolean.valueOf(z10));
    }

    public final void f(a aVar) {
        this.f62382b.c(aVar);
        l(true);
    }

    public final void j(a aVar) {
        this.f62382b.w(aVar);
    }

    public final void k(InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-318043801);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-318043801, i11, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            Object objD = interfaceC2425mG.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = b2.e(null, null, 2, null);
                interfaceC2425mG.u(objD);
            }
            Y.C0 c02 = (Y.C0) objD;
            if (h() || g()) {
                interfaceC2425mG.V(1719915818);
                boolean zF = interfaceC2425mG.F(this);
                Object objD2 = interfaceC2425mG.D();
                if (zF || objD2 == aVar.a()) {
                    objD2 = new b(c02, this, null);
                    interfaceC2425mG.u(objD2);
                }
                AbstractC2393b0.e(this, (Function2) objD2, interfaceC2425mG, i11 & 14);
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(1721436120);
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new c(i10));
        }
    }
}
