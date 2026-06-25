package Pe;

import He.AbstractC1655b;
import He.EnumC1656c;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import xe.C7139c;

/* JADX INFO: renamed from: Pe.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2019d {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Pe.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final uf.i f13863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final He.E f13864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final uf.q f13865c;

        public a(uf.i iVar, He.E e10, uf.q qVar) {
            this.f13863a = iVar;
            this.f13864b = e10;
            this.f13865c = qVar;
        }

        public final He.E a() {
            return this.f13864b;
        }

        public final uf.i b() {
            return this.f13863a;
        }

        public final uf.q c() {
            return this.f13865c;
        }
    }

    private final C2027l G(C2027l c2027l, C2027l c2027l2) {
        return c2027l == null ? c2027l2 : (c2027l2 != null && ((c2027l.d() && !c2027l2.d()) || ((c2027l.d() || !c2027l2.d()) && (c2027l.c().compareTo(c2027l2.c()) < 0 || c2027l.c().compareTo(c2027l2.c()) <= 0)))) ? c2027l2 : c2027l;
    }

    private final List H(uf.i iVar) {
        return j(new a(iVar, f(iVar, r()), null), new C2018c(this, A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable I(AbstractC2019d abstractC2019d, uf.r rVar, a it) {
        uf.i iVarB;
        uf.p pVarG0;
        List listH0;
        uf.i iVarB2;
        AbstractC5504s.h(it, "it");
        if ((abstractC2019d.z() && (iVarB2 = it.b()) != null && rVar.i(iVarB2)) || (iVarB = it.b()) == null || (pVarG0 = rVar.G0(iVarB)) == null || (listH0 = rVar.h0(pVarG0)) == null) {
            return null;
        }
        List listZ0 = rVar.z0(it.b());
        Iterator it2 = listH0.iterator();
        Iterator it3 = listZ0.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC2279u.x(listH0, 10), AbstractC2279u.x(listZ0, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            uf.q qVar = (uf.q) it2.next();
            uf.i iVarM0 = rVar.m0((uf.m) it3.next());
            arrayList.add(iVarM0 == null ? new a(null, it.a(), qVar) : new a(iVarM0, abstractC2019d.f(iVarM0, it.a()), qVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2023h e(r0 r0Var, C2023h[] c2023hArr, int i10) {
        Map mapB;
        C2023h c2023h;
        return (r0Var == null || (mapB = r0Var.b()) == null || (c2023h = (C2023h) mapB.get(Integer.valueOf(i10))) == null) ? (i10 < 0 || i10 >= c2023hArr.length) ? C2023h.f13884e.a() : c2023hArr[i10] : c2023h;
    }

    private final He.E f(uf.i iVar, He.E e10) {
        return m().d(e10, n(iVar));
    }

    private final C2023h g(uf.i iVar) {
        EnumC2026k enumC2026kY;
        EnumC2026k enumC2026kY2 = y(iVar);
        EnumC2024i enumC2024i = null;
        if (enumC2026kY2 == null) {
            uf.i iVarV = v(iVar);
            enumC2026kY = iVarV != null ? y(iVarV) : null;
        } else {
            enumC2026kY = enumC2026kY2;
        }
        uf.r rVarA = A();
        C7139c c7139c = C7139c.f64375a;
        if (c7139c.l(x(rVarA.v(iVar)))) {
            enumC2024i = EnumC2024i.f13891a;
        } else if (c7139c.k(x(rVarA.G(iVar)))) {
            enumC2024i = EnumC2024i.f13892b;
        }
        return new C2023h(enumC2026kY, enumC2024i, A().w0(iVar) || F(iVar), enumC2026kY != enumC2026kY2);
    }

    private final C2023h h(a aVar) {
        Iterable iterableM;
        C2027l c2027lO;
        uf.i iVarB;
        uf.p pVarG0;
        if (aVar.b() == null) {
            uf.r rVarA = A();
            uf.q qVarC = aVar.c();
            if ((qVarC != null ? rVarA.t0(qVarC) : null) == uf.v.f61516b) {
                return C2023h.f13884e.a();
            }
        }
        boolean z10 = false;
        boolean z11 = aVar.c() == null;
        uf.i iVarB2 = aVar.b();
        if (iVarB2 == null || (iterableM = n(iVarB2)) == null) {
            iterableM = AbstractC2279u.m();
        }
        uf.r rVarA2 = A();
        uf.i iVarB3 = aVar.b();
        uf.q qVarX0 = (iVarB3 == null || (pVarG0 = rVarA2.G0(iVarB3)) == null) ? null : rVarA2.x0(pVarG0);
        boolean z12 = q() == EnumC1656c.f8551f;
        if (z11) {
            if (z12 || !u() || (iVarB = aVar.b()) == null || !B(iVarB)) {
                iterableM = AbstractC2279u.G0(p(), iterableM);
            } else {
                Iterable iterableP = p();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableP) {
                    if (!m().p(obj)) {
                        arrayList.add(obj);
                    }
                }
                iterableM = AbstractC2279u.I0(arrayList, iterableM);
            }
        }
        EnumC2024i enumC2024iG = m().g(iterableM);
        C2027l c2027lH = m().h(iterableM, new C2016a(this, aVar));
        if (c2027lH != null) {
            EnumC2026k enumC2026kC = c2027lH.c();
            if (c2027lH.c() == EnumC2026k.f13900c && qVarX0 != null) {
                z10 = true;
            }
            return new C2023h(enumC2026kC, enumC2024iG, z10, c2027lH.d());
        }
        EnumC1656c enumC1656cQ = (z11 || z12) ? q() : EnumC1656c.f8550e;
        He.E eA = aVar.a();
        He.w wVarA = eA != null ? eA.a(enumC1656cQ) : null;
        C2027l c2027lO2 = qVarX0 != null ? o(qVarX0) : null;
        C2027l c2027lT = t(c2027lO2, wVarA);
        boolean z13 = (c2027lO2 != null ? c2027lO2.c() : null) == EnumC2026k.f13900c || !(qVarX0 == null || wVarA == null || !wVarA.c());
        uf.q qVarC2 = aVar.c();
        if (qVarC2 == null || (c2027lO = o(qVarC2)) == null) {
            c2027lO = null;
        } else if (c2027lO.c() == EnumC2026k.f13899b) {
            c2027lO = C2027l.b(c2027lO, EnumC2026k.f13898a, false, 2, null);
        }
        C2027l c2027lG = G(c2027lO, c2027lT);
        EnumC2026k enumC2026kC2 = c2027lG != null ? c2027lG.c() : null;
        if (c2027lG != null && c2027lG.d()) {
            z10 = true;
        }
        return new C2023h(enumC2026kC2, enumC2024iG, z13, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(AbstractC2019d abstractC2019d, a aVar, Object extractNullability) {
        AbstractC5504s.h(extractNullability, "$this$extractNullability");
        return abstractC2019d.l(extractNullability, aVar.b());
    }

    private final List j(Object obj, Function1 function1) {
        ArrayList arrayList = new ArrayList(1);
        k(obj, arrayList, function1);
        return arrayList;
    }

    private final void k(Object obj, List list, Function1 function1) {
        list.add(obj);
        Iterable iterable = (Iterable) function1.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                k(it.next(), list, function1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Pe.C2027l o(uf.q r5) {
        /*
            r4 = this;
            uf.r r0 = r4.A()
            boolean r1 = r4.E(r5)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.util.List r5 = r0.W(r5)
            if (r5 == 0) goto L1a
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L1a
            goto Lbd
        L1a:
            java.util.Iterator r1 = r5.iterator()
        L1e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r1.next()
            uf.i r3 = (uf.i) r3
            boolean r3 = r0.K(r3)
            if (r3 != 0) goto L1e
            if (r5 == 0) goto L39
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L39
            goto L51
        L39:
            java.util.Iterator r1 = r5.iterator()
        L3d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r1.next()
            uf.i r3 = (uf.i) r3
            Pe.k r3 = r4.y(r3)
            if (r3 == 0) goto L3d
            r1 = r5
            goto L8f
        L51:
            if (r5 == 0) goto L5a
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L5a
            goto Lbd
        L5a:
            java.util.Iterator r1 = r5.iterator()
        L5e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r1.next()
            uf.i r3 = (uf.i) r3
            uf.i r3 = r4.v(r3)
            if (r3 == 0) goto L5e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r5.iterator()
        L79:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r2.next()
            uf.i r3 = (uf.i) r3
            uf.i r3 = r4.v(r3)
            if (r3 == 0) goto L79
            r1.add(r3)
            goto L79
        L8f:
            if (r1 == 0) goto L98
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L98
            goto Lb1
        L98:
            java.util.Iterator r2 = r1.iterator()
        L9c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r2.next()
            uf.i r3 = (uf.i) r3
            boolean r3 = r0.M(r3)
            if (r3 != 0) goto L9c
            Pe.k r0 = Pe.EnumC2026k.f13900c
            goto Lb3
        Lb1:
            Pe.k r0 = Pe.EnumC2026k.f13899b
        Lb3:
            Pe.l r2 = new Pe.l
            if (r1 == r5) goto Lb9
            r5 = 1
            goto Lba
        Lb9:
            r5 = 0
        Lba:
            r2.<init>(r0, r5)
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Pe.AbstractC2019d.o(uf.q):Pe.l");
    }

    private final EnumC2026k y(uf.i iVar) {
        uf.r rVarA = A();
        if (rVarA.b0(rVarA.v(iVar))) {
            return EnumC2026k.f13899b;
        }
        if (rVarA.b0(rVarA.G(iVar))) {
            return null;
        }
        return EnumC2026k.f13900c;
    }

    public abstract uf.r A();

    public abstract boolean B(uf.i iVar);

    public abstract boolean C();

    public abstract boolean D(uf.i iVar, uf.i iVar2);

    public abstract boolean E(uf.q qVar);

    public abstract boolean F(uf.i iVar);

    public final Function1 d(uf.i iVar, Iterable overrides, r0 r0Var, boolean z10) {
        int size;
        uf.i iVarB;
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(overrides, "overrides");
        List listH = H(iVar);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(overrides, 10));
        Iterator it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(H((uf.i) it.next()));
        }
        if (w()) {
            size = 1;
            break;
        }
        if (C() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
            Iterator it2 = overrides.iterator();
            while (it2.hasNext()) {
                if (!D(iVar, (uf.i) it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = listH.size();
        C2023h[] c2023hArr = new C2023h[size];
        int i10 = 0;
        while (i10 < size) {
            C2023h c2023hH = h((a) listH.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) AbstractC2279u.p0((List) it3.next(), i10);
                C2023h c2023hG = (aVar == null || (iVarB = aVar.b()) == null) ? null : g(iVarB);
                if (c2023hG != null) {
                    arrayList2.add(c2023hG);
                }
            }
            c2023hArr[i10] = t0.a(c2023hH, arrayList2, i10 == 0 && C(), i10 == 0 && s(), z10);
            i10++;
        }
        return new C2017b(r0Var, c2023hArr);
    }

    public abstract boolean l(Object obj, uf.i iVar);

    public abstract AbstractC1655b m();

    public abstract Iterable n(uf.i iVar);

    public abstract Iterable p();

    public abstract EnumC1656c q();

    public abstract He.E r();

    public abstract boolean s();

    protected abstract C2027l t(C2027l c2027l, He.w wVar);

    public abstract boolean u();

    public abstract uf.i v(uf.i iVar);

    public boolean w() {
        return false;
    }

    public abstract Xe.d x(uf.i iVar);

    public abstract boolean z();
}
