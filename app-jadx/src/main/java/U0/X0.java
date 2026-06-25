package U0;

import b1.AbstractC2968a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class X0 {
    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        return W0.c(d(i10, i11));
    }

    public static final long c(long j10, int i10, int i11) {
        int iN = W0.n(j10);
        if (iN < i10) {
            iN = i10;
        }
        if (iN > i11) {
            iN = i11;
        }
        int i12 = W0.i(j10);
        if (i12 >= i10) {
            i10 = i12;
        }
        if (i10 <= i11) {
            i11 = i10;
        }
        return (iN == W0.n(j10) && i11 == W0.i(j10)) ? j10 : b(iN, i11);
    }

    private static final long d(int i10, int i11) {
        if (!(i10 >= 0 && i11 >= 0)) {
            AbstractC2968a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static final String e(CharSequence charSequence, long j10) {
        return charSequence.subSequence(W0.l(j10), W0.k(j10)).toString();
    }
}
