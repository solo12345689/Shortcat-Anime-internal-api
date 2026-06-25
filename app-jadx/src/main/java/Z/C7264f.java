package z;

import Gf.AbstractC1617k;
import Gf.C0;
import Gf.C1627p;
import Gf.F0;
import Gf.G0;
import Gf.InterfaceC1623n;
import Gf.O;
import Gf.Q;
import I0.InterfaceC1690p;
import K0.AbstractC1792i;
import K0.AbstractC1796k;
import K0.InterfaceC1790h;
import Td.L;
import a0.C2507c;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import i1.AbstractC5026s;
import i1.C5025r;
import ie.InterfaceC5082a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6225g;
import r0.C6224f;
import r0.C6226h;
import r0.C6230l;
import x.EnumC6992L;

/* JADX INFO: renamed from: z.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7264f extends e.c implements H.c, K0.D, InterfaceC1790h {

    /* JADX INFO: renamed from: a */
    private q f65292a;

    /* JADX INFO: renamed from: b */
    private final z f65293b;

    /* JADX INFO: renamed from: c */
    private boolean f65294c;

    /* JADX INFO: renamed from: d */
    private InterfaceC7262d f65295d;

    /* JADX INFO: renamed from: e */
    private final boolean f65296e;

    /* JADX INFO: renamed from: g */
    private InterfaceC1690p f65298g;

    /* JADX INFO: renamed from: h */
    private C6226h f65299h;

    /* JADX INFO: renamed from: i */
    private boolean f65300i;

    /* JADX INFO: renamed from: k */
    private boolean f65302k;

    /* JADX INFO: renamed from: f */
    private final C7261c f65297f = new C7261c();

    /* JADX INFO: renamed from: j */
    private long f65301j = C5025r.f48570b.a();

    /* JADX INFO: renamed from: z.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5082a f65303a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC1623n f65304b;

        public a(InterfaceC5082a interfaceC5082a, InterfaceC1623n interfaceC1623n) {
            this.f65303a = interfaceC5082a;
            this.f65304b = interfaceC1623n;
        }

        public final InterfaceC1623n a() {
            return this.f65304b;
        }

        public final InterfaceC5082a b() {
            return this.f65303a;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                Gf.n r0 = r4.f65304b
                Zd.i r0 = r0.getContext()
                Gf.N$a r1 = Gf.N.f7525c
                Zd.i$b r0 = r0.l(r1)
                Gf.N r0 = (Gf.N) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.D1()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = Df.AbstractC1268a.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.AbstractC5504s.g(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                ie.a r0 = r4.f65303a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                Gf.n r0 = r4.f65304b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z.C7264f.a.toString():java.lang.String");
        }
    }

    /* JADX INFO: renamed from: z.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65305a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65305a = iArr;
        }
    }

    /* JADX INFO: renamed from: z.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f65306a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f65307b;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C7258E f65309d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC7262d f65310e;

        /* JADX INFO: renamed from: z.f$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f65311a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Object f65312b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C7258E f65313c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ C7264f f65314d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ InterfaceC7262d f65315e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ C0 f65316f;

            /* JADX INFO: renamed from: z.f$c$a$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0989a extends AbstractC5506u implements Function1 {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C7264f f65317a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C7258E f65318b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ C0 f65319c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ p f65320d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0989a(C7264f c7264f, C7258E c7258e, C0 c02, p pVar) {
                    super(1);
                    this.f65317a = c7264f;
                    this.f65318b = c7258e;
                    this.f65319c = c02;
                    this.f65320d = pVar;
                }

                public final void a(float f10) {
                    float f11 = this.f65317a.f65294c ? 1.0f : -1.0f;
                    z zVar = this.f65317a.f65293b;
                    float fA = f11 * zVar.A(zVar.u(this.f65320d.b(zVar.u(zVar.B(f11 * f10)), D0.e.f3532a.b())));
                    if (Math.abs(fA) < Math.abs(f10)) {
                        G0.e(this.f65319c, "Scroll animation cancelled because scroll was not consumed (" + fA + " < " + f10 + ')', null, 2, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).floatValue());
                    return L.f17438a;
                }
            }

            /* JADX INFO: renamed from: z.f$c$a$b */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class b extends AbstractC5506u implements InterfaceC5082a {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ C7264f f65321a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C7258E f65322b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ InterfaceC7262d f65323c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C7264f c7264f, C7258E c7258e, InterfaceC7262d interfaceC7262d) {
                    super(0);
                    this.f65321a = c7264f;
                    this.f65322b = c7258e;
                    this.f65323c = interfaceC7262d;
                }

                @Override // ie.InterfaceC5082a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m979invoke();
                    return L.f17438a;
                }

                /* JADX INFO: renamed from: invoke */
                public final void m979invoke() {
                    C7261c c7261c = this.f65321a.f65297f;
                    C7264f c7264f = this.f65321a;
                    while (true) {
                        if (!c7261c.f65279a.t()) {
                            break;
                        }
                        C6226h c6226h = (C6226h) ((a) c7261c.f65279a.u()).b().invoke();
                        if (!(c6226h == null ? true : C7264f.W1(c7264f, c6226h, 0L, 1, null))) {
                            break;
                        } else {
                            ((a) c7261c.f65279a.y(c7261c.f65279a.p() - 1)).a().resumeWith(Td.u.b(L.f17438a));
                        }
                    }
                    if (this.f65321a.f65300i) {
                        C6226h c6226hT1 = this.f65321a.T1();
                        if (c6226hT1 != null && C7264f.W1(this.f65321a, c6226hT1, 0L, 1, null)) {
                            this.f65321a.f65300i = false;
                        }
                    }
                    this.f65322b.j(this.f65321a.O1(this.f65323c));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C7258E c7258e, C7264f c7264f, InterfaceC7262d interfaceC7262d, C0 c02, Zd.e eVar) {
                super(2, eVar);
                this.f65313c = c7258e;
                this.f65314d = c7264f;
                this.f65315e = interfaceC7262d;
                this.f65316f = c02;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a */
            public final Object invoke(p pVar, Zd.e eVar) {
                return ((a) create(pVar, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                a aVar = new a(this.f65313c, this.f65314d, this.f65315e, this.f65316f, eVar);
                aVar.f65312b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f65311a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    p pVar = (p) this.f65312b;
                    this.f65313c.j(this.f65314d.O1(this.f65315e));
                    C7258E c7258e = this.f65313c;
                    C0989a c0989a = new C0989a(this.f65314d, c7258e, this.f65316f, pVar);
                    b bVar = new b(this.f65314d, this.f65313c, this.f65315e);
                    this.f65311a = 1;
                    if (c7258e.h(c0989a, bVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                }
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C7258E c7258e, InterfaceC7262d interfaceC7262d, Zd.e eVar) {
            super(2, eVar);
            this.f65309d = c7258e;
            this.f65310e = interfaceC7262d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            c cVar = C7264f.this.new c(this.f65309d, this.f65310e, eVar);
            cVar.f65307b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f65306a;
            try {
                try {
                    if (i10 == 0) {
                        Td.v.b(obj);
                        C0 c0K = F0.k(((O) this.f65307b).getCoroutineContext());
                        C7264f.this.f65302k = true;
                        z zVar = C7264f.this.f65293b;
                        EnumC6992L enumC6992L = EnumC6992L.Default;
                        a aVar = new a(this.f65309d, C7264f.this, this.f65310e, c0K, null);
                        this.f65306a = 1;
                        if (zVar.v(enumC6992L, aVar, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Td.v.b(obj);
                    }
                    C7264f.this.f65297f.d();
                    C7264f.this.f65302k = false;
                    C7264f.this.f65297f.b(null);
                    C7264f.this.f65300i = false;
                    return L.f17438a;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                C7264f.this.f65302k = false;
                C7264f.this.f65297f.b(null);
                C7264f.this.f65300i = false;
                throw th2;
            }
        }
    }

    public C7264f(q qVar, z zVar, boolean z10, InterfaceC7262d interfaceC7262d) {
        this.f65292a = qVar;
        this.f65293b = zVar;
        this.f65294c = z10;
        this.f65295d = interfaceC7262d;
    }

    public final float O1(InterfaceC7262d interfaceC7262d) {
        if (C5025r.e(this.f65301j, C5025r.f48570b.a())) {
            return 0.0f;
        }
        C6226h c6226hS1 = S1();
        if (c6226hS1 == null) {
            c6226hS1 = this.f65300i ? T1() : null;
            if (c6226hS1 == null) {
                return 0.0f;
            }
        }
        long jD = AbstractC5026s.d(this.f65301j);
        int i10 = b.f65305a[this.f65292a.ordinal()];
        if (i10 == 1) {
            return interfaceC7262d.a(c6226hS1.l(), c6226hS1.e() - c6226hS1.l(), C6230l.g(jD));
        }
        if (i10 == 2) {
            return interfaceC7262d.a(c6226hS1.i(), c6226hS1.j() - c6226hS1.i(), C6230l.i(jD));
        }
        throw new Td.r();
    }

    private final int P1(long j10, long j11) {
        int i10 = b.f65305a[this.f65292a.ordinal()];
        if (i10 == 1) {
            return AbstractC5504s.i(C5025r.f(j10), C5025r.f(j11));
        }
        if (i10 == 2) {
            return AbstractC5504s.i(C5025r.g(j10), C5025r.g(j11));
        }
        throw new Td.r();
    }

    private final int Q1(long j10, long j11) {
        int i10 = b.f65305a[this.f65292a.ordinal()];
        if (i10 == 1) {
            return Float.compare(C6230l.g(j10), C6230l.g(j11));
        }
        if (i10 == 2) {
            return Float.compare(C6230l.i(j10), C6230l.i(j11));
        }
        throw new Td.r();
    }

    private final C6226h R1(C6226h c6226h, long j10) {
        return c6226h.t(C6224f.t(Z1(c6226h, j10)));
    }

    private final C6226h S1() {
        C2507c c2507c = this.f65297f.f65279a;
        int iP = c2507c.p();
        C6226h c6226h = null;
        if (iP > 0) {
            int i10 = iP - 1;
            Object[] objArrO = c2507c.o();
            do {
                C6226h c6226h2 = (C6226h) ((a) objArrO[i10]).b().invoke();
                if (c6226h2 != null) {
                    if (Q1(c6226h2.k(), AbstractC5026s.d(this.f65301j)) > 0) {
                        return c6226h == null ? c6226h2 : c6226h;
                    }
                    c6226h = c6226h2;
                }
                i10--;
            } while (i10 >= 0);
        }
        return c6226h;
    }

    public final C6226h T1() {
        if (!isAttached()) {
            return null;
        }
        InterfaceC1690p interfaceC1690pL = AbstractC1796k.l(this);
        InterfaceC1690p interfaceC1690p = this.f65298g;
        if (interfaceC1690p != null) {
            if (!interfaceC1690p.b()) {
                interfaceC1690p = null;
            }
            if (interfaceC1690p != null) {
                return interfaceC1690pL.w0(interfaceC1690p, false);
            }
        }
        return null;
    }

    private final boolean V1(C6226h c6226h, long j10) {
        long jZ1 = Z1(c6226h, j10);
        return Math.abs(C6224f.m(jZ1)) <= 0.5f && Math.abs(C6224f.n(jZ1)) <= 0.5f;
    }

    static /* synthetic */ boolean W1(C7264f c7264f, C6226h c6226h, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = c7264f.f65301j;
        }
        return c7264f.V1(c6226h, j10);
    }

    public final void X1() {
        InterfaceC7262d interfaceC7262dA2 = a2();
        if (this.f65302k) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        AbstractC1617k.d(getCoroutineScope(), null, Q.f7532d, new c(new C7258E(interfaceC7262dA2.b()), interfaceC7262dA2, null), 1, null);
    }

    private final long Z1(C6226h c6226h, long j10) {
        long jD = AbstractC5026s.d(j10);
        int i10 = b.f65305a[this.f65292a.ordinal()];
        if (i10 == 1) {
            return AbstractC6225g.a(0.0f, a2().a(c6226h.l(), c6226h.e() - c6226h.l(), C6230l.g(jD)));
        }
        if (i10 == 2) {
            return AbstractC6225g.a(a2().a(c6226h.i(), c6226h.j() - c6226h.i(), C6230l.i(jD)), 0.0f);
        }
        throw new Td.r();
    }

    private final InterfaceC7262d a2() {
        InterfaceC7262d interfaceC7262d = this.f65295d;
        return interfaceC7262d == null ? (InterfaceC7262d) AbstractC1792i.a(this, AbstractC7263e.a()) : interfaceC7262d;
    }

    @Override // K0.D
    public void I(long j10) {
        C6226h c6226hT1;
        long j11 = this.f65301j;
        this.f65301j = j10;
        if (P1(j10, j11) < 0 && (c6226hT1 = T1()) != null) {
            C6226h c6226h = this.f65299h;
            if (c6226h == null) {
                c6226h = c6226hT1;
            }
            if (!this.f65302k && !this.f65300i && V1(c6226h, j11) && !V1(c6226hT1, j10)) {
                this.f65300i = true;
                X1();
            }
            this.f65299h = c6226hT1;
        }
    }

    @Override // H.c
    public C6226h N(C6226h c6226h) {
        if (C5025r.e(this.f65301j, C5025r.f48570b.a())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return R1(c6226h, this.f65301j);
    }

    public final long U1() {
        return this.f65301j;
    }

    @Override // H.c
    public Object W(InterfaceC5082a interfaceC5082a, Zd.e eVar) {
        C6226h c6226h = (C6226h) interfaceC5082a.invoke();
        if (c6226h == null || W1(this, c6226h, 0L, 1, null)) {
            return L.f17438a;
        }
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        if (this.f65297f.c(new a(interfaceC5082a, c1627p)) && !this.f65302k) {
            X1();
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : L.f17438a;
    }

    public final void Y1(InterfaceC1690p interfaceC1690p) {
        this.f65298g = interfaceC1690p;
    }

    public final void b2(q qVar, boolean z10, InterfaceC7262d interfaceC7262d) {
        this.f65292a = qVar;
        this.f65294c = z10;
        this.f65295d = interfaceC7262d;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f65296e;
    }
}
