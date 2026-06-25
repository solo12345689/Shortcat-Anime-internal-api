package Df;

import Td.C2160k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class L {
    public static final byte a(String str) {
        AbstractC5504s.h(str, "<this>");
        Td.B b10 = b(str);
        if (b10 != null) {
            return b10.m();
        }
        B.q(str);
        throw new C2160k();
    }

    public static final Td.B b(String str) {
        AbstractC5504s.h(str, "<this>");
        return c(str, 10);
    }

    public static final Td.B c(String str, int i10) {
        AbstractC5504s.h(str, "<this>");
        Td.D dF = f(str, i10);
        if (dF == null) {
            return null;
        }
        int iM = dF.m();
        if (Integer.compare(iM ^ Integer.MIN_VALUE, Td.D.b(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return Td.B.a(Td.B.b((byte) iM));
    }

    public static final int d(String str) {
        AbstractC5504s.h(str, "<this>");
        Td.D dE = e(str);
        if (dE != null) {
            return dE.m();
        }
        B.q(str);
        throw new C2160k();
    }

    public static final Td.D e(String str) {
        AbstractC5504s.h(str, "<this>");
        return f(str, 10);
    }

    public static final Td.D f(String str, int i10) {
        int i11;
        AbstractC5504s.h(str, "<this>");
        AbstractC1269b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC5504s.i(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iB = Td.D.b(i10);
        int iA = 119304647;
        while (i11 < length) {
            int iB2 = AbstractC1269b.b(str.charAt(i11), i10);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = K.a(-1, iB);
                    if (Integer.compare(i12 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iB3 = Td.D.b(i12 * iB);
            int iB4 = Td.D.b(Td.D.b(iB2) + iB3);
            if (Integer.compare(iB4 ^ Integer.MIN_VALUE, iB3 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            i12 = iB4;
        }
        return Td.D.a(i12);
    }

    public static final long g(String str) {
        AbstractC5504s.h(str, "<this>");
        Td.F fH = h(str);
        if (fH != null) {
            return fH.n();
        }
        B.q(str);
        throw new C2160k();
    }

    public static final Td.F h(String str) {
        AbstractC5504s.h(str, "<this>");
        return i(str, 10);
    }

    public static final Td.F i(String str, int i10) {
        AbstractC5504s.h(str, "<this>");
        AbstractC1269b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC5504s.i(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jB = Td.F.b(i10);
        long j10 = 0;
        long jA = 512409557603043100L;
        while (i11 < length) {
            int iB = AbstractC1269b.b(str.charAt(i11), i10);
            if (iB < 0) {
                return null;
            }
            if (Long.compare(j10 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = I.a(-1L, jB);
                    if (Long.compare(j10 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jB2 = Td.F.b(j10 * jB);
            long jB3 = Td.F.b(Td.F.b(((long) Td.D.b(iB)) & 4294967295L) + jB2);
            if (Long.compare(jB3 ^ Long.MIN_VALUE, jB2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            j10 = jB3;
        }
        return Td.F.a(j10);
    }

    public static final short j(String str) {
        AbstractC5504s.h(str, "<this>");
        Td.I iK = k(str);
        if (iK != null) {
            return iK.m();
        }
        B.q(str);
        throw new C2160k();
    }

    public static final Td.I k(String str) {
        AbstractC5504s.h(str, "<this>");
        return l(str, 10);
    }

    public static final Td.I l(String str, int i10) {
        AbstractC5504s.h(str, "<this>");
        Td.D dF = f(str, i10);
        if (dF == null) {
            return null;
        }
        int iM = dF.m();
        if (Integer.compare(iM ^ Integer.MIN_VALUE, Td.D.b(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return Td.I.a(Td.I.b((short) iM));
    }
}
