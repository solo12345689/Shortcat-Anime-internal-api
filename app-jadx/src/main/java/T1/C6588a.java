package t1;

import m1.C5625d;
import t1.C6591d;
import t1.C6592e;

/* JADX INFO: renamed from: t1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6588a extends AbstractC6597j {

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private int f60271N0 = 0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private boolean f60272O0 = true;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f60273P0 = 0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    boolean f60274Q0 = false;

    @Override // t1.C6592e
    public void g(C5625d c5625d, boolean z10) {
        C6591d[] c6591dArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        C6591d[] c6591dArr2 = this.f60349W;
        c6591dArr2[0] = this.f60341O;
        c6591dArr2[2] = this.f60342P;
        c6591dArr2[1] = this.f60343Q;
        c6591dArr2[3] = this.f60344R;
        int i13 = 0;
        while (true) {
            c6591dArr = this.f60349W;
            if (i13 >= c6591dArr.length) {
                break;
            }
            C6591d c6591d = c6591dArr[i13];
            c6591d.f60305i = c5625d.q(c6591d);
            i13++;
        }
        int i14 = this.f60271N0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        C6591d c6591d2 = c6591dArr[i14];
        if (!this.f60274Q0) {
            p1();
        }
        if (this.f60274Q0) {
            this.f60274Q0 = false;
            int i15 = this.f60271N0;
            if (i15 == 0 || i15 == 1) {
                c5625d.f(this.f60341O.f60305i, this.f60364f0);
                c5625d.f(this.f60343Q.f60305i, this.f60364f0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    c5625d.f(this.f60342P.f60305i, this.f60366g0);
                    c5625d.f(this.f60344R.f60305i, this.f60366g0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f60494M0; i16++) {
            C6592e c6592e = this.f60493L0[i16];
            if ((this.f60272O0 || c6592e.h()) && ((((i11 = this.f60271N0) == 0 || i11 == 1) && c6592e.A() == C6592e.b.MATCH_CONSTRAINT && c6592e.f60341O.f60302f != null && c6592e.f60343Q.f60302f != null) || (((i12 = this.f60271N0) == 2 || i12 == 3) && c6592e.S() == C6592e.b.MATCH_CONSTRAINT && c6592e.f60342P.f60302f != null && c6592e.f60344R.f60302f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.f60341O.l() || this.f60343Q.l();
        boolean z13 = this.f60342P.l() || this.f60344R.l();
        int i17 = !(!z11 && (((i10 = this.f60271N0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.f60494M0; i18++) {
            C6592e c6592e2 = this.f60493L0[i18];
            if (this.f60272O0 || c6592e2.h()) {
                m1.i iVarQ = c5625d.q(c6592e2.f60349W[this.f60271N0]);
                C6591d[] c6591dArr3 = c6592e2.f60349W;
                int i19 = this.f60271N0;
                C6591d c6591d3 = c6591dArr3[i19];
                c6591d3.f60305i = iVarQ;
                C6591d c6591d4 = c6591d3.f60302f;
                int i20 = (c6591d4 == null || c6591d4.f60300d != this) ? 0 : c6591d3.f60303g;
                if (i19 == 0 || i19 == 2) {
                    c5625d.i(c6591d2.f60305i, iVarQ, this.f60273P0 - i20, z11);
                } else {
                    c5625d.g(c6591d2.f60305i, iVarQ, this.f60273P0 + i20, z11);
                }
                c5625d.e(c6591d2.f60305i, iVarQ, this.f60273P0 + i20, i17);
            }
        }
        int i21 = this.f60271N0;
        if (i21 == 0) {
            c5625d.e(this.f60343Q.f60305i, this.f60341O.f60305i, 0, 8);
            c5625d.e(this.f60341O.f60305i, this.f60354a0.f60343Q.f60305i, 0, 4);
            c5625d.e(this.f60341O.f60305i, this.f60354a0.f60341O.f60305i, 0, 0);
            return;
        }
        if (i21 == 1) {
            c5625d.e(this.f60341O.f60305i, this.f60343Q.f60305i, 0, 8);
            c5625d.e(this.f60341O.f60305i, this.f60354a0.f60341O.f60305i, 0, 4);
            c5625d.e(this.f60341O.f60305i, this.f60354a0.f60343Q.f60305i, 0, 0);
        } else if (i21 == 2) {
            c5625d.e(this.f60344R.f60305i, this.f60342P.f60305i, 0, 8);
            c5625d.e(this.f60342P.f60305i, this.f60354a0.f60344R.f60305i, 0, 4);
            c5625d.e(this.f60342P.f60305i, this.f60354a0.f60342P.f60305i, 0, 0);
        } else if (i21 == 3) {
            c5625d.e(this.f60342P.f60305i, this.f60344R.f60305i, 0, 8);
            c5625d.e(this.f60342P.f60305i, this.f60354a0.f60342P.f60305i, 0, 4);
            c5625d.e(this.f60342P.f60305i, this.f60354a0.f60344R.f60305i, 0, 0);
        }
    }

    @Override // t1.C6592e
    public boolean h() {
        return true;
    }

    @Override // t1.C6592e
    public boolean m0() {
        return this.f60274Q0;
    }

    @Override // t1.C6592e
    public boolean n0() {
        return this.f60274Q0;
    }

    public boolean p1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f60494M0;
            if (i13 >= i10) {
                break;
            }
            C6592e c6592e = this.f60493L0[i13];
            if ((this.f60272O0 || c6592e.h()) && ((((i11 = this.f60271N0) == 0 || i11 == 1) && !c6592e.m0()) || (((i12 = this.f60271N0) == 2 || i12 == 3) && !c6592e.n0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f60494M0; i14++) {
            C6592e c6592e2 = this.f60493L0[i14];
            if (this.f60272O0 || c6592e2.h()) {
                if (!z11) {
                    int i15 = this.f60271N0;
                    if (i15 == 0) {
                        iMax = c6592e2.o(C6591d.a.LEFT).e();
                    } else if (i15 == 1) {
                        iMax = c6592e2.o(C6591d.a.RIGHT).e();
                    } else if (i15 == 2) {
                        iMax = c6592e2.o(C6591d.a.TOP).e();
                    } else if (i15 == 3) {
                        iMax = c6592e2.o(C6591d.a.BOTTOM).e();
                    }
                    z11 = true;
                }
                int i16 = this.f60271N0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, c6592e2.o(C6591d.a.LEFT).e());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, c6592e2.o(C6591d.a.RIGHT).e());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, c6592e2.o(C6591d.a.TOP).e());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, c6592e2.o(C6591d.a.BOTTOM).e());
                }
            }
        }
        int i17 = iMax + this.f60273P0;
        int i18 = this.f60271N0;
        if (i18 == 0 || i18 == 1) {
            B0(i17, i17);
        } else {
            E0(i17, i17);
        }
        this.f60274Q0 = true;
        return true;
    }

    public boolean q1() {
        return this.f60272O0;
    }

    public int r1() {
        return this.f60271N0;
    }

    public int s1() {
        return this.f60273P0;
    }

    public int t1() {
        int i10 = this.f60271N0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // t1.C6592e
    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i10 = 0; i10 < this.f60494M0; i10++) {
            C6592e c6592e = this.f60493L0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + c6592e.t();
        }
        return str + "}";
    }

    protected void u1() {
        for (int i10 = 0; i10 < this.f60494M0; i10++) {
            C6592e c6592e = this.f60493L0[i10];
            if (this.f60272O0 || c6592e.h()) {
                int i11 = this.f60271N0;
                if (i11 == 0 || i11 == 1) {
                    c6592e.O0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    c6592e.O0(1, true);
                }
            }
        }
    }

    public void v1(boolean z10) {
        this.f60272O0 = z10;
    }

    public void w1(int i10) {
        this.f60271N0 = i10;
    }

    public void x1(int i10) {
        this.f60273P0 = i10;
    }
}
