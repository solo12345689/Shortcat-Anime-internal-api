package androidx.compose.foundation.layout;

import I0.A;
import I0.B;
import I0.C;
import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.ui.layout.s;
import i1.AbstractC5026s;
import i1.C5009b;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a */
    private static final HashMap f26138a = d(true);

    /* JADX INFO: renamed from: b */
    private static final HashMap f26139b = d(false);

    /* JADX INFO: renamed from: c */
    private static final B f26140c = new g(l0.e.f52304a.o(), false);

    /* JADX INFO: renamed from: d */
    private static final B f26141d = b.f26144a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.e f26142a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f26143b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.f26142a = eVar;
            this.f26143b = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            f.a(this.f26142a, interfaceC2425m, AbstractC2409g1.a(this.f26143b | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements B {

        /* JADX INFO: renamed from: a */
        public static final b f26144a = new b();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            public static final a f26145a = new a();

            a() {
                super(1);
            }

            public final void invoke(s.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return L.f17438a;
            }
        }

        b() {
        }

        @Override // I0.B
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
            return androidx.compose.ui.layout.l.u0(lVar, C5009b.n(j10), C5009b.m(j10), null, a.f26145a, 4, null);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            B b10 = f26141d;
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, eVar);
            I iR = interfaceC2425mG.r();
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
            m2.e(interfaceC2425mB, b10, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new a(eVar, i10));
        }
    }

    private static final HashMap d(boolean z10) {
        HashMap map = new HashMap(9);
        e.a aVar = l0.e.f52304a;
        e(map, z10, aVar.o());
        e(map, z10, aVar.m());
        e(map, z10, aVar.n());
        e(map, z10, aVar.h());
        e(map, z10, aVar.e());
        e(map, z10, aVar.f());
        e(map, z10, aVar.d());
        e(map, z10, aVar.b());
        e(map, z10, aVar.c());
        return map;
    }

    private static final void e(HashMap map, boolean z10, l0.e eVar) {
        map.put(eVar, new g(eVar, z10));
    }

    private static final e f(A a10) {
        Object objJ = a10.j();
        if (objJ instanceof e) {
            return (e) objJ;
        }
        return null;
    }

    public static final boolean g(A a10) {
        e eVarF = f(a10);
        if (eVarF != null) {
            return eVarF.F1();
        }
        return false;
    }

    public static final B h(l0.e eVar, boolean z10) {
        B b10 = (B) (z10 ? f26138a : f26139b).get(eVar);
        return b10 == null ? new g(eVar, z10) : b10;
    }

    public static final void i(s.a aVar, androidx.compose.ui.layout.s sVar, A a10, EnumC5027t enumC5027t, int i10, int i11, l0.e eVar) {
        l0.e eVarE1;
        e eVarF = f(a10);
        s.a.U(aVar, sVar, ((eVarF == null || (eVarE1 = eVarF.E1()) == null) ? eVar : eVarE1).a(AbstractC5026s.a(sVar.W0(), sVar.P0()), AbstractC5026s.a(i10, i11), enumC5027t), 0.0f, 2, null);
    }
}
