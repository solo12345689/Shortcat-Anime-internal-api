package M2;

import M2.C;
import M2.C1916f;
import androidx.media3.exoplayer.C2905q0;
import q2.AbstractC6079K;
import q2.C6109x;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: M2.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1915e implements C, C.a {

    /* JADX INFO: renamed from: a */
    public final C f11880a;

    /* JADX INFO: renamed from: b */
    private C.a f11881b;

    /* JADX INFO: renamed from: c */
    private a[] f11882c = new a[0];

    /* JADX INFO: renamed from: d */
    private long f11883d;

    /* JADX INFO: renamed from: e */
    long f11884e;

    /* JADX INFO: renamed from: f */
    long f11885f;

    /* JADX INFO: renamed from: g */
    private C1916f.d f11886g;

    /* JADX INFO: renamed from: M2.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements c0 {

        /* JADX INFO: renamed from: a */
        public final c0 f11887a;

        /* JADX INFO: renamed from: b */
        private boolean f11888b;

        public a(c0 c0Var) {
            this.f11887a = c0Var;
        }

        public void a() {
            this.f11888b = false;
        }

        @Override // M2.c0
        public void b() {
            this.f11887a.b();
        }

        @Override // M2.c0
        public int e(long j10) {
            if (C1915e.this.p()) {
                return -3;
            }
            return this.f11887a.e(j10);
        }

        @Override // M2.c0
        public boolean isReady() {
            return !C1915e.this.p() && this.f11887a.isReady();
        }

        @Override // M2.c0
        public int p(A2.J j10, z2.f fVar, int i10) {
            if (C1915e.this.p()) {
                return -3;
            }
            if (this.f11888b) {
                fVar.v(4);
                return -4;
            }
            long jF = C1915e.this.f();
            int iP = this.f11887a.p(j10, fVar, i10);
            if (iP == -5) {
                C6109x c6109x = (C6109x) AbstractC6614a.e(j10.f142b);
                int i11 = c6109x.f57000J;
                if (i11 != 0 || c6109x.f57001K != 0) {
                    C1915e c1915e = C1915e.this;
                    if (c1915e.f11884e != 0) {
                        i11 = 0;
                    }
                    j10.f142b = c6109x.b().d0(i11).e0(c1915e.f11885f == Long.MIN_VALUE ? c6109x.f57001K : 0).P();
                }
                return -5;
            }
            long j11 = C1915e.this.f11885f;
            if (j11 == Long.MIN_VALUE || ((iP != -4 || fVar.f65557f < j11) && !(iP == -3 && jF == Long.MIN_VALUE && !fVar.f65556e))) {
                return iP;
            }
            fVar.m();
            fVar.v(4);
            this.f11888b = true;
            return -4;
        }
    }

    public C1915e(C c10, boolean z10, long j10, long j11) {
        this.f11880a = c10;
        this.f11883d = z10 ? j10 : -9223372036854775807L;
        this.f11884e = j10;
        this.f11885f = j11;
    }

    private A2.Q h(long j10, A2.Q q10) {
        long jS = t2.a0.s(q10.f171a, 0L, j10 - this.f11884e);
        long j11 = q10.f172b;
        long j12 = this.f11885f;
        long jS2 = t2.a0.s(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jS == q10.f171a && jS2 == q10.f172b) ? q10 : new A2.Q(jS, jS2);
    }

    private static long n(long j10, long j11, long j12) {
        long jMax = Math.max(j10, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }

    private static boolean w(long j10, long j11, P2.A[] aArr) {
        if (j10 < j11) {
            return true;
        }
        if (j10 != 0) {
            for (P2.A a10 : aArr) {
                if (a10 != null) {
                    C6109x c6109xQ = a10.q();
                    if (!AbstractC6079K.a(c6109xQ.f57022o, c6109xQ.f57018k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // M2.C, M2.d0
    public boolean a(C2905q0 c2905q0) {
        return this.f11880a.a(c2905q0);
    }

    @Override // M2.C.a
    public void b(C c10) {
        if (this.f11886g != null) {
            return;
        }
        ((C.a) AbstractC6614a.e(this.f11881b)).b(this);
    }

    @Override // M2.C, M2.d0
    public long c() {
        long jC = this.f11880a.c();
        if (jC != Long.MIN_VALUE) {
            long j10 = this.f11885f;
            if (j10 == Long.MIN_VALUE || jC < j10) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // M2.C
    public long d(long j10, A2.Q q10) {
        long j11 = this.f11884e;
        if (j10 == j11) {
            return j11;
        }
        return this.f11880a.d(j10, h(j10, q10));
    }

    @Override // M2.C, M2.d0
    public long f() {
        long jF = this.f11880a.f();
        if (jF != Long.MIN_VALUE) {
            long j10 = this.f11885f;
            if (j10 == Long.MIN_VALUE || jF < j10) {
                return jF;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // M2.C, M2.d0
    public void g(long j10) {
        this.f11880a.g(j10);
    }

    @Override // M2.C
    public long i(long j10) {
        this.f11883d = -9223372036854775807L;
        for (a aVar : this.f11882c) {
            if (aVar != null) {
                aVar.a();
            }
        }
        return n(this.f11880a.i(j10), this.f11884e, this.f11885f);
    }

    @Override // M2.C
    public long k() {
        if (p()) {
            long j10 = this.f11883d;
            this.f11883d = -9223372036854775807L;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j10;
        }
        long jK2 = this.f11880a.k();
        if (jK2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return n(jK2, this.f11884e, this.f11885f);
    }

    @Override // M2.C
    public void l(C.a aVar, long j10) {
        this.f11881b = aVar;
        this.f11880a.l(this, j10);
    }

    @Override // M2.C
    public void o() throws C1916f.d {
        C1916f.d dVar = this.f11886g;
        if (dVar != null) {
            throw dVar;
        }
        this.f11880a.o();
    }

    boolean p() {
        return this.f11883d != -9223372036854775807L;
    }

    @Override // M2.C, M2.d0
    public boolean q() {
        return this.f11880a.q();
    }

    @Override // M2.C
    public long r(P2.A[] aArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        this.f11882c = new a[c0VarArr.length];
        c0[] c0VarArr2 = new c0[c0VarArr.length];
        int i10 = 0;
        while (true) {
            c0 c0Var = null;
            if (i10 >= c0VarArr.length) {
                break;
            }
            a[] aVarArr = this.f11882c;
            a aVar = (a) c0VarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                c0Var = aVar.f11887a;
            }
            c0VarArr2[i10] = c0Var;
            i10++;
        }
        long jR = this.f11880a.r(aArr, zArr, c0VarArr2, zArr2, j10);
        long jN = n(jR, j10, this.f11885f);
        this.f11883d = (p() && w(jR, j10, aArr)) ? jN : -9223372036854775807L;
        for (int i11 = 0; i11 < c0VarArr.length; i11++) {
            c0 c0Var2 = c0VarArr2[i11];
            if (c0Var2 == null) {
                this.f11882c[i11] = null;
            } else {
                a[] aVarArr2 = this.f11882c;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f11887a != c0Var2) {
                    aVarArr2[i11] = new a(c0Var2);
                }
            }
            c0VarArr[i11] = this.f11882c[i11];
        }
        return jN;
    }

    @Override // M2.C
    public n0 s() {
        return this.f11880a.s();
    }

    @Override // M2.d0.a
    /* JADX INFO: renamed from: t */
    public void j(C c10) {
        ((C.a) AbstractC6614a.e(this.f11881b)).j(this);
    }

    @Override // M2.C
    public void u(long j10, boolean z10) {
        this.f11880a.u(j10, z10);
    }

    public void v(C1916f.d dVar) {
        this.f11886g = dVar;
    }

    public void x(long j10, long j11) {
        this.f11884e = j10;
        this.f11885f = j11;
    }
}
