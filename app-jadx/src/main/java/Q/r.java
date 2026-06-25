package Q;

import Q.C2051k;
import Td.AbstractC2163n;
import U0.T0;
import U0.W0;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2050j f14151a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f14152b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f14153c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ w f14154d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Lazy f14155e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2050j c2050j, int i10, int i11, w wVar, Lazy lazy) {
            super(0);
            this.f14151a = c2050j;
            this.f14152b = i10;
            this.f14153c = i11;
            this.f14154d = wVar;
            this.f14155e = lazy;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final C2051k.a invoke() {
            return r.k(this.f14151a, r.m(this.f14155e), this.f14152b, this.f14153c, this.f14154d.a(), this.f14154d.e() == EnumC2045e.CROSSED);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2050j f14156a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f14157b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2050j c2050j, int i10) {
            super(0);
            this.f14156a = c2050j;
            this.f14157b = i10;
        }

        @Override // ie.InterfaceC5082a
        public final Integer invoke() {
            return Integer.valueOf(this.f14156a.k().q(this.f14157b));
        }
    }

    public static final C2051k e(w wVar, InterfaceC2043c interfaceC2043c) {
        boolean z10 = wVar.e() == EnumC2045e.CROSSED;
        return new C2051k(f(wVar.j(), z10, true, wVar.k(), interfaceC2043c), f(wVar.i(), z10, false, wVar.d(), interfaceC2043c), z10);
    }

    private static final C2051k.a f(C2050j c2050j, boolean z10, boolean z11, int i10, InterfaceC2043c interfaceC2043c) {
        int iG = z11 ? c2050j.g() : c2050j.e();
        if (i10 != c2050j.i()) {
            return c2050j.a(iG);
        }
        long jA = interfaceC2043c.a(c2050j, iG);
        return c2050j.a(z10 ^ z11 ? W0.n(jA) : W0.i(jA));
    }

    private static final C2051k.a g(C2051k.a aVar, C2050j c2050j, int i10) {
        return C2051k.a.b(aVar, c2050j.k().c(i10), i10, 0L, 4, null);
    }

    public static final C2051k h(C2051k c2051k, w wVar) {
        if (x.d(c2051k, wVar)) {
            return (wVar.getSize() > 1 || wVar.h() == null || wVar.b().c().length() == 0) ? c2051k : i(c2051k, wVar);
        }
        return c2051k;
    }

    private static final C2051k i(C2051k c2051k, w wVar) {
        C2050j c2050jB = wVar.b();
        String strC = c2050jB.c();
        int iG = c2050jB.g();
        int length = strC.length();
        if (iG == 0) {
            int iA = K.D.a(strC, 0);
            return wVar.a() ? C2051k.b(c2051k, g(c2051k.e(), c2050jB, iA), null, true, 2, null) : C2051k.b(c2051k, null, g(c2051k.c(), c2050jB, iA), false, 1, null);
        }
        if (iG == length) {
            int iB = K.D.b(strC, length);
            return wVar.a() ? C2051k.b(c2051k, g(c2051k.e(), c2050jB, iB), null, false, 2, null) : C2051k.b(c2051k, null, g(c2051k.c(), c2050jB, iB), true, 1, null);
        }
        C2051k c2051kH = wVar.h();
        boolean z10 = c2051kH != null && c2051kH.d();
        int iB2 = wVar.a() ^ z10 ? K.D.b(strC, iG) : K.D.a(strC, iG);
        return wVar.a() ? C2051k.b(c2051k, g(c2051k.e(), c2050jB, iB2), null, z10, 2, null) : C2051k.b(c2051k, null, g(c2051k.c(), c2050jB, iB2), z10, 1, null);
    }

    private static final boolean j(C2050j c2050j, int i10, boolean z10) {
        if (c2050j.f() == -1) {
            return true;
        }
        if (i10 == c2050j.f()) {
            return false;
        }
        return z10 ^ (c2050j.d() == EnumC2045e.CROSSED) ? i10 < c2050j.f() : i10 > c2050j.f();
    }

    public static final C2051k.a k(C2050j c2050j, int i10, int i11, int i12, boolean z10, boolean z11) {
        long jC = c2050j.k().C(i11);
        int iN = c2050j.k().q(W0.n(jC)) == i10 ? W0.n(jC) : i10 >= c2050j.k().n() ? c2050j.k().u(c2050j.k().n() - 1) : c2050j.k().u(i10);
        int i13 = c2050j.k().q(W0.i(jC)) == i10 ? W0.i(jC) : i10 >= c2050j.k().n() ? T0.p(c2050j.k(), c2050j.k().n() - 1, false, 2, null) : T0.p(c2050j.k(), i10, false, 2, null);
        if (iN == i12) {
            return c2050j.a(i13);
        }
        if (i13 == i12) {
            return c2050j.a(iN);
        }
        if (!(z10 ^ z11) ? i11 >= iN : i11 > i13) {
            iN = i13;
        }
        return c2050j.a(iN);
    }

    public static final C2051k.a l(w wVar, C2050j c2050j, C2051k.a aVar) {
        int iG = wVar.a() ? c2050j.g() : c2050j.e();
        if ((wVar.a() ? wVar.k() : wVar.d()) != c2050j.i()) {
            return c2050j.a(iG);
        }
        Td.q qVar = Td.q.f17463c;
        Lazy lazyA = AbstractC2163n.a(qVar, new b(c2050j, iG));
        Lazy lazyA2 = AbstractC2163n.a(qVar, new a(c2050j, iG, wVar.a() ? c2050j.e() : c2050j.g(), wVar, lazyA));
        if (c2050j.h() != aVar.d()) {
            return n(lazyA2);
        }
        int iF = c2050j.f();
        if (iG == iF) {
            return aVar;
        }
        if (m(lazyA) != c2050j.k().q(iF)) {
            return n(lazyA2);
        }
        int iC = aVar.c();
        long jC = c2050j.k().C(iC);
        return !j(c2050j, iG, wVar.a()) ? c2050j.a(iG) : (iC == W0.n(jC) || iC == W0.i(jC)) ? n(lazyA2) : c2050j.a(iG);
    }

    public static final int m(Lazy lazy) {
        return ((Number) lazy.getValue()).intValue();
    }

    private static final C2051k.a n(Lazy lazy) {
        return (C2051k.a) lazy.getValue();
    }
}
