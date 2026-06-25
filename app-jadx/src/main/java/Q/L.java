package Q;

import U0.T0;
import i1.C5025r;
import oe.AbstractC5874j;
import r0.AbstractC6225g;
import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static final float a(T0 t02, int i10, boolean z10, boolean z11) {
        return t02.j(i10, t02.c(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == t02.y(i10));
    }

    public static final long b(T0 t02, int i10, boolean z10, boolean z11) {
        int iQ = t02.q(i10);
        return iQ >= t02.n() ? C6224f.f58329b.b() : AbstractC6225g.a(AbstractC5874j.l(a(t02, i10, z10, z11), 0.0f, C5025r.g(t02.B())), AbstractC5874j.l(t02.m(iQ), 0.0f, C5025r.f(t02.B())));
    }
}
