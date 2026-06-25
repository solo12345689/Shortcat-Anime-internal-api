package Td;

import Df.AbstractC1268a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class N {
    public static final int a(double d10) {
        if (Double.isNaN(d10) || d10 <= c(0)) {
            return 0;
        }
        if (d10 >= c(-1)) {
            return -1;
        }
        return d10 <= 2.147483647E9d ? D.b((int) d10) : D.b(D.b((int) (d10 - ((double) Integer.MAX_VALUE))) + D.b(Integer.MAX_VALUE));
    }

    public static final int b(int i10, int i11) {
        return AbstractC5504s.i(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    public static final double c(int i10) {
        return ((double) (Integer.MAX_VALUE & i10)) + (((double) ((i10 >>> 31) << 30)) * ((double) 2));
    }

    public static final int d(long j10, long j11) {
        return AbstractC5504s.j(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final double e(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    public static final String f(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, AbstractC1268a.a(i10));
            AbstractC5504s.g(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, AbstractC1268a.a(i10));
        AbstractC5504s.g(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, AbstractC1268a.a(i10));
        AbstractC5504s.g(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
