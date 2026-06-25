package qf;

import java.io.IOException;
import java.util.Iterator;
import ze.InterfaceC7369c;

/* JADX INFO: renamed from: qf.d0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6183d0 extends M0 implements uf.k, uf.l {
    public AbstractC6183d0() {
        super(null);
    }

    /* JADX INFO: renamed from: U0 */
    public abstract AbstractC6183d0 R0(boolean z10);

    /* JADX INFO: renamed from: V0 */
    public abstract AbstractC6183d0 T0(r0 r0Var);

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            Df.r.m(sb2, "[", af.n.O(af.n.f23996k, (InterfaceC7369c) it.next(), null, 2, null), "] ");
        }
        sb2.append(N0());
        if (!L0().isEmpty()) {
            Ud.F.t0(L0(), sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (O0()) {
            sb2.append("?");
        }
        return sb2.toString();
    }
}
