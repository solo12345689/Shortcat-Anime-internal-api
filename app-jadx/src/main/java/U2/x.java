package U2;

import U2.J;
import U2.y;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f19096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19097b;

    public x(y yVar, long j10) {
        this.f19096a = yVar;
        this.f19097b = j10;
    }

    private K a(long j10, long j11) {
        return new K((j10 * 1000000) / ((long) this.f19096a.f19102e), this.f19097b + j11);
    }

    @Override // U2.J
    public J.a g(long j10) {
        AbstractC6614a.i(this.f19096a.f19108k);
        y yVar = this.f19096a;
        y.a aVar = yVar.f19108k;
        long[] jArr = aVar.f19110a;
        long[] jArr2 = aVar.f19111b;
        int iK = a0.k(jArr, yVar.i(j10), true, false);
        K kA = a(iK == -1 ? 0L : jArr[iK], iK != -1 ? jArr2[iK] : 0L);
        if (kA.f18923a == j10 || iK == jArr.length - 1) {
            return new J.a(kA);
        }
        int i10 = iK + 1;
        return new J.a(kA, a(jArr[i10], jArr2[i10]));
    }

    @Override // U2.J
    public boolean k() {
        return true;
    }

    @Override // U2.J
    public long n() {
        return this.f19096a.f();
    }
}
