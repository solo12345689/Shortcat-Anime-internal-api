package J;

import i1.C5015h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f9197a = a(50);

    public static final h a(int i10) {
        return c(c.b(i10));
    }

    public static final h b(int i10, int i11, int i12, int i13) {
        return new h(c.b(i10), c.b(i11), c.b(i12), c.b(i13));
    }

    public static final h c(b bVar) {
        return new h(bVar, bVar, bVar, bVar);
    }

    public static final h d(float f10) {
        return c(c.c(f10));
    }

    public static final h e(float f10, float f11, float f12, float f13) {
        return new h(c.c(f10), c.c(f11), c.c(f12), c.c(f13));
    }

    public static /* synthetic */ h f(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C5015h.n(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C5015h.n(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C5015h.n(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C5015h.n(0);
        }
        return e(f10, f11, f12, f13);
    }

    public static final h g() {
        return f9197a;
    }
}
