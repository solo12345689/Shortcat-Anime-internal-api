package n3;

import U2.J;
import U2.K;
import android.util.Pair;
import i3.l;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f53851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f53852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f53853c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f53851a = jArr;
        this.f53852b = jArr2;
        this.f53853c = j10 == -9223372036854775807L ? a0.V0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, l lVar, long j11) {
        int length = lVar.f48628e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (lVar.f48626c + lVar.f48628e[i12]);
            j12 += (long) (lVar.f48627d + lVar.f48629f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair b(long j10, long[] jArr, long[] jArr2) {
        int iK = a0.k(jArr, j10, true, true);
        long j11 = jArr[iK];
        long j12 = jArr2[iK];
        int i10 = iK + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // n3.g
    public long d(long j10) {
        return a0.V0(((Long) b(j10, this.f53851a, this.f53852b).second).longValue());
    }

    @Override // n3.g
    public long e() {
        return 0L;
    }

    @Override // U2.J
    public J.a g(long j10) {
        Pair pairB = b(a0.F1(a0.s(j10, 0L, this.f53853c)), this.f53852b, this.f53851a);
        return new J.a(new K(a0.V0(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue()));
    }

    @Override // n3.g
    public long j() {
        return -1L;
    }

    @Override // U2.J
    public boolean k() {
        return true;
    }

    @Override // n3.g
    public int m() {
        return -2147483647;
    }

    @Override // U2.J
    public long n() {
        return this.f53853c;
    }
}
