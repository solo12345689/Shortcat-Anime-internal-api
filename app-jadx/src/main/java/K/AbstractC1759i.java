package K;

import E0.V;
import Gf.AbstractC1617k;
import I0.AbstractC1676b;
import I0.InterfaceC1687m;
import I0.InterfaceC1690p;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import K0.InterfaceC1788g;
import N.q0;
import Q.InterfaceC2049i;
import U0.C2197e;
import U0.T0;
import U0.W0;
import U0.X0;
import U0.Y0;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import Y.m2;
import a1.C2527U;
import a1.C2529W;
import a1.C2533a;
import a1.C2538f;
import a1.C2547o;
import a1.C2551s;
import a1.C2552t;
import a1.C2558z;
import a1.InterfaceC2517J;
import ae.AbstractC2605b;
import android.view.KeyEvent;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.InterfaceC2724o1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g1.EnumC4829i;
import i0.AbstractC4993l;
import i1.C5025r;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;
import r0.C6226h;
import s0.AbstractC6358h0;
import u0.InterfaceC6711f;
import z.AbstractC7254A;

/* JADX INFO: renamed from: K.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1759i {

    /* JADX INFO: renamed from: K.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10046a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T0) obj);
            return Td.L.f17438a;
        }

        public final void invoke(T0 t02) {
        }
    }

    /* JADX INFO: renamed from: K.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1774y f10048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h2 f10049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2529W f10050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Q.F f10051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2552t f10052f;

        /* JADX INFO: renamed from: K.i$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h2 f10053a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h2 h2Var) {
                super(0);
                this.f10053a = h2Var;
            }

            @Override // ie.InterfaceC5082a
            public final Boolean invoke() {
                return Boolean.valueOf(AbstractC1759i.b(this.f10053a));
            }
        }

        /* JADX INFO: renamed from: K.i$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0156b implements InterfaceC1743f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1774y f10054a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2529W f10055b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q.F f10056c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ C2552t f10057d;

            C0156b(C1774y c1774y, C2529W c2529w, Q.F f10, C2552t c2552t) {
                this.f10054a = c1774y;
                this.f10055b = c2529w;
                this.f10056c = f10;
                this.f10057d = c2552t;
            }

            public final Object a(boolean z10, Zd.e eVar) {
                if (z10 && this.f10054a.e()) {
                    AbstractC1759i.q(this.f10055b, this.f10054a, this.f10056c.O(), this.f10057d, this.f10056c.J());
                } else {
                    AbstractC1759i.n(this.f10054a);
                }
                return Td.L.f17438a;
            }

            @Override // Jf.InterfaceC1743f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Zd.e eVar) {
                return a(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1774y c1774y, h2 h2Var, C2529W c2529w, Q.F f10, C2552t c2552t, Zd.e eVar) {
            super(2, eVar);
            this.f10048b = c1774y;
            this.f10049c = h2Var;
            this.f10050d = c2529w;
            this.f10051e = f10;
            this.f10052f = c2552t;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new b(this.f10048b, this.f10049c, this.f10050d, this.f10051e, this.f10052f, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f10047a;
            try {
                if (i10 == 0) {
                    Td.v.b(obj);
                    InterfaceC1742e interfaceC1742eP = U1.p(new a(this.f10049c));
                    C0156b c0156b = new C0156b(this.f10048b, this.f10050d, this.f10051e, this.f10052f);
                    this.f10047a = 1;
                    if (interfaceC1742eP.collect(c0156b, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                }
                AbstractC1759i.n(this.f10048b);
                return Td.L.f17438a;
            } catch (Throwable th2) {
                AbstractC1759i.n(this.f10048b);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: K.i$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q.F f10058a;

        /* JADX INFO: renamed from: K.i$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements Y.X {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Q.F f10059a;

            public a(Q.F f10) {
                this.f10059a = f10;
            }

            @Override // Y.X
            public void dispose() {
                this.f10059a.R();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Q.F f10) {
            super(1);
            this.f10058a = f10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Y.X invoke(Y.Y y10) {
            return new a(this.f10058a);
        }
    }

    /* JADX INFO: renamed from: K.i$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1774y f10060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2529W f10061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2527U f10062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2552t f10063d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1774y c1774y, C2529W c2529w, C2527U c2527u, C2552t c2552t) {
            super(1);
            this.f10060a = c1774y;
            this.f10061b = c2529w;
            this.f10062c = c2527u;
            this.f10063d = c2552t;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Y.X invoke(Y.Y y10) {
            if (this.f10060a.e()) {
                C1774y c1774y = this.f10060a;
                c1774y.E(L.f9784a.i(this.f10061b, this.f10062c, c1774y.n(), this.f10063d, this.f10060a.m(), this.f10060a.l()));
            }
            return new a();
        }

        /* JADX INFO: renamed from: K.i$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements Y.X {
            @Override // Y.X
            public void dispose() {
            }
        }
    }

    /* JADX INFO: renamed from: K.i$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f10064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1774y f10065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y0 f10066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ V f10069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C2527U f10070g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a1.f0 f10071h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f10072i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f10073j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f10074k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f10075l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ H.b f10076m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Q.F f10077n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f10078o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f10079p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function1 f10080q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC2517J f10081r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC5011d f10082s;

        /* JADX INFO: renamed from: K.i$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1774y f10083a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y0 f10084b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f10085c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f10086d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ V f10087e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ C2527U f10088f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a1.f0 f10089g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f10090h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f10091i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f10092j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f10093k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ H.b f10094l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ Q.F f10095m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f10096n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f10097o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Function1 f10098p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC2517J f10099q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC5011d f10100r;

            /* JADX INFO: renamed from: K.i$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0157a extends AbstractC5506u implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Q.F f10101a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ C1774y f10102b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f10103c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f10104d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function1 f10105e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ C2527U f10106f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC2517J f10107g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ InterfaceC5011d f10108h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                final /* synthetic */ int f10109i;

                /* JADX INFO: renamed from: K.i$e$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                public static final class C0158a implements I0.B {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ C1774y f10110a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Function1 f10111b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C2527U f10112c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC2517J f10113d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5011d f10114e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ int f10115f;

                    /* JADX INFO: renamed from: K.i$e$a$a$a$a, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                    static final class C0159a extends AbstractC5506u implements Function1 {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final C0159a f10116a = new C0159a();

                        C0159a() {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((s.a) obj);
                            return Td.L.f17438a;
                        }

                        public final void invoke(s.a aVar) {
                        }
                    }

                    C0158a(C1774y c1774y, Function1 function1, C2527U c2527u, InterfaceC2517J interfaceC2517J, InterfaceC5011d interfaceC5011d, int i10) {
                        this.f10110a = c1774y;
                        this.f10111b = function1;
                        this.f10112c = c2527u;
                        this.f10113d = interfaceC2517J;
                        this.f10114e = interfaceC5011d;
                        this.f10115f = i10;
                    }

                    @Override // I0.B
                    public int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
                        this.f10110a.v().m(interfaceC1687m.getLayoutDirection());
                        return this.f10110a.v().c();
                    }

                    @Override // I0.B
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
                        AbstractC4993l.a aVar = AbstractC4993l.f48495e;
                        C1774y c1774y = this.f10110a;
                        AbstractC4993l abstractC4993lD = aVar.d();
                        Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
                        AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
                        try {
                            Z zJ = c1774y.j();
                            T0 t0F = zJ != null ? zJ.f() : null;
                            Td.y yVarD = L.f9784a.d(this.f10110a.v(), j10, lVar.getLayoutDirection(), t0F);
                            int iIntValue = ((Number) yVarD.a()).intValue();
                            int iIntValue2 = ((Number) yVarD.b()).intValue();
                            T0 t02 = (T0) yVarD.c();
                            if (!AbstractC5504s.c(t0F, t02)) {
                                this.f10110a.G(new Z(t02, null, zJ != null ? zJ.b() : null, 2, null));
                                this.f10111b.invoke(t02);
                                AbstractC1759i.o(this.f10110a, this.f10112c, this.f10113d);
                            }
                            this.f10110a.H(this.f10114e.A(this.f10115f == 1 ? I.a(t02.m(0)) : 0));
                            return lVar.M0(iIntValue, iIntValue2, Ud.S.l(Td.z.a(AbstractC1676b.a(), Integer.valueOf(Math.round(t02.h()))), Td.z.a(AbstractC1676b.b(), Integer.valueOf(Math.round(t02.k())))), C0159a.f10116a);
                        } finally {
                            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0157a(Q.F f10, C1774y c1774y, boolean z10, boolean z11, Function1 function1, C2527U c2527u, InterfaceC2517J interfaceC2517J, InterfaceC5011d interfaceC5011d, int i10) {
                    super(2);
                    this.f10101a = f10;
                    this.f10102b = c1774y;
                    this.f10103c = z10;
                    this.f10104d = z11;
                    this.f10105e = function1;
                    this.f10106f = c2527u;
                    this.f10107g = interfaceC2517J;
                    this.f10108h = interfaceC5011d;
                    this.f10109i = i10;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
                    return Td.L.f17438a;
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke(Y.InterfaceC2425m r11, int r12) {
                    /*
                        Method dump skipped, instruction units count: 257
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: K.AbstractC1759i.e.a.C0157a.invoke(Y.m, int):void");
                }
            }

            /* JADX INFO: renamed from: K.i$e$a$b */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class b extends AbstractC5506u implements InterfaceC5082a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ C1774y f10117a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C1774y c1774y) {
                    super(0);
                    this.f10117a = c1774y;
                }

                @Override // ie.InterfaceC5082a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Z invoke() {
                    return this.f10117a.j();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1774y c1774y, Y0 y02, int i10, int i11, V v10, C2527U c2527u, a1.f0 f0Var, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, androidx.compose.ui.e eVar3, androidx.compose.ui.e eVar4, H.b bVar, Q.F f10, boolean z10, boolean z11, Function1 function1, InterfaceC2517J interfaceC2517J, InterfaceC5011d interfaceC5011d) {
                super(2);
                this.f10083a = c1774y;
                this.f10084b = y02;
                this.f10085c = i10;
                this.f10086d = i11;
                this.f10087e = v10;
                this.f10088f = c2527u;
                this.f10089g = f0Var;
                this.f10090h = eVar;
                this.f10091i = eVar2;
                this.f10092j = eVar3;
                this.f10093k = eVar4;
                this.f10094l = bVar;
                this.f10095m = f10;
                this.f10096n = z10;
                this.f10097o = z11;
                this.f10098p = function1;
                this.f10099q = interfaceC2517J;
                this.f10100r = interfaceC5011d;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
                return Td.L.f17438a;
            }

            public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
                if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                    interfaceC2425m.K();
                    return;
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(2032502107, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                }
                androidx.compose.ui.e eVarA = AbstractC1764n.a(androidx.compose.foundation.layout.s.k(androidx.compose.ui.e.f26613a, this.f10083a.k(), 0.0f, 2, null), this.f10084b, this.f10085c, this.f10086d);
                V v10 = this.f10087e;
                C2527U c2527u = this.f10088f;
                a1.f0 f0Var = this.f10089g;
                boolean zF = interfaceC2425m.F(this.f10083a);
                C1774y c1774y = this.f10083a;
                Object objD = interfaceC2425m.D();
                if (zF || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new b(c1774y);
                    interfaceC2425m.u(objD);
                }
                Q.C.a(androidx.compose.foundation.relocation.b.b(X.a(U.c(eVarA, v10, c2527u, f0Var, (InterfaceC5082a) objD).then(this.f10090h).then(this.f10091i), this.f10084b).then(this.f10092j).then(this.f10093k), this.f10094l), g0.i.d(-363167407, true, new C0157a(this.f10095m, this.f10083a, this.f10096n, this.f10097o, this.f10098p, this.f10088f, this.f10099q, this.f10100r, this.f10086d), interfaceC2425m, 54), interfaceC2425m, 48, 0);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC5096o interfaceC5096o, C1774y c1774y, Y0 y02, int i10, int i11, V v10, C2527U c2527u, a1.f0 f0Var, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, androidx.compose.ui.e eVar3, androidx.compose.ui.e eVar4, H.b bVar, Q.F f10, boolean z10, boolean z11, Function1 function1, InterfaceC2517J interfaceC2517J, InterfaceC5011d interfaceC5011d) {
            super(2);
            this.f10064a = interfaceC5096o;
            this.f10065b = c1774y;
            this.f10066c = y02;
            this.f10067d = i10;
            this.f10068e = i11;
            this.f10069f = v10;
            this.f10070g = c2527u;
            this.f10071h = f0Var;
            this.f10072i = eVar;
            this.f10073j = eVar2;
            this.f10074k = eVar3;
            this.f10075l = eVar4;
            this.f10076m = bVar;
            this.f10077n = f10;
            this.f10078o = z10;
            this.f10079p = z11;
            this.f10080q = function1;
            this.f10081r = interfaceC2517J;
            this.f10082s = interfaceC5011d;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-374338080, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
            }
            this.f10064a.invoke(g0.i.d(2032502107, true, new a(this.f10065b, this.f10066c, this.f10067d, this.f10068e, this.f10069f, this.f10070g, this.f10071h, this.f10072i, this.f10073j, this.f10074k, this.f10075l, this.f10076m, this.f10077n, this.f10078o, this.f10079p, this.f10080q, this.f10081r, this.f10082s), interfaceC2425m, 54), interfaceC2425m, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: K.i$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2527U f10118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f10119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f10120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y0 f10121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a1.f0 f10122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f10123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ B.m f10124g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ AbstractC6358h0 f10125h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f10126i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f10127j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f10128k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ C2552t f10129l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C1772w f10130m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f10131n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f10132o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC5096o f10133p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f10134q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f10135r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f10136s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C2527U c2527u, Function1 function1, androidx.compose.ui.e eVar, Y0 y02, a1.f0 f0Var, Function1 function12, B.m mVar, AbstractC6358h0 abstractC6358h0, boolean z10, int i10, int i11, C2552t c2552t, C1772w c1772w, boolean z11, boolean z12, InterfaceC5096o interfaceC5096o, int i12, int i13, int i14) {
            super(2);
            this.f10118a = c2527u;
            this.f10119b = function1;
            this.f10120c = eVar;
            this.f10121d = y02;
            this.f10122e = f0Var;
            this.f10123f = function12;
            this.f10124g = mVar;
            this.f10125h = abstractC6358h0;
            this.f10126i = z10;
            this.f10127j = i10;
            this.f10128k = i11;
            this.f10129l = c2552t;
            this.f10130m = c1772w;
            this.f10131n = z11;
            this.f10132o = z12;
            this.f10133p = interfaceC5096o;
            this.f10134q = i12;
            this.f10135r = i13;
            this.f10136s = i14;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1759i.a(this.f10118a, this.f10119b, this.f10120c, this.f10121d, this.f10122e, this.f10123f, this.f10124g, this.f10125h, this.f10126i, this.f10127j, this.f10128k, this.f10129l, this.f10130m, this.f10131n, this.f10132o, this.f10133p, interfaceC2425m, AbstractC2409g1.a(this.f10134q | 1), AbstractC2409g1.a(this.f10135r), this.f10136s);
        }
    }

    /* JADX INFO: renamed from: K.i$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1774y f10137a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1774y c1774y) {
            super(1);
            this.f10137a = c1774y;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1690p) obj);
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC1690p interfaceC1690p) {
            Z zJ = this.f10137a.j();
            if (zJ == null) {
                return;
            }
            zJ.h(interfaceC1690p);
        }
    }

    /* JADX INFO: renamed from: K.i$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1774y f10138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2527U f10139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2517J f10140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C1774y c1774y, C2527U c2527u, InterfaceC2517J interfaceC2517J) {
            super(1);
            this.f10138a = c1774y;
            this.f10139b = c2527u;
            this.f10140c = interfaceC2517J;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            invoke((InterfaceC6711f) obj);
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC6711f interfaceC6711f) throws Throwable {
            Z zJ = this.f10138a.j();
            if (zJ != null) {
                C2527U c2527u = this.f10139b;
                C1774y c1774y = this.f10138a;
                InterfaceC2517J interfaceC2517J = this.f10140c;
                L.f9784a.b(interfaceC6711f.n1().b(), c2527u, c1774y.q(), c1774y.c(), interfaceC2517J, zJ.f(), c1774y.f(), c1774y.p());
            }
        }
    }

    /* JADX INFO: renamed from: K.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0160i extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1774y f10141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2529W f10144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2527U f10145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2552t f10146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2517J f10147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Q.F f10148h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Gf.O f10149i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ H.b f10150j;

        /* JADX INFO: renamed from: K.i$i$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10151a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ H.b f10152b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2527U f10153c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ C1774y f10154d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Z f10155e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC2517J f10156f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(H.b bVar, C2527U c2527u, C1774y c1774y, Z z10, InterfaceC2517J interfaceC2517J, Zd.e eVar) {
                super(2, eVar);
                this.f10152b = bVar;
                this.f10153c = c2527u;
                this.f10154d = c1774y;
                this.f10155e = z10;
                this.f10156f = interfaceC2517J;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f10152b, this.f10153c, this.f10154d, this.f10155e, this.f10156f, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f10151a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    H.b bVar = this.f10152b;
                    C2527U c2527u = this.f10153c;
                    H hV = this.f10154d.v();
                    T0 t0F = this.f10155e.f();
                    InterfaceC2517J interfaceC2517J = this.f10156f;
                    this.f10151a = 1;
                    if (AbstractC1759i.m(bVar, c2527u, hV, t0F, interfaceC2517J, this) == objF) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0160i(C1774y c1774y, boolean z10, boolean z11, C2529W c2529w, C2527U c2527u, C2552t c2552t, InterfaceC2517J interfaceC2517J, Q.F f10, Gf.O o10, H.b bVar) {
            super(1);
            this.f10141a = c1774y;
            this.f10142b = z10;
            this.f10143c = z11;
            this.f10144d = c2529w;
            this.f10145e = c2527u;
            this.f10146f = c2552t;
            this.f10147g = interfaceC2517J;
            this.f10148h = f10;
            this.f10149i = o10;
            this.f10150j = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q0.n) obj);
            return Td.L.f17438a;
        }

        public final void invoke(q0.n nVar) {
            Z zJ;
            if (this.f10141a.e() == nVar.a()) {
                return;
            }
            this.f10141a.C(nVar.a());
            if (this.f10141a.e() && this.f10142b && !this.f10143c) {
                AbstractC1759i.q(this.f10144d, this.f10141a, this.f10145e, this.f10146f, this.f10147g);
            } else {
                AbstractC1759i.n(this.f10141a);
            }
            if (nVar.a() && (zJ = this.f10141a.j()) != null) {
                AbstractC1617k.d(this.f10149i, null, null, new a(this.f10150j, this.f10145e, this.f10141a, zJ, this.f10147g, null), 3, null);
            }
            if (nVar.a()) {
                return;
            }
            Q.F.u(this.f10148h, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: K.i$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1774y f10157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ F1 f10159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q.F f10160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2527U f10161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2517J f10162f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C1774y c1774y, boolean z10, F1 f12, Q.F f10, C2527U c2527u, InterfaceC2517J interfaceC2517J) {
            super(1);
            this.f10157a = c1774y;
            this.f10158b = z10;
            this.f10159c = f12;
            this.f10160d = f10;
            this.f10161e = c2527u;
            this.f10162f = interfaceC2517J;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1690p) obj);
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC1690p interfaceC1690p) {
            this.f10157a.F(interfaceC1690p);
            Z zJ = this.f10157a.j();
            if (zJ != null) {
                zJ.i(interfaceC1690p);
            }
            if (this.f10158b) {
                if (this.f10157a.d() == EnumC1763m.Selection) {
                    if (this.f10157a.s() && this.f10159c.a()) {
                        this.f10160d.l0();
                    } else {
                        this.f10160d.R();
                    }
                    this.f10157a.M(Q.G.c(this.f10160d, true));
                    this.f10157a.L(Q.G.c(this.f10160d, false));
                    this.f10157a.J(W0.h(this.f10161e.k()));
                } else if (this.f10157a.d() == EnumC1763m.Cursor) {
                    this.f10157a.J(Q.G.c(this.f10160d, true));
                }
                AbstractC1759i.o(this.f10157a, this.f10161e, this.f10162f);
                Z zJ2 = this.f10157a.j();
                if (zJ2 != null) {
                    C1774y c1774y = this.f10157a;
                    C2527U c2527u = this.f10161e;
                    InterfaceC2517J interfaceC2517J = this.f10162f;
                    a1.c0 c0VarG = c1774y.g();
                    if (c0VarG == null || !c1774y.e()) {
                        return;
                    }
                    L.f9784a.k(c0VarG, c2527u, interfaceC2517J, zJ2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: K.i$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1774y f10163a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C1774y c1774y) {
            super(1);
            this.f10163a = c1774y;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Td.L.f17438a;
        }

        public final void invoke(boolean z10) {
            this.f10163a.D(z10);
        }
    }

    /* JADX INFO: renamed from: K.i$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class l extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1774y f10164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.k f10165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f10167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Q.F f10168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2517J f10169f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C1774y c1774y, androidx.compose.ui.focus.k kVar, boolean z10, boolean z11, Q.F f10, InterfaceC2517J interfaceC2517J) {
            super(1);
            this.f10164a = c1774y;
            this.f10165b = kVar;
            this.f10166c = z10;
            this.f10167d = z11;
            this.f10168e = f10;
            this.f10169f = interfaceC2517J;
        }

        public final void a(long j10) {
            AbstractC1759i.r(this.f10164a, this.f10165b, !this.f10166c);
            if (this.f10164a.e() && this.f10167d) {
                if (this.f10164a.d() == EnumC1763m.Selection) {
                    this.f10168e.t(C6224f.d(j10));
                    return;
                }
                Z zJ = this.f10164a.j();
                if (zJ != null) {
                    C1774y c1774y = this.f10164a;
                    L.f9784a.j(j10, zJ, c1774y.n(), this.f10169f, c1774y.m());
                    if (c1774y.v().k().length() > 0) {
                        c1774y.B(EnumC1763m.Cursor);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6224f) obj).u());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: K.i$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class m extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z.q f10170a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(z.q qVar) {
            super(0);
            this.f10170a = qVar;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V invoke() {
            return new V(this.f10170a, 0.0f, 2, null);
        }
    }

    /* JADX INFO: renamed from: K.i$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class n extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a1.d0 f10171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2527U f10172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f10174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f10175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2552t f10176f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C1774y f10177g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC2517J f10178h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Q.F f10179i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.k f10180j;

        /* JADX INFO: renamed from: K.i$n$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Q.F f10181a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q.F f10) {
                super(0);
                this.f10181a = f10;
            }

            @Override // ie.InterfaceC5082a
            public final Boolean invoke() {
                this.f10181a.T();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: K.i$n$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1774y f10182a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C1774y c1774y) {
                super(1);
                this.f10182a = c1774y;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List list) {
                boolean z10;
                if (this.f10182a.j() != null) {
                    Z zJ = this.f10182a.j();
                    AbstractC5504s.e(zJ);
                    list.add(zJ.f());
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* JADX INFO: renamed from: K.i$n$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1774y f10183a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0.C f10184b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C1774y c1774y, R0.C c10) {
                super(1);
                this.f10183a = c1774y;
                this.f10184b = c10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(C2197e c2197e) {
                Td.L l10;
                a1.c0 c0VarG = this.f10183a.g();
                if (c0VarG != null) {
                    C1774y c1774y = this.f10183a;
                    L.f9784a.g(AbstractC2279u.p(new C2538f(), new C2533a(c2197e, 1)), c1774y.n(), c1774y.m(), c0VarG);
                    l10 = Td.L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    this.f10183a.m().invoke(new C2527U(c2197e.j(), X0.a(c2197e.j().length()), (W0) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: K.i$n$d */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class d extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f10185a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f10186b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1774y f10187c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ R0.C f10188d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ C2527U f10189e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(boolean z10, boolean z11, C1774y c1774y, R0.C c10, C2527U c2527u) {
                super(1);
                this.f10185a = z10;
                this.f10186b = z11;
                this.f10187c = c1774y;
                this.f10188d = c10;
                this.f10189e = c2527u;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(C2197e c2197e) {
                Td.L l10;
                if (this.f10185a || !this.f10186b) {
                    return Boolean.FALSE;
                }
                a1.c0 c0VarG = this.f10187c.g();
                if (c0VarG != null) {
                    C1774y c1774y = this.f10187c;
                    L.f9784a.g(AbstractC2279u.p(new C2547o(), new C2533a(c2197e, 1)), c1774y.n(), c1774y.m(), c0VarG);
                    l10 = Td.L.f17438a;
                } else {
                    l10 = null;
                }
                if (l10 == null) {
                    C2527U c2527u = this.f10189e;
                    this.f10187c.m().invoke(new C2527U(Df.r.G0(c2527u.l(), W0.n(c2527u.k()), W0.i(c2527u.k()), c2197e).toString(), X0.a(W0.n(c2527u.k()) + c2197e.length()), (W0) null, 4, (DefaultConstructorMarker) null));
                }
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: K.i$n$e */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class e extends AbstractC5506u implements InterfaceC5096o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2517J f10190a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f10191b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2527U f10192c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Q.F f10193d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ C1774y f10194e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(InterfaceC2517J interfaceC2517J, boolean z10, C2527U c2527u, Q.F f10, C1774y c1774y) {
                super(3);
                this.f10190a = interfaceC2517J;
                this.f10191b = z10;
                this.f10192c = c2527u;
                this.f10193d = f10;
                this.f10194e = c1774y;
            }

            public final Boolean a(int i10, int i11, boolean z10) {
                if (!z10) {
                    i10 = this.f10190a.a(i10);
                }
                if (!z10) {
                    i11 = this.f10190a.a(i11);
                }
                boolean z11 = false;
                if (this.f10191b && (i10 != W0.n(this.f10192c.k()) || i11 != W0.i(this.f10192c.k()))) {
                    if (Math.min(i10, i11) < 0 || Math.max(i10, i11) > this.f10192c.i().length()) {
                        this.f10193d.x();
                    } else {
                        if (z10 || i10 == i11) {
                            this.f10193d.x();
                        } else {
                            Q.F.w(this.f10193d, false, 1, null);
                        }
                        this.f10194e.m().invoke(new C2527U(this.f10192c.i(), X0.b(i10, i11), (W0) null, 4, (DefaultConstructorMarker) null));
                        z11 = true;
                    }
                }
                return Boolean.valueOf(z11);
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        }

        /* JADX INFO: renamed from: K.i$n$f */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class f extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1774y f10195a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2552t f10196b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(C1774y c1774y, C2552t c2552t) {
                super(0);
                this.f10195a = c1774y;
                this.f10196b = c2552t;
            }

            @Override // ie.InterfaceC5082a
            public final Boolean invoke() {
                this.f10195a.l().invoke(C2551s.j(this.f10196b.e()));
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: K.i$n$g */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class g extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1774y f10197a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.k f10198b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f10199c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(C1774y c1774y, androidx.compose.ui.focus.k kVar, boolean z10) {
                super(0);
                this.f10197a = c1774y;
                this.f10198b = kVar;
                this.f10199c = z10;
            }

            @Override // ie.InterfaceC5082a
            public final Boolean invoke() {
                AbstractC1759i.r(this.f10197a, this.f10198b, !this.f10199c);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: K.i$n$h */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class h extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Q.F f10200a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(Q.F f10) {
                super(0);
                this.f10200a = f10;
            }

            @Override // ie.InterfaceC5082a
            public final Boolean invoke() {
                Q.F.w(this.f10200a, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: K.i$n$i, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0161i extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Q.F f10201a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0161i(Q.F f10) {
                super(0);
                this.f10201a = f10;
            }

            @Override // ie.InterfaceC5082a
            public final Boolean invoke() {
                Q.F.p(this.f10201a, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: K.i$n$j */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class j extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Q.F f10202a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Q.F f10) {
                super(0);
                this.f10202a = f10;
            }

            @Override // ie.InterfaceC5082a
            public final Boolean invoke() {
                this.f10202a.s();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(a1.d0 d0Var, C2527U c2527u, boolean z10, boolean z11, boolean z12, C2552t c2552t, C1774y c1774y, InterfaceC2517J interfaceC2517J, Q.F f10, androidx.compose.ui.focus.k kVar) {
            super(1);
            this.f10171a = d0Var;
            this.f10172b = c2527u;
            this.f10173c = z10;
            this.f10174d = z11;
            this.f10175e = z12;
            this.f10176f = c2552t;
            this.f10177g = c1774y;
            this.f10178h = interfaceC2517J;
            this.f10179i = f10;
            this.f10180j = kVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((R0.C) obj);
            return Td.L.f17438a;
        }

        public final void invoke(R0.C c10) {
            R0.C c11 = c10;
            R0.A.W(c10, this.f10171a.b());
            R0.A.l0(c10, this.f10172b.k());
            if (!this.f10173c) {
                R0.A.h(c10);
            }
            if (this.f10174d) {
                R0.A.G(c10);
            }
            boolean z10 = this.f10173c && !this.f10175e;
            R0.A.V(c10, z10);
            R0.A.o(c10, null, new b(this.f10177g), 1, null);
            if (z10) {
                R0.A.k0(c10, null, new c(this.f10177g, c10), 1, null);
                c11 = c10;
                R0.A.r(c10, null, new d(this.f10175e, this.f10173c, this.f10177g, c10, this.f10172b), 1, null);
            }
            R0.A.f0(c10, null, new e(this.f10178h, this.f10173c, this.f10172b, this.f10179i, this.f10177g), 1, null);
            R0.A.v(c11, this.f10176f.e(), null, new f(this.f10177g, this.f10176f), 2, null);
            R0.A.t(c10, null, new g(this.f10177g, this.f10180j, this.f10175e), 1, null);
            R0.A.x(c10, null, new h(this.f10179i), 1, null);
            if (!W0.h(this.f10172b.k()) && !this.f10174d) {
                R0.A.d(c10, null, new C0161i(this.f10179i), 1, null);
                if (this.f10173c && !this.f10175e) {
                    R0.A.f(c10, null, new j(this.f10179i), 1, null);
                }
            }
            if (!this.f10173c || this.f10175e) {
                return;
            }
            R0.A.I(c10, null, new a(this.f10179i), 1, null);
        }
    }

    /* JADX INFO: renamed from: K.i$o */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class o extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1774y f10203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.k f10204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2552t f10205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q0 f10206d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(C1774y c1774y, androidx.compose.ui.focus.k kVar, C2552t c2552t, q0 q0Var) {
            super(0);
            this.f10203a = c1774y;
            this.f10204b = kVar;
            this.f10205c = c2552t;
            this.f10206d = q0Var;
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            if (!this.f10203a.e()) {
                this.f10204b.f();
            }
            int iF = this.f10205c.f();
            C2558z.a aVar = C2558z.f23658b;
            if (!C2558z.n(iF, aVar.f()) && !C2558z.n(this.f10205c.f(), aVar.e())) {
                this.f10206d.k();
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: K.i$p */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class p extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f10207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q.F f10208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f10209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10210d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(androidx.compose.ui.e eVar, Q.F f10, Function2 function2, int i10) {
            super(2);
            this.f10207a = eVar;
            this.f10208b = f10;
            this.f10209c = function2;
            this.f10210d = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1759i.c(this.f10207a, this.f10208b, this.f10209c, interfaceC2425m, AbstractC2409g1.a(this.f10210d | 1));
        }
    }

    /* JADX INFO: renamed from: K.i$q */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class q extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q.F f10211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10213c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Q.F f10, boolean z10, int i10) {
            super(2);
            this.f10211a = f10;
            this.f10212b = z10;
            this.f10213c = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1759i.d(this.f10211a, this.f10212b, interfaceC2425m, AbstractC2409g1.a(this.f10213c | 1));
        }
    }

    /* JADX INFO: renamed from: K.i$r */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class r implements InterfaceC2049i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10214a;

        r(long j10) {
            this.f10214a = j10;
        }

        @Override // Q.InterfaceC2049i
        public final long a() {
            return this.f10214a;
        }
    }

    /* JADX INFO: renamed from: K.i$s */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class s extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ J f10217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q.F f10218d;

        /* JADX INFO: renamed from: K.i$s$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f10220b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ E0.L f10221c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ J f10222d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Q.F f10223e;

            /* JADX INFO: renamed from: K.i$s$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0162a extends kotlin.coroutines.jvm.internal.l implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10224a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ E0.L f10225b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ J f10226c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0162a(E0.L l10, J j10, Zd.e eVar) {
                    super(2, eVar);
                    this.f10225b = l10;
                    this.f10226c = j10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Object obj, Zd.e eVar) {
                    return new C0162a(this.f10225b, this.f10226c, eVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Gf.O o10, Zd.e eVar) {
                    return ((C0162a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = AbstractC2605b.f();
                    int i10 = this.f10224a;
                    if (i10 == 0) {
                        Td.v.b(obj);
                        E0.L l10 = this.f10225b;
                        J j10 = this.f10226c;
                        this.f10224a = 1;
                        if (A.c(l10, j10, this) == objF) {
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

            /* JADX INFO: renamed from: K.i$s$a$b */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10227a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ E0.L f10228b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Q.F f10229c;

                /* JADX INFO: renamed from: K.i$s$a$b$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                static final class C0163a extends AbstractC5506u implements Function1 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Q.F f10230a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0163a(Q.F f10) {
                        super(1);
                        this.f10230a = f10;
                    }

                    public final void a(long j10) {
                        this.f10230a.l0();
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((C6224f) obj).u());
                        return Td.L.f17438a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(E0.L l10, Q.F f10, Zd.e eVar) {
                    super(2, eVar);
                    this.f10228b = l10;
                    this.f10229c = f10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Object obj, Zd.e eVar) {
                    return new b(this.f10228b, this.f10229c, eVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Gf.O o10, Zd.e eVar) {
                    return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = AbstractC2605b.f();
                    int i10 = this.f10227a;
                    if (i10 == 0) {
                        Td.v.b(obj);
                        E0.L l10 = this.f10228b;
                        C0163a c0163a = new C0163a(this.f10229c);
                        this.f10227a = 1;
                        if (AbstractC7254A.j(l10, null, null, null, c0163a, this, 7, null) == objF) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(E0.L l10, J j10, Q.F f10, Zd.e eVar) {
                super(2, eVar);
                this.f10221c = l10;
                this.f10222d = j10;
                this.f10223e = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                a aVar = new a(this.f10221c, this.f10222d, this.f10223e, eVar);
                aVar.f10220b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f10219a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                Gf.O o10 = (Gf.O) this.f10220b;
                Gf.Q q10 = Gf.Q.f7532d;
                AbstractC1617k.d(o10, null, q10, new C0162a(this.f10221c, this.f10222d, null), 1, null);
                AbstractC1617k.d(o10, null, q10, new b(this.f10221c, this.f10223e, null), 1, null);
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(J j10, Q.F f10, Zd.e eVar) {
            super(2, eVar);
            this.f10217c = j10;
            this.f10218d = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            s sVar = new s(this.f10217c, this.f10218d, eVar);
            sVar.f10216b = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E0.L l10, Zd.e eVar) {
            return ((s) create(l10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f10215a;
            if (i10 == 0) {
                Td.v.b(obj);
                a aVar = new a((E0.L) this.f10216b, this.f10217c, this.f10218d, null);
                this.f10215a = 1;
                if (Gf.P.e(aVar, this) == objF) {
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

    /* JADX INFO: renamed from: K.i$t */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class t extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10231a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(long j10) {
            super(1);
            this.f10231a = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((R0.C) obj);
            return Td.L.f17438a;
        }

        public final void invoke(R0.C c10) {
            c10.b(Q.v.d(), new Q.u(EnumC1762l.Cursor, this.f10231a, Q.t.Middle, true, null));
        }
    }

    /* JADX INFO: renamed from: K.i$u */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class u extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q.F f10232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10233b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(Q.F f10, int i10) {
            super(2);
            this.f10232a = f10;
            this.f10233b = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1759i.e(this.f10232a, interfaceC2425m, AbstractC2409g1.a(this.f10233b | 1));
        }
    }

    /* JADX INFO: renamed from: K.i$v */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class v extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1774y f10234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q.F f10235b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(C1774y c1774y, Q.F f10) {
            super(1);
            this.f10234a = c1774y;
            this.f10235b = f10;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            if (this.f10234a.d() == EnumC1763m.Selection && AbstractC1767q.a(keyEvent)) {
                z10 = true;
                Q.F.u(this.f10235b, null, 1, null);
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C0.b) obj).f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:490:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(a1.C2527U r47, kotlin.jvm.functions.Function1 r48, androidx.compose.ui.e r49, U0.Y0 r50, a1.f0 r51, kotlin.jvm.functions.Function1 r52, B.m r53, s0.AbstractC6358h0 r54, boolean r55, int r56, int r57, a1.C2552t r58, K.C1772w r59, boolean r60, boolean r61, ie.InterfaceC5096o r62, Y.InterfaceC2425m r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instruction units count: 2650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K.AbstractC1759i.a(a1.U, kotlin.jvm.functions.Function1, androidx.compose.ui.e, U0.Y0, a1.f0, kotlin.jvm.functions.Function1, B.m, s0.h0, boolean, int, int, a1.t, K.w, boolean, boolean, ie.o, Y.m, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.e eVar, Q.F f10, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-20551815);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-20551815, i11, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            I0.B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), true);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, eVar);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            AbstractC1757g.a(f10, function2, interfaceC2425mG, (i11 >> 3) & 126);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new p(eVar, f10, function2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Q.F f10, boolean z10, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        Z zJ;
        T0 t0F;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(626339208);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(626339208, i11, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z10) {
                interfaceC2425mG.V(-1286242594);
                C1774y c1774yL = f10.L();
                T0 t02 = null;
                if (c1774yL != null && (zJ = c1774yL.j()) != null && (t0F = zJ.f()) != null) {
                    C1774y c1774yL2 = f10.L();
                    if (!(c1774yL2 != null ? c1774yL2.z() : true)) {
                        t02 = t0F;
                    }
                }
                if (t02 == null) {
                    interfaceC2425mG.V(-1285984396);
                } else {
                    interfaceC2425mG.V(-1285984395);
                    if (W0.h(f10.O().k())) {
                        interfaceC2425mG.V(-1679637798);
                        interfaceC2425mG.O();
                    } else {
                        interfaceC2425mG.V(-1680616096);
                        int iB = f10.J().b(W0.n(f10.O().k()));
                        int iB2 = f10.J().b(W0.i(f10.O().k()));
                        EnumC4829i enumC4829iC = t02.c(iB);
                        EnumC4829i enumC4829iC2 = t02.c(Math.max(iB2 - 1, 0));
                        C1774y c1774yL3 = f10.L();
                        if (c1774yL3 == null || !c1774yL3.u()) {
                            interfaceC2425mG.V(-1679975078);
                            interfaceC2425mG.O();
                        } else {
                            interfaceC2425mG.V(-1680216289);
                            Q.G.a(true, enumC4829iC, f10, interfaceC2425mG, ((i11 << 6) & 896) | 6);
                            interfaceC2425mG.O();
                        }
                        C1774y c1774yL4 = f10.L();
                        if (c1774yL4 == null || !c1774yL4.t()) {
                            interfaceC2425mG.V(-1679655654);
                            interfaceC2425mG.O();
                        } else {
                            interfaceC2425mG.V(-1679895904);
                            Q.G.a(false, enumC4829iC2, f10, interfaceC2425mG, ((i11 << 6) & 896) | 6);
                            interfaceC2425mG.O();
                        }
                        interfaceC2425mG.O();
                    }
                    C1774y c1774yL5 = f10.L();
                    if (c1774yL5 != null) {
                        if (f10.S()) {
                            c1774yL5.K(false);
                        }
                        if (c1774yL5.e()) {
                            if (c1774yL5.s()) {
                                f10.l0();
                            } else {
                                f10.R();
                            }
                        }
                        Td.L l10 = Td.L.f17438a;
                    }
                }
                interfaceC2425mG.O();
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(651305535);
                interfaceC2425mG.O();
                f10.R();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new q(f10, z10, i10));
        }
    }

    public static final void e(Q.F f10, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        C2197e c2197eN;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1436003720);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1436003720, i11, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)");
            }
            C1774y c1774yL = f10.L();
            if (c1774yL == null || !c1774yL.r() || (c2197eN = f10.N()) == null || c2197eN.length() <= 0) {
                interfaceC2425mG.V(-284257090);
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(-285446808);
                boolean zU = interfaceC2425mG.U(f10);
                Object objD = interfaceC2425mG.D();
                if (zU || objD == InterfaceC2425m.f22370a.a()) {
                    objD = f10.r();
                    interfaceC2425mG.u(objD);
                }
                J j10 = (J) objD;
                long jB = f10.B((InterfaceC5011d) interfaceC2425mG.n(AbstractC2739w0.e()));
                boolean zD = interfaceC2425mG.d(jB);
                Object objD2 = interfaceC2425mG.D();
                if (zD || objD2 == InterfaceC2425m.f22370a.a()) {
                    objD2 = new r(jB);
                    interfaceC2425mG.u(objD2);
                }
                InterfaceC2049i interfaceC2049i = (InterfaceC2049i) objD2;
                e.a aVar = androidx.compose.ui.e.f26613a;
                boolean zF = interfaceC2425mG.F(j10) | interfaceC2425mG.F(f10);
                Object objD3 = interfaceC2425mG.D();
                if (zF || objD3 == InterfaceC2425m.f22370a.a()) {
                    objD3 = new s(j10, f10, null);
                    interfaceC2425mG.u(objD3);
                }
                androidx.compose.ui.e eVarThen = aVar.then(new SuspendPointerInputElement(j10, null, null, new V.a((Function2) objD3), 6, null));
                boolean zD2 = interfaceC2425mG.d(jB);
                Object objD4 = interfaceC2425mG.D();
                if (zD2 || objD4 == InterfaceC2425m.f22370a.a()) {
                    objD4 = new t(jB);
                    interfaceC2425mG.u(objD4);
                }
                AbstractC1751a.a(interfaceC2049i, R0.r.f(eVarThen, false, (Function1) objD4, 1, null), 0L, interfaceC2425mG, 0, 4);
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new u(f10, i10));
        }
    }

    public static final Object m(H.b bVar, C2527U c2527u, H h10, T0 t02, InterfaceC2517J interfaceC2517J, Zd.e eVar) {
        int iB = interfaceC2517J.b(W0.k(c2527u.k()));
        Object objA = bVar.a(iB < t02.l().j().length() ? t02.d(iB) : iB != 0 ? t02.d(iB - 1) : new C6226h(0.0f, 0.0f, 1.0f, C5025r.f(M.b(h10.j(), h10.a(), h10.b(), null, 0, 24, null))), eVar);
        return objA == AbstractC2605b.f() ? objA : Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(C1774y c1774y) {
        a1.c0 c0VarG = c1774y.g();
        if (c0VarG != null) {
            L.f9784a.f(c0VarG, c1774y.n(), c1774y.m());
        }
        c1774y.E(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(C1774y c1774y, C2527U c2527u, InterfaceC2517J interfaceC2517J) {
        AbstractC4993l.a aVar = AbstractC4993l.f48495e;
        AbstractC4993l abstractC4993lD = aVar.d();
        Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
        AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
        try {
            Z zJ = c1774y.j();
            if (zJ == null) {
                return;
            }
            a1.c0 c0VarG = c1774y.g();
            if (c0VarG == null) {
                return;
            }
            InterfaceC1690p interfaceC1690pI = c1774y.i();
            if (interfaceC1690pI == null) {
                return;
            }
            L.f9784a.e(c2527u, c1774y.v(), zJ.f(), interfaceC1690pI, c0VarG, c1774y.e(), interfaceC2517J);
            Td.L l10 = Td.L.f17438a;
        } finally {
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
        }
    }

    private static final androidx.compose.ui.e p(androidx.compose.ui.e eVar, C1774y c1774y, Q.F f10) {
        return androidx.compose.ui.input.key.a.b(eVar, new v(c1774y, f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(C2529W c2529w, C1774y c1774y, C2527U c2527u, C2552t c2552t, InterfaceC2517J interfaceC2517J) {
        c1774y.E(L.f9784a.h(c2529w, c2527u, c1774y.n(), c2552t, c1774y.m(), c1774y.l()));
        o(c1774y, c2527u, interfaceC2517J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(C1774y c1774y, androidx.compose.ui.focus.k kVar, boolean z10) {
        InterfaceC2724o1 interfaceC2724o1H;
        if (!c1774y.e()) {
            kVar.f();
        } else {
            if (!z10 || (interfaceC2724o1H = c1774y.h()) == null) {
                return;
            }
            interfaceC2724o1H.c();
        }
    }
}
