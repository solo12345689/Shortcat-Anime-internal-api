package a1;

import U0.W0;
import U0.X0;

/* JADX INFO: renamed from: a1.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2546n {
    public static final long a(long j10, long j11) {
        int iJ;
        int iL = W0.l(j10);
        int iK = W0.k(j10);
        if (W0.p(j11, j10)) {
            if (W0.d(j11, j10)) {
                iL = W0.l(j11);
                iK = iL;
            } else {
                if (W0.d(j10, j11)) {
                    iJ = W0.j(j11);
                } else if (W0.e(j11, iL)) {
                    iL = W0.l(j11);
                    iJ = W0.j(j11);
                } else {
                    iK = W0.l(j11);
                }
                iK -= iJ;
            }
        } else if (iK > W0.l(j11)) {
            iL -= W0.j(j11);
            iJ = W0.j(j11);
            iK -= iJ;
        }
        return X0.b(iL, iK);
    }
}
