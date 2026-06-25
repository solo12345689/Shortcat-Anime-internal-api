package Df;

import Df.C1274g;
import Td.C2160k;
import Ud.AbstractC2263d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: Df.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1273f {

    /* JADX INFO: renamed from: a */
    private static final int[] f3736a;

    /* JADX INFO: renamed from: b */
    private static final int[] f3737b;

    /* JADX INFO: renamed from: c */
    private static final int[] f3738c;

    /* JADX INFO: renamed from: d */
    private static final long[] f3739d;

    static {
        int[] iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f3736a = iArr;
        int[] iArr2 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f3737b = iArr2;
        int[] iArr3 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f3738c = iArr3;
        long[] jArr = new long[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f3739d = jArr;
    }

    private static final void A(String str, int i10, int i11, String str2, String str3) {
        int i12 = AbstractC5874j.i(str2.length() + i10, i11);
        AbstractC5504s.f(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i12);
        AbstractC5504s.g(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i10 + ", but was " + strSubstring);
    }

    private static final int B(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                AbstractC5504s.f(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return i10 + str.length();
    }

    public static final String C(byte[] bArr, int i10, int i11, C1274g format) {
        AbstractC5504s.h(bArr, "<this>");
        AbstractC5504s.h(format, "format");
        AbstractC2263d.f19502a.a(i10, i11, bArr.length);
        if (i10 == i11) {
            return "";
        }
        int[] iArr = format.d() ? f3737b : f3736a;
        C1274g.a aVarB = format.b();
        return aVarB.j() ? F(bArr, i10, i11, aVarB, iArr) : I(bArr, i10, i11, aVarB, iArr);
    }

    public static final String D(byte[] bArr, C1274g format) {
        AbstractC5504s.h(bArr, "<this>");
        AbstractC5504s.h(format, "format");
        return C(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String E(byte[] bArr, C1274g c1274g, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c1274g = C1274g.f3740d.a();
        }
        return D(bArr, c1274g);
    }

    private static final String F(byte[] bArr, int i10, int i11, C1274g.a aVar, int[] iArr) {
        return aVar.k() ? H(bArr, i10, i11, aVar, iArr) : G(bArr, i10, i11, aVar, iArr);
    }

    private static final String G(byte[] bArr, int i10, int i11, C1274g.a aVar, int[] iArr) {
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        char[] cArr = new char[i(i11 - i10, strD.length(), strC.length(), strE.length())];
        int iG = g(bArr, i10, strC, strE, iArr, cArr, 0);
        for (int i12 = i10 + 1; i12 < i11; i12++) {
            iG = g(bArr, i12, strC, strE, iArr, cArr, B(strD, cArr, iG));
        }
        return C.v(cArr);
    }

    private static final String H(byte[] bArr, int i10, int i11, C1274g.a aVar, int[] iArr) {
        int length = aVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int iH = 0;
        if (length == 0) {
            char[] cArr = new char[b(((long) i12) * 2)];
            while (i10 < i11) {
                iH = h(bArr, i10, iArr, cArr, iH);
                i10++;
            }
            return C.v(cArr);
        }
        char[] cArr2 = new char[b((((long) i12) * 3) - 1)];
        char cCharAt = aVar.d().charAt(0);
        int iH2 = h(bArr, i10, iArr, cArr2, 0);
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            cArr2[iH2] = cCharAt;
            iH2 = h(bArr, i13, iArr, cArr2, iH2 + 1);
        }
        return C.v(cArr2);
    }

    private static final String I(byte[] bArr, int i10, int i11, C1274g.a aVar, int[] iArr) {
        int i12;
        int i13;
        int iG = aVar.g();
        int iF = aVar.f();
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        String strH = aVar.h();
        int iJ = j(i11 - i10, iG, iF, strH.length(), strD.length(), strC.length(), strE.length());
        char[] cArr = new char[iJ];
        int i14 = i10;
        int iB = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i11) {
            if (i15 == iG) {
                cArr[iB] = '\n';
                iB++;
                i12 = 0;
                i13 = 0;
            } else if (i16 == iF) {
                iB = B(strH, cArr, iB);
                i12 = i15;
                i13 = 0;
            } else {
                i12 = i15;
                i13 = i16;
            }
            if (i13 != 0) {
                iB = B(strD, cArr, iB);
            }
            String str = strC;
            int iG2 = g(bArr, i14, str, strE, iArr, cArr, iB);
            i14++;
            i16 = i13 + 1;
            iB = iG2;
            strC = str;
            i15 = i12 + 1;
        }
        if (iB == iJ) {
            return C.v(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final long J(long j10, long j11, int i10) {
        if (j10 <= 0 || j11 <= 0) {
            return 0L;
        }
        long j12 = i10;
        return (j10 + j12) / (j11 + j12);
    }

    private static final long a(long j10, int i10, int i11) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j11 = i10;
        return (j10 * j11) + (((long) i11) * (j11 - 1));
    }

    private static final int b(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) Td.F.m(Td.F.b(j10))));
    }

    private static final int c(String str, int i10, int i11) {
        if (str.charAt(i10) == '\r') {
            int i12 = i10 + 1;
            return (i12 >= i11 || str.charAt(i12) != '\n') ? i12 : i10 + 2;
        }
        if (str.charAt(i10) == '\n') {
            return i10 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i10 + ", but was " + str.charAt(i10));
    }

    private static final void d(String str, int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if (i13 < 1) {
            y(str, i10, i11, "at least", 1);
        } else if (i13 > i12) {
            f(str, i10, (i13 + i10) - i12);
        }
    }

    private static final void e(String str, int i10, int i11, String str2, String str3, boolean z10, int i12) {
        if ((i11 - i10) - str2.length() <= str3.length()) {
            z(str, i10, i11, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i13 = 0; i13 < length; i13++) {
                if (!AbstractC1270c.f(str2.charAt(i13), str.charAt(i10 + i13), z10)) {
                    A(str, i10, i11, str2, "prefix");
                }
            }
            i10 += str2.length();
        }
        int length2 = i11 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i14 = 0; i14 < length3; i14++) {
                if (!AbstractC1270c.f(str3.charAt(i14), str.charAt(length2 + i14), z10)) {
                    A(str, length2, i11, str3, "suffix");
                }
            }
        }
        d(str, i10, length2, i12);
    }

    private static final void f(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i10 + ", but was '" + str.charAt(i10) + "'.\nThe result won't fit the type being parsed.");
            }
            i10++;
        }
    }

    private static final int g(byte[] bArr, int i10, String str, String str2, int[] iArr, char[] cArr, int i11) {
        return B(str2, cArr, h(bArr, i10, iArr, cArr, B(str, cArr, i11)));
    }

    private static final int h(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    private static final int i(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i11;
        return b((((long) i10) * (((((long) i12) + 2) + ((long) i13)) + j10)) - j10);
    }

    public static final int j(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = i10 - 1;
        int i18 = i17 / i11;
        int i19 = (i11 - 1) / i12;
        int i20 = i10 % i11;
        if (i20 != 0) {
            i11 = i20;
        }
        int i21 = (i19 * i18) + ((i11 - 1) / i12);
        return b(((long) i18) + (((long) i21) * ((long) i13)) + (((long) ((i17 - i18) - i21)) * ((long) i14)) + (((long) i10) * (((long) i15) + 2 + ((long) i16))));
    }

    public static final int[] k() {
        return f3736a;
    }

    private static final byte[] l(String str, int i10, int i11, C1274g c1274g) {
        byte[] bArrN;
        AbstractC2263d.f19502a.a(i10, i11, str.length());
        if (i10 == i11) {
            return new byte[0];
        }
        C1274g.a aVarB = c1274g.b();
        return (!aVarB.j() || (bArrN = n(str, i10, i11, aVarB)) == null) ? q(str, i10, i11, aVarB) : bArrN;
    }

    public static final byte[] m(String str, C1274g format) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(format, "format");
        return l(str, 0, str.length(), format);
    }

    private static final byte[] n(String str, int i10, int i11, C1274g.a aVar) {
        return aVar.k() ? p(str, i10, i11, aVar) : o(str, i10, i11, aVar);
    }

    private static final byte[] o(String str, int i10, int i11, C1274g.a aVar) {
        String strC = aVar.c();
        String strE = aVar.e();
        String strD = aVar.d();
        long length = strD.length();
        long length2 = ((long) strC.length()) + 2 + ((long) strE.length()) + length;
        long j10 = i11 - i10;
        int i12 = (int) ((j10 + length) / length2);
        if ((((long) i12) * length2) - length != j10) {
            return null;
        }
        boolean zI = aVar.i();
        byte[] bArr = new byte[i12];
        if (strC.length() != 0) {
            int length3 = strC.length();
            for (int i13 = 0; i13 < length3; i13++) {
                if (!AbstractC1270c.f(strC.charAt(i13), str.charAt(i10 + i13), zI)) {
                    A(str, i10, i11, strC, "byte prefix");
                }
            }
            i10 += strC.length();
        }
        String str2 = strE + strD + strC;
        int i14 = i12 - 1;
        for (int i15 = 0; i15 < i14; i15++) {
            bArr[i15] = u(str, i10);
            i10 += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i16 = 0; i16 < length4; i16++) {
                    if (!AbstractC1270c.f(str2.charAt(i16), str.charAt(i10 + i16), zI)) {
                        A(str, i10, i11, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i10 += str2.length();
            }
        }
        bArr[i14] = u(str, i10);
        int i17 = i10 + 2;
        if (strE.length() == 0) {
            return bArr;
        }
        int length5 = strE.length();
        for (int i18 = 0; i18 < length5; i18++) {
            if (!AbstractC1270c.f(strE.charAt(i18), str.charAt(i17 + i18), zI)) {
                A(str, i17, i11, strE, "byte suffix");
            }
        }
        return bArr;
    }

    private static final byte[] p(String str, int i10, int i11, C1274g.a aVar) {
        int length = aVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int i13 = 2;
        if (length == 0) {
            if ((i12 & 1) != 0) {
                return null;
            }
            int i14 = i12 >> 1;
            byte[] bArr = new byte[i14];
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                bArr[i16] = u(str, i15);
                i15 += 2;
            }
            return bArr;
        }
        if (i12 % 3 != 2) {
            return null;
        }
        int i17 = (i12 / 3) + 1;
        byte[] bArr2 = new byte[i17];
        char cCharAt = aVar.d().charAt(0);
        bArr2[0] = u(str, 0);
        for (int i18 = 1; i18 < i17; i18++) {
            if (str.charAt(i13) != cCharAt) {
                String strD = aVar.d();
                boolean zI = aVar.i();
                if (strD.length() != 0) {
                    int length2 = strD.length();
                    for (int i19 = 0; i19 < length2; i19++) {
                        if (!AbstractC1270c.f(strD.charAt(i19), str.charAt(i13 + i19), zI)) {
                            A(str, i13, i11, strD, "byte separator");
                        }
                    }
                    strD.length();
                }
            }
            bArr2[i18] = u(str, i13 + 1);
            i13 += 3;
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final byte[] q(java.lang.String r18, int r19, int r20, Df.C1274g.a r21) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Df.AbstractC1273f.q(java.lang.String, int, int, Df.g$a):byte[]");
    }

    public static final long r(String str, int i10, int i11, C1274g format) {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(format, "format");
        return t(str, i10, i11, format, 16);
    }

    public static /* synthetic */ long s(String str, int i10, int i11, C1274g c1274g, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            c1274g = C1274g.f3740d.a();
        }
        return r(str, i10, i11, c1274g);
    }

    private static final long t(String str, int i10, int i11, C1274g c1274g, int i12) {
        AbstractC2263d.f19502a.a(i10, i11, str.length());
        C1274g.c cVarC = c1274g.c();
        if (cVarC.f()) {
            d(str, i10, i11, i12);
            return v(str, i10, i11);
        }
        String strD = cVarC.d();
        String strE = cVarC.e();
        e(str, i10, i11, strD, strE, cVarC.c(), i12);
        return v(str, i10 + strD.length(), i11 - strE.length());
    }

    private static final byte u(String str, int i10) {
        int[] iArr;
        int i11;
        int i12;
        char cCharAt = str.charAt(i10);
        if ((cCharAt >>> '\b') != 0 || (i11 = (iArr = f3738c)[cCharAt]) < 0) {
            x(str, i10);
            throw new C2160k();
        }
        int i13 = i10 + 1;
        char cCharAt2 = str.charAt(i13);
        if ((cCharAt2 >>> '\b') == 0 && (i12 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i11 << 4) | i12);
        }
        x(str, i13);
        throw new C2160k();
    }

    private static final long v(String str, int i10, int i11) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f3739d[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            x(str, i10);
            throw new C2160k();
        }
        return j10;
    }

    public static final int w(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long jA;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = ((long) i15) + 2 + ((long) i16);
        long jA2 = a(j10, i12, i14);
        if (i11 <= i12) {
            jA = a(j10, i11, i14);
        } else {
            jA = a(jA2, i11 / i12, i13);
            int i17 = i11 % i12;
            if (i17 != 0) {
                jA = jA + ((long) i13) + a(j10, i17, i14);
            }
        }
        long j11 = i10;
        long J10 = J(j11, jA, 1);
        long j12 = j11 - ((jA + 1) * J10);
        long J11 = J(j12, jA2, i13);
        long j13 = j12 - ((jA2 + ((long) i13)) * J11);
        long J12 = J(j13, j10, i14);
        return (int) ((J10 * ((long) i11)) + (J11 * ((long) i12)) + J12 + ((long) (j13 - ((j10 + ((long) i14)) * J12) > 0 ? 1 : 0)));
    }

    private static final Void x(String str, int i10) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i10 + ", but was " + str.charAt(i10));
    }

    private static final void y(String str, int i10, int i11, String str2, int i12) {
        AbstractC5504s.f(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        AbstractC5504s.g(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    private static final void z(String str, int i10, int i11, String str2, String str3) {
        AbstractC5504s.f(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        AbstractC5504s.g(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }
}
