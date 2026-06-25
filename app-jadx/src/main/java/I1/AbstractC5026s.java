package i1;

import r0.C6230l;

/* JADX INFO: renamed from: i1.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5026s {
    public static final long a(int i10, int i11) {
        return C5025r.c((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final long b(long j10) {
        return C5021n.f((((j10 << 32) >> 33) & 4294967295L) | ((j10 >> 33) << 32));
    }

    public static final long c(long j10) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j10 >> 32)));
        return C5025r.c((((long) Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }

    public static final long d(long j10) {
        return C6230l.d((((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32));
    }
}
