package q2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import q2.InterfaceC6084P;
import s2.C6407e;

/* JADX INFO: renamed from: q2.y */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6110y implements InterfaceC6084P {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6084P f57075a;

    /* JADX INFO: renamed from: q2.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements InterfaceC6084P.d {

        /* JADX INFO: renamed from: a */
        private final AbstractC6110y f57076a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC6084P.d f57077b;

        public a(AbstractC6110y abstractC6110y, InterfaceC6084P.d dVar) {
            this.f57076a = abstractC6110y;
            this.f57077b = dVar;
        }

        @Override // q2.InterfaceC6084P.d
        public void C(int i10) {
            this.f57077b.C(i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void D(boolean z10) {
            this.f57077b.b0(z10);
        }

        @Override // q2.InterfaceC6084P.d
        public void E(C6071C c6071c, int i10) {
            this.f57077b.E(c6071c, i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void F(int i10) {
            this.f57077b.F(i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void H(C6082N c6082n) {
            this.f57077b.H(c6082n);
        }

        @Override // q2.InterfaceC6084P.d
        public void I(InterfaceC6084P.b bVar) {
            this.f57077b.I(bVar);
        }

        @Override // q2.InterfaceC6084P.d
        public void J(int i10) {
            this.f57077b.J(i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void M(boolean z10) {
            this.f57077b.M(z10);
        }

        @Override // q2.InterfaceC6084P.d
        public void P(int i10, boolean z10) {
            this.f57077b.P(i10, z10);
        }

        @Override // q2.InterfaceC6084P.d
        public void R(long j10) {
            this.f57077b.R(j10);
        }

        @Override // q2.InterfaceC6084P.d
        public void S(Y y10, int i10) {
            this.f57077b.S(y10, i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void T() {
            this.f57077b.T();
        }

        @Override // q2.InterfaceC6084P.d
        public void V(C6077I c6077i) {
            this.f57077b.V(c6077i);
        }

        @Override // q2.InterfaceC6084P.d
        public void W(int i10, int i11) {
            this.f57077b.W(i10, i11);
        }

        @Override // q2.InterfaceC6084P.d
        public void X(InterfaceC6084P interfaceC6084P, InterfaceC6084P.c cVar) {
            this.f57077b.X(this.f57076a, cVar);
        }

        @Override // q2.InterfaceC6084P.d
        public void Y(int i10) {
            this.f57077b.Y(i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void Z(d0 d0Var) {
            this.f57077b.Z(d0Var);
        }

        @Override // q2.InterfaceC6084P.d
        public void b(l0 l0Var) {
            this.f57077b.b(l0Var);
        }

        @Override // q2.InterfaceC6084P.d
        public void b0(boolean z10) {
            this.f57077b.b0(z10);
        }

        @Override // q2.InterfaceC6084P.d
        public void c0(C6077I c6077i) {
            this.f57077b.c0(c6077i);
        }

        @Override // q2.InterfaceC6084P.d
        public void d(int i10) {
            this.f57077b.d(i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void d0(float f10) {
            this.f57077b.d0(f10);
        }

        @Override // q2.InterfaceC6084P.d
        public void e0(C6088c c6088c) {
            this.f57077b.e0(c6088c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f57076a.equals(aVar.f57076a)) {
                return this.f57077b.equals(aVar.f57077b);
            }
            return false;
        }

        @Override // q2.InterfaceC6084P.d
        public void f(boolean z10) {
            this.f57077b.f(z10);
        }

        @Override // q2.InterfaceC6084P.d
        public void g0(h0 h0Var) {
            this.f57077b.g0(h0Var);
        }

        public int hashCode() {
            return (this.f57076a.hashCode() * 31) + this.f57077b.hashCode();
        }

        @Override // q2.InterfaceC6084P.d
        public void k0(boolean z10, int i10) {
            this.f57077b.k0(z10, i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void l0(long j10) {
            this.f57077b.l0(j10);
        }

        @Override // q2.InterfaceC6084P.d
        public void m0(InterfaceC6084P.e eVar, InterfaceC6084P.e eVar2, int i10) {
            this.f57077b.m0(eVar, eVar2, i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void n(C6083O c6083o) {
            this.f57077b.n(c6083o);
        }

        @Override // q2.InterfaceC6084P.d
        public void n0(C6101p c6101p) {
            this.f57077b.n0(c6101p);
        }

        @Override // q2.InterfaceC6084P.d
        public void p(List list) {
            this.f57077b.p(list);
        }

        @Override // q2.InterfaceC6084P.d
        public void r0(long j10) {
            this.f57077b.r0(j10);
        }

        @Override // q2.InterfaceC6084P.d
        public void s0(boolean z10, int i10) {
            this.f57077b.s0(z10, i10);
        }

        @Override // q2.InterfaceC6084P.d
        public void t(C6407e c6407e) {
            this.f57077b.t(c6407e);
        }

        @Override // q2.InterfaceC6084P.d
        public void t0(C6082N c6082n) {
            this.f57077b.t0(c6082n);
        }

        @Override // q2.InterfaceC6084P.d
        public void y0(boolean z10) {
            this.f57077b.y0(z10);
        }

        @Override // q2.InterfaceC6084P.d
        public void z(C6078J c6078j) {
            this.f57077b.z(c6078j);
        }
    }

    public AbstractC6110y(InterfaceC6084P interfaceC6084P) {
        this.f57075a = interfaceC6084P;
    }

    @Override // q2.InterfaceC6084P
    public boolean A0() {
        return this.f57075a.A0();
    }

    @Override // q2.InterfaceC6084P
    public void B(Surface surface) {
        this.f57075a.B(surface);
    }

    @Override // q2.InterfaceC6084P
    public int B0() {
        return this.f57075a.B0();
    }

    @Override // q2.InterfaceC6084P
    public void C(C6077I c6077i) {
        this.f57075a.C(c6077i);
    }

    @Override // q2.InterfaceC6084P
    public void C0(int i10, C6071C c6071c) {
        this.f57075a.C0(i10, c6071c);
    }

    @Override // q2.InterfaceC6084P
    public boolean D() {
        return this.f57075a.D();
    }

    @Override // q2.InterfaceC6084P
    public void D0(List list, int i10, long j10) {
        this.f57075a.D0(list, i10, j10);
    }

    @Override // q2.InterfaceC6084P
    public long E() {
        return this.f57075a.E();
    }

    @Override // q2.InterfaceC6084P
    public void E0(int i10) {
        this.f57075a.E0(i10);
    }

    @Override // q2.InterfaceC6084P
    public void F(boolean z10, int i10) {
        this.f57075a.F(z10, i10);
    }

    @Override // q2.InterfaceC6084P
    public long F0() {
        return this.f57075a.F0();
    }

    @Override // q2.InterfaceC6084P
    public void G() {
        this.f57075a.G();
    }

    @Override // q2.InterfaceC6084P
    public long G0() {
        return this.f57075a.G0();
    }

    @Override // q2.InterfaceC6084P
    public void H(InterfaceC6084P.d dVar) {
        this.f57075a.H(new a(this, dVar));
    }

    @Override // q2.InterfaceC6084P
    public void H0(int i10, List list) {
        this.f57075a.H0(i10, list);
    }

    @Override // q2.InterfaceC6084P
    public int I() {
        return this.f57075a.I();
    }

    @Override // q2.InterfaceC6084P
    public long I0() {
        return this.f57075a.I0();
    }

    @Override // q2.InterfaceC6084P
    public void J() {
        this.f57075a.J();
    }

    @Override // q2.InterfaceC6084P
    public C6077I J0() {
        return this.f57075a.J0();
    }

    @Override // q2.InterfaceC6084P
    public void K() {
        this.f57075a.K();
    }

    @Override // q2.InterfaceC6084P
    public int K0() {
        return this.f57075a.K0();
    }

    @Override // q2.InterfaceC6084P
    public void L(List list, boolean z10) {
        this.f57075a.L(list, z10);
    }

    @Override // q2.InterfaceC6084P
    public void L0(SurfaceView surfaceView) {
        this.f57075a.L0(surfaceView);
    }

    @Override // q2.InterfaceC6084P
    public void M() {
        this.f57075a.M();
    }

    @Override // q2.InterfaceC6084P
    public void M0(int i10, int i11) {
        this.f57075a.M0(i10, i11);
    }

    @Override // q2.InterfaceC6084P
    public void N(int i10) {
        this.f57075a.N(i10);
    }

    @Override // q2.InterfaceC6084P
    public void N0(int i10, int i11, int i12) {
        this.f57075a.N0(i10, i11, i12);
    }

    @Override // q2.InterfaceC6084P
    public void O(SurfaceView surfaceView) {
        this.f57075a.O(surfaceView);
    }

    @Override // q2.InterfaceC6084P
    public void O0(List list) {
        this.f57075a.O0(list);
    }

    @Override // q2.InterfaceC6084P
    public void P(d0 d0Var) {
        this.f57075a.P(d0Var);
    }

    @Override // q2.InterfaceC6084P
    public boolean P0() {
        return this.f57075a.P0();
    }

    @Override // q2.InterfaceC6084P
    public void Q(int i10, int i11, List list) {
        this.f57075a.Q(i10, i11, list);
    }

    @Override // q2.InterfaceC6084P
    public boolean Q0() {
        return this.f57075a.Q0();
    }

    @Override // q2.InterfaceC6084P
    public void R(int i10) {
        this.f57075a.R(i10);
    }

    @Override // q2.InterfaceC6084P
    public long R0() {
        return this.f57075a.R0();
    }

    @Override // q2.InterfaceC6084P
    public void S0(int i10) {
        this.f57075a.S0(i10);
    }

    @Override // q2.InterfaceC6084P
    public void T(int i10, int i11) {
        this.f57075a.T(i10, i11);
    }

    @Override // q2.InterfaceC6084P
    public void T0() {
        this.f57075a.T0();
    }

    @Override // q2.InterfaceC6084P
    public void U() {
        this.f57075a.U();
    }

    @Override // q2.InterfaceC6084P
    public void U0() {
        this.f57075a.U0();
    }

    @Override // q2.InterfaceC6084P
    public void V(boolean z10) {
        this.f57075a.V(z10);
    }

    @Override // q2.InterfaceC6084P
    public C6077I V0() {
        return this.f57075a.V0();
    }

    @Override // q2.InterfaceC6084P
    public void W() {
        this.f57075a.W();
    }

    @Override // q2.InterfaceC6084P
    public void W0(C6088c c6088c, boolean z10) {
        this.f57075a.W0(c6088c, z10);
    }

    @Override // q2.InterfaceC6084P
    public void X(int i10) {
        this.f57075a.X(i10);
    }

    @Override // q2.InterfaceC6084P
    public long X0() {
        return this.f57075a.X0();
    }

    @Override // q2.InterfaceC6084P
    public h0 Y() {
        return this.f57075a.Y();
    }

    @Override // q2.InterfaceC6084P
    public boolean Y0() {
        return this.f57075a.Y0();
    }

    @Override // q2.InterfaceC6084P
    public boolean Z() {
        return this.f57075a.Z();
    }

    public InterfaceC6084P Z0() {
        return this.f57075a;
    }

    @Override // q2.InterfaceC6084P
    public void a0(InterfaceC6084P.d dVar) {
        this.f57075a.a0(new a(this, dVar));
    }

    @Override // q2.InterfaceC6084P
    public C6071C b() {
        return this.f57075a.b();
    }

    @Override // q2.InterfaceC6084P
    public C6407e b0() {
        return this.f57075a.b0();
    }

    @Override // q2.InterfaceC6084P
    public C6083O c() {
        return this.f57075a.c();
    }

    @Override // q2.InterfaceC6084P
    public int c0() {
        return this.f57075a.c0();
    }

    @Override // q2.InterfaceC6084P
    public void d0(C6071C c6071c, boolean z10) {
        this.f57075a.d0(c6071c, z10);
    }

    @Override // q2.InterfaceC6084P
    public void e(C6083O c6083o) {
        this.f57075a.e(c6083o);
    }

    @Override // q2.InterfaceC6084P
    public void e0(boolean z10) {
        this.f57075a.e0(z10);
    }

    @Override // q2.InterfaceC6084P
    public void f0(C6071C c6071c, long j10) {
        this.f57075a.f0(c6071c, j10);
    }

    @Override // q2.InterfaceC6084P
    public boolean g() {
        return this.f57075a.g();
    }

    @Override // q2.InterfaceC6084P
    public int g0() {
        return this.f57075a.g0();
    }

    @Override // q2.InterfaceC6084P
    public long getCurrentPosition() {
        return this.f57075a.getCurrentPosition();
    }

    @Override // q2.InterfaceC6084P
    public C6101p getDeviceInfo() {
        return this.f57075a.getDeviceInfo();
    }

    @Override // q2.InterfaceC6084P
    public long getDuration() {
        return this.f57075a.getDuration();
    }

    @Override // q2.InterfaceC6084P
    public Y h0() {
        return this.f57075a.h0();
    }

    @Override // q2.InterfaceC6084P
    public void i0() {
        this.f57075a.i0();
    }

    @Override // q2.InterfaceC6084P
    public boolean isPlaying() {
        return this.f57075a.isPlaying();
    }

    @Override // q2.InterfaceC6084P
    public d0 j0() {
        return this.f57075a.j0();
    }

    @Override // q2.InterfaceC6084P
    public boolean k(int i10) {
        return this.f57075a.k(i10);
    }

    @Override // q2.InterfaceC6084P
    public void k0() {
        this.f57075a.k0();
    }

    @Override // q2.InterfaceC6084P
    public boolean l() {
        return this.f57075a.l();
    }

    @Override // q2.InterfaceC6084P
    public void l0(TextureView textureView) {
        this.f57075a.l0(textureView);
    }

    @Override // q2.InterfaceC6084P
    public Looper m() {
        return this.f57075a.m();
    }

    @Override // q2.InterfaceC6084P
    public int m0() {
        return this.f57075a.m0();
    }

    @Override // q2.InterfaceC6084P
    public long n0() {
        return this.f57075a.n0();
    }

    @Override // q2.InterfaceC6084P
    public void o0(int i10, long j10) {
        this.f57075a.o0(i10, j10);
    }

    @Override // q2.InterfaceC6084P
    public int p() {
        return this.f57075a.p();
    }

    @Override // q2.InterfaceC6084P
    public InterfaceC6084P.b p0() {
        return this.f57075a.p0();
    }

    @Override // q2.InterfaceC6084P
    public void pause() {
        this.f57075a.pause();
    }

    @Override // q2.InterfaceC6084P
    public boolean q() {
        return this.f57075a.q();
    }

    @Override // q2.InterfaceC6084P
    public boolean q0() {
        return this.f57075a.q0();
    }

    @Override // q2.InterfaceC6084P
    public boolean r() {
        return this.f57075a.r();
    }

    @Override // q2.InterfaceC6084P
    public void r0(boolean z10) {
        this.f57075a.r0(z10);
    }

    @Override // q2.InterfaceC6084P
    public void s() {
        this.f57075a.s();
    }

    @Override // q2.InterfaceC6084P
    public long s0() {
        return this.f57075a.s0();
    }

    @Override // q2.InterfaceC6084P
    public void stop() {
        this.f57075a.stop();
    }

    @Override // q2.InterfaceC6084P
    public void t(float f10) {
        this.f57075a.t(f10);
    }

    @Override // q2.InterfaceC6084P
    public long t0() {
        return this.f57075a.t0();
    }

    @Override // q2.InterfaceC6084P
    public void u() {
        this.f57075a.u();
    }

    @Override // q2.InterfaceC6084P
    public int u0() {
        return this.f57075a.u0();
    }

    @Override // q2.InterfaceC6084P
    public void v(int i10) {
        this.f57075a.v(i10);
    }

    @Override // q2.InterfaceC6084P
    public void v0(TextureView textureView) {
        this.f57075a.v0(textureView);
    }

    @Override // q2.InterfaceC6084P
    public void w(float f10) {
        this.f57075a.w(f10);
    }

    @Override // q2.InterfaceC6084P
    public l0 w0() {
        return this.f57075a.w0();
    }

    @Override // q2.InterfaceC6084P
    public int x() {
        return this.f57075a.x();
    }

    @Override // q2.InterfaceC6084P
    public float x0() {
        return this.f57075a.x0();
    }

    @Override // q2.InterfaceC6084P
    public C6082N y() {
        return this.f57075a.y();
    }

    @Override // q2.InterfaceC6084P
    public C6088c y0() {
        return this.f57075a.y0();
    }

    @Override // q2.InterfaceC6084P
    public void z(long j10) {
        this.f57075a.z(j10);
    }

    @Override // q2.InterfaceC6084P
    public void z0(int i10, int i11) {
        this.f57075a.z0(i10, i11);
    }
}
