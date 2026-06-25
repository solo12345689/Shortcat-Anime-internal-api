package mf;

import Ud.AbstractC2279u;
import Ue.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import df.AbstractC4598g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import mf.N;
import of.C5878a;
import of.C5880c;
import of.C5890m;
import pf.InterfaceC6045j;
import ye.AbstractC7242u;
import ye.EnumC7228f;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7226d;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;
import ye.c0;
import ye.g0;
import ye.h0;
import ye.l0;
import ye.t0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class K {

    /* JADX INFO: renamed from: a */
    private final C5685p f53360a;

    /* JADX INFO: renamed from: b */
    private final C5676g f53361b;

    public K(C5685p c10) {
        AbstractC5504s.h(c10, "c");
        this.f53360a = c10;
        this.f53361b = new C5676g(c10.c().q(), c10.c().r());
    }

    private final c0 A(Se.r rVar, C5685p c5685p, InterfaceC7223a interfaceC7223a, int i10) {
        return bf.h.b(interfaceC7223a, c5685p.i().u(rVar), null, InterfaceC7374h.f66223k0.b(), i10);
    }

    private final List B(List list, Ze.p pVar, EnumC5673d enumC5673d) {
        InterfaceC7235m interfaceC7235mE = this.f53360a.e();
        AbstractC5504s.f(interfaceC7235mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC7223a interfaceC7223a = (InterfaceC7223a) interfaceC7235mE;
        InterfaceC7235m interfaceC7235mB = interfaceC7223a.b();
        AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
        N nI = i(interfaceC7235mB);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            Se.v vVar = (Se.v) obj;
            int iL = vVar.R() ? vVar.L() : 0;
            InterfaceC7374h interfaceC7374hB = (nI == null || !Ue.b.f19547c.d(iL).booleanValue()) ? InterfaceC7374h.f66223k0.b() : new of.T(this.f53360a.h(), new H(this, nI, pVar, enumC5673d, i10, vVar));
            Xe.f fVarB = L.b(this.f53360a.g(), vVar.M());
            qf.S sU = this.f53360a.i().u(Ue.g.q(vVar, this.f53360a.j()));
            Boolean boolD = Ue.b.f19536H.d(iL);
            AbstractC5504s.g(boolD, "get(...)");
            boolean zBooleanValue = boolD.booleanValue();
            Boolean boolD2 = Ue.b.f19537I.d(iL);
            AbstractC5504s.g(boolD2, "get(...)");
            boolean zBooleanValue2 = boolD2.booleanValue();
            Boolean boolD3 = Ue.b.f19538J.d(iL);
            AbstractC5504s.g(boolD3, "get(...)");
            boolean zBooleanValue3 = boolD3.booleanValue();
            Se.r rVarT = Ue.g.t(vVar, this.f53360a.j());
            qf.S sU2 = rVarT != null ? this.f53360a.i().u(rVarT) : null;
            h0 NO_SOURCE = h0.f65112a;
            AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
            InterfaceC7223a interfaceC7223a2 = interfaceC7223a;
            arrayList.add(new Be.V(interfaceC7223a2, null, i10, interfaceC7374hB, fVarB, sU, zBooleanValue, zBooleanValue2, zBooleanValue3, sU2, NO_SOURCE));
            interfaceC7223a = interfaceC7223a2;
            i10 = i11;
        }
        return AbstractC2279u.b1(arrayList);
    }

    public static final List C(K k10, N n10, Ze.p pVar, EnumC5673d enumC5673d, int i10, Se.v vVar) {
        return AbstractC2279u.b1(k10.f53360a.c().d().e(n10, pVar, enumC5673d, i10, vVar));
    }

    private final N i(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m instanceof ye.N) {
            return new N.b(((ye.N) interfaceC7235m).f(), this.f53360a.g(), this.f53360a.j(), this.f53360a.d());
        }
        if (interfaceC7235m instanceof C5890m) {
            return ((C5890m) interfaceC7235m).i1();
        }
        return null;
    }

    private final InterfaceC7374h j(Ze.p pVar, int i10, EnumC5673d enumC5673d) {
        return !Ue.b.f19547c.d(i10).booleanValue() ? InterfaceC7374h.f66223k0.b() : new of.T(this.f53360a.h(), new E(this, pVar, enumC5673d));
    }

    public static final List k(K k10, Ze.p pVar, EnumC5673d enumC5673d) {
        N nI = k10.i(k10.f53360a.e());
        List listB1 = nI != null ? AbstractC2279u.b1(k10.f53360a.c().d().h(nI, pVar, enumC5673d)) : null;
        return listB1 == null ? AbstractC2279u.m() : listB1;
    }

    private final c0 l() {
        InterfaceC7235m interfaceC7235mE = this.f53360a.e();
        InterfaceC7227e interfaceC7227e = interfaceC7235mE instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mE : null;
        if (interfaceC7227e != null) {
            return interfaceC7227e.J0();
        }
        return null;
    }

    private final InterfaceC7374h m(Se.o oVar, boolean z10) {
        return !Ue.b.f19547c.d(oVar.f0()).booleanValue() ? InterfaceC7374h.f66223k0.b() : new of.T(this.f53360a.h(), new F(this, z10, oVar));
    }

    public static final List n(K k10, boolean z10, Se.o oVar) {
        N nI = k10.i(k10.f53360a.e());
        List listB1 = nI != null ? z10 ? AbstractC2279u.b1(k10.f53360a.c().d().g(nI, oVar)) : AbstractC2279u.b1(k10.f53360a.c().d().f(nI, oVar)) : null;
        return listB1 == null ? AbstractC2279u.m() : listB1;
    }

    private final InterfaceC7374h o(Ze.p pVar, EnumC5673d enumC5673d) {
        return new C5878a(this.f53360a.h(), new G(this, pVar, enumC5673d));
    }

    public static final List p(K k10, Ze.p pVar, EnumC5673d enumC5673d) {
        N nI = k10.i(k10.f53360a.e());
        List listC = nI != null ? k10.f53360a.c().d().c(nI, pVar, enumC5673d) : null;
        return listC == null ? AbstractC2279u.m() : listC;
    }

    private final void q(of.O o10, c0 c0Var, c0 c0Var2, List list, List list2, List list3, qf.S s10, ye.E e10, AbstractC7242u abstractC7242u, Map map) {
        o10.o1(c0Var, c0Var2, list, list2, list3, s10, e10, abstractC7242u, map);
    }

    private final int t(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    public static final InterfaceC6045j v(K k10, Se.o oVar, of.N n10) {
        return k10.f53360a.h().g(new I(k10, oVar, n10));
    }

    public static final AbstractC4598g w(K k10, Se.o oVar, of.N n10) {
        N nI = k10.i(k10.f53360a.e());
        AbstractC5504s.e(nI);
        InterfaceC5674e interfaceC5674eD = k10.f53360a.c().d();
        qf.S returnType = n10.getReturnType();
        AbstractC5504s.g(returnType, "getReturnType(...)");
        return (AbstractC4598g) interfaceC5674eD.k(nI, oVar, returnType);
    }

    public static final InterfaceC6045j x(K k10, Se.o oVar, of.N n10) {
        return k10.f53360a.h().g(new J(k10, oVar, n10));
    }

    public static final AbstractC4598g y(K k10, Se.o oVar, of.N n10) {
        N nI = k10.i(k10.f53360a.e());
        AbstractC5504s.e(nI);
        InterfaceC5674e interfaceC5674eD = k10.f53360a.c().d();
        qf.S returnType = n10.getReturnType();
        AbstractC5504s.g(returnType, "getReturnType(...)");
        return (AbstractC4598g) interfaceC5674eD.l(nI, oVar, returnType);
    }

    public final InterfaceC7226d r(Se.e proto, boolean z10) {
        AbstractC5504s.h(proto, "proto");
        InterfaceC7235m interfaceC7235mE = this.f53360a.e();
        AbstractC5504s.f(interfaceC7235mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) interfaceC7235mE;
        int iO = proto.O();
        EnumC5673d enumC5673d = EnumC5673d.FUNCTION;
        C5880c c5880c = new C5880c(interfaceC7227e, null, j(proto, iO, enumC5673d), z10, InterfaceC7224b.a.DECLARATION, proto, this.f53360a.g(), this.f53360a.j(), this.f53360a.k(), this.f53360a.d(), null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null);
        K kF = C5685p.b(this.f53360a, c5880c, AbstractC2279u.m(), null, null, null, null, 60, null).f();
        List listR = proto.R();
        AbstractC5504s.g(listR, "getValueParameterList(...)");
        c5880c.q1(kF.B(listR, proto, enumC5673d), P.a(O.f53376a, (Se.y) Ue.b.f19548d.d(proto.O())));
        c5880c.g1(interfaceC7227e.p());
        c5880c.W0(interfaceC7227e.m0());
        c5880c.Y0(!Ue.b.f19559o.d(proto.O()).booleanValue());
        return c5880c;
    }

    public final g0 s(Se.j proto) {
        qf.S sU;
        AbstractC5504s.h(proto, "proto");
        int iH0 = proto.x0() ? proto.h0() : t(proto.j0());
        EnumC5673d enumC5673d = EnumC5673d.FUNCTION;
        InterfaceC7374h interfaceC7374hJ = j(proto, iH0, enumC5673d);
        InterfaceC7374h interfaceC7374hO = Ue.g.g(proto) ? o(proto, enumC5673d) : InterfaceC7374h.f66223k0.b();
        of.O o10 = new of.O(this.f53360a.e(), null, interfaceC7374hJ, L.b(this.f53360a.g(), proto.i0()), P.b(O.f53376a, (Se.k) Ue.b.f19560p.d(iH0)), proto, this.f53360a.g(), this.f53360a.j(), AbstractC5504s.c(ff.e.o(this.f53360a.e()).b(L.b(this.f53360a.g(), proto.i0())), Q.f53388a) ? Ue.i.f19583b.b() : this.f53360a.k(), this.f53360a.d(), null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null);
        C5685p c5685p = this.f53360a;
        List listQ0 = proto.q0();
        AbstractC5504s.g(listQ0, "getTypeParameterList(...)");
        C5685p c5685pB = C5685p.b(c5685p, o10, listQ0, null, null, null, null, 60, null);
        Se.r rVarK = Ue.g.k(proto, this.f53360a.j());
        c0 c0VarI = (rVarK == null || (sU = c5685pB.i().u(rVarK)) == null) ? null : bf.h.i(o10, sU, interfaceC7374hO);
        c0 c0VarL = l();
        List listC = Ue.g.c(proto, this.f53360a.j());
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            c0 c0VarA = A((Se.r) obj, c5685pB, o10, i10);
            if (c0VarA != null) {
                arrayList.add(c0VarA);
            }
            i10 = i11;
        }
        List listM = c5685pB.i().m();
        K kF = c5685pB.f();
        List listU0 = proto.u0();
        AbstractC5504s.g(listU0, "getValueParameterList(...)");
        List listB = kF.B(listU0, proto, EnumC5673d.FUNCTION);
        qf.S sU2 = c5685pB.i().u(Ue.g.m(proto, this.f53360a.j()));
        O o11 = O.f53376a;
        q(o10, c0VarI, c0VarL, arrayList, listM, listB, sU2, o11.b((Se.l) Ue.b.f19549e.d(iH0)), P.a(o11, (Se.y) Ue.b.f19548d.d(iH0)), Ud.S.i());
        Boolean boolD = Ue.b.f19561q.d(iH0);
        AbstractC5504s.g(boolD, "get(...)");
        o10.f1(boolD.booleanValue());
        Boolean boolD2 = Ue.b.f19562r.d(iH0);
        AbstractC5504s.g(boolD2, "get(...)");
        o10.c1(boolD2.booleanValue());
        Boolean boolD3 = Ue.b.f19565u.d(iH0);
        AbstractC5504s.g(boolD3, "get(...)");
        o10.X0(boolD3.booleanValue());
        Boolean boolD4 = Ue.b.f19563s.d(iH0);
        AbstractC5504s.g(boolD4, "get(...)");
        o10.e1(boolD4.booleanValue());
        Boolean boolD5 = Ue.b.f19564t.d(iH0);
        AbstractC5504s.g(boolD5, "get(...)");
        o10.i1(boolD5.booleanValue());
        Boolean boolD6 = Ue.b.f19566v.d(iH0);
        AbstractC5504s.g(boolD6, "get(...)");
        o10.h1(boolD6.booleanValue());
        Boolean boolD7 = Ue.b.f19567w.d(iH0);
        AbstractC5504s.g(boolD7, "get(...)");
        o10.W0(boolD7.booleanValue());
        o10.Y0(!Ue.b.f19568x.d(iH0).booleanValue());
        Pair pairA = this.f53360a.c().h().a(proto, o10, this.f53360a.j(), c5685pB.i());
        if (pairA != null) {
            o10.U0((InterfaceC7223a.InterfaceC0983a) pairA.c(), pairA.d());
        }
        return o10;
    }

    public final ye.Z u(Se.o proto) {
        C5685p c5685p;
        b.d dVar;
        b.d dVar2;
        Be.L lD;
        Be.L l10;
        boolean z10;
        Be.M m10;
        qf.S sU;
        AbstractC5504s.h(proto, "proto");
        int iF0 = proto.t0() ? proto.f0() : t(proto.i0());
        InterfaceC7235m interfaceC7235mE = this.f53360a.e();
        InterfaceC7374h interfaceC7374hJ = j(proto, iF0, EnumC5673d.PROPERTY);
        O o10 = O.f53376a;
        ye.E eB = o10.b((Se.l) Ue.b.f19549e.d(iF0));
        AbstractC7242u abstractC7242uA = P.a(o10, (Se.y) Ue.b.f19548d.d(iF0));
        Boolean boolD = Ue.b.f19569y.d(iF0);
        AbstractC5504s.g(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        Xe.f fVarB = L.b(this.f53360a.g(), proto.h0());
        InterfaceC7224b.a aVarB = P.b(o10, (Se.k) Ue.b.f19560p.d(iF0));
        Boolean boolD2 = Ue.b.f19531C.d(iF0);
        AbstractC5504s.g(boolD2, "get(...)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        Boolean boolD3 = Ue.b.f19530B.d(iF0);
        AbstractC5504s.g(boolD3, "get(...)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        Boolean boolD4 = Ue.b.f19533E.d(iF0);
        AbstractC5504s.g(boolD4, "get(...)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        Boolean boolD5 = Ue.b.f19534F.d(iF0);
        AbstractC5504s.g(boolD5, "get(...)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        Boolean boolD6 = Ue.b.f19535G.d(iF0);
        AbstractC5504s.g(boolD6, "get(...)");
        int i10 = iF0;
        of.N n10 = new of.N(interfaceC7235mE, null, interfaceC7374hJ, eB, abstractC7242uA, zBooleanValue, fVarB, aVarB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), proto, this.f53360a.g(), this.f53360a.j(), this.f53360a.k(), this.f53360a.d());
        C5685p c5685p2 = this.f53360a;
        List listR0 = proto.r0();
        AbstractC5504s.g(listR0, "getTypeParameterList(...)");
        C5685p c5685pB = C5685p.b(c5685p2, n10, listR0, null, null, null, null, 60, null);
        Boolean boolD7 = Ue.b.f19570z.d(i10);
        AbstractC5504s.g(boolD7, "get(...)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        InterfaceC7374h interfaceC7374hO = (zBooleanValue6 && Ue.g.h(proto)) ? o(proto, EnumC5673d.PROPERTY_GETTER) : InterfaceC7374h.f66223k0.b();
        qf.S sU2 = c5685pB.i().u(Ue.g.n(proto, this.f53360a.j()));
        List listM = c5685pB.i().m();
        c0 c0VarL = l();
        Se.r rVarL = Ue.g.l(proto, this.f53360a.j());
        c0 c0VarI = (rVarL == null || (sU = c5685pB.i().u(rVarL)) == null) ? null : bf.h.i(n10, sU, interfaceC7374hO);
        List listD = Ue.g.d(proto, this.f53360a.j());
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listD, 10));
        int i11 = 0;
        for (Object obj : listD) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC2279u.w();
            }
            arrayList.add(A((Se.r) obj, c5685pB, n10, i11));
            i11 = i12;
        }
        n10.b1(sU2, listM, c0VarL, c0VarI, arrayList);
        Boolean boolD8 = Ue.b.f19547c.d(i10);
        AbstractC5504s.g(boolD8, "get(...)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        b.d dVar3 = Ue.b.f19548d;
        Se.y yVar = (Se.y) dVar3.d(i10);
        b.d dVar4 = Ue.b.f19549e;
        int iB = Ue.b.b(zBooleanValue7, yVar, (Se.l) dVar4.d(i10), false, false, false);
        if (zBooleanValue6) {
            int iG0 = proto.u0() ? proto.g0() : iB;
            Boolean boolD9 = Ue.b.f19539K.d(iG0);
            AbstractC5504s.g(boolD9, "get(...)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            Boolean boolD10 = Ue.b.f19540L.d(iG0);
            AbstractC5504s.g(boolD10, "get(...)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            Boolean boolD11 = Ue.b.f19541M.d(iG0);
            AbstractC5504s.g(boolD11, "get(...)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            InterfaceC7374h interfaceC7374hJ2 = j(proto, iG0, EnumC5673d.PROPERTY_GETTER);
            if (zBooleanValue8) {
                O o11 = O.f53376a;
                dVar = dVar3;
                c5685p = c5685pB;
                dVar2 = dVar4;
                lD = new Be.L(n10, interfaceC7374hJ2, o11.b((Se.l) dVar4.d(iG0)), P.a(o11, (Se.y) dVar3.d(iG0)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, n10.h(), null, h0.f65112a);
            } else {
                c5685p = c5685pB;
                dVar = dVar3;
                dVar2 = dVar4;
                lD = bf.h.d(n10, interfaceC7374hJ2);
                AbstractC5504s.e(lD);
            }
            lD.P0(n10.getReturnType());
        } else {
            c5685p = c5685pB;
            dVar = dVar3;
            dVar2 = dVar4;
            lD = null;
        }
        if (Ue.b.f19529A.d(i10).booleanValue()) {
            if (proto.B0()) {
                iB = proto.n0();
            }
            int i13 = iB;
            Boolean boolD12 = Ue.b.f19539K.d(i13);
            AbstractC5504s.g(boolD12, "get(...)");
            boolean zBooleanValue11 = boolD12.booleanValue();
            Boolean boolD13 = Ue.b.f19540L.d(i13);
            AbstractC5504s.g(boolD13, "get(...)");
            boolean zBooleanValue12 = boolD13.booleanValue();
            Boolean boolD14 = Ue.b.f19541M.d(i13);
            AbstractC5504s.g(boolD14, "get(...)");
            boolean zBooleanValue13 = boolD14.booleanValue();
            EnumC5673d enumC5673d = EnumC5673d.PROPERTY_SETTER;
            InterfaceC7374h interfaceC7374hJ3 = j(proto, i13, enumC5673d);
            if (zBooleanValue11) {
                O o12 = O.f53376a;
                l10 = lD;
                z10 = true;
                Be.M m11 = new Be.M(n10, interfaceC7374hJ3, o12.b((Se.l) dVar2.d(i13)), P.a(o12, (Se.y) dVar.d(i13)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, n10.h(), null, h0.f65112a);
                m10 = m11;
                m10.Q0((t0) AbstractC2279u.M0(C5685p.b(c5685p, m11, AbstractC2279u.m(), null, null, null, null, 60, null).f().B(AbstractC2279u.e(proto.o0()), proto, enumC5673d)));
            } else {
                l10 = lD;
                z10 = true;
                Be.M mE = bf.h.e(n10, interfaceC7374hJ3, InterfaceC7374h.f66223k0.b());
                AbstractC5504s.e(mE);
                m10 = mE;
            }
        } else {
            l10 = lD;
            z10 = true;
            m10 = null;
        }
        if (Ue.b.f19532D.d(i10).booleanValue()) {
            n10.L0(new C(this, proto, n10));
        }
        InterfaceC7235m interfaceC7235mE2 = this.f53360a.e();
        InterfaceC7227e interfaceC7227e = interfaceC7235mE2 instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7235mE2 : null;
        if ((interfaceC7227e != null ? interfaceC7227e.h() : null) == EnumC7228f.f65101f) {
            n10.L0(new D(this, proto, n10));
        }
        n10.V0(l10, m10, new Be.r(m(proto, false), n10), new Be.r(m(proto, z10), n10));
        return n10;
    }

    public final l0 z(Se.s proto) {
        AbstractC5504s.h(proto, "proto");
        InterfaceC7374h.a aVar = InterfaceC7374h.f66223k0;
        List<Se.b> listT = proto.T();
        AbstractC5504s.g(listT, "getAnnotationList(...)");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listT, 10));
        for (Se.b bVar : listT) {
            C5676g c5676g = this.f53361b;
            AbstractC5504s.e(bVar);
            arrayList.add(c5676g.a(bVar, this.f53360a.g()));
        }
        of.P p10 = new of.P(this.f53360a.h(), this.f53360a.e(), aVar.a(arrayList), L.b(this.f53360a.g(), proto.b0()), P.a(O.f53376a, (Se.y) Ue.b.f19548d.d(proto.a0())), proto, this.f53360a.g(), this.f53360a.j(), this.f53360a.k(), this.f53360a.d());
        C5685p c5685p = this.f53360a;
        List listE0 = proto.e0();
        AbstractC5504s.g(listE0, "getTypeParameterList(...)");
        C5685p c5685pB = C5685p.b(c5685p, p10, listE0, null, null, null, null, 60, null);
        p10.W0(c5685pB.i().m(), c5685pB.i().o(Ue.g.r(proto, this.f53360a.j()), false), c5685pB.i().o(Ue.g.e(proto, this.f53360a.j()), false));
        return p10;
    }
}
