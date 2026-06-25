package U2;

import com.adjust.sdk.network.ErrorCodes;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.nio.ByteBuffer;
import q2.C6080L;
import t2.C6608H;
import t2.C6609I;
import t2.a0;

/* JADX INFO: renamed from: U2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2242c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f18984a = {2002, 2000, 1920, 1601, 1600, ErrorCodes.SERVER_RETRY_IN, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: U2.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18990f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18991g;

        private b() {
            this.f18985a = true;
            this.f18986b = -1;
            this.f18987c = -1;
            this.f18988d = true;
            this.f18989e = 2;
            this.f18990f = 1;
            this.f18991g = 0;
        }
    }

    /* JADX INFO: renamed from: U2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0322c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18996e;

        private C0322c(int i10, int i11, int i12, int i13, int i14) {
            this.f18992a = i10;
            this.f18994c = i11;
            this.f18993b = i12;
            this.f18995d = i13;
            this.f18996e = i14;
        }
    }

    private static String a(int i10, int i11, int i12) {
        return a0.I("ac-4.%02d.%02d.%02d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static void b(int i10, C6609I c6609i) {
        c6609i.X(7);
        byte[] bArrF = c6609i.f();
        bArrF[0] = -84;
        bArrF[1] = 64;
        bArrF[2] = -1;
        bArrF[3] = -1;
        bArrF[4] = (byte) ((i10 >> 16) & 255);
        bArrF[5] = (byte) ((i10 >> 8) & 255);
        bArrF[6] = (byte) (i10 & 255);
    }

    private static int c(int i10, boolean z10, int i11) {
        int iD = d(i10);
        if (i10 != 11 && i10 != 12 && i10 != 13 && i10 != 14) {
            return iD;
        }
        if (!z10) {
            iD -= 2;
        }
        return i11 != 0 ? i11 != 1 ? iD : iD - 2 : iD - 4;
    }

    private static int d(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static q2.C6109x e(t2.C6609I r20, java.lang.String r21, java.lang.String r22, q2.C6102q r23) throws q2.C6080L {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.AbstractC2242c.e(t2.I, java.lang.String, java.lang.String, q2.q):q2.x");
    }

    public static int f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return g(new C6608H(bArr)).f18996e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r11 != 8) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static U2.AbstractC2242c.C0322c g(t2.C6608H r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = k(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L45
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L45
            r11.r(r0)
        L45:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r4 = r7
            goto L55
        L53:
            r4 = r7
            r7 = r6
        L55:
            int r11 = r11.h(r3)
            if (r7 != r6) goto L65
            r6 = 13
            if (r11 != r6) goto L65
            int[] r0 = U2.AbstractC2242c.f18984a
            r11 = r0[r11]
        L63:
            r9 = r11
            goto L95
        L65:
            if (r7 != r4) goto L93
            int[] r4 = U2.AbstractC2242c.f18984a
            int r6 = r4.length
            if (r11 >= r6) goto L93
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r9 = 1
            if (r1 == r9) goto L8c
            r9 = 11
            if (r1 == r0) goto L87
            if (r1 == r2) goto L8c
            if (r1 == r3) goto L7e
            goto L91
        L7e:
            if (r11 == r2) goto L84
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
        L84:
            int r11 = r4 + 1
            goto L63
        L87:
            if (r11 == r6) goto L84
            if (r11 != r9) goto L91
            goto L84
        L8c:
            if (r11 == r2) goto L84
            if (r11 != r6) goto L91
            goto L84
        L91:
            r9 = r4
            goto L95
        L93:
            r11 = 0
            goto L63
        L95:
            U2.c$c r4 = new U2.c$c
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.AbstractC2242c.g(t2.H):U2.c$c");
    }

    public static int h(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static void i(C6608H c6608h, b bVar) throws C6080L {
        int iH = c6608h.h(5);
        c6608h.r(2);
        if (c6608h.g()) {
            c6608h.r(5);
        }
        if (iH >= 7 && iH <= 10) {
            c6608h.q();
        }
        if (c6608h.g()) {
            int iH2 = c6608h.h(3);
            if (bVar.f18986b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                bVar.f18986b = iH;
            }
            if (c6608h.g()) {
                m(c6608h);
            }
        }
    }

    private static void j(C6608H c6608h, b bVar) throws C6080L {
        c6608h.r(2);
        boolean zG = c6608h.g();
        int iH = c6608h.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            c6608h.r(2);
            if (c6608h.g()) {
                c6608h.r(5);
            }
            if (zG) {
                c6608h.r(24);
            } else {
                if (c6608h.g()) {
                    if (!c6608h.g()) {
                        c6608h.r(4);
                    }
                    bVar.f18987c = c6608h.h(6) + 1;
                }
                c6608h.r(4);
            }
        }
        if (c6608h.g()) {
            c6608h.r(3);
            if (c6608h.g()) {
                m(c6608h);
            }
        }
    }

    private static int k(C6608H c6608h, int i10) {
        int i11 = 0;
        while (true) {
            int iH = i11 + c6608h.h(i10);
            if (!c6608h.g()) {
                return iH;
            }
            i11 = (iH + 1) << i10;
        }
    }

    private static boolean l(C6608H c6608h) {
        if (c6608h.b() < 66) {
            return false;
        }
        c6608h.r(66);
        return true;
    }

    private static void m(C6608H c6608h) throws C6080L {
        int iH = c6608h.h(6);
        if (iH < 2 || iH > 42) {
            throw C6080L.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        c6608h.r(iH * 8);
    }
}
