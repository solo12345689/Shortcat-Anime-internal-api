package i1;

import k1.AbstractC5437b;

/* JADX INFO: renamed from: i1.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5030w {
    public static final long a(float f10, long j10) {
        return i(j10, f10);
    }

    public static final void b(long j10) {
        if (C5029v.f(j10) == 0) {
            AbstractC5020m.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j10, long j11) {
        if (!((C5029v.f(j10) == 0 || C5029v.f(j11) == 0) ? false : true)) {
            AbstractC5020m.a("Cannot perform operation for Unspecified type.");
        }
        if (C5031x.g(C5029v.g(j10), C5029v.g(j11))) {
            return;
        }
        AbstractC5020m.a("Cannot perform operation for " + ((Object) C5031x.i(C5029v.g(j10))) + " and " + ((Object) C5031x.i(C5029v.g(j11))));
    }

    public static final long d(double d10) {
        return i(4294967296L, (float) d10);
    }

    public static final long e(float f10) {
        return i(4294967296L, f10);
    }

    public static final long f(int i10) {
        return i(4294967296L, i10);
    }

    public static final boolean g(long j10) {
        return C5029v.f(j10) == 0;
    }

    public static final long h(long j10, long j11, float f10) {
        c(j10, j11);
        return i(C5029v.f(j10), AbstractC5437b.b(C5029v.h(j10), C5029v.h(j11), f10));
    }

    public static final long i(long j10, float f10) {
        return C5029v.c(j10 | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
    }
}
