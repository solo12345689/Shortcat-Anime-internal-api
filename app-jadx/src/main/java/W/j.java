package W;

import C.A;
import I0.B;
import I0.InterfaceC1686l;
import I0.InterfaceC1692s;
import K0.InterfaceC1788g;
import R0.C;
import Td.L;
import U.AbstractC2181s;
import U.H;
import U0.Y0;
import U0.Z0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.C2397c1;
import Y.I;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import Y.m2;
import a1.f0;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.AbstractC2679h;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5010c;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.C5509x;
import p0.C5911f;
import r0.AbstractC6231m;
import r0.C6230l;
import s0.AbstractC6362i1;
import s0.AbstractC6365j1;
import s0.C6385r0;
import s0.E1;
import s0.InterfaceC6389t0;
import u0.InterfaceC6711f;
import v.v;
import w.AbstractC6892c;
import w.AbstractC6906j;
import x.AbstractC7010h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f20511b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f20516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f20517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final androidx.compose.ui.e f20518i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f20510a = AbstractC5010c.a(0, 0, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f20512c = C5015h.n(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f20513d = C5015h.n(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f20514e = C5015h.n(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f20515f = C5015h.n(24);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f20519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0 f20520b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, C0 c02) {
            super(1);
            this.f20519a = f10;
            this.f20520b = c02;
        }

        public final void a(long j10) {
            float fI = C6230l.i(j10) * this.f20519a;
            float fG = C6230l.g(j10) * this.f20519a;
            if (C6230l.i(((C6230l) this.f20520b.getValue()).m()) == fI && C6230l.g(((C6230l) this.f20520b.getValue()).m()) == fG) {
                return;
            }
            this.f20520b.setValue(C6230l.c(AbstractC6231m.a(fI, fG)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6230l) obj).m());
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0 f20521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f20522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f20523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0 c02, A a10, Function2 function2) {
            super(2);
            this.f20521a = c02;
            this.f20522b = a10;
            this.f20523c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(157291737, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
            }
            androidx.compose.ui.e eVarK = H.k(AbstractC2679h.b(androidx.compose.ui.e.f26613a, "Container"), new C5509x(this.f20521a) { // from class: W.j.b.a
                @Override // kotlin.jvm.internal.C5509x, pe.InterfaceC6024n
                public Object get() {
                    return ((C0) this.receiver).getValue();
                }
            }, this.f20522b);
            Function2 function2 = this.f20523c;
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), true);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarK);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            function2.invoke(interfaceC2425m, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f20524a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function2 function2) {
            super(2);
            this.f20524a = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1750327932, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
            }
            androidx.compose.ui.e eVarB = AbstractC2679h.b(androidx.compose.ui.e.f26613a, "Container");
            Function2 function2 = this.f20524a;
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), true);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarB);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            function2.invoke(interfaceC2425m, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y0 f20525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y0 f20526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f20527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h2 f20528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2 f20529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f20530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h2 f20531g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Y0 y02, Y0 y03, float f10, h2 h2Var, Function2 function2, boolean z10, h2 h2Var2) {
            super(2);
            this.f20525a = y02;
            this.f20526b = y03;
            this.f20527c = f10;
            this.f20528d = h2Var;
            this.f20529e = function2;
            this.f20530f = z10;
            this.f20531g = h2Var2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1236585568, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
            }
            Y0 y0C = Z0.c(this.f20525a, this.f20526b, this.f20527c);
            boolean z10 = this.f20530f;
            h2 h2Var = this.f20531g;
            if (z10) {
                y0C = Y0.e(y0C, ((C6385r0) h2Var.getValue()).A(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            }
            j.d(((C6385r0) this.f20528d.getValue()).A(), y0C, this.f20529e, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f20532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f20533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, Function2 function2) {
            super(2);
            this.f20532a = j10;
            this.f20533b = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-130107406, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
            }
            j.e(this.f20532a, this.f20533b, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f20534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y0 f20536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f20537d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h2 f20538a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h2 h2Var) {
                super(1);
                this.f20538a = h2Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((androidx.compose.ui.graphics.g) obj);
                return L.f17438a;
            }

            public final void invoke(androidx.compose.ui.graphics.g gVar) {
                gVar.e(((Number) this.f20538a.getValue()).floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(h2 h2Var, long j10, Y0 y02, Function2 function2) {
            super(3);
            this.f20534a = h2Var;
            this.f20535b = j10;
            this.f20536c = y02;
            this.f20537d = function2;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC2425m.U(eVar) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-660524084, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
            }
            boolean zU = interfaceC2425m.U(this.f20534a);
            h2 h2Var = this.f20534a;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new a(h2Var);
                interfaceC2425m.u(objD);
            }
            androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.f.a(eVar, (Function1) objD);
            long j10 = this.f20535b;
            Y0 y02 = this.f20536c;
            Function2 function2 = this.f20537d;
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarA);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            j.d(j10, y02, function2, interfaceC2425m, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f20539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y0 f20541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f20542d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h2 f20543a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h2 h2Var) {
                super(1);
                this.f20543a = h2Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((androidx.compose.ui.graphics.g) obj);
                return L.f17438a;
            }

            public final void invoke(androidx.compose.ui.graphics.g gVar) {
                gVar.e(((Number) this.f20543a.getValue()).floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(h2 h2Var, long j10, Y0 y02, Function2 function2) {
            super(2);
            this.f20539a = h2Var;
            this.f20540b = j10;
            this.f20541c = y02;
            this.f20542d = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(274398694, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            boolean zU = interfaceC2425m.U(this.f20539a);
            h2 h2Var = this.f20539a;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new a(h2Var);
                interfaceC2425m.u(objD);
            }
            androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.f.a(aVar, (Function1) objD);
            long j10 = this.f20540b;
            Y0 y02 = this.f20541c;
            Function2 function2 = this.f20542d;
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarA);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            j.d(j10, y02, function2, interfaceC2425m, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f20544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y0 f20546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f20547d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h2 f20548a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h2 h2Var) {
                super(1);
                this.f20548a = h2Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((androidx.compose.ui.graphics.g) obj);
                return L.f17438a;
            }

            public final void invoke(androidx.compose.ui.graphics.g gVar) {
                gVar.e(((Number) this.f20548a.getValue()).floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(h2 h2Var, long j10, Y0 y02, Function2 function2) {
            super(2);
            this.f20544a = h2Var;
            this.f20545b = j10;
            this.f20546c = y02;
            this.f20547d = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1526229403, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            boolean zU = interfaceC2425m.U(this.f20544a);
            h2 h2Var = this.f20544a;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new a(h2Var);
                interfaceC2425m.u(objD);
            }
            androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.f.a(aVar, (Function1) objD);
            long j10 = this.f20545b;
            Y0 y02 = this.f20546c;
            Function2 function2 = this.f20547d;
            B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425m, 0);
            I iR = interfaceC2425m.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarA);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            if (interfaceC2425m.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425m.I();
            if (interfaceC2425m.e()) {
                interfaceC2425m.h(interfaceC5082aA);
            } else {
                interfaceC2425m.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
            m2.e(interfaceC2425mB, bH, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
            j.d(j10, y02, function2, interfaceC2425m, 0);
            interfaceC2425m.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f20549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y0 f20550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f20551c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j10, Y0 y02, Function2 function2) {
            super(2);
            this.f20549a = j10;
            this.f20550b = y02;
            this.f20551c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1263707005, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
            }
            j.d(this.f20549a, this.f20550b, this.f20551c, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: W.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0359j extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f20552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f20553b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0359j(long j10, Function2 function2) {
            super(2);
            this.f20552a = j10;
            this.f20553b = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2079816678, i10, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
            }
            j.e(this.f20552a, this.f20553b, interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f20554a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(h2 h2Var) {
            super(0);
            this.f20554a = h2Var;
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.valueOf(((Number) this.f20554a.getValue()).floatValue() > 0.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class l extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f20555a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(h2 h2Var) {
            super(0);
            this.f20555a = h2Var;
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.valueOf(((Number) this.f20555a.getValue()).floatValue() > 0.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class m extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ W.p f20556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f20558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f20559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2 f20560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2 f20561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2 f20562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f20563h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2 f20564i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2 f20565j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2 f20566k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f20567l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f20568m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f20569n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ B.k f20570o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ A f20571p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ U.f0 f20572q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function2 f20573r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f20574s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f20575t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f20576u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(W.p pVar, String str, Function2 function2, f0 f0Var, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, boolean z10, boolean z11, boolean z12, B.k kVar, A a10, U.f0 f0Var2, Function2 function29, int i10, int i11, int i12) {
            super(2);
            this.f20556a = pVar;
            this.f20557b = str;
            this.f20558c = function2;
            this.f20559d = f0Var;
            this.f20560e = function22;
            this.f20561f = function23;
            this.f20562g = function24;
            this.f20563h = function25;
            this.f20564i = function26;
            this.f20565j = function27;
            this.f20566k = function28;
            this.f20567l = z10;
            this.f20568m = z11;
            this.f20569n = z12;
            this.f20570o = kVar;
            this.f20571p = a10;
            this.f20572q = f0Var2;
            this.f20573r = function29;
            this.f20574s = i10;
            this.f20575t = i11;
            this.f20576u = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            j.a(this.f20556a, this.f20557b, this.f20558c, this.f20559d, this.f20560e, this.f20561f, this.f20562g, this.f20563h, this.f20564i, this.f20565j, this.f20566k, this.f20567l, this.f20568m, this.f20569n, this.f20570o, this.f20571p, this.f20572q, this.f20573r, interfaceC2425m, AbstractC2409g1.a(this.f20574s | 1), AbstractC2409g1.a(this.f20575t), this.f20576u);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class n extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f20577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y0 f20578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f20579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f20580d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j10, Y0 y02, Function2 function2, int i10) {
            super(2);
            this.f20577a = j10;
            this.f20578b = y02;
            this.f20579c = function2;
            this.f20580d = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            j.d(this.f20577a, this.f20578b, this.f20579c, interfaceC2425m, AbstractC2409g1.a(this.f20580d | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class o extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f20581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f20582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20583c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(long j10, Function2 function2, int i10) {
            super(2);
            this.f20581a = j10;
            this.f20582b = function2;
            this.f20583c = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            j.e(this.f20581a, this.f20582b, interfaceC2425m, AbstractC2409g1.a(this.f20583c | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f20585b;

        static {
            int[] iArr = new int[W.p.values().length];
            try {
                iArr[W.p.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W.p.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20584a = iArr;
            int[] iArr2 = new int[W.d.values().length];
            try {
                iArr2[W.d.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[W.d.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[W.d.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f20585b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class q extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f20586a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(1);
            this.f20586a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C) obj);
            return L.f17438a;
        }

        public final void invoke(C c10) {
            R0.A.k(c10, this.f20586a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class r extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ E1 f20587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6389t0 f20588b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC6362i1 f20589a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6389t0 f20590b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC6362i1 abstractC6362i1, InterfaceC6389t0 interfaceC6389t0) {
                super(1);
                this.f20589a = abstractC6362i1;
                this.f20590b = interfaceC6389t0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC6711f) obj);
                return L.f17438a;
            }

            public final void invoke(InterfaceC6711f interfaceC6711f) {
                AbstractC6365j1.e(interfaceC6711f, this.f20589a, this.f20590b.a(), 0.0f, null, null, 0, 60, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(E1 e12, InterfaceC6389t0 interfaceC6389t0) {
            super(1);
            this.f20587a = e12;
            this.f20588b = interfaceC6389t0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final p0.j invoke(C5911f c5911f) {
            return c5911f.j(new a(this.f20587a.mo6createOutlinePq9zytI(c5911f.f(), c5911f.getLayoutDirection(), c5911f), this.f20588b));
        }
    }

    static {
        float f10 = 16;
        f20511b = C5015h.n(f10);
        f20516g = C5015h.n(f10);
        f20517h = C5015h.n(f10);
        float f11 = 48;
        f20518i = s.a(androidx.compose.ui.e.f26613a, C5015h.n(f11), C5015h.n(f11));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:504:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(W.p r47, java.lang.String r48, kotlin.jvm.functions.Function2 r49, a1.f0 r50, kotlin.jvm.functions.Function2 r51, kotlin.jvm.functions.Function2 r52, kotlin.jvm.functions.Function2 r53, kotlin.jvm.functions.Function2 r54, kotlin.jvm.functions.Function2 r55, kotlin.jvm.functions.Function2 r56, kotlin.jvm.functions.Function2 r57, boolean r58, boolean r59, boolean r60, B.k r61, C.A r62, U.f0 r63, kotlin.jvm.functions.Function2 r64, Y.InterfaceC2425m r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instruction units count: 2750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.j.a(W.p, java.lang.String, kotlin.jvm.functions.Function2, a1.f0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, B.k, C.A, U.f0, kotlin.jvm.functions.Function2, Y.m, int, int, int):void");
    }

    private static final boolean b(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    private static final boolean c(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(long j10, Y0 y02, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        long j11;
        Y0 y03;
        Function2 function22;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1208685580);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.d(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(y02) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            function22 = function2;
            y03 = y02;
            j11 = j10;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1208685580, i11, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            W.f.a(j10, y02, function2, interfaceC2425mG, i11 & 1022);
            j11 = j10;
            y03 = y02;
            function22 = function2;
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new n(j11, y03, function22, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(long j10, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(660142980);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.d(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(660142980, i11, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            Y.H.c(AbstractC2181s.a().d(C6385r0.m(j10)), function2, interfaceC2425mG, (i11 & 112) | C2397c1.f22274i);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new o(j10, function2, i10));
        }
    }

    public static final h2 h(boolean z10, boolean z11, boolean z12, U.f0 f0Var, float f10, float f11, InterfaceC2425m interfaceC2425m, int i10) {
        h2 h2VarO;
        h2 h2VarO2;
        InterfaceC2425m interfaceC2425m2 = interfaceC2425m;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(2047013045, i10, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long jD = f0Var.d(z10, z11, z12);
        if (z10) {
            interfaceC2425m2.V(1023053998);
            h2VarO = v.a(jD, AbstractC6906j.j(150, 0, null, 6, null), null, null, interfaceC2425m, 48, 12);
            interfaceC2425m2 = interfaceC2425m;
            interfaceC2425m2.O();
        } else {
            interfaceC2425m2.V(1023165505);
            h2VarO = U1.o(C6385r0.m(jD), interfaceC2425m2, 0);
            interfaceC2425m2.O();
        }
        h2 h2Var = h2VarO;
        if (z10) {
            interfaceC2425m2.V(1023269417);
            h2VarO2 = AbstractC6892c.c(z12 ? f10 : f11, AbstractC6906j.j(150, 0, null, 6, null), null, null, interfaceC2425m2, 48, 12);
            interfaceC2425m2.O();
        } else {
            interfaceC2425m2.V(1023478388);
            h2VarO2 = U1.o(C5015h.h(f11), interfaceC2425m2, (i10 >> 15) & 14);
            interfaceC2425m2.O();
        }
        h2 h2VarO3 = U1.o(AbstractC7010h.a(((C5015h) h2VarO2.getValue()).t(), ((C6385r0) h2Var.getValue()).A()), interfaceC2425m2, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarO3;
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, boolean z10, String str) {
        return z10 ? R0.r.f(eVar, false, new q(str), 1, null) : eVar;
    }

    public static final float j() {
        return f20512c;
    }

    public static final androidx.compose.ui.e k() {
        return f20518i;
    }

    public static final Object l(InterfaceC1686l interfaceC1686l) {
        Object objJ = interfaceC1686l.j();
        InterfaceC1692s interfaceC1692s = objJ instanceof InterfaceC1692s ? (InterfaceC1692s) objJ : null;
        if (interfaceC1692s != null) {
            return interfaceC1692s.I0();
        }
        return null;
    }

    public static final float m() {
        return f20516g;
    }

    public static final float n() {
        return f20517h;
    }

    public static final float o() {
        return f20515f;
    }

    public static final float p() {
        return f20514e;
    }

    public static final float q() {
        return f20513d;
    }

    public static final float r() {
        return f20511b;
    }

    public static final long s() {
        return f20510a;
    }

    public static final int t(androidx.compose.ui.layout.s sVar) {
        if (sVar != null) {
            return sVar.P0();
        }
        return 0;
    }

    public static final androidx.compose.ui.e u(androidx.compose.ui.e eVar, InterfaceC6389t0 interfaceC6389t0, E1 e12) {
        return androidx.compose.ui.draw.b.c(eVar, new r(e12, interfaceC6389t0));
    }

    public static final int v(androidx.compose.ui.layout.s sVar) {
        if (sVar != null) {
            return sVar.W0();
        }
        return 0;
    }
}
