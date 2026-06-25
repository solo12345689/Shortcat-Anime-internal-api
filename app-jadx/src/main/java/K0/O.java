package K0;

import K0.J;
import i1.C5009b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a */
    private final J f10497a;

    /* JADX INFO: renamed from: b */
    private boolean f10498b;

    /* JADX INFO: renamed from: c */
    private boolean f10499c;

    /* JADX INFO: renamed from: e */
    private boolean f10501e;

    /* JADX INFO: renamed from: f */
    private boolean f10502f;

    /* JADX INFO: renamed from: g */
    private boolean f10503g;

    /* JADX INFO: renamed from: h */
    private int f10504h;

    /* JADX INFO: renamed from: i */
    private int f10505i;

    /* JADX INFO: renamed from: j */
    private boolean f10506j;

    /* JADX INFO: renamed from: k */
    private boolean f10507k;

    /* JADX INFO: renamed from: l */
    private int f10508l;

    /* JADX INFO: renamed from: m */
    private boolean f10509m;

    /* JADX INFO: renamed from: n */
    private boolean f10510n;

    /* JADX INFO: renamed from: o */
    private int f10511o;

    /* JADX INFO: renamed from: q */
    private V f10513q;

    /* JADX INFO: renamed from: d */
    private J.e f10500d = J.e.f10480e;

    /* JADX INFO: renamed from: p */
    private final X f10512p = new X(this);

    public O(J j10) {
        this.f10497a = j10;
    }

    public final int A() {
        return this.f10512p.W0();
    }

    public final void B() {
        this.f10512p.W1();
        V v10 = this.f10513q;
        if (v10 != null) {
            v10.U1();
        }
    }

    public final void C() {
        this.f10512p.n2(true);
        V v10 = this.f10513q;
        if (v10 != null) {
            v10.i2(true);
        }
    }

    public final void D() {
        this.f10512p.Z1();
    }

    public final void E() {
        this.f10502f = true;
        this.f10503g = true;
    }

    public final void F() {
        this.f10501e = true;
    }

    public final void G() {
        this.f10512p.a2();
    }

    public final void H() {
        J.e eVarF0 = this.f10497a.f0();
        if (eVarF0 == J.e.f10478c || eVarF0 == J.e.f10479d) {
            if (this.f10512p.K1()) {
                O(true);
            } else {
                N(true);
            }
        }
        if (eVarF0 == J.e.f10479d) {
            V v10 = this.f10513q;
            if (v10 == null || !v10.J1()) {
                S(true);
            } else {
                T(true);
            }
        }
    }

    public final void I() {
        this.f10513q = null;
        this.f10502f = false;
        this.f10501e = false;
    }

    public final void J(long j10) {
        V v10 = this.f10513q;
        if (v10 != null) {
            v10.e2(j10);
        }
    }

    public final void K() {
        AbstractC1776a abstractC1776aZ;
        this.f10512p.z().p();
        V v10 = this.f10513q;
        if (v10 == null || (abstractC1776aZ = v10.z()) == null) {
            return;
        }
        abstractC1776aZ.p();
    }

    public final void L(int i10) {
        int i11 = this.f10508l;
        this.f10508l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            J jA0 = this.f10497a.A0();
            O oD0 = jA0 != null ? jA0.d0() : null;
            if (oD0 != null) {
                if (i10 == 0) {
                    oD0.L(oD0.f10508l - 1);
                } else {
                    oD0.L(oD0.f10508l + 1);
                }
            }
        }
    }

    public final void M(int i10) {
        int i11 = this.f10511o;
        this.f10511o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            J jA0 = this.f10497a.A0();
            O oD0 = jA0 != null ? jA0.d0() : null;
            if (oD0 != null) {
                if (i10 == 0) {
                    oD0.M(oD0.f10511o - 1);
                } else {
                    oD0.M(oD0.f10511o + 1);
                }
            }
        }
    }

    public final void N(boolean z10) {
        if (this.f10507k != z10) {
            this.f10507k = z10;
            if (z10 && !this.f10506j) {
                L(this.f10508l + 1);
            } else {
                if (z10 || this.f10506j) {
                    return;
                }
                L(this.f10508l - 1);
            }
        }
    }

    public final void O(boolean z10) {
        if (this.f10506j != z10) {
            this.f10506j = z10;
            if (z10 && !this.f10507k) {
                L(this.f10508l + 1);
            } else {
                if (z10 || this.f10507k) {
                    return;
                }
                L(this.f10508l - 1);
            }
        }
    }

    public final void P(boolean z10) {
        this.f10498b = z10;
    }

    public final void Q(boolean z10) {
        this.f10499c = z10;
    }

    public final void R(J.e eVar) {
        this.f10500d = eVar;
    }

    public final void S(boolean z10) {
        if (this.f10510n != z10) {
            this.f10510n = z10;
            if (z10 && !this.f10509m) {
                M(this.f10511o + 1);
            } else {
                if (z10 || this.f10509m) {
                    return;
                }
                M(this.f10511o - 1);
            }
        }
    }

    public final void T(boolean z10) {
        if (this.f10509m != z10) {
            this.f10509m = z10;
            if (z10 && !this.f10510n) {
                M(this.f10511o + 1);
            } else {
                if (z10 || this.f10510n) {
                    return;
                }
                M(this.f10511o - 1);
            }
        }
    }

    public final void U(boolean z10) {
        this.f10502f = z10;
    }

    public final void V(boolean z10) {
        this.f10503g = z10;
    }

    public final void W(boolean z10) {
        this.f10501e = z10;
    }

    public final void X(int i10) {
        this.f10504h = i10;
    }

    public final void Y(int i10) {
        this.f10505i = i10;
    }

    public final void Z() {
        J jA0;
        if (this.f10512p.t2() && (jA0 = this.f10497a.A0()) != null) {
            J.I1(jA0, false, false, false, 7, null);
        }
        V v10 = this.f10513q;
        if (v10 == null || !v10.r2()) {
            return;
        }
        if (P.a(this.f10497a)) {
            J jA02 = this.f10497a.A0();
            if (jA02 != null) {
                J.I1(jA02, false, false, false, 7, null);
                return;
            }
            return;
        }
        J jA03 = this.f10497a.A0();
        if (jA03 != null) {
            J.E1(jA03, false, false, false, 7, null);
        }
    }

    public final void a() {
        if (this.f10513q == null) {
            this.f10513q = new V(this);
        }
    }

    public final InterfaceC1778b b() {
        return this.f10512p;
    }

    public final int c() {
        return this.f10508l;
    }

    public final int d() {
        return this.f10511o;
    }

    public final boolean e() {
        return this.f10507k;
    }

    public final boolean f() {
        return this.f10506j;
    }

    public final boolean g() {
        return this.f10498b;
    }

    public final boolean h() {
        return this.f10499c;
    }

    public final int i() {
        return this.f10512p.P0();
    }

    public final C5009b j() {
        return this.f10512p.J1();
    }

    public final C5009b k() {
        V v10 = this.f10513q;
        if (v10 != null) {
            return v10.I1();
        }
        return null;
    }

    public final J l() {
        return this.f10497a;
    }

    public final boolean m() {
        return this.f10512p.M1();
    }

    public final J.e n() {
        return this.f10500d;
    }

    public final InterfaceC1778b o() {
        return this.f10513q;
    }

    public final boolean p() {
        return this.f10510n;
    }

    public final boolean q() {
        return this.f10509m;
    }

    public final boolean r() {
        return this.f10502f;
    }

    public final boolean s() {
        return this.f10503g;
    }

    public final boolean t() {
        return this.f10501e;
    }

    public final V u() {
        return this.f10513q;
    }

    public final X v() {
        return this.f10512p;
    }

    public final boolean w() {
        return this.f10512p.P1();
    }

    public final int x() {
        return this.f10504h;
    }

    public final int y() {
        return this.f10505i;
    }

    public final AbstractC1785e0 z() {
        return this.f10497a.t0().o();
    }
}
