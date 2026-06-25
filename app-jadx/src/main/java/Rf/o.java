package rf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.B0;
import qf.G0;
import qf.M0;
import qf.N0;
import qf.S;
import qf.V;
import qf.w0;
import rf.AbstractC6316f;
import uf.EnumC6770b;
import vf.AbstractC6867d;
import ye.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class o {
    private static final List a(M0 m02, EnumC6770b enumC6770b) {
        if (m02.L0().size() != m02.N0().getParameters().size()) {
            return null;
        }
        List listL0 = m02.L0();
        if (listL0 == null || !listL0.isEmpty()) {
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                if (((B0) it.next()).b() != N0.f57999e) {
                    List parameters = m02.N0().getParameters();
                    AbstractC5504s.g(parameters, "getParameters(...)");
                    List<Pair> listJ1 = AbstractC2279u.j1(listL0, parameters);
                    ArrayList arrayList = new ArrayList(AbstractC2279u.x(listJ1, 10));
                    for (Pair pair : listJ1) {
                        B0 b0D = (B0) pair.getFirst();
                        m0 m0Var = (m0) pair.getSecond();
                        if (b0D.b() != N0.f57999e) {
                            M0 m0Q0 = (b0D.a() || b0D.b() != N0.f58000f) ? null : b0D.getType().Q0();
                            AbstractC5504s.e(m0Var);
                            b0D = AbstractC6867d.d(new C6319i(enumC6770b, m0Q0, b0D, m0Var));
                        }
                        arrayList.add(b0D);
                    }
                    G0 g0C = w0.f58118c.b(m02.N0(), arrayList).c();
                    int size = listL0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        B0 b02 = (B0) listL0.get(i10);
                        B0 b03 = (B0) arrayList.get(i10);
                        if (b02.b() != N0.f57999e) {
                            List upperBounds = ((m0) m02.N0().getParameters().get(i10)).getUpperBounds();
                            AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(AbstractC6316f.a.f58774a.a(g0C.n((S) it2.next(), N0.f57999e).Q0()));
                            }
                            if (!b02.a() && b02.b() == N0.f58001g) {
                                arrayList2.add(AbstractC6316f.a.f58774a.a(b02.getType().Q0()));
                            }
                            S type = b03.getType();
                            AbstractC5504s.f(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((C6319i) type).N0().j(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final AbstractC6183d0 b(AbstractC6183d0 type, EnumC6770b status) {
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(status, "status");
        List listA = a(type, status);
        if (listA != null) {
            return c(type, listA);
        }
        return null;
    }

    private static final AbstractC6183d0 c(M0 m02, List list) {
        return V.k(m02.M0(), m02.N0(), list, m02.O0(), null, 16, null);
    }
}
