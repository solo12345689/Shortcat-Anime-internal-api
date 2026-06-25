package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y4 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3627y4 {

    /* JADX INFO: renamed from: a */
    private static volatile int f40111a = 100;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f40112b = 0;

    static int a(byte[] bArr, int i10, C3619x4 c3619x4) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return b(b10, bArr, i11, c3619x4);
        }
        c3619x4.f40026a = b10;
        return i11;
    }

    static int b(int i10, byte[] bArr, int i11, C3619x4 c3619x4) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c3619x4.f40026a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c3619x4.f40026a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c3619x4.f40026a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c3619x4.f40026a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c3619x4.f40026a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int c(byte[] bArr, int i10, C3619x4 c3619x4) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c3619x4.f40027b = j10;
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
        c3619x4.f40027b = j11;
        return i12;
    }

    static int d(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static long e(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    static int f(byte[] bArr, int i10, C3619x4 c3619x4) throws C3523m5 {
        int i11;
        int iA = a(bArr, i10, c3619x4);
        int i12 = c3619x4.f40026a;
        if (i12 < 0) {
            throw new C3523m5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            c3619x4.f40028c = "";
            return iA;
        }
        int i13 = AbstractC3506k6.f39814a;
        int length = bArr.length;
        if ((((length - iA) - i12) | iA | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iA), Integer.valueOf(i12)));
        }
        int i14 = iA + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (iA < i14) {
            byte b10 = bArr[iA];
            if (!AbstractC3488i6.a(b10)) {
                break;
            }
            iA++;
            cArr[i15] = (char) b10;
            i15++;
        }
        int i16 = i15;
        while (iA < i14) {
            int i17 = iA + 1;
            byte b11 = bArr[iA];
            if (AbstractC3488i6.a(b11)) {
                cArr[i16] = (char) b11;
                i16++;
                iA = i17;
                while (iA < i14) {
                    byte b12 = bArr[iA];
                    if (AbstractC3488i6.a(b12)) {
                        iA++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                }
            } else {
                if (b11 < -32) {
                    if (i17 >= i14) {
                        throw new C3523m5("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    iA += 2;
                    AbstractC3488i6.b(b11, bArr[i17], cArr, i16);
                } else if (b11 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new C3523m5("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = iA + 2;
                    iA += 3;
                    AbstractC3488i6.c(b11, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new C3523m5("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i17];
                    int i19 = iA + 3;
                    byte b14 = bArr[iA + 2];
                    iA += 4;
                    AbstractC3488i6.d(b11, b13, b14, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        c3619x4.f40028c = new String(cArr, 0, i16);
        return i14;
    }

    static int g(byte[] bArr, int i10, C3619x4 c3619x4) throws C3523m5 {
        int iA = a(bArr, i10, c3619x4);
        int i11 = c3619x4.f40026a;
        if (i11 < 0) {
            throw new C3523m5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iA) {
            throw new C3523m5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            c3619x4.f40028c = I4.f39386b;
            return iA;
        }
        c3619x4.f40028c = I4.l(bArr, iA, i11);
        return iA + i11;
    }

    static int h(P5 p52, byte[] bArr, int i10, int i11, C3619x4 c3619x4) throws C3523m5 {
        Object objZza = p52.zza();
        int iJ = j(objZza, p52, bArr, i10, i11, c3619x4);
        p52.f(objZza);
        c3619x4.f40028c = objZza;
        return iJ;
    }

    static int i(P5 p52, byte[] bArr, int i10, int i11, int i12, C3619x4 c3619x4) throws C3523m5 {
        Object objZza = p52.zza();
        int iK = k(objZza, p52, bArr, i10, i11, i12, c3619x4);
        p52.f(objZza);
        c3619x4.f40028c = objZza;
        return iK;
    }

    static int j(Object obj, P5 p52, byte[] bArr, int i10, int i11, C3619x4 c3619x4) throws C3523m5 {
        int iB = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iB = b(i12, bArr, iB, c3619x4);
            i12 = c3619x4.f40026a;
        }
        int i13 = iB;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new C3523m5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = c3619x4.f40030e + 1;
        c3619x4.f40030e = i14;
        q(i14);
        int i15 = i13 + i12;
        p52.g(obj, bArr, i13, i15, c3619x4);
        c3619x4.f40030e--;
        c3619x4.f40028c = obj;
        return i15;
    }

    static int k(Object obj, P5 p52, byte[] bArr, int i10, int i11, int i12, C3619x4 c3619x4) throws C3523m5 {
        int i13 = c3619x4.f40030e + 1;
        c3619x4.f40030e = i13;
        q(i13);
        int iZ = ((H5) p52).z(obj, bArr, i10, i11, i12, c3619x4);
        c3619x4.f40030e--;
        c3619x4.f40028c = obj;
        return iZ;
    }

    static int l(int i10, byte[] bArr, int i11, int i12, InterfaceC3496j5 interfaceC3496j5, C3619x4 c3619x4) {
        C3451e5 c3451e5 = (C3451e5) interfaceC3496j5;
        int iA = a(bArr, i11, c3619x4);
        c3451e5.e(c3619x4.f40026a);
        while (iA < i12) {
            int iA2 = a(bArr, iA, c3619x4);
            if (i10 != c3619x4.f40026a) {
                break;
            }
            iA = a(bArr, iA2, c3619x4);
            c3451e5.e(c3619x4.f40026a);
        }
        return iA;
    }

    static int m(byte[] bArr, int i10, InterfaceC3496j5 interfaceC3496j5, C3619x4 c3619x4) throws C3523m5 {
        C3451e5 c3451e5 = (C3451e5) interfaceC3496j5;
        int iA = a(bArr, i10, c3619x4);
        int i11 = c3619x4.f40026a + iA;
        while (iA < i11) {
            iA = a(bArr, iA, c3619x4);
            c3451e5.e(c3619x4.f40026a);
        }
        if (iA == i11) {
            return iA;
        }
        throw new C3523m5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(P5 p52, int i10, byte[] bArr, int i11, int i12, InterfaceC3496j5 interfaceC3496j5, C3619x4 c3619x4) throws C3523m5 {
        int iH = h(p52, bArr, i11, i12, c3619x4);
        interfaceC3496j5.add(c3619x4.f40028c);
        while (iH < i12) {
            int iA = a(bArr, iH, c3619x4);
            if (i10 != c3619x4.f40026a) {
                break;
            }
            iH = h(p52, bArr, iA, i12, c3619x4);
            interfaceC3496j5.add(c3619x4.f40028c);
        }
        return iH;
    }

    static int o(int i10, byte[] bArr, int i11, int i12, C3425b6 c3425b6, C3619x4 c3619x4) throws C3523m5 {
        if ((i10 >>> 3) == 0) {
            throw new C3523m5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iC = c(bArr, i11, c3619x4);
            c3425b6.j(i10, Long.valueOf(c3619x4.f40027b));
            return iC;
        }
        if (i13 == 1) {
            c3425b6.j(i10, Long.valueOf(e(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iA = a(bArr, i11, c3619x4);
            int i14 = c3619x4.f40026a;
            if (i14 < 0) {
                throw new C3523m5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iA) {
                throw new C3523m5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                c3425b6.j(i10, I4.f39386b);
            } else {
                c3425b6.j(i10, I4.l(bArr, iA, i14));
            }
            return iA + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new C3523m5("Protocol message contained an invalid tag (zero).");
            }
            c3425b6.j(i10, Integer.valueOf(d(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C3425b6 c3425b6B = C3425b6.b();
        int i16 = c3619x4.f40030e + 1;
        c3619x4.f40030e = i16;
        q(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iA2 = a(bArr, i11, c3619x4);
            int i18 = c3619x4.f40026a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iA2;
                break;
            }
            i11 = o(i18, bArr, iA2, i12, c3425b6B, c3619x4);
            i17 = i18;
        }
        c3619x4.f40030e--;
        if (i11 > i12 || i17 != i15) {
            throw new C3523m5("Failed to parse the message.");
        }
        c3425b6.j(i10, c3425b6B);
        return i11;
    }

    static int p(int i10, byte[] bArr, int i11, int i12, C3619x4 c3619x4) throws C3523m5 {
        if ((i10 >>> 3) == 0) {
            throw new C3523m5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return c(bArr, i11, c3619x4);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return a(bArr, i11, c3619x4) + c3619x4.f40026a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new C3523m5("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = a(bArr, i11, c3619x4);
            i15 = c3619x4.f40026a;
            if (i15 == i14) {
                break;
            }
            i11 = p(i15, bArr, i11, i12, c3619x4);
        }
        if (i11 > i12 || i15 != i14) {
            throw new C3523m5("Failed to parse the message.");
        }
        return i11;
    }

    private static void q(int i10) throws C3523m5 {
        if (i10 >= f40111a) {
            throw new C3523m5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
