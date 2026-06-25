package K;

import K0.InterfaceC1788g;
import U0.C2197e;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import i1.C5009b;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: K.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1752b {

    /* JADX INFO: renamed from: a */
    private static final Pair f9907a = new Pair(AbstractC2279u.m(), AbstractC2279u.m());

    /* JADX INFO: renamed from: K.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements I0.B {

        /* JADX INFO: renamed from: a */
        public static final a f9908a = new a();

        /* JADX INFO: renamed from: K.b$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0152a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ List f9909a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0152a(List list) {
                super(1);
                this.f9909a = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return Td.L.f17438a;
            }

            public final void invoke(s.a aVar) {
                List list = this.f9909a;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    s.a.W(aVar, (androidx.compose.ui.layout.s) list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }
        }

        a() {
        }

        @Override // I0.B
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final I0.C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((I0.A) list.get(i10)).v0(j10));
            }
            return androidx.compose.ui.layout.l.u0(lVar, C5009b.l(j10), C5009b.k(j10), null, new C0152a(arrayList), 4, null);
        }
    }

    /* JADX INFO: renamed from: K.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0153b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2197e f9910a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f9911b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f9912c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0153b(C2197e c2197e, List list, int i10) {
            super(2);
            this.f9910a = c2197e;
            this.f9911b = list;
            this.f9912c = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC1752b.a(this.f9910a, this.f9911b, interfaceC2425m, AbstractC2409g1.a(this.f9912c | 1));
        }
    }

    public static final void a(C2197e c2197e, List list, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1794596951);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(c2197e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(list) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1794596951, i11, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
            }
            int size = list.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                C2197e.d dVar = (C2197e.d) list.get(i13);
                InterfaceC5096o interfaceC5096o = (InterfaceC5096o) dVar.a();
                int iB = dVar.b();
                int iC = dVar.c();
                a aVar = a.f9908a;
                e.a aVar2 = androidx.compose.ui.e.f26613a;
                int iA = AbstractC2410h.a(interfaceC2425mG, i12);
                Y.I iR = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425mG, aVar2);
                InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
                InterfaceC5082a interfaceC5082aA = aVar3.a();
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
                int i14 = i12;
                m2.e(interfaceC2425mB, aVar, aVar3.e());
                m2.e(interfaceC2425mB, iR, aVar3.g());
                Function2 function2B = aVar3.b();
                if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                    interfaceC2425mB.u(Integer.valueOf(iA));
                    interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                }
                m2.e(interfaceC2425mB, eVarF, aVar3.f());
                interfaceC5096o.invoke(c2197e.subSequence(iB, iC).j(), interfaceC2425mG, Integer.valueOf(i14));
                interfaceC2425mG.x();
                i13++;
                i12 = i14;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C0153b(c2197e, list, i10));
        }
    }

    public static final boolean b(C2197e c2197e) {
        return c2197e.o("androidx.compose.foundation.text.inlineContent", 0, c2197e.j().length());
    }

    public static final Pair c(C2197e c2197e, Map map) {
        if (map == null || map.isEmpty()) {
            return f9907a;
        }
        List listI = c2197e.i("androidx.compose.foundation.text.inlineContent", 0, c2197e.j().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = listI.size();
        for (int i10 = 0; i10 < size; i10++) {
            android.support.v4.media.session.b.a(map.get(((C2197e.d) listI.get(i10)).g()));
        }
        return new Pair(arrayList, arrayList2);
    }
}
