package Rh;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract class e {

    /* JADX INFO: renamed from: a */
    private static final int[] f15533a = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    /* JADX INFO: renamed from: b */
    private static final int[] f15534b = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};

    /* JADX INFO: renamed from: c */
    private static final int[] f15535c = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};

    /* JADX INFO: renamed from: d */
    private static final int[] f15536d = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    private static void a(k kVar) {
        a aVar = kVar.f15581c;
        byte[] bArr = kVar.f15582d;
        int i10 = kVar.f15585g;
        if (i10 <= 0) {
            a.k(aVar);
            kVar.f15579a = 1;
            return;
        }
        int iMin = Math.min(kVar.f15569Q - kVar.f15596r, i10);
        a.c(aVar, bArr, kVar.f15596r, iMin);
        kVar.f15585g -= iMin;
        int i11 = kVar.f15596r + iMin;
        kVar.f15596r = i11;
        int i12 = kVar.f15569Q;
        if (i11 != i12) {
            a.k(aVar);
            kVar.f15579a = 1;
        } else {
            kVar.f15580b = 5;
            kVar.f15577Y = i12;
            kVar.f15576X = 0;
            kVar.f15579a = 12;
        }
    }

    private static void b(k kVar, int i10) {
        a aVar = kVar.f15581c;
        int[] iArr = kVar.f15594p;
        int i11 = i10 * 2;
        a.d(aVar);
        int i12 = i10 * 1080;
        int iR = r(kVar.f15583e, i12, aVar);
        kVar.f15592n[i10] = m(kVar.f15584f, i12, aVar);
        int i13 = iR == 1 ? iArr[i11 + 1] + 1 : iR == 0 ? iArr[i11] : iR - 2;
        int i14 = kVar.f15593o[i10];
        if (i13 >= i14) {
            i13 -= i14;
        }
        int i15 = i11 + 1;
        iArr[i11] = iArr[i15];
        iArr[i15] = i13;
    }

    private static void c(k kVar) {
        b(kVar, 1);
        kVar.f15558F = kVar.f15590l.f15542c[kVar.f15594p[3]];
    }

    private static int d(int i10, byte[] bArr, a aVar) {
        a.j(aVar);
        int iH = h(aVar) + 1;
        if (iH == 1) {
            m.a(bArr, 0, i10);
            return iH;
        }
        int i11 = a.i(aVar, 1) == 1 ? a.i(aVar, 4) + 1 : 0;
        int[] iArr = new int[1080];
        n(iH + i11, iArr, 0, aVar);
        int i12 = 0;
        while (i12 < i10) {
            a.j(aVar);
            a.d(aVar);
            int iR = r(iArr, 0, aVar);
            if (iR == 0) {
                bArr[i12] = 0;
            } else if (iR <= i11) {
                for (int i13 = (1 << iR) + a.i(aVar, iR); i13 != 0; i13--) {
                    if (i12 >= i10) {
                        throw new c("Corrupted context map");
                    }
                    bArr[i12] = 0;
                    i12++;
                }
            } else {
                bArr[i12] = (byte) (iR - i11);
            }
            i12++;
        }
        if (a.i(aVar, 1) == 1) {
            j(bArr, i10);
        }
        return iH;
    }

    private static void e(k kVar) {
        b(kVar, 2);
        kVar.f15555C = kVar.f15594p[5] << 2;
    }

    private static void f(k kVar) {
        b(kVar, 0);
        int i10 = kVar.f15594p[1];
        int i11 = i10 << 6;
        kVar.f15554B = i11;
        int i12 = kVar.f15553A[i11] & 255;
        kVar.f15600v = i12;
        kVar.f15601w = kVar.f15589k.f15542c[i12];
        byte b10 = kVar.f15604z[i10];
        int[] iArr = d.f15532b;
        kVar.f15556D = iArr[b10];
        kVar.f15557E = iArr[b10 + 1];
    }

    private static void g(a aVar, k kVar) {
        boolean z10 = a.i(aVar, 1) == 1;
        kVar.f15586h = z10;
        kVar.f15585g = 0;
        kVar.f15587i = false;
        kVar.f15588j = false;
        if (!z10 || a.i(aVar, 1) == 0) {
            int i10 = a.i(aVar, 2) + 4;
            if (i10 == 7) {
                kVar.f15588j = true;
                if (a.i(aVar, 1) != 0) {
                    throw new c("Corrupted reserved bit");
                }
                int i11 = a.i(aVar, 2);
                if (i11 == 0) {
                    return;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = a.i(aVar, 8);
                    if (i13 == 0 && i12 + 1 == i11 && i11 > 1) {
                        throw new c("Exuberant nibble");
                    }
                    kVar.f15585g = (i13 << (i12 * 8)) | kVar.f15585g;
                }
            } else {
                for (int i14 = 0; i14 < i10; i14++) {
                    int i15 = a.i(aVar, 4);
                    if (i15 == 0 && i14 + 1 == i10 && i10 > 4) {
                        throw new c("Exuberant nibble");
                    }
                    kVar.f15585g = (i15 << (i14 * 4)) | kVar.f15585g;
                }
            }
            kVar.f15585g++;
            if (kVar.f15586h) {
                return;
            }
            kVar.f15587i = a.i(aVar, 1) == 1;
        }
    }

    private static int h(a aVar) {
        if (a.i(aVar, 1) == 0) {
            return 0;
        }
        int i10 = a.i(aVar, 3);
        if (i10 == 0) {
            return 1;
        }
        return a.i(aVar, i10) + (1 << i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00a4, code lost:
    
        throw new Rh.c("Invalid backward reference");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0139 A[LOOP:4: B:230:0x0139->B:356:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void i(Rh.k r19) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Rh.e.i(Rh.k):void");
    }

    private static void j(byte[] bArr, int i10) {
        int[] iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = i11;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = bArr[i12] & 255;
            bArr[i12] = (byte) iArr[i13];
            if (i13 != 0) {
                l(iArr, i13);
            }
        }
    }

    private static void k(k kVar) {
        int i10;
        int i11 = kVar.f15568P;
        long j10 = i11;
        long j11 = kVar.f15570R;
        if (j10 > j11) {
            while (true) {
                int i12 = i11 >> 1;
                if (i12 <= ((int) j11) + kVar.f15571S.length) {
                    break;
                } else {
                    i11 = i12;
                }
            }
            if (!kVar.f15586h && i11 < 16384 && kVar.f15568P >= 16384) {
                i11 = 16384;
            }
        }
        int i13 = kVar.f15569Q;
        if (i11 <= i13) {
            return;
        }
        byte[] bArr = new byte[i11 + 37];
        byte[] bArr2 = kVar.f15582d;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i13);
        } else {
            byte[] bArr3 = kVar.f15571S;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i14 = kVar.f15567O;
                if (length > i14) {
                    i10 = length - i14;
                } else {
                    i14 = length;
                    i10 = 0;
                }
                System.arraycopy(bArr3, i10, bArr, 0, i14);
                kVar.f15596r = i14;
                kVar.f15572T = i14;
            }
        }
        kVar.f15582d = bArr;
        kVar.f15569Q = i11;
    }

    private static void l(int[] iArr, int i10) {
        int i11 = iArr[i10];
        while (i10 > 0) {
            iArr[i10] = iArr[i10 - 1];
            i10--;
        }
        iArr[0] = i11;
    }

    private static int m(int[] iArr, int i10, a aVar) {
        a.d(aVar);
        int iR = r(iArr, i10, aVar);
        return j.f15545a[iR] + a.i(aVar, j.f15546b[iR]);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void n(int r14, int[] r15, int r16, Rh.a r17) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Rh.e.n(int, int[], int, Rh.a):void");
    }

    private static void o(int[] iArr, int i10, int[] iArr2, a aVar) {
        int[] iArr3 = new int[32];
        g.a(iArr3, 0, 5, iArr, 18);
        int i11 = 8;
        int i12 = 32768;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i10 && i12 > 0) {
            a.j(aVar);
            a.d(aVar);
            long j10 = aVar.f15523f;
            int i16 = aVar.f15524g;
            int i17 = iArr3[((int) (j10 >>> i16)) & 31];
            aVar.f15524g = i16 + (i17 >> 16);
            int i18 = i17 & 65535;
            if (i18 < 16) {
                int i19 = i13 + 1;
                iArr2[i13] = i18;
                if (i18 != 0) {
                    i12 -= 32768 >> i18;
                    i13 = i19;
                    i11 = i18;
                } else {
                    i13 = i19;
                }
                i15 = 0;
            } else {
                int i20 = i18 - 14;
                int i21 = i18 == 16 ? i11 : 0;
                if (i14 != i21) {
                    i15 = 0;
                    i14 = i21;
                }
                int i22 = (i15 > 0 ? (i15 - 2) << i20 : i15) + a.i(aVar, i20) + 3;
                int i23 = i22 - i15;
                if (i13 + i23 > i10) {
                    throw new c("symbol + repeatDelta > numSymbols");
                }
                int i24 = 0;
                while (i24 < i23) {
                    iArr2[i13] = i14;
                    i24++;
                    i13++;
                }
                if (i14 != 0) {
                    i12 -= i23 << (15 - i14);
                }
                i15 = i22;
            }
        }
        if (i12 != 0) {
            throw new c("Unused space");
        }
        m.b(iArr2, i13, i10 - i13);
    }

    private static void p(k kVar) {
        int i10;
        int[] iArr;
        a aVar = kVar.f15581c;
        for (int i11 = 0; i11 < 3; i11++) {
            kVar.f15593o[i11] = h(aVar) + 1;
            kVar.f15592n[i11] = 268435456;
            int i12 = kVar.f15593o[i11];
            if (i12 > 1) {
                int i13 = i11 * 1080;
                n(i12 + 2, kVar.f15583e, i13, aVar);
                n(26, kVar.f15584f, i13, aVar);
                kVar.f15592n[i11] = m(kVar.f15584f, i13, aVar);
            }
        }
        a.j(aVar);
        kVar.f15563K = a.i(aVar, 2);
        int i14 = a.i(aVar, 4);
        int i15 = kVar.f15563K;
        int i16 = (i14 << i15) + 16;
        kVar.f15561I = i16;
        kVar.f15562J = (1 << i15) - 1;
        int i17 = i16 + (48 << i15);
        kVar.f15604z = new byte[kVar.f15593o[0]];
        int i18 = 0;
        while (true) {
            i10 = kVar.f15593o[0];
            if (i18 >= i10) {
                break;
            }
            int iMin = Math.min(i18 + 96, i10);
            while (i18 < iMin) {
                kVar.f15604z[i18] = (byte) (a.i(aVar, 2) << 1);
                i18++;
            }
            a.j(aVar);
        }
        byte[] bArr = new byte[i10 << 6];
        kVar.f15553A = bArr;
        int iD = d(i10 << 6, bArr, aVar);
        kVar.f15599u = true;
        int i19 = 0;
        while (true) {
            iArr = kVar.f15593o;
            if (i19 >= (iArr[0] << 6)) {
                break;
            }
            if (kVar.f15553A[i19] != (i19 >> 6)) {
                kVar.f15599u = false;
                break;
            }
            i19++;
        }
        int i20 = iArr[2];
        byte[] bArr2 = new byte[i20 << 2];
        kVar.f15560H = bArr2;
        int iD2 = d(i20 << 2, bArr2, aVar);
        h.b(kVar.f15589k, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, iD);
        h.b(kVar.f15590l, 704, kVar.f15593o[1]);
        h.b(kVar.f15591m, i17, iD2);
        h.a(kVar.f15589k, aVar);
        h.a(kVar.f15590l, aVar);
        h.a(kVar.f15591m, aVar);
        kVar.f15554B = 0;
        kVar.f15555C = 0;
        int[] iArr2 = d.f15532b;
        byte b10 = kVar.f15604z[0];
        kVar.f15556D = iArr2[b10];
        kVar.f15557E = iArr2[b10 + 1];
        kVar.f15600v = 0;
        kVar.f15601w = kVar.f15589k.f15542c[0];
        kVar.f15558F = kVar.f15590l.f15542c[0];
        int[] iArr3 = kVar.f15594p;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    private static void q(k kVar) {
        a aVar = kVar.f15581c;
        if (kVar.f15586h) {
            kVar.f15580b = 10;
            kVar.f15577Y = kVar.f15596r;
            kVar.f15576X = 0;
            kVar.f15579a = 12;
            return;
        }
        h hVar = kVar.f15589k;
        hVar.f15541b = null;
        hVar.f15542c = null;
        h hVar2 = kVar.f15590l;
        hVar2.f15541b = null;
        hVar2.f15542c = null;
        h hVar3 = kVar.f15591m;
        hVar3.f15541b = null;
        hVar3.f15542c = null;
        a.j(aVar);
        g(aVar, kVar);
        if (kVar.f15585g != 0 || kVar.f15588j) {
            if (kVar.f15587i || kVar.f15588j) {
                a.g(aVar);
                kVar.f15579a = kVar.f15588j ? 4 : 5;
            } else {
                kVar.f15579a = 2;
            }
            if (kVar.f15588j) {
                return;
            }
            kVar.f15570R += (long) kVar.f15585g;
            if (kVar.f15569Q < kVar.f15568P) {
                k(kVar);
            }
        }
    }

    private static int r(int[] iArr, int i10, a aVar) {
        long j10 = aVar.f15523f;
        int i11 = aVar.f15524g;
        int i12 = (int) (j10 >>> i11);
        int i13 = i10 + (i12 & 255);
        int i14 = iArr[i13];
        int i15 = i14 >> 16;
        int i16 = i14 & 65535;
        if (i15 <= 8) {
            aVar.f15524g = i11 + i15;
            return i16;
        }
        int i17 = iArr[i13 + i16 + ((i12 & ((1 << i15) - 1)) >>> 8)];
        aVar.f15524g = i11 + (i17 >> 16) + 8;
        return i17 & 65535;
    }

    static void s(k kVar, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        kVar.f15571S = bArr;
    }

    private static int t(int i10, int[] iArr, int i11) {
        return i10 < 16 ? iArr[(i11 + f15534b[i10]) & 3] + f15535c[i10] : i10 - 15;
    }

    private static boolean u(k kVar) {
        int i10 = kVar.f15572T;
        if (i10 != 0) {
            kVar.f15576X += i10;
            kVar.f15572T = 0;
        }
        int iMin = Math.min(kVar.f15574V - kVar.f15575W, kVar.f15577Y - kVar.f15576X);
        if (iMin != 0) {
            System.arraycopy(kVar.f15582d, kVar.f15576X, kVar.f15578Z, kVar.f15573U + kVar.f15575W, iMin);
            kVar.f15575W += iMin;
            kVar.f15576X += iMin;
        }
        return kVar.f15575W < kVar.f15574V;
    }
}
