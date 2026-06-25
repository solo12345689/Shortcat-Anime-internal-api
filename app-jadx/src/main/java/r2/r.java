package r2;

import java.nio.ShortBuffer;
import java.util.Arrays;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f58457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f58458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f58459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f58460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f58461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f58462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f58463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f58464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f58465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f58466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f58467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f58468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f58469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f58470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f58471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f58472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f58473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f58474t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f58475u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f58476v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f58477w;

    public r(int i10, int i11, float f10, float f11, int i12) {
        this.f58455a = i10;
        this.f58456b = i11;
        this.f58457c = f10;
        this.f58458d = f11;
        this.f58459e = i10 / i12;
        this.f58460f = i10 / 400;
        int i13 = i10 / 65;
        this.f58461g = i13;
        int i14 = i13 * 2;
        this.f58462h = i14;
        this.f58463i = new short[i14];
        this.f58464j = new short[i14 * i11];
        this.f58466l = new short[i14 * i11];
        this.f58468n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f58467m == i10) {
            return;
        }
        int i13 = this.f58455a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        o(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f58469o;
            if (i14 >= i15 - 1) {
                u(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f58470p;
                long j12 = ((long) (i11 + 1)) * j10;
                i12 = this.f58471q;
                if (j12 <= ((long) i12) * j11) {
                    break;
                }
                this.f58466l = f(this.f58466l, this.f58467m, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f58456b;
                    if (i16 < i17) {
                        this.f58466l[(this.f58467m * i17) + i16] = n(this.f58468n, (i17 * i14) + i16, j11, j10);
                        i16++;
                    }
                }
                this.f58471q++;
                this.f58467m++;
            }
            int i18 = i11 + 1;
            this.f58470p = i18;
            if (i18 == j11) {
                this.f58470p = 0;
                AbstractC6614a.g(((long) i12) == j10);
                this.f58471q = 0;
            }
            i14++;
        }
    }

    private void b(double d10) {
        r rVar;
        double d11;
        int i10 = this.f58465k;
        if (i10 < this.f58462h) {
            return;
        }
        int iM = 0;
        while (true) {
            if (this.f58472r > 0) {
                iM += c(iM);
                rVar = this;
                d11 = d10;
            } else {
                int iG = g(this.f58464j, iM);
                if (d10 > 1.0d) {
                    rVar = this;
                    d11 = d10;
                    iM += iG + rVar.w(this.f58464j, iM, d11, iG);
                } else {
                    rVar = this;
                    d11 = d10;
                    iM += rVar.m(rVar.f58464j, iM, d11, iG);
                }
            }
            if (rVar.f58462h + iM > i10) {
                v(iM);
                return;
            }
            d10 = d11;
        }
    }

    private int c(int i10) {
        int iMin = Math.min(this.f58462h, this.f58472r);
        d(this.f58464j, i10, iMin);
        this.f58472r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f58466l, this.f58467m, i11);
        this.f58466l = sArrF;
        int i12 = this.f58456b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f58467m * i12, i12 * i11);
        this.f58467m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f58462h / i11;
        int i13 = this.f58456b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f58463i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f58456b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f58455a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f58456b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f58460f, this.f58461g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f58463i, 0, this.f58460f / i12, this.f58461g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f58460f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f58461g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f58456b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f58463i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f58475u, this.f58476v) ? this.f58473s : iH;
        this.f58474t = this.f58475u;
        this.f58473s = iH;
        return i19;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f58456b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f58475u = i15 / i16;
        this.f58476v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((((double) i11) * d10) / (1.0d - d10)) + this.f58477w;
            int iRound = (int) Math.round(d11);
            this.f58477w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f58477w;
            int iRound2 = (int) Math.round(d12);
            this.f58472r = iRound2;
            this.f58477w = d12 - ((double) iRound2);
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f58466l, this.f58467m, i13);
        this.f58466l = sArrF;
        int i14 = this.f58456b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f58467m * i14, i14 * i11);
        p(i12, this.f58456b, this.f58466l, this.f58467m + i11, sArr, i10 + i11, sArr, i10);
        this.f58467m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f58456b];
        long j12 = ((long) this.f58471q) * j10;
        int i11 = this.f58470p;
        long j13 = ((long) i11) * j11;
        long j14 = ((long) (i11 + 1)) * j11;
        long j15 = j14 - j12;
        long j16 = j14 - j13;
        return (short) (((((long) s10) * j15) + ((j16 - j15) * ((long) s11))) / j16);
    }

    private void o(int i10) {
        int i11 = this.f58467m - i10;
        short[] sArrF = f(this.f58468n, this.f58469o, i11);
        this.f58468n = sArrF;
        short[] sArr = this.f58466l;
        int i12 = this.f58456b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f58469o * i12, i12 * i11);
        this.f58467m = i10;
        this.f58469o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f58473s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f58474t * 3;
    }

    private void r() {
        int i10 = this.f58467m;
        float f10 = this.f58457c;
        float f11 = this.f58458d;
        double d10 = f10 / f11;
        float f12 = this.f58459e * f11;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            b(d10);
        } else {
            d(this.f58464j, 0, this.f58465k);
            this.f58465k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f58468n;
        int i11 = this.f58456b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f58469o - i10) * i11);
        this.f58469o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f58465k - i10;
        short[] sArr = this.f58464j;
        int i12 = this.f58456b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f58465k = i11;
    }

    private int w(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 >= 2.0d) {
            double d11 = (((double) i11) / (d10 - 1.0d)) + this.f58477w;
            int iRound = (int) Math.round(d11);
            this.f58477w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * (2.0d - d10)) / (d10 - 1.0d)) + this.f58477w;
            int iRound2 = (int) Math.round(d12);
            this.f58472r = iRound2;
            this.f58477w = d12 - ((double) iRound2);
            i12 = i11;
        }
        short[] sArrF = f(this.f58466l, this.f58467m, i12);
        this.f58466l = sArrF;
        p(i12, this.f58456b, sArrF, this.f58467m, sArr, i10, sArr, i10 + i11);
        this.f58467m += i12;
        return i12;
    }

    public void i() {
        this.f58465k = 0;
        this.f58467m = 0;
        this.f58469o = 0;
        this.f58470p = 0;
        this.f58471q = 0;
        this.f58472r = 0;
        this.f58473s = 0;
        this.f58474t = 0;
        this.f58475u = 0;
        this.f58476v = 0;
        this.f58477w = 0.0d;
    }

    public void j(ShortBuffer shortBuffer) {
        AbstractC6614a.g(this.f58467m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f58456b, this.f58467m);
        shortBuffer.put(this.f58466l, 0, this.f58456b * iMin);
        int i10 = this.f58467m - iMin;
        this.f58467m = i10;
        short[] sArr = this.f58466l;
        int i11 = this.f58456b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        AbstractC6614a.g(this.f58467m >= 0);
        return this.f58467m * this.f58456b * 2;
    }

    public int l() {
        return this.f58465k * this.f58456b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f58465k;
        float f10 = this.f58457c;
        float f11 = this.f58458d;
        double d10 = f10 / f11;
        double d11 = this.f58459e * f11;
        int i12 = this.f58472r;
        int i13 = this.f58467m + ((int) ((((((((double) (i11 - i12)) / d10) + ((double) i12)) + this.f58477w) + ((double) this.f58469o)) / d11) + 0.5d));
        this.f58477w = 0.0d;
        this.f58464j = f(this.f58464j, i11, (this.f58462h * 2) + i11);
        int i14 = 0;
        while (true) {
            i10 = this.f58462h;
            int i15 = this.f58456b;
            if (i14 >= i10 * 2 * i15) {
                break;
            }
            this.f58464j[(i15 * i11) + i14] = 0;
            i14++;
        }
        this.f58465k += i10 * 2;
        r();
        if (this.f58467m > i13) {
            this.f58467m = Math.max(i13, 0);
        }
        this.f58465k = 0;
        this.f58472r = 0;
        this.f58469o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f58456b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f58464j, this.f58465k, i11);
        this.f58464j = sArrF;
        shortBuffer.get(sArrF, this.f58465k * this.f58456b, ((i10 * i11) * 2) / 2);
        this.f58465k += i11;
        r();
    }
}
