package P9;

/* JADX INFO: renamed from: P9.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2008q {
    static int a(int i10, double d10) {
        int iMax = Math.max(i10, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d10 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i11 = iHighestOneBit << 1;
        if (i11 > 0) {
            return i11;
        }
        return 1073741824;
    }

    static int b(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
