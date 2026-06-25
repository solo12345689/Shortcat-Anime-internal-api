package Y0;

import Y0.L;

/* JADX INFO: renamed from: Y0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2474i {
    public static final L a(L.a aVar) {
        return aVar.l();
    }

    public static final int b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final int c(L l10, int i10) {
        return b(l10.compareTo(a(L.f22613b)) >= 0, H.f(i10, H.f22594b.a()));
    }
}
