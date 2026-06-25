package S2;

import S2.v;
import q2.l0;
import t2.AbstractC6614a;
import t2.C6637y;
import t2.InterfaceC6623j;
import t2.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f15895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f15896b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f15905k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v.a f15897c = new v.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final N f15898d = new N();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final N f15899e = new N();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C6637y f15900f = new C6637y();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f15901g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l0 f15904j = l0.f56919e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f15902h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f15903i = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        void b(l0 l0Var);

        void c();

        void d(long j10, long j11, boolean z10);
    }

    public z(a aVar, v vVar) {
        this.f15895a = aVar;
        this.f15896b = vVar;
    }

    private void a() {
        this.f15900f.f();
        this.f15895a.c();
    }

    private static Object c(N n10) {
        AbstractC6614a.a(n10.l() > 0);
        while (n10.l() > 1) {
            n10.i();
        }
        return AbstractC6614a.e(n10.i());
    }

    private boolean e(long j10) {
        Long l10 = (Long) this.f15899e.j(j10);
        if (l10 == null || l10.longValue() == this.f15905k) {
            return false;
        }
        this.f15905k = l10.longValue();
        return true;
    }

    private boolean f(long j10) {
        l0 l0Var = (l0) this.f15898d.j(j10);
        if (l0Var == null || l0Var.equals(l0.f56919e) || l0Var.equals(this.f15904j)) {
            return false;
        }
        this.f15904j = l0Var;
        return true;
    }

    private void k(boolean z10) {
        long jF = this.f15900f.f();
        if (f(jF)) {
            this.f15895a.b(this.f15904j);
        }
        this.f15895a.d(z10 ? InterfaceC6623j.f60596a.b() : this.f15897c.g(), jF, this.f15896b.g());
    }

    public void b() {
        this.f15900f.b();
        this.f15901g = -9223372036854775807L;
        this.f15902h = -9223372036854775807L;
        this.f15903i = -9223372036854775807L;
        if (this.f15899e.l() > 0) {
            this.f15905k = ((Long) c(this.f15899e)).longValue();
        }
        if (this.f15898d.l() > 0) {
            this.f15898d.a(0L, (l0) c(this.f15898d));
        }
    }

    public boolean d() {
        long j10 = this.f15903i;
        return j10 != -9223372036854775807L && this.f15902h == j10;
    }

    public void g(long j10) {
        this.f15900f.a(j10);
        this.f15901g = j10;
        this.f15903i = -9223372036854775807L;
    }

    public void h(int i10, long j10) {
        if (this.f15900f.e()) {
            this.f15896b.j(i10);
            this.f15905k = j10;
        } else {
            N n10 = this.f15899e;
            long j11 = this.f15901g;
            n10.a(j11 == -9223372036854775807L ? -4611686018427387904L : j11 + 1, Long.valueOf(j10));
        }
    }

    public void i(int i10, int i11) {
        N n10 = this.f15898d;
        long j10 = this.f15901g;
        n10.a(j10 == -9223372036854775807L ? 0L : j10 + 1, new l0(i10, i11));
    }

    public void j(long j10, long j11) {
        while (!this.f15900f.e()) {
            long jD = this.f15900f.d();
            if (e(jD)) {
                this.f15896b.j(2);
            }
            int iC = this.f15896b.c(jD, j10, j11, this.f15905k, false, false, this.f15897c);
            if (iC == 0 || iC == 1) {
                this.f15902h = jD;
                k(iC == 0);
            } else if (iC == 2 || iC == 3) {
                this.f15902h = jD;
                a();
            } else {
                if (iC != 4) {
                    if (iC != 5) {
                        throw new IllegalStateException(String.valueOf(iC));
                    }
                    return;
                }
                this.f15902h = jD;
            }
        }
    }

    public void l() {
        if (this.f15901g == -9223372036854775807L) {
            this.f15901g = Long.MIN_VALUE;
            this.f15902h = Long.MIN_VALUE;
        }
        this.f15903i = this.f15901g;
    }
}
