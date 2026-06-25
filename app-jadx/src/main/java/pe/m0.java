package Pe;

import He.EnumC1656c;
import Le.C1878j;
import Le.C1882n;
import Oe.InterfaceC1980a;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import qf.InterfaceC6181c0;
import qf.J0;
import qf.M0;
import vf.AbstractC6867d;
import xe.C7139c;
import ye.AbstractC7240s;
import ye.InterfaceC7224b;
import ye.InterfaceC7230h;
import ze.InterfaceC7367a;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    /* JADX INFO: renamed from: a */
    private final C2022g f13908a;

    public m0(C2022g typeEnhancement) {
        AbstractC5504s.h(typeEnhancement, "typeEnhancement");
        this.f13908a = typeEnhancement;
    }

    private final boolean f(qf.S s10) {
        return J0.c(s10, l0.f13906a);
    }

    public static final Boolean g(M0 m02) {
        InterfaceC7230h interfaceC7230hP = m02.N0().p();
        if (interfaceC7230hP == null) {
            return Boolean.FALSE;
        }
        Xe.f name = interfaceC7230hP.getName();
        C7139c c7139c = C7139c.f64375a;
        return Boolean.valueOf(AbstractC5504s.c(name, c7139c.h().f()) && AbstractC5504s.c(ff.e.k(interfaceC7230hP), c7139c.h()));
    }

    private final qf.S h(o0 o0Var, qf.S s10, List list, r0 r0Var, boolean z10) {
        return this.f13908a.a(s10, o0Var.d(s10, list, r0Var, z10), o0Var.z());
    }

    private final qf.S i(InterfaceC7224b interfaceC7224b, InterfaceC7367a interfaceC7367a, boolean z10, Ke.k kVar, EnumC1656c enumC1656c, r0 r0Var, boolean z11, Function1 function1) {
        o0 o0Var = new o0(interfaceC7367a, z10, kVar, enumC1656c, false, 16, null);
        qf.S s10 = (qf.S) function1.invoke(interfaceC7224b);
        Collection collectionE = interfaceC7224b.e();
        AbstractC5504s.g(collectionE, "getOverriddenDescriptors(...)");
        Collection<InterfaceC7224b> collection = collectionE;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
        for (InterfaceC7224b interfaceC7224b2 : collection) {
            AbstractC5504s.e(interfaceC7224b2);
            arrayList.add((qf.S) function1.invoke(interfaceC7224b2));
        }
        return h(o0Var, s10, arrayList, r0Var, z11);
    }

    static /* synthetic */ qf.S j(m0 m0Var, o0 o0Var, qf.S s10, List list, r0 r0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            r0Var = null;
        }
        r0 r0Var2 = r0Var;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return m0Var.h(o0Var, s10, list, r0Var2, z10);
    }

    static /* synthetic */ qf.S k(m0 m0Var, InterfaceC7224b interfaceC7224b, InterfaceC7367a interfaceC7367a, boolean z10, Ke.k kVar, EnumC1656c enumC1656c, r0 r0Var, boolean z11, Function1 function1, int i10, Object obj) {
        return m0Var.i(interfaceC7224b, interfaceC7367a, z10, kVar, enumC1656c, r0Var, (i10 & 32) != 0 ? false : z11, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x021a, code lost:
    
        if (r3 == null) goto L301;
     */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final ye.InterfaceC7224b l(ye.InterfaceC7224b r18, Ke.k r19) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Pe.m0.l(ye.b, Ke.k):ye.b");
    }

    public static final qf.S m(InterfaceC7224b it) {
        AbstractC5504s.h(it, "it");
        qf.S returnType = it.getReturnType();
        AbstractC5504s.e(returnType);
        return returnType;
    }

    public static final qf.S n(InterfaceC7224b it) {
        AbstractC5504s.h(it, "it");
        ye.c0 c0VarO = it.O();
        AbstractC5504s.e(c0VarO);
        qf.S type = c0VarO.getType();
        AbstractC5504s.g(type, "getType(...)");
        return type;
    }

    public static final qf.S o(ye.t0 t0Var, InterfaceC7224b it) {
        AbstractC5504s.h(it, "it");
        qf.S type = ((ye.t0) it.j().get(t0Var.getIndex())).getType();
        AbstractC5504s.g(type, "getType(...)");
        return type;
    }

    public static final boolean s(M0 it) {
        AbstractC5504s.h(it, "it");
        return it instanceof InterfaceC6181c0;
    }

    private final qf.S t(InterfaceC7224b interfaceC7224b, ye.t0 t0Var, Ke.k kVar, r0 r0Var, boolean z10, Function1 function1) {
        Ke.k kVarK;
        return i(interfaceC7224b, t0Var, false, (t0Var == null || (kVarK = Ke.c.k(kVar, t0Var.getAnnotations())) == null) ? kVar : kVarK, EnumC1656c.f8548c, r0Var, z10, function1);
    }

    private final InterfaceC7374h u(InterfaceC7224b interfaceC7224b, Ke.k kVar) {
        InterfaceC7230h interfaceC7230hA = AbstractC7240s.a(interfaceC7224b);
        if (interfaceC7230hA == null) {
            return interfaceC7224b.getAnnotations();
        }
        C1882n c1882n = interfaceC7230hA instanceof C1882n ? (C1882n) interfaceC7230hA : null;
        List listT0 = c1882n != null ? c1882n.T0() : null;
        if (listT0 == null || listT0.isEmpty()) {
            return interfaceC7224b.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listT0, 10));
        Iterator it = listT0.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1878j(kVar, (InterfaceC1980a) it.next(), true));
        }
        return InterfaceC7374h.f66223k0.a(AbstractC2279u.G0(interfaceC7224b.getAnnotations(), arrayList));
    }

    public final Collection p(Ke.k c10, Collection platformSignatures) {
        AbstractC5504s.h(c10, "c");
        AbstractC5504s.h(platformSignatures, "platformSignatures");
        Collection collection = platformSignatures;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(l((InterfaceC7224b) it.next(), c10));
        }
        return arrayList;
    }

    public final qf.S q(qf.S type, Ke.k context) {
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(context, "context");
        qf.S sJ = j(this, new o0(null, false, context, EnumC1656c.f8550e, true), type, AbstractC2279u.m(), null, false, 12, null);
        return sJ == null ? type : sJ;
    }

    public final List r(ye.m0 typeParameter, List bounds, Ke.k context) {
        qf.S s10;
        qf.S sJ;
        AbstractC5504s.h(typeParameter, "typeParameter");
        AbstractC5504s.h(bounds, "bounds");
        AbstractC5504s.h(context, "context");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(bounds, 10));
        Iterator it = bounds.iterator();
        while (it.hasNext()) {
            qf.S s11 = (qf.S) it.next();
            if (AbstractC6867d.e(s11, k0.f13903a)) {
                s10 = s11;
            } else {
                s10 = s11;
                sJ = j(this, new o0(typeParameter, false, context, EnumC1656c.f8551f, false, 16, null), s10, AbstractC2279u.m(), null, false, 12, null);
                if (sJ == null) {
                }
                arrayList.add(sJ);
            }
            sJ = s10;
            arrayList.add(sJ);
        }
        return arrayList;
    }
}
