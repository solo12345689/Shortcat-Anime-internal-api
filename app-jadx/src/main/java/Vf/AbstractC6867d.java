package vf;

import Td.r;
import Ud.AbstractC2279u;
import Ud.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.B0;
import qf.C6197k0;
import qf.C6214y;
import qf.D0;
import qf.F0;
import qf.I;
import qf.J0;
import qf.L0;
import qf.M0;
import qf.N0;
import qf.S;
import qf.V;
import qf.s0;
import qf.v0;
import rf.InterfaceC6315e;
import ve.i;
import ye.EnumC7228f;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7231i;
import ye.l0;
import ye.m0;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: vf.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6867d {
    public static final S A(S s10) {
        AbstractC5504s.h(s10, "<this>");
        S sN = J0.n(s10);
        AbstractC5504s.g(sN, "makeNotNullable(...)");
        return sN;
    }

    public static final S B(S s10) {
        AbstractC5504s.h(s10, "<this>");
        S sO = J0.o(s10);
        AbstractC5504s.g(sO, "makeNullable(...)");
        return sO;
    }

    public static final S C(S s10, InterfaceC7374h newAnnotations) {
        AbstractC5504s.h(s10, "<this>");
        AbstractC5504s.h(newAnnotations, "newAnnotations");
        return (s10.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? s10 : s10.Q0().T0(s0.a(s10.M0(), newAnnotations));
    }

    public static final S D(S s10) {
        M0 m0F;
        AbstractC5504s.h(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof I) {
            I i10 = (I) m0Q0;
            AbstractC6183d0 abstractC6183d0V0 = i10.V0();
            if (!abstractC6183d0V0.N0().getParameters().isEmpty() && abstractC6183d0V0.N0().p() != null) {
                List parameters = abstractC6183d0V0.N0().getParameters();
                AbstractC5504s.g(parameters, "getParameters(...)");
                ArrayList arrayList = new ArrayList(AbstractC2279u.x(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C6197k0((m0) it.next()));
                }
                abstractC6183d0V0 = F0.f(abstractC6183d0V0, arrayList, null, 2, null);
            }
            AbstractC6183d0 abstractC6183d0W0 = i10.W0();
            if (!abstractC6183d0W0.N0().getParameters().isEmpty() && abstractC6183d0W0.N0().p() != null) {
                List parameters2 = abstractC6183d0W0.N0().getParameters();
                AbstractC5504s.g(parameters2, "getParameters(...)");
                ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C6197k0((m0) it2.next()));
                }
                abstractC6183d0W0 = F0.f(abstractC6183d0W0, arrayList2, null, 2, null);
            }
            m0F = V.e(abstractC6183d0V0, abstractC6183d0W0);
        } else {
            if (!(m0Q0 instanceof AbstractC6183d0)) {
                throw new r();
            }
            AbstractC6183d0 abstractC6183d0 = (AbstractC6183d0) m0Q0;
            boolean zIsEmpty = abstractC6183d0.N0().getParameters().isEmpty();
            m0F = abstractC6183d0;
            if (!zIsEmpty) {
                InterfaceC7230h interfaceC7230hP = abstractC6183d0.N0().p();
                m0F = abstractC6183d0;
                if (interfaceC7230hP != null) {
                    List parameters3 = abstractC6183d0.N0().getParameters();
                    AbstractC5504s.g(parameters3, "getParameters(...)");
                    ArrayList arrayList3 = new ArrayList(AbstractC2279u.x(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C6197k0((m0) it3.next()));
                    }
                    m0F = F0.f(abstractC6183d0, arrayList3, null, 2, null);
                }
            }
        }
        return L0.b(m0F, m0Q0);
    }

    public static final boolean E(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return e(s10, C6866c.f62310a);
    }

    public static final boolean F(M0 it) {
        AbstractC5504s.h(it, "it");
        InterfaceC7230h interfaceC7230hP = it.N0().p();
        if (interfaceC7230hP != null) {
            return (interfaceC7230hP instanceof l0) || (interfaceC7230hP instanceof m0);
        }
        return false;
    }

    public static final B0 d(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return new D0(s10);
    }

    public static final boolean e(S s10, Function1 predicate) {
        AbstractC5504s.h(s10, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        return J0.c(s10, predicate);
    }

    private static final boolean f(S s10, v0 v0Var, Set set) {
        boolean zF;
        if (AbstractC5504s.c(s10.N0(), v0Var)) {
            return true;
        }
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        InterfaceC7231i interfaceC7231i = interfaceC7230hP instanceof InterfaceC7231i ? (InterfaceC7231i) interfaceC7230hP : null;
        List listQ = interfaceC7231i != null ? interfaceC7231i.q() : null;
        Iterable<L> iterableH1 = AbstractC2279u.h1(s10.L0());
        if ((iterableH1 instanceof Collection) && ((Collection) iterableH1).isEmpty()) {
            return false;
        }
        for (L l10 : iterableH1) {
            int iA = l10.a();
            B0 b02 = (B0) l10.b();
            m0 m0Var = listQ != null ? (m0) AbstractC2279u.p0(listQ, iA) : null;
            if ((m0Var == null || set == null || !set.contains(m0Var)) && !b02.a()) {
                S type = b02.getType();
                AbstractC5504s.g(type, "getType(...)");
                zF = f(type, v0Var, set);
            } else {
                zF = false;
            }
            if (zF) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return e(s10, C6865b.f62309a);
    }

    public static final boolean h(M0 it) {
        AbstractC5504s.h(it, "it");
        InterfaceC7230h interfaceC7230hP = it.N0().p();
        if (interfaceC7230hP != null) {
            return x(interfaceC7230hP);
        }
        return false;
    }

    public static final boolean i(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return J0.c(s10, C6864a.f62308a);
    }

    public static final Boolean j(M0 m02) {
        return Boolean.valueOf(J0.m(m02));
    }

    public static final B0 k(S type, N0 projectionKind, m0 m0Var) {
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(projectionKind, "projectionKind");
        if ((m0Var != null ? m0Var.m() : null) == projectionKind) {
            projectionKind = N0.f57999e;
        }
        return new D0(projectionKind, type);
    }

    public static final Set l(S s10, Set set) {
        AbstractC5504s.h(s10, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(s10, s10, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void m(S s10, S s11, Set set, Set set2) {
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP instanceof m0) {
            if (!AbstractC5504s.c(s10.N0(), s11.N0())) {
                set.add(interfaceC7230hP);
                return;
            }
            for (S s12 : ((m0) interfaceC7230hP).getUpperBounds()) {
                AbstractC5504s.e(s12);
                m(s12, s11, set, set2);
            }
            return;
        }
        InterfaceC7230h interfaceC7230hP2 = s10.N0().p();
        InterfaceC7231i interfaceC7231i = interfaceC7230hP2 instanceof InterfaceC7231i ? (InterfaceC7231i) interfaceC7230hP2 : null;
        List listQ = interfaceC7231i != null ? interfaceC7231i.q() : null;
        int i10 = 0;
        for (B0 b02 : s10.L0()) {
            int i11 = i10 + 1;
            m0 m0Var = listQ != null ? (m0) AbstractC2279u.p0(listQ, i10) : null;
            if ((m0Var == null || set2 == null || !set2.contains(m0Var)) && !b02.a() && !AbstractC2279u.e0(set, b02.getType().N0().p()) && !AbstractC5504s.c(b02.getType().N0(), s11.N0())) {
                S type = b02.getType();
                AbstractC5504s.g(type, "getType(...)");
                m(type, s11, set, set2);
            }
            i10 = i11;
        }
    }

    public static final i n(S s10) {
        AbstractC5504s.h(s10, "<this>");
        i iVarN = s10.N0().n();
        AbstractC5504s.g(iVarN, "getBuiltIns(...)");
        return iVarN;
    }

    public static final S o(m0 m0Var) {
        Object obj;
        AbstractC5504s.h(m0Var, "<this>");
        List upperBounds = m0Var.getUpperBounds();
        AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = m0Var.getUpperBounds();
        AbstractC5504s.g(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC7230h interfaceC7230hP = ((S) next).N0().p();
            InterfaceC7227e interfaceC7227e = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
            if (interfaceC7227e != null && interfaceC7227e.h() != EnumC7228f.f65098c && interfaceC7227e.h() != EnumC7228f.f65101f) {
                obj = next;
                break;
            }
        }
        S s10 = (S) obj;
        if (s10 != null) {
            return s10;
        }
        List upperBounds3 = m0Var.getUpperBounds();
        AbstractC5504s.g(upperBounds3, "getUpperBounds(...)");
        Object objM0 = AbstractC2279u.m0(upperBounds3);
        AbstractC5504s.g(objM0, "first(...)");
        return (S) objM0;
    }

    public static final boolean p(m0 typeParameter) {
        AbstractC5504s.h(typeParameter, "typeParameter");
        return r(typeParameter, null, null, 6, null);
    }

    public static final boolean q(m0 typeParameter, v0 v0Var, Set set) {
        AbstractC5504s.h(typeParameter, "typeParameter");
        List<S> upperBounds = typeParameter.getUpperBounds();
        AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
        if (upperBounds != null && upperBounds.isEmpty()) {
            return false;
        }
        for (S s10 : upperBounds) {
            AbstractC5504s.e(s10);
            if (f(s10, typeParameter.p().N0(), set) && (v0Var == null || AbstractC5504s.c(s10.N0(), v0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(m0 m0Var, v0 v0Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return q(m0Var, v0Var, set);
    }

    public static final boolean s(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return i.g0(s10);
    }

    public static final boolean t(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return i.o0(s10);
    }

    public static final boolean u(S s10) {
        AbstractC5504s.h(s10, "<this>");
        if (!(s10 instanceof C6214y)) {
            return false;
        }
        ((C6214y) s10).Z0();
        return false;
    }

    public static final boolean v(S s10) {
        AbstractC5504s.h(s10, "<this>");
        if (!(s10 instanceof C6214y)) {
            return false;
        }
        ((C6214y) s10).Z0();
        return false;
    }

    public static final boolean w(S s10, S superType) {
        AbstractC5504s.h(s10, "<this>");
        AbstractC5504s.h(superType, "superType");
        return InterfaceC6315e.f58773a.a(s10, superType);
    }

    public static final boolean x(InterfaceC7230h interfaceC7230h) {
        AbstractC5504s.h(interfaceC7230h, "<this>");
        return (interfaceC7230h instanceof m0) && (((m0) interfaceC7230h).b() instanceof l0);
    }

    public static final boolean y(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return J0.m(s10);
    }

    public static final boolean z(S type) {
        AbstractC5504s.h(type, "type");
        return (type instanceof sf.i) && ((sf.i) type).X0().c();
    }
}
