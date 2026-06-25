package U;

import B.o;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Ud.AbstractC2279u;
import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import ae.AbstractC2605b;
import i0.C4961E;
import i1.C5015h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w.C6888a;
import w.u0;

/* JADX INFO: renamed from: U.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2173j {

    /* JADX INFO: renamed from: a */
    private final float f18408a;

    /* JADX INFO: renamed from: b */
    private final float f18409b;

    /* JADX INFO: renamed from: c */
    private final float f18410c;

    /* JADX INFO: renamed from: d */
    private final float f18411d;

    /* JADX INFO: renamed from: e */
    private final float f18412e;

    /* JADX INFO: renamed from: U.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f18413a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ B.k f18414b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C4961E f18415c;

        /* JADX INFO: renamed from: U.j$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0315a implements InterfaceC1743f {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C4961E f18416a;

            C0315a(C4961E c4961e) {
                this.f18416a = c4961e;
            }

            @Override // Jf.InterfaceC1743f
            /* JADX INFO: renamed from: a */
            public final Object emit(B.j jVar, Zd.e eVar) {
                if (jVar instanceof B.g) {
                    this.f18416a.add(jVar);
                } else if (jVar instanceof B.h) {
                    this.f18416a.remove(((B.h) jVar).a());
                } else if (jVar instanceof B.d) {
                    this.f18416a.add(jVar);
                } else if (jVar instanceof B.e) {
                    this.f18416a.remove(((B.e) jVar).a());
                } else if (jVar instanceof o.b) {
                    this.f18416a.add(jVar);
                } else if (jVar instanceof o.c) {
                    this.f18416a.remove(((o.c) jVar).a());
                } else if (jVar instanceof o.a) {
                    this.f18416a.remove(((o.a) jVar).a());
                }
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B.k kVar, C4961E c4961e, Zd.e eVar) {
            super(2, eVar);
            this.f18414b = kVar;
            this.f18415c = c4961e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f18414b, this.f18415c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f18413a;
            if (i10 == 0) {
                Td.v.b(obj);
                InterfaceC1742e interfaceC1742eB = this.f18414b.b();
                C0315a c0315a = new C0315a(this.f18415c);
                this.f18413a = 1;
                if (interfaceC1742eB.collect(c0315a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: U.j$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f18417a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6888a f18418b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ float f18419c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f18420d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C2173j f18421e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ B.j f18422f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6888a c6888a, float f10, boolean z10, C2173j c2173j, B.j jVar, Zd.e eVar) {
            super(2, eVar);
            this.f18418b = c6888a;
            this.f18419c = f10;
            this.f18420d = z10;
            this.f18421e = c2173j;
            this.f18422f = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new b(this.f18418b, this.f18419c, this.f18420d, this.f18421e, this.f18422f, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0045, code lost:
        
            if (r7.s(r1, r6) == r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        
            if (W.c.d(r7, r1, r3, r4, r6) == r0) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r6.f18417a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                Td.v.b(r7)
                goto La0
            L1c:
                Td.v.b(r7)
                w.a r7 = r6.f18418b
                java.lang.Object r7 = r7.k()
                i1.h r7 = (i1.C5015h) r7
                float r7 = r7.t()
                float r1 = r6.f18419c
                boolean r7 = i1.C5015h.q(r7, r1)
                if (r7 != 0) goto La0
                boolean r7 = r6.f18420d
                if (r7 != 0) goto L48
                w.a r7 = r6.f18418b
                float r1 = r6.f18419c
                i1.h r1 = i1.C5015h.h(r1)
                r6.f18417a = r3
                java.lang.Object r7 = r7.s(r1, r6)
                if (r7 != r0) goto La0
                goto L9f
            L48:
                w.a r7 = r6.f18418b
                java.lang.Object r7 = r7.k()
                i1.h r7 = (i1.C5015h) r7
                float r7 = r7.t()
                U.j r1 = r6.f18421e
                float r1 = U.C2173j.c(r1)
                boolean r1 = i1.C5015h.q(r7, r1)
                r3 = 0
                if (r1 == 0) goto L6e
                B.o$b r7 = new B.o$b
                r0.f$a r1 = r0.C6224f.f58329b
                long r4 = r1.c()
                r7.<init>(r4, r3)
                r3 = r7
                goto L91
            L6e:
                U.j r1 = r6.f18421e
                float r1 = U.C2173j.b(r1)
                boolean r1 = i1.C5015h.q(r7, r1)
                if (r1 == 0) goto L80
                B.g r3 = new B.g
                r3.<init>()
                goto L91
            L80:
                U.j r1 = r6.f18421e
                float r1 = U.C2173j.a(r1)
                boolean r7 = i1.C5015h.q(r7, r1)
                if (r7 == 0) goto L91
                B.d r3 = new B.d
                r3.<init>()
            L91:
                w.a r7 = r6.f18418b
                float r1 = r6.f18419c
                B.j r4 = r6.f18422f
                r6.f18417a = r2
                java.lang.Object r7 = W.c.d(r7, r1, r3, r4, r6)
                if (r7 != r0) goto La0
            L9f:
                return r0
            La0:
                Td.L r7 = Td.L.f17438a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: U.C2173j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ C2173j(float f10, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14);
    }

    private final h2 d(boolean z10, B.k kVar, InterfaceC2425m interfaceC2425m, int i10) {
        C6888a c6888a;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1312510462, i10, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:938)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = U1.e();
            interfaceC2425m.u(objD);
        }
        C4961E c4961e = (C4961E) objD;
        boolean z11 = true;
        boolean z12 = (((i10 & 112) ^ 48) > 32 && interfaceC2425m.U(kVar)) || (i10 & 48) == 32;
        Object objD2 = interfaceC2425m.D();
        if (z12 || objD2 == aVar.a()) {
            objD2 = new a(kVar, c4961e, null);
            interfaceC2425m.u(objD2);
        }
        AbstractC2393b0.e(kVar, (Function2) objD2, interfaceC2425m, (i10 >> 3) & 14);
        B.j jVar = (B.j) AbstractC2279u.A0(c4961e);
        float f10 = !z10 ? this.f18412e : jVar instanceof o.b ? this.f18409b : jVar instanceof B.g ? this.f18411d : jVar instanceof B.d ? this.f18410c : this.f18408a;
        Object objD3 = interfaceC2425m.D();
        if (objD3 == aVar.a()) {
            Object c6888a2 = new C6888a(C5015h.h(f10), u0.b(C5015h.f48547b), null, null, 12, null);
            interfaceC2425m.u(c6888a2);
            objD3 = c6888a2;
        }
        C6888a c6888a3 = (C6888a) objD3;
        C5015h c5015hH = C5015h.h(f10);
        boolean zF = interfaceC2425m.F(c6888a3) | interfaceC2425m.b(f10) | ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.a(z10)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ 384) <= 256 || !interfaceC2425m.U(this)) && (i10 & 384) != 256) {
            z11 = false;
        }
        boolean zF2 = zF | z11 | interfaceC2425m.F(jVar);
        Object objD4 = interfaceC2425m.D();
        if (zF2 || objD4 == aVar.a()) {
            c6888a = c6888a3;
            Object bVar = new b(c6888a, f10, z10, this, jVar, null);
            interfaceC2425m.u(bVar);
            objD4 = bVar;
        } else {
            c6888a = c6888a3;
        }
        AbstractC2393b0.e(c5015hH, (Function2) objD4, interfaceC2425m, 0);
        h2 h2VarG = c6888a.g();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarG;
    }

    public final h2 e(boolean z10, B.k kVar, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-2045116089, i10, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:930)");
        }
        h2 h2VarD = d(z10, kVar, interfaceC2425m, i10 & 1022);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2173j)) {
            return false;
        }
        C2173j c2173j = (C2173j) obj;
        return C5015h.q(this.f18408a, c2173j.f18408a) && C5015h.q(this.f18409b, c2173j.f18409b) && C5015h.q(this.f18410c, c2173j.f18410c) && C5015h.q(this.f18411d, c2173j.f18411d) && C5015h.q(this.f18412e, c2173j.f18412e);
    }

    public int hashCode() {
        return (((((((C5015h.r(this.f18408a) * 31) + C5015h.r(this.f18409b)) * 31) + C5015h.r(this.f18410c)) * 31) + C5015h.r(this.f18411d)) * 31) + C5015h.r(this.f18412e);
    }

    private C2173j(float f10, float f11, float f12, float f13, float f14) {
        this.f18408a = f10;
        this.f18409b = f11;
        this.f18410c = f12;
        this.f18411d = f13;
        this.f18412e = f14;
    }
}
