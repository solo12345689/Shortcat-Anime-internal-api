package U2;

import q2.C6080L;
import t2.AbstractC6635w;
import t2.C6608H;

/* JADX INFO: renamed from: U2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2240a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f18966a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f18967b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: U2.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f18970c;

        private b(int i10, int i11, String str) {
            this.f18968a = i10;
            this.f18969b = i11;
            this.f18970c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int b(C6608H c6608h) {
        int iH = c6608h.h(5);
        return iH == 31 ? c6608h.h(6) + 32 : iH;
    }

    private static int c(C6608H c6608h) throws C6080L {
        int iH = c6608h.h(4);
        if (iH == 15) {
            if (c6608h.b() >= 24) {
                return c6608h.h(24);
            }
            throw C6080L.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f18966a[iH];
        }
        throw C6080L.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(C6608H c6608h, boolean z10) throws C6080L {
        int iB = b(c6608h);
        int iC = c(c6608h);
        int iH = c6608h.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(c6608h);
            iB = b(c6608h);
            if (iB == 22) {
                iH = c6608h.h(4);
            }
        }
        if (z10) {
            if (iB != 1 && iB != 2 && iB != 3 && iB != 4 && iB != 6 && iB != 7 && iB != 17) {
                switch (iB) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C6080L.d("Unsupported audio object type: " + iB);
                }
            }
            f(c6608h, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = c6608h.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw C6080L.d("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f18967b[iH];
        if (i10 != -1) {
            return new b(iC, i10, str);
        }
        throw C6080L.a(null, null);
    }

    public static b e(byte[] bArr) {
        return d(new C6608H(bArr), false);
    }

    private static void f(C6608H c6608h, int i10, int i11) {
        if (c6608h.g()) {
            AbstractC6635w.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c6608h.g()) {
            c6608h.r(14);
        }
        boolean zG = c6608h.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            c6608h.r(3);
        }
        if (zG) {
            if (i10 == 22) {
                c6608h.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                c6608h.r(3);
            }
            c6608h.r(1);
        }
    }
}
