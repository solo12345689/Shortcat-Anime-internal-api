package r0;

import k1.AbstractC5437b;

/* JADX INFO: renamed from: r0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6225g {
    public static final long a(float f10, float f11) {
        return C6224f.e((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public static final boolean b(long j10) {
        return (j10 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final long c(long j10, long j11, float f10) {
        float fB = AbstractC5437b.b(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fB2 = AbstractC5437b.b(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10);
        return C6224f.e((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB2)) & 4294967295L));
    }
}
