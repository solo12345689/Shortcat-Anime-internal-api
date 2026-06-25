package D2;

import E2.i;
import U2.C2246g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2246g f3545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3546b;

    public h(C2246g c2246g, long j10) {
        this.f3545a = c2246g;
        this.f3546b = j10;
    }

    @Override // D2.f
    public long d(long j10) {
        return this.f3545a.f19036e[(int) j10] - this.f3546b;
    }

    @Override // D2.f
    public long e(long j10, long j11) {
        return this.f3545a.f19035d[(int) j10];
    }

    @Override // D2.f
    public long f(long j10, long j11) {
        return 0L;
    }

    @Override // D2.f
    public long g(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // D2.f
    public i h(long j10) {
        return new i(null, this.f3545a.f19034c[(int) j10], r1.f19033b[r7]);
    }

    @Override // D2.f
    public long i(long j10, long j11) {
        return this.f3545a.a(j10 + this.f3546b);
    }

    @Override // D2.f
    public long j(long j10) {
        return this.f3545a.f19032a;
    }

    @Override // D2.f
    public boolean k() {
        return true;
    }

    @Override // D2.f
    public long l() {
        return 0L;
    }

    @Override // D2.f
    public long m(long j10, long j11) {
        return this.f3545a.f19032a;
    }
}
