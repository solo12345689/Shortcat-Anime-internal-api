package androidx.media3.exoplayer;

import M2.D;
import java.util.Objects;
import q2.C6109x;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N0 f30461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N0 f30463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30464d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f30465e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30466f = false;

    public P0(N0 n02, N0 n03, int i10) {
        this.f30461a = n02;
        this.f30462b = i10;
        this.f30463c = n03;
    }

    private boolean A() {
        return this.f30464d == 3;
    }

    private void C(N0 n02, M2.c0 c0Var, C2892k c2892k, long j10, boolean z10) {
        if (z(n02)) {
            if (c0Var != n02.M()) {
                d(n02, c2892k);
            } else if (z10) {
                n02.O(j10);
            }
        }
    }

    private void E(boolean z10) {
        if (z10) {
            if (this.f30465e) {
                this.f30461a.reset();
                this.f30465e = false;
                return;
            }
            return;
        }
        if (this.f30466f) {
            ((N0) AbstractC6614a.e(this.f30463c)).reset();
            this.f30466f = false;
        }
    }

    private int K(N0 n02, C2906r0 c2906r0, P2.H h10, C2892k c2892k) {
        if (n02 == null || !z(n02) || ((n02 == this.f30461a && w()) || (n02 == this.f30463c && A()))) {
            return 1;
        }
        M2.c0 c0VarM = n02.M();
        M2.c0[] c0VarArr = c2906r0.f31197c;
        int i10 = this.f30462b;
        boolean z10 = c0VarM != c0VarArr[i10];
        boolean zC = h10.c(i10);
        if (zC && !z10) {
            return 1;
        }
        if (!n02.A()) {
            n02.p(i(h10.f13278c[this.f30462b]), (M2.c0) AbstractC6614a.e(c2906r0.f31197c[this.f30462b]), c2906r0.n(), c2906r0.m(), c2906r0.f31202h.f31219a);
            return 3;
        }
        if (!n02.d()) {
            return 0;
        }
        d(n02, c2892k);
        if (!zC || u()) {
            E(n02 == this.f30461a);
        }
        return 1;
    }

    private void P(N0 n02, long j10) {
        n02.n();
        if (n02 instanceof O2.i) {
            ((O2.i) n02).H0(j10);
        }
    }

    private void Z(boolean z10) {
        if (z10) {
            ((N0) AbstractC6614a.e(this.f30463c)).v(17, this.f30461a);
        } else {
            this.f30461a.v(17, AbstractC6614a.e(this.f30463c));
        }
    }

    private void d(N0 n02, C2892k c2892k) {
        AbstractC6614a.g(this.f30461a == n02 || this.f30463c == n02);
        if (z(n02)) {
            c2892k.a(n02);
            g(n02);
            n02.disable();
        }
    }

    private void g(N0 n02) {
        if (n02.getState() == 2) {
            n02.stop();
        }
    }

    private static C6109x[] i(P2.A a10) {
        int length = a10 != null ? a10.length() : 0;
        C6109x[] c6109xArr = new C6109x[length];
        for (int i10 = 0; i10 < length; i10++) {
            c6109xArr[i10] = ((P2.A) AbstractC6614a.e(a10)).d(i10);
        }
        return c6109xArr;
    }

    private N0 l(C2906r0 c2906r0) {
        if (c2906r0 != null && c2906r0.f31197c[this.f30462b] != null) {
            if (this.f30461a.M() == c2906r0.f31197c[this.f30462b]) {
                return this.f30461a;
            }
            N0 n02 = this.f30463c;
            if (n02 != null && n02.M() == c2906r0.f31197c[this.f30462b]) {
                return this.f30463c;
            }
        }
        return null;
    }

    private boolean p(C2906r0 c2906r0, N0 n02) {
        if (n02 == null) {
            return true;
        }
        M2.c0 c0Var = c2906r0.f31197c[this.f30462b];
        if (n02.M() == null || (n02.M() == c0Var && (c0Var == null || n02.i() || q(n02, c2906r0)))) {
            return true;
        }
        C2906r0 c2906r0K = c2906r0.k();
        return c2906r0K != null && c2906r0K.f31197c[this.f30462b] == n02.M();
    }

    private boolean q(N0 n02, C2906r0 c2906r0) {
        C2906r0 c2906r0K = c2906r0.k();
        if (c2906r0.f31202h.f31225g && c2906r0K != null && c2906r0K.f31200f) {
            return (n02 instanceof O2.i) || (n02 instanceof K2.c) || n02.N() >= c2906r0K.n();
        }
        return false;
    }

    private boolean w() {
        int i10 = this.f30464d;
        return i10 == 2 || i10 == 4;
    }

    private static boolean z(N0 n02) {
        return n02.getState() != 0;
    }

    public void B(M2.c0 c0Var, C2892k c2892k, long j10, boolean z10) {
        C(this.f30461a, c0Var, c2892k, j10, z10);
        N0 n02 = this.f30463c;
        if (n02 != null) {
            C(n02, c0Var, c2892k, j10, z10);
        }
    }

    public void D() {
        int i10 = this.f30464d;
        if (i10 == 3 || i10 == 4) {
            Z(i10 == 4);
            this.f30464d = this.f30464d != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.f30464d = 0;
        }
    }

    public void F(P2.H h10, P2.H h11, long j10) {
        int i10;
        boolean zC = h10.c(this.f30462b);
        boolean zC2 = h11.c(this.f30462b);
        N0 n02 = (this.f30463c == null || (i10 = this.f30464d) == 3 || (i10 == 0 && z(this.f30461a))) ? this.f30461a : (N0) AbstractC6614a.e(this.f30463c);
        if (!zC || n02.A()) {
            return;
        }
        boolean z10 = m() == -2;
        A2.N[] nArr = h10.f13277b;
        int i11 = this.f30462b;
        A2.N n10 = nArr[i11];
        A2.N n11 = h11.f13277b[i11];
        if (!zC2 || !Objects.equals(n11, n10) || z10 || u()) {
            P(n02, j10);
        }
    }

    public void G(C2906r0 c2906r0) {
        ((N0) AbstractC6614a.e(l(c2906r0))).x();
    }

    public void H() {
        this.f30461a.a();
        this.f30465e = false;
        N0 n02 = this.f30463c;
        if (n02 != null) {
            n02.a();
            this.f30466f = false;
        }
    }

    public void I(long j10, long j11) {
        if (z(this.f30461a)) {
            this.f30461a.g(j10, j11);
        }
        N0 n02 = this.f30463c;
        if (n02 == null || !z(n02)) {
            return;
        }
        this.f30463c.g(j10, j11);
    }

    public int J(C2906r0 c2906r0, P2.H h10, C2892k c2892k) {
        int iK = K(this.f30461a, c2906r0, h10, c2892k);
        return iK == 1 ? K(this.f30463c, c2906r0, h10, c2892k) : iK;
    }

    public void L() {
        if (!z(this.f30461a)) {
            E(true);
        }
        N0 n02 = this.f30463c;
        if (n02 == null || z(n02)) {
            return;
        }
        E(false);
    }

    public void M(C2906r0 c2906r0, long j10) {
        N0 n0L = l(c2906r0);
        if (n0L != null) {
            n0L.O(j10);
        }
    }

    public void N(long j10) {
        int i10;
        if (z(this.f30461a) && (i10 = this.f30464d) != 4 && i10 != 2) {
            P(this.f30461a, j10);
        }
        N0 n02 = this.f30463c;
        if (n02 == null || !z(n02) || this.f30464d == 3) {
            return;
        }
        P(this.f30463c, j10);
    }

    public void O(C2906r0 c2906r0, long j10) {
        P((N0) AbstractC6614a.e(l(c2906r0)), j10);
    }

    public void Q(float f10, float f11) {
        this.f30461a.J(f10, f11);
        N0 n02 = this.f30463c;
        if (n02 != null) {
            n02.J(f10, f11);
        }
    }

    public void R(A2.P p10) {
        this.f30461a.v(18, p10);
        N0 n02 = this.f30463c;
        if (n02 != null) {
            n02.v(18, p10);
        }
    }

    public void S(q2.Y y10) {
        this.f30461a.D(y10);
        N0 n02 = this.f30463c;
        if (n02 != null) {
            n02.D(y10);
        }
    }

    public void T(S2.u uVar) {
        if (m() != 2) {
            return;
        }
        this.f30461a.v(7, uVar);
        N0 n02 = this.f30463c;
        if (n02 != null) {
            n02.v(7, uVar);
        }
    }

    public void U(Object obj) {
        if (m() != 2) {
            return;
        }
        int i10 = this.f30464d;
        if (i10 == 4 || i10 == 1) {
            ((N0) AbstractC6614a.e(this.f30463c)).v(1, obj);
        } else {
            this.f30461a.v(1, obj);
        }
    }

    public void V(float f10) {
        if (m() != 1) {
            return;
        }
        this.f30461a.v(2, Float.valueOf(f10));
        N0 n02 = this.f30463c;
        if (n02 != null) {
            n02.v(2, Float.valueOf(f10));
        }
    }

    public void W() {
        if (this.f30461a.getState() == 1 && this.f30464d != 4) {
            this.f30461a.start();
            return;
        }
        N0 n02 = this.f30463c;
        if (n02 == null || n02.getState() != 1 || this.f30464d == 3) {
            return;
        }
        this.f30463c.start();
    }

    public void X() {
        int i10;
        AbstractC6614a.g(!u());
        if (z(this.f30461a)) {
            i10 = 3;
        } else {
            N0 n02 = this.f30463c;
            i10 = (n02 == null || !z(n02)) ? 2 : 4;
        }
        this.f30464d = i10;
    }

    public void Y() {
        if (z(this.f30461a)) {
            g(this.f30461a);
        }
        N0 n02 = this.f30463c;
        if (n02 == null || !z(n02)) {
            return;
        }
        g(this.f30463c);
    }

    public boolean a(C2906r0 c2906r0) {
        N0 n0L = l(c2906r0);
        return n0L == null || n0L.i() || n0L.isReady() || n0L.d();
    }

    public void b(C2892k c2892k) {
        d(this.f30461a, c2892k);
        N0 n02 = this.f30463c;
        if (n02 != null) {
            boolean z10 = z(n02) && this.f30464d != 3;
            d(this.f30463c, c2892k);
            E(false);
            if (z10) {
                Z(true);
            }
        }
        this.f30464d = 0;
    }

    public void c(C2892k c2892k) {
        if (u()) {
            int i10 = this.f30464d;
            boolean z10 = i10 == 4 || i10 == 2;
            int i11 = i10 != 4 ? 0 : 1;
            d(z10 ? this.f30461a : (N0) AbstractC6614a.e(this.f30463c), c2892k);
            E(z10);
            this.f30464d = i11;
        }
    }

    public void e(A2.N n10, P2.A a10, M2.c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12, D.b bVar, C2892k c2892k) throws C2907s {
        C6109x[] c6109xArrI = i(a10);
        int i10 = this.f30464d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.f30465e = true;
            this.f30461a.j(n10, c6109xArrI, c0Var, j10, z10, z11, j11, j12, bVar);
            c2892k.b(this.f30461a);
        } else {
            this.f30466f = true;
            ((N0) AbstractC6614a.e(this.f30463c)).j(n10, c6109xArrI, c0Var, j10, z10, z11, j11, j12, bVar);
            c2892k.b(this.f30463c);
        }
    }

    public void f() {
        if (z(this.f30461a)) {
            this.f30461a.m();
            return;
        }
        N0 n02 = this.f30463c;
        if (n02 == null || !z(n02)) {
            return;
        }
        this.f30463c.m();
    }

    public int h() {
        boolean z10 = z(this.f30461a);
        N0 n02 = this.f30463c;
        return (z10 ? 1 : 0) + ((n02 == null || !z(n02)) ? 0 : 1);
    }

    public long j(long j10, long j11) {
        long jE = z(this.f30461a) ? this.f30461a.E(j10, j11) : Long.MAX_VALUE;
        N0 n02 = this.f30463c;
        return (n02 == null || !z(n02)) ? jE : Math.min(jE, this.f30463c.E(j10, j11));
    }

    public long k(C2906r0 c2906r0) {
        N0 n0L = l(c2906r0);
        Objects.requireNonNull(n0L);
        return n0L.N();
    }

    public int m() {
        return this.f30461a.f();
    }

    public void n(int i10, Object obj, C2906r0 c2906r0) {
        ((N0) AbstractC6614a.e(l(c2906r0))).v(i10, obj);
    }

    public boolean o(C2906r0 c2906r0) {
        return p(c2906r0, this.f30461a) && p(c2906r0, this.f30463c);
    }

    public boolean r(C2906r0 c2906r0) {
        return ((N0) AbstractC6614a.e(l(c2906r0))).i();
    }

    public boolean s() {
        return this.f30463c != null;
    }

    public boolean t() {
        boolean zD = z(this.f30461a) ? this.f30461a.d() : true;
        N0 n02 = this.f30463c;
        return (n02 == null || !z(n02)) ? zD : zD & this.f30463c.d();
    }

    public boolean u() {
        return w() || A();
    }

    public boolean v(C2906r0 c2906r0) {
        return (w() && l(c2906r0) == this.f30461a) || (A() && l(c2906r0) == this.f30463c);
    }

    public boolean x(C2906r0 c2906r0) {
        return l(c2906r0) != null;
    }

    public boolean y() {
        int i10 = this.f30464d;
        return (i10 == 0 || i10 == 2 || i10 == 4) ? z(this.f30461a) : z((N0) AbstractC6614a.e(this.f30463c));
    }
}
