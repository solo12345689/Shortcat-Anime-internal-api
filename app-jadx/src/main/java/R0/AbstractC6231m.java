package r0;

/* JADX INFO: renamed from: r0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6231m {
    public static final long a(float f10, float f11) {
        return C6230l.d((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final long b(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f;
        return C6224f.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final C6226h c(long j10) {
        return AbstractC6227i.b(C6224f.f58329b.c(), j10);
    }
}
