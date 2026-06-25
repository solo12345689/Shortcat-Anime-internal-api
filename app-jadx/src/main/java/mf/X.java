package mf;

import Se.r;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import of.C5878a;
import qf.AbstractC6183d0;
import qf.AbstractC6191h0;
import qf.B0;
import qf.C6193i0;
import qf.C6197k0;
import qf.C6214y;
import qf.D0;
import qf.N0;
import qf.q0;
import qf.r0;
import qf.v0;
import vf.AbstractC6867d;
import ye.AbstractC7246y;
import ye.InterfaceC7223a;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.l0;
import ye.m0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class X {

    /* JADX INFO: renamed from: a */
    private final C5685p f53396a;

    /* JADX INFO: renamed from: b */
    private final X f53397b;

    /* JADX INFO: renamed from: c */
    private final String f53398c;

    /* JADX INFO: renamed from: d */
    private final String f53399d;

    /* JADX INFO: renamed from: e */
    private final Function1 f53400e;

    /* JADX INFO: renamed from: f */
    private final Function1 f53401f;

    /* JADX INFO: renamed from: g */
    private final Map f53402g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends kotlin.jvm.internal.F {

        /* JADX INFO: renamed from: b */
        public static final a f53403b = ;

        a() {
        }

        @Override // kotlin.jvm.internal.F, pe.InterfaceC6025o
        public Object get(Object obj) {
            return ((Xe.b) obj).e();
        }
    }

    public X(C5685p c10, X x10, List typeParameterProtos, String debugName, String containerPresentableName) {
        Map linkedHashMap;
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(typeParameterProtos, "typeParameterProtos");
        AbstractC5504s.h(debugName, "debugName");
        AbstractC5504s.h(containerPresentableName, "containerPresentableName");
        this.f53396a = c10;
        this.f53397b = x10;
        this.f53398c = debugName;
        this.f53399d = containerPresentableName;
        this.f53400e = c10.h().d(new S(this));
        this.f53401f = c10.h().d(new T(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = Ud.S.i();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Se.t tVar = (Se.t) it.next();
                linkedHashMap.put(Integer.valueOf(tVar.N()), new of.S(this.f53396a, tVar, i10));
                i10++;
            }
        }
        this.f53402g = linkedHashMap;
    }

    public static final int A(Se.r it) {
        AbstractC5504s.h(it, "it");
        return it.V();
    }

    public static final InterfaceC7230h f(X x10, int i10) {
        return x10.g(i10);
    }

    private final InterfaceC7230h g(int i10) {
        Xe.b bVarA = L.a(this.f53396a.g(), i10);
        return bVarA.i() ? this.f53396a.c().b(bVarA) : AbstractC7246y.c(this.f53396a.c().q(), bVarA);
    }

    private final AbstractC6183d0 h(int i10) {
        if (L.a(this.f53396a.g(), i10).i()) {
            return this.f53396a.c().o().a();
        }
        return null;
    }

    private final InterfaceC7230h i(int i10) {
        Xe.b bVarA = L.a(this.f53396a.g(), i10);
        if (bVarA.i()) {
            return null;
        }
        return AbstractC7246y.f(this.f53396a.c().q(), bVarA);
    }

    private final AbstractC6183d0 j(qf.S s10, qf.S s11) {
        ve.i iVarN = AbstractC6867d.n(s10);
        InterfaceC7374h annotations = s10.getAnnotations();
        qf.S sK = ve.h.k(s10);
        List listE = ve.h.e(s10);
        List listH0 = AbstractC2279u.h0(ve.h.m(s10), 1);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listH0, 10));
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0) it.next()).getType());
        }
        return ve.h.b(iVarN, annotations, sK, listE, arrayList, null, s11, true).R0(s10.O0());
    }

    private final AbstractC6183d0 k(r0 r0Var, v0 v0Var, List list, boolean z10) {
        List list2;
        AbstractC6183d0 abstractC6183d0L;
        int size;
        int size2 = v0Var.getParameters().size() - list.size();
        if (size2 != 0) {
            abstractC6183d0L = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                v0 v0VarL = v0Var.n().Y(size).l();
                AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
                list2 = list;
                abstractC6183d0L = qf.V.k(r0Var, v0VarL, list2, z10, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            abstractC6183d0L = l(r0Var, v0Var, list2, z10);
        }
        return abstractC6183d0L == null ? sf.l.f59724a.f(sf.k.f59697n0, list2, v0Var, new String[0]) : abstractC6183d0L;
    }

    private final AbstractC6183d0 l(r0 r0Var, v0 v0Var, List list, boolean z10) {
        AbstractC6183d0 abstractC6183d0K = qf.V.k(r0Var, v0Var, list, z10, null, 16, null);
        if (ve.h.q(abstractC6183d0K)) {
            return t(abstractC6183d0K);
        }
        return null;
    }

    private final m0 n(int i10) {
        m0 m0Var = (m0) this.f53402g.get(Integer.valueOf(i10));
        if (m0Var != null) {
            return m0Var;
        }
        X x10 = this.f53397b;
        if (x10 != null) {
            return x10.n(i10);
        }
        return null;
    }

    private static final List p(Se.r rVar, X x10) {
        List listW = rVar.W();
        AbstractC5504s.g(listW, "getArgumentList(...)");
        Se.r rVarJ = Ue.g.j(rVar, x10.f53396a.j());
        List listP = rVarJ != null ? p(rVarJ, x10) : null;
        if (listP == null) {
            listP = AbstractC2279u.m();
        }
        return AbstractC2279u.I0(listW, listP);
    }

    public static /* synthetic */ AbstractC6183d0 q(X x10, Se.r rVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return x10.o(rVar, z10);
    }

    public static final List r(X x10, Se.r rVar) {
        return x10.f53396a.c().d().i(rVar, x10.f53396a.g());
    }

    private final r0 s(List list, InterfaceC7374h interfaceC7374h, v0 v0Var, InterfaceC7235m interfaceC7235m) {
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((q0) it.next()).a(interfaceC7374h, v0Var, interfaceC7235m));
        }
        return r0.f58089b.j(AbstractC2279u.z(arrayList));
    }

    private final AbstractC6183d0 t(qf.S s10) {
        qf.S type;
        B0 b02 = (B0) AbstractC2279u.A0(ve.h.m(s10));
        if (b02 == null || (type = b02.getType()) == null) {
            return null;
        }
        InterfaceC7230h interfaceC7230hP = type.N0().p();
        Xe.c cVarO = interfaceC7230hP != null ? ff.e.o(interfaceC7230hP) : null;
        if (type.L0().size() != 1 || (!AbstractC5504s.c(cVarO, ve.o.f62178v) && !AbstractC5504s.c(cVarO, Y.f53404a))) {
            return (AbstractC6183d0) s10;
        }
        qf.S type2 = ((B0) AbstractC2279u.M0(type.L0())).getType();
        AbstractC5504s.g(type2, "getType(...)");
        InterfaceC7235m interfaceC7235mE = this.f53396a.e();
        InterfaceC7223a interfaceC7223a = interfaceC7235mE instanceof InterfaceC7223a ? (InterfaceC7223a) interfaceC7235mE : null;
        return AbstractC5504s.c(interfaceC7223a != null ? ff.e.k(interfaceC7223a) : null, Q.f53388a) ? j(s10, type2) : j(s10, type2);
    }

    public static final InterfaceC7230h v(X x10, int i10) {
        return x10.i(i10);
    }

    private final B0 w(m0 m0Var, r.b bVar) {
        if (bVar.y() == r.b.c.STAR) {
            return m0Var == null ? new C6193i0(this.f53396a.c().q().n()) : new C6197k0(m0Var);
        }
        O o10 = O.f53376a;
        r.b.c cVarY = bVar.y();
        AbstractC5504s.g(cVarY, "getProjection(...)");
        N0 n0C = o10.c(cVarY);
        Se.r rVarP = Ue.g.p(bVar, this.f53396a.j());
        return rVarP == null ? new D0(sf.l.d(sf.k.f59670X0, bVar.toString())) : new D0(n0C, u(rVarP));
    }

    private final v0 x(Se.r rVar) {
        InterfaceC7230h interfaceC7230hY;
        Object next;
        if (rVar.m0()) {
            interfaceC7230hY = (InterfaceC7230h) this.f53400e.invoke(Integer.valueOf(rVar.X()));
            if (interfaceC7230hY == null) {
                interfaceC7230hY = y(this, rVar, rVar.X());
            }
        } else if (rVar.v0()) {
            interfaceC7230hY = n(rVar.i0());
            if (interfaceC7230hY == null) {
                return sf.l.f59724a.e(sf.k.f59693l0, String.valueOf(rVar.i0()), this.f53399d);
            }
        } else if (rVar.w0()) {
            String string = this.f53396a.g().getString(rVar.j0());
            Iterator it = m().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC5504s.c(((m0) next).getName().b(), string)) {
                    break;
                }
            }
            interfaceC7230hY = (m0) next;
            if (interfaceC7230hY == null) {
                return sf.l.f59724a.e(sf.k.f59695m0, string, this.f53396a.e().toString());
            }
        } else {
            if (!rVar.u0()) {
                return sf.l.f59724a.e(sf.k.f59701p0, new String[0]);
            }
            interfaceC7230hY = (InterfaceC7230h) this.f53401f.invoke(Integer.valueOf(rVar.h0()));
            if (interfaceC7230hY == null) {
                interfaceC7230hY = y(this, rVar, rVar.h0());
            }
        }
        v0 v0VarL = interfaceC7230hY.l();
        AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
        return v0VarL;
    }

    private static final InterfaceC7227e y(X x10, Se.r rVar, int i10) {
        Xe.b bVarA = L.a(x10.f53396a.g(), i10);
        List listU = Cf.l.U(Cf.l.K(Cf.l.p(rVar, new V(x10)), W.f53395a));
        int iW = Cf.l.w(Cf.l.p(bVarA, a.f53403b));
        while (listU.size() < iW) {
            listU.add(0);
        }
        return x10.f53396a.c().r().d(bVarA, listU);
    }

    public static final Se.r z(X x10, Se.r it) {
        AbstractC5504s.h(it, "it");
        return Ue.g.j(it, x10.f53396a.j());
    }

    public final List m() {
        return AbstractC2279u.b1(this.f53402g.values());
    }

    public final AbstractC6183d0 o(Se.r proto, boolean z10) {
        AbstractC6183d0 abstractC6183d0C;
        AbstractC6183d0 abstractC6183d0J;
        AbstractC5504s.h(proto, "proto");
        AbstractC6183d0 abstractC6183d0H = proto.m0() ? h(proto.X()) : proto.u0() ? h(proto.h0()) : null;
        if (abstractC6183d0H != null) {
            return abstractC6183d0H;
        }
        v0 v0VarX = x(proto);
        if (sf.l.m(v0VarX.p())) {
            return sf.l.f59724a.c(sf.k.f59664S0, v0VarX, v0VarX.toString());
        }
        C5878a c5878a = new C5878a(this.f53396a.h(), new U(this, proto));
        r0 r0VarS = s(this.f53396a.c().v(), c5878a, v0VarX, this.f53396a.e());
        List listP = p(proto, this);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listP, 10));
        int i10 = 0;
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            List parameters = v0VarX.getParameters();
            AbstractC5504s.g(parameters, "getParameters(...)");
            arrayList.add(w((m0) AbstractC2279u.p0(parameters, i10), (r.b) obj));
            i10 = i11;
        }
        List listB1 = AbstractC2279u.b1(arrayList);
        InterfaceC7230h interfaceC7230hP = v0VarX.p();
        if (z10 && (interfaceC7230hP instanceof l0)) {
            AbstractC6183d0 abstractC6183d0C2 = qf.V.c((l0) interfaceC7230hP, listB1);
            abstractC6183d0C = abstractC6183d0C2.R0(qf.W.b(abstractC6183d0C2) || proto.e0()).T0(s(this.f53396a.c().v(), InterfaceC7374h.f66223k0.a(AbstractC2279u.G0(c5878a, abstractC6183d0C2.getAnnotations())), v0VarX, this.f53396a.e()));
        } else if (Ue.b.f19545a.d(proto.a0()).booleanValue()) {
            abstractC6183d0C = k(r0VarS, v0VarX, listB1, proto.e0());
        } else {
            AbstractC6183d0 abstractC6183d0K = qf.V.k(r0VarS, v0VarX, listB1, proto.e0(), null, 16, null);
            if (Ue.b.f19546b.d(proto.a0()).booleanValue()) {
                abstractC6183d0C = C6214y.a.c(C6214y.f58124d, abstractC6183d0K, true, false, 4, null);
                if (abstractC6183d0C == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC6183d0K + '\'').toString());
                }
            } else {
                abstractC6183d0C = abstractC6183d0K;
            }
        }
        Se.r rVarA = Ue.g.a(proto, this.f53396a.j());
        return (rVarA == null || (abstractC6183d0J = AbstractC6191h0.j(abstractC6183d0C, o(rVarA, false))) == null) ? abstractC6183d0C : abstractC6183d0J;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f53398c);
        if (this.f53397b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f53397b.f53398c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final qf.S u(Se.r proto) {
        AbstractC5504s.h(proto, "proto");
        if (!proto.o0()) {
            return o(proto, true);
        }
        String string = this.f53396a.g().getString(proto.b0());
        AbstractC6183d0 abstractC6183d0Q = q(this, proto, false, 2, null);
        Se.r rVarF = Ue.g.f(proto, this.f53396a.j());
        AbstractC5504s.e(rVarF);
        return this.f53396a.c().m().a(proto, string, abstractC6183d0Q, q(this, rVarF, false, 2, null));
    }
}
