package a1;

import U0.C2197e;
import U0.W0;

/* JADX INFO: renamed from: a1.V */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2528V {
    public static final C2197e a(C2527U c2527u) {
        return c2527u.i().r(c2527u.k());
    }

    public static final C2197e b(C2527U c2527u, int i10) {
        return c2527u.i().subSequence(W0.k(c2527u.k()), Math.min(W0.k(c2527u.k()) + i10, c2527u.l().length()));
    }

    public static final C2197e c(C2527U c2527u, int i10) {
        return c2527u.i().subSequence(Math.max(0, W0.l(c2527u.k()) - i10), W0.l(c2527u.k()));
    }
}
