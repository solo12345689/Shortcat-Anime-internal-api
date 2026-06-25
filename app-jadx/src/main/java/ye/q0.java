package ye;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class q0 {
    public static final X d(qf.S s10) {
        AbstractC5504s.h(s10, "<this>");
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        return e(s10, interfaceC7230hP instanceof InterfaceC7231i ? (InterfaceC7231i) interfaceC7230hP : null, 0);
    }

    private static final X e(qf.S s10, InterfaceC7231i interfaceC7231i, int i10) {
        if (interfaceC7231i == null || sf.l.m(interfaceC7231i)) {
            return null;
        }
        int size = interfaceC7231i.q().size() + i10;
        if (interfaceC7231i.A()) {
            List listSubList = s10.L0().subList(i10, size);
            InterfaceC7235m interfaceC7235mB = interfaceC7231i.b();
            return new X(interfaceC7231i, listSubList, e(s10, interfaceC7235mB instanceof InterfaceC7231i ? (InterfaceC7231i) interfaceC7235mB : null, size));
        }
        if (size != s10.L0().size()) {
            bf.i.E(interfaceC7231i);
        }
        return new X(interfaceC7231i, s10.L0().subList(i10, s10.L0().size()), null);
    }

    private static final C7225c f(m0 m0Var, InterfaceC7235m interfaceC7235m, int i10) {
        return new C7225c(m0Var, interfaceC7235m, i10);
    }

    public static final List g(InterfaceC7231i interfaceC7231i) {
        List listM;
        Object next;
        qf.v0 v0VarL;
        AbstractC5504s.h(interfaceC7231i, "<this>");
        List listQ = interfaceC7231i.q();
        AbstractC5504s.g(listQ, "getDeclaredTypeParameters(...)");
        if (!interfaceC7231i.A() && !(interfaceC7231i.b() instanceof InterfaceC7223a)) {
            return listQ;
        }
        List listT = Cf.l.T(Cf.l.E(Cf.l.z(Cf.l.R(ff.e.u(interfaceC7231i), n0.f65116a), o0.f65117a), p0.f65118a));
        Iterator it = ff.e.u(interfaceC7231i).iterator();
        while (true) {
            listM = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC7227e) {
                break;
            }
        }
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) next;
        if (interfaceC7227e != null && (v0VarL = interfaceC7227e.l()) != null) {
            listM = v0VarL.getParameters();
        }
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        if (listT.isEmpty() && listM.isEmpty()) {
            List listQ2 = interfaceC7231i.q();
            AbstractC5504s.g(listQ2, "getDeclaredTypeParameters(...)");
            return listQ2;
        }
        List<m0> listI0 = AbstractC2279u.I0(listT, listM);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listI0, 10));
        for (m0 m0Var : listI0) {
            AbstractC5504s.e(m0Var);
            arrayList.add(f(m0Var, interfaceC7231i, listQ.size()));
        }
        return AbstractC2279u.I0(listQ, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC7235m it) {
        AbstractC5504s.h(it, "it");
        return it instanceof InterfaceC7223a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC7235m it) {
        AbstractC5504s.h(it, "it");
        return !(it instanceof InterfaceC7234l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cf.i j(InterfaceC7235m it) {
        AbstractC5504s.h(it, "it");
        List typeParameters = ((InterfaceC7223a) it).getTypeParameters();
        AbstractC5504s.g(typeParameters, "getTypeParameters(...)");
        return AbstractC2279u.c0(typeParameters);
    }
}
