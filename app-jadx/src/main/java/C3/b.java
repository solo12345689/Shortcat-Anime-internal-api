package C3;

import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.O;
import U2.T;
import U2.r;
import U2.u;
import android.util.Pair;
import q2.C6080L;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC2255p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f2813h = new u() { // from class: C3.a
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return b.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f2814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private O f2815b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0031b f2818e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2816c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f2817d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2819f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f2820g = -1;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements InterfaceC0031b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int[] f2821m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int[] f2822n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f2823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final O f2824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C3.c f2825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f2826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f2827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final C6609I f2828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f2829g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C6109x f2830h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f2831i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f2832j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f2833k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f2834l;

        public a(r rVar, O o10, C3.c cVar) throws C6080L {
            this.f2823a = rVar;
            this.f2824b = o10;
            this.f2825c = cVar;
            int iMax = Math.max(1, cVar.f2845c / 10);
            this.f2829g = iMax;
            C6609I c6609i = new C6609I(cVar.f2849g);
            c6609i.E();
            int iE = c6609i.E();
            this.f2826d = iE;
            int i10 = cVar.f2844b;
            int i11 = (((cVar.f2847e - (i10 * 4)) * 8) / (cVar.f2848f * i10)) + 1;
            if (iE == i11) {
                int iN = a0.n(iMax, iE);
                this.f2827e = new byte[cVar.f2847e * iN];
                this.f2828f = new C6609I(iN * h(iE, i10));
                int i12 = ((cVar.f2845c * cVar.f2847e) * 8) / iE;
                this.f2830h = new C6109x.b().y0("audio/raw").S(i12).t0(i12).o0(h(iMax, i10)).T(cVar.f2844b).z0(cVar.f2845c).s0(2).P();
                return;
            }
            throw C6080L.a("Expected frames per block: " + i11 + "; got: " + iE, null);
        }

        private void d(byte[] bArr, int i10, C6609I c6609i) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f2825c.f2844b; i12++) {
                    e(bArr, i11, i12, c6609i.f());
                }
            }
            int iG = g(this.f2826d * i10);
            c6609i.b0(0);
            c6609i.a0(iG);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            C3.c cVar = this.f2825c;
            int i12 = cVar.f2847e;
            int i13 = cVar.f2844b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iR = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f2822n[iMin];
            int i18 = ((i10 * this.f2826d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iR & 255);
            bArr2[i18 + 1] = (byte) (iR >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & 15 : (b10 & 255) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                iR = a0.r(iR + i21, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iR & 255);
                bArr2[i18 + 1] = (byte) (iR >> 8);
                int i22 = iMin + f2821m[i20];
                int[] iArr = f2822n;
                iMin = a0.r(i22, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int f(int i10) {
            return i10 / (this.f2825c.f2844b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f2825c.f2844b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long jM1 = this.f2832j + a0.m1(this.f2834l, 1000000L, this.f2825c.f2845c);
            int iG = g(i10);
            this.f2824b.a(jM1, 1, iG, this.f2833k - iG, null);
            this.f2834l += (long) i10;
            this.f2833k -= iG;
        }

        @Override // C3.b.InterfaceC0031b
        public void a(int i10, long j10) {
            e eVar = new e(this.f2825c, this.f2826d, i10, j10);
            this.f2823a.t(eVar);
            this.f2824b.c(this.f2830h);
            this.f2824b.d(eVar.n());
        }

        @Override // C3.b.InterfaceC0031b
        public void b(long j10) {
            this.f2831i = 0;
            this.f2832j = j10;
            this.f2833k = 0;
            this.f2834l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // C3.b.InterfaceC0031b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(U2.InterfaceC2256q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f2829g
                int r1 = r6.f2833k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f2826d
                int r0 = t2.a0.n(r0, r1)
                C3.c r1 = r6.f2825c
                int r1 = r1.f2847e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f2831i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f2827e
                int r5 = r6.f2831i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f2831i
                int r4 = r4 + r3
                r6.f2831i = r4
                goto L1e
            L3e:
                int r7 = r6.f2831i
                C3.c r8 = r6.f2825c
                int r8 = r8.f2847e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f2827e
                t2.I r9 = r6.f2828f
                r6.d(r8, r7, r9)
                int r8 = r6.f2831i
                C3.c r9 = r6.f2825c
                int r9 = r9.f2847e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f2831i = r8
                t2.I r7 = r6.f2828f
                int r7 = r7.j()
                U2.O r8 = r6.f2824b
                t2.I r9 = r6.f2828f
                r8.f(r9, r7)
                int r8 = r6.f2833k
                int r8 = r8 + r7
                r6.f2833k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f2829g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f2833k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: C3.b.a.c(U2.q, long):boolean");
        }
    }

    /* JADX INFO: renamed from: C3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface InterfaceC0031b {
        void a(int i10, long j10);

        void b(long j10);

        boolean c(InterfaceC2256q interfaceC2256q, long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements InterfaceC0031b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f2835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final O f2836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C3.c f2837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final C6109x f2838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f2839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f2840f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f2841g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f2842h;

        public c(r rVar, O o10, C3.c cVar, String str, int i10) throws C6080L {
            this.f2835a = rVar;
            this.f2836b = o10;
            this.f2837c = cVar;
            int i11 = (cVar.f2844b * cVar.f2848f) / 8;
            if (cVar.f2847e == i11) {
                int i12 = cVar.f2845c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f2839e = iMax;
                this.f2838d = new C6109x.b().W("audio/wav").y0(str).S(i13).t0(i13).o0(iMax).T(cVar.f2844b).z0(cVar.f2845c).s0(i10).P();
                return;
            }
            throw C6080L.a("Expected block size: " + i11 + "; got: " + cVar.f2847e, null);
        }

        @Override // C3.b.InterfaceC0031b
        public void a(int i10, long j10) {
            e eVar = new e(this.f2837c, 1, i10, j10);
            this.f2835a.t(eVar);
            this.f2836b.c(this.f2838d);
            this.f2836b.d(eVar.n());
        }

        @Override // C3.b.InterfaceC0031b
        public void b(long j10) {
            this.f2840f = j10;
            this.f2841g = 0;
            this.f2842h = 0L;
        }

        @Override // C3.b.InterfaceC0031b
        public boolean c(InterfaceC2256q interfaceC2256q, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f2841g) < (i11 = this.f2839e)) {
                int iE = this.f2836b.e(interfaceC2256q, (int) Math.min(i11 - i10, j11), true);
                if (iE == -1) {
                    j11 = 0;
                } else {
                    this.f2841g += iE;
                    j11 -= (long) iE;
                }
            }
            int i12 = this.f2837c.f2847e;
            int i13 = this.f2841g / i12;
            if (i13 > 0) {
                long jM1 = this.f2840f + a0.m1(this.f2842h, 1000000L, r1.f2845c);
                int i14 = i13 * i12;
                int i15 = this.f2841g - i14;
                this.f2836b.a(jM1, 1, i14, i15, null);
                this.f2842h += (long) i13;
                this.f2841g = i15;
            }
            return j11 <= 0;
        }
    }

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new b()};
    }

    private void e() {
        AbstractC6614a.i(this.f2815b);
        a0.l(this.f2814a);
    }

    private void g(InterfaceC2256q interfaceC2256q) throws C6080L {
        AbstractC6614a.g(interfaceC2256q.getPosition() == 0);
        int i10 = this.f2819f;
        if (i10 != -1) {
            interfaceC2256q.m(i10);
            this.f2816c = 4;
        } else {
            if (!d.a(interfaceC2256q)) {
                throw C6080L.a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC2256q.m((int) (interfaceC2256q.j() - interfaceC2256q.getPosition()));
            this.f2816c = 1;
        }
    }

    private void j(InterfaceC2256q interfaceC2256q) throws C6080L {
        C3.c cVarB = d.b(interfaceC2256q);
        int i10 = cVarB.f2843a;
        if (i10 == 17) {
            this.f2818e = new a(this.f2814a, this.f2815b, cVarB);
        } else if (i10 == 6) {
            this.f2818e = new c(this.f2814a, this.f2815b, cVarB, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f2818e = new c(this.f2814a, this.f2815b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = T.a(i10, cVarB.f2848f);
            if (iA == 0) {
                throw C6080L.d("Unsupported WAV format type: " + cVarB.f2843a);
            }
            this.f2818e = new c(this.f2814a, this.f2815b, cVarB, "audio/raw", iA);
        }
        this.f2816c = 3;
    }

    private void k(InterfaceC2256q interfaceC2256q) {
        this.f2817d = d.c(interfaceC2256q);
        this.f2816c = 2;
    }

    private int m(InterfaceC2256q interfaceC2256q) {
        AbstractC6614a.g(this.f2820g != -1);
        return ((InterfaceC0031b) AbstractC6614a.e(this.f2818e)).c(interfaceC2256q, this.f2820g - interfaceC2256q.getPosition()) ? -1 : 0;
    }

    private void n(InterfaceC2256q interfaceC2256q) throws C6080L {
        Pair pairE = d.e(interfaceC2256q);
        this.f2819f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f2817d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f2820g = ((long) this.f2819f) + jLongValue;
        long length = interfaceC2256q.getLength();
        if (length != -1 && this.f2820g > length) {
            AbstractC6635w.i("WavExtractor", "Data exceeds input length: " + this.f2820g + ", " + length);
            this.f2820g = length;
        }
        ((InterfaceC0031b) AbstractC6614a.e(this.f2818e)).a(this.f2819f, this.f2820g);
        this.f2816c = 4;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        this.f2816c = j10 == 0 ? 0 : 4;
        InterfaceC0031b interfaceC0031b = this.f2818e;
        if (interfaceC0031b != null) {
            interfaceC0031b.b(j11);
        }
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f2814a = rVar;
        this.f2815b = rVar.e(0, 1);
        rVar.p();
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        return d.a(interfaceC2256q);
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) throws C6080L {
        e();
        int i11 = this.f2816c;
        if (i11 == 0) {
            g(interfaceC2256q);
            return 0;
        }
        if (i11 == 1) {
            k(interfaceC2256q);
            return 0;
        }
        if (i11 == 2) {
            j(interfaceC2256q);
            return 0;
        }
        if (i11 == 3) {
            n(interfaceC2256q);
            return 0;
        }
        if (i11 == 4) {
            return m(interfaceC2256q);
        }
        throw new IllegalStateException();
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
