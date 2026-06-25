package M2;

import M2.C;
import androidx.media3.exoplayer.C2905q0;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class j0 implements C, C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f11989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C.a f11991c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f11992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f11993b;

        public a(c0 c0Var, long j10) {
            this.f11992a = c0Var;
            this.f11993b = j10;
        }

        public c0 a() {
            return this.f11992a;
        }

        @Override // M2.c0
        public void b() {
            this.f11992a.b();
        }

        @Override // M2.c0
        public int e(long j10) {
            return this.f11992a.e(j10 - this.f11993b);
        }

        @Override // M2.c0
        public boolean isReady() {
            return this.f11992a.isReady();
        }

        @Override // M2.c0
        public int p(A2.J j10, z2.f fVar, int i10) {
            int iP = this.f11992a.p(j10, fVar, i10);
            if (iP == -4) {
                fVar.f65557f += this.f11993b;
            }
            return iP;
        }
    }

    public j0(C c10, long j10) {
        this.f11989a = c10;
        this.f11990b = j10;
    }

    @Override // M2.C, M2.d0
    public boolean a(C2905q0 c2905q0) {
        return this.f11989a.a(c2905q0.a().f(c2905q0.f31187a - this.f11990b).d());
    }

    @Override // M2.C.a
    public void b(C c10) {
        ((C.a) AbstractC6614a.e(this.f11991c)).b(this);
    }

    @Override // M2.C, M2.d0
    public long c() {
        long jC = this.f11989a.c();
        if (jC == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jC + this.f11990b;
    }

    @Override // M2.C
    public long d(long j10, A2.Q q10) {
        return this.f11989a.d(j10 - this.f11990b, q10) + this.f11990b;
    }

    @Override // M2.C, M2.d0
    public long f() {
        long jF = this.f11989a.f();
        if (jF == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jF + this.f11990b;
    }

    @Override // M2.C, M2.d0
    public void g(long j10) {
        this.f11989a.g(j10 - this.f11990b);
    }

    public C h() {
        return this.f11989a;
    }

    @Override // M2.C
    public long i(long j10) {
        return this.f11989a.i(j10 - this.f11990b) + this.f11990b;
    }

    @Override // M2.C
    public long k() {
        long jK = this.f11989a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.f11990b;
    }

    @Override // M2.C
    public void l(C.a aVar, long j10) {
        this.f11991c = aVar;
        this.f11989a.l(this, j10 - this.f11990b);
    }

    @Override // M2.d0.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(C c10) {
        ((C.a) AbstractC6614a.e(this.f11991c)).j(this);
    }

    @Override // M2.C
    public void o() {
        this.f11989a.o();
    }

    @Override // M2.C, M2.d0
    public boolean q() {
        return this.f11989a.q();
    }

    @Override // M2.C
    public long r(P2.A[] aArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        c0[] c0VarArr2 = new c0[c0VarArr.length];
        int i10 = 0;
        while (true) {
            c0 c0VarA = null;
            if (i10 >= c0VarArr.length) {
                break;
            }
            a aVar = (a) c0VarArr[i10];
            if (aVar != null) {
                c0VarA = aVar.a();
            }
            c0VarArr2[i10] = c0VarA;
            i10++;
        }
        long jR = this.f11989a.r(aArr, zArr, c0VarArr2, zArr2, j10 - this.f11990b);
        for (int i11 = 0; i11 < c0VarArr.length; i11++) {
            c0 c0Var = c0VarArr2[i11];
            if (c0Var == null) {
                c0VarArr[i11] = null;
            } else {
                c0 c0Var2 = c0VarArr[i11];
                if (c0Var2 == null || ((a) c0Var2).a() != c0Var) {
                    c0VarArr[i11] = new a(c0Var, this.f11990b);
                }
            }
        }
        return jR + this.f11990b;
    }

    @Override // M2.C
    public n0 s() {
        return this.f11989a.s();
    }

    @Override // M2.C
    public void u(long j10, boolean z10) {
        this.f11989a.u(j10 - this.f11990b, z10);
    }
}
