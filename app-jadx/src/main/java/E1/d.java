package e1;

import Td.L;
import Td.r;
import U0.AbstractC2201g;
import U0.C2197e;
import U0.F;
import U0.I0;
import U0.Y0;
import Ud.AbstractC2273n;
import X0.g;
import X0.h;
import X0.l;
import X0.m;
import X0.n;
import X0.o;
import Y0.AbstractC2485u;
import Y0.H;
import Y0.I;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import f1.C4752a;
import g1.C4821a;
import g1.C4828h;
import g1.C4831k;
import g1.q;
import g1.s;
import i1.AbstractC5030w;
import i1.C5029v;
import i1.C5031x;
import i1.InterfaceC5011d;
import ie.InterfaceC5096o;
import ie.p;
import java.util.ArrayList;
import java.util.List;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.A1;
import s0.AbstractC6358h0;
import s0.AbstractC6387s0;
import s0.C1;
import s0.F1;
import u0.AbstractC6712g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void A(Spannable spannable, C4831k c4831k, int i10, int i11) {
        if (c4831k != null) {
            C4831k.a aVar = C4831k.f47287b;
            x(spannable, new n(c4831k.d(aVar.d()), c4831k.d(aVar.b())), i10, i11);
        }
    }

    public static final void B(Spannable spannable, s sVar, float f10, InterfaceC5011d interfaceC5011d) {
        if (sVar != null) {
            if ((C5029v.e(sVar.b(), AbstractC5030w.f(0)) && C5029v.e(sVar.c(), AbstractC5030w.f(0))) || C5029v.f(sVar.b()) == 0 || C5029v.f(sVar.c()) == 0) {
                return;
            }
            long jG = C5029v.g(sVar.b());
            C5031x.a aVar = C5031x.f48582b;
            float fH = 0.0f;
            float fZ0 = C5031x.g(jG, aVar.b()) ? interfaceC5011d.z0(sVar.b()) : C5031x.g(jG, aVar.a()) ? C5029v.h(sVar.b()) * f10 : 0.0f;
            long jG2 = C5029v.g(sVar.c());
            if (C5031x.g(jG2, aVar.b())) {
                fH = interfaceC5011d.z0(sVar.c());
            } else if (C5031x.g(jG2, aVar.a())) {
                fH = C5029v.h(sVar.c()) * f10;
            }
            x(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fZ0), (int) Math.ceil(fH)), 0, spannable.length());
        }
    }

    private static final MetricAffectingSpan b(long j10, InterfaceC5011d interfaceC5011d) {
        long jG = C5029v.g(j10);
        C5031x.a aVar = C5031x.f48582b;
        if (C5031x.g(jG, aVar.b())) {
            return new X0.f(interfaceC5011d.z0(j10));
        }
        if (C5031x.g(jG, aVar.a())) {
            return new X0.e(C5029v.h(j10));
        }
        return null;
    }

    public static final void c(I0 i02, List list, InterfaceC5096o interfaceC5096o) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            interfaceC5096o.invoke(g(i02, (I0) ((C2197e.d) list.get(0)).g()), Integer.valueOf(((C2197e.d) list.get(0)).h()), Integer.valueOf(((C2197e.d) list.get(0)).f()));
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        int[] iArr = new int[i10];
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C2197e.d dVar = (C2197e.d) list.get(i11);
            iArr[i11] = dVar.h();
            iArr[i11 + size] = dVar.f();
        }
        AbstractC2273n.F(iArr);
        int iW = AbstractC2273n.W(iArr);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            if (i13 != iW) {
                int size3 = list.size();
                I0 i0G = i02;
                for (int i14 = 0; i14 < size3; i14++) {
                    C2197e.d dVar2 = (C2197e.d) list.get(i14);
                    if (dVar2.h() != dVar2.f() && AbstractC2201g.j(iW, i13, dVar2.h(), dVar2.f())) {
                        i0G = g(i0G, (I0) dVar2.g());
                    }
                }
                if (i0G != null) {
                    interfaceC5096o.invoke(i0G, Integer.valueOf(iW), Integer.valueOf(i13));
                }
                iW = i13;
            }
        }
    }

    private static final boolean d(I0 i02) {
        long jG = C5029v.g(i02.o());
        C5031x.a aVar = C5031x.f48582b;
        return C5031x.g(jG, aVar.b()) || C5031x.g(C5029v.g(i02.o()), aVar.a());
    }

    private static final boolean e(Y0 y02) {
        return e.d(y02.O()) || y02.p() != null;
    }

    private static final boolean f(InterfaceC5011d interfaceC5011d) {
        return ((double) interfaceC5011d.j1()) > 1.05d;
    }

    private static final I0 g(I0 i02, I0 i03) {
        return i02 == null ? i03 : i02.x(i03);
    }

    private static final float h(long j10, float f10, InterfaceC5011d interfaceC5011d) {
        float fH;
        long jG = C5029v.g(j10);
        C5031x.a aVar = C5031x.f48582b;
        if (C5031x.g(jG, aVar.b())) {
            if (!f(interfaceC5011d)) {
                return interfaceC5011d.z0(j10);
            }
            fH = C5029v.h(j10) / C5029v.h(interfaceC5011d.d0(f10));
        } else {
            if (!C5031x.g(jG, aVar.a())) {
                return Float.NaN;
            }
            fH = C5029v.h(j10);
        }
        return fH * f10;
    }

    public static final void i(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            x(spannable, new BackgroundColorSpan(AbstractC6387s0.k(j10)), i10, i11);
        }
    }

    private static final void j(Spannable spannable, C4821a c4821a, int i10, int i11) {
        if (c4821a != null) {
            x(spannable, new X0.a(c4821a.h()), i10, i11);
        }
    }

    private static final void k(Spannable spannable, AbstractC6358h0 abstractC6358h0, float f10, int i10, int i11) {
        if (abstractC6358h0 != null) {
            if (abstractC6358h0 instanceof F1) {
                m(spannable, ((F1) abstractC6358h0).a(), i10, i11);
            } else {
                if (!(abstractC6358h0 instanceof A1)) {
                    throw new r();
                }
                x(spannable, new f1.d((A1) abstractC6358h0, f10), i10, i11);
            }
        }
    }

    public static final void l(Spannable spannable, List list, float f10, InterfaceC5011d interfaceC5011d, s sVar) {
        if (sVar != null) {
            long jG = C5029v.g(sVar.b());
            C5031x.a aVar = C5031x.f48582b;
            if (C5031x.g(jG, aVar.b())) {
                interfaceC5011d.z0(sVar.b());
            } else if (C5031x.g(jG, aVar.a())) {
                C5029v.h(sVar.b());
            }
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C2197e.d) list.get(i10)).g();
        }
    }

    public static final void m(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            x(spannable, new ForegroundColorSpan(AbstractC6387s0.k(j10)), i10, i11);
        }
    }

    private static final void n(Spannable spannable, AbstractC6712g abstractC6712g, int i10, int i11) {
        if (abstractC6712g != null) {
            x(spannable, new C4752a(abstractC6712g), i10, i11);
        }
    }

    private static final void o(final Spannable spannable, Y0 y02, List list, final p pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2197e.d dVar = (C2197e.d) list.get(i10);
            if ((dVar.g() instanceof I0) && (e.d((I0) dVar.g()) || ((I0) dVar.g()).m() != null)) {
                AbstractC5504s.f(dVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(dVar);
            }
        }
        c(e(y02) ? new I0(0L, 0L, y02.q(), y02.o(), y02.p(), y02.l(), (String) null, 0L, (C4821a) null, (q) null, (c1.e) null, 0L, (C4831k) null, (C1) null, (F) null, (AbstractC6712g) null, 65475, (DefaultConstructorMarker) null) : null, arrayList, new InterfaceC5096o() { // from class: e1.c
            @Override // ie.InterfaceC5096o
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return d.p(spannable, pVar, (I0) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L p(Spannable spannable, p pVar, I0 i02, int i10, int i11) {
        AbstractC2485u abstractC2485uI = i02.i();
        Y0.L lN = i02.n();
        if (lN == null) {
            lN = Y0.L.f22613b.g();
        }
        H hL = i02.l();
        H hC = H.c(hL != null ? hL.i() : H.f22594b.b());
        I iM = i02.m();
        spannable.setSpan(new o((Typeface) pVar.invoke(abstractC2485uI, lN, hC, I.e(iM != null ? iM.m() : I.f22598b.a()))), i10, i11, 33);
        return L.f17438a;
    }

    private static final void q(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            x(spannable, new X0.b(str), i10, i11);
        }
    }

    public static final void r(Spannable spannable, long j10, InterfaceC5011d interfaceC5011d, int i10, int i11) {
        long jG = C5029v.g(j10);
        C5031x.a aVar = C5031x.f48582b;
        if (C5031x.g(jG, aVar.b())) {
            x(spannable, new AbsoluteSizeSpan(AbstractC5466a.d(interfaceC5011d.z0(j10)), false), i10, i11);
        } else if (C5031x.g(jG, aVar.a())) {
            x(spannable, new RelativeSizeSpan(C5029v.h(j10)), i10, i11);
        }
    }

    private static final void s(Spannable spannable, q qVar, int i10, int i11) {
        if (qVar != null) {
            x(spannable, new ScaleXSpan(qVar.b()), i10, i11);
            x(spannable, new m(qVar.c()), i10, i11);
        }
    }

    public static final void t(Spannable spannable, long j10, float f10, InterfaceC5011d interfaceC5011d, C4828h c4828h) {
        float fH = h(j10, f10, interfaceC5011d);
        if (Float.isNaN(fH)) {
            return;
        }
        x(spannable, new h(fH, 0, (spannable.length() == 0 || Df.r.q1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), C4828h.d.h(c4828h.d()), C4828h.d.i(c4828h.d()), c4828h.b(), C4828h.c.f(c4828h.c(), C4828h.c.f47264b.b())), 0, spannable.length());
    }

    public static final void u(Spannable spannable, long j10, float f10, InterfaceC5011d interfaceC5011d) {
        float fH = h(j10, f10, interfaceC5011d);
        if (Float.isNaN(fH)) {
            return;
        }
        x(spannable, new g(fH), 0, spannable.length());
    }

    public static final void v(Spannable spannable, c1.e eVar, int i10, int i11) {
        if (eVar != null) {
            x(spannable, C4639a.f45776a.a(eVar), i10, i11);
        }
    }

    private static final void w(Spannable spannable, C1 c12, int i10, int i11) {
        if (c12 != null) {
            x(spannable, new l(AbstractC6387s0.k(c12.c()), Float.intBitsToFloat((int) (c12.d() >> 32)), Float.intBitsToFloat((int) (c12.d() & 4294967295L)), e.b(c12.b())), i10, i11);
        }
    }

    public static final void x(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void y(Spannable spannable, I0 i02, int i10, int i11, InterfaceC5011d interfaceC5011d) {
        j(spannable, i02.e(), i10, i11);
        m(spannable, i02.g(), i10, i11);
        k(spannable, i02.f(), i02.c(), i10, i11);
        A(spannable, i02.s(), i10, i11);
        r(spannable, i02.k(), interfaceC5011d, i10, i11);
        q(spannable, i02.j(), i10, i11);
        s(spannable, i02.u(), i10, i11);
        v(spannable, i02.p(), i10, i11);
        i(spannable, i02.d(), i10, i11);
        w(spannable, i02.r(), i10, i11);
        n(spannable, i02.h(), i10, i11);
    }

    public static final void z(Spannable spannable, Y0 y02, List list, InterfaceC5011d interfaceC5011d, p pVar) {
        MetricAffectingSpan metricAffectingSpanB;
        o(spannable, y02, list, pVar);
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C2197e.d dVar = (C2197e.d) list.get(i10);
            if (dVar.g() instanceof I0) {
                int iH = dVar.h();
                int iF = dVar.f();
                if (iH >= 0 && iH < spannable.length() && iF > iH && iF <= spannable.length()) {
                    y(spannable, (I0) dVar.g(), iH, iF, interfaceC5011d);
                    if (d((I0) dVar.g())) {
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C2197e.d dVar2 = (C2197e.d) list.get(i11);
                C2197e.a aVar = (C2197e.a) dVar2.g();
                if (aVar instanceof I0) {
                    int iH2 = dVar2.h();
                    int iF2 = dVar2.f();
                    if (iH2 >= 0 && iH2 < spannable.length() && iF2 > iH2 && iF2 <= spannable.length() && (metricAffectingSpanB = b(((I0) aVar).o(), interfaceC5011d)) != null) {
                        x(spannable, metricAffectingSpanB, iH2, iF2);
                    }
                }
            }
        }
    }
}
