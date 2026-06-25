package ve;

import Be.C1121p;
import Be.G;
import Be.U;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import pf.C6041f;
import qf.AbstractC6183d0;
import qf.B0;
import qf.N0;
import qf.S;
import qf.V;
import qf.r0;
import qf.v0;
import vf.AbstractC6867d;
import ye.AbstractC7241t;
import ye.E;
import ye.EnumC7228f;
import ye.h0;
import ze.InterfaceC7374h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G f62283a;

    static {
        C1121p c1121p = new C1121p(sf.l.f59724a.i(), o.f62175s);
        EnumC7228f enumC7228f = EnumC7228f.f65098c;
        Xe.f fVarF = o.f62178v.f();
        h0 h0Var = h0.f65112a;
        pf.n nVar = C6041f.f56045e;
        G g10 = new G(c1121p, enumC7228f, false, false, fVarF, h0Var, nVar);
        g10.M0(E.f65063e);
        g10.O0(AbstractC7241t.f65124e);
        g10.N0(AbstractC2279u.e(U.R0(g10, InterfaceC7374h.f66223k0.b(), false, N0.f58000f, Xe.f.m("T"), 0, nVar)));
        g10.K0();
        f62283a = g10;
    }

    public static final AbstractC6183d0 a(S suspendFunType) {
        AbstractC5504s.h(suspendFunType, "suspendFunType");
        h.r(suspendFunType);
        i iVarN = AbstractC6867d.n(suspendFunType);
        InterfaceC7374h annotations = suspendFunType.getAnnotations();
        S sK = h.k(suspendFunType);
        List listE = h.e(suspendFunType);
        List listM = h.m(suspendFunType);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0) it.next()).getType());
        }
        r0 r0VarK = r0.f58089b.k();
        v0 v0VarL = f62283a.l();
        AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
        List listJ0 = AbstractC2279u.J0(arrayList, V.k(r0VarK, v0VarL, AbstractC2279u.e(AbstractC6867d.d(h.l(suspendFunType))), false, null, 16, null));
        AbstractC6183d0 abstractC6183d0J = AbstractC6867d.n(suspendFunType).J();
        AbstractC5504s.g(abstractC6183d0J, "getNullableAnyType(...)");
        return h.b(iVarN, annotations, sK, listE, listJ0, null, abstractC6183d0J, (128 & 128) != 0 ? false : false).R0(suspendFunType.O0());
    }
}
