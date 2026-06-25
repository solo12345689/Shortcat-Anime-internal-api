package R9;

import O9.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class c {
    static long a(double d10) {
        n.e(b(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    static boolean c(double d10) {
        return Math.getExponent(d10) >= -1022;
    }

    static double d(double d10) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
    }
}
