package P;

import K.I;
import g1.v;
import i1.C5009b;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final long a(long j10, boolean z10, int i10, float f10) {
        return C5009b.f48540b.b(0, c(j10, z10, i10, f10), 0, C5009b.k(j10));
    }

    public static final int b(boolean z10, int i10, int i11) {
        if (z10 || !v.g(i10, v.f47323a.b())) {
            return AbstractC5874j.e(i11, 1);
        }
        return 1;
    }

    public static final int c(long j10, boolean z10, int i10, float f10) {
        int iL = ((z10 || v.g(i10, v.f47323a.b())) && C5009b.h(j10)) ? C5009b.l(j10) : Integer.MAX_VALUE;
        return C5009b.n(j10) == iL ? iL : AbstractC5874j.m(I.a(f10), C5009b.n(j10), iL);
    }
}
