package w;

import Ud.AbstractC2273n;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: w.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6916u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f62674c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f62675d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[][] f62676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f62677b = true;

    /* JADX INFO: renamed from: w.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final C0941a f62678s = new C0941a(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f62679t = 8;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static float[] f62680u;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f62681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f62682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f62683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f62684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f62685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f62686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f62687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f62688h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f62689i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f62690j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final float f62691k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final float f62692l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final float f62693m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final float f62694n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final float f62695o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final float f62696p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f62697q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f62698r;

        /* JADX INFO: renamed from: w.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0941a {
            public /* synthetic */ C0941a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final float[] b() {
                if (a.f62680u != null) {
                    float[] fArr = a.f62680u;
                    AbstractC5504s.e(fArr);
                    return fArr;
                }
                a.f62680u = new float[91];
                float[] fArr2 = a.f62680u;
                AbstractC5504s.e(fArr2);
                return fArr2;
            }

            private C0941a() {
            }
        }

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f62681a = f10;
            this.f62682b = f11;
            this.f62683c = f12;
            this.f62684d = f13;
            this.f62685e = f14;
            this.f62686f = f15;
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            boolean z10 = true;
            boolean z11 = i10 == 1 || (i10 == 4 ? f17 > 0.0f : !(i10 != 5 || f17 >= 0.0f));
            this.f62697q = z11;
            float f18 = 1 / (f11 - f10);
            this.f62691k = f18;
            boolean z12 = 3 == i10;
            if (z12 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
                float fHypot = (float) Math.hypot(f17, f16);
                this.f62687g = fHypot;
                this.f62696p = fHypot * f18;
                this.f62694n = f16 / (f11 - f10);
                this.f62695o = f17 / (f11 - f10);
                this.f62690j = new float[101];
                this.f62692l = Float.NaN;
                this.f62693m = Float.NaN;
            } else {
                this.f62690j = new float[101];
                this.f62692l = f16 * (z11 ? -1 : 1);
                this.f62693m = f17 * (z11 ? 1 : -1);
                this.f62694n = z11 ? f14 : f12;
                this.f62695o = z11 ? f13 : f15;
                c(f12, f13, f14, f15);
                this.f62696p = this.f62687g * f18;
                z10 = z12;
            }
            this.f62698r = z10;
        }

        private final void c(float f10, float f11, float f12, float f13) {
            float f14 = f12 - f10;
            float f15 = f11 - f13;
            int length = f62678s.b().length;
            float fHypot = 0.0f;
            float f16 = 0.0f;
            float f17 = 0.0f;
            int i10 = 0;
            while (i10 < length) {
                C0941a c0941a = f62678s;
                double radians = (float) Math.toRadians((((double) i10) * 90.0d) / ((double) (c0941a.b().length - 1)));
                float fSin = ((float) Math.sin(radians)) * f14;
                float fCos = ((float) Math.cos(radians)) * f15;
                if (i10 > 0) {
                    fHypot += (float) Math.hypot(fSin - f16, fCos - f17);
                    c0941a.b()[i10] = fHypot;
                }
                i10++;
                f17 = fCos;
                f16 = fSin;
            }
            this.f62687g = fHypot;
            int length2 = f62678s.b().length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArrB = f62678s.b();
                fArrB[i11] = fArrB[i11] / fHypot;
            }
            int length3 = this.f62690j.length;
            for (int i12 = 0; i12 < length3; i12++) {
                float length4 = i12 / (this.f62690j.length - 1);
                C0941a c0941a2 = f62678s;
                int iG = AbstractC2273n.g(c0941a2.b(), length4, 0, 0, 6, null);
                if (iG >= 0) {
                    this.f62690j[i12] = iG / (c0941a2.b().length - 1);
                } else if (iG == -1) {
                    this.f62690j[i12] = 0.0f;
                } else {
                    int i13 = -iG;
                    int i14 = i13 - 2;
                    this.f62690j[i12] = (i14 + ((length4 - c0941a2.b()[i14]) / (c0941a2.b()[i13 - 1] - c0941a2.b()[i14]))) / (c0941a2.b().length - 1);
                }
            }
        }

        private final float o(float f10) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.f62690j;
            float length = f10 * (fArr.length - 1);
            int i10 = (int) length;
            float f11 = length - i10;
            float f12 = fArr[i10];
            return f12 + (f11 * (fArr[i10 + 1] - f12));
        }

        public final float d() {
            float f10 = this.f62692l * this.f62689i;
            float fHypot = this.f62696p / ((float) Math.hypot(f10, (-this.f62693m) * this.f62688h));
            return this.f62697q ? (-f10) * fHypot : f10 * fHypot;
        }

        public final float e() {
            float f10 = this.f62692l * this.f62689i;
            float f11 = (-this.f62693m) * this.f62688h;
            float fHypot = this.f62696p / ((float) Math.hypot(f10, f11));
            return this.f62697q ? (-f11) * fHypot : f11 * fHypot;
        }

        public final float f() {
            return this.f62694n + (this.f62692l * this.f62688h);
        }

        public final float g() {
            return this.f62695o + (this.f62693m * this.f62689i);
        }

        public final float h() {
            return this.f62694n;
        }

        public final float i() {
            return this.f62695o;
        }

        public final float j(float f10) {
            float f11 = (f10 - this.f62681a) * this.f62691k;
            float f12 = this.f62683c;
            return f12 + (f11 * (this.f62685e - f12));
        }

        public final float k(float f10) {
            float f11 = (f10 - this.f62681a) * this.f62691k;
            float f12 = this.f62684d;
            return f12 + (f11 * (this.f62686f - f12));
        }

        public final float l() {
            return this.f62681a;
        }

        public final float m() {
            return this.f62682b;
        }

        public final boolean n() {
            return this.f62698r;
        }

        public final void p(float f10) {
            double dO = o((this.f62697q ? this.f62682b - f10 : f10 - this.f62681a) * this.f62691k) * 1.5707964f;
            this.f62688h = (float) Math.sin(dO);
            this.f62689i = (float) Math.cos(dO);
        }
    }

    /* JADX INFO: renamed from: w.u$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r10
  0x0028: PHI (r10v1 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6916u(int[] r21, float[] r22, float[][] r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r0.<init>()
            r2 = 1
            r0.f62677b = r2
            int r3 = r1.length
            int r3 = r3 - r2
            w.u$a[][] r4 = new w.C6916u.a[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L6b
            r9 = r21[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L28
            if (r9 == r2) goto L31
            if (r9 == r11) goto L2f
            if (r9 == r10) goto L2a
            r10 = 4
            if (r9 == r10) goto L28
            r10 = 5
            if (r9 == r10) goto L28
            r13 = r8
            goto L33
        L28:
            r13 = r10
            goto L33
        L2a:
            if (r7 != r2) goto L31
            goto L2f
        L2d:
            r13 = r7
            goto L33
        L2f:
            r7 = r11
            goto L2d
        L31:
            r7 = r2
            goto L2d
        L33:
            r8 = r23[r6]
            int r9 = r8.length
            int r9 = r9 / r11
            int r8 = r8.length
            int r8 = r8 % r11
            int r9 = r9 + r8
            w.u$a[] r8 = new w.C6916u.a[r9]
            r10 = r5
        L3d:
            if (r10 >= r9) goto L65
            int r11 = r10 * 2
            w.u$a r12 = new w.u$a
            r14 = r1[r6]
            int r15 = r6 + 1
            r16 = r15
            r15 = r1[r16]
            r17 = r23[r6]
            r18 = r16
            r16 = r17[r11]
            int r19 = r11 + 1
            r17 = r17[r19]
            r18 = r23[r18]
            r11 = r18[r11]
            r19 = r18[r19]
            r18 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r8[r10] = r12
            int r10 = r10 + 1
            goto L3d
        L65:
            r4[r6] = r8
            int r6 = r6 + 1
            r8 = r13
            goto L12
        L6b:
            r0.f62676a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C6916u.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r9 > r0[r0.length - 1][0].m()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(float r9, float[] r10) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C6916u.a(float, float[]):void");
    }

    public final void b(float f10, float[] fArr) {
        if (f10 < this.f62676a[0][0].l()) {
            f10 = this.f62676a[0][0].l();
        } else {
            a[][] aVarArr = this.f62676a;
            if (f10 > aVarArr[aVarArr.length - 1][0].m()) {
                a[][] aVarArr2 = this.f62676a;
                f10 = aVarArr2[aVarArr2.length - 1][0].m();
            }
        }
        int length = this.f62676a.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < fArr.length) {
                if (f10 <= this.f62676a[i10][i12].m()) {
                    if (this.f62676a[i10][i12].n()) {
                        fArr[i11] = this.f62676a[i10][i12].h();
                        fArr[i11 + 1] = this.f62676a[i10][i12].i();
                    } else {
                        this.f62676a[i10][i12].p(f10);
                        fArr[i11] = this.f62676a[i10][i12].d();
                        fArr[i11 + 1] = this.f62676a[i10][i12].e();
                    }
                    z10 = true;
                }
                i11 += 2;
                i12++;
            }
            if (z10) {
                return;
            }
        }
    }
}
