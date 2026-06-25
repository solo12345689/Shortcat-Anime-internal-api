package t1;

import m1.C5625d;
import t1.C6591d;
import t1.C6592e;

/* JADX INFO: renamed from: t1.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6595h extends C6592e {

    /* JADX INFO: renamed from: L0 */
    protected float f60484L0 = -1.0f;

    /* JADX INFO: renamed from: M0 */
    protected int f60485M0 = -1;

    /* JADX INFO: renamed from: N0 */
    protected int f60486N0 = -1;

    /* JADX INFO: renamed from: O0 */
    protected boolean f60487O0 = true;

    /* JADX INFO: renamed from: P0 */
    private C6591d f60488P0 = this.f60342P;

    /* JADX INFO: renamed from: Q0 */
    private int f60489Q0 = 0;

    /* JADX INFO: renamed from: R0 */
    private int f60490R0 = 0;

    /* JADX INFO: renamed from: S0 */
    private boolean f60491S0;

    /* JADX INFO: renamed from: t1.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f60492a;

        static {
            int[] iArr = new int[C6591d.a.values().length];
            f60492a = iArr;
            try {
                iArr[C6591d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60492a[C6591d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60492a[C6591d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60492a[C6591d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60492a[C6591d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60492a[C6591d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60492a[C6591d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60492a[C6591d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60492a[C6591d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C6595h() {
        this.f60350X.clear();
        this.f60350X.add(this.f60488P0);
        int length = this.f60349W.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f60349W[i10] = this.f60488P0;
        }
    }

    @Override // t1.C6592e
    public void g(C5625d c5625d, boolean z10) {
        C6593f c6593f = (C6593f) L();
        if (c6593f == null) {
            return;
        }
        C6591d c6591dO = c6593f.o(C6591d.a.LEFT);
        C6591d c6591dO2 = c6593f.o(C6591d.a.RIGHT);
        C6592e c6592e = this.f60354a0;
        boolean z11 = c6592e != null && c6592e.f60352Z[0] == C6592e.b.WRAP_CONTENT;
        if (this.f60489Q0 == 0) {
            c6591dO = c6593f.o(C6591d.a.TOP);
            c6591dO2 = c6593f.o(C6591d.a.BOTTOM);
            C6592e c6592e2 = this.f60354a0;
            z11 = c6592e2 != null && c6592e2.f60352Z[1] == C6592e.b.WRAP_CONTENT;
        }
        if (this.f60491S0 && this.f60488P0.n()) {
            m1.i iVarQ = c5625d.q(this.f60488P0);
            c5625d.f(iVarQ, this.f60488P0.e());
            if (this.f60485M0 != -1) {
                if (z11) {
                    c5625d.h(c5625d.q(c6591dO2), iVarQ, 0, 5);
                }
            } else if (this.f60486N0 != -1 && z11) {
                m1.i iVarQ2 = c5625d.q(c6591dO2);
                c5625d.h(iVarQ, c5625d.q(c6591dO), 0, 5);
                c5625d.h(iVarQ2, iVarQ, 0, 5);
            }
            this.f60491S0 = false;
            return;
        }
        if (this.f60485M0 != -1) {
            m1.i iVarQ3 = c5625d.q(this.f60488P0);
            c5625d.e(iVarQ3, c5625d.q(c6591dO), this.f60485M0, 8);
            if (z11) {
                c5625d.h(c5625d.q(c6591dO2), iVarQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.f60486N0 == -1) {
            if (this.f60484L0 != -1.0f) {
                c5625d.d(C5625d.s(c5625d, c5625d.q(this.f60488P0), c5625d.q(c6591dO2), this.f60484L0));
                return;
            }
            return;
        }
        m1.i iVarQ4 = c5625d.q(this.f60488P0);
        m1.i iVarQ5 = c5625d.q(c6591dO2);
        c5625d.e(iVarQ4, iVarQ5, -this.f60486N0, 8);
        if (z11) {
            c5625d.h(iVarQ4, c5625d.q(c6591dO), 0, 5);
            c5625d.h(iVarQ5, iVarQ4, 0, 5);
        }
    }

    @Override // t1.C6592e
    public boolean h() {
        return true;
    }

    @Override // t1.C6592e
    public boolean m0() {
        return this.f60491S0;
    }

    @Override // t1.C6592e
    public void m1(C5625d c5625d, boolean z10) {
        if (L() == null) {
            return;
        }
        int iX = c5625d.x(this.f60488P0);
        if (this.f60489Q0 == 1) {
            i1(iX);
            j1(0);
            H0(L().x());
            g1(0);
            return;
        }
        i1(0);
        j1(iX);
        g1(L().V());
        H0(0);
    }

    @Override // t1.C6592e
    public boolean n0() {
        return this.f60491S0;
    }

    public C6591d n1() {
        return this.f60488P0;
    }

    @Override // t1.C6592e
    public C6591d o(C6591d.a aVar) {
        int i10 = a.f60492a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f60489Q0 == 1) {
                return this.f60488P0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f60489Q0 == 0) {
            return this.f60488P0;
        }
        return null;
    }

    public int o1() {
        return this.f60489Q0;
    }

    public int p1() {
        return this.f60485M0;
    }

    public int q1() {
        return this.f60486N0;
    }

    public float r1() {
        return this.f60484L0;
    }

    public void s1(int i10) {
        this.f60488P0.t(i10);
        this.f60491S0 = true;
    }

    public void t1(int i10) {
        if (i10 > -1) {
            this.f60484L0 = -1.0f;
            this.f60485M0 = i10;
            this.f60486N0 = -1;
        }
    }

    public void u1(int i10) {
        if (i10 > -1) {
            this.f60484L0 = -1.0f;
            this.f60485M0 = -1;
            this.f60486N0 = i10;
        }
    }

    public void v1(float f10) {
        if (f10 > -1.0f) {
            this.f60484L0 = f10;
            this.f60485M0 = -1;
            this.f60486N0 = -1;
        }
    }

    public void w1(int i10) {
        if (this.f60489Q0 == i10) {
            return;
        }
        this.f60489Q0 = i10;
        this.f60350X.clear();
        if (this.f60489Q0 == 1) {
            this.f60488P0 = this.f60341O;
        } else {
            this.f60488P0 = this.f60342P;
        }
        this.f60350X.add(this.f60488P0);
        int length = this.f60349W.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f60349W[i11] = this.f60488P0;
        }
    }
}
