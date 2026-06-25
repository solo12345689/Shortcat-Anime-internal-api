package qf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import qf.C6214y;
import rf.C6319i;

/* JADX INFO: renamed from: qf.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6191h0 {
    public static final C6176a a(S s10) {
        AbstractC5504s.h(s10, "<this>");
        M0 m0Q0 = s10.Q0();
        if (m0Q0 instanceof C6176a) {
            return (C6176a) m0Q0;
        }
        return null;
    }

    public static final AbstractC6183d0 b(S s10) {
        AbstractC5504s.h(s10, "<this>");
        C6176a c6176aA = a(s10);
        if (c6176aA != null) {
            return c6176aA.Z0();
        }
        return null;
    }

    public static final boolean c(S s10) {
        AbstractC5504s.h(s10, "<this>");
        return s10.Q0() instanceof C6214y;
    }

    private static final Q d(Q q10) {
        S s10;
        Collection collectionK = q10.k();
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collectionK, 10));
        Iterator it = collectionK.iterator();
        boolean z10 = false;
        while (true) {
            s10 = null;
            if (!it.hasNext()) {
                break;
            }
            S sF = (S) it.next();
            if (J0.l(sF)) {
                sF = f(sF.Q0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(sF);
        }
        if (!z10) {
            return null;
        }
        S sH = q10.h();
        if (sH != null) {
            if (J0.l(sH)) {
                sH = f(sH.Q0(), false, 1, null);
            }
            s10 = sH;
        }
        return new Q(arrayList).s(s10);
    }

    public static final M0 e(M0 m02, boolean z10) {
        AbstractC5504s.h(m02, "<this>");
        C6214y c6214yC = C6214y.a.c(C6214y.f58124d, m02, z10, false, 4, null);
        if (c6214yC != null) {
            return c6214yC;
        }
        AbstractC6183d0 abstractC6183d0G = g(m02);
        return abstractC6183d0G != null ? abstractC6183d0G : m02.R0(false);
    }

    public static /* synthetic */ M0 f(M0 m02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(m02, z10);
    }

    private static final AbstractC6183d0 g(S s10) {
        Q qD;
        v0 v0VarN0 = s10.N0();
        Q q10 = v0VarN0 instanceof Q ? (Q) v0VarN0 : null;
        if (q10 == null || (qD = d(q10)) == null) {
            return null;
        }
        return qD.f();
    }

    public static final AbstractC6183d0 h(AbstractC6183d0 abstractC6183d0, boolean z10) {
        AbstractC5504s.h(abstractC6183d0, "<this>");
        C6214y c6214yC = C6214y.a.c(C6214y.f58124d, abstractC6183d0, z10, false, 4, null);
        if (c6214yC != null) {
            return c6214yC;
        }
        AbstractC6183d0 abstractC6183d0G = g(abstractC6183d0);
        return abstractC6183d0G == null ? abstractC6183d0.R0(false) : abstractC6183d0G;
    }

    public static /* synthetic */ AbstractC6183d0 i(AbstractC6183d0 abstractC6183d0, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(abstractC6183d0, z10);
    }

    public static final AbstractC6183d0 j(AbstractC6183d0 abstractC6183d0, AbstractC6183d0 abbreviatedType) {
        AbstractC5504s.h(abstractC6183d0, "<this>");
        AbstractC5504s.h(abbreviatedType, "abbreviatedType");
        return W.a(abstractC6183d0) ? abstractC6183d0 : new C6176a(abstractC6183d0, abbreviatedType);
    }

    public static final C6319i k(C6319i c6319i) {
        AbstractC5504s.h(c6319i, "<this>");
        return new C6319i(c6319i.W0(), c6319i.N0(), c6319i.Y0(), c6319i.M0(), c6319i.O0(), true);
    }
}
