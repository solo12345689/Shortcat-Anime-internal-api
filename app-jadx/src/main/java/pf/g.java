package Pf;

import Lf.E;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E f13956a = new E("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f13957b = new E("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z10) {
        return new f(z10);
    }

    public static /* synthetic */ a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
