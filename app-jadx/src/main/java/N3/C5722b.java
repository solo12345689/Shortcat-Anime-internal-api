package n3;

import U2.E;
import U2.J;
import java.math.RoundingMode;
import t2.a0;

/* JADX INFO: renamed from: n3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5722b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f53847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f53848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E f53850d;

    public C5722b(long j10, long j11, long j12) {
        this.f53850d = new E(new long[]{j11}, new long[]{0}, j10);
        this.f53847a = j11;
        this.f53848b = j12;
        int i10 = -2147483647;
        if (j10 == -9223372036854775807L) {
            this.f53849c = -2147483647;
            return;
        }
        long jO1 = a0.o1(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jO1 > 0 && jO1 <= 2147483647L) {
            i10 = (int) jO1;
        }
        this.f53849c = i10;
    }

    public boolean a(long j10) {
        return this.f53850d.b(j10, 100000L);
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f53850d.a(j10, j11);
    }

    void c(long j10) {
        this.f53850d.c(j10);
    }

    @Override // n3.g
    public long d(long j10) {
        return this.f53850d.d(j10);
    }

    @Override // n3.g
    public long e() {
        return this.f53847a;
    }

    @Override // U2.J
    public J.a g(long j10) {
        return this.f53850d.g(j10);
    }

    @Override // n3.g
    public long j() {
        return this.f53848b;
    }

    @Override // U2.J
    public boolean k() {
        return this.f53850d.k();
    }

    @Override // n3.g
    public int m() {
        return this.f53849c;
    }

    @Override // U2.J
    public long n() {
        return this.f53850d.n();
    }
}
