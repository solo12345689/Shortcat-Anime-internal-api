package Ef;

import Df.r;
import Ef.a;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final long i(long j10, int i10) {
        return a.p((j10 << 1) + ((long) i10));
    }

    public static final long j(long j10) {
        return a.p((j10 << 1) + 1);
    }

    public static final long k(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? j(AbstractC5874j.o(j10, -4611686018427387903L, 4611686018427387903L)) : l(n(j10));
    }

    public static final long l(long j10) {
        return a.p(j10 << 1);
    }

    public static final long m(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? j(o(j10)) : l(j10);
    }

    public static final long n(long j10) {
        return j10 * ((long) 1000000);
    }

    public static final long o(long j10) {
        return j10 / ((long) 1000000);
    }

    public static final long p(String str, boolean z10) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        boolean z11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        a.C0060a c0060a = a.f5961b;
        long jB = c0060a.b();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z12 = length2 > 0;
        boolean z13 = z12 && r.Q0(str, '-', false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c10 = ':';
        char c11 = '0';
        if (str.charAt(length2) == 'P') {
            int i12 = length2 + 1;
            if (i12 == length) {
                throw new IllegalArgumentException();
            }
            boolean z14 = false;
            d dVar = null;
            while (i12 < length) {
                if (str.charAt(i12) != 'T') {
                    int i13 = i12;
                    while (true) {
                        if (i13 >= str.length()) {
                            i11 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i13);
                        if (c11 > cCharAt4 || cCharAt4 >= c10) {
                            i11 = length;
                            if (!r.V("+-.", cCharAt4, false, 2, null)) {
                                break;
                            }
                        } else {
                            i11 = length;
                        }
                        i13++;
                        length = i11;
                        c11 = '0';
                        c10 = ':';
                    }
                    AbstractC5504s.f(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i12, i13);
                    AbstractC5504s.g(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i12 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i12 = length3 + 1;
                    d dVarD = f.d(cCharAt5, z14);
                    if (dVar != null && dVar.compareTo(dVarD) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iI0 = r.i0(strSubstring, com.amazon.a.a.o.c.a.b.f34706a, 0, false, 6, null);
                    if (dVarD != d.f5971e || iI0 <= 0) {
                        z11 = z14;
                        jB = a.L(jB, t(q(strSubstring), dVarD));
                    } else {
                        AbstractC5504s.f(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iI0);
                        AbstractC5504s.g(strSubstring2, "substring(...)");
                        z11 = z14;
                        long jL = a.L(jB, t(q(strSubstring2), dVarD));
                        AbstractC5504s.f(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iI0);
                        AbstractC5504s.g(strSubstring3, "substring(...)");
                        jB = a.L(jL, r(Double.parseDouble(strSubstring3), dVarD));
                    }
                    z14 = z11;
                    dVar = dVarD;
                    length = i11;
                    c11 = '0';
                    c10 = ':';
                } else {
                    if (z14 || (i12 = i12 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = true;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            char c12 = '0';
            if (r.E(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jB = c0060a.a();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(length2) == '(' && r.q1(str) == ')') {
                    length2++;
                    int i14 = length - 1;
                    if (length2 == i14) {
                        throw new IllegalArgumentException("No components");
                    }
                    i10 = i14;
                    z15 = true;
                } else {
                    i10 = length;
                }
                boolean z16 = false;
                d dVar2 = null;
                while (length2 < i10) {
                    if (z16 && z15) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i15 = length2;
                    while (i15 < str.length() && ((c12 <= (cCharAt2 = str.charAt(i15)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i15++;
                    }
                    AbstractC5504s.f(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i15);
                    AbstractC5504s.g(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i16 = length4;
                    while (i16 < str.length() && 'a' <= (cCharAt = str.charAt(i16)) && cCharAt < '{') {
                        i16++;
                    }
                    AbstractC5504s.f(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i16);
                    AbstractC5504s.g(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    d dVarE = f.e(strSubstring5);
                    if (dVar2 != null && dVar2.compareTo(dVarE) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iI02 = r.i0(strSubstring4, com.amazon.a.a.o.c.a.b.f34706a, 0, false, 6, null);
                    if (iI02 > 0) {
                        AbstractC5504s.f(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iI02);
                        AbstractC5504s.g(strSubstring6, "substring(...)");
                        long jL2 = a.L(jB, t(Long.parseLong(strSubstring6), dVarE));
                        AbstractC5504s.f(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iI02);
                        AbstractC5504s.g(strSubstring7, "substring(...)");
                        jB = a.L(jL2, r(Double.parseDouble(strSubstring7), dVarE));
                        if (length2 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jB = a.L(jB, t(Long.parseLong(strSubstring4), dVarE));
                    }
                    dVar2 = dVarE;
                    z16 = true;
                    c12 = '0';
                }
            }
        }
        return z13 ? a.R(jB) : jB;
    }

    private static final long q(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !r.V("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i10++;
                } else if (length - i11 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!r.Q(str, "+", false, 2, null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(r.n1(str, 1));
    }

    public static final long r(double d10, d unit) {
        AbstractC5504s.h(unit, "unit");
        double dA = e.a(d10, unit, d.f5968b);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jE = AbstractC5466a.e(dA);
        return (-4611686018426999999L > jE || jE >= 4611686018427000000L) ? k(AbstractC5466a.e(e.a(d10, unit, d.f5970d))) : l(jE);
    }

    public static final long s(int i10, d unit) {
        AbstractC5504s.h(unit, "unit");
        return unit.compareTo(d.f5971e) <= 0 ? l(e.c(i10, unit, d.f5968b)) : t(i10, unit);
    }

    public static final long t(long j10, d unit) {
        AbstractC5504s.h(unit, "unit");
        d dVar = d.f5968b;
        long jC = e.c(4611686018426999999L, dVar, unit);
        return ((-jC) > j10 || j10 > jC) ? j(AbstractC5874j.o(e.b(j10, unit, d.f5970d), -4611686018427387903L, 4611686018427387903L)) : l(e.c(j10, unit, dVar));
    }
}
