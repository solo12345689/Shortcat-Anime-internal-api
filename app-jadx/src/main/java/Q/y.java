package Q;

import Gf.AbstractC1617k;
import Gf.O;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import r0.AbstractC6225g;
import r0.C6224f;
import w.C6888a;
import w.C6903h0;
import w.C6910n;
import w.s0;
import w.u0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6910n f14201a = new C6910n(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s0 f14202b = u0.a(a.f14205a, b.f14206a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f14203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C6903h0 f14204d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14205a = new a();

        a() {
            super(1);
        }

        public final C6910n a(long j10) {
            return AbstractC6225g.b(j10) ? new C6910n(C6224f.m(j10), C6224f.n(j10)) : y.f14201a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6224f) obj).u());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14206a = new b();

        b() {
            super(1);
        }

        public final long a(C6910n c6910n) {
            return AbstractC6225g.a(c6910n.f(), c6910n.g());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C6224f.d(a((C6910n) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f14207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f14208b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h2 f14209a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h2 h2Var) {
                super(0);
                this.f14209a = h2Var;
            }

            public final long a() {
                return c.c(this.f14209a);
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                return C6224f.d(a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5082a interfaceC5082a, Function1 function1) {
            super(3);
            this.f14207a = interfaceC5082a;
            this.f14208b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long c(h2 h2Var) {
            return ((C6224f) h2Var.getValue()).u();
        }

        public final androidx.compose.ui.e b(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(759876635);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(759876635, i10, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            h2 h2VarF = y.f(this.f14207a, interfaceC2425m, 0);
            Function1 function1 = this.f14208b;
            boolean zU = interfaceC2425m.U(h2VarF);
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new a(h2VarF);
                interfaceC2425m.u(objD);
            }
            androidx.compose.ui.e eVar2 = (androidx.compose.ui.e) function1.invoke((InterfaceC5082a) objD);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVar2;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h2 f14212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6888a f14213d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h2 f14214a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h2 h2Var) {
                super(0);
                this.f14214a = h2Var;
            }

            public final long a() {
                return y.g(this.f14214a);
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                return C6224f.d(a());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b implements InterfaceC1743f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6888a f14215a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ O f14216b;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14217a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ C6888a f14218b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ long f14219c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C6888a c6888a, long j10, Zd.e eVar) {
                    super(2, eVar);
                    this.f14218b = c6888a;
                    this.f14219c = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Object obj, Zd.e eVar) {
                    return new a(this.f14218b, this.f14219c, eVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(O o10, Zd.e eVar) {
                    return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = AbstractC2605b.f();
                    int i10 = this.f14217a;
                    if (i10 == 0) {
                        Td.v.b(obj);
                        C6888a c6888a = this.f14218b;
                        C6224f c6224fD = C6224f.d(this.f14219c);
                        C6903h0 c6903h0E = y.e();
                        this.f14217a = 1;
                        if (C6888a.f(c6888a, c6224fD, c6903h0E, null, null, this, 12, null) == objF) {
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

            b(C6888a c6888a, O o10) {
                this.f14215a = c6888a;
                this.f14216b = o10;
            }

            public final Object a(long j10, Zd.e eVar) {
                if (AbstractC6225g.b(((C6224f) this.f14215a.m()).u()) && AbstractC6225g.b(j10) && C6224f.n(((C6224f) this.f14215a.m()).u()) != C6224f.n(j10)) {
                    AbstractC1617k.d(this.f14216b, null, null, new a(this.f14215a, j10, null), 3, null);
                    return Td.L.f17438a;
                }
                Object objS = this.f14215a.s(C6224f.d(j10), eVar);
                return objS == AbstractC2605b.f() ? objS : Td.L.f17438a;
            }

            @Override // Jf.InterfaceC1743f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Zd.e eVar) {
                return a(((C6224f) obj).u(), eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h2 h2Var, C6888a c6888a, Zd.e eVar) {
            super(2, eVar);
            this.f14212c = h2Var;
            this.f14213d = c6888a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            d dVar = new d(this.f14212c, this.f14213d, eVar);
            dVar.f14211b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f14210a;
            if (i10 == 0) {
                Td.v.b(obj);
                O o10 = (O) this.f14211b;
                InterfaceC1742e interfaceC1742eP = U1.p(new a(this.f14212c));
                b bVar = new b(this.f14213d, o10);
                this.f14210a = 1;
                if (interfaceC1742eP.collect(bVar, this) == objF) {
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

    static {
        long jA = AbstractC6225g.a(0.01f, 0.01f);
        f14203c = jA;
        f14204d = new C6903h0(0.0f, 0.0f, C6224f.d(jA), 3, null);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, InterfaceC5082a interfaceC5082a, Function1 function1) {
        return androidx.compose.ui.c.c(eVar, null, new c(interfaceC5082a, function1), 1, null);
    }

    public static final C6903h0 e() {
        return f14204d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h2 f(InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1589795249, i10, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            objD = U1.d(interfaceC5082a);
            interfaceC2425m.u(objD);
        }
        h2 h2Var = (h2) objD;
        Object objD2 = interfaceC2425m.D();
        if (objD2 == aVar.a()) {
            Object c6888a = new C6888a(C6224f.d(g(h2Var)), f14202b, C6224f.d(f14203c), null, 8, null);
            interfaceC2425m.u(c6888a);
            objD2 = c6888a;
        }
        C6888a c6888a2 = (C6888a) objD2;
        Td.L l10 = Td.L.f17438a;
        boolean zF = interfaceC2425m.F(c6888a2);
        Object objD3 = interfaceC2425m.D();
        if (zF || objD3 == aVar.a()) {
            objD3 = new d(h2Var, c6888a2, null);
            interfaceC2425m.u(objD3);
        }
        AbstractC2393b0.e(l10, (Function2) objD3, interfaceC2425m, 6);
        h2 h2VarG = c6888a2.g();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(h2 h2Var) {
        return ((C6224f) h2Var.getValue()).u();
    }
}
