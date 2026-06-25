package r0;

/* JADX INFO: renamed from: r0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6229k {
    public static final C6228j a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jB = AbstractC6219a.b((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L));
        return new C6228j(f10, f11, f12, f13, jB, jB, jB, jB, null);
    }

    public static final C6228j b(C6226h c6226h, long j10, long j11, long j12, long j13) {
        return new C6228j(c6226h.i(), c6226h.l(), c6226h.j(), c6226h.e(), j10, j11, j12, j13, null);
    }

    public static final C6228j c(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final C6226h d(C6228j c6228j) {
        return new C6226h(c6228j.e(), c6228j.g(), c6228j.f(), c6228j.a());
    }

    public static final boolean e(C6228j c6228j) {
        long jH = c6228j.h();
        return (jH >>> 32) == (jH & 4294967295L) && c6228j.h() == c6228j.i() && c6228j.h() == c6228j.c() && c6228j.h() == c6228j.b();
    }

    public static final C6228j f(C6228j c6228j, long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (4294967295L & j10);
        return new C6228j(c6228j.e() + Float.intBitsToFloat(i10), c6228j.g() + Float.intBitsToFloat(i11), c6228j.f() + Float.intBitsToFloat(i10), Float.intBitsToFloat(i11) + c6228j.a(), c6228j.h(), c6228j.i(), c6228j.c(), c6228j.b(), null);
    }
}
