package Q;

import K0.InterfaceC1788g;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.ui.layout.s;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements I0.B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13986a = new a();

        /* JADX INFO: renamed from: Q.C$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0228a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f13987a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0228a(List list) {
                super(1);
                this.f13987a = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return Td.L.f17438a;
            }

            public final void invoke(s.a aVar) {
                List list = this.f13987a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    s.a.N(aVar, (androidx.compose.ui.layout.s) list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }
        }

        a() {
        }

        @Override // I0.B
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            Integer numValueOf = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((I0.A) list.get(i10)).v0(j10));
            }
            int size2 = arrayList.size();
            Integer numValueOf2 = numValueOf;
            for (int i11 = 0; i11 < size2; i11++) {
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((androidx.compose.ui.layout.s) arrayList.get(i11)).W0()));
            }
            int iIntValue = numValueOf2.intValue();
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((androidx.compose.ui.layout.s) arrayList.get(i12)).P0()));
            }
            return androidx.compose.ui.layout.l.u0(lVar, iIntValue, numValueOf.intValue(), null, new C0228a(arrayList), 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f13988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f13989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13991d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, Function2 function2, int i10, int i11) {
            super(2);
            this.f13988a = eVar;
            this.f13989b = function2;
            this.f13990c = i10;
            this.f13991d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            C.a(this.f13988a, this.f13989b, interfaceC2425m, AbstractC2409g1.a(this.f13990c | 1), this.f13991d);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, Function2 function2, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-2105228848);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f26613a;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-2105228848, i12, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            a aVar = a.f13986a;
            int i14 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            Y.I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, eVar);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            int i15 = ((i14 << 6) & 896) | 6;
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
            m2.e(interfaceC2425mB, aVar, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            function2.invoke(interfaceC2425mG, Integer.valueOf((i15 >> 6) & 14));
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new b(eVar, function2, i10, i11));
        }
    }
}
