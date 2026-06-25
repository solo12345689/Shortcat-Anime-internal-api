package J0;

import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.AbstractC1800m;
import K0.C1781c0;
import K0.InterfaceC1794j;
import K0.J;
import a0.C2507c;
import androidx.compose.ui.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface h extends k, InterfaceC1794j {
    default g h0() {
        return b.f9199a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [a0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // J0.k
    default Object j(c cVar) {
        C1781c0 c1781c0T0;
        if (!getNode().isAttached()) {
            H0.a.a("ModifierLocal accessed from an unattached node");
        }
        int iA = AbstractC1789g0.a(32);
        if (!getNode().isAttached()) {
            H0.a.b("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = getNode().getParent$ui_release();
        J jN = AbstractC1796k.n(this);
        while (jN != null) {
            if ((jN.t0().k().getAggregateChildKindSet$ui_release() & iA) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iA) != 0) {
                        ?? H10 = parent$ui_release;
                        ?? c2507c = 0;
                        while (H10 != 0) {
                            if (H10 instanceof h) {
                                h hVar = (h) H10;
                                if (hVar.h0().a(cVar)) {
                                    return hVar.h0().b(cVar);
                                }
                            } else if ((H10.getKindSet$ui_release() & iA) != 0 && (H10 instanceof AbstractC1800m)) {
                                e.c cVarF1 = ((AbstractC1800m) H10).F1();
                                int i10 = 0;
                                H10 = H10;
                                c2507c = c2507c;
                                while (cVarF1 != null) {
                                    if ((cVarF1.getKindSet$ui_release() & iA) != 0) {
                                        i10++;
                                        c2507c = c2507c;
                                        if (i10 == 1) {
                                            H10 = cVarF1;
                                        } else {
                                            if (c2507c == 0) {
                                                c2507c = new C2507c(new e.c[16], 0);
                                            }
                                            if (H10 != 0) {
                                                c2507c.c(H10);
                                                H10 = 0;
                                            }
                                            c2507c.c(cVarF1);
                                        }
                                    }
                                    cVarF1 = cVarF1.getChild$ui_release();
                                    H10 = H10;
                                    c2507c = c2507c;
                                }
                                if (i10 == 1) {
                                }
                            }
                            H10 = AbstractC1796k.h(c2507c);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            jN = jN.A0();
            parent$ui_release = (jN == null || (c1781c0T0 = jN.t0()) == null) ? null : c1781c0T0.p();
        }
        return cVar.a().invoke();
    }
}
