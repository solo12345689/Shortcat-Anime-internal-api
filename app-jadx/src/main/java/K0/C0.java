package K0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class C0 {
    public static final void a(int[] iArr, C1812z c1812z) {
        int iMin;
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (c(iArr)) {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i10 += ((iArr[4] != 0 ? 1 : 0) | (d(iArr) ? 1 : 0)) ^ 1;
            i11 += ((!d(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            iMin = iArr[2] - iArr[0];
        }
        c1812z.g(i10, i11, iMin);
    }

    private static final boolean c(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    private static final boolean d(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    public static int[] b(int[] iArr) {
        return iArr;
    }
}
