package E0;

import r0.C6224f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final boolean a(C c10) {
        return (c10.p() || c10.l() || !c10.i()) ? false : true;
    }

    public static final boolean b(C c10) {
        return !c10.l() && c10.i();
    }

    public static final boolean c(C c10) {
        return (c10.p() || !c10.l() || c10.i()) ? false : true;
    }

    public static final boolean d(C c10) {
        return c10.l() && !c10.i();
    }

    public static final boolean e(C c10, long j10) {
        long jH = c10.h();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return (fIntBitsToFloat > ((float) i10)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i11));
    }

    public static final boolean f(C c10, long j10, long j11) {
        boolean zG = Q.g(c10.n(), Q.f4086a.d());
        long jH = c10.h();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32));
        float f10 = zG ? 1.0f : 0.0f;
        float f11 = fIntBitsToFloat3 * f10;
        float f12 = ((int) (j10 >> 32)) + f11;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f10;
        return (fIntBitsToFloat > f12) | (fIntBitsToFloat < (-f11)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j10 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long g(C c10) {
        return i(c10, false);
    }

    public static final long h(C c10) {
        return i(c10, true);
    }

    private static final long i(C c10, boolean z10) {
        return (z10 || !c10.p()) ? C6224f.p(c10.h(), c10.k()) : C6224f.f58329b.c();
    }

    public static final boolean j(C c10) {
        return !C6224f.j(i(c10, true), C6224f.f58329b.c());
    }
}
