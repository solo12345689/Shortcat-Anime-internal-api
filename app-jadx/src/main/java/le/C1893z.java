package Le;

import Af.k;
import Be.C1114i;
import Be.C1122q;
import He.C1659f;
import He.C1662i;
import He.C1666m;
import He.InterfaceC1673u;
import He.U;
import Ie.o;
import Le.U;
import Pe.m0;
import Ud.AbstractC2279u;
import bf.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C5380d;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC5691w;
import oe.AbstractC5874j;
import pf.InterfaceC6043h;
import pf.InterfaceC6044i;
import qf.I0;
import qf.J0;
import rf.InterfaceC6315e;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.InterfaceC7223a;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7234l;
import ye.InterfaceC7247z;
import ye.g0;
import ye.t0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Le.z */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1893z extends U {

    /* JADX INFO: renamed from: n */
    private final InterfaceC7227e f11537n;

    /* JADX INFO: renamed from: o */
    private final Oe.g f11538o;

    /* JADX INFO: renamed from: p */
    private final boolean f11539p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC6044i f11540q;

    /* JADX INFO: renamed from: r */
    private final InterfaceC6044i f11541r;

    /* JADX INFO: renamed from: s */
    private final InterfaceC6044i f11542s;

    /* JADX INFO: renamed from: t */
    private final InterfaceC6044i f11543t;

    /* JADX INFO: renamed from: u */
    private final InterfaceC6043h f11544u;

    /* JADX INFO: renamed from: Le.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function1 {
        a(Object obj) {
            super(1, obj, C1893z.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final Collection invoke(Xe.f p02) {
            AbstractC5504s.h(p02, "p0");
            return ((C1893z) this.receiver).q1(p02);
        }
    }

    /* JADX INFO: renamed from: Le.z$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class b extends AbstractC5502p implements Function1 {
        b(Object obj) {
            super(1, obj, C1893z.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j */
        public final Collection invoke(Xe.f p02) {
            AbstractC5504s.h(p02, "p0");
            return ((C1893z) this.receiver).r1(p02);
        }
    }

    public /* synthetic */ C1893z(Ke.k kVar, InterfaceC7227e interfaceC7227e, Oe.g gVar, boolean z10, C1893z c1893z, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC7227e, gVar, z10, (i10 & 16) != 0 ? null : c1893z);
    }

    public static final Collection A0(C1893z c1893z, Xe.f it) {
        AbstractC5504s.h(it, "it");
        return c1893z.q1(it);
    }

    public static final Collection B0(C1893z c1893z, Xe.f it) {
        AbstractC5504s.h(it, "it");
        return c1893z.r1(it);
    }

    private final Collection C0() {
        if (!this.f11539p) {
            return L().a().k().d().g(R());
        }
        Collection collectionK = R().l().k();
        AbstractC5504s.g(collectionK, "getSupertypes(...)");
        return collectionK;
    }

    public static final List D0(C1893z c1893z, Ke.k kVar) {
        Collection collectionI = c1893z.f11538o.i();
        ArrayList arrayList = new ArrayList(collectionI.size());
        Iterator it = collectionI.iterator();
        while (it.hasNext()) {
            arrayList.add(c1893z.o1((Oe.k) it.next()));
        }
        if (c1893z.f11538o.q()) {
            InterfaceC7226d interfaceC7226dG0 = c1893z.G0();
            String strC = Qe.C.c(interfaceC7226dG0, false, false, 2, null);
            if (arrayList.isEmpty()) {
                arrayList.add(interfaceC7226dG0);
                kVar.a().h().c(c1893z.f11538o, interfaceC7226dG0);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (AbstractC5504s.c(Qe.C.c((InterfaceC7226d) it2.next(), false, false, 2, null), strC)) {
                        break;
                    }
                }
                arrayList.add(interfaceC7226dG0);
                kVar.a().h().c(c1893z.f11538o, interfaceC7226dG0);
            }
        }
        kVar.a().w().a(c1893z.R(), arrayList, kVar);
        m0 m0VarR = kVar.a().r();
        boolean zIsEmpty = arrayList.isEmpty();
        List listQ = arrayList;
        if (zIsEmpty) {
            listQ = AbstractC2279u.q(c1893z.F0());
        }
        return AbstractC2279u.b1(m0VarR.p(kVar, listQ));
    }

    private final List E0(C1114i c1114i) {
        C1114i c1114i2;
        Pair pair;
        Collection collectionB = this.f11538o.B();
        ArrayList arrayList = new ArrayList(collectionB.size());
        Me.a aVarB = Me.b.b(I0.f57982b, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionB) {
            if (AbstractC5504s.c(((Oe.r) obj).getName(), He.I.f8446c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.getFirst();
        List<Oe.r> list2 = (List) pair2.getSecond();
        list.size();
        Oe.r rVar = (Oe.r) AbstractC2279u.o0(list);
        if (rVar != null) {
            Oe.x returnType = rVar.getReturnType();
            if (returnType instanceof Oe.f) {
                Oe.f fVar = (Oe.f) returnType;
                pair = new Pair(L().g().l(fVar, aVarB, true), L().g().p(fVar.n(), aVarB));
            } else {
                pair = new Pair(L().g().p(returnType, aVarB), null);
            }
            qf.S s10 = (qf.S) pair.getFirst();
            qf.S s11 = (qf.S) pair.getSecond();
            c1114i2 = c1114i;
            s0(arrayList, c1114i2, 0, rVar, s10, s11);
        } else {
            c1114i2 = c1114i;
        }
        int i10 = 0;
        int i11 = rVar == null ? 0 : 1;
        for (Oe.r rVar2 : list2) {
            s0(arrayList, c1114i2, i10 + i11, rVar2, L().g().p(rVar2.getReturnType(), aVarB), null);
            i10++;
        }
        return arrayList;
    }

    private final InterfaceC7226d F0() {
        boolean zO = this.f11538o.o();
        if ((this.f11538o.J() || !this.f11538o.r()) && !zO) {
            return null;
        }
        InterfaceC7227e interfaceC7227eR = R();
        Je.b bVarT1 = Je.b.t1(interfaceC7227eR, InterfaceC7374h.f66223k0.b(), true, L().a().t().a(this.f11538o));
        AbstractC5504s.g(bVarT1, "createJavaConstructor(...)");
        List listE0 = zO ? E0(bVarT1) : Collections.EMPTY_LIST;
        bVarT1.Z0(false);
        bVarT1.q1(listE0, Z0(interfaceC7227eR));
        bVarT1.Y0(true);
        bVarT1.g1(interfaceC7227eR.p());
        L().a().h().c(this.f11538o, bVarT1);
        return bVarT1;
    }

    private final InterfaceC7226d G0() {
        InterfaceC7227e interfaceC7227eR = R();
        Je.b bVarT1 = Je.b.t1(interfaceC7227eR, InterfaceC7374h.f66223k0.b(), true, L().a().t().a(this.f11538o));
        AbstractC5504s.g(bVarT1, "createJavaConstructor(...)");
        List listM0 = M0(bVarT1);
        bVarT1.Z0(false);
        bVarT1.q1(listM0, Z0(interfaceC7227eR));
        bVarT1.Y0(false);
        bVarT1.g1(interfaceC7227eR.p());
        return bVarT1;
    }

    private final g0 H0(g0 g0Var, InterfaceC7223a interfaceC7223a, Collection collection) {
        Collection<g0> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return g0Var;
        }
        for (g0 g0Var2 : collection2) {
            if (!AbstractC5504s.c(g0Var, g0Var2) && g0Var2.t0() == null && Q0(g0Var2, interfaceC7223a)) {
                InterfaceC7247z interfaceC7247zBuild = g0Var.v().k().build();
                AbstractC5504s.e(interfaceC7247zBuild);
                return (g0) interfaceC7247zBuild;
            }
        }
        return g0Var;
    }

    private final g0 I0(InterfaceC7247z interfaceC7247z, Function1 function1) {
        Object next;
        Xe.f name = interfaceC7247z.getName();
        AbstractC5504s.g(name, "getName(...)");
        Iterator it = ((Iterable) function1.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e1((g0) next, interfaceC7247z)) {
                break;
            }
        }
        g0 g0Var = (g0) next;
        if (g0Var == null) {
            return null;
        }
        InterfaceC7247z.a aVarV = g0Var.v();
        List listJ = interfaceC7247z.j();
        AbstractC5504s.g(listJ, "getValueParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listJ, 10));
        Iterator it2 = listJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(((t0) it2.next()).getType());
        }
        List listJ2 = g0Var.j();
        AbstractC5504s.g(listJ2, "getValueParameters(...)");
        aVarV.b(Je.h.a(arrayList, listJ2, interfaceC7247z));
        aVarV.t();
        aVarV.l();
        aVarV.d(Je.e.f9500H, Boolean.TRUE);
        return (g0) aVarV.build();
    }

    private final Je.f J0(ye.Z z10, Function1 function1) {
        g0 g0VarX0;
        Be.M m10 = null;
        if (!P0(z10, function1)) {
            return null;
        }
        g0 g0VarW0 = W0(z10, function1);
        AbstractC5504s.e(g0VarW0);
        if (z10.N()) {
            g0VarX0 = X0(z10, function1);
            AbstractC5504s.e(g0VarX0);
        } else {
            g0VarX0 = null;
        }
        if (g0VarX0 != null) {
            g0VarX0.r();
            g0VarW0.r();
        }
        Je.d dVar = new Je.d(R(), g0VarW0, g0VarX0, z10);
        qf.S returnType = g0VarW0.getReturnType();
        AbstractC5504s.e(returnType);
        dVar.b1(returnType, AbstractC2279u.m(), O(), null, AbstractC2279u.m());
        Be.L lK = bf.h.k(dVar, g0VarW0.getAnnotations(), false, false, false, g0VarW0.k());
        lK.M0(g0VarW0);
        lK.P0(dVar.getType());
        AbstractC5504s.g(lK, "apply(...)");
        if (g0VarX0 != null) {
            List listJ = g0VarX0.j();
            AbstractC5504s.g(listJ, "getValueParameters(...)");
            t0 t0Var = (t0) AbstractC2279u.o0(listJ);
            if (t0Var == null) {
                throw new AssertionError("No parameter found for " + g0VarX0);
            }
            m10 = bf.h.m(dVar, g0VarX0.getAnnotations(), t0Var.getAnnotations(), false, false, false, g0VarX0.getVisibility(), g0VarX0.k());
            m10.M0(g0VarX0);
        }
        dVar.U0(lK, m10);
        return dVar;
    }

    private final Je.f K0(Oe.r rVar, qf.S s10, ye.E e10) {
        Je.f fVar;
        C1893z c1893z;
        qf.S sA;
        Je.f fVarF1 = Je.f.f1(R(), Ke.h.a(L(), rVar), e10, He.V.d(rVar.getVisibility()), false, rVar.getName(), L().a().t().a(rVar), false);
        AbstractC5504s.g(fVarF1, "create(...)");
        Be.L lD = bf.h.d(fVarF1, InterfaceC7374h.f66223k0.b());
        AbstractC5504s.g(lD, "createDefaultGetter(...)");
        fVarF1.U0(lD, null);
        if (s10 == null) {
            Ke.k kVarI = Ke.c.i(L(), fVarF1, rVar, 0, 4, null);
            fVar = fVarF1;
            c1893z = this;
            sA = c1893z.A(rVar, kVarI);
        } else {
            fVar = fVarF1;
            c1893z = this;
            sA = s10;
        }
        fVar.b1(sA, AbstractC2279u.m(), c1893z.O(), null, AbstractC2279u.m());
        lD.P0(sA);
        return fVar;
    }

    static /* synthetic */ Je.f L0(C1893z c1893z, Oe.r rVar, qf.S s10, ye.E e10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            s10 = null;
        }
        return c1893z.K0(rVar, s10, e10);
    }

    private final List M0(C1114i c1114i) {
        Collection collectionM = this.f11538o.m();
        ArrayList arrayList = new ArrayList(collectionM.size());
        Me.a aVarB = Me.b.b(I0.f57982b, false, false, null, 6, null);
        Iterator it = collectionM.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return arrayList;
            }
            i10 = i11 + 1;
            Oe.w wVar = (Oe.w) it.next();
            qf.S sP = L().g().p(wVar.getType(), aVarB);
            arrayList.add(new Be.V(c1114i, null, i11, InterfaceC7374h.f66223k0.b(), wVar.getName(), sP, false, false, false, wVar.a() ? L().a().m().n().k(sP) : null, L().a().t().a(wVar)));
        }
    }

    private final g0 N0(g0 g0Var, Xe.f fVar) {
        InterfaceC7247z.a aVarV = g0Var.v();
        aVarV.j(fVar);
        aVarV.t();
        aVarV.l();
        InterfaceC7247z interfaceC7247zBuild = aVarV.build();
        AbstractC5504s.e(interfaceC7247zBuild);
        return (g0) interfaceC7247zBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final ye.g0 O0(ye.g0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.j()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
            java.lang.Object r0 = Ud.AbstractC2279u.A0(r0)
            ye.t0 r0 = (ye.t0) r0
            r2 = 0
            if (r0 == 0) goto L7d
            qf.S r3 = r0.getType()
            qf.v0 r3 = r3.N0()
            ye.h r3 = r3.p()
            if (r3 == 0) goto L35
            Xe.d r3 = ff.e.p(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            Xe.c r3 = r3.m()
            goto L36
        L35:
            r3 = r2
        L36:
            Xe.c r4 = ve.o.f62178v
            boolean r3 = kotlin.jvm.internal.AbstractC5504s.c(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7d
        L43:
            ye.z$a r2 = r6.v()
            java.util.List r6 = r6.j()
            kotlin.jvm.internal.AbstractC5504s.g(r6, r1)
            r1 = 1
            java.util.List r6 = Ud.AbstractC2279u.h0(r6, r1)
            ye.z$a r6 = r2.b(r6)
            qf.S r0 = r0.getType()
            java.util.List r0 = r0.L0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            qf.B0 r0 = (qf.B0) r0
            qf.S r0 = r0.getType()
            ye.z$a r6 = r6.o(r0)
            ye.z r6 = r6.build()
            ye.g0 r6 = (ye.g0) r6
            r0 = r6
            Be.O r0 = (Be.O) r0
            if (r0 == 0) goto L7c
            r0.h1(r1)
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Le.C1893z.O0(ye.g0):ye.g0");
    }

    private final boolean P0(ye.Z z10, Function1 function1) {
        if (AbstractC1872d.a(z10)) {
            return false;
        }
        g0 g0VarW0 = W0(z10, function1);
        g0 g0VarX0 = X0(z10, function1);
        if (g0VarW0 == null) {
            return false;
        }
        if (z10.N()) {
            return g0VarX0 != null && g0VarX0.r() == g0VarW0.r();
        }
        return true;
    }

    private final boolean Q0(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2) {
        o.i.a aVarC = bf.o.f33312f.F(interfaceC7223a2, interfaceC7223a, true).c();
        AbstractC5504s.g(aVarC, "getResult(...)");
        return aVarC == o.i.a.OVERRIDABLE && !He.z.f8591a.a(interfaceC7223a2, interfaceC7223a);
    }

    private final boolean R0(g0 g0Var) {
        U.a aVar = He.U.f8509a;
        Xe.f name = g0Var.getName();
        AbstractC5504s.g(name, "getName(...)");
        Xe.f fVarB = aVar.b(name);
        if (fVarB == null) {
            return false;
        }
        Set setB1 = b1(fVarB);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            if (He.T.d((g0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        g0 g0VarN0 = N0(g0Var, fVarB);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (S0((g0) it.next(), g0VarN0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean S0(g0 g0Var, InterfaceC7247z interfaceC7247z) {
        if (C1659f.f8557o.m(g0Var)) {
            interfaceC7247z = interfaceC7247z.a();
        }
        AbstractC5504s.e(interfaceC7247z);
        return Q0(interfaceC7247z, g0Var);
    }

    private final boolean T0(g0 g0Var) {
        g0 g0VarO0 = O0(g0Var);
        if (g0VarO0 == null) {
            return false;
        }
        Xe.f name = g0Var.getName();
        AbstractC5504s.g(name, "getName(...)");
        Set<g0> setB1 = b1(name);
        if ((setB1 instanceof Collection) && setB1.isEmpty()) {
            return false;
        }
        for (g0 g0Var2 : setB1) {
            if (g0Var2.isSuspend() && Q0(g0VarO0, g0Var2)) {
                return true;
            }
        }
        return false;
    }

    public static final Map U0(C1893z c1893z) {
        Collection collectionX = c1893z.f11538o.x();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionX) {
            if (((Oe.n) obj).I()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(Ud.S.e(AbstractC2279u.x(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((Oe.n) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    private final g0 V0(ye.Z z10, String str, Function1 function1) {
        g0 g0Var;
        Xe.f fVarM = Xe.f.m(str);
        AbstractC5504s.g(fVarM, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(fVarM)).iterator();
        do {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if (g0Var2.j().size() == 0) {
                InterfaceC6315e interfaceC6315e = InterfaceC6315e.f58773a;
                qf.S returnType = g0Var2.getReturnType();
                if (returnType == null ? false : interfaceC6315e.a(returnType, z10.getType())) {
                    g0Var = g0Var2;
                }
            }
        } while (g0Var == null);
        return g0Var;
    }

    private final g0 W0(ye.Z z10, Function1 function1) {
        ye.a0 a0VarD = z10.d();
        ye.a0 a0Var = a0VarD != null ? (ye.a0) He.T.g(a0VarD) : null;
        String strB = a0Var != null ? C1666m.f8568a.b(a0Var) : null;
        if (strB != null && !He.T.l(R(), a0Var)) {
            return V0(z10, strB, function1);
        }
        String strB2 = z10.getName().b();
        AbstractC5504s.g(strB2, "asString(...)");
        return V0(z10, He.H.b(strB2), function1);
    }

    private final g0 X0(ye.Z z10, Function1 function1) {
        g0 g0Var;
        qf.S returnType;
        String strB = z10.getName().b();
        AbstractC5504s.g(strB, "asString(...)");
        Xe.f fVarM = Xe.f.m(He.H.e(strB));
        AbstractC5504s.g(fVarM, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(fVarM)).iterator();
        do {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if (g0Var2.j().size() == 1 && (returnType = g0Var2.getReturnType()) != null && ve.i.D0(returnType)) {
                InterfaceC6315e interfaceC6315e = InterfaceC6315e.f58773a;
                List listJ = g0Var2.j();
                AbstractC5504s.g(listJ, "getValueParameters(...)");
                if (interfaceC6315e.c(((t0) AbstractC2279u.M0(listJ)).getType(), z10.getType())) {
                    g0Var = g0Var2;
                }
            }
        } while (g0Var == null);
        return g0Var;
    }

    public static final Set Y0(Ke.k kVar, C1893z c1893z) {
        return AbstractC2279u.f1(kVar.a().w().g(c1893z.R(), kVar));
    }

    private final AbstractC7242u Z0(InterfaceC7227e interfaceC7227e) {
        AbstractC7242u visibility = interfaceC7227e.getVisibility();
        AbstractC5504s.g(visibility, "getVisibility(...)");
        if (!AbstractC5504s.c(visibility, He.y.f8588b)) {
            return visibility;
        }
        AbstractC7242u PROTECTED_AND_PACKAGE = He.y.f8589c;
        AbstractC5504s.g(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    private final Set b1(Xe.f fVar) {
        Collection collectionC0 = C0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(linkedHashSet, ((qf.S) it.next()).o().c(fVar, Ge.d.f7469o));
        }
        return linkedHashSet;
    }

    private final Set d1(Xe.f fVar) {
        Collection collectionC0 = C0();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            Collection collectionA = ((qf.S) it.next()).o().a(fVar, Ge.d.f7469o);
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(collectionA, 10));
            Iterator it2 = collectionA.iterator();
            while (it2.hasNext()) {
                arrayList2.add((ye.Z) it2.next());
            }
            AbstractC2279u.D(arrayList, arrayList2);
        }
        return AbstractC2279u.f1(arrayList);
    }

    private final boolean e1(g0 g0Var, InterfaceC7247z interfaceC7247z) {
        String strC = Qe.C.c(g0Var, false, false, 2, null);
        InterfaceC7247z interfaceC7247zA = interfaceC7247z.a();
        AbstractC5504s.g(interfaceC7247zA, "getOriginal(...)");
        return AbstractC5504s.c(strC, Qe.C.c(interfaceC7247zA, false, false, 2, null)) && !Q0(g0Var, interfaceC7247z);
    }

    private final boolean f1(g0 g0Var) {
        Xe.f name = g0Var.getName();
        AbstractC5504s.g(name, "getName(...)");
        List listA = He.N.a(name);
        if (listA == null || !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                Set<ye.Z> setD1 = d1((Xe.f) it.next());
                if (!(setD1 instanceof Collection) || !setD1.isEmpty()) {
                    for (ye.Z z10 : setD1) {
                        if (P0(z10, new C1889v(g0Var, this))) {
                            if (!z10.N()) {
                                String strB = g0Var.getName().b();
                                AbstractC5504s.g(strB, "asString(...)");
                                if (!He.H.d(strB)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (R0(g0Var) || s1(g0Var) || T0(g0Var)) ? false : true;
    }

    public static final Collection g1(g0 g0Var, C1893z c1893z, Xe.f accessorName) {
        AbstractC5504s.h(accessorName, "accessorName");
        return AbstractC5504s.c(g0Var.getName(), accessorName) ? AbstractC2279u.e(g0Var) : AbstractC2279u.I0(c1893z.q1(accessorName), c1893z.r1(accessorName));
    }

    public static final Set h1(C1893z c1893z) {
        return AbstractC2279u.f1(c1893z.f11538o.A());
    }

    public static final InterfaceC7227e i1(C1893z c1893z, Ke.k kVar, Xe.f name) {
        AbstractC5504s.h(name, "name");
        if (((Set) c1893z.f11541r.invoke()).contains(name)) {
            InterfaceC1673u interfaceC1673uD = kVar.a().d();
            Xe.b bVarN = ff.e.n(c1893z.R());
            AbstractC5504s.e(bVarN);
            Oe.g gVarB = interfaceC1673uD.b(new InterfaceC1673u.a(bVarN.d(name), null, c1893z.f11538o, 2, null));
            if (gVarB == null) {
                return null;
            }
            C1882n c1882n = new C1882n(kVar, c1893z.R(), gVarB, null, 8, null);
            kVar.a().e().a(c1882n);
            return c1882n;
        }
        if (!((Set) c1893z.f11542s.invoke()).contains(name)) {
            Oe.n nVar = (Oe.n) ((Map) c1893z.f11543t.invoke()).get(name);
            if (nVar == null) {
                return null;
            }
            return C1122q.L0(kVar.e(), c1893z.R(), name, kVar.e().c(new C1892y(c1893z)), Ke.h.a(kVar, nVar), kVar.a().t().a(nVar));
        }
        List listC = AbstractC2279u.c();
        kVar.a().w().d(c1893z.R(), name, listC, kVar);
        List listA = AbstractC2279u.a(listC);
        int size = listA.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (InterfaceC7227e) AbstractC2279u.M0(listA);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
    }

    public static final Set j1(C1893z c1893z) {
        return Ud.a0.l(c1893z.b(), c1893z.d());
    }

    private final g0 k1(g0 g0Var, Function1 function1, Collection collection) {
        g0 g0VarI0;
        InterfaceC7247z interfaceC7247zL = C1662i.l(g0Var);
        if (interfaceC7247zL != null && (g0VarI0 = I0(interfaceC7247zL, function1)) != null) {
            if (!f1(g0VarI0)) {
                g0VarI0 = null;
            }
            if (g0VarI0 != null) {
                return H0(g0VarI0, interfaceC7247zL, collection);
            }
        }
        return null;
    }

    private final g0 l1(g0 g0Var, Function1 function1, Xe.f fVar, Collection collection) {
        g0 g0Var2 = (g0) He.T.g(g0Var);
        if (g0Var2 == null) {
            return null;
        }
        String strE = He.T.e(g0Var2);
        AbstractC5504s.e(strE);
        Xe.f fVarM = Xe.f.m(strE);
        AbstractC5504s.g(fVarM, "identifier(...)");
        Iterator it = ((Collection) function1.invoke(fVarM)).iterator();
        while (it.hasNext()) {
            g0 g0VarN0 = N0((g0) it.next(), fVar);
            if (S0(g0Var2, g0VarN0)) {
                return H0(g0VarN0, g0Var2, collection);
            }
        }
        return null;
    }

    private final g0 m1(g0 g0Var, Function1 function1) {
        if (!g0Var.isSuspend()) {
            return null;
        }
        Xe.f name = g0Var.getName();
        AbstractC5504s.g(name, "getName(...)");
        Iterator it = ((Iterable) function1.invoke(name)).iterator();
        while (it.hasNext()) {
            g0 g0VarO0 = O0((g0) it.next());
            if (g0VarO0 == null || !Q0(g0VarO0, g0Var)) {
                g0VarO0 = null;
            }
            if (g0VarO0 != null) {
                return g0VarO0;
            }
        }
        return null;
    }

    private final Je.b o1(Oe.k kVar) {
        InterfaceC7227e interfaceC7227eR = R();
        Je.b bVarT1 = Je.b.t1(interfaceC7227eR, Ke.h.a(L(), kVar), false, L().a().t().a(kVar));
        AbstractC5504s.g(bVarT1, "createJavaConstructor(...)");
        Ke.k kVarH = Ke.c.h(L(), bVarT1, kVar, interfaceC7227eR.q().size());
        U.b bVarD0 = d0(kVarH, bVarT1, kVar.j());
        List listQ = interfaceC7227eR.q();
        AbstractC5504s.g(listQ, "getDeclaredTypeParameters(...)");
        List typeParameters = kVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            ye.m0 m0VarA = kVarH.f().a((Oe.y) it.next());
            AbstractC5504s.e(m0VarA);
            arrayList.add(m0VarA);
        }
        bVarT1.r1(bVarD0.a(), He.V.d(kVar.getVisibility()), AbstractC2279u.I0(listQ, arrayList));
        bVarT1.Y0(false);
        bVarT1.Z0(bVarD0.b());
        bVarT1.g1(interfaceC7227eR.p());
        kVarH.a().h().c(kVar, bVarT1);
        return bVarT1;
    }

    private final Je.e p1(Oe.w wVar) {
        Je.e eVarP1 = Je.e.p1(R(), Ke.h.a(L(), wVar), wVar.getName(), L().a().t().a(wVar), true);
        AbstractC5504s.g(eVarP1, "createJavaMethod(...)");
        eVarP1.o1(null, O(), AbstractC2279u.m(), AbstractC2279u.m(), AbstractC2279u.m(), L().g().p(wVar.getType(), Me.b.b(I0.f57982b, false, false, null, 6, null)), ye.E.f65059a.a(false, false, true), AbstractC7241t.f65124e, null);
        eVarP1.s1(false, false);
        L().a().h().a(wVar, eVarP1);
        return eVarP1;
    }

    public final Collection q1(Xe.f fVar) {
        Collection collectionC = ((InterfaceC1871c) N().invoke()).c(fVar);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionC, 10));
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(Z((Oe.r) it.next()));
        }
        return arrayList;
    }

    public final Collection r1(Xe.f fVar) {
        Set setB1 = b1(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            g0 g0Var = (g0) obj;
            if (!He.T.d(g0Var) && C1662i.l(g0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void s0(List list, InterfaceC7234l interfaceC7234l, int i10, Oe.r rVar, qf.S s10, qf.S s11) {
        InterfaceC7374h interfaceC7374hB = InterfaceC7374h.f66223k0.b();
        Xe.f name = rVar.getName();
        qf.S sN = J0.n(s10);
        AbstractC5504s.g(sN, "makeNotNullable(...)");
        list.add(new Be.V(interfaceC7234l, null, i10, interfaceC7374hB, name, sN, rVar.M(), false, false, s11 != null ? J0.n(s11) : null, L().a().t().a(rVar)));
    }

    private final boolean s1(g0 g0Var) {
        C1662i c1662i = C1662i.f8560o;
        Xe.f name = g0Var.getName();
        AbstractC5504s.g(name, "getName(...)");
        if (!c1662i.n(name)) {
            return false;
        }
        Xe.f name2 = g0Var.getName();
        AbstractC5504s.g(name2, "getName(...)");
        Set setB1 = b1(name2);
        ArrayList arrayList = new ArrayList();
        Iterator it = setB1.iterator();
        while (it.hasNext()) {
            InterfaceC7247z interfaceC7247zL = C1662i.l((g0) it.next());
            if (interfaceC7247zL != null) {
                arrayList.add(interfaceC7247zL);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (e1(g0Var, (InterfaceC7247z) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void t0(Collection collection, Xe.f fVar, Collection collection2, boolean z10) {
        Collection collectionD = Ie.a.d(fVar, collection2, collection, R(), L().a().c(), L().a().k().b());
        AbstractC5504s.g(collectionD, "resolveOverridesForNonStaticMembers(...)");
        if (!z10) {
            collection.addAll(collectionD);
            return;
        }
        Collection<g0> collection3 = collectionD;
        List listI0 = AbstractC2279u.I0(collection, collection3);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection3, 10));
        for (g0 g0VarH0 : collection3) {
            g0 g0Var = (g0) He.T.j(g0VarH0);
            if (g0Var == null) {
                AbstractC5504s.e(g0VarH0);
            } else {
                AbstractC5504s.e(g0VarH0);
                g0VarH0 = H0(g0VarH0, g0Var, listI0);
            }
            arrayList.add(g0VarH0);
        }
        collection.addAll(arrayList);
    }

    private final void u0(Xe.f fVar, Collection collection, Collection collection2, Collection collection3, Function1 function1) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            Af.a.a(collection3, l1(g0Var, function1, fVar, collection));
            Af.a.a(collection3, k1(g0Var, function1, collection));
            Af.a.a(collection3, m1(g0Var, function1));
        }
    }

    private final void v0(Set set, Collection collection, Set set2, Function1 function1) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ye.Z z10 = (ye.Z) it.next();
            Je.f fVarJ0 = J0(z10, function1);
            if (fVarJ0 != null) {
                collection.add(fVarJ0);
                if (set2 != null) {
                    set2.add(z10);
                    return;
                }
                return;
            }
        }
    }

    private final void w0(Xe.f fVar, Collection collection) {
        Oe.r rVar = (Oe.r) AbstractC2279u.N0(((InterfaceC1871c) N().invoke()).c(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(L0(this, rVar, null, ye.E.f65060b, 2, null));
    }

    public static final boolean z0(Oe.q it) {
        AbstractC5504s.h(it, "it");
        return !it.P();
    }

    @Override // Le.U
    protected void B(Collection result, Xe.f name) {
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(name, "name");
        Set setB1 = b1(name);
        if (!He.U.f8509a.k(name) && !C1662i.f8560o.n(name)) {
            Set set = setB1;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC7247z) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (f1((g0) obj)) {
                    arrayList.add(obj);
                }
            }
            t0(result, name, arrayList, false);
            return;
        }
        Af.k kVarA = Af.k.f430c.a();
        Collection collectionD = Ie.a.d(name, setB1, AbstractC2279u.m(), R(), InterfaceC5691w.f53478a, L().a().k().b());
        AbstractC5504s.g(collectionD, "resolveOverridesForNonStaticMembers(...)");
        u0(name, result, collectionD, result, new a(this));
        u0(name, result, collectionD, kVarA, new b(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setB1) {
            if (f1((g0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        t0(result, name, AbstractC2279u.I0(arrayList2, kVarA), true);
    }

    @Override // Le.U
    protected void C(Xe.f name, Collection result) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(result, "result");
        if (this.f11538o.o()) {
            w0(name, result);
        }
        Set setD1 = d1(name);
        if (setD1.isEmpty()) {
            return;
        }
        k.b bVar = Af.k.f430c;
        Af.k kVarA = bVar.a();
        Af.k kVarA2 = bVar.a();
        v0(setD1, result, kVarA, new C1890w(this));
        v0(Ud.a0.j(setD1, kVarA), kVarA2, null, new C1891x(this));
        Collection collectionD = Ie.a.d(name, Ud.a0.l(setD1, kVarA2), result, R(), L().a().c(), L().a().k().b());
        AbstractC5504s.g(collectionD, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(collectionD);
    }

    @Override // Le.U
    protected Set D(C5380d kindFilter, Function1 function1) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        if (this.f11538o.o()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC1871c) N().invoke()).e());
        Collection collectionK = R().l().k();
        AbstractC5504s.g(collectionK, "getSupertypes(...)");
        Iterator it = collectionK.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(linkedHashSet, ((qf.S) it.next()).o().d());
        }
        return linkedHashSet;
    }

    @Override // Le.U
    protected ye.c0 O() {
        return bf.i.l(R());
    }

    @Override // Le.U
    protected boolean V(Je.e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        if (this.f11538o.o()) {
            return false;
        }
        return f1(eVar);
    }

    @Override // Le.U
    protected U.a Y(Oe.r method, List methodTypeParameters, qf.S returnType, List valueParameters) {
        AbstractC5504s.h(method, "method");
        AbstractC5504s.h(methodTypeParameters, "methodTypeParameters");
        AbstractC5504s.h(returnType, "returnType");
        AbstractC5504s.h(valueParameters, "valueParameters");
        o.b bVarA = L().a().s().a(method, R(), returnType, null, valueParameters, methodTypeParameters);
        AbstractC5504s.g(bVarA, "resolvePropagatedSignature(...)");
        qf.S sD = bVarA.d();
        AbstractC5504s.g(sD, "getReturnType(...)");
        qf.S sC = bVarA.c();
        List listF = bVarA.f();
        AbstractC5504s.g(listF, "getValueParameters(...)");
        List listE = bVarA.e();
        AbstractC5504s.g(listE, "getTypeParameters(...)");
        boolean zG = bVarA.g();
        List listB = bVarA.b();
        AbstractC5504s.g(listB, "getErrors(...)");
        return new U.a(sD, sC, listF, listE, zG, listB);
    }

    @Override // Le.U, jf.AbstractC5388l, jf.InterfaceC5387k
    public Collection a(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        n1(name, location);
        return super.a(name, location);
    }

    public final InterfaceC6044i a1() {
        return this.f11540q;
    }

    @Override // Le.U, jf.AbstractC5388l, jf.InterfaceC5387k
    public Collection c(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        n1(name, location);
        return super.c(name, location);
    }

    @Override // Le.U
    /* JADX INFO: renamed from: c1 */
    public InterfaceC7227e R() {
        return this.f11537n;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    public InterfaceC7230h e(Xe.f name, Ge.b location) {
        InterfaceC6043h interfaceC6043h;
        InterfaceC7227e interfaceC7227e;
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        n1(name, location);
        C1893z c1893z = (C1893z) Q();
        return (c1893z == null || (interfaceC6043h = c1893z.f11544u) == null || (interfaceC7227e = (InterfaceC7227e) interfaceC6043h.invoke(name)) == null) ? (InterfaceC7230h) this.f11544u.invoke(name) : interfaceC7227e;
    }

    public void n1(Xe.f name, Ge.b location) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(location, "location");
        Fe.a.a(L().a().l(), location, R(), name);
    }

    @Override // Le.U
    public String toString() {
        return "Lazy Java member scope for " + this.f11538o.f();
    }

    @Override // Le.U
    protected Set v(C5380d kindFilter, Function1 function1) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        return Ud.a0.l((Set) this.f11541r.invoke(), ((Map) this.f11543t.invoke()).keySet());
    }

    @Override // Le.U
    /* JADX INFO: renamed from: x0 */
    public LinkedHashSet x(C5380d kindFilter, Function1 function1) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        Collection collectionK = R().l().k();
        AbstractC5504s.g(collectionK, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionK.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(linkedHashSet, ((qf.S) it.next()).o().b());
        }
        linkedHashSet.addAll(((InterfaceC1871c) N().invoke()).a());
        linkedHashSet.addAll(((InterfaceC1871c) N().invoke()).d());
        linkedHashSet.addAll(v(kindFilter, function1));
        linkedHashSet.addAll(L().a().w().h(R(), L()));
        return linkedHashSet;
    }

    @Override // Le.U
    protected void y(Collection result, Xe.f name) {
        AbstractC5504s.h(result, "result");
        AbstractC5504s.h(name, "name");
        if (this.f11538o.q() && ((InterfaceC1871c) N().invoke()).b(name) != null) {
            Collection collection = result;
            if (collection.isEmpty()) {
                Oe.w wVarB = ((InterfaceC1871c) N().invoke()).b(name);
                AbstractC5504s.e(wVarB);
                result.add(p1(wVarB));
            } else {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (((g0) it.next()).j().isEmpty()) {
                        break;
                    }
                }
                Oe.w wVarB2 = ((InterfaceC1871c) N().invoke()).b(name);
                AbstractC5504s.e(wVarB2);
                result.add(p1(wVarB2));
            }
        }
        L().a().w().c(R(), name, result, L());
    }

    @Override // Le.U
    /* JADX INFO: renamed from: y0 */
    public C1870b z() {
        return new C1870b(this.f11538o, C1888u.f11531a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1893z(Ke.k c10, InterfaceC7227e ownerDescriptor, Oe.g jClass, boolean z10, C1893z c1893z) {
        super(c10, c1893z);
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(ownerDescriptor, "ownerDescriptor");
        AbstractC5504s.h(jClass, "jClass");
        this.f11537n = ownerDescriptor;
        this.f11538o = jClass;
        this.f11539p = z10;
        this.f11540q = c10.e().c(new C1884p(this, c10));
        this.f11541r = c10.e().c(new C1885q(this));
        this.f11542s = c10.e().c(new r(c10, this));
        this.f11543t = c10.e().c(new C1886s(this));
        this.f11544u = c10.e().d(new C1887t(this, c10));
    }
}
