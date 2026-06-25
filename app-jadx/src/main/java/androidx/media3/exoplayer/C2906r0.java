package androidx.media3.exoplayer;

import M2.C;
import M2.C1915e;
import M2.C1928s;
import M2.D;
import java.io.IOException;
import t2.AbstractC6614a;
import t2.AbstractC6635w;

/* JADX INFO: renamed from: androidx.media3.exoplayer.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2906r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M2.C f31195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f31196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M2.c0[] f31197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2908s0 f31202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f31203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean[] f31204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final O0[] f31205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final P2.G f31206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final J0 f31207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C2906r0 f31208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private M2.n0 f31209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private P2.H f31210p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f31211q;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.r0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        C2906r0 a(C2908s0 c2908s0, long j10);
    }

    public C2906r0(O0[] o0Arr, long j10, P2.G g10, Q2.b bVar, J0 j02, C2908s0 c2908s0, P2.H h10, long j11) {
        this.f31205k = o0Arr;
        this.f31211q = j10;
        this.f31206l = g10;
        this.f31207m = j02;
        D.b bVar2 = c2908s0.f31219a;
        this.f31196b = bVar2.f11662a;
        this.f31202h = c2908s0;
        this.f31198d = j11;
        this.f31209o = M2.n0.f12001d;
        this.f31210p = h10;
        this.f31197c = new M2.c0[o0Arr.length];
        this.f31204j = new boolean[o0Arr.length];
        this.f31195a = f(bVar2, j02, bVar, c2908s0.f31220b, c2908s0.f31222d, c2908s0.f31224f);
    }

    private void c(M2.c0[] c0VarArr) {
        int i10 = 0;
        while (true) {
            O0[] o0Arr = this.f31205k;
            if (i10 >= o0Arr.length) {
                return;
            }
            if (o0Arr[i10].f() == -2 && this.f31210p.c(i10)) {
                c0VarArr[i10] = new C1928s();
            }
            i10++;
        }
    }

    private static M2.C f(D.b bVar, J0 j02, Q2.b bVar2, long j10, long j11, boolean z10) {
        M2.C cH = j02.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new C1915e(cH, !z10, 0L, j11) : cH;
    }

    private void g() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            P2.H h10 = this.f31210p;
            if (i10 >= h10.f13276a) {
                return;
            }
            boolean zC = h10.c(i10);
            P2.A a10 = this.f31210p.f13278c[i10];
            if (zC && a10 != null) {
                a10.disable();
            }
            i10++;
        }
    }

    private void h(M2.c0[] c0VarArr) {
        int i10 = 0;
        while (true) {
            O0[] o0Arr = this.f31205k;
            if (i10 >= o0Arr.length) {
                return;
            }
            if (o0Arr[i10].f() == -2) {
                c0VarArr[i10] = null;
            }
            i10++;
        }
    }

    private void i() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            P2.H h10 = this.f31210p;
            if (i10 >= h10.f13276a) {
                return;
            }
            boolean zC = h10.c(i10);
            P2.A a10 = this.f31210p.f13278c[i10];
            if (zC && a10 != null) {
                a10.enable();
            }
            i10++;
        }
    }

    private boolean u() {
        return this.f31208n == null;
    }

    private static void y(J0 j02, M2.C c10) {
        try {
            if (c10 instanceof C1915e) {
                j02.z(((C1915e) c10).f11880a);
            } else {
                j02.z(c10);
            }
        } catch (RuntimeException e10) {
            AbstractC6635w.e("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A(C2906r0 c2906r0) {
        if (c2906r0 == this.f31208n) {
            return;
        }
        g();
        this.f31208n = c2906r0;
        i();
    }

    public void B(long j10) {
        this.f31211q = j10;
    }

    public long C(long j10) {
        return j10 - m();
    }

    public long D(long j10) {
        return j10 + m();
    }

    public void E() {
        M2.C c10 = this.f31195a;
        if (c10 instanceof C1915e) {
            long j10 = this.f31202h.f31222d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C1915e) c10).x(0L, j10);
        }
    }

    public long a(P2.H h10, long j10, boolean z10) {
        return b(h10, j10, z10, new boolean[this.f31205k.length]);
    }

    public long b(P2.H h10, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= h10.f13276a) {
                break;
            }
            boolean[] zArr2 = this.f31204j;
            if (z10 || !h10.b(this.f31210p, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.f31197c);
        g();
        this.f31210p = h10;
        i();
        long jR = this.f31195a.r(h10.f13278c, this.f31204j, this.f31197c, zArr, j10);
        c(this.f31197c);
        this.f31201g = false;
        int i11 = 0;
        while (true) {
            M2.c0[] c0VarArr = this.f31197c;
            if (i11 >= c0VarArr.length) {
                return jR;
            }
            if (c0VarArr[i11] != null) {
                AbstractC6614a.g(h10.c(i11));
                if (this.f31205k[i11].f() != -2) {
                    this.f31201g = true;
                }
            } else {
                AbstractC6614a.g(h10.f13278c[i11] == null);
            }
            i11++;
        }
    }

    public boolean d(C2908s0 c2908s0) {
        if (!C2912u0.e(this.f31202h.f31223e, c2908s0.f31223e)) {
            return false;
        }
        C2908s0 c2908s02 = this.f31202h;
        return c2908s02.f31220b == c2908s0.f31220b && c2908s02.f31219a.equals(c2908s0.f31219a);
    }

    public void e(C2905q0 c2905q0) {
        AbstractC6614a.g(u());
        this.f31195a.a(c2905q0);
    }

    public long j() {
        if (!this.f31200f) {
            return this.f31202h.f31220b;
        }
        long jF = this.f31201g ? this.f31195a.f() : Long.MIN_VALUE;
        return jF == Long.MIN_VALUE ? this.f31202h.f31223e : jF;
    }

    public C2906r0 k() {
        return this.f31208n;
    }

    public long l() {
        if (this.f31200f) {
            return this.f31195a.c();
        }
        return 0L;
    }

    public long m() {
        return this.f31211q;
    }

    public long n() {
        return this.f31202h.f31220b + this.f31211q;
    }

    public M2.n0 o() {
        return this.f31209o;
    }

    public P2.H p() {
        return this.f31210p;
    }

    public void q(float f10, q2.Y y10, boolean z10) {
        this.f31200f = true;
        this.f31209o = this.f31195a.s();
        P2.H hZ = z(f10, y10, z10);
        C2908s0 c2908s0 = this.f31202h;
        long jMax = c2908s0.f31220b;
        long j10 = c2908s0.f31223e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(hZ, jMax, false);
        long j11 = this.f31211q;
        C2908s0 c2908s02 = this.f31202h;
        this.f31211q = j11 + (c2908s02.f31220b - jA);
        this.f31202h = c2908s02.b(jA);
    }

    public boolean r() {
        try {
            if (this.f31200f) {
                for (M2.c0 c0Var : this.f31197c) {
                    if (c0Var != null) {
                        c0Var.b();
                    }
                }
            } else {
                this.f31195a.o();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f31200f) {
            return !this.f31201g || this.f31195a.f() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean t() {
        if (this.f31200f) {
            return s() || j() - this.f31202h.f31220b >= this.f31198d;
        }
        return false;
    }

    public void v(C.a aVar, long j10) {
        this.f31199e = true;
        this.f31195a.l(aVar, j10);
    }

    public void w(long j10) {
        AbstractC6614a.g(u());
        if (this.f31200f) {
            this.f31195a.g(C(j10));
        }
    }

    public void x() {
        g();
        y(this.f31207m, this.f31195a);
    }

    public P2.H z(float f10, q2.Y y10, boolean z10) {
        P2.H hK = this.f31206l.k(this.f31205k, o(), this.f31202h.f31219a, y10);
        for (int i10 = 0; i10 < hK.f13276a; i10++) {
            if (hK.c(i10)) {
                if (hK.f13278c[i10] == null && this.f31205k[i10].f() != -2) {
                    z = false;
                }
                AbstractC6614a.g(z);
            } else {
                AbstractC6614a.g(hK.f13278c[i10] == null);
            }
        }
        for (P2.A a10 : hK.f13278c) {
            if (a10 != null) {
                a10.h(f10);
                a10.n(z10);
            }
        }
        return hK;
    }
}
