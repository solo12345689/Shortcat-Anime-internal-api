package E3;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import q2.AbstractC6110y;
import q2.C6071C;
import q2.C6077I;
import q2.C6082N;
import q2.C6083O;
import q2.C6088c;
import q2.C6101p;
import q2.InterfaceC6084P;
import q2.Y;
import s2.C6407e;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class N6 extends AbstractC6110y {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends q2.Y {

        /* JADX INFO: renamed from: k */
        private static final Object f4744k = new Object();

        /* JADX INFO: renamed from: e */
        private final C6071C f4745e;

        /* JADX INFO: renamed from: f */
        private final boolean f4746f;

        /* JADX INFO: renamed from: g */
        private final boolean f4747g;

        /* JADX INFO: renamed from: h */
        private final boolean f4748h;

        /* JADX INFO: renamed from: i */
        private final C6071C.g f4749i;

        /* JADX INFO: renamed from: j */
        private final long f4750j;

        public a(N6 n62) {
            this.f4745e = n62.b();
            this.f4746f = n62.r();
            this.f4747g = n62.l();
            this.f4748h = !n62.h0().u() && n62.h0().r(n62.K0(), new Y.d()).f56688k;
            this.f4749i = n62.Y0() ? C6071C.g.f56405f : null;
            this.f4750j = t2.a0.V0(n62.t0());
        }

        @Override // q2.Y
        public int f(Object obj) {
            return f4744k.equals(obj) ? 0 : -1;
        }

        @Override // q2.Y
        public Y.b k(int i10, Y.b bVar, boolean z10) {
            Object obj = f4744k;
            bVar.t(obj, obj, 0, this.f4750j, 0L);
            bVar.f56656f = this.f4748h;
            return bVar;
        }

        @Override // q2.Y
        public int m() {
            return 1;
        }

        @Override // q2.Y
        public Object q(int i10) {
            return f4744k;
        }

        @Override // q2.Y
        public Y.d s(int i10, Y.d dVar, long j10) {
            dVar.h(f4744k, this.f4745e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f4746f, this.f4747g, this.f4749i, 0L, this.f4750j, 0, 0, 0L);
            dVar.f56688k = this.f4748h;
            return dVar;
        }

        @Override // q2.Y
        public int t() {
            return 1;
        }
    }

    public N6(InterfaceC6084P interfaceC6084P) {
        super(interfaceC6084P);
    }

    private void s1() {
        AbstractC6614a.g(Looper.myLooper() == m());
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean A0() {
        s1();
        return super.A0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void B(Surface surface) {
        s1();
        super.B(surface);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public int B0() {
        s1();
        return super.B0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void C(C6077I c6077i) {
        s1();
        super.C(c6077i);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void C0(int i10, C6071C c6071c) {
        s1();
        super.C0(i10, c6071c);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean D() {
        s1();
        return super.D();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void D0(List list, int i10, long j10) {
        s1();
        super.D0(list, i10, j10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long E() {
        s1();
        return super.E();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void E0(int i10) {
        s1();
        super.E0(i10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void F(boolean z10, int i10) {
        s1();
        super.F(z10, i10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long F0() {
        s1();
        return super.F0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void G() {
        s1();
        super.G();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long G0() {
        s1();
        return super.G0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void H(InterfaceC6084P.d dVar) {
        s1();
        super.H(dVar);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void H0(int i10, List list) {
        s1();
        super.H0(i10, list);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public int I() {
        s1();
        return super.I();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long I0() {
        s1();
        return super.I0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void J() {
        s1();
        super.J();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public C6077I J0() {
        s1();
        return super.J0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void K() {
        s1();
        super.K();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public int K0() {
        s1();
        return super.K0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void L(List list, boolean z10) {
        s1();
        super.L(list, z10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void L0(SurfaceView surfaceView) {
        s1();
        super.L0(surfaceView);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void M() {
        s1();
        super.M();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void M0(int i10, int i11) {
        s1();
        super.M0(i10, i11);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void N(int i10) {
        s1();
        super.N(i10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void N0(int i10, int i11, int i12) {
        s1();
        super.N0(i10, i11, i12);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void O(SurfaceView surfaceView) {
        s1();
        super.O(surfaceView);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void O0(List list) {
        s1();
        super.O0(list);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void P(q2.d0 d0Var) {
        s1();
        super.P(d0Var);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean P0() {
        s1();
        return super.P0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void Q(int i10, int i11, List list) {
        s1();
        super.Q(i10, i11, list);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean Q0() {
        s1();
        return super.Q0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void R(int i10) {
        s1();
        super.R(i10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long R0() {
        s1();
        return super.R0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void S0(int i10) {
        s1();
        super.S0(i10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void T(int i10, int i11) {
        s1();
        super.T(i10, i11);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void T0() {
        s1();
        super.T0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void U() {
        s1();
        super.U();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void U0() {
        s1();
        super.U0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void V(boolean z10) {
        s1();
        super.V(z10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public C6077I V0() {
        s1();
        return super.V0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void W() {
        s1();
        super.W();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void X(int i10) {
        s1();
        super.X(i10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long X0() {
        s1();
        return super.X0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public q2.h0 Y() {
        s1();
        return super.Y();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean Y0() {
        s1();
        return super.Y0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean Z() {
        s1();
        return super.Z();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void a0(InterfaceC6084P.d dVar) {
        s1();
        super.a0(dVar);
    }

    public M6 a1() {
        return new M6(y(), 0, c1(), b1(), b1(), 0, c(), x(), Q0(), w0(), g1(), 0, l1(), m1(), d1(), e1(), getDeviceInfo(), i1(), o1(), q0(), 1, g0(), p(), isPlaying(), q(), k1(), X0(), F0(), s0(), h1(), j0());
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public C6071C b() {
        s1();
        return super.b();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public C6407e b0() {
        s1();
        return super.b0();
    }

    public InterfaceC6084P.e b1() {
        boolean zK = k(16);
        boolean zK2 = k(17);
        return new InterfaceC6084P.e(null, zK2 ? K0() : 0, zK ? b() : null, null, zK2 ? u0() : 0, zK ? getCurrentPosition() : 0L, zK ? G0() : 0L, zK ? c0() : -1, zK ? B0() : -1);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public C6083O c() {
        s1();
        return super.c();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public int c0() {
        s1();
        return super.c0();
    }

    public W6 c1() {
        boolean zK = k(16);
        return new W6(b1(), zK && D(), SystemClock.elapsedRealtime(), zK ? getDuration() : -9223372036854775807L, zK ? I0() : 0L, zK ? I() : 0, zK ? E() : 0L, zK ? n0() : -9223372036854775807L, zK ? t0() : -9223372036854775807L, zK ? R0() : 0L);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void d0(C6071C c6071c, boolean z10) {
        s1();
        super.d0(c6071c, z10);
    }

    public C6088c d1() {
        return k(21) ? y0() : C6088c.f56745h;
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void e(C6083O c6083o) {
        s1();
        super.e(c6083o);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void e0(boolean z10) {
        s1();
        super.e0(z10);
    }

    public C6407e e1() {
        return k(28) ? b0() : C6407e.f59083d;
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void f0(C6071C c6071c, long j10) {
        s1();
        super.f0(c6071c, j10);
    }

    public C6071C f1() {
        if (k(16)) {
            return b();
        }
        return null;
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public int g0() {
        s1();
        return super.g0();
    }

    public q2.Y g1() {
        return k(17) ? h0() : k(16) ? h0().u() ? q2.Y.f56642a : new a(this) : q2.Y.f56642a;
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long getCurrentPosition() {
        s1();
        return super.getCurrentPosition();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public C6101p getDeviceInfo() {
        s1();
        return super.getDeviceInfo();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long getDuration() {
        s1();
        return super.getDuration();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public q2.Y h0() {
        s1();
        return super.h0();
    }

    public q2.h0 h1() {
        return k(30) ? Y() : q2.h0.f56877b;
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void i0() {
        s1();
        super.i0();
    }

    public int i1() {
        if (k(23)) {
            return m0();
        }
        return 0;
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean isPlaying() {
        s1();
        return super.isPlaying();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public q2.d0 j0() {
        s1();
        return super.j0();
    }

    public long j1() {
        if (k(16)) {
            return getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean k(int i10) {
        s1();
        return super.k(i10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void k0() {
        s1();
        super.k0();
    }

    public C6077I k1() {
        return k(18) ? V0() : C6077I.f56472K;
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean l() {
        s1();
        return super.l();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void l0(TextureView textureView) {
        s1();
        super.l0(textureView);
    }

    public C6077I l1() {
        return k(18) ? J0() : C6077I.f56472K;
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public int m0() {
        s1();
        return super.m0();
    }

    public float m1() {
        if (k(22)) {
            return x0();
        }
        return 1.0f;
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long n0() {
        s1();
        return super.n0();
    }

    public boolean n1() {
        return k(16) && Y0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void o0(int i10, long j10) {
        s1();
        super.o0(i10, j10);
    }

    public boolean o1() {
        return k(23) && P0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public int p() {
        s1();
        return super.p();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public InterfaceC6084P.b p0() {
        s1();
        return super.p0();
    }

    public void p1() {
        if (k(1)) {
            u();
        }
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void pause() {
        s1();
        super.pause();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean q() {
        s1();
        return super.q();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean q0() {
        s1();
        return super.q0();
    }

    public void q1() {
        if (k(2)) {
            s();
        }
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public boolean r() {
        s1();
        return super.r();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void r0(boolean z10) {
        s1();
        super.r0(z10);
    }

    public void r1() {
        if (k(4)) {
            K();
        }
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void s() {
        s1();
        super.s();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long s0() {
        s1();
        return super.s0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void stop() {
        s1();
        super.stop();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void t(float f10) {
        s1();
        super.t(f10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public long t0() {
        s1();
        return super.t0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void u() {
        s1();
        super.u();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public int u0() {
        s1();
        return super.u0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void v(int i10) {
        s1();
        super.v(i10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void v0(TextureView textureView) {
        s1();
        super.v0(textureView);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void w(float f10) {
        s1();
        super.w(f10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public q2.l0 w0() {
        s1();
        return super.w0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public int x() {
        s1();
        return super.x();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public float x0() {
        s1();
        return super.x0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public C6082N y() {
        s1();
        return super.y();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public C6088c y0() {
        s1();
        return super.y0();
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void z(long j10) {
        s1();
        super.z(j10);
    }

    @Override // q2.AbstractC6110y, q2.InterfaceC6084P
    public void z0(int i10, int i11) {
        s1();
        super.z0(i10, i11);
    }
}
