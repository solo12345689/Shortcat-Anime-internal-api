package Qe;

import Pe.t0;
import gf.C4881d;
import gf.EnumC4882e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.H0;
import xe.C7139c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class J {
    public static final Object a(t tVar, Object possiblyPrimitiveType, boolean z10) {
        AbstractC5504s.h(tVar, "<this>");
        AbstractC5504s.h(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z10 ? tVar.c(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final Object b(H0 h02, uf.i type, t typeFactory, I mode) {
        List listI;
        AbstractC5504s.h(h02, "<this>");
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(typeFactory, "typeFactory");
        AbstractC5504s.h(mode, "mode");
        uf.p pVarG0 = h02.G0(type);
        if (!h02.I0(pVarG0)) {
            return null;
        }
        ve.l lVarY = h02.Y(pVarG0);
        if (lVarY != null) {
            return a(typeFactory, typeFactory.a(lVarY), h02.M(type) || t0.c(h02, type));
        }
        ve.l lVarU = h02.u(pVarG0);
        if (lVarU != null) {
            return typeFactory.b('[' + EnumC4882e.c(lVarU).h());
        }
        if (h02.d0(pVarG0)) {
            Xe.d dVarA = h02.A(pVarG0);
            Xe.b bVarN = dVarA != null ? C7139c.f64375a.n(dVarA) : null;
            if (bVarN != null) {
                if (!mode.a() && ((listI = C7139c.f64375a.i()) == null || !listI.isEmpty())) {
                    Iterator it = listI.iterator();
                    while (it.hasNext()) {
                        if (AbstractC5504s.c(((C7139c.a) it.next()).d(), bVarN)) {
                            return null;
                        }
                    }
                }
                String strH = C4881d.h(bVarN);
                AbstractC5504s.g(strH, "internalNameByClassId(...)");
                return typeFactory.e(strH);
            }
        }
        return null;
    }
}
