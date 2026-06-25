package K;

import N.C1950o;
import U0.C2197e;
import U0.T0;
import U0.W0;
import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import a1.C2527U;
import a1.InterfaceC2517J;
import ae.AbstractC2605b;
import androidx.compose.ui.platform.AbstractC2739w0;
import i1.C5015h;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;
import r0.AbstractC6225g;
import r0.C6226h;
import r0.C6230l;
import s0.AbstractC6358h0;
import s0.F1;
import u0.InterfaceC6708c;
import u0.InterfaceC6711f;
import w.AbstractC6906j;
import w.InterfaceC6904i;
import w.S;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC6904i f9770a = AbstractC6906j.e(AbstractC6906j.f(b.f9783a), null, 0, 6, null);

    /* JADX INFO: renamed from: b */
    private static final float f9771b = C5015h.n(2);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC6358h0 f9772a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1774y f9773b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C2527U f9774c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC2517J f9775d;

        /* JADX INFO: renamed from: K.K$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0136a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f9776a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C1950o f9777b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0136a(C1950o c1950o, Zd.e eVar) {
                super(2, eVar);
                this.f9777b = c1950o;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0136a(this.f9777b, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((C0136a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f9776a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    C1950o c1950o = this.f9777b;
                    this.f9776a = 1;
                    if (c1950o.e(this) == objF) {
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

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1950o f9778a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC2517J f9779b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C2527U f9780c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ C1774y f9781d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ AbstractC6358h0 f9782e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C1950o c1950o, InterfaceC2517J interfaceC2517J, C2527U c2527u, C1774y c1774y, AbstractC6358h0 abstractC6358h0) {
                super(1);
                this.f9778a = c1950o;
                this.f9779b = interfaceC2517J;
                this.f9780c = c2527u;
                this.f9781d = c1774y;
                this.f9782e = abstractC6358h0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC6708c) obj);
                return Td.L.f17438a;
            }

            public final void invoke(InterfaceC6708c interfaceC6708c) {
                C6226h c6226h;
                T0 t0F;
                interfaceC6708c.B1();
                float fC = this.f9778a.c();
                if (fC == 0.0f) {
                    return;
                }
                int iB = this.f9779b.b(W0.n(this.f9780c.k()));
                Z zJ = this.f9781d.j();
                if (zJ == null || (t0F = zJ.f()) == null || (c6226h = t0F.e(iB)) == null) {
                    c6226h = new C6226h(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fL1 = interfaceC6708c.l1(K.b());
                float f10 = fL1 / 2;
                float fD = AbstractC5874j.d(AbstractC5874j.h(c6226h.i() + f10, C6230l.i(interfaceC6708c.f()) - f10), f10);
                InterfaceC6711f.R(interfaceC6708c, this.f9782e, AbstractC6225g.a(fD, c6226h.l()), AbstractC6225g.a(fD, c6226h.e()), fL1, 0, null, fC, null, 0, 432, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC6358h0 abstractC6358h0, C1774y c1774y, C2527U c2527u, InterfaceC2517J interfaceC2517J) {
            super(3);
            this.f9772a = abstractC6358h0;
            this.f9773b = c1774y;
            this.f9774c = c2527u;
            this.f9775d = interfaceC2517J;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            androidx.compose.ui.e eVarD;
            interfaceC2425m.V(-84507373);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-84507373, i10, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
            }
            Object objD = interfaceC2425m.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD == aVar.a()) {
                objD = new C1950o();
                interfaceC2425m.u(objD);
            }
            C1950o c1950o = (C1950o) objD;
            AbstractC6358h0 abstractC6358h0 = this.f9772a;
            boolean z10 = ((abstractC6358h0 instanceof F1) && ((F1) abstractC6358h0).a() == 16) ? false : true;
            if (((androidx.compose.ui.platform.F1) interfaceC2425m.n(AbstractC2739w0.s())).a() && this.f9773b.e() && W0.h(this.f9774c.k()) && z10) {
                interfaceC2425m.V(808320157);
                C2197e c2197eI = this.f9774c.i();
                W0 w0B = W0.b(this.f9774c.k());
                boolean zF = interfaceC2425m.F(c1950o);
                Object objD2 = interfaceC2425m.D();
                if (zF || objD2 == aVar.a()) {
                    objD2 = new C0136a(c1950o, null);
                    interfaceC2425m.u(objD2);
                }
                AbstractC2393b0.d(c2197eI, w0B, (Function2) objD2, interfaceC2425m, 0);
                boolean zF2 = interfaceC2425m.F(c1950o) | interfaceC2425m.F(this.f9775d) | interfaceC2425m.U(this.f9774c) | interfaceC2425m.F(this.f9773b) | interfaceC2425m.U(this.f9772a);
                InterfaceC2517J interfaceC2517J = this.f9775d;
                C2527U c2527u = this.f9774c;
                C1774y c1774y = this.f9773b;
                AbstractC6358h0 abstractC6358h02 = this.f9772a;
                Object objD3 = interfaceC2425m.D();
                if (zF2 || objD3 == aVar.a()) {
                    objD3 = new b(c1950o, interfaceC2517J, c2527u, c1774y, abstractC6358h02);
                    interfaceC2425m.u(objD3);
                }
                eVarD = androidx.compose.ui.draw.b.d(eVar, (Function1) objD3);
                interfaceC2425m.O();
            } else {
                interfaceC2425m.V(809534830);
                interfaceC2425m.O();
                eVarD = androidx.compose.ui.e.f26613a;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarD;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final b f9783a = new b();

        b() {
            super(1);
        }

        public final void a(S.b bVar) {
            bVar.d(1000);
            Float fValueOf = Float.valueOf(1.0f);
            bVar.f(fValueOf, 0);
            bVar.f(fValueOf, 499);
            Float fValueOf2 = Float.valueOf(0.0f);
            bVar.f(fValueOf2, 500);
            bVar.f(fValueOf2, 999);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((S.b) obj);
            return Td.L.f17438a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, C1774y c1774y, C2527U c2527u, InterfaceC2517J interfaceC2517J, AbstractC6358h0 abstractC6358h0, boolean z10) {
        return z10 ? androidx.compose.ui.c.c(eVar, null, new a(abstractC6358h0, c1774y, c2527u, interfaceC2517J), 1, null) : eVar;
    }

    public static final float b() {
        return f9771b;
    }
}
