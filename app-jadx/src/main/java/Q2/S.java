package q2;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a */
    static final String f56627a = t2.a0.H0(0);

    S() {
    }

    public static S a(Bundle bundle) {
        int i10 = bundle.getInt(f56627a, -1);
        if (i10 == 0) {
            return C6111z.d(bundle);
        }
        if (i10 == 1) {
            return C6081M.d(bundle);
        }
        if (i10 == 2) {
            return T.d(bundle);
        }
        if (i10 == 3) {
            return V.d(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i10);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
