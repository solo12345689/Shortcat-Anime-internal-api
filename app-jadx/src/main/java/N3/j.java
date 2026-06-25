package n3;

import U2.F;
import U2.J;
import U2.K;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f53889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f53891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f53893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f53894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f53895g;

    private j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f53889a = j10;
        this.f53890b = i10;
        this.f53891c = j11;
        this.f53892d = i11;
        this.f53893e = j12;
        this.f53895g = jArr;
        this.f53894f = j12 != -1 ? j10 + j12 : -1L;
    }

    public static j a(i iVar, long j10) {
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        F.a aVar = iVar.f53883a;
        return new j(j10, aVar.f18912c, jA, aVar.f18915f, iVar.f53885c, iVar.f53888f);
    }

    private long b(int i10) {
        return (this.f53891c * ((long) i10)) / 100;
    }

    @Override // n3.g
    public long d(long j10) {
        long j11 = j10 - this.f53889a;
        if (!k() || j11 <= this.f53890b) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC6614a.i(this.f53895g);
        double d10 = (j11 * 256.0d) / this.f53893e;
        int iK = a0.k(jArr, (long) d10, true, true);
        long jB = b(iK);
        long j12 = jArr[iK];
        int i10 = iK + 1;
        long jB2 = b(i10);
        return jB + Math.round((j12 == (iK == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jB2 - jB));
    }

    @Override // n3.g
    public long e() {
        return this.f53889a + ((long) this.f53890b);
    }

    @Override // U2.J
    public J.a g(long j10) {
        if (!k()) {
            return new J.a(new K(0L, this.f53889a + ((long) this.f53890b)));
        }
        long jS = a0.s(j10, 0L, this.f53891c);
        double d10 = (jS * 100.0d) / this.f53891c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) AbstractC6614a.i(this.f53895g))[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new J.a(new K(jS, this.f53889a + a0.s(Math.round((d11 / 256.0d) * this.f53893e), this.f53890b, this.f53893e - 1)));
    }

    @Override // n3.g
    public long j() {
        return this.f53894f;
    }

    @Override // U2.J
    public boolean k() {
        return this.f53895g != null;
    }

    @Override // n3.g
    public int m() {
        return this.f53892d;
    }

    @Override // U2.J
    public long n() {
        return this.f53891c;
    }
}
