package p3;

import U2.I;
import U2.InterfaceC2256q;
import U2.J;
import U2.O;
import U2.r;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.a0;

/* JADX INFO: renamed from: p3.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5928i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private O f55777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f55778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC5926g f55779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f55780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f55781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f55782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f55783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f55784i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f55786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f55787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f55788m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5924e f55776a = new C5924e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f55785j = new b();

    /* JADX INFO: renamed from: p3.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C6109x f55789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        InterfaceC5926g f55790b;

        b() {
        }
    }

    private void a() {
        AbstractC6614a.i(this.f55777b);
        a0.l(this.f55778c);
    }

    private boolean h(InterfaceC2256q interfaceC2256q) {
        while (this.f55776a.d(interfaceC2256q)) {
            this.f55786k = interfaceC2256q.getPosition() - this.f55781f;
            if (!i(this.f55776a.c(), this.f55781f, this.f55785j)) {
                return true;
            }
            this.f55781f = interfaceC2256q.getPosition();
        }
        this.f55783h = 3;
        return false;
    }

    private int j(InterfaceC2256q interfaceC2256q) {
        if (!h(interfaceC2256q)) {
            return -1;
        }
        C6109x c6109x = this.f55785j.f55789a;
        this.f55784i = c6109x.f56998H;
        if (!this.f55788m) {
            this.f55777b.c(c6109x);
            this.f55788m = true;
        }
        InterfaceC5926g interfaceC5926g = this.f55785j.f55790b;
        if (interfaceC5926g != null) {
            this.f55779d = interfaceC5926g;
        } else if (interfaceC2256q.getLength() == -1) {
            this.f55779d = new c();
        } else {
            C5925f c5925fB = this.f55776a.b();
            this.f55779d = new C5920a(this, this.f55781f, interfaceC2256q.getLength(), c5925fB.f55769h + c5925fB.f55770i, c5925fB.f55764c, (c5925fB.f55763b & 4) != 0);
        }
        this.f55783h = 2;
        this.f55776a.f();
        return 0;
    }

    private int k(InterfaceC2256q interfaceC2256q, I i10) {
        long jB = this.f55779d.b(interfaceC2256q);
        if (jB >= 0) {
            i10.f18917a = jB;
            return 1;
        }
        if (jB < -1) {
            e(-(jB + 2));
        }
        if (!this.f55787l) {
            J j10 = (J) AbstractC6614a.i(this.f55779d.a());
            this.f55778c.t(j10);
            this.f55777b.d(j10.n());
            this.f55787l = true;
        }
        if (this.f55786k <= 0 && !this.f55776a.d(interfaceC2256q)) {
            this.f55783h = 3;
            return -1;
        }
        this.f55786k = 0L;
        C6609I c6609iC = this.f55776a.c();
        long jF = f(c6609iC);
        if (jF >= 0) {
            long j11 = this.f55782g;
            if (j11 + jF >= this.f55780e) {
                long jB2 = b(j11);
                this.f55777b.f(c6609iC, c6609iC.j());
                this.f55777b.a(jB2, 1, c6609iC.j(), 0, null);
                this.f55780e = -1L;
            }
        }
        this.f55782g += jF;
        return 0;
    }

    protected long b(long j10) {
        return (j10 * 1000000) / ((long) this.f55784i);
    }

    protected long c(long j10) {
        return (((long) this.f55784i) * j10) / 1000000;
    }

    void d(r rVar, O o10) {
        this.f55778c = rVar;
        this.f55777b = o10;
        l(true);
    }

    protected void e(long j10) {
        this.f55782g = j10;
    }

    protected abstract long f(C6609I c6609i);

    final int g(InterfaceC2256q interfaceC2256q, I i10) {
        a();
        int i11 = this.f55783h;
        if (i11 == 0) {
            return j(interfaceC2256q);
        }
        if (i11 == 1) {
            interfaceC2256q.m((int) this.f55781f);
            this.f55783h = 2;
            return 0;
        }
        if (i11 == 2) {
            a0.l(this.f55779d);
            return k(interfaceC2256q, i10);
        }
        if (i11 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean i(C6609I c6609i, long j10, b bVar);

    protected void l(boolean z10) {
        if (z10) {
            this.f55785j = new b();
            this.f55781f = 0L;
            this.f55783h = 0;
        } else {
            this.f55783h = 1;
        }
        this.f55780e = -1L;
        this.f55782g = 0L;
    }

    final void m(long j10, long j11) {
        this.f55776a.e();
        if (j10 == 0) {
            l(!this.f55787l);
        } else if (this.f55783h != 0) {
            this.f55780e = c(j11);
            ((InterfaceC5926g) a0.l(this.f55779d)).c(this.f55780e);
            this.f55783h = 2;
        }
    }

    /* JADX INFO: renamed from: p3.i$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements InterfaceC5926g {
        private c() {
        }

        @Override // p3.InterfaceC5926g
        public J a() {
            return new J.b(-9223372036854775807L);
        }

        @Override // p3.InterfaceC5926g
        public long b(InterfaceC2256q interfaceC2256q) {
            return -1L;
        }

        @Override // p3.InterfaceC5926g
        public void c(long j10) {
        }
    }
}
