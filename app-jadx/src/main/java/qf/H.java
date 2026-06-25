package qf;

import java.util.HashSet;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class H {
    public static final uf.i a(H0 h02, uf.i inlineClassType) {
        AbstractC5504s.h(h02, "<this>");
        AbstractC5504s.h(inlineClassType, "inlineClassType");
        return b(h02, inlineClassType, new HashSet());
    }

    private static final uf.i b(H0 h02, uf.i iVar, HashSet hashSet) {
        uf.i iVarB;
        uf.p pVarG0 = h02.G0(iVar);
        if (!hashSet.add(pVarG0)) {
            return null;
        }
        uf.q qVarX0 = h02.x0(pVarG0);
        if (qVarX0 != null) {
            uf.i iVarR = h02.r(qVarX0);
            uf.i iVarB2 = b(h02, iVarR, hashSet);
            if (iVarB2 != null) {
                return ((iVarB2 instanceof uf.k) && h02.J((uf.k) iVarB2) && h02.M(iVar) && (h02.R(h02.G0(iVarR)) || ((iVarR instanceof uf.k) && h02.J((uf.k) iVarR)))) ? h02.s0(iVarR) : (h02.M(iVarB2) || !h02.b0(iVar)) ? iVarB2 : h02.s0(iVarB2);
            }
            return null;
        }
        if (h02.R(pVarG0)) {
            uf.i iVarR0 = h02.r0(iVar);
            if (iVarR0 == null || (iVarB = b(h02, iVarR0, hashSet)) == null) {
                return null;
            }
            if (!h02.M(iVar)) {
                return iVarB;
            }
            if (!h02.M(iVarB) && (!(iVarB instanceof uf.k) || !h02.J((uf.k) iVarB))) {
                return h02.s0(iVarB);
            }
        }
        return iVar;
    }
}
