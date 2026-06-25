package q2;

import P9.AbstractC2011u;
import java.util.List;
import q2.Y;

/* JADX INFO: renamed from: q2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6093h implements InterfaceC6084P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Y.d f56876a = new Y.d();

    protected AbstractC6093h() {
    }

    private int b1() {
        int iX = x();
        if (iX == 1) {
            return 0;
        }
        return iX;
    }

    private void c1(int i10) {
        e1(-1, -9223372036854775807L, i10, false);
    }

    private void d1(int i10) {
        e1(K0(), -9223372036854775807L, i10, true);
    }

    private void f1(long j10, int i10) {
        e1(K0(), j10, i10, false);
    }

    private void g1(int i10, int i11) {
        e1(i10, -9223372036854775807L, i11, false);
    }

    private void h1(int i10) {
        int iZ0 = Z0();
        if (iZ0 == -1) {
            c1(i10);
        } else if (iZ0 == K0()) {
            d1(i10);
        } else {
            g1(iZ0, i10);
        }
    }

    private void i1(long j10, int i10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        f1(Math.max(currentPosition, 0L), i10);
    }

    private void j1(int i10) {
        int iA1 = a1();
        if (iA1 == -1) {
            c1(i10);
        } else if (iA1 == K0()) {
            d1(i10);
        } else {
            g1(iA1, i10);
        }
    }

    @Override // q2.InterfaceC6084P
    public final boolean A0() {
        return a1() != -1;
    }

    @Override // q2.InterfaceC6084P
    public final void C0(int i10, C6071C c6071c) {
        Q(i10, i10 + 1, AbstractC2011u.B(c6071c));
    }

    @Override // q2.InterfaceC6084P
    public final void E0(int i10) {
        g1(i10, 10);
    }

    @Override // q2.InterfaceC6084P
    public final void G() {
        T(0, Integer.MAX_VALUE);
    }

    @Override // q2.InterfaceC6084P
    public final int I() {
        long jI0 = I0();
        long duration = getDuration();
        if (jI0 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return t2.a0.r(t2.a0.f1(jI0, duration), 0, 100);
    }

    @Override // q2.InterfaceC6084P
    public final void J() {
        j1(6);
    }

    @Override // q2.InterfaceC6084P
    public final void K() {
        g1(K0(), 4);
    }

    @Override // q2.InterfaceC6084P
    public final void M0(int i10, int i11) {
        if (i10 != i11) {
            N0(i10, i10 + 1, i11);
        }
    }

    @Override // q2.InterfaceC6084P
    public final void O0(List list) {
        H0(Integer.MAX_VALUE, list);
    }

    @Override // q2.InterfaceC6084P
    public final void R(int i10) {
        T(i10, i10 + 1);
    }

    @Override // q2.InterfaceC6084P
    public final void T0() {
        i1(F0(), 12);
    }

    @Override // q2.InterfaceC6084P
    public final void U() {
        if (h0().u() || D()) {
            c1(7);
            return;
        }
        boolean zA0 = A0();
        if (Y0() && !r()) {
            if (zA0) {
                j1(7);
                return;
            } else {
                c1(7);
                return;
            }
        }
        if (!zA0 || getCurrentPosition() > s0()) {
            f1(0L, 7);
        } else {
            j1(7);
        }
    }

    @Override // q2.InterfaceC6084P
    public final void U0() {
        i1(-X0(), 11);
    }

    @Override // q2.InterfaceC6084P
    public final void W() {
        h1(8);
    }

    @Override // q2.InterfaceC6084P
    public final boolean Y0() {
        Y yH0 = h0();
        return !yH0.u() && yH0.r(K0(), this.f56876a).g();
    }

    @Override // q2.InterfaceC6084P
    public final boolean Z() {
        return Z0() != -1;
    }

    public final int Z0() {
        Y yH0 = h0();
        if (yH0.u()) {
            return -1;
        }
        return yH0.i(K0(), b1(), Q0());
    }

    public final int a1() {
        Y yH0 = h0();
        if (yH0.u()) {
            return -1;
        }
        return yH0.p(K0(), b1(), Q0());
    }

    @Override // q2.InterfaceC6084P
    public final C6071C b() {
        Y yH0 = h0();
        if (yH0.u()) {
            return null;
        }
        return yH0.r(K0(), this.f56876a).f56680c;
    }

    @Override // q2.InterfaceC6084P
    public final void d0(C6071C c6071c, boolean z10) {
        L(AbstractC2011u.B(c6071c), z10);
    }

    protected abstract void e1(int i10, long j10, int i11, boolean z10);

    @Override // q2.InterfaceC6084P
    public final void f0(C6071C c6071c, long j10) {
        D0(AbstractC2011u.B(c6071c), 0, j10);
    }

    @Override // q2.InterfaceC6084P
    public final boolean g() {
        return true;
    }

    @Override // q2.InterfaceC6084P
    public final void h(C6071C c6071c) {
        k1(AbstractC2011u.B(c6071c));
    }

    @Override // q2.InterfaceC6084P
    public final Object i() {
        Y yH0 = h0();
        if (yH0.u()) {
            return null;
        }
        return yH0.r(K0(), this.f56876a).f56681d;
    }

    @Override // q2.InterfaceC6084P
    public final boolean isPlaying() {
        return p() == 3 && q0() && g0() == 0;
    }

    @Override // q2.InterfaceC6084P
    public final boolean k(int i10) {
        return p0().c(i10);
    }

    @Override // q2.InterfaceC6084P
    public final void k0() {
        if (h0().u() || D()) {
            c1(9);
            return;
        }
        if (Z()) {
            h1(9);
        } else if (Y0() && l()) {
            g1(K0(), 9);
        } else {
            c1(9);
        }
    }

    public final void k1(List list) {
        L(list, true);
    }

    @Override // q2.InterfaceC6084P
    public final boolean l() {
        Y yH0 = h0();
        return !yH0.u() && yH0.r(K0(), this.f56876a).f56686i;
    }

    @Override // q2.InterfaceC6084P
    public final long n0() {
        Y yH0 = h0();
        if (yH0.u() || yH0.r(K0(), this.f56876a).f56683f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (this.f56876a.b() - this.f56876a.f56683f) - G0();
    }

    @Override // q2.InterfaceC6084P
    public final void o0(int i10, long j10) {
        e1(i10, j10, 10, false);
    }

    @Override // q2.InterfaceC6084P
    public final void pause() {
        V(false);
    }

    @Override // q2.InterfaceC6084P
    public final boolean r() {
        Y yH0 = h0();
        return !yH0.u() && yH0.r(K0(), this.f56876a).f56685h;
    }

    @Override // q2.InterfaceC6084P
    public final void t(float f10) {
        e(c().d(f10));
    }

    @Override // q2.InterfaceC6084P
    public final long t0() {
        Y yH0 = h0();
        if (yH0.u()) {
            return -9223372036854775807L;
        }
        return yH0.r(K0(), this.f56876a).e();
    }

    @Override // q2.InterfaceC6084P
    public final void u() {
        V(true);
    }

    @Override // q2.InterfaceC6084P
    public final void z(long j10) {
        f1(j10, 5);
    }
}
