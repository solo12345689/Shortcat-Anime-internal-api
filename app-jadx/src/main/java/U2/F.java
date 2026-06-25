package U2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f18903a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f18904b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f18905c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f18906d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f18907e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f18908f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f18909g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18916g;

        public a() {
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!F.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f18910a = i11;
            this.f18911b = F.f18903a[3 - i12];
            int i15 = F.f18904b[i14];
            this.f18913d = i15;
            if (i11 == 2) {
                this.f18913d = i15 / 2;
            } else if (i11 == 0) {
                this.f18913d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f18916g = F.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? F.f18905c[i13 - 1] : F.f18906d[i13 - 1];
                this.f18915f = i17;
                this.f18912c = (((i17 * 12) / this.f18913d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? F.f18907e[i13 - 1] : F.f18908f[i13 - 1];
                    this.f18915f = i18;
                    this.f18912c = ((i18 * 144) / this.f18913d) + i16;
                } else {
                    int i19 = F.f18909g[i13 - 1];
                    this.f18915f = i19;
                    this.f18912c = (((i12 == 1 ? 72 : 144) * i19) / this.f18913d) + i16;
                }
            }
            this.f18914e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f18910a = aVar.f18910a;
            this.f18911b = aVar.f18911b;
            this.f18912c = aVar.f18912c;
            this.f18913d = aVar.f18913d;
            this.f18914e = aVar.f18914e;
            this.f18915f = aVar.f18915f;
            this.f18916g = aVar.f18916g;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f18904b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f18905c[i13 - 1] : f18906d[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f18907e[i13 - 1] : f18908f[i13 - 1] : f18909g[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
