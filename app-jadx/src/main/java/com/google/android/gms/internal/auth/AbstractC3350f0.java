package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.f0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC3350f0 {
    static int a(byte[] bArr, int i10, C3347e0 c3347e0) throws H0 {
        int iH = h(bArr, i10, c3347e0);
        int i11 = c3347e0.f39168a;
        if (i11 < 0) {
            throw H0.c();
        }
        if (i11 > bArr.length - iH) {
            throw H0.f();
        }
        if (i11 == 0) {
            c3347e0.f39170c = AbstractC3383q0.f39290b;
            return iH;
        }
        c3347e0.f39170c = AbstractC3383q0.t(bArr, iH, i11);
        return iH + i11;
    }

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int c(InterfaceC3366k1 interfaceC3366k1, byte[] bArr, int i10, int i11, int i12, C3347e0 c3347e0) throws H0 {
        Object objL = interfaceC3366k1.l();
        int iL = l(objL, interfaceC3366k1, bArr, i10, i11, i12, c3347e0);
        interfaceC3366k1.a(objL);
        c3347e0.f39170c = objL;
        return iL;
    }

    static int d(InterfaceC3366k1 interfaceC3366k1, byte[] bArr, int i10, int i11, C3347e0 c3347e0) throws H0 {
        Object objL = interfaceC3366k1.l();
        int iM = m(objL, interfaceC3366k1, bArr, i10, i11, c3347e0);
        interfaceC3366k1.a(objL);
        c3347e0.f39170c = objL;
        return iM;
    }

    static int e(InterfaceC3366k1 interfaceC3366k1, int i10, byte[] bArr, int i11, int i12, E0 e02, C3347e0 c3347e0) throws H0 {
        int iD = d(interfaceC3366k1, bArr, i11, i12, c3347e0);
        e02.add(c3347e0.f39170c);
        while (iD < i12) {
            int iH = h(bArr, iD, c3347e0);
            if (i10 != c3347e0.f39168a) {
                break;
            }
            iD = d(interfaceC3366k1, bArr, iH, i12, c3347e0);
            e02.add(c3347e0.f39170c);
        }
        return iD;
    }

    static int f(byte[] bArr, int i10, E0 e02, C3347e0 c3347e0) throws H0 {
        android.support.v4.media.session.b.a(e02);
        int iH = h(bArr, i10, c3347e0);
        int i11 = c3347e0.f39168a + iH;
        if (iH < i11) {
            h(bArr, iH, c3347e0);
            throw null;
        }
        if (iH == i11) {
            return iH;
        }
        throw H0.f();
    }

    static int g(int i10, byte[] bArr, int i11, int i12, C3386r1 c3386r1, C3347e0 c3347e0) throws H0 {
        if ((i10 >>> 3) == 0) {
            throw H0.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, c3347e0);
            c3386r1.h(i10, Long.valueOf(c3347e0.f39169b));
            return iK;
        }
        if (i13 == 1) {
            c3386r1.h(i10, Long.valueOf(n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iH = h(bArr, i11, c3347e0);
            int i14 = c3347e0.f39168a;
            if (i14 < 0) {
                throw H0.c();
            }
            if (i14 > bArr.length - iH) {
                throw H0.f();
            }
            if (i14 == 0) {
                c3386r1.h(i10, AbstractC3383q0.f39290b);
            } else {
                c3386r1.h(i10, AbstractC3383q0.t(bArr, iH, i14));
            }
            return iH + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw H0.a();
            }
            c3386r1.h(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C3386r1 c3386r1D = C3386r1.d();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iH2 = h(bArr, i11, c3347e0);
            i16 = c3347e0.f39168a;
            if (i16 == i15) {
                i11 = iH2;
                break;
            }
            i11 = g(i16, bArr, iH2, i12, c3386r1D, c3347e0);
        }
        if (i11 > i12 || i16 != i15) {
            throw H0.d();
        }
        c3386r1.h(i10, c3386r1D);
        return i11;
    }

    static int h(byte[] bArr, int i10, C3347e0 c3347e0) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return i(b10, bArr, i11, c3347e0);
        }
        c3347e0.f39168a = b10;
        return i11;
    }

    static int i(int i10, byte[] bArr, int i11, C3347e0 c3347e0) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c3347e0.f39168a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c3347e0.f39168a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c3347e0.f39168a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c3347e0.f39168a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c3347e0.f39168a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int j(int i10, byte[] bArr, int i11, int i12, E0 e02, C3347e0 c3347e0) {
        android.support.v4.media.session.b.a(e02);
        h(bArr, i11, c3347e0);
        int i13 = c3347e0.f39168a;
        throw null;
    }

    static int k(byte[] bArr, int i10, C3347e0 c3347e0) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c3347e0.f39169b = j10;
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
        c3347e0.f39169b = j11;
        return i12;
    }

    static int l(Object obj, InterfaceC3366k1 interfaceC3366k1, byte[] bArr, int i10, int i11, int i12, C3347e0 c3347e0) throws H0 {
        int iQ = ((C3345d1) interfaceC3366k1).q(obj, bArr, i10, i11, i12, c3347e0);
        c3347e0.f39170c = obj;
        return iQ;
    }

    static int m(Object obj, InterfaceC3366k1 interfaceC3366k1, byte[] bArr, int i10, int i11, C3347e0 c3347e0) throws H0 {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = i(i13, bArr, i12, c3347e0);
            i13 = c3347e0.f39168a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw H0.f();
        }
        int i15 = i14 + i13;
        interfaceC3366k1.d(obj, bArr, i14, i15, c3347e0);
        c3347e0.f39170c = obj;
        return i15;
    }

    static long n(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
