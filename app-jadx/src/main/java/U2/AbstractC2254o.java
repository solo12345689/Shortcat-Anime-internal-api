package U2;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C6080L;
import q2.C6102q;
import q2.C6109x;
import t2.C6608H;
import t2.a0;

/* JADX INFO: renamed from: U2.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2254o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f19077a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f19078b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f19079c = {64, 112, 128, JfifUtil.MARKER_SOFn, 224, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 384, 448, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 640, 768, 896, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f19080d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f19081e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f19082f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f19083g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f19084h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f19085i = {5, 8, 10, 12};

    /* JADX INFO: renamed from: U2.o$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f19090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19091f;

        private b(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f19086a = str;
            this.f19088c = i10;
            this.f19087b = i11;
            this.f19089d = i12;
            this.f19090e = j10;
            this.f19091f = i13;
        }
    }

    private static void a(byte[] bArr, int i10) throws C6080L {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & 255) | ((bArr[i11] << 8) & 65535)) != a0.x(bArr, 0, i11, 65535)) {
            throw C6080L.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.AbstractC2254o.b(byte[]):int");
    }

    public static int c(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    private static C6608H d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new C6608H(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        C6608H c6608h = new C6608H(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            C6608H c6608h2 = new C6608H(bArrCopyOf);
            while (c6608h2.b() >= 16) {
                c6608h2.r(2);
                c6608h.f(c6608h2.h(14), 14);
            }
        }
        c6608h.n(bArrCopyOf);
        return c6608h;
    }

    private static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static C6109x h(byte[] bArr, String str, String str2, int i10, String str3, C6102q c6102q) {
        C6608H c6608hD = d(bArr);
        c6608hD.r(60);
        int i11 = f19077a[c6608hD.h(6)];
        int i12 = f19078b[c6608hD.h(4)];
        int iH = c6608hD.h(5);
        int[] iArr = f19079c;
        int i13 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        c6608hD.r(10);
        return new C6109x.b().j0(str).W(str3).y0("audio/vnd.dts").S(i13).T(i11 + (c6608hD.h(2) > 0 ? 1 : 0)).z0(i12).c0(c6102q).n0(str2).w0(i10).P();
    }

    public static b i(byte[] bArr) throws C6080L {
        int i10;
        int i11;
        int iH;
        int i12;
        long jM1;
        int i13;
        C6608H c6608hD = d(bArr);
        c6608hD.r(40);
        int iH2 = c6608hD.h(2);
        if (c6608hD.g()) {
            i10 = 20;
            i11 = 12;
        } else {
            i10 = 16;
            i11 = 8;
        }
        c6608hD.r(i11);
        int iH3 = c6608hD.h(i10) + 1;
        boolean zG = c6608hD.g();
        int iH4 = -1;
        int i14 = 0;
        if (zG) {
            iH = c6608hD.h(2);
            int iH5 = (c6608hD.h(3) + 1) * IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            if (c6608hD.g()) {
                c6608hD.r(36);
            }
            int iH6 = c6608hD.h(3) + 1;
            int iH7 = c6608hD.h(3) + 1;
            if (iH6 != 1 || iH7 != 1) {
                throw C6080L.d("Multiple audio presentations or assets not supported");
            }
            int i15 = iH2 + 1;
            int iH8 = c6608hD.h(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                if (((iH8 >> i16) & 1) == 1) {
                    c6608hD.r(8);
                }
            }
            if (c6608hD.g()) {
                c6608hD.r(2);
                int iH9 = (c6608hD.h(2) + 1) << 2;
                int iH10 = c6608hD.h(2) + 1;
                while (i14 < iH10) {
                    c6608hD.r(iH9);
                    i14++;
                }
            }
            i14 = iH5;
        } else {
            iH = -1;
        }
        c6608hD.r(i10);
        c6608hD.r(12);
        if (zG) {
            if (c6608hD.g()) {
                c6608hD.r(4);
            }
            if (c6608hD.g()) {
                c6608hD.r(24);
            }
            if (c6608hD.g()) {
                c6608hD.s(c6608hD.h(10) + 1);
            }
            c6608hD.r(5);
            i12 = f19080d[c6608hD.h(4)];
            iH4 = c6608hD.h(8) + 1;
        } else {
            i12 = -2147483647;
        }
        int i17 = i12;
        if (zG) {
            if (iH == 0) {
                i13 = 32000;
            } else if (iH == 1) {
                i13 = 44100;
            } else {
                if (iH != 2) {
                    throw C6080L.a("Unsupported reference clock code in DTS HD header: " + iH, null);
                }
                i13 = 48000;
            }
            jM1 = a0.m1(i14, 1000000L, i13);
        } else {
            jM1 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", iH4, i17, iH3, jM1, 0);
    }

    public static int j(byte[] bArr) {
        C6608H c6608hD = d(bArr);
        c6608hD.r(42);
        return c6608hD.h(c6608hD.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) throws C6080L {
        int iH;
        long jM1;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        C6608H c6608hD = d(bArr);
        int i12 = c6608hD.h(32) == 1078008818 ? 1 : 0;
        int iM = m(c6608hD, f19081e, true) + 1;
        if (i12 == 0) {
            iH = -2147483647;
            jM1 = -9223372036854775807L;
        } else {
            if (!c6608hD.g()) {
                throw C6080L.d("Only supports full channel mask-based audio presentation");
            }
            a(bArr, iM);
            int iH2 = c6608hD.h(2);
            if (iH2 == 0) {
                i10 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            } else if (iH2 == 1) {
                i10 = 480;
            } else {
                if (iH2 != 2) {
                    throw C6080L.a("Unsupported base duration index in DTS UHD header: " + iH2, null);
                }
                i10 = 384;
            }
            int iH3 = i10 * (c6608hD.h(3) + 1);
            int iH4 = c6608hD.h(2);
            if (iH4 == 0) {
                i11 = 32000;
            } else if (iH4 == 1) {
                i11 = 44100;
            } else {
                if (iH4 != 2) {
                    throw C6080L.a("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                }
                i11 = 48000;
            }
            if (c6608hD.g()) {
                c6608hD.r(36);
            }
            iH = (1 << c6608hD.h(2)) * i11;
            jM1 = a0.m1(iH3, 1000000L, i11);
        }
        int i13 = iH;
        long j10 = jM1;
        int iM2 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iM2 += m(c6608hD, f19082f, true);
        }
        if (i12 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(c6608hD, f19083g, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i13, iM + iM2 + (atomicInteger2.get() != 0 ? m(c6608hD, f19084h, true) : 0), j10, 0);
    }

    public static int l(byte[] bArr) {
        C6608H c6608hD = d(bArr);
        c6608hD.r(32);
        return m(c6608hD, f19085i, true) + 1;
    }

    private static int m(C6608H c6608h, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && c6608h.g(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + c6608h.h(iArr[i11]);
    }
}
