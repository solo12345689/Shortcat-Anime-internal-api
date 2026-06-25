package T;

import Gf.AbstractC1617k;
import Gf.AbstractC1646z;
import Gf.InterfaceC1642x;
import Gf.O;
import Gf.P;
import Td.L;
import Td.v;
import Y.C0;
import Y.b2;
import ae.AbstractC2605b;
import com.facebook.imageutils.JfifUtil;
import k1.AbstractC5437b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.AbstractC6225g;
import r0.C6224f;
import r0.C6230l;
import s0.AbstractC6384q0;
import s0.C6385r0;
import u0.InterfaceC6709d;
import u0.InterfaceC6711f;
import w.AbstractC6877F;
import w.AbstractC6890b;
import w.AbstractC6906j;
import w.C6888a;
import w.r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    private C6224f f16693a;

    /* JADX INFO: renamed from: b */
    private final float f16694b;

    /* JADX INFO: renamed from: c */
    private final boolean f16695c;

    /* JADX INFO: renamed from: d */
    private Float f16696d;

    /* JADX INFO: renamed from: e */
    private C6224f f16697e;

    /* JADX INFO: renamed from: f */
    private final C6888a f16698f;

    /* JADX INFO: renamed from: g */
    private final C6888a f16699g;

    /* JADX INFO: renamed from: h */
    private final C6888a f16700h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1642x f16701i;

    /* JADX INFO: renamed from: j */
    private final C0 f16702j;

    /* JADX INFO: renamed from: k */
    private final C0 f16703k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f16704a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f16705b;

        /* JADX INFO: renamed from: d */
        int f16707d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16705b = obj;
            this.f16707d |= Integer.MIN_VALUE;
            return e.this.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f16708a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f16709b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f16711a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ e f16712b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Zd.e eVar2) {
                super(2, eVar2);
                this.f16712b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f16712b, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f16711a;
                if (i10 == 0) {
                    v.b(obj);
                    C6888a c6888a = this.f16712b.f16698f;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    r0 r0VarJ = AbstractC6906j.j(75, 0, AbstractC6877F.e(), 2, null);
                    this.f16711a = 1;
                    if (C6888a.f(c6888a, fC, r0VarJ, null, null, this, 12, null) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: T.e$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0286b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f16713a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ e f16714b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0286b(e eVar, Zd.e eVar2) {
                super(2, eVar2);
                this.f16714b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0286b(this.f16714b, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0286b) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f16713a;
                if (i10 == 0) {
                    v.b(obj);
                    C6888a c6888a = this.f16714b.f16699g;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    r0 r0VarJ = AbstractC6906j.j(JfifUtil.MARKER_APP1, 0, AbstractC6877F.d(), 2, null);
                    this.f16713a = 1;
                    if (C6888a.f(c6888a, fC, r0VarJ, null, null, this, 12, null) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return L.f17438a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f16715a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ e f16716b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e eVar, Zd.e eVar2) {
                super(2, eVar2);
                this.f16716b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new c(this.f16716b, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f16715a;
                if (i10 == 0) {
                    v.b(obj);
                    C6888a c6888a = this.f16716b.f16700h;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(1.0f);
                    r0 r0VarJ = AbstractC6906j.j(JfifUtil.MARKER_APP1, 0, AbstractC6877F.e(), 2, null);
                    this.f16715a = 1;
                    if (C6888a.f(c6888a, fC, r0VarJ, null, null, this, 12, null) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return L.f17438a;
            }
        }

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = e.this.new b(eVar);
            bVar.f16709b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f16708a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            O o10 = (O) this.f16709b;
            AbstractC1617k.d(o10, null, null, new a(e.this, null), 3, null);
            AbstractC1617k.d(o10, null, null, new C0286b(e.this, null), 3, null);
            return AbstractC1617k.d(o10, null, null, new c(e.this, null), 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f16717a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f16718b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f16720a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ e f16721b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Zd.e eVar2) {
                super(2, eVar2);
                this.f16721b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f16721b, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f16720a;
                if (i10 == 0) {
                    v.b(obj);
                    C6888a c6888a = this.f16721b.f16698f;
                    Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                    r0 r0VarJ = AbstractC6906j.j(150, 0, AbstractC6877F.e(), 2, null);
                    this.f16720a = 1;
                    if (C6888a.f(c6888a, fC, r0VarJ, null, null, this, 12, null) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return L.f17438a;
            }
        }

        c(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            c cVar = e.this.new c(eVar);
            cVar.f16718b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f16717a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            return AbstractC1617k.d((O) this.f16718b, null, null, new a(e.this, null), 3, null);
        }
    }

    public /* synthetic */ e(C6224f c6224f, float f10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6224f, f10, z10);
    }

    private final Object f(Zd.e eVar) {
        Object objE = P.e(new b(null), eVar);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }

    private final Object g(Zd.e eVar) {
        Object objE = P.e(new c(null), eVar);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }

    private final boolean i() {
        return ((Boolean) this.f16703k.getValue()).booleanValue();
    }

    private final boolean j() {
        return ((Boolean) this.f16702j.getValue()).booleanValue();
    }

    private final void k(boolean z10) {
        this.f16703k.setValue(Boolean.valueOf(z10));
    }

    private final void l(boolean z10) {
        this.f16702j.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x006f, code lost:
    
        if (r2.g(r0) != r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(Zd.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof T.e.a
            if (r0 == 0) goto L13
            r0 = r7
            T.e$a r0 = (T.e.a) r0
            int r1 = r0.f16707d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16707d = r1
            goto L18
        L13:
            T.e$a r0 = new T.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16705b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f16707d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            Td.v.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f16704a
            T.e r2 = (T.e) r2
            Td.v.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.f16704a
            T.e r2 = (T.e) r2
            Td.v.b(r7)
            goto L56
        L47:
            Td.v.b(r7)
            r0.f16704a = r6
            r0.f16707d = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            goto L71
        L55:
            r2 = r6
        L56:
            r2.l(r5)
            Gf.x r7 = r2.f16701i
            r0.f16704a = r2
            r0.f16707d = r4
            java.lang.Object r7 = r7.M0(r0)
            if (r7 != r1) goto L66
            goto L71
        L66:
            r7 = 0
            r0.f16704a = r7
            r0.f16707d = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            Td.L r7 = Td.L.f17438a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T.e.d(Zd.e):java.lang.Object");
    }

    public final void e(InterfaceC6711f interfaceC6711f, long j10) {
        if (this.f16696d == null) {
            this.f16696d = Float.valueOf(f.b(interfaceC6711f.f()));
        }
        if (this.f16693a == null) {
            this.f16693a = C6224f.d(interfaceC6711f.t1());
        }
        if (this.f16697e == null) {
            this.f16697e = C6224f.d(AbstractC6225g.a(C6230l.i(interfaceC6711f.f()) / 2.0f, C6230l.g(interfaceC6711f.f()) / 2.0f));
        }
        float fFloatValue = (!i() || j()) ? ((Number) this.f16698f.m()).floatValue() : 1.0f;
        Float f10 = this.f16696d;
        AbstractC5504s.e(f10);
        float fB = AbstractC5437b.b(f10.floatValue(), this.f16694b, ((Number) this.f16699g.m()).floatValue());
        C6224f c6224f = this.f16693a;
        AbstractC5504s.e(c6224f);
        float fM = C6224f.m(c6224f.u());
        C6224f c6224f2 = this.f16697e;
        AbstractC5504s.e(c6224f2);
        float fB2 = AbstractC5437b.b(fM, C6224f.m(c6224f2.u()), ((Number) this.f16700h.m()).floatValue());
        C6224f c6224f3 = this.f16693a;
        AbstractC5504s.e(c6224f3);
        float fN = C6224f.n(c6224f3.u());
        C6224f c6224f4 = this.f16697e;
        AbstractC5504s.e(c6224f4);
        long jA = AbstractC6225g.a(fB2, AbstractC5437b.b(fN, C6224f.n(c6224f4.u()), ((Number) this.f16700h.m()).floatValue()));
        long jQ = C6385r0.q(j10, C6385r0.t(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.f16695c) {
            InterfaceC6711f.e0(interfaceC6711f, jQ, fB, jA, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fI = C6230l.i(interfaceC6711f.f());
        float fG = C6230l.g(interfaceC6711f.f());
        int iB = AbstractC6384q0.f58976a.b();
        InterfaceC6709d interfaceC6709dN1 = interfaceC6711f.n1();
        long jF = interfaceC6709dN1.f();
        interfaceC6709dN1.b().p();
        interfaceC6709dN1.a().c(0.0f, 0.0f, fI, fG, iB);
        InterfaceC6711f.e0(interfaceC6711f, jQ, fB, jA, 0.0f, null, null, 0, 120, null);
        interfaceC6709dN1.b().k();
        interfaceC6709dN1.e(jF);
    }

    public final void h() {
        k(true);
        this.f16701i.O(L.f17438a);
    }

    private e(C6224f c6224f, float f10, boolean z10) {
        this.f16693a = c6224f;
        this.f16694b = f10;
        this.f16695c = z10;
        this.f16698f = AbstractC6890b.b(0.0f, 0.0f, 2, null);
        this.f16699g = AbstractC6890b.b(0.0f, 0.0f, 2, null);
        this.f16700h = AbstractC6890b.b(0.0f, 0.0f, 2, null);
        this.f16701i = AbstractC1646z.a(null);
        Boolean bool = Boolean.FALSE;
        this.f16702j = b2.e(bool, null, 2, null);
        this.f16703k = b2.e(bool, null, 2, null);
    }
}
