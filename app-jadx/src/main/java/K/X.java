package K;

import U0.Y0;
import U0.Z0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.h2;
import Y0.AbstractC2485u;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AbstractC2739w0;
import i1.C5009b;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y0 f9883a;

        /* JADX INFO: renamed from: K.X$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0147a extends AbstractC5506u implements InterfaceC5096o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ W f9884a;

            /* JADX INFO: renamed from: K.X$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0148a extends AbstractC5506u implements Function1 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.s f9885a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0148a(androidx.compose.ui.layout.s sVar) {
                    super(1);
                    this.f9885a = sVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((s.a) obj);
                    return Td.L.f17438a;
                }

                public final void invoke(s.a aVar) {
                    s.a.W(aVar, this.f9885a, 0, 0, 0.0f, 4, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0147a(W w10) {
                super(3);
                this.f9884a = w10;
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m10invoke3p2s80s((androidx.compose.ui.layout.l) obj, (I0.A) obj2, ((C5009b) obj3).r());
            }

            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final I0.C m10invoke3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
                long jB = this.f9884a.b();
                androidx.compose.ui.layout.s sVarV0 = a10.v0(C5009b.d(j10, AbstractC5874j.m(C5025r.g(jB), C5009b.n(j10), C5009b.l(j10)), 0, AbstractC5874j.m(C5025r.f(jB), C5009b.m(j10), C5009b.k(j10)), 0, 10, null));
                return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new C0148a(sVarV0), 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Y0 y02) {
            super(3);
            this.f9883a = y02;
        }

        private static final Object b(h2 h2Var) {
            return h2Var.getValue();
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(1582736677);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1582736677, i10, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)");
            }
            InterfaceC5011d interfaceC5011d = (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e());
            AbstractC2485u.b bVar = (AbstractC2485u.b) interfaceC2425m.n(AbstractC2739w0.g());
            EnumC5027t enumC5027t = (EnumC5027t) interfaceC2425m.n(AbstractC2739w0.k());
            boolean zU = interfaceC2425m.U(this.f9883a) | interfaceC2425m.U(enumC5027t);
            Y0 y02 = this.f9883a;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = Z0.d(y02, enumC5027t);
                interfaceC2425m.u(objD);
            }
            Y0 y03 = (Y0) objD;
            boolean zU2 = interfaceC2425m.U(bVar) | interfaceC2425m.U(y03);
            Object objD2 = interfaceC2425m.D();
            if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                AbstractC2485u abstractC2485uL = y03.l();
                Y0.L lQ = y03.q();
                if (lQ == null) {
                    lQ = Y0.L.f22613b.g();
                }
                Y0.H hO = y03.o();
                int i11 = hO != null ? hO.i() : Y0.H.f22594b.b();
                Y0.I iP = y03.p();
                objD2 = bVar.b(abstractC2485uL, lQ, i11, iP != null ? iP.m() : Y0.I.f22598b.a());
                interfaceC2425m.u(objD2);
            }
            h2 h2Var = (h2) objD2;
            Y0 y04 = this.f9883a;
            Object objD3 = interfaceC2425m.D();
            InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
            if (objD3 == aVar.a()) {
                objD3 = new W(enumC5027t, interfaceC5011d, bVar, y04, b(h2Var));
                interfaceC2425m.u(objD3);
            }
            W w10 = (W) objD3;
            w10.c(enumC5027t, interfaceC5011d, bVar, y03, b(h2Var));
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            boolean zF = interfaceC2425m.F(w10);
            Object objD4 = interfaceC2425m.D();
            if (zF || objD4 == aVar.a()) {
                objD4 = new C0147a(w10);
                interfaceC2425m.u(objD4);
            }
            androidx.compose.ui.e eVarA = androidx.compose.ui.layout.i.a(aVar2, (InterfaceC5096o) objD4);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarA;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, Y0 y02) {
        return androidx.compose.ui.c.c(eVar, null, new a(y02), 1, null);
    }
}
