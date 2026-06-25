package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3660e1 {

    /* JADX INFO: renamed from: a */
    private static volatile int f40453a = 100;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f40454b = 0;

    static int a(byte[] bArr, int i10, C3655d1 c3655d1) throws R1 {
        int i11 = i(bArr, i10, c3655d1);
        int i12 = c3655d1.f40448a;
        if (i12 < 0) {
            throw new R1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 > bArr.length - i11) {
            throw new R1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i12 == 0) {
            c3655d1.f40450c = AbstractC3710o1.f40523b;
            return i11;
        }
        c3655d1.f40450c = AbstractC3710o1.s(bArr, i11, i12);
        return i11 + i12;
    }

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int c(InterfaceC3716p2 interfaceC3716p2, byte[] bArr, int i10, int i11, int i12, C3655d1 c3655d1) throws R1 {
        Object objM = interfaceC3716p2.m();
        int iM = m(objM, interfaceC3716p2, bArr, i10, i11, i12, c3655d1);
        interfaceC3716p2.e(objM);
        c3655d1.f40450c = objM;
        return iM;
    }

    static int d(InterfaceC3716p2 interfaceC3716p2, byte[] bArr, int i10, int i11, C3655d1 c3655d1) throws R1 {
        Object objM = interfaceC3716p2.m();
        int iN = n(objM, interfaceC3716p2, bArr, i10, i11, c3655d1);
        interfaceC3716p2.e(objM);
        c3655d1.f40450c = objM;
        return iN;
    }

    static int e(InterfaceC3716p2 interfaceC3716p2, int i10, byte[] bArr, int i11, int i12, O1 o12, C3655d1 c3655d1) throws R1 {
        int iD = d(interfaceC3716p2, bArr, i11, i12, c3655d1);
        o12.add(c3655d1.f40450c);
        while (iD < i12) {
            int i13 = i(bArr, iD, c3655d1);
            if (i10 != c3655d1.f40448a) {
                break;
            }
            iD = d(interfaceC3716p2, bArr, i13, i12, c3655d1);
            o12.add(c3655d1.f40450c);
        }
        return iD;
    }

    static int f(byte[] bArr, int i10, O1 o12, C3655d1 c3655d1) throws R1 {
        K1 k12 = (K1) o12;
        int i11 = i(bArr, i10, c3655d1);
        int i12 = c3655d1.f40448a + i11;
        while (i11 < i12) {
            i11 = i(bArr, i11, c3655d1);
            k12.e(c3655d1.f40448a);
        }
        if (i11 == i12) {
            return i11;
        }
        throw new R1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(byte[] bArr, int i10, C3655d1 c3655d1) throws R1 {
        int i11;
        int i12 = i(bArr, i10, c3655d1);
        int i13 = c3655d1.f40448a;
        if (i13 < 0) {
            throw new R1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i13 == 0) {
            c3655d1.f40450c = "";
            return i12;
        }
        int i14 = F2.f40208a;
        int length = bArr.length;
        if ((((length - i12) - i13) | i12 | i13) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        int i15 = i12 + i13;
        char[] cArr = new char[i13];
        int i16 = 0;
        while (i12 < i15) {
            byte b10 = bArr[i12];
            if (!D2.d(b10)) {
                break;
            }
            i12++;
            cArr[i16] = (char) b10;
            i16++;
        }
        int i17 = i16;
        while (i12 < i15) {
            int i18 = i12 + 1;
            byte b11 = bArr[i12];
            if (D2.d(b11)) {
                cArr[i17] = (char) b11;
                i17++;
                i12 = i18;
                while (i12 < i15) {
                    byte b12 = bArr[i12];
                    if (D2.d(b12)) {
                        i12++;
                        cArr[i17] = (char) b12;
                        i17++;
                    }
                }
            } else {
                if (b11 < -32) {
                    if (i18 >= i15) {
                        throw new R1("Protocol message had invalid UTF-8.");
                    }
                    i11 = i17 + 1;
                    i12 += 2;
                    D2.c(b11, bArr[i18], cArr, i17);
                } else if (b11 < -16) {
                    if (i18 >= i15 - 1) {
                        throw new R1("Protocol message had invalid UTF-8.");
                    }
                    i11 = i17 + 1;
                    int i19 = i12 + 2;
                    i12 += 3;
                    D2.b(b11, bArr[i18], bArr[i19], cArr, i17);
                } else {
                    if (i18 >= i15 - 2) {
                        throw new R1("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i18];
                    int i20 = i12 + 3;
                    byte b14 = bArr[i12 + 2];
                    i12 += 4;
                    D2.a(b11, b13, b14, bArr[i20], cArr, i17);
                    i17 += 2;
                }
                i17 = i11;
            }
        }
        c3655d1.f40450c = new String(cArr, 0, i17);
        return i15;
    }

    static int h(int i10, byte[] bArr, int i11, int i12, C3749w2 c3749w2, C3655d1 c3655d1) throws R1 {
        if ((i10 >>> 3) == 0) {
            throw new R1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iL = l(bArr, i11, c3655d1);
            c3749w2.j(i10, Long.valueOf(c3655d1.f40449b));
            return iL;
        }
        if (i13 == 1) {
            c3749w2.j(i10, Long.valueOf(o(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int i14 = i(bArr, i11, c3655d1);
            int i15 = c3655d1.f40448a;
            if (i15 < 0) {
                throw new R1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - i14) {
                throw new R1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                c3749w2.j(i10, AbstractC3710o1.f40523b);
            } else {
                c3749w2.j(i10, AbstractC3710o1.s(bArr, i14, i15));
            }
            return i14 + i15;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new R1("Protocol message contained an invalid tag (zero).");
            }
            c3749w2.j(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i16 = (i10 & (-8)) | 4;
        C3749w2 c3749w2F = C3749w2.f();
        int i17 = c3655d1.f40452e + 1;
        c3655d1.f40452e = i17;
        p(i17);
        int i18 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int i19 = i(bArr, i11, c3655d1);
            int i20 = c3655d1.f40448a;
            if (i20 == i16) {
                i18 = i20;
                i11 = i19;
                break;
            }
            i11 = h(i20, bArr, i19, i12, c3749w2F, c3655d1);
            i18 = i20;
        }
        c3655d1.f40452e--;
        if (i11 > i12 || i18 != i16) {
            throw new R1("Failed to parse the message.");
        }
        c3749w2.j(i10, c3749w2F);
        return i11;
    }

    static int i(byte[] bArr, int i10, C3655d1 c3655d1) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return j(b10, bArr, i11, c3655d1);
        }
        c3655d1.f40448a = b10;
        return i11;
    }

    static int j(int i10, byte[] bArr, int i11, C3655d1 c3655d1) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c3655d1.f40448a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c3655d1.f40448a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c3655d1.f40448a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c3655d1.f40448a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c3655d1.f40448a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int k(int i10, byte[] bArr, int i11, int i12, O1 o12, C3655d1 c3655d1) {
        K1 k12 = (K1) o12;
        int i13 = i(bArr, i11, c3655d1);
        k12.e(c3655d1.f40448a);
        while (i13 < i12) {
            int i14 = i(bArr, i13, c3655d1);
            if (i10 != c3655d1.f40448a) {
                break;
            }
            i13 = i(bArr, i14, c3655d1);
            k12.e(c3655d1.f40448a);
        }
        return i13;
    }

    static int l(byte[] bArr, int i10, C3655d1 c3655d1) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c3655d1.f40449b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        c3655d1.f40449b = j11;
        return i12;
    }

    static int m(Object obj, InterfaceC3716p2 interfaceC3716p2, byte[] bArr, int i10, int i11, int i12, C3655d1 c3655d1) throws R1 {
        int i13 = c3655d1.f40452e + 1;
        c3655d1.f40452e = i13;
        p(i13);
        int iY = ((C3681i2) interfaceC3716p2).y(obj, bArr, i10, i11, i12, c3655d1);
        c3655d1.f40452e--;
        c3655d1.f40450c = obj;
        return iY;
    }

    static int n(Object obj, InterfaceC3716p2 interfaceC3716p2, byte[] bArr, int i10, int i11, C3655d1 c3655d1) throws R1 {
        int iJ = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iJ = j(i12, bArr, iJ, c3655d1);
            i12 = c3655d1.f40448a;
        }
        int i13 = iJ;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new R1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = c3655d1.f40452e + 1;
        c3655d1.f40452e = i14;
        p(i14);
        int i15 = i13 + i12;
        interfaceC3716p2.h(obj, bArr, i13, i15, c3655d1);
        c3655d1.f40452e--;
        c3655d1.f40450c = obj;
        return i15;
    }

    static long o(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    private static void p(int i10) throws R1 {
        if (i10 >= f40453a) {
            throw new R1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
