package C3;

import U2.J;
import U2.K;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f2856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f2857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f2858e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f2854a = cVar;
        this.f2855b = i10;
        this.f2856c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f2847e);
        this.f2857d = j12;
        this.f2858e = a(j12);
    }

    private long a(long j10) {
        return a0.m1(j10 * ((long) this.f2855b), 1000000L, this.f2854a.f2845c);
    }

    @Override // U2.J
    public J.a g(long j10) {
        long jS = a0.s((((long) this.f2854a.f2845c) * j10) / (((long) this.f2855b) * 1000000), 0L, this.f2857d - 1);
        long j11 = this.f2856c + (((long) this.f2854a.f2847e) * jS);
        long jA = a(jS);
        K k10 = new K(jA, j11);
        if (jA >= j10 || jS == this.f2857d - 1) {
            return new J.a(k10);
        }
        long j12 = jS + 1;
        return new J.a(k10, new K(a(j12), this.f2856c + (((long) this.f2854a.f2847e) * j12)));
    }

    @Override // U2.J
    public boolean k() {
        return true;
    }

    @Override // U2.J
    public long n() {
        return this.f2858e;
    }
}
