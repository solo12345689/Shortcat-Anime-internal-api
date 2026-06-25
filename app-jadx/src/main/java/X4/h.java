package x4;

import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f63898a = new h();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63899a;

        static {
            int[] iArr = new int[H4.g.values().length];
            try {
                iArr[H4.g.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H4.g.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f63899a = iArr;
        }
    }

    private h() {
    }

    public static final int a(int i10, int i11, int i12, int i13, H4.g gVar) {
        int iMin;
        int iHighestOneBit = Integer.highestOneBit(i10 / i12);
        int iHighestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i14 = a.f63899a[gVar.ordinal()];
        if (i14 == 1) {
            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
        } else {
            if (i14 != 2) {
                throw new Td.r();
            }
            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
        }
        return AbstractC5874j.e(iMin, 1);
    }

    public static final double b(double d10, double d11, double d12, double d13, H4.g gVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f63899a[gVar.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new Td.r();
    }

    public static final double c(int i10, int i11, int i12, int i13, H4.g gVar) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int i14 = a.f63899a[gVar.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new Td.r();
    }
}
