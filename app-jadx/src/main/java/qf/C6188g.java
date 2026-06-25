package qf;

import Ud.AbstractC2279u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import qf.u0;
import uf.EnumC6770b;
import uf.InterfaceC6772d;

/* JADX INFO: renamed from: qf.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6188g {

    /* JADX INFO: renamed from: a */
    public static final C6188g f58052a = new C6188g();

    /* JADX INFO: renamed from: b */
    public static boolean f58053b;

    /* JADX INFO: renamed from: qf.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58054a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f58055b;

        static {
            int[] iArr = new int[uf.v.values().length];
            try {
                iArr[uf.v.f61518d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uf.v.f61517c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uf.v.f61516b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58054a = iArr;
            int[] iArr2 = new int[u0.b.values().length];
            try {
                iArr2[u0.b.f58109a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[u0.b.f58110b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[u0.b.f58111c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f58055b = iArr2;
        }
    }

    private C6188g() {
    }

    private final List A(u0 u0Var, List list) {
        int i10;
        uf.r rVarJ = u0Var.j();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                uf.l lVarN = rVarJ.n((uf.j) obj);
                int iP0 = rVarJ.p0(lVarN);
                while (true) {
                    if (i10 >= iP0) {
                        arrayList.add(obj);
                        break;
                    }
                    uf.i iVarM0 = rVarJ.m0(rVarJ.H(lVarN, i10));
                    i10 = (iVarM0 != null ? rVarJ.J0(iVarM0) : null) == null ? i10 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    private final Boolean c(u0 u0Var, uf.j jVar, uf.j jVar2) {
        uf.r rVarJ = u0Var.j();
        if (!rVarJ.H0(jVar) && !rVarJ.H0(jVar2)) {
            return null;
        }
        if (f(rVarJ, jVar) && f(rVarJ, jVar2)) {
            return Boolean.TRUE;
        }
        if (rVarJ.H0(jVar)) {
            if (g(rVarJ, u0Var, jVar, jVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (rVarJ.H0(jVar2) && (e(rVarJ, jVar) || g(rVarJ, u0Var, jVar2, jVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean d(uf.r rVar, uf.j jVar) {
        uf.i iVarM0;
        uf.j jVarG;
        return (jVar instanceof InterfaceC6772d) && (iVarM0 = rVar.m0(rVar.o(rVar.u0((InterfaceC6772d) jVar)))) != null && (jVarG = rVar.G(iVarM0)) != null && rVar.H0(jVarG);
    }

    private static final boolean e(uf.r rVar, uf.j jVar) {
        uf.p pVarE = rVar.e(jVar);
        if (!(pVarE instanceof uf.h)) {
            return false;
        }
        Collection collectionE = rVar.E(pVarE);
        if ((collectionE instanceof Collection) && collectionE.isEmpty()) {
            return false;
        }
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            uf.j jVarD = rVar.d((uf.i) it.next());
            if (jVarD != null && rVar.H0(jVarD)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean f(uf.r rVar, uf.j jVar) {
        return rVar.H0(jVar) || d(rVar, jVar);
    }

    private static final boolean g(uf.r rVar, u0 u0Var, uf.j jVar, uf.j jVar2, boolean z10) {
        u0 u0Var2;
        uf.j jVar3;
        Collection<uf.i> collectionN = rVar.N(jVar);
        if ((collectionN instanceof Collection) && collectionN.isEmpty()) {
            return false;
        }
        for (uf.i iVar : collectionN) {
            if (AbstractC5504s.c(rVar.G0(iVar), rVar.e(jVar2))) {
                return true;
            }
            if (z10) {
                u0Var2 = u0Var;
                jVar3 = jVar2;
                if (v(f58052a, u0Var2, jVar3, iVar, false, 8, null)) {
                    return true;
                }
            } else {
                u0Var2 = u0Var;
                jVar3 = jVar2;
            }
            u0Var = u0Var2;
            jVar2 = jVar3;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean h(qf.u0 r13, uf.j r14, uf.j r15) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.C6188g.h(qf.u0, uf.j, uf.j):java.lang.Boolean");
    }

    private final List i(u0 u0Var, uf.j jVar, uf.p pVar) {
        u0.c cVarE0;
        uf.r rVarJ = u0Var.j();
        List listV = rVarJ.V(jVar, pVar);
        if (listV != null) {
            return listV;
        }
        if (!rVarJ.I0(pVar) && rVarJ.x(jVar)) {
            return AbstractC2279u.m();
        }
        if (rVarJ.v0(pVar)) {
            if (!rVarJ.j0(rVarJ.e(jVar), pVar)) {
                return AbstractC2279u.m();
            }
            uf.j jVarZ = rVarJ.Z(jVar, EnumC6770b.f61510a);
            if (jVarZ != null) {
                jVar = jVarZ;
            }
            return AbstractC2279u.e(jVar);
        }
        Af.j jVar2 = new Af.j();
        u0Var.k();
        ArrayDeque arrayDequeH = u0Var.h();
        AbstractC5504s.e(arrayDequeH);
        Set setI = u0Var.i();
        AbstractC5504s.e(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            uf.j jVar3 = (uf.j) arrayDequeH.pop();
            AbstractC5504s.e(jVar3);
            if (setI.add(jVar3)) {
                uf.j jVarZ2 = rVarJ.Z(jVar3, EnumC6770b.f61510a);
                if (jVarZ2 == null) {
                    jVarZ2 = jVar3;
                }
                if (rVarJ.j0(rVarJ.e(jVarZ2), pVar)) {
                    jVar2.add(jVarZ2);
                    cVarE0 = u0.c.C0878c.f58115a;
                } else {
                    cVarE0 = rVarJ.m(jVarZ2) == 0 ? u0.c.b.f58114a : u0Var.j().E0(jVarZ2);
                }
                if (AbstractC5504s.c(cVarE0, u0.c.C0878c.f58115a)) {
                    cVarE0 = null;
                }
                if (cVarE0 != null) {
                    uf.r rVarJ2 = u0Var.j();
                    Iterator it = rVarJ2.E(rVarJ2.e(jVar3)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVarE0.a(u0Var, (uf.i) it.next()));
                    }
                }
            }
        }
        u0Var.e();
        return jVar2;
    }

    private final List j(u0 u0Var, uf.j jVar, uf.p pVar) {
        return A(u0Var, i(u0Var, jVar, pVar));
    }

    private final boolean k(u0 u0Var, uf.i iVar, uf.i iVar2, boolean z10) {
        uf.r rVarJ = u0Var.j();
        uf.i iVarP = u0Var.p(u0Var.q(iVar));
        uf.i iVarP2 = u0Var.p(u0Var.q(iVar2));
        if (u0Var.m() && rVarJ.e0(iVarP) && rVarJ.w0(iVarP2)) {
            C6188g c6188g = f58052a;
            uf.g gVarJ0 = rVarJ.J0(iVarP);
            AbstractC5504s.e(gVarJ0);
            uf.j jVarG = rVarJ.g(gVarJ0);
            uf.j jVarD = rVarJ.d(iVarP2);
            AbstractC5504s.e(jVarD);
            return c6188g.k(u0Var, jVarG, rVarJ.f0(jVarD), z10);
        }
        C6188g c6188g2 = f58052a;
        Boolean boolH = c6188g2.h(u0Var, rVarJ.v(iVarP), rVarJ.G(iVarP2));
        if (boolH == null) {
            Boolean boolC = u0Var.c(iVarP, iVarP2, z10);
            return boolC != null ? boolC.booleanValue() : c6188g2.w(u0Var, rVarJ.v(iVarP), rVarJ.G(iVarP2));
        }
        boolean zBooleanValue = boolH.booleanValue();
        u0Var.c(iVarP, iVarP2, z10);
        return zBooleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x005a, code lost:
    
        return r7.g0(r7.G0(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final uf.q o(uf.r r7, uf.i r8, uf.i r9) {
        /*
            r6 = this;
            int r0 = r7.m(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L5e
            uf.m r4 = r7.B0(r8, r2)
            boolean r5 = r7.c(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L5b
            uf.i r3 = r7.m0(r3)
            if (r3 != 0) goto L1d
            goto L5b
        L1d:
            uf.j r4 = r7.v(r3)
            boolean r4 = r7.l(r4)
            if (r4 == 0) goto L33
            uf.j r4 = r7.v(r9)
            boolean r4 = r7.l(r4)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = r1
        L34:
            boolean r5 = kotlin.jvm.internal.AbstractC5504s.c(r3, r9)
            if (r5 != 0) goto L52
            if (r4 == 0) goto L4b
            uf.p r4 = r7.G0(r3)
            uf.p r5 = r7.G0(r9)
            boolean r4 = kotlin.jvm.internal.AbstractC5504s.c(r4, r5)
            if (r4 == 0) goto L4b
            goto L52
        L4b:
            uf.q r3 = r6.o(r7, r3, r9)
            if (r3 == 0) goto L5b
            return r3
        L52:
            uf.p r8 = r7.G0(r8)
            uf.q r7 = r7.g0(r8, r2)
            return r7
        L5b:
            int r2 = r2 + 1
            goto L6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.C6188g.o(uf.r, uf.i, uf.i):uf.q");
    }

    private final boolean p(u0 u0Var, uf.j jVar) {
        uf.r rVarJ = u0Var.j();
        uf.p pVarE = rVarJ.e(jVar);
        if (rVarJ.I0(pVarE)) {
            return rVarJ.q0(pVarE);
        }
        if (rVarJ.q0(rVarJ.e(jVar))) {
            return true;
        }
        u0Var.k();
        ArrayDeque arrayDequeH = u0Var.h();
        AbstractC5504s.e(arrayDequeH);
        Set setI = u0Var.i();
        AbstractC5504s.e(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            uf.j jVar2 = (uf.j) arrayDequeH.pop();
            AbstractC5504s.e(jVar2);
            if (setI.add(jVar2)) {
                u0.c cVar = rVarJ.x(jVar2) ? u0.c.C0878c.f58115a : u0.c.b.f58114a;
                if (AbstractC5504s.c(cVar, u0.c.C0878c.f58115a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    uf.r rVarJ2 = u0Var.j();
                    Iterator it = rVarJ2.E(rVarJ2.e(jVar2)).iterator();
                    while (it.hasNext()) {
                        uf.j jVarA = cVar.a(u0Var, (uf.i) it.next());
                        if (rVarJ.q0(rVarJ.e(jVarA))) {
                            u0Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        u0Var.e();
        return false;
    }

    private final boolean q(uf.r rVar, uf.i iVar) {
        return (!rVar.B(rVar.G0(iVar)) || rVar.a0(iVar) || rVar.w0(iVar) || rVar.T(iVar) || rVar.A0(iVar)) ? false : true;
    }

    private final boolean r(uf.r rVar, uf.j jVar, uf.j jVar2) {
        if (rVar.e(jVar) != rVar.e(jVar2)) {
            return false;
        }
        if (rVar.q(jVar) || !rVar.q(jVar2)) {
            return !rVar.b0(jVar) || rVar.b0(jVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean v(C6188g c6188g, u0 u0Var, uf.i iVar, uf.i iVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return c6188g.u(u0Var, iVar, iVar2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean w(qf.u0 r18, uf.j r19, uf.j r20) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.C6188g.w(qf.u0, uf.j, uf.j):boolean");
    }

    public static final Td.L x(Collection collection, u0 u0Var, uf.r rVar, uf.j jVar, u0.a runForkingPoint) {
        AbstractC5504s.h(runForkingPoint, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            runForkingPoint.a(new C6186f(u0Var, rVar, (uf.j) it.next(), jVar));
        }
        return Td.L.f17438a;
    }

    public static final boolean y(u0 u0Var, uf.r rVar, uf.j jVar, uf.j jVar2) {
        return f58052a.s(u0Var, rVar.n(jVar), jVar2);
    }

    private final boolean z(uf.r rVar, uf.i iVar, uf.i iVar2, uf.p pVar) {
        uf.j jVarD = rVar.d(iVar);
        if (jVarD instanceof InterfaceC6772d) {
            InterfaceC6772d interfaceC6772d = (InterfaceC6772d) jVarD;
            if (rVar.n0(interfaceC6772d) || !rVar.c(rVar.o(rVar.u0(interfaceC6772d))) || rVar.D0(interfaceC6772d) != EnumC6770b.f61510a) {
                return false;
            }
            rVar.G0(iVar2);
        }
        return false;
    }

    public final uf.v l(uf.v declared, uf.v useSite) {
        AbstractC5504s.h(declared, "declared");
        AbstractC5504s.h(useSite, "useSite");
        uf.v vVar = uf.v.f61518d;
        if (declared == vVar) {
            return useSite;
        }
        if (useSite == vVar || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean m(u0 state, uf.i a10, uf.i b10) {
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(a10, "a");
        AbstractC5504s.h(b10, "b");
        uf.r rVarJ = state.j();
        if (a10 == b10) {
            return true;
        }
        C6188g c6188g = f58052a;
        if (c6188g.q(rVarJ, a10) && c6188g.q(rVarJ, b10)) {
            uf.i iVarP = state.p(state.q(a10));
            uf.i iVarP2 = state.p(state.q(b10));
            uf.j jVarV = rVarJ.v(iVarP);
            if (!rVarJ.j0(rVarJ.G0(iVarP), rVarJ.G0(iVarP2))) {
                return false;
            }
            if (rVarJ.m(jVarV) == 0) {
                return rVarJ.O(iVarP) || rVarJ.O(iVarP2) || rVarJ.b0(jVarV) == rVarJ.b0(rVarJ.v(iVarP2));
            }
        }
        return v(c6188g, state, a10, b10, false, 8, null) && v(c6188g, state, b10, a10, false, 8, null);
    }

    public final List n(u0 state, uf.j subType, uf.p superConstructor) {
        u0.c cVar;
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(subType, "subType");
        AbstractC5504s.h(superConstructor, "superConstructor");
        uf.r rVarJ = state.j();
        if (rVarJ.x(subType)) {
            return f58052a.j(state, subType, superConstructor);
        }
        if (!rVarJ.I0(superConstructor) && !rVarJ.D(superConstructor)) {
            return f58052a.i(state, subType, superConstructor);
        }
        Af.j<uf.j> jVar = new Af.j();
        state.k();
        ArrayDeque arrayDequeH = state.h();
        AbstractC5504s.e(arrayDequeH);
        Set setI = state.i();
        AbstractC5504s.e(setI);
        arrayDequeH.push(subType);
        while (!arrayDequeH.isEmpty()) {
            uf.j jVar2 = (uf.j) arrayDequeH.pop();
            AbstractC5504s.e(jVar2);
            if (setI.add(jVar2)) {
                if (rVarJ.x(jVar2)) {
                    jVar.add(jVar2);
                    cVar = u0.c.C0878c.f58115a;
                } else {
                    cVar = u0.c.b.f58114a;
                }
                if (AbstractC5504s.c(cVar, u0.c.C0878c.f58115a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    uf.r rVarJ2 = state.j();
                    Iterator it = rVarJ2.E(rVarJ2.e(jVar2)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVar.a(state, (uf.i) it.next()));
                    }
                }
            }
        }
        state.e();
        ArrayList arrayList = new ArrayList();
        for (uf.j jVar3 : jVar) {
            C6188g c6188g = f58052a;
            AbstractC5504s.e(jVar3);
            AbstractC2279u.D(arrayList, c6188g.j(state, jVar3, superConstructor));
        }
        return arrayList;
    }

    public final boolean s(u0 u0Var, uf.l capturedSubArguments, uf.j superType) {
        boolean zM;
        u0 u0Var2 = u0Var;
        AbstractC5504s.h(u0Var2, "<this>");
        AbstractC5504s.h(capturedSubArguments, "capturedSubArguments");
        AbstractC5504s.h(superType, "superType");
        uf.r rVarJ = u0Var2.j();
        uf.p pVarE = rVarJ.e(superType);
        int iP0 = rVarJ.p0(capturedSubArguments);
        int iT = rVarJ.t(pVarE);
        if (iP0 != iT || iP0 != rVarJ.m(superType)) {
            return false;
        }
        for (int i10 = 0; i10 < iT; i10++) {
            uf.m mVarB0 = rVarJ.B0(superType, i10);
            uf.i iVarM0 = rVarJ.m0(mVarB0);
            if (iVarM0 != null) {
                uf.m mVarH = rVarJ.H(capturedSubArguments, i10);
                rVarJ.o0(mVarH);
                uf.v vVar = uf.v.f61518d;
                uf.i iVarM02 = rVarJ.m0(mVarH);
                AbstractC5504s.e(iVarM02);
                C6188g c6188g = f58052a;
                uf.v vVarL = c6188g.l(rVarJ.t0(rVarJ.g0(pVarE, i10)), rVarJ.o0(mVarB0));
                if (vVarL == null) {
                    return u0Var2.n();
                }
                if (vVarL != vVar || (!c6188g.z(rVarJ, iVarM02, iVarM0, pVarE) && !c6188g.z(rVarJ, iVarM0, iVarM02, pVarE))) {
                    if (u0Var2.f58104h > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + iVarM02).toString());
                    }
                    u0Var2.f58104h++;
                    int i11 = a.f58054a[vVarL.ordinal()];
                    if (i11 == 1) {
                        zM = c6188g.m(u0Var2, iVarM02, iVarM0);
                    } else if (i11 == 2) {
                        u0Var2 = u0Var;
                        zM = v(c6188g, u0Var2, iVarM02, iVarM0, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new Td.r();
                        }
                        zM = v(c6188g, u0Var2, iVarM0, iVarM02, false, 8, null);
                        u0Var2 = u0Var;
                    }
                    u0Var2.f58104h--;
                    if (!zM) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean t(u0 state, uf.i subType, uf.i superType) {
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(subType, "subType");
        AbstractC5504s.h(superType, "superType");
        return v(this, state, subType, superType, false, 8, null);
    }

    public final boolean u(u0 state, uf.i subType, uf.i superType, boolean z10) {
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(subType, "subType");
        AbstractC5504s.h(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.f(subType, superType)) {
            return k(state, subType, superType, z10);
        }
        return false;
    }
}
