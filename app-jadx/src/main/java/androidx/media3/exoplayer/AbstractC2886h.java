package androidx.media3.exoplayer;

import B2.K1;
import M2.D;
import androidx.media3.exoplayer.O0;
import java.util.Objects;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.InterfaceC6623j;

/* JADX INFO: renamed from: androidx.media3.exoplayer.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2886h implements N0, O0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30775b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private A2.N f30777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private K1 f30779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC6623j f30780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private M2.c0 f30782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C6109x[] f30783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f30784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f30785l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f30788o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private D.b f30790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private O0.a f30791r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30774a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A2.J f30776c = new A2.J();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f30786m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private q2.Y f30789p = q2.Y.f56642a;

    public AbstractC2886h(int i10) {
        this.f30775b = i10;
    }

    private void p0(long j10, boolean z10) {
        this.f30787n = false;
        this.f30785l = j10;
        this.f30786m = j10;
        g0(j10, z10);
    }

    @Override // androidx.media3.exoplayer.N0
    public final boolean A() {
        return this.f30787n;
    }

    @Override // androidx.media3.exoplayer.N0
    public final void D(q2.Y y10) {
        if (Objects.equals(this.f30789p, y10)) {
            return;
        }
        this.f30789p = y10;
        n0(y10);
    }

    @Override // androidx.media3.exoplayer.O0
    public final void H(O0.a aVar) {
        synchronized (this.f30774a) {
            this.f30791r = aVar;
        }
    }

    public int L() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.N0
    public final M2.c0 M() {
        return this.f30782i;
    }

    @Override // androidx.media3.exoplayer.N0
    public final long N() {
        return this.f30786m;
    }

    @Override // androidx.media3.exoplayer.N0
    public final void O(long j10) {
        p0(j10, false);
    }

    @Override // androidx.media3.exoplayer.N0
    public A2.L P() {
        return null;
    }

    protected final C2907s R(Throwable th2, C6109x c6109x, int i10) {
        return S(th2, c6109x, false, i10);
    }

    protected final C2907s S(Throwable th2, C6109x c6109x, boolean z10, int i10) {
        int iQ;
        if (c6109x == null || this.f30788o) {
            iQ = 4;
        } else {
            this.f30788o = true;
            try {
                iQ = O0.Q(b(c6109x));
            } catch (C2907s unused) {
                iQ = 4;
            } finally {
                this.f30788o = false;
            }
        }
        return C2907s.i(th2, getName(), W(), c6109x, iQ, this.f30790q, z10, i10);
    }

    protected final InterfaceC6623j T() {
        return (InterfaceC6623j) AbstractC6614a.e(this.f30780g);
    }

    protected final A2.N U() {
        return (A2.N) AbstractC6614a.e(this.f30777d);
    }

    protected final A2.J V() {
        this.f30776c.a();
        return this.f30776c;
    }

    protected final int W() {
        return this.f30778e;
    }

    protected final long X() {
        return this.f30785l;
    }

    protected final K1 Y() {
        return (K1) AbstractC6614a.e(this.f30779f);
    }

    protected final C6109x[] Z() {
        return (C6109x[]) AbstractC6614a.e(this.f30783j);
    }

    @Override // androidx.media3.exoplayer.N0
    public final void a() {
        AbstractC6614a.g(this.f30781h == 0);
        h0();
    }

    protected final long a0() {
        return this.f30784k;
    }

    protected final q2.Y b0() {
        return this.f30789p;
    }

    protected final boolean c0() {
        return i() ? this.f30787n : ((M2.c0) AbstractC6614a.e(this.f30782i)).isReady();
    }

    protected abstract void d0();

    @Override // androidx.media3.exoplayer.N0
    public final void disable() {
        AbstractC6614a.g(this.f30781h == 1);
        this.f30776c.a();
        this.f30781h = 0;
        this.f30782i = null;
        this.f30783j = null;
        this.f30787n = false;
        d0();
        this.f30790q = null;
    }

    @Override // androidx.media3.exoplayer.N0, androidx.media3.exoplayer.O0
    public final int f() {
        return this.f30775b;
    }

    protected abstract void g0(long j10, boolean z10);

    @Override // androidx.media3.exoplayer.N0
    public final int getState() {
        return this.f30781h;
    }

    @Override // androidx.media3.exoplayer.O0
    public final void h() {
        synchronized (this.f30774a) {
            this.f30791r = null;
        }
    }

    @Override // androidx.media3.exoplayer.N0
    public final boolean i() {
        return this.f30786m == Long.MIN_VALUE;
    }

    protected final void i0() {
        O0.a aVar;
        synchronized (this.f30774a) {
            aVar = this.f30791r;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // androidx.media3.exoplayer.N0
    public final void j(A2.N n10, C6109x[] c6109xArr, M2.c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12, D.b bVar) {
        AbstractC6614a.g(this.f30781h == 0);
        this.f30777d = n10;
        this.f30790q = bVar;
        this.f30781h = 1;
        e0(z10, z11);
        p(c6109xArr, c0Var, j11, j12, bVar);
        p0(j11, z10);
    }

    @Override // androidx.media3.exoplayer.N0
    public final void n() {
        this.f30787n = true;
    }

    protected final int o0(A2.J j10, z2.f fVar, int i10) {
        int iP = ((M2.c0) AbstractC6614a.e(this.f30782i)).p(j10, fVar, i10);
        if (iP != -4) {
            if (iP == -5) {
                C6109x c6109x = (C6109x) AbstractC6614a.e(j10.f142b);
                if (c6109x.f57027t != Long.MAX_VALUE) {
                    j10.f142b = c6109x.b().C0(c6109x.f57027t + this.f30784k).P();
                }
            }
            return iP;
        }
        if (fVar.q()) {
            this.f30786m = Long.MIN_VALUE;
            return this.f30787n ? -4 : -3;
        }
        long j11 = fVar.f65557f + this.f30784k;
        fVar.f65557f = j11;
        this.f30786m = Math.max(this.f30786m, j11);
        return iP;
    }

    @Override // androidx.media3.exoplayer.N0
    public final void p(C6109x[] c6109xArr, M2.c0 c0Var, long j10, long j11, D.b bVar) {
        AbstractC6614a.g(!this.f30787n);
        this.f30782i = c0Var;
        this.f30790q = bVar;
        if (this.f30786m == Long.MIN_VALUE) {
            this.f30786m = j10;
        }
        this.f30783j = c6109xArr;
        this.f30784k = j11;
        m0(c6109xArr, j10, j11, bVar);
    }

    protected int q0(long j10) {
        return ((M2.c0) AbstractC6614a.e(this.f30782i)).e(j10 - this.f30784k);
    }

    @Override // androidx.media3.exoplayer.N0
    public final void reset() {
        AbstractC6614a.g(this.f30781h == 0);
        this.f30776c.a();
        j0();
    }

    @Override // androidx.media3.exoplayer.N0
    public final void start() {
        AbstractC6614a.g(this.f30781h == 1);
        this.f30781h = 2;
        k0();
    }

    @Override // androidx.media3.exoplayer.N0
    public final void stop() {
        AbstractC6614a.g(this.f30781h == 2);
        this.f30781h = 1;
        l0();
    }

    @Override // androidx.media3.exoplayer.N0
    public final void w(int i10, K1 k12, InterfaceC6623j interfaceC6623j) {
        this.f30778e = i10;
        this.f30779f = k12;
        this.f30780g = interfaceC6623j;
        f0();
    }

    @Override // androidx.media3.exoplayer.N0
    public final void x() {
        ((M2.c0) AbstractC6614a.e(this.f30782i)).b();
    }

    @Override // androidx.media3.exoplayer.N0
    public final O0 G() {
        return this;
    }

    protected void f0() {
    }

    protected void h0() {
    }

    protected void j0() {
    }

    protected void k0() {
    }

    protected void l0() {
    }

    protected void n0(q2.Y y10) {
    }

    protected void e0(boolean z10, boolean z11) {
    }

    @Override // androidx.media3.exoplayer.L0.b
    public void v(int i10, Object obj) {
    }

    protected void m0(C6109x[] c6109xArr, long j10, long j11, D.b bVar) {
    }
}
