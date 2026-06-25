package s0;

import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static final long a(C6385r0.a aVar, long j10) {
        long j11 = 63 & j10;
        if (j11 >= 16) {
            j10 = (j10 & (-64)) | (j11 + 1);
        }
        return C6385r0.n(Td.F.b(j10));
    }

    public static final long b(long j10) {
        long j11 = 63 & j10;
        return Long.compare(Td.F.b(j11) ^ Long.MIN_VALUE, 16 ^ Long.MIN_VALUE) < 0 ? j10 : Td.F.b(Td.F.b(j10 & Td.F.b(-64L)) | Td.F.b(Td.F.b(j11) - 1));
    }
}
