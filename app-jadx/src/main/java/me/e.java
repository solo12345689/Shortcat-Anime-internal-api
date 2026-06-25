package Me;

import Ke.p;
import Oe.A;
import Oe.C;
import Oe.v;
import Oe.x;
import Oe.y;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.A0;
import qf.AbstractC6183d0;
import qf.B0;
import qf.D0;
import qf.I0;
import qf.J0;
import qf.N0;
import qf.S;
import qf.V;
import qf.Y;
import qf.r0;
import qf.s0;
import qf.v0;
import sf.l;
import vf.AbstractC6867d;
import xe.C7140d;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.m0;
import ze.C7381o;
import ze.InterfaceC7369c;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    private final Ke.k f12414a;

    /* JADX INFO: renamed from: b */
    private final p f12415b;

    /* JADX INFO: renamed from: c */
    private final g f12416c;

    /* JADX INFO: renamed from: d */
    private final A0 f12417d;

    public e(Ke.k c10, p typeParameterResolver) {
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(typeParameterResolver, "typeParameterResolver");
        this.f12414a = c10;
        this.f12415b = typeParameterResolver;
        g gVar = new g();
        this.f12416c = gVar;
        this.f12417d = new A0(gVar, null, 2, null);
    }

    private final boolean b(Oe.j jVar, InterfaceC7227e interfaceC7227e) {
        N0 n0M;
        if (!A.a((x) AbstractC2279u.A0(jVar.z()))) {
            return false;
        }
        List parameters = C7140d.f64395a.b(interfaceC7227e).l().getParameters();
        AbstractC5504s.g(parameters, "getParameters(...)");
        m0 m0Var = (m0) AbstractC2279u.A0(parameters);
        return (m0Var == null || (n0M = m0Var.m()) == null || n0M == N0.f58001g) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List c(Oe.j r10, Me.a r11, qf.v0 r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Me.e.c(Oe.j, Me.a, qf.v0):java.util.List");
    }

    private final List d(Oe.j jVar, List list, v0 v0Var, a aVar) {
        Oe.j jVar2;
        v0 v0Var2;
        a aVar2;
        B0 b0A;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (AbstractC6867d.q(m0Var, null, aVar.c())) {
                b0A = J0.t(m0Var, aVar);
                jVar2 = jVar;
                v0Var2 = v0Var;
                aVar2 = aVar;
            } else {
                jVar2 = jVar;
                v0Var2 = v0Var;
                aVar2 = aVar;
                b0A = this.f12416c.a(m0Var, aVar2.j(jVar2.t()), this.f12417d, new Y(this.f12414a.e(), new d(this, m0Var, aVar2, v0Var2, jVar2)));
            }
            arrayList.add(b0A);
            aVar = aVar2;
            v0Var = v0Var2;
            jVar = jVar2;
        }
        return arrayList;
    }

    public static final S e(e eVar, m0 m0Var, a aVar, v0 v0Var, Oe.j jVar) {
        A0 a02 = eVar.f12417d;
        InterfaceC7230h interfaceC7230hP = v0Var.p();
        return a02.e(m0Var, aVar.k(interfaceC7230hP != null ? interfaceC7230hP.p() : null).j(jVar.t()));
    }

    private final AbstractC6183d0 f(Oe.j jVar, a aVar, AbstractC6183d0 abstractC6183d0) {
        Oe.j jVar2;
        r0 r0VarB;
        if (abstractC6183d0 == null || (r0VarB = abstractC6183d0.M0()) == null) {
            jVar2 = jVar;
            r0VarB = s0.b(new Ke.g(this.f12414a, jVar2, false, 4, null));
        } else {
            jVar2 = jVar;
        }
        r0 r0Var = r0VarB;
        v0 v0VarG = g(jVar2, aVar);
        if (v0VarG == null) {
            return null;
        }
        boolean zJ = j(aVar);
        return (AbstractC5504s.c(abstractC6183d0 != null ? abstractC6183d0.N0() : null, v0VarG) && !jVar2.t() && zJ) ? abstractC6183d0.R0(true) : V.k(r0Var, v0VarG, c(jVar2, aVar, v0VarG), zJ, null, 16, null);
    }

    private final v0 g(Oe.j jVar, a aVar) {
        v0 v0VarL;
        Oe.i iVarC = jVar.c();
        if (iVarC == null) {
            return h(jVar);
        }
        if (!(iVarC instanceof Oe.g)) {
            if (iVarC instanceof y) {
                m0 m0VarA = this.f12415b.a((y) iVarC);
                if (m0VarA != null) {
                    return m0VarA.l();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + iVarC);
        }
        Oe.g gVar = (Oe.g) iVarC;
        Xe.c cVarF = gVar.f();
        if (cVarF != null) {
            InterfaceC7227e interfaceC7227eK = k(jVar, aVar, cVarF);
            if (interfaceC7227eK == null) {
                interfaceC7227eK = this.f12414a.a().n().a(gVar);
            }
            return (interfaceC7227eK == null || (v0VarL = interfaceC7227eK.l()) == null) ? h(jVar) : v0VarL;
        }
        throw new AssertionError("Class type should have a FQ name: " + iVarC);
    }

    private final v0 h(Oe.j jVar) {
        v0 v0VarL = this.f12414a.a().b().f().r().d(Xe.b.f21759d.c(new Xe.c(jVar.H())), AbstractC2279u.e(0)).l();
        AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
        return v0VarL;
    }

    private final boolean i(N0 n02, m0 m0Var) {
        return (m0Var.m() == N0.f57999e || n02 == m0Var.m()) ? false : true;
    }

    private final boolean j(a aVar) {
        return (aVar.g() == c.f12406c || aVar.h() || aVar.b() == I0.f57981a) ? false : true;
    }

    private final InterfaceC7227e k(Oe.j jVar, a aVar, Xe.c cVar) {
        if (aVar.h() && AbstractC5504s.c(cVar, f.f12418a)) {
            return this.f12414a.a().p().d();
        }
        C7140d c7140d = C7140d.f64395a;
        InterfaceC7227e interfaceC7227eF = C7140d.f(c7140d, cVar, this.f12414a.d().n(), null, 4, null);
        if (interfaceC7227eF == null) {
            return null;
        }
        return (c7140d.d(interfaceC7227eF) && (aVar.g() == c.f12406c || aVar.b() == I0.f57981a || b(jVar, interfaceC7227eF))) ? c7140d.b(interfaceC7227eF) : interfaceC7227eF;
    }

    public static /* synthetic */ S m(e eVar, Oe.f fVar, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return eVar.l(fVar, aVar, z10);
    }

    private final S n(Oe.j jVar, a aVar) {
        boolean z10 = (aVar.h() || aVar.b() == I0.f57981a) ? false : true;
        boolean zT = jVar.t();
        if (!zT && !z10) {
            AbstractC6183d0 abstractC6183d0F = f(jVar, aVar, null);
            return abstractC6183d0F != null ? abstractC6183d0F : o(jVar);
        }
        AbstractC6183d0 abstractC6183d0F2 = f(jVar, aVar.l(c.f12406c), null);
        if (abstractC6183d0F2 == null) {
            return o(jVar);
        }
        AbstractC6183d0 abstractC6183d0F3 = f(jVar, aVar.l(c.f12405b), abstractC6183d0F2);
        return abstractC6183d0F3 == null ? o(jVar) : zT ? new k(abstractC6183d0F2, abstractC6183d0F3) : V.e(abstractC6183d0F2, abstractC6183d0F3);
    }

    private static final sf.i o(Oe.j jVar) {
        return l.d(sf.k.f59683f, jVar.E());
    }

    private final B0 q(x xVar, a aVar, m0 m0Var) {
        if (!(xVar instanceof C)) {
            return new D0(N0.f57999e, p(xVar, aVar));
        }
        C c10 = (C) xVar;
        x xVarW = c10.w();
        N0 n02 = c10.L() ? N0.f58001g : N0.f58000f;
        if (xVarW == null || i(n02, m0Var)) {
            B0 b0T = J0.t(m0Var, aVar);
            AbstractC5504s.g(b0T, "makeStarProjection(...)");
            return b0T;
        }
        InterfaceC7369c interfaceC7369cA = He.V.a(this.f12414a, c10);
        S sP = p(xVarW, b.b(I0.f57982b, false, false, null, 7, null));
        if (interfaceC7369cA != null) {
            sP = AbstractC6867d.C(sP, InterfaceC7374h.f66223k0.a(AbstractC2279u.H0(sP.getAnnotations(), interfaceC7369cA)));
        }
        return AbstractC6867d.k(sP, n02, m0Var);
    }

    public final S l(Oe.f arrayType, a attr, boolean z10) {
        AbstractC5504s.h(arrayType, "arrayType");
        AbstractC5504s.h(attr, "attr");
        x xVarN = arrayType.n();
        v vVar = xVarN instanceof v ? (v) xVarN : null;
        ve.l type = vVar != null ? vVar.getType() : null;
        Ke.g gVar = new Ke.g(this.f12414a, arrayType, true);
        if (type != null) {
            AbstractC6183d0 abstractC6183d0P = this.f12414a.d().n().P(type);
            AbstractC5504s.e(abstractC6183d0P);
            S sC = AbstractC6867d.C(abstractC6183d0P, new C7381o(abstractC6183d0P.getAnnotations(), gVar));
            AbstractC5504s.f(sC, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) sC;
            return attr.h() ? abstractC6183d0 : V.e(abstractC6183d0, abstractC6183d0.R0(true));
        }
        S sP = p(xVarN, b.b(I0.f57982b, attr.h(), false, null, 6, null));
        if (attr.h()) {
            AbstractC6183d0 abstractC6183d0N = this.f12414a.d().n().n(z10 ? N0.f58001g : N0.f57999e, sP, gVar);
            AbstractC5504s.g(abstractC6183d0N, "getArrayType(...)");
            return abstractC6183d0N;
        }
        AbstractC6183d0 abstractC6183d0N2 = this.f12414a.d().n().n(N0.f57999e, sP, gVar);
        AbstractC5504s.g(abstractC6183d0N2, "getArrayType(...)");
        return V.e(abstractC6183d0N2, this.f12414a.d().n().n(N0.f58001g, sP, gVar).R0(true));
    }

    public final S p(x xVar, a attr) {
        S sP;
        AbstractC5504s.h(attr, "attr");
        if (xVar instanceof v) {
            ve.l type = ((v) xVar).getType();
            AbstractC6183d0 abstractC6183d0S = type != null ? this.f12414a.d().n().S(type) : this.f12414a.d().n().a0();
            AbstractC5504s.e(abstractC6183d0S);
            return abstractC6183d0S;
        }
        if (xVar instanceof Oe.j) {
            return n((Oe.j) xVar, attr);
        }
        if (xVar instanceof Oe.f) {
            return m(this, (Oe.f) xVar, attr, false, 4, null);
        }
        if (xVar instanceof C) {
            x xVarW = ((C) xVar).w();
            if (xVarW != null && (sP = p(xVarW, attr)) != null) {
                return sP;
            }
            AbstractC6183d0 abstractC6183d0Z = this.f12414a.d().n().z();
            AbstractC5504s.g(abstractC6183d0Z, "getDefaultBound(...)");
            return abstractC6183d0Z;
        }
        if (xVar == null) {
            AbstractC6183d0 abstractC6183d0Z2 = this.f12414a.d().n().z();
            AbstractC5504s.g(abstractC6183d0Z2, "getDefaultBound(...)");
            return abstractC6183d0Z2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + xVar);
    }
}
