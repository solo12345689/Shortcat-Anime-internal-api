package M2;

import M2.D;
import java.io.IOException;
import java.util.ArrayList;
import q2.C6071C;
import q2.Y;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: M2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1916f extends p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f11893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f11894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f11895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f11896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f11897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f11898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList f11899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Y.d f11900t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f11901u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d f11902v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f11903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f11904x;

    /* JADX INFO: renamed from: M2.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D f11905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f11906b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f11910f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f11911g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f11912h;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f11908d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f11907c = Long.MIN_VALUE;

        public b(D d10) {
            this.f11905a = (D) AbstractC6614a.e(d10);
        }

        public C1916f h() {
            this.f11912h = true;
            return new C1916f(this);
        }

        public b i(boolean z10) {
            AbstractC6614a.g(!this.f11912h);
            this.f11909e = z10;
            return this;
        }

        public b j(boolean z10) {
            AbstractC6614a.g(!this.f11912h);
            this.f11911g = z10;
            return this;
        }

        public b k(boolean z10) {
            AbstractC6614a.g(!this.f11912h);
            this.f11908d = z10;
            return this;
        }

        public b l(long j10) {
            AbstractC6614a.g(!this.f11912h);
            this.f11907c = j10;
            return this;
        }

        public b m(boolean z10) {
            AbstractC6614a.g(!this.f11912h);
            this.f11910f = z10;
            return this;
        }

        public b n(long j10) {
            AbstractC6614a.a(j10 >= 0);
            AbstractC6614a.g(!this.f11912h);
            this.f11906b = j10;
            return this;
        }
    }

    /* JADX INFO: renamed from: M2.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends AbstractC1932w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f11913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f11914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f11915h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f11916i;

        public c(q2.Y y10, long j10, long j11, boolean z10) throws d {
            super(y10);
            if (j11 != Long.MIN_VALUE && j11 < j10) {
                throw new d(2, j10, j11);
            }
            boolean z11 = false;
            if (y10.m() != 1) {
                throw new d(0);
            }
            Y.d dVarR = y10.r(0, new Y.d());
            long jMax = Math.max(0L, j10);
            if (!z10 && !dVarR.f56688k && jMax != 0 && !dVarR.f56685h) {
                throw new d(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? dVarR.f56690m : Math.max(0L, j11);
            long j12 = dVarR.f56690m;
            if (j12 != -9223372036854775807L) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f11913f = jMax;
            this.f11914g = jMax2;
            this.f11915h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (dVarR.f56686i && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
                z11 = true;
            }
            this.f11916i = z11;
        }

        @Override // M2.AbstractC1932w, q2.Y
        public Y.b k(int i10, Y.b bVar, boolean z10) {
            this.f12049e.k(0, bVar, z10);
            long jO = bVar.o() - this.f11913f;
            long j10 = this.f11915h;
            return bVar.t(bVar.f56651a, bVar.f56652b, 0, j10 != -9223372036854775807L ? j10 - jO : -9223372036854775807L, jO);
        }

        @Override // M2.AbstractC1932w, q2.Y
        public Y.d s(int i10, Y.d dVar, long j10) {
            this.f12049e.s(0, dVar, 0L);
            long j11 = dVar.f56693p;
            long j12 = this.f11913f;
            dVar.f56693p = j11 + j12;
            dVar.f56690m = this.f11915h;
            dVar.f56686i = this.f11916i;
            long j13 = dVar.f56689l;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                dVar.f56689l = jMax;
                long j14 = this.f11914g;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                dVar.f56689l = jMax - this.f11913f;
            }
            long jF1 = t2.a0.F1(this.f11913f);
            long j15 = dVar.f56682e;
            if (j15 != -9223372036854775807L) {
                dVar.f56682e = j15 + jF1;
            }
            long j16 = dVar.f56683f;
            if (j16 != -9223372036854775807L) {
                dVar.f56683f = j16 + jF1;
            }
            return dVar;
        }
    }

    /* JADX INFO: renamed from: M2.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11917a;

        public d(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        private static String a(int i10, long j10, long j11) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 == 1) {
                return "not seekable to start";
            }
            if (i10 != 2) {
                return "unknown";
            }
            AbstractC6614a.g((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j10 + ", End time: " + j11;
        }

        public d(int i10, long j10, long j11) {
            super("Illegal clipping: " + a(i10, j10, j11));
            this.f11917a = i10;
        }
    }

    private void T(q2.Y y10) {
        long j10;
        y10.r(0, this.f11900t);
        long jF = this.f11900t.f();
        if (this.f11901u == null || this.f11899s.isEmpty() || this.f11896p) {
            j10 = this.f11893m;
            long j11 = this.f11894n;
            if (this.f11897q) {
                long jD = this.f11900t.d();
                j10 += jD;
                j11 += jD;
            }
            this.f11903w = jF + j10;
            this.f11904x = this.f11894n != Long.MIN_VALUE ? jF + j11 : Long.MIN_VALUE;
            int size = this.f11899s.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C1915e) this.f11899s.get(i10)).x(this.f11903w, this.f11904x);
            }
            j = j11;
        } else {
            j10 = this.f11903w - jF;
            if (this.f11894n != Long.MIN_VALUE) {
                j = this.f11904x - jF;
            }
        }
        try {
            c cVar = new c(y10, j10, j, this.f11898r);
            this.f11901u = cVar;
            B(cVar);
        } catch (d e10) {
            this.f11902v = e10;
            for (int i11 = 0; i11 < this.f11899s.size(); i11++) {
                ((C1915e) this.f11899s.get(i11)).v(this.f11902v);
            }
        }
    }

    @Override // M2.AbstractC1918h, M2.AbstractC1911a
    protected void C() {
        super.C();
        this.f11902v = null;
        this.f11901u = null;
    }

    @Override // M2.p0
    protected void Q(q2.Y y10) {
        if (this.f11902v != null) {
            return;
        }
        T(y10);
    }

    @Override // M2.D
    public boolean e(C6071C c6071c) {
        return a().f56332f.equals(c6071c.f56332f) && this.f12012k.e(c6071c);
    }

    @Override // M2.D
    public C f(D.b bVar, Q2.b bVar2, long j10) {
        C1915e c1915e = new C1915e(this.f12012k.f(bVar, bVar2, j10), this.f11895o, this.f11903w, this.f11904x);
        this.f11899s.add(c1915e);
        return c1915e;
    }

    @Override // M2.AbstractC1918h, M2.D
    public void l() throws d {
        d dVar = this.f11902v;
        if (dVar != null) {
            throw dVar;
        }
        super.l();
    }

    @Override // M2.D
    public void m(C c10) {
        AbstractC6614a.g(this.f11899s.remove(c10));
        this.f12012k.m(((C1915e) c10).f11880a);
        if (!this.f11899s.isEmpty() || this.f11896p) {
            return;
        }
        T(((c) AbstractC6614a.e(this.f11901u)).f12049e);
    }

    private C1916f(b bVar) {
        super(bVar.f11905a);
        this.f11893m = bVar.f11906b;
        this.f11894n = bVar.f11907c;
        this.f11895o = bVar.f11908d;
        this.f11896p = bVar.f11909e;
        this.f11897q = bVar.f11910f;
        this.f11898r = bVar.f11911g;
        this.f11899s = new ArrayList();
        this.f11900t = new Y.d();
    }
}
