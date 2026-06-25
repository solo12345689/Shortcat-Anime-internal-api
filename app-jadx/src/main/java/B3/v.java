package B3;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import q2.C6080L;
import t2.AbstractC6614a;
import t2.C6608H;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class v {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f1450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1451c;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f1455d;

        private c(int i10, int i11, int i12, byte[] bArr) {
            this.f1452a = i10;
            this.f1453b = i11;
            this.f1454c = i12;
            this.f1455d = bArr;
        }
    }

    private static int a(int i10) throws C6080L {
        if (i10 == 0) {
            return 768;
        }
        if (i10 == 1) {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (i10 == 2 || i10 == 3) {
            return 2048;
        }
        if (i10 == 4) {
            return 4096;
        }
        throw C6080L.d("Unsupported coreSbrFrameLengthIndex " + i10);
    }

    private static double b(int i10) throws C6080L {
        switch (i10) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw C6080L.d("Unsupported sampling rate " + i10);
        }
    }

    private static int c(int i10) throws C6080L {
        switch (i10) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return 7350;
            case 13:
            case 14:
            default:
                throw C6080L.d("Unsupported sampling rate index " + i10);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int d(int i10) throws C6080L {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 1;
                }
                throw C6080L.d("Unsupported coreSbrFrameLengthIndex " + i10);
            }
        }
        return i11;
    }

    public static boolean e(int i10) {
        return (i10 & 16777215) == 12583333;
    }

    public static int f(C6608H c6608h) {
        if (!c6608h.g()) {
            return 0;
        }
        c6608h.r(2);
        return c6608h.h(13);
    }

    public static boolean g(C6608H c6608h, b bVar) throws C6080L {
        c6608h.d();
        int iK = k(c6608h, 3, 8, 8);
        bVar.f1449a = iK;
        if (iK == -1) {
            return false;
        }
        long jL = l(c6608h, 2, 8, 32);
        bVar.f1450b = jL;
        if (jL == -1) {
            return false;
        }
        if (jL > 16) {
            throw C6080L.d("Contains sub-stream with an invalid packet label " + bVar.f1450b);
        }
        if (jL == 0) {
            int i10 = bVar.f1449a;
            if (i10 == 1) {
                throw C6080L.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i10 == 2) {
                throw C6080L.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i10 == 17) {
                throw C6080L.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iK2 = k(c6608h, 11, 24, 24);
        bVar.f1451c = iK2;
        return iK2 != -1;
    }

    public static c h(C6608H c6608h) throws C6080L {
        int iH = c6608h.h(8);
        int iH2 = c6608h.h(5);
        int iH3 = iH2 == 31 ? c6608h.h(24) : c(iH2);
        int iH4 = c6608h.h(3);
        int iA = a(iH4);
        int iD = d(iH4);
        c6608h.r(2);
        p(c6608h);
        m(c6608h, j(c6608h), iD);
        byte[] bArr = null;
        if (c6608h.g()) {
            int iK = k(c6608h, 2, 4, 8) + 1;
            for (int i10 = 0; i10 < iK; i10++) {
                int iK2 = k(c6608h, 4, 8, 16);
                int iK3 = k(c6608h, 4, 8, 16);
                if (iK2 == 7) {
                    int iH5 = c6608h.h(4) + 1;
                    c6608h.r(4);
                    byte[] bArr2 = new byte[iH5];
                    for (int i11 = 0; i11 < iH5; i11++) {
                        bArr2[i11] = (byte) c6608h.h(8);
                    }
                    bArr = bArr2;
                } else {
                    c6608h.r(iK3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dB = b(iH3);
        return new c(iH, (int) (((double) iH3) * dB), (int) (((double) iA) * dB), bArr3);
    }

    private static boolean i(C6608H c6608h) {
        c6608h.r(3);
        boolean zG = c6608h.g();
        if (zG) {
            c6608h.r(13);
        }
        return zG;
    }

    private static int j(C6608H c6608h) {
        int iH = c6608h.h(5);
        int iK = 0;
        for (int i10 = 0; i10 < iH + 1; i10++) {
            int iH2 = c6608h.h(3);
            iK += k(c6608h, 5, 8, 16) + 1;
            if ((iH2 == 0 || iH2 == 2) && c6608h.g()) {
                p(c6608h);
            }
        }
        return iK;
    }

    private static int k(C6608H c6608h, int i10, int i11, int i12) {
        AbstractC6614a.a(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        R9.d.a(R9.d.a(i13, i14), 1 << i12);
        if (c6608h.b() < i10) {
            return -1;
        }
        int iH = c6608h.h(i10);
        if (iH != i13) {
            return iH;
        }
        if (c6608h.b() < i11) {
            return -1;
        }
        int iH2 = c6608h.h(i11);
        int i15 = iH + iH2;
        if (iH2 != i14) {
            return i15;
        }
        if (c6608h.b() < i12) {
            return -1;
        }
        return i15 + c6608h.h(i12);
    }

    private static long l(C6608H c6608h, int i10, int i11, int i12) {
        AbstractC6614a.a(Math.max(Math.max(i10, i11), i12) <= 63);
        long j10 = (1 << i10) - 1;
        long j11 = (1 << i11) - 1;
        R9.e.a(R9.e.a(j10, j11), 1 << i12);
        if (c6608h.b() < i10) {
            return -1L;
        }
        long j12 = c6608h.j(i10);
        if (j12 != j10) {
            return j12;
        }
        if (c6608h.b() < i11) {
            return -1L;
        }
        long j13 = c6608h.j(i11);
        long j14 = j12 + j13;
        if (j13 != j11) {
            return j14;
        }
        if (c6608h.b() < i12) {
            return -1L;
        }
        return j14 + c6608h.j(i12);
    }

    private static void m(C6608H c6608h, int i10, int i11) {
        int iH;
        int iK = k(c6608h, 4, 8, 16) + 1;
        c6608h.q();
        for (int i12 = 0; i12 < iK; i12++) {
            int iH2 = c6608h.h(2);
            if (iH2 == 0) {
                i(c6608h);
                if (i11 > 0) {
                    o(c6608h);
                }
            } else if (iH2 == 1) {
                if (i(c6608h)) {
                    c6608h.q();
                }
                if (i11 > 0) {
                    o(c6608h);
                    iH = c6608h.h(2);
                } else {
                    iH = 0;
                }
                if (iH > 0) {
                    c6608h.r(6);
                    int iH3 = c6608h.h(2);
                    c6608h.r(4);
                    if (c6608h.g()) {
                        c6608h.r(5);
                    }
                    if (iH == 2 || iH == 3) {
                        c6608h.r(6);
                    }
                    if (iH3 == 2) {
                        c6608h.q();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i10 - 1) / Math.log(2.0d))) + 1;
                int iH4 = c6608h.h(2);
                if (iH4 > 0 && c6608h.g()) {
                    c6608h.r(iFloor);
                }
                if (c6608h.g()) {
                    c6608h.r(iFloor);
                }
                if (i11 == 0 && iH4 == 0) {
                    c6608h.q();
                }
            } else if (iH2 == 3) {
                k(c6608h, 4, 8, 16);
                int iK2 = k(c6608h, 4, 8, 16);
                if (c6608h.g()) {
                    k(c6608h, 8, 16, 0);
                }
                c6608h.q();
                if (iK2 > 0) {
                    c6608h.r(iK2 * 8);
                }
            }
        }
    }

    private static void n(C6608H c6608h, int i10) {
        int iH;
        boolean zG = c6608h.g();
        int i11 = zG ? 1 : 5;
        int i12 = zG ? 7 : 5;
        int i13 = zG ? 8 : 6;
        int i14 = 0;
        while (i14 < i10) {
            if (c6608h.g()) {
                c6608h.r(7);
                iH = 0;
            } else {
                if (c6608h.h(2) == 3 && c6608h.h(i12) * i11 != 0) {
                    c6608h.q();
                }
                iH = c6608h.h(i13) * i11;
                if (iH != 0 && iH != 180) {
                    c6608h.q();
                }
                c6608h.q();
            }
            if (iH != 0 && iH != 180 && c6608h.g()) {
                i14++;
            }
            i14++;
        }
    }

    private static void o(C6608H c6608h) {
        c6608h.r(3);
        c6608h.r(8);
        boolean zG = c6608h.g();
        boolean zG2 = c6608h.g();
        if (zG) {
            c6608h.r(5);
        }
        if (zG2) {
            c6608h.r(6);
        }
    }

    private static void p(C6608H c6608h) {
        int iH = c6608h.h(2);
        if (iH == 0) {
            c6608h.r(6);
            return;
        }
        int iK = k(c6608h, 5, 8, 16) + 1;
        if (iH == 1) {
            c6608h.r(iK * 7);
        } else if (iH == 2) {
            n(c6608h, iK);
        }
    }
}
