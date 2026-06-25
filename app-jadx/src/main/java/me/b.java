package Me;

import Ud.a0;
import kotlin.jvm.internal.AbstractC5504s;
import qf.I0;
import ye.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final a a(I0 i02, boolean z10, boolean z11, m0 m0Var) {
        AbstractC5504s.h(i02, "<this>");
        return new a(i02, null, z11, z10, m0Var != null ? a0.c(m0Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(I0 i02, boolean z10, boolean z11, m0 m0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            m0Var = null;
        }
        return a(i02, z10, z11, m0Var);
    }
}
