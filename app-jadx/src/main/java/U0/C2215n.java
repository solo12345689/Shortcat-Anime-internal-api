package U0;

import U0.W0;
import Ud.AbstractC2279u;
import b1.AbstractC2968a;
import d1.AbstractC4556b;
import g1.C4831k;
import g1.EnumC4829i;
import i1.AbstractC5010c;
import i1.C5009b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import r0.C6226h;
import s0.AbstractC6358h0;
import s0.C1;
import s0.InterfaceC6364j0;
import s0.InterfaceC6374m1;
import u0.AbstractC6712g;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: U0.n */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2215n {

    /* JADX INFO: renamed from: a */
    private final C2221q f18852a;

    /* JADX INFO: renamed from: b */
    private final int f18853b;

    /* JADX INFO: renamed from: c */
    private final boolean f18854c;

    /* JADX INFO: renamed from: d */
    private final float f18855d;

    /* JADX INFO: renamed from: e */
    private final float f18856e;

    /* JADX INFO: renamed from: f */
    private final int f18857f;

    /* JADX INFO: renamed from: g */
    private final List f18858g;

    /* JADX INFO: renamed from: h */
    private final List f18859h;

    public /* synthetic */ C2215n(C2221q c2221q, long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2221q, j10, i10, i11);
    }

    public static final Td.L B(InterfaceC6374m1 interfaceC6374m1, int i10, int i11, C2232w c2232w) {
        InterfaceC6374m1.n(interfaceC6374m1, c2232w.j(c2232w.e().t(c2232w.r(i10), c2232w.r(i11))), 0L, 2, null);
        return Td.L.f17438a;
    }

    public static /* synthetic */ void K(C2215n c2215n, InterfaceC6364j0 interfaceC6364j0, AbstractC6358h0 abstractC6358h0, float f10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        c2215n.J(interfaceC6364j0, abstractC6358h0, f10, (i11 & 8) != 0 ? null : c12, (i11 & 16) != 0 ? null : c4831k, (i11 & 32) != 0 ? null : abstractC6712g, (i11 & 64) != 0 ? InterfaceC6711f.f61110j0.a() : i10);
    }

    private final void L(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < e().j().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC2968a.a("offset(" + i10 + ") is out of bounds [0, " + e().length() + ')');
    }

    private final void M(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= e().j().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC2968a.a("offset(" + i10 + ") is out of bounds [0, " + e().length() + ']');
    }

    private final void N(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f18857f) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC2968a.a("lineIndex(" + i10 + ") is out of bounds [0, " + this.f18857f + ')');
    }

    public static final Td.L d(long j10, float[] fArr, kotlin.jvm.internal.L l10, kotlin.jvm.internal.K k10, C2232w c2232w) {
        long jB = X0.b(c2232w.r(c2232w.f() > W0.l(j10) ? c2232w.f() : W0.l(j10)), c2232w.r(c2232w.b() < W0.k(j10) ? c2232w.b() : W0.k(j10)));
        c2232w.e().w(jB, fArr, l10.f52257a);
        int iJ = l10.f52257a + (W0.j(jB) * 4);
        for (int i10 = l10.f52257a; i10 < iJ; i10 += 4) {
            int i11 = i10 + 1;
            float f10 = fArr[i11];
            float f11 = k10.f52256a;
            fArr[i11] = f10 + f11;
            int i12 = i10 + 3;
            fArr[i12] = fArr[i12] + f11;
        }
        l10.f52257a = iJ;
        k10.f52256a += c2232w.e().getHeight();
        return Td.L.f17438a;
    }

    private final C2197e e() {
        return this.f18852a.g();
    }

    public final InterfaceC6374m1 A(final int i10, final int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= e().j().length())) {
            AbstractC2968a.a("Start(" + i10 + ") or End(" + i11 + ") is out of range [0.." + e().j().length() + "), or start > end!");
        }
        if (i10 == i11) {
            return s0.V.a();
        }
        final InterfaceC6374m1 interfaceC6374m1A = s0.V.a();
        AbstractC2226t.f(this.f18859h, X0.b(i10, i11), new Function1() { // from class: U0.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2215n.B(interfaceC6374m1A, i10, i11, (C2232w) obj);
            }
        });
        return interfaceC6374m1A;
    }

    public final List C() {
        return this.f18858g;
    }

    public final long D(C6226h c6226h, int i10, R0 r02) {
        W0.a aVar;
        W0.a aVar2;
        int iE = AbstractC2226t.e(this.f18859h, c6226h.l());
        if (((C2232w) this.f18859h.get(iE)).a() >= c6226h.e() || iE == AbstractC2279u.o(this.f18859h)) {
            C2232w c2232w = (C2232w) this.f18859h.get(iE);
            return C2232w.l(c2232w, c2232w.e().h(c2232w.p(c6226h), i10, r02), false, 1, null);
        }
        int iE2 = AbstractC2226t.e(this.f18859h, c6226h.e());
        long jA = W0.f18785b.a();
        while (true) {
            aVar = W0.f18785b;
            if (!W0.g(jA, aVar.a()) || iE > iE2) {
                break;
            }
            C2232w c2232w2 = (C2232w) this.f18859h.get(iE);
            jA = C2232w.l(c2232w2, c2232w2.e().h(c2232w2.p(c6226h), i10, r02), false, 1, null);
            iE++;
        }
        if (W0.g(jA, aVar.a())) {
            return aVar.a();
        }
        long jA2 = aVar.a();
        while (true) {
            aVar2 = W0.f18785b;
            if (!W0.g(jA2, aVar2.a()) || iE > iE2) {
                break;
            }
            C2232w c2232w3 = (C2232w) this.f18859h.get(iE2);
            jA2 = C2232w.l(c2232w3, c2232w3.e().h(c2232w3.p(c6226h), i10, r02), false, 1, null);
            iE2--;
        }
        return W0.g(jA2, aVar2.a()) ? jA : X0.b(W0.n(jA), W0.i(jA2));
    }

    public final float E() {
        return this.f18855d;
    }

    public final long F(int i10) {
        M(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(i10 == e().length() ? AbstractC2279u.o(this.f18859h) : AbstractC2226t.b(this.f18859h, i10));
        return c2232w.k(c2232w.e().k(c2232w.r(i10)), false);
    }

    public final boolean G(int i10) {
        N(i10);
        return ((C2232w) this.f18859h.get(AbstractC2226t.d(this.f18859h, i10))).e().n(i10);
    }

    public final void H(InterfaceC6364j0 interfaceC6364j0, long j10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10) {
        interfaceC6364j0.p();
        List list = this.f18859h;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2232w c2232w = (C2232w) list.get(i11);
            c2232w.e().g(interfaceC6364j0, j10, c12, c4831k, abstractC6712g, i10);
            interfaceC6364j0.d(0.0f, c2232w.e().getHeight());
        }
        interfaceC6364j0.k();
    }

    public final void J(InterfaceC6364j0 interfaceC6364j0, AbstractC6358h0 abstractC6358h0, float f10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10) {
        AbstractC4556b.a(this, interfaceC6364j0, abstractC6358h0, f10, c12, c4831k, abstractC6712g, i10);
    }

    public final float[] c(final long j10, final float[] fArr, int i10) {
        L(W0.l(j10));
        M(W0.k(j10));
        final kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        l10.f52257a = i10;
        final kotlin.jvm.internal.K k10 = new kotlin.jvm.internal.K();
        AbstractC2226t.f(this.f18859h, j10, new Function1() { // from class: U0.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2215n.d(j10, fArr, l10, k10, (C2232w) obj);
            }
        });
        return fArr;
    }

    public final EnumC4829i f(int i10) {
        M(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(i10 == e().length() ? AbstractC2279u.o(this.f18859h) : AbstractC2226t.b(this.f18859h, i10));
        return c2232w.e().A(c2232w.r(i10));
    }

    public final C6226h g(int i10) {
        L(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(AbstractC2226t.b(this.f18859h, i10));
        return c2232w.i(c2232w.e().B(c2232w.r(i10)));
    }

    public final C6226h h(int i10) {
        M(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(i10 == e().length() ? AbstractC2279u.o(this.f18859h) : AbstractC2226t.b(this.f18859h, i10));
        return c2232w.i(c2232w.e().j(c2232w.r(i10)));
    }

    public final boolean i() {
        return this.f18854c;
    }

    public final float j() {
        if (this.f18859h.isEmpty()) {
            return 0.0f;
        }
        return ((C2232w) this.f18859h.get(0)).e().l();
    }

    public final float k() {
        return this.f18856e;
    }

    public final float l(int i10, boolean z10) {
        M(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(i10 == e().length() ? AbstractC2279u.o(this.f18859h) : AbstractC2226t.b(this.f18859h, i10));
        return c2232w.e().u(c2232w.r(i10), z10);
    }

    public final C2221q m() {
        return this.f18852a;
    }

    public final float n() {
        if (this.f18859h.isEmpty()) {
            return 0.0f;
        }
        C2232w c2232w = (C2232w) AbstractC2279u.y0(this.f18859h);
        return c2232w.o(c2232w.e().x());
    }

    public final float o(int i10) {
        N(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(AbstractC2226t.d(this.f18859h, i10));
        return c2232w.o(c2232w.e().e(c2232w.s(i10)));
    }

    public final int p() {
        return this.f18857f;
    }

    public final int q(int i10, boolean z10) {
        N(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(AbstractC2226t.d(this.f18859h, i10));
        return c2232w.m(c2232w.e().o(c2232w.s(i10), z10));
    }

    public final int r(int i10) {
        C2232w c2232w = (C2232w) this.f18859h.get(i10 >= e().length() ? AbstractC2279u.o(this.f18859h) : i10 < 0 ? 0 : AbstractC2226t.b(this.f18859h, i10));
        return c2232w.n(c2232w.e().z(c2232w.r(i10)));
    }

    public final int s(float f10) {
        C2232w c2232w = (C2232w) this.f18859h.get(AbstractC2226t.e(this.f18859h, f10));
        return c2232w.d() == 0 ? c2232w.g() : c2232w.n(c2232w.e().s(c2232w.t(f10)));
    }

    public final float t(int i10) {
        N(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(AbstractC2226t.d(this.f18859h, i10));
        return c2232w.e().v(c2232w.s(i10));
    }

    public final float u(int i10) {
        N(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(AbstractC2226t.d(this.f18859h, i10));
        return c2232w.e().p(c2232w.s(i10));
    }

    public final int v(int i10) {
        N(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(AbstractC2226t.d(this.f18859h, i10));
        return c2232w.m(c2232w.e().b(c2232w.s(i10)));
    }

    public final float w(int i10) {
        N(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(AbstractC2226t.d(this.f18859h, i10));
        return c2232w.o(c2232w.e().a(c2232w.s(i10)));
    }

    public final int x(long j10) {
        C2232w c2232w = (C2232w) this.f18859h.get(AbstractC2226t.e(this.f18859h, Float.intBitsToFloat((int) (4294967295L & j10))));
        return c2232w.d() == 0 ? c2232w.f() : c2232w.m(c2232w.e().m(c2232w.q(j10)));
    }

    public final EnumC4829i y(int i10) {
        M(i10);
        C2232w c2232w = (C2232w) this.f18859h.get(i10 == e().length() ? AbstractC2279u.o(this.f18859h) : AbstractC2226t.b(this.f18859h, i10));
        return c2232w.e().i(c2232w.r(i10));
    }

    public final List z() {
        return this.f18859h;
    }

    public /* synthetic */ C2215n(C2221q c2221q, long j10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2221q, j10, i10, z10);
    }

    private C2215n(C2221q c2221q, long j10, int i10, int i11) {
        int iK;
        this.f18852a = c2221q;
        this.f18853b = i10;
        boolean z10 = true;
        if (!(C5009b.n(j10) == 0 && C5009b.m(j10) == 0)) {
            AbstractC2968a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List listH = c2221q.h();
        int size = listH.size();
        int i12 = 0;
        float f10 = 0.0f;
        int i13 = 0;
        while (i13 < size) {
            C2234x c2234x = (C2234x) listH.get(i13);
            InterfaceC2236y interfaceC2236yB = c2234x.b();
            int iL = C5009b.l(j10);
            if (C5009b.g(j10)) {
                iK = AbstractC5874j.e(C5009b.k(j10) - A.e(f10), 0);
            } else {
                iK = C5009b.k(j10);
            }
            InterfaceC2230v interfaceC2230vD = A.d(interfaceC2236yB, AbstractC5010c.b(0, iL, 0, iK, 5, null), this.f18853b - i12, i11);
            float height = f10 + interfaceC2230vD.getHeight();
            int iC = i12 + interfaceC2230vD.c();
            arrayList.add(new C2232w(interfaceC2230vD, c2234x.c(), c2234x.a(), i12, iC, f10, height));
            if (interfaceC2230vD.r() || (iC == this.f18853b && i13 != AbstractC2279u.o(this.f18852a.h()))) {
                i12 = iC;
                f10 = height;
                break;
            } else {
                i13++;
                i12 = iC;
                f10 = height;
            }
        }
        z10 = false;
        this.f18856e = f10;
        this.f18857f = i12;
        this.f18854c = z10;
        this.f18859h = arrayList;
        this.f18855d = C5009b.l(j10);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C2232w c2232w = (C2232w) arrayList.get(i14);
            List listC = c2232w.e().C();
            ArrayList arrayList3 = new ArrayList(listC.size());
            int size3 = listC.size();
            for (int i15 = 0; i15 < size3; i15++) {
                C6226h c6226h = (C6226h) listC.get(i15);
                arrayList3.add(c6226h != null ? c2232w.i(c6226h) : null);
            }
            AbstractC2279u.D(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.f18852a.i().size()) {
            int size4 = this.f18852a.i().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = AbstractC2279u.I0(arrayList2, arrayList4);
        }
        this.f18858g = arrayList2;
    }

    private C2215n(C2221q c2221q, long j10, int i10, boolean z10) {
        this(c2221q, j10, i10, z10 ? g1.v.f47323a.b() : g1.v.f47323a.a(), (DefaultConstructorMarker) null);
    }
}
