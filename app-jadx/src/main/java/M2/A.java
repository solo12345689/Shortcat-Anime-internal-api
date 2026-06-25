package M2;

import M2.D;
import java.util.Objects;
import q2.C6071C;
import q2.C6087b;
import q2.Y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class A extends p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f11642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Y.d f11643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Y.b f11644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f11645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C1935z f11646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f11649t;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends AbstractC1932w {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f11650h = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f11651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f11652g;

        private a(q2.Y y10, Object obj, Object obj2) {
            super(y10);
            this.f11651f = obj;
            this.f11652g = obj2;
        }

        public static a A(q2.Y y10, Object obj, Object obj2) {
            return new a(y10, obj, obj2);
        }

        public static a z(C6071C c6071c) {
            return new a(new b(c6071c), Y.d.f56668q, f11650h);
        }

        @Override // M2.AbstractC1932w, q2.Y
        public int f(Object obj) {
            Object obj2;
            q2.Y y10 = this.f12049e;
            if (f11650h.equals(obj) && (obj2 = this.f11652g) != null) {
                obj = obj2;
            }
            return y10.f(obj);
        }

        @Override // M2.AbstractC1932w, q2.Y
        public Y.b k(int i10, Y.b bVar, boolean z10) {
            this.f12049e.k(i10, bVar, z10);
            if (Objects.equals(bVar.f56652b, this.f11652g) && z10) {
                bVar.f56652b = f11650h;
            }
            return bVar;
        }

        @Override // M2.AbstractC1932w, q2.Y
        public Object q(int i10) {
            Object objQ = this.f12049e.q(i10);
            return Objects.equals(objQ, this.f11652g) ? f11650h : objQ;
        }

        @Override // M2.AbstractC1932w, q2.Y
        public Y.d s(int i10, Y.d dVar, long j10) {
            this.f12049e.s(i10, dVar, j10);
            if (Objects.equals(dVar.f56678a, this.f11651f)) {
                dVar.f56678a = Y.d.f56668q;
            }
            return dVar;
        }

        public a y(q2.Y y10) {
            return new a(y10, this.f11651f, this.f11652g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends q2.Y {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C6071C f11653e;

        public b(C6071C c6071c) {
            this.f11653e = c6071c;
        }

        @Override // q2.Y
        public int f(Object obj) {
            return obj == a.f11650h ? 0 : -1;
        }

        @Override // q2.Y
        public Y.b k(int i10, Y.b bVar, boolean z10) {
            bVar.u(z10 ? 0 : null, z10 ? a.f11650h : null, 0, -9223372036854775807L, 0L, C6087b.f56707g, true);
            return bVar;
        }

        @Override // q2.Y
        public int m() {
            return 1;
        }

        @Override // q2.Y
        public Object q(int i10) {
            return a.f11650h;
        }

        @Override // q2.Y
        public Y.d s(int i10, Y.d dVar, long j10) {
            dVar.h(Y.d.f56668q, this.f11653e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f56688k = true;
            return dVar;
        }

        @Override // q2.Y
        public int t() {
            return 1;
        }
    }

    public A(D d10, boolean z10) {
        super(d10);
        this.f11642m = z10 && d10.n();
        this.f11643n = new Y.d();
        this.f11644o = new Y.b();
        q2.Y yO = d10.o();
        if (yO == null) {
            this.f11645p = a.z(d10.a());
        } else {
            this.f11645p = a.A(yO, null, null);
            this.f11649t = true;
        }
    }

    private Object U(Object obj) {
        return (this.f11645p.f11652g == null || !this.f11645p.f11652g.equals(obj)) ? obj : a.f11650h;
    }

    private Object V(Object obj) {
        return (this.f11645p.f11652g == null || !obj.equals(a.f11650h)) ? obj : this.f11645p.f11652g;
    }

    private boolean X(long j10) {
        C1935z c1935z = this.f11646q;
        int iF = this.f11645p.f(c1935z.f12063a.f11662a);
        if (iF == -1) {
            return false;
        }
        long j11 = this.f11645p.j(iF, this.f11644o).f56654d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        c1935z.w(j10);
        return true;
    }

    @Override // M2.AbstractC1918h, M2.AbstractC1911a
    public void C() {
        this.f11648s = false;
        this.f11647r = false;
        super.C();
    }

    @Override // M2.p0
    protected D.b J(D.b bVar) {
        return bVar.a(U(bVar.f11662a));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // M2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void Q(q2.Y r15) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.A.Q(q2.Y):void");
    }

    @Override // M2.p0
    public void S() {
        if (this.f11642m) {
            return;
        }
        this.f11647r = true;
        R();
    }

    @Override // M2.D
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public C1935z f(D.b bVar, Q2.b bVar2, long j10) {
        C1935z c1935z = new C1935z(bVar, bVar2, j10);
        c1935z.y(this.f12012k);
        if (this.f11648s) {
            c1935z.h(bVar.a(V(bVar.f11662a)));
            return c1935z;
        }
        this.f11646q = c1935z;
        if (!this.f11647r) {
            this.f11647r = true;
            R();
        }
        return c1935z;
    }

    public q2.Y W() {
        return this.f11645p;
    }

    @Override // M2.D
    public boolean e(C6071C c6071c) {
        return this.f12012k.e(c6071c);
    }

    @Override // M2.p0, M2.D
    public void j(C6071C c6071c) {
        if (this.f11649t) {
            this.f11645p = this.f11645p.y(new k0(this.f11645p.f12049e, c6071c));
        } else {
            this.f11645p = a.z(c6071c);
        }
        this.f12012k.j(c6071c);
    }

    @Override // M2.D
    public void m(C c10) {
        ((C1935z) c10).x();
        if (c10 == this.f11646q) {
            this.f11646q = null;
        }
    }
}
