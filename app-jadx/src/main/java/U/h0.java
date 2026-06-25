package U;

import K0.InterfaceC1788g;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.AbstractC2679h;
import androidx.compose.ui.layout.s;
import androidx.compose.ui.platform.AbstractC2739w0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5016i;
import i1.C5009b;
import i1.C5015h;
import i1.C5021n;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import k1.AbstractC5437b;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a */
    private static final float f18356a = C5015h.n(8);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f18357a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function2 f18358b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f18359c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5096o f18360d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Function2 f18361e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Function2 f18362f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Function2 f18363g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Function2 f18364h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ boolean f18365i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ float f18366j;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Function2 f18367k;

        /* JADX INFO: renamed from: l */
        final /* synthetic */ Function2 f18368l;

        /* JADX INFO: renamed from: m */
        final /* synthetic */ C.A f18369m;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f18370n;

        /* JADX INFO: renamed from: o */
        final /* synthetic */ int f18371o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, Function2 function2, Function2 function22, InterfaceC5096o interfaceC5096o, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z10, float f10, Function2 function27, Function2 function28, C.A a10, int i10, int i11) {
            super(2);
            this.f18357a = eVar;
            this.f18358b = function2;
            this.f18359c = function22;
            this.f18360d = interfaceC5096o;
            this.f18361e = function23;
            this.f18362f = function24;
            this.f18363g = function25;
            this.f18364h = function26;
            this.f18365i = z10;
            this.f18366j = f10;
            this.f18367k = function27;
            this.f18368l = function28;
            this.f18369m = a10;
            this.f18370n = i10;
            this.f18371o = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            h0.a(this.f18357a, this.f18358b, this.f18359c, this.f18360d, this.f18361e, this.f18362f, this.f18363g, this.f18364h, this.f18365i, this.f18366j, this.f18367k, this.f18368l, this.f18369m, interfaceC2425m, AbstractC2409g1.a(this.f18370n | 1), AbstractC2409g1.a(this.f18371o));
        }
    }

    public static final void a(androidx.compose.ui.e eVar, Function2 function2, Function2 function22, InterfaceC5096o interfaceC5096o, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z10, float f10, Function2 function27, Function2 function28, C.A a10, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        int i13;
        C.A a11;
        int i14;
        float f11;
        Function2 function29;
        Function2 function210;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1830307184);
        if ((i10 & 6) == 0) {
            i12 = i10 | (interfaceC2425mG.U(eVar) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.F(function22) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= interfaceC2425mG.F(interfaceC5096o) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i12 |= interfaceC2425mG.F(function23) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= interfaceC2425mG.F(function24) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= interfaceC2425mG.F(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= interfaceC2425mG.F(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= interfaceC2425mG.a(z10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= interfaceC2425mG.b(f10) ? 536870912 : 268435456;
        }
        int i15 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (interfaceC2425mG.F(function27) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= interfaceC2425mG.F(function28) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            a11 = a10;
            i13 |= interfaceC2425mG.U(a11) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        } else {
            a11 = a10;
        }
        int i16 = i13;
        if ((i15 & 306783379) == 306783378 && (i16 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            function29 = function2;
            function210 = function28;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1830307184, i15, i16, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            boolean z11 = ((1879048192 & i15) == 536870912) | ((234881024 & i15) == 67108864) | ((i16 & 896) == 256);
            Object objD = interfaceC2425mG.D();
            if (z11 || objD == InterfaceC2425m.f22370a.a()) {
                objD = new i0(z10, f10, a11);
                interfaceC2425mG.u(objD);
            }
            i0 i0Var = (i0) objD;
            EnumC5027t enumC5027t = (EnumC5027t) interfaceC2425mG.n(AbstractC2739w0.k());
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
            m2.e(interfaceC2425mB, i0Var, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            function27.invoke(interfaceC2425mG, Integer.valueOf(i16 & 14));
            interfaceC2425mG.V(1341517187);
            if (function23 != null) {
                androidx.compose.ui.e eVarThen = AbstractC2679h.b(androidx.compose.ui.e.f26613a, "Leading").then(W.j.k());
                I0.B bH = androidx.compose.foundation.layout.f.h(l0.e.f52304a.e(), false);
                int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
                Y.I iR2 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF2 = androidx.compose.ui.c.f(interfaceC2425mG, eVarThen);
                InterfaceC5082a interfaceC5082aA2 = aVar.a();
                if (interfaceC2425mG.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425mG.I();
                if (interfaceC2425mG.e()) {
                    interfaceC2425mG.h(interfaceC5082aA2);
                } else {
                    interfaceC2425mG.s();
                }
                InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425mG);
                m2.e(interfaceC2425mB2, bH, aVar.e());
                m2.e(interfaceC2425mB2, iR2, aVar.g());
                Function2 function2B2 = aVar.b();
                if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                    interfaceC2425mB2.u(Integer.valueOf(iA2));
                    interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
                }
                m2.e(interfaceC2425mB2, eVarF2, aVar.f());
                androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.h.f26161a;
                function23.invoke(interfaceC2425mG, Integer.valueOf((i15 >> 12) & 14));
                interfaceC2425mG.x();
            }
            interfaceC2425mG.O();
            interfaceC2425mG.V(1341526310);
            if (function24 != null) {
                androidx.compose.ui.e eVarThen2 = AbstractC2679h.b(androidx.compose.ui.e.f26613a, "Trailing").then(W.j.k());
                I0.B bH2 = androidx.compose.foundation.layout.f.h(l0.e.f52304a.e(), false);
                int iA3 = AbstractC2410h.a(interfaceC2425mG, 0);
                Y.I iR3 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF3 = androidx.compose.ui.c.f(interfaceC2425mG, eVarThen2);
                InterfaceC5082a interfaceC5082aA3 = aVar.a();
                if (interfaceC2425mG.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425mG.I();
                if (interfaceC2425mG.e()) {
                    interfaceC2425mG.h(interfaceC5082aA3);
                } else {
                    interfaceC2425mG.s();
                }
                InterfaceC2425m interfaceC2425mB3 = m2.b(interfaceC2425mG);
                m2.e(interfaceC2425mB3, bH2, aVar.e());
                m2.e(interfaceC2425mB3, iR3, aVar.g());
                Function2 function2B3 = aVar.b();
                if (interfaceC2425mB3.e() || !AbstractC5504s.c(interfaceC2425mB3.D(), Integer.valueOf(iA3))) {
                    interfaceC2425mB3.u(Integer.valueOf(iA3));
                    interfaceC2425mB3.m(Integer.valueOf(iA3), function2B3);
                }
                m2.e(interfaceC2425mB3, eVarF3, aVar.f());
                androidx.compose.foundation.layout.h hVar2 = androidx.compose.foundation.layout.h.f26161a;
                function24.invoke(interfaceC2425mG, Integer.valueOf((i15 >> 15) & 14));
                interfaceC2425mG.x();
            }
            interfaceC2425mG.O();
            float fG = androidx.compose.foundation.layout.p.g(a11, enumC5027t);
            float f12 = androidx.compose.foundation.layout.p.f(a11, enumC5027t);
            if (function23 != null) {
                i14 = 0;
                fG = C5015h.n(AbstractC5874j.d(C5015h.n(fG - W.j.j()), C5015h.n(0)));
            } else {
                i14 = 0;
            }
            float fN = fG;
            if (function24 != null) {
                f12 = C5015h.n(AbstractC5874j.d(C5015h.n(f12 - W.j.j()), C5015h.n(i14)));
            }
            interfaceC2425mG.V(1341556924);
            if (function25 != null) {
                androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.p.m(androidx.compose.foundation.layout.s.z(androidx.compose.foundation.layout.s.k(AbstractC2679h.b(androidx.compose.ui.e.f26613a, "Prefix"), W.j.o(), 0.0f, 2, null), null, false, 3, null), fN, 0.0f, W.j.p(), 0.0f, 10, null);
                I0.B bH3 = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
                int iA4 = AbstractC2410h.a(interfaceC2425mG, 0);
                Y.I iR4 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF4 = androidx.compose.ui.c.f(interfaceC2425mG, eVarM);
                InterfaceC5082a interfaceC5082aA4 = aVar.a();
                if (interfaceC2425mG.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425mG.I();
                if (interfaceC2425mG.e()) {
                    interfaceC2425mG.h(interfaceC5082aA4);
                } else {
                    interfaceC2425mG.s();
                }
                InterfaceC2425m interfaceC2425mB4 = m2.b(interfaceC2425mG);
                m2.e(interfaceC2425mB4, bH3, aVar.e());
                m2.e(interfaceC2425mB4, iR4, aVar.g());
                Function2 function2B4 = aVar.b();
                if (interfaceC2425mB4.e() || !AbstractC5504s.c(interfaceC2425mB4.D(), Integer.valueOf(iA4))) {
                    interfaceC2425mB4.u(Integer.valueOf(iA4));
                    interfaceC2425mB4.m(Integer.valueOf(iA4), function2B4);
                }
                m2.e(interfaceC2425mB4, eVarF4, aVar.f());
                androidx.compose.foundation.layout.h hVar3 = androidx.compose.foundation.layout.h.f26161a;
                function25.invoke(interfaceC2425mG, Integer.valueOf((i15 >> 18) & 14));
                interfaceC2425mG.x();
            }
            interfaceC2425mG.O();
            interfaceC2425mG.V(1341568890);
            if (function26 != null) {
                float f13 = f12;
                androidx.compose.ui.e eVarM2 = androidx.compose.foundation.layout.p.m(androidx.compose.foundation.layout.s.z(androidx.compose.foundation.layout.s.k(AbstractC2679h.b(androidx.compose.ui.e.f26613a, "Suffix"), W.j.o(), 0.0f, 2, null), null, false, 3, null), W.j.p(), 0.0f, f13, 0.0f, 10, null);
                f11 = f13;
                I0.B bH4 = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
                int iA5 = AbstractC2410h.a(interfaceC2425mG, 0);
                Y.I iR5 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF5 = androidx.compose.ui.c.f(interfaceC2425mG, eVarM2);
                InterfaceC5082a interfaceC5082aA5 = aVar.a();
                if (interfaceC2425mG.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425mG.I();
                if (interfaceC2425mG.e()) {
                    interfaceC2425mG.h(interfaceC5082aA5);
                } else {
                    interfaceC2425mG.s();
                }
                InterfaceC2425m interfaceC2425mB5 = m2.b(interfaceC2425mG);
                m2.e(interfaceC2425mB5, bH4, aVar.e());
                m2.e(interfaceC2425mB5, iR5, aVar.g());
                Function2 function2B5 = aVar.b();
                if (interfaceC2425mB5.e() || !AbstractC5504s.c(interfaceC2425mB5.D(), Integer.valueOf(iA5))) {
                    interfaceC2425mB5.u(Integer.valueOf(iA5));
                    interfaceC2425mB5.m(Integer.valueOf(iA5), function2B5);
                }
                m2.e(interfaceC2425mB5, eVarF5, aVar.f());
                androidx.compose.foundation.layout.h hVar4 = androidx.compose.foundation.layout.h.f26161a;
                function26.invoke(interfaceC2425mG, Integer.valueOf((i15 >> 21) & 14));
                interfaceC2425mG.x();
            } else {
                f11 = f12;
            }
            interfaceC2425mG.O();
            interfaceC2425mG.V(1341581092);
            if (function22 != null) {
                androidx.compose.ui.e eVarM3 = androidx.compose.foundation.layout.p.m(androidx.compose.foundation.layout.s.z(androidx.compose.foundation.layout.s.k(AbstractC2679h.b(androidx.compose.ui.e.f26613a, "Label"), AbstractC5016i.c(W.j.o(), W.j.m(), f10), 0.0f, 2, null), null, false, 3, null), fN, 0.0f, f11, 0.0f, 10, null);
                I0.B bH5 = androidx.compose.foundation.layout.f.h(l0.e.f52304a.o(), false);
                int iA6 = AbstractC2410h.a(interfaceC2425mG, 0);
                Y.I iR6 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF6 = androidx.compose.ui.c.f(interfaceC2425mG, eVarM3);
                InterfaceC5082a interfaceC5082aA6 = aVar.a();
                if (interfaceC2425mG.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425mG.I();
                if (interfaceC2425mG.e()) {
                    interfaceC2425mG.h(interfaceC5082aA6);
                } else {
                    interfaceC2425mG.s();
                }
                InterfaceC2425m interfaceC2425mB6 = m2.b(interfaceC2425mG);
                m2.e(interfaceC2425mB6, bH5, aVar.e());
                m2.e(interfaceC2425mB6, iR6, aVar.g());
                Function2 function2B6 = aVar.b();
                if (interfaceC2425mB6.e() || !AbstractC5504s.c(interfaceC2425mB6.D(), Integer.valueOf(iA6))) {
                    interfaceC2425mB6.u(Integer.valueOf(iA6));
                    interfaceC2425mB6.m(Integer.valueOf(iA6), function2B6);
                }
                m2.e(interfaceC2425mB6, eVarF6, aVar.f());
                androidx.compose.foundation.layout.h hVar5 = androidx.compose.foundation.layout.h.f26161a;
                function22.invoke(interfaceC2425mG, Integer.valueOf((i15 >> 6) & 14));
                interfaceC2425mG.x();
            }
            interfaceC2425mG.O();
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarZ = androidx.compose.foundation.layout.s.z(androidx.compose.foundation.layout.s.k(aVar2, W.j.o(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                fN = C5015h.n(0);
            }
            androidx.compose.ui.e eVarM4 = androidx.compose.foundation.layout.p.m(eVarZ, fN, 0.0f, function26 == null ? f11 : C5015h.n(0), 0.0f, 10, null);
            interfaceC2425mG.V(1341611627);
            if (interfaceC5096o != null) {
                interfaceC5096o.invoke(AbstractC2679h.b(aVar2, "Hint").then(eVarM4), interfaceC2425mG, Integer.valueOf((i15 >> 6) & 112));
            }
            interfaceC2425mG.O();
            androidx.compose.ui.e eVarThen3 = AbstractC2679h.b(aVar2, "TextField").then(eVarM4);
            e.a aVar3 = l0.e.f52304a;
            I0.B bH6 = androidx.compose.foundation.layout.f.h(aVar3.o(), true);
            int iA7 = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR7 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF7 = androidx.compose.ui.c.f(interfaceC2425mG, eVarThen3);
            InterfaceC5082a interfaceC5082aA7 = aVar.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA7);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB7 = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB7, bH6, aVar.e());
            m2.e(interfaceC2425mB7, iR7, aVar.g());
            Function2 function2B7 = aVar.b();
            if (interfaceC2425mB7.e() || !AbstractC5504s.c(interfaceC2425mB7.D(), Integer.valueOf(iA7))) {
                interfaceC2425mB7.u(Integer.valueOf(iA7));
                interfaceC2425mB7.m(Integer.valueOf(iA7), function2B7);
            }
            m2.e(interfaceC2425mB7, eVarF7, aVar.f());
            androidx.compose.foundation.layout.h hVar6 = androidx.compose.foundation.layout.h.f26161a;
            function29 = function2;
            function29.invoke(interfaceC2425mG, Integer.valueOf((i15 >> 3) & 14));
            interfaceC2425mG.x();
            interfaceC2425mG.V(1341622624);
            if (function28 != null) {
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.p.h(androidx.compose.foundation.layout.s.z(androidx.compose.foundation.layout.s.k(AbstractC2679h.b(aVar2, "Supporting"), W.j.n(), 0.0f, 2, null), null, false, 3, null), g0.b(g0.f18344a, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                I0.B bH7 = androidx.compose.foundation.layout.f.h(aVar3.o(), false);
                int iA8 = AbstractC2410h.a(interfaceC2425mG, 0);
                Y.I iR8 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF8 = androidx.compose.ui.c.f(interfaceC2425mG, eVarH);
                InterfaceC5082a interfaceC5082aA8 = aVar.a();
                if (interfaceC2425mG.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425mG.I();
                if (interfaceC2425mG.e()) {
                    interfaceC2425mG.h(interfaceC5082aA8);
                } else {
                    interfaceC2425mG.s();
                }
                InterfaceC2425m interfaceC2425mB8 = m2.b(interfaceC2425mG);
                m2.e(interfaceC2425mB8, bH7, aVar.e());
                m2.e(interfaceC2425mB8, iR8, aVar.g());
                Function2 function2B8 = aVar.b();
                if (interfaceC2425mB8.e() || !AbstractC5504s.c(interfaceC2425mB8.D(), Integer.valueOf(iA8))) {
                    interfaceC2425mB8.u(Integer.valueOf(iA8));
                    interfaceC2425mB8.m(Integer.valueOf(iA8), function2B8);
                }
                m2.e(interfaceC2425mB8, eVarF8, aVar.f());
                function210 = function28;
                function210.invoke(interfaceC2425mG, Integer.valueOf((i16 >> 3) & 14));
                interfaceC2425mG.x();
            } else {
                function210 = function28;
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new a(eVar, function29, function22, interfaceC5096o, function23, function24, function25, function26, z10, f10, function27, function210, a11, i10, i11));
        }
    }

    public static final int g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, long j10, float f11, C.A a10) {
        boolean z10 = i11 > 0;
        float fN = C5015h.n(a10.d() + a10.c()) * f11;
        if (z10) {
            fN = AbstractC5437b.b(C5015h.n(W.j.r() * 2) * f11, fN, f10);
        }
        return Math.max(C5009b.m(j10), Math.max(i12, Math.max(i13, AbstractC5466a.d(fN + AbstractC5437b.c(0, i11, f10) + Xd.a.h(i10, i16, i14, i15, AbstractC5437b.c(i11, 0, f10))))) + i17);
    }

    public static final int h(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10) {
        int i17 = i12 + i13;
        return Math.max(i10 + Math.max(i14 + i17, Math.max(i16 + i17, i15)) + i11, C5009b.n(j10));
    }

    public static final void i(s.a aVar, int i10, int i11, androidx.compose.ui.layout.s sVar, androidx.compose.ui.layout.s sVar2, androidx.compose.ui.layout.s sVar3, androidx.compose.ui.layout.s sVar4, androidx.compose.ui.layout.s sVar5, androidx.compose.ui.layout.s sVar6, androidx.compose.ui.layout.s sVar7, androidx.compose.ui.layout.s sVar8, androidx.compose.ui.layout.s sVar9, boolean z10, int i12, int i13, float f10, float f11) {
        s.a.U(aVar, sVar8, C5021n.f48560b.b(), 0.0f, 2, null);
        int iT = i11 - W.j.t(sVar9);
        if (sVar4 != null) {
            s.a.W(aVar, sVar4, 0, l0.e.f52304a.i().a(sVar4.P0(), iT), 0.0f, 4, null);
        }
        if (sVar2 != null) {
            s.a.W(aVar, sVar2, W.j.v(sVar4), (z10 ? l0.e.f52304a.i().a(sVar2.P0(), iT) : AbstractC5466a.d(W.j.r() * f11)) - AbstractC5466a.d((r1 - i12) * f10), 0.0f, 4, null);
        }
        if (sVar6 != null) {
            s.a.W(aVar, sVar6, W.j.v(sVar4), i13, 0.0f, 4, null);
        }
        int iV = W.j.v(sVar4) + W.j.v(sVar6);
        s.a.W(aVar, sVar, iV, i13, 0.0f, 4, null);
        if (sVar3 != null) {
            s.a.W(aVar, sVar3, iV, i13, 0.0f, 4, null);
        }
        if (sVar7 != null) {
            s.a.W(aVar, sVar7, (i10 - W.j.v(sVar5)) - sVar7.W0(), i13, 0.0f, 4, null);
        }
        if (sVar5 != null) {
            s.a.W(aVar, sVar5, i10 - sVar5.W0(), l0.e.f52304a.i().a(sVar5.P0(), iT), 0.0f, 4, null);
        }
        if (sVar9 != null) {
            s.a.W(aVar, sVar9, 0, iT, 0.0f, 4, null);
        }
    }

    public static final void j(s.a aVar, int i10, int i11, androidx.compose.ui.layout.s sVar, androidx.compose.ui.layout.s sVar2, androidx.compose.ui.layout.s sVar3, androidx.compose.ui.layout.s sVar4, androidx.compose.ui.layout.s sVar5, androidx.compose.ui.layout.s sVar6, androidx.compose.ui.layout.s sVar7, androidx.compose.ui.layout.s sVar8, boolean z10, float f10, C.A a10) {
        s.a.U(aVar, sVar7, C5021n.f48560b.b(), 0.0f, 2, null);
        int iT = i11 - W.j.t(sVar8);
        int iD = AbstractC5466a.d(a10.d() * f10);
        if (sVar3 != null) {
            s.a.W(aVar, sVar3, 0, l0.e.f52304a.i().a(sVar3.P0(), iT), 0.0f, 4, null);
        }
        if (sVar5 != null) {
            s.a.W(aVar, sVar5, W.j.v(sVar3), k(z10, iT, iD, sVar5), 0.0f, 4, null);
        }
        int iV = W.j.v(sVar5) + W.j.v(sVar3);
        s.a.W(aVar, sVar, iV, k(z10, iT, iD, sVar), 0.0f, 4, null);
        if (sVar2 != null) {
            s.a.W(aVar, sVar2, iV, k(z10, iT, iD, sVar2), 0.0f, 4, null);
        }
        if (sVar6 != null) {
            s.a.W(aVar, sVar6, (i10 - W.j.v(sVar4)) - sVar6.W0(), k(z10, iT, iD, sVar6), 0.0f, 4, null);
        }
        if (sVar4 != null) {
            s.a.W(aVar, sVar4, i10 - sVar4.W0(), l0.e.f52304a.i().a(sVar4.P0(), iT), 0.0f, 4, null);
        }
        if (sVar8 != null) {
            s.a.W(aVar, sVar8, 0, iT, 0.0f, 4, null);
        }
    }

    private static final int k(boolean z10, int i10, int i11, androidx.compose.ui.layout.s sVar) {
        return z10 ? l0.e.f52304a.i().a(sVar.P0(), i10) : i11;
    }

    public static final int l(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : i10 - i11;
    }
}
