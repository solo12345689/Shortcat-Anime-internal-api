package rf;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import qf.AbstractC6183d0;
import qf.u0;
import rf.InterfaceC6312b;
import uf.C6769a;
import uf.EnumC6770b;
import uf.InterfaceC6771c;
import uf.InterfaceC6772d;
import uf.InterfaceC6773e;
import uf.InterfaceC6774f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class s implements InterfaceC6312b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f58800a = new s();

    private s() {
    }

    @Override // qf.H0
    public Xe.d A(uf.p pVar) {
        return InterfaceC6312b.a.o(this, pVar);
    }

    @Override // uf.r
    public boolean A0(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return !AbstractC5504s.c(e(v(iVar)), e(G(iVar)));
    }

    @Override // uf.r
    public boolean B(uf.p pVar) {
        return InterfaceC6312b.a.H(this, pVar);
    }

    @Override // uf.r
    public uf.m B0(uf.i iVar, int i10) {
        return InterfaceC6312b.a.m(this, iVar, i10);
    }

    @Override // uf.r
    public boolean C(uf.i iVar) {
        return InterfaceC6312b.a.a0(this, iVar);
    }

    @Override // uf.r
    public boolean C0(InterfaceC6772d interfaceC6772d) {
        return InterfaceC6312b.a.T(this, interfaceC6772d);
    }

    @Override // uf.r
    public boolean D(uf.p pVar) {
        return InterfaceC6312b.a.K(this, pVar);
    }

    @Override // uf.r
    public EnumC6770b D0(InterfaceC6772d interfaceC6772d) {
        return InterfaceC6312b.a.k(this, interfaceC6772d);
    }

    @Override // uf.r
    public Collection E(uf.p pVar) {
        return InterfaceC6312b.a.l0(this, pVar);
    }

    @Override // uf.r
    public u0.c E0(uf.j jVar) {
        return InterfaceC6312b.a.k0(this, jVar);
    }

    @Override // uf.r
    public uf.i F(Collection collection) {
        return InterfaceC6312b.a.D(this, collection);
    }

    @Override // uf.o
    public u0 F0(boolean z10, boolean z11, boolean z12) {
        return InterfaceC6312b.a.f0(this, z10, z11, z12);
    }

    @Override // uf.r
    public uf.j G(uf.i iVar) {
        uf.j jVarH;
        AbstractC5504s.h(iVar, "<this>");
        uf.g gVarJ0 = J0(iVar);
        if (gVarJ0 != null && (jVarH = h(gVarJ0)) != null) {
            return jVarH;
        }
        uf.j jVarD = d(iVar);
        AbstractC5504s.e(jVarD);
        return jVarD;
    }

    @Override // uf.r
    public uf.p G0(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        uf.j jVarD = d(iVar);
        if (jVarD == null) {
            jVarD = v(iVar);
        }
        return e(jVarD);
    }

    @Override // uf.r
    public uf.m H(uf.l lVar, int i10) {
        AbstractC5504s.h(lVar, "<this>");
        if (lVar instanceof uf.k) {
            return B0((uf.i) lVar, i10);
        }
        if (lVar instanceof C6769a) {
            E e10 = ((C6769a) lVar).get(i10);
            AbstractC5504s.g(e10, "get(...)");
            return (uf.m) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + O.b(lVar.getClass())).toString());
    }

    @Override // uf.r
    public boolean H0(uf.j jVar) {
        AbstractC5504s.h(jVar, "<this>");
        return D(e(jVar));
    }

    @Override // uf.r
    public boolean I(uf.p pVar) {
        return InterfaceC6312b.a.E(this, pVar);
    }

    @Override // uf.r
    public boolean I0(uf.p pVar) {
        return InterfaceC6312b.a.F(this, pVar);
    }

    @Override // uf.r
    public boolean J(uf.k kVar) {
        return InterfaceC6312b.a.S(this, kVar);
    }

    @Override // uf.r
    public uf.g J0(uf.i iVar) {
        return InterfaceC6312b.a.g(this, iVar);
    }

    @Override // uf.r
    public boolean K(uf.i iVar) {
        return InterfaceC6312b.a.I(this, iVar);
    }

    @Override // uf.r
    public uf.i K0(InterfaceC6772d interfaceC6772d) {
        return InterfaceC6312b.a.d0(this, interfaceC6772d);
    }

    @Override // uf.t
    public boolean L() {
        return InterfaceC6312b.a.M(this);
    }

    @Override // uf.r
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public AbstractC6183d0 Z(uf.j jVar, EnumC6770b enumC6770b) {
        return InterfaceC6312b.a.j(this, jVar, enumC6770b);
    }

    @Override // uf.r
    public boolean M(uf.i iVar) {
        return InterfaceC6312b.a.Q(this, iVar);
    }

    @Override // uf.r
    public Collection N(uf.j jVar) {
        return InterfaceC6312b.a.i0(this, jVar);
    }

    @Override // uf.r
    public boolean O(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return b0(v(iVar)) != b0(G(iVar));
    }

    @Override // uf.r
    public uf.k P(InterfaceC6773e interfaceC6773e) {
        return InterfaceC6312b.a.g0(this, interfaceC6773e);
    }

    @Override // uf.r
    public uf.i Q(uf.i iVar, boolean z10) {
        return InterfaceC6312b.a.p0(this, iVar, z10);
    }

    @Override // qf.H0
    public boolean R(uf.p pVar) {
        return InterfaceC6312b.a.J(this, pVar);
    }

    @Override // uf.u
    public boolean S(uf.j jVar, uf.j jVar2) {
        return InterfaceC6312b.a.C(this, jVar, jVar2);
    }

    @Override // uf.r
    public boolean T(uf.i iVar) {
        return InterfaceC6312b.a.O(this, iVar);
    }

    @Override // uf.r
    public boolean U(uf.q qVar, uf.p pVar) {
        return InterfaceC6312b.a.B(this, qVar, pVar);
    }

    @Override // uf.r
    public List V(uf.j jVar, uf.p constructor) {
        AbstractC5504s.h(jVar, "<this>");
        AbstractC5504s.h(constructor, "constructor");
        return null;
    }

    @Override // uf.r
    public List W(uf.q qVar) {
        return InterfaceC6312b.a.x(this, qVar);
    }

    @Override // uf.r
    public uf.m X(uf.j jVar, int i10) {
        AbstractC5504s.h(jVar, "<this>");
        if (i10 < 0 || i10 >= m(jVar)) {
            return null;
        }
        return B0(jVar, i10);
    }

    @Override // qf.H0
    public ve.l Y(uf.p pVar) {
        return InterfaceC6312b.a.s(this, pVar);
    }

    @Override // rf.InterfaceC6312b, uf.r
    public boolean a(uf.j jVar) {
        return InterfaceC6312b.a.V(this, jVar);
    }

    @Override // uf.r
    public boolean a0(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        uf.g gVarJ0 = J0(iVar);
        if (gVarJ0 == null) {
            return false;
        }
        j(gVarJ0);
        return false;
    }

    @Override // rf.InterfaceC6312b, uf.r
    public InterfaceC6772d b(uf.k kVar) {
        return InterfaceC6312b.a.d(this, kVar);
    }

    @Override // uf.r
    public boolean b0(uf.i iVar) {
        return InterfaceC6312b.a.N(this, iVar);
    }

    @Override // rf.InterfaceC6312b, uf.r
    public boolean c(uf.m mVar) {
        return InterfaceC6312b.a.X(this, mVar);
    }

    @Override // qf.H0
    public boolean c0(uf.i iVar, Xe.c cVar) {
        return InterfaceC6312b.a.A(this, iVar, cVar);
    }

    @Override // qf.H0
    public boolean d0(uf.p pVar) {
        return InterfaceC6312b.a.b0(this, pVar);
    }

    @Override // rf.InterfaceC6312b, uf.r
    public uf.p e(uf.j jVar) {
        return InterfaceC6312b.a.n0(this, jVar);
    }

    @Override // uf.r
    public boolean e0(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return J0(iVar) != null;
    }

    @Override // uf.r
    public uf.k f0(uf.j jVar) {
        uf.k kVarP;
        AbstractC5504s.h(jVar, "<this>");
        InterfaceC6773e interfaceC6773eZ = z(jVar);
        return (interfaceC6773eZ == null || (kVarP = P(interfaceC6773eZ)) == null) ? (uf.k) jVar : kVarP;
    }

    @Override // uf.r
    public uf.q g0(uf.p pVar, int i10) {
        return InterfaceC6312b.a.p(this, pVar, i10);
    }

    @Override // uf.r
    public List h0(uf.p pVar) {
        return InterfaceC6312b.a.q(this, pVar);
    }

    @Override // uf.r
    public boolean i(uf.i iVar) {
        return InterfaceC6312b.a.U(this, iVar);
    }

    @Override // uf.r
    public InterfaceC6772d i0(uf.j jVar) {
        AbstractC5504s.h(jVar, "<this>");
        return b(f0(jVar));
    }

    @Override // uf.r
    public InterfaceC6774f j(uf.g gVar) {
        InterfaceC6312b.a.f(this, gVar);
        return null;
    }

    @Override // uf.r
    public boolean j0(uf.p pVar, uf.p pVar2) {
        return InterfaceC6312b.a.a(this, pVar, pVar2);
    }

    @Override // uf.r
    public boolean k(uf.j jVar) {
        return InterfaceC6312b.a.Z(this, jVar);
    }

    @Override // uf.r
    public uf.i k0(uf.i iVar, boolean z10) {
        return InterfaceC6312b.a.e0(this, iVar, z10);
    }

    @Override // uf.r
    public boolean l(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        uf.j jVarD = d(iVar);
        return (jVarD != null ? i0(jVarD) : null) != null;
    }

    @Override // uf.r
    public uf.m l0(uf.i iVar) {
        return InterfaceC6312b.a.i(this, iVar);
    }

    @Override // uf.r
    public int m(uf.i iVar) {
        return InterfaceC6312b.a.b(this, iVar);
    }

    @Override // uf.r
    public uf.i m0(uf.m mVar) {
        return InterfaceC6312b.a.u(this, mVar);
    }

    @Override // uf.r
    public uf.l n(uf.j jVar) {
        return InterfaceC6312b.a.c(this, jVar);
    }

    @Override // uf.r
    public boolean n0(InterfaceC6772d interfaceC6772d) {
        return InterfaceC6312b.a.R(this, interfaceC6772d);
    }

    @Override // uf.r
    public uf.m o(InterfaceC6771c interfaceC6771c) {
        return InterfaceC6312b.a.j0(this, interfaceC6771c);
    }

    @Override // uf.r
    public uf.v o0(uf.m mVar) {
        return InterfaceC6312b.a.y(this, mVar);
    }

    @Override // rf.InterfaceC6312b
    public uf.i p(uf.j jVar, uf.j jVar2) {
        return InterfaceC6312b.a.l(this, jVar, jVar2);
    }

    @Override // uf.r
    public int p0(uf.l lVar) {
        AbstractC5504s.h(lVar, "<this>");
        if (lVar instanceof uf.j) {
            return m((uf.i) lVar);
        }
        if (lVar instanceof C6769a) {
            return ((C6769a) lVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + O.b(lVar.getClass())).toString());
    }

    @Override // uf.r
    public boolean q(uf.j jVar) {
        AbstractC5504s.h(jVar, "<this>");
        return z(jVar) != null;
    }

    @Override // uf.r
    public boolean q0(uf.p pVar) {
        return InterfaceC6312b.a.P(this, pVar);
    }

    @Override // qf.H0
    public uf.i r(uf.q qVar) {
        return InterfaceC6312b.a.t(this, qVar);
    }

    @Override // qf.H0
    public uf.i r0(uf.i iVar) {
        return InterfaceC6312b.a.w(this, iVar);
    }

    @Override // uf.r
    public boolean s(uf.j jVar) {
        return InterfaceC6312b.a.Y(this, jVar);
    }

    @Override // qf.H0
    public uf.i s0(uf.i iVar) {
        uf.j jVarF;
        AbstractC5504s.h(iVar, "<this>");
        uf.j jVarD = d(iVar);
        return (jVarD == null || (jVarF = f(jVarD, true)) == null) ? iVar : jVarF;
    }

    @Override // uf.r
    public int t(uf.p pVar) {
        return InterfaceC6312b.a.h0(this, pVar);
    }

    @Override // uf.r
    public uf.v t0(uf.q qVar) {
        return InterfaceC6312b.a.z(this, qVar);
    }

    @Override // qf.H0
    public ve.l u(uf.p pVar) {
        return InterfaceC6312b.a.r(this, pVar);
    }

    @Override // uf.r
    public InterfaceC6771c u0(InterfaceC6772d interfaceC6772d) {
        return InterfaceC6312b.a.m0(this, interfaceC6772d);
    }

    @Override // uf.r
    public uf.j v(uf.i iVar) {
        uf.j jVarG;
        AbstractC5504s.h(iVar, "<this>");
        uf.g gVarJ0 = J0(iVar);
        if (gVarJ0 != null && (jVarG = g(gVarJ0)) != null) {
            return jVarG;
        }
        uf.j jVarD = d(iVar);
        AbstractC5504s.e(jVarD);
        return jVarD;
    }

    @Override // uf.r
    public boolean v0(uf.p pVar) {
        return InterfaceC6312b.a.G(this, pVar);
    }

    @Override // uf.r
    public boolean w(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return q0(G0(iVar)) && !M(iVar);
    }

    @Override // uf.r
    public boolean w0(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        uf.j jVarD = d(iVar);
        return (jVarD != null ? z(jVarD) : null) != null;
    }

    @Override // uf.r
    public boolean x(uf.j jVar) {
        AbstractC5504s.h(jVar, "<this>");
        return I0(e(jVar));
    }

    @Override // uf.r
    public uf.q x0(uf.p pVar) {
        return InterfaceC6312b.a.v(this, pVar);
    }

    @Override // uf.r
    public boolean y(uf.p pVar) {
        return InterfaceC6312b.a.L(this, pVar);
    }

    @Override // uf.r
    public uf.i y0(uf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return k0(iVar, false);
    }

    @Override // uf.r
    public InterfaceC6773e z(uf.j jVar) {
        return InterfaceC6312b.a.e(this, jVar);
    }

    @Override // uf.r
    public List z0(uf.i iVar) {
        return InterfaceC6312b.a.n(this, iVar);
    }

    @Override // uf.r
    public uf.k d(uf.i iVar) {
        return InterfaceC6312b.a.h(this, iVar);
    }

    @Override // uf.r
    public uf.k f(uf.j jVar, boolean z10) {
        return InterfaceC6312b.a.q0(this, jVar, z10);
    }

    @Override // uf.r
    public uf.k g(uf.g gVar) {
        return InterfaceC6312b.a.c0(this, gVar);
    }

    @Override // uf.r
    public uf.k h(uf.g gVar) {
        return InterfaceC6312b.a.o0(this, gVar);
    }
}
