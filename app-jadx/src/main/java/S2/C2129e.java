package S2;

import S2.L;
import S2.z;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.C2907s;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import q2.C6109x;
import q2.l0;
import t2.AbstractC6614a;
import t2.C6611K;
import t2.InterfaceC6623j;

/* JADX INFO: renamed from: S2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2129e implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f15665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f15666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f15667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f15668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C6109x f15669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f15670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private L.a f15671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Executor f15672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u f15673i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class b implements z.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C6109x f15674a;

        private b() {
        }

        @Override // S2.z.a
        public void b(final l0 l0Var) {
            this.f15674a = new C6109x.b().F0(l0Var.f56923a).h0(l0Var.f56924b).y0("video/raw").P();
            C2129e.this.f15672h.execute(new Runnable() { // from class: S2.h
                @Override // java.lang.Runnable
                public final void run() {
                    C2129e.this.f15671g.b(l0Var);
                }
            });
        }

        @Override // S2.z.a
        public void c() {
            C2129e.this.f15672h.execute(new Runnable() { // from class: S2.g
                @Override // java.lang.Runnable
                public final void run() {
                    C2129e.this.f15671g.c();
                }
            });
            ((L.b) C2129e.this.f15667c.remove()).b();
        }

        @Override // S2.z.a
        public void d(long j10, long j11, boolean z10) {
            if (z10 && C2129e.this.f15668d != null) {
                C2129e.this.f15672h.execute(new Runnable() { // from class: S2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2129e.this.f15671g.a();
                    }
                });
            }
            C6109x c6109xP = this.f15674a;
            if (c6109xP == null) {
                c6109xP = new C6109x.b().P();
            }
            C2129e.this.f15673i.h(j11, j10, c6109xP, null);
            ((L.b) C2129e.this.f15667c.remove()).a(j10);
        }
    }

    public C2129e(v vVar, InterfaceC6623j interfaceC6623j) {
        this.f15665a = vVar;
        vVar.m(interfaceC6623j);
        this.f15666b = new z(new b(), vVar);
        this.f15667c = new ArrayDeque();
        this.f15669e = new C6109x.b().P();
        this.f15670f = -9223372036854775807L;
        this.f15671g = L.a.f15661a;
        this.f15672h = new Executor() { // from class: S2.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C2129e.b(runnable);
            }
        };
        this.f15673i = new u() { // from class: S2.c
            @Override // S2.u
            public final void h(long j10, long j11, C6109x c6109x, MediaFormat mediaFormat) {
                C2129e.f(j10, j11, c6109x, mediaFormat);
            }
        };
    }

    @Override // S2.L
    public void A(L.a aVar, Executor executor) {
        this.f15671g = aVar;
        this.f15672h = executor;
    }

    @Override // S2.L
    public boolean d() {
        return this.f15666b.d();
    }

    @Override // S2.L
    public boolean e() {
        return true;
    }

    @Override // S2.L
    public void g(long j10, long j11) throws L.c {
        try {
            this.f15666b.j(j10, j11);
        } catch (C2907s e10) {
            throw new L.c(e10, this.f15669e);
        }
    }

    @Override // S2.L
    public void h(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // S2.L
    public void i() {
        this.f15666b.l();
    }

    @Override // S2.L
    public void j(Surface surface, C6611K c6611k) {
        this.f15668d = surface;
        this.f15665a.o(surface);
    }

    @Override // S2.L
    public void k(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // S2.L
    public boolean l(boolean z10) {
        return this.f15665a.d(z10);
    }

    @Override // S2.L
    public void m() {
        throw new UnsupportedOperationException();
    }

    @Override // S2.L
    public void n() {
        this.f15665a.a();
    }

    @Override // S2.L
    public Surface o() {
        return (Surface) AbstractC6614a.i(this.f15668d);
    }

    @Override // S2.L
    public boolean p(C6109x c6109x) {
        return true;
    }

    @Override // S2.L
    public void q() {
        this.f15665a.i();
    }

    @Override // S2.L
    public void r() {
        this.f15665a.h();
    }

    @Override // S2.L
    public boolean s(long j10, L.b bVar) {
        this.f15667c.add(bVar);
        this.f15666b.g(j10);
        this.f15672h.execute(new Runnable() { // from class: S2.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f15664a.f15671g.d();
            }
        });
        return true;
    }

    @Override // S2.L
    public void t(float f10) {
        this.f15665a.p(f10);
    }

    @Override // S2.L
    public void u(int i10) {
        this.f15665a.l(i10);
    }

    @Override // S2.L
    public void v() {
        this.f15668d = null;
        this.f15665a.o(null);
    }

    @Override // S2.L
    public void w(boolean z10) {
        if (z10) {
            this.f15665a.k();
        }
        this.f15666b.b();
        this.f15667c.clear();
    }

    @Override // S2.L
    public void x(int i10, C6109x c6109x, long j10, int i11, List list) {
        AbstractC6614a.g(list.isEmpty());
        int i12 = c6109x.f57029v;
        C6109x c6109x2 = this.f15669e;
        if (i12 != c6109x2.f57029v || c6109x.f57030w != c6109x2.f57030w) {
            this.f15666b.i(i12, c6109x.f57030w);
        }
        float f10 = c6109x.f57033z;
        if (f10 != this.f15669e.f57033z) {
            this.f15665a.n(f10);
        }
        this.f15669e = c6109x;
        if (j10 != this.f15670f) {
            this.f15666b.h(i11, j10);
            this.f15670f = j10;
        }
    }

    @Override // S2.L
    public void y(u uVar) {
        this.f15673i = uVar;
    }

    @Override // S2.L
    public void z(boolean z10) {
        this.f15665a.e(z10);
    }

    @Override // S2.L
    public void a() {
    }

    public static /* synthetic */ void b(Runnable runnable) {
    }

    public static /* synthetic */ void f(long j10, long j11, C6109x c6109x, MediaFormat mediaFormat) {
    }
}
