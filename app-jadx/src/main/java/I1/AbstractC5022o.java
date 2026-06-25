package i1;

import r0.C6224f;

/* JADX INFO: renamed from: i1.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5022o {
    public static final long a(int i10, int i11) {
        return C5021n.f((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final long b(long j10, long j11) {
        return C6224f.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) - C5021n.k(j11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) - C5021n.l(j11))) & 4294967295L));
    }

    public static final long c(long j10, long j11) {
        return C6224f.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) + C5021n.k(j11))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) + C5021n.l(j11))) & 4294967295L));
    }

    public static final long d(long j10) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j10 >> 32)));
        return C5021n.f((((long) Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }
}
