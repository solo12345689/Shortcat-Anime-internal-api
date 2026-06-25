package n3;

import U2.F;
import U2.J;
import U2.K;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f53877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f53878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f53879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f53880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f53881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f53882f;

    private h(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.f53877a = jArr;
        this.f53878b = jArr2;
        this.f53879c = j10;
        this.f53880d = j11;
        this.f53881e = j12;
        this.f53882f = i10;
    }

    public static h a(long j10, long j11, F.a aVar, C6609I c6609i) {
        int iM;
        c6609i.c0(6);
        int iV = c6609i.v();
        long j12 = j11 + ((long) aVar.f18912c);
        long jMax = ((long) iV) + j12;
        int iV2 = c6609i.v();
        if (iV2 <= 0) {
            return null;
        }
        long jL1 = a0.l1((((long) iV2) * ((long) aVar.f18916g)) - 1, aVar.f18913d);
        int iU = c6609i.U();
        int iU2 = c6609i.U();
        int iU3 = c6609i.U();
        c6609i.c0(2);
        int i10 = iU2;
        long[] jArr = new long[iU];
        long[] jArr2 = new long[iU];
        int i11 = 0;
        long j13 = j11 + ((long) aVar.f18912c);
        while (i11 < iU) {
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            jArr4[i11] = (((long) i11) * jL1) / ((long) iU);
            jArr3[i11] = j13;
            if (iU3 == 1) {
                iM = c6609i.M();
            } else if (iU3 == 2) {
                iM = c6609i.U();
            } else if (iU3 == 3) {
                iM = c6609i.P();
            } else {
                if (iU3 != 4) {
                    return null;
                }
                iM = c6609i.Q();
            }
            int i12 = i11;
            int i13 = i10;
            j13 += ((long) iM) * ((long) i13);
            i10 = i13;
            i11 = i12 + 1;
            iU = iU;
            jArr = jArr4;
            jArr2 = jArr3;
        }
        long[] jArr5 = jArr2;
        long[] jArr6 = jArr;
        if (j10 != -1 && j10 != jMax) {
            AbstractC6635w.i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + jMax);
        }
        if (jMax != j13) {
            AbstractC6635w.i("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jMax + ", " + j13 + "\nSeeking will be inaccurate.");
            jMax = Math.max(jMax, j13);
        }
        return new h(jArr6, jArr5, jL1, j12, jMax, aVar.f18915f);
    }

    @Override // n3.g
    public long d(long j10) {
        return this.f53877a[a0.k(this.f53878b, j10, true, true)];
    }

    @Override // n3.g
    public long e() {
        return this.f53880d;
    }

    @Override // U2.J
    public J.a g(long j10) {
        int iK = a0.k(this.f53877a, j10, true, true);
        K k10 = new K(this.f53877a[iK], this.f53878b[iK]);
        if (k10.f18923a >= j10 || iK == this.f53877a.length - 1) {
            return new J.a(k10);
        }
        int i10 = iK + 1;
        return new J.a(k10, new K(this.f53877a[i10], this.f53878b[i10]));
    }

    @Override // n3.g
    public long j() {
        return this.f53881e;
    }

    @Override // U2.J
    public boolean k() {
        return true;
    }

    @Override // n3.g
    public int m() {
        return this.f53882f;
    }

    @Override // U2.J
    public long n() {
        return this.f53879c;
    }
}
