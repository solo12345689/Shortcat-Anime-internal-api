package N;

import Gf.AbstractC1617k;
import Gf.C0;
import I0.InterfaceC1690p;
import Jf.InterfaceC1743f;
import N.q0;
import Td.C2160k;
import U0.T0;
import a1.C2527U;
import a1.C2552t;
import a1.InterfaceC2517J;
import ae.AbstractC2605b;
import androidx.compose.ui.platform.InterfaceC2709j1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import r0.C6226h;
import s0.C6356g1;

/* JADX INFO: renamed from: N.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1936a extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0 f12463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0 f12464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Jf.t f12465d;

    /* JADX INFO: renamed from: N.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0189a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2527U f12466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1936a f12467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2552t f12468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f12469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f12470e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0189a(C2527U c2527u, C1936a c1936a, C2552t c2552t, Function1 function1, Function1 function12) {
            super(1);
            this.f12466a = c2527u;
            this.f12467b = c1936a;
            this.f12468c = c2552t;
            this.f12469d = function1;
            this.f12470e = function12;
        }

        public final void a(s0 s0Var) {
            s0Var.l(this.f12466a, this.f12467b.i(), this.f12468c, this.f12469d, this.f12470e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s0) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Jf.t p() {
        Jf.t tVar = this.f12465d;
        if (tVar != null) {
            return tVar;
        }
        if (!L.c.a()) {
            return null;
        }
        Jf.t tVarB = Jf.A.b(1, 0, If.a.f9116c, 2, null);
        this.f12465d = tVarB;
        return tVarB;
    }

    private final void q(Function1 function1) {
        q0.a aVarI = i();
        if (aVarI == null) {
            return;
        }
        this.f12463b = aVarI.O0(new b(function1, this, aVarI, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(q0.a aVar, float[] fArr) {
        InterfaceC1690p interfaceC1690pO0 = aVar.o0();
        if (interfaceC1690pO0 != null) {
            if (!interfaceC1690pO0.b()) {
                interfaceC1690pO0 = null;
            }
            if (interfaceC1690pO0 == null) {
                return;
            }
            interfaceC1690pO0.j0(fArr);
        }
    }

    @Override // a1.InterfaceC2520M
    public void a() {
        q(null);
    }

    @Override // a1.InterfaceC2520M
    public void b() {
        C0 c02 = this.f12463b;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        this.f12463b = null;
        Jf.t tVarP = p();
        if (tVarP != null) {
            tVarP.h();
        }
    }

    @Override // a1.InterfaceC2520M
    public void c(C2527U c2527u, InterfaceC2517J interfaceC2517J, T0 t02, Function1 function1, C6226h c6226h, C6226h c6226h2) {
        s0 s0Var = this.f12464c;
        if (s0Var != null) {
            s0Var.n(c2527u, interfaceC2517J, t02, c6226h, c6226h2);
        }
    }

    @Override // a1.InterfaceC2520M
    public void d(C6226h c6226h) {
        s0 s0Var = this.f12464c;
        if (s0Var != null) {
            s0Var.j(c6226h);
        }
    }

    @Override // a1.InterfaceC2520M
    public void f(C2527U c2527u, C2527U c2527u2) {
        s0 s0Var = this.f12464c;
        if (s0Var != null) {
            s0Var.m(c2527u, c2527u2);
        }
    }

    @Override // a1.InterfaceC2520M
    public void h(C2527U c2527u, C2552t c2552t, Function1 function1, Function1 function12) {
        q(new C0189a(c2527u, this, c2552t, function1, function12));
    }

    @Override // N.q0
    public void k() {
        Jf.t tVarP = p();
        if (tVarP != null) {
            tVarP.c(Td.L.f17438a);
        }
    }

    /* JADX INFO: renamed from: N.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f12472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f12473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1936a f12474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q0.a f12475e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1, C1936a c1936a, q0.a aVar, Zd.e eVar) {
            super(2, eVar);
            this.f12473c = function1;
            this.f12474d = c1936a;
            this.f12475e = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2709j1 interfaceC2709j1, Zd.e eVar) {
            return ((b) create(interfaceC2709j1, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f12473c, this.f12474d, this.f12475e, eVar);
            bVar.f12472b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f12471a;
            if (i10 == 0) {
                Td.v.b(obj);
                C0190a c0190a = new C0190a((InterfaceC2709j1) this.f12472b, this.f12473c, this.f12474d, this.f12475e, null);
                this.f12471a = 1;
                if (Gf.P.e(c0190a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            throw new C2160k();
        }

        /* JADX INFO: renamed from: N.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0190a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f12476a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f12477b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2709j1 f12478c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1 f12479d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ C1936a f12480e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q0.a f12481f;

            /* JADX INFO: renamed from: N.a$b$a$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            /* synthetic */ class C0194b extends AbstractC5502p implements Function1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ q0.a f12487a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0194b(q0.a aVar) {
                    super(1, AbstractC5504s.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f12487a = aVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    j(((C6356g1) obj).p());
                    return Td.L.f17438a;
                }

                public final void j(float[] fArr) {
                    C1936a.r(this.f12487a, fArr);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0190a(InterfaceC2709j1 interfaceC2709j1, Function1 function1, C1936a c1936a, q0.a aVar, Zd.e eVar) {
                super(2, eVar);
                this.f12478c = interfaceC2709j1;
                this.f12479d = function1;
                this.f12480e = c1936a;
                this.f12481f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                C0190a c0190a = new C0190a(this.f12478c, this.f12479d, this.f12480e, this.f12481f, eVar);
                c0190a.f12477b = obj;
                return c0190a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((C0190a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f12476a;
                try {
                    if (i10 == 0) {
                        Td.v.b(obj);
                        Gf.O o10 = (Gf.O) this.f12477b;
                        l0 l0Var = (l0) r0.c().invoke(this.f12478c.a());
                        s0 s0Var = new s0(this.f12478c.a(), new C0194b(this.f12481f), l0Var);
                        if (L.c.a()) {
                            AbstractC1617k.d(o10, null, null, new C0191a(this.f12480e, l0Var, null), 3, null);
                        }
                        Function1 function1 = this.f12479d;
                        if (function1 != null) {
                            function1.invoke(s0Var);
                        }
                        this.f12480e.f12464c = s0Var;
                        InterfaceC2709j1 interfaceC2709j1 = this.f12478c;
                        this.f12476a = 1;
                        if (interfaceC2709j1.b(s0Var, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Td.v.b(obj);
                    }
                    throw new C2160k();
                } catch (Throwable th2) {
                    this.f12480e.f12464c = null;
                    throw th2;
                }
            }

            /* JADX INFO: renamed from: N.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0191a extends kotlin.coroutines.jvm.internal.l implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f12482a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1936a f12483b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ l0 f12484c;

                /* JADX INFO: renamed from: N.a$b$a$a$b, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                static final class C0193b implements InterfaceC1743f {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ l0 f12486a;

                    C0193b(l0 l0Var) {
                        this.f12486a = l0Var;
                    }

                    @Override // Jf.InterfaceC1743f
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Td.L l10, Zd.e eVar) {
                        this.f12486a.d();
                        return Td.L.f17438a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0191a(C1936a c1936a, l0 l0Var, Zd.e eVar) {
                    super(2, eVar);
                    this.f12483b = c1936a;
                    this.f12484c = l0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Object obj, Zd.e eVar) {
                    return new C0191a(this.f12483b, this.f12484c, eVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Gf.O o10, Zd.e eVar) {
                    return ((C0191a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
                
                    if (r5.collect(r1, r4) == r0) goto L17;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = ae.AbstractC2605b.f()
                        int r1 = r4.f12482a
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 == r2) goto L16
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L16:
                        Td.v.b(r5)
                        goto L44
                    L1a:
                        Td.v.b(r5)
                        goto L2c
                    L1e:
                        Td.v.b(r5)
                        N.a$b$a$a$a r5 = N.C1936a.b.C0190a.C0191a.C0192a.f12485a
                        r4.f12482a = r3
                        java.lang.Object r5 = Y.AbstractC2452v0.b(r5, r4)
                        if (r5 != r0) goto L2c
                        goto L43
                    L2c:
                        N.a r5 = r4.f12483b
                        Jf.t r5 = N.C1936a.m(r5)
                        if (r5 == 0) goto L4a
                        N.a$b$a$a$b r1 = new N.a$b$a$a$b
                        N.l0 r3 = r4.f12484c
                        r1.<init>(r3)
                        r4.f12482a = r2
                        java.lang.Object r5 = r5.collect(r1, r4)
                        if (r5 != r0) goto L44
                    L43:
                        return r0
                    L44:
                        Td.k r5 = new Td.k
                        r5.<init>()
                        throw r5
                    L4a:
                        Td.L r5 = Td.L.f17438a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: N.C1936a.b.C0190a.C0191a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX INFO: renamed from: N.a$b$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                static final class C0192a extends AbstractC5506u implements Function1 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0192a f12485a = new C0192a();

                    C0192a() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Number) obj).longValue());
                        return Td.L.f17438a;
                    }

                    public final void a(long j10) {
                    }
                }
            }
        }
    }
}
