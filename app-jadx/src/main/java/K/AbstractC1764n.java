package K;

import U0.Y0;
import U0.Z0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.h2;
import Y0.AbstractC2485u;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import i1.C5015h;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: K.n */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1764n {

    /* JADX INFO: renamed from: K.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f10260a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f10261b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Y0 f10262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, Y0 y02) {
            super(1);
            this.f10260a = i10;
            this.f10261b = i11;
            this.f10262c = y02;
        }

        public final void a(V0 v02) {
            v02.d("heightInLines");
            v02.b().c("minLines", Integer.valueOf(this.f10260a));
            v02.b().c("maxLines", Integer.valueOf(this.f10261b));
            v02.b().c("textStyle", this.f10262c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: K.n$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f10263a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f10264b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Y0 f10265c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, Y0 y02) {
            super(3);
            this.f10263a = i10;
            this.f10264b = i11;
            this.f10265c = y02;
        }

        private static final Object b(h2 h2Var) {
            return h2Var.getValue();
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(408240218);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(408240218, i10, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            AbstractC1764n.b(this.f10263a, this.f10264b);
            if (this.f10263a == 1 && this.f10264b == Integer.MAX_VALUE) {
                e.a aVar = androidx.compose.ui.e.f26613a;
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
                interfaceC2425m.O();
                return aVar;
            }
            InterfaceC5011d interfaceC5011d = (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e());
            AbstractC2485u.b bVar = (AbstractC2485u.b) interfaceC2425m.n(AbstractC2739w0.g());
            EnumC5027t enumC5027t = (EnumC5027t) interfaceC2425m.n(AbstractC2739w0.k());
            boolean zU = interfaceC2425m.U(this.f10265c) | interfaceC2425m.U(enumC5027t);
            Y0 y02 = this.f10265c;
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
            boolean zU3 = interfaceC2425m.U(b(h2Var)) | interfaceC2425m.U(interfaceC5011d) | interfaceC2425m.U(bVar) | interfaceC2425m.U(this.f10265c) | interfaceC2425m.U(enumC5027t);
            Object objD3 = interfaceC2425m.D();
            if (zU3 || objD3 == InterfaceC2425m.f22370a.a()) {
                objD3 = Integer.valueOf(C5025r.f(M.a(y03, interfaceC5011d, bVar, M.c(), 1)));
                interfaceC2425m.u(objD3);
            }
            int iIntValue = ((Number) objD3).intValue();
            boolean zU4 = interfaceC2425m.U(enumC5027t) | interfaceC2425m.U(interfaceC5011d) | interfaceC2425m.U(bVar) | interfaceC2425m.U(this.f10265c) | interfaceC2425m.U(b(h2Var));
            Object objD4 = interfaceC2425m.D();
            if (zU4 || objD4 == InterfaceC2425m.f22370a.a()) {
                objD4 = Integer.valueOf(C5025r.f(M.a(y03, interfaceC5011d, bVar, M.c() + '\n' + M.c(), 2)));
                interfaceC2425m.u(objD4);
            }
            int iIntValue2 = ((Number) objD4).intValue() - iIntValue;
            int i12 = this.f10263a;
            Integer numValueOf = i12 == 1 ? null : Integer.valueOf(((i12 - 1) * iIntValue2) + iIntValue);
            int i13 = this.f10264b;
            Integer numValueOf2 = i13 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i13 - 1))) : null;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.s.j(androidx.compose.ui.e.f26613a, numValueOf != null ? interfaceC5011d.A(numValueOf.intValue()) : C5015h.f48547b.c(), numValueOf2 != null ? interfaceC5011d.A(numValueOf2.intValue()) : C5015h.f48547b.c());
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarJ;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, Y0 y02, int i10, int i11) {
        return androidx.compose.ui.c.b(eVar, T0.b() ? new a(i10, i11, y02) : T0.a(), new b(i10, i11, y02));
    }

    public static final void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero").toString());
        }
        if (i10 <= i11) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i10 + " must be less than or equal to maxLines " + i11).toString());
    }
}
