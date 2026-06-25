package o3;

import t2.a0;

/* JADX INFO: renamed from: o3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5813d {

    /* JADX INFO: renamed from: o3.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f54285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f54286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f54287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f54288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f54289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f54290f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f54291g;

        private b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10, long j11) {
            this.f54285a = jArr;
            this.f54286b = iArr;
            this.f54287c = i10;
            this.f54288d = jArr2;
            this.f54289e = iArr2;
            this.f54290f = j10;
            this.f54291g = j11;
        }
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int[] iArr2 = iArr;
        int i11 = 8192 / i10;
        int i12 = 0;
        int iN = 0;
        for (int i13 : iArr2) {
            iN += a0.n(i13, i11);
        }
        long[] jArr2 = new long[iN];
        int[] iArr3 = new int[iN];
        long[] jArr3 = new long[iN];
        int[] iArr4 = new int[iN];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int iMax = 0;
        while (i12 < iArr2.length) {
            int i17 = iArr2[i12];
            long j11 = jArr[i12];
            while (i17 > 0) {
                int iMin = Math.min(i11, i17);
                jArr2[i16] = j11;
                int i18 = i10 * iMin;
                iArr3[i16] = i18;
                i15 += i18;
                iMax = Math.max(iMax, i18);
                jArr3[i16] = ((long) i14) * j10;
                iArr4[i16] = 1;
                j11 += (long) iArr3[i16];
                i14 += iMin;
                i17 -= iMin;
                i16++;
                i11 = i11;
            }
            i12++;
            iArr2 = iArr;
        }
        return new b(jArr2, iArr3, iMax, jArr3, iArr4, j10 * ((long) i14), i15);
    }
}
