package z;

import Td.L;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.M;
import r0.AbstractC6225g;
import r0.C6224f;
import x.EnumC6992L;
import x.InterfaceC6999T;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x f65434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC6999T f65435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f65436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q f65437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f65438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private D0.b f65439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65440g = D0.e.f3532a.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u f65441h = androidx.compose.foundation.gestures.d.f25977b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f65442i = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Function1 f65443j = new e();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f65444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f65445b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f65447d;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f65445b = obj;
            this.f65447d |= Integer.MIN_VALUE;
            return z.this.n(0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f65448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f65449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f65450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f65451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f65452e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ M f65454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f65455h;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f65456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f65457b;

            a(z zVar, p pVar) {
                this.f65456a = zVar;
                this.f65457b = pVar;
            }

            @Override // z.u
            public float a(float f10) {
                z zVar = this.f65456a;
                return zVar.t(zVar.A(this.f65457b.a(zVar.u(zVar.B(f10)), D0.e.f3532a.a())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(M m10, long j10, Zd.e eVar) {
            super(2, eVar);
            this.f65454g = m10;
            this.f65455h = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p pVar, Zd.e eVar) {
            return ((b) create(pVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = z.this.new b(this.f65454g, this.f65455h, eVar);
            bVar.f65452e = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            z zVar;
            M m10;
            z zVar2;
            long j10;
            Object objF = AbstractC2605b.f();
            int i10 = this.f65451d;
            if (i10 == 0) {
                Td.v.b(obj);
                a aVar = new a(z.this, (p) this.f65452e);
                zVar = z.this;
                M m11 = this.f65454g;
                long j11 = this.f65455h;
                n nVar = zVar.f65436c;
                long j12 = m11.f52258a;
                float fT = zVar.t(zVar.z(j11));
                this.f65452e = zVar;
                this.f65448a = zVar;
                this.f65449b = m11;
                this.f65450c = j12;
                this.f65451d = 1;
                Object objA = nVar.a(aVar, fT, this);
                if (objA == objF) {
                    return objF;
                }
                m10 = m11;
                obj = objA;
                zVar2 = zVar;
                j10 = j12;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f65450c;
                m10 = (M) this.f65449b;
                zVar = (z) this.f65448a;
                zVar2 = (z) this.f65452e;
                Td.v.b(obj);
            }
            m10.f52258a = zVar.D(j10, zVar2.t(((Number) obj).floatValue()));
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements p {
        c() {
        }

        @Override // z.p
        public long a(long j10, int i10) {
            z.this.f65440g = i10;
            InterfaceC6999T interfaceC6999T = z.this.f65435b;
            if (interfaceC6999T != null && z.this.o()) {
                return interfaceC6999T.c(j10, z.this.f65440g, z.this.f65443j);
            }
            return z.this.s(z.this.f65441h, j10, i10);
        }

        @Override // z.p
        public long b(long j10, int i10) {
            return z.this.s(z.this.f65441h, j10, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f65459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f65460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ long f65461c;

        d(Zd.e eVar) {
            super(2, eVar);
        }

        public final Object a(long j10, Zd.e eVar) {
            return ((d) create(i1.y.b(j10), eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            d dVar = z.this.new d(eVar);
            dVar.f65461c = ((i1.y) obj).o();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((i1.y) obj).o(), (Zd.e) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r0 != r6) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r6 = ae.AbstractC2605b.f()
                int r0 = r13.f65460b
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L35
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L25
                if (r0 != r1) goto L1d
                long r0 = r13.f65459a
                long r2 = r13.f65461c
                Td.v.b(r14)
                r7 = r2
                r3 = r0
                r0 = r14
                goto L88
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                long r2 = r13.f65459a
                long r7 = r13.f65461c
                Td.v.b(r14)
                r0 = r14
                goto L68
            L2e:
                long r3 = r13.f65461c
                Td.v.b(r14)
                r0 = r14
                goto L4c
            L35:
                Td.v.b(r14)
                long r7 = r13.f65461c
                z.z r0 = z.z.this
                D0.b r0 = z.z.c(r0)
                r13.f65461c = r7
                r13.f65460b = r3
                java.lang.Object r0 = r0.c(r7, r13)
                if (r0 != r6) goto L4b
                goto L87
            L4b:
                r3 = r7
            L4c:
                i1.y r0 = (i1.y) r0
                long r7 = r0.o()
                long r7 = i1.y.k(r3, r7)
                z.z r0 = z.z.this
                r13.f65461c = r3
                r13.f65459a = r7
                r13.f65460b = r2
                java.lang.Object r0 = r0.n(r7, r13)
                if (r0 != r6) goto L65
                goto L87
            L65:
                r11 = r7
                r7 = r3
                r2 = r11
            L68:
                i1.y r0 = (i1.y) r0
                long r9 = r0.o()
                z.z r0 = z.z.this
                D0.b r0 = z.z.c(r0)
                long r2 = i1.y.k(r2, r9)
                r13.f65461c = r7
                r13.f65459a = r9
                r13.f65460b = r1
                r5 = r13
                r1 = r2
                r3 = r9
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L88
            L87:
                return r6
            L88:
                i1.y r0 = (i1.y) r0
                long r0 = r0.o()
                long r0 = i1.y.k(r3, r0)
                long r0 = i1.y.k(r7, r0)
                i1.y r0 = i1.y.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z.z.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {
        e() {
            super(1);
        }

        public final long a(long j10) {
            u uVar = z.this.f65441h;
            z zVar = z.this;
            return zVar.s(uVar, j10, zVar.f65440g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C6224f.d(a(((C6224f) obj).u()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f65464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f65465b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f65467d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.f65467d = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Zd.e eVar) {
            return ((f) create(uVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            f fVar = z.this.new f(this.f65467d, eVar);
            fVar.f65465b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f65464a;
            if (i10 == 0) {
                Td.v.b(obj);
                z.this.f65441h = (u) this.f65465b;
                Function2 function2 = this.f65467d;
                c cVar = z.this.f65442i;
                this.f65464a = 1;
                if (function2.invoke(cVar, this) == objF) {
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

    public z(x xVar, InterfaceC6999T interfaceC6999T, n nVar, q qVar, boolean z10, D0.b bVar) {
        this.f65434a = xVar;
        this.f65435b = interfaceC6999T;
        this.f65436c = nVar;
        this.f65437d = qVar;
        this.f65438e = z10;
        this.f65439f = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D(long j10, float f10) {
        return this.f65437d == q.Horizontal ? i1.y.e(j10, f10, 0.0f, 2, null) : i1.y.e(j10, 0.0f, f10, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        return this.f65434a.e() || this.f65434a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s(u uVar, long j10, int i10) {
        long jD = this.f65439f.d(j10, i10);
        long jP = C6224f.p(j10, jD);
        long jU = u(B(uVar.a(A(u(x(jP))))));
        return C6224f.q(C6224f.q(jD, jU), this.f65439f.b(jU, C6224f.p(jP, jU), i10));
    }

    private final long y(long j10) {
        return this.f65437d == q.Horizontal ? i1.y.e(j10, 0.0f, 0.0f, 1, null) : i1.y.e(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float z(long j10) {
        return this.f65437d == q.Horizontal ? i1.y.h(j10) : i1.y.i(j10);
    }

    public final float A(long j10) {
        return this.f65437d == q.Horizontal ? C6224f.m(j10) : C6224f.n(j10);
    }

    public final long B(float f10) {
        return f10 == 0.0f ? C6224f.f58329b.c() : this.f65437d == q.Horizontal ? AbstractC6225g.a(f10, 0.0f) : AbstractC6225g.a(0.0f, f10);
    }

    public final boolean C(x xVar, q qVar, InterfaceC6999T interfaceC6999T, boolean z10, n nVar, D0.b bVar) {
        boolean z11;
        boolean z12 = true;
        if (AbstractC5504s.c(this.f65434a, xVar)) {
            z11 = false;
        } else {
            this.f65434a = xVar;
            z11 = true;
        }
        this.f65435b = interfaceC6999T;
        if (this.f65437d != qVar) {
            this.f65437d = qVar;
            z11 = true;
        }
        if (this.f65438e != z10) {
            this.f65438e = z10;
        } else {
            z12 = z11;
        }
        this.f65436c = nVar;
        this.f65439f = bVar;
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(long r11, Zd.e r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof z.z.a
            if (r0 == 0) goto L13
            r0 = r13
            z.z$a r0 = (z.z.a) r0
            int r1 = r0.f65447d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65447d = r1
            goto L18
        L13:
            z.z$a r0 = new z.z$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f65445b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f65447d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.f65444a
            kotlin.jvm.internal.M r11 = (kotlin.jvm.internal.M) r11
            Td.v.b(r13)
            r5 = r10
            goto L56
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            Td.v.b(r13)
            kotlin.jvm.internal.M r6 = new kotlin.jvm.internal.M
            r6.<init>()
            r6.f52258a = r11
            x.L r13 = x.EnumC6992L.Default
            z.z$b r4 = new z.z$b
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r6, r7, r9)
            r0.f65444a = r6
            r0.f65447d = r3
            java.lang.Object r11 = r10.v(r13, r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r6
        L56:
            long r11 = r11.f52258a
            i1.y r11 = i1.y.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z.z.n(long, Zd.e):java.lang.Object");
    }

    public final boolean p() {
        return this.f65437d == q.Vertical;
    }

    public final Object q(long j10, Zd.e eVar) {
        long jY = y(j10);
        d dVar = new d(null);
        InterfaceC6999T interfaceC6999T = this.f65435b;
        if (interfaceC6999T == null || !o()) {
            Object objInvoke = dVar.invoke(i1.y.b(jY), eVar);
            return objInvoke == AbstractC2605b.f() ? objInvoke : L.f17438a;
        }
        Object objD = interfaceC6999T.d(jY, dVar, eVar);
        return objD == AbstractC2605b.f() ? objD : L.f17438a;
    }

    public final long r(long j10) {
        return this.f65434a.a() ? C6224f.f58329b.c() : B(t(this.f65434a.f(t(A(j10)))));
    }

    public final float t(float f10) {
        return this.f65438e ? f10 * (-1) : f10;
    }

    public final long u(long j10) {
        return this.f65438e ? C6224f.r(j10, -1.0f) : j10;
    }

    public final Object v(EnumC6992L enumC6992L, Function2 function2, Zd.e eVar) {
        Object objB = this.f65434a.b(enumC6992L, new f(function2, null), eVar);
        return objB == AbstractC2605b.f() ? objB : L.f17438a;
    }

    public final boolean w() {
        if (this.f65434a.a()) {
            return true;
        }
        InterfaceC6999T interfaceC6999T = this.f65435b;
        return interfaceC6999T != null ? interfaceC6999T.a() : false;
    }

    public final long x(long j10) {
        return this.f65437d == q.Horizontal ? C6224f.g(j10, 0.0f, 0.0f, 1, null) : C6224f.g(j10, 0.0f, 0.0f, 2, null);
    }
}
