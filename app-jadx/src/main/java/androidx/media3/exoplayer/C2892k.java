package androidx.media3.exoplayer;

import q2.C6083O;
import t2.AbstractC6614a;
import t2.InterfaceC6623j;

/* JADX INFO: renamed from: androidx.media3.exoplayer.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2892k implements A2.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A2.S f31045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f31046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private N0 f31047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private A2.L f31048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31049e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31050f;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void n(C6083O c6083o);
    }

    public C2892k(a aVar, InterfaceC6623j interfaceC6623j) {
        this.f31046b = aVar;
        this.f31045a = new A2.S(interfaceC6623j);
    }

    private boolean f(boolean z10) {
        N0 n02 = this.f31047c;
        if (n02 == null || n02.d()) {
            return true;
        }
        if (z10 && this.f31047c.getState() != 2) {
            return true;
        }
        if (this.f31047c.isReady()) {
            return false;
        }
        return z10 || this.f31047c.i();
    }

    private void j(boolean z10) {
        if (f(z10)) {
            this.f31049e = true;
            if (this.f31050f) {
                this.f31045a.b();
                return;
            }
            return;
        }
        A2.L l10 = (A2.L) AbstractC6614a.e(this.f31048d);
        long jI = l10.I();
        if (this.f31049e) {
            if (jI < this.f31045a.I()) {
                this.f31045a.d();
                return;
            } else {
                this.f31049e = false;
                if (this.f31050f) {
                    this.f31045a.b();
                }
            }
        }
        this.f31045a.a(jI);
        C6083O c6083oC = l10.c();
        if (c6083oC.equals(this.f31045a.c())) {
            return;
        }
        this.f31045a.e(c6083oC);
        this.f31046b.n(c6083oC);
    }

    @Override // A2.L
    public long I() {
        return this.f31049e ? this.f31045a.I() : ((A2.L) AbstractC6614a.e(this.f31048d)).I();
    }

    public void a(N0 n02) {
        if (n02 == this.f31047c) {
            this.f31048d = null;
            this.f31047c = null;
            this.f31049e = true;
        }
    }

    public void b(N0 n02) throws C2907s {
        A2.L l10;
        A2.L lP = n02.P();
        if (lP == null || lP == (l10 = this.f31048d)) {
            return;
        }
        if (l10 != null) {
            throw C2907s.k(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f31048d = lP;
        this.f31047c = n02;
        lP.e(this.f31045a.c());
    }

    @Override // A2.L
    public C6083O c() {
        A2.L l10 = this.f31048d;
        return l10 != null ? l10.c() : this.f31045a.c();
    }

    public void d(long j10) {
        this.f31045a.a(j10);
    }

    @Override // A2.L
    public void e(C6083O c6083o) {
        A2.L l10 = this.f31048d;
        if (l10 != null) {
            l10.e(c6083o);
            c6083o = this.f31048d.c();
        }
        this.f31045a.e(c6083o);
    }

    public void g() {
        this.f31050f = true;
        this.f31045a.b();
    }

    public void h() {
        this.f31050f = false;
        this.f31045a.d();
    }

    public long i(boolean z10) {
        j(z10);
        return I();
    }

    @Override // A2.L
    public boolean u() {
        return this.f31049e ? this.f31045a.u() : ((A2.L) AbstractC6614a.e(this.f31048d)).u();
    }
}
