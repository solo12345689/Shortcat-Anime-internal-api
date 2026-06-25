package a3;

import U2.I;
import U2.InterfaceC2255p;
import U2.InterfaceC2256q;
import U2.J;
import U2.r;
import U2.u;
import t2.AbstractC6614a;
import t2.C6609I;

/* JADX INFO: renamed from: a3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2562c implements InterfaceC2255p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f23734q = new u() { // from class: a3.b
        @Override // U2.u
        public final InterfaceC2255p[] f() {
            return C2562c.d();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f23740f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f23743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C2560a f23749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C2565f f23750p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f23735a = new C6609I(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6609I f23736b = new C6609I(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6609I f23737c = new C6609I(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6609I f23738d = new C6609I();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2563d f23739e = new C2563d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23741g = 1;

    public static /* synthetic */ InterfaceC2255p[] d() {
        return new InterfaceC2255p[]{new C2562c()};
    }

    private void e() {
        if (this.f23748n) {
            return;
        }
        this.f23740f.t(new J.b(-9223372036854775807L));
        this.f23748n = true;
    }

    private long g() {
        if (this.f23742h) {
            return this.f23743i + this.f23747m;
        }
        if (this.f23739e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f23747m;
    }

    private C6609I j(InterfaceC2256q interfaceC2256q) {
        if (this.f23746l > this.f23738d.b()) {
            C6609I c6609i = this.f23738d;
            c6609i.Z(new byte[Math.max(c6609i.b() * 2, this.f23746l)], 0);
        } else {
            this.f23738d.b0(0);
        }
        this.f23738d.a0(this.f23746l);
        interfaceC2256q.readFully(this.f23738d.f(), 0, this.f23746l);
        return this.f23738d;
    }

    private boolean k(InterfaceC2256q interfaceC2256q) {
        if (!interfaceC2256q.h(this.f23736b.f(), 0, 9, true)) {
            return false;
        }
        this.f23736b.b0(0);
        this.f23736b.c0(4);
        int iM = this.f23736b.M();
        boolean z10 = (iM & 4) != 0;
        boolean z11 = (iM & 1) != 0;
        if (z10 && this.f23749o == null) {
            this.f23749o = new C2560a(this.f23740f.e(8, 1));
        }
        if (z11 && this.f23750p == null) {
            this.f23750p = new C2565f(this.f23740f.e(9, 2));
        }
        this.f23740f.p();
        this.f23744j = this.f23736b.v() - 5;
        this.f23741g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m(U2.InterfaceC2256q r10) {
        /*
            r9 = this;
            long r0 = r9.g()
            int r2 = r9.f23745k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            a3.a r3 = r9.f23749o
            if (r3 == 0) goto L23
            r9.e()
            a3.a r2 = r9.f23749o
            t2.I r10 = r9.j(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            a3.f r3 = r9.f23750p
            if (r3 == 0) goto L39
            r9.e()
            a3.f r2 = r9.f23750p
            t2.I r10 = r9.j(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f23748n
            if (r2 != 0) goto L6e
            a3.d r2 = r9.f23739e
            t2.I r10 = r9.j(r10)
            boolean r10 = r2.a(r10, r0)
            a3.d r0 = r9.f23739e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            U2.r r2 = r9.f23740f
            U2.E r3 = new U2.E
            a3.d r7 = r9.f23739e
            long[] r7 = r7.e()
            a3.d r8 = r9.f23739e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.t(r3)
            r9.f23748n = r6
            goto L21
        L6e:
            int r0 = r9.f23746l
            r10.m(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f23742h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f23742h = r6
            a3.d r10 = r9.f23739e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f23747m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f23743i = r1
        L8f:
            r10 = 4
            r9.f23744j = r10
            r10 = 2
            r9.f23741g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C2562c.m(U2.q):boolean");
    }

    private boolean n(InterfaceC2256q interfaceC2256q) {
        if (!interfaceC2256q.h(this.f23737c.f(), 0, 11, true)) {
            return false;
        }
        this.f23737c.b0(0);
        this.f23745k = this.f23737c.M();
        this.f23746l = this.f23737c.P();
        this.f23747m = this.f23737c.P();
        this.f23747m = (((long) (this.f23737c.M() << 24)) | this.f23747m) * 1000;
        this.f23737c.c0(3);
        this.f23741g = 4;
        return true;
    }

    private void o(InterfaceC2256q interfaceC2256q) {
        interfaceC2256q.m(this.f23744j);
        this.f23744j = 0;
        this.f23741g = 3;
    }

    @Override // U2.InterfaceC2255p
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f23741g = 1;
            this.f23742h = false;
        } else {
            this.f23741g = 3;
        }
        this.f23744j = 0;
    }

    @Override // U2.InterfaceC2255p
    public void c(r rVar) {
        this.f23740f = rVar;
    }

    @Override // U2.InterfaceC2255p
    public boolean f(InterfaceC2256q interfaceC2256q) {
        interfaceC2256q.o(this.f23735a.f(), 0, 3);
        this.f23735a.b0(0);
        if (this.f23735a.P() != 4607062) {
            return false;
        }
        interfaceC2256q.o(this.f23735a.f(), 0, 2);
        this.f23735a.b0(0);
        if ((this.f23735a.U() & 250) != 0) {
            return false;
        }
        interfaceC2256q.o(this.f23735a.f(), 0, 4);
        this.f23735a.b0(0);
        int iV = this.f23735a.v();
        interfaceC2256q.g();
        interfaceC2256q.k(iV);
        interfaceC2256q.o(this.f23735a.f(), 0, 4);
        this.f23735a.b0(0);
        return this.f23735a.v() == 0;
    }

    @Override // U2.InterfaceC2255p
    public int h(InterfaceC2256q interfaceC2256q, I i10) {
        AbstractC6614a.i(this.f23740f);
        while (true) {
            int i11 = this.f23741g;
            if (i11 != 1) {
                if (i11 == 2) {
                    o(interfaceC2256q);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    if (m(interfaceC2256q)) {
                        return 0;
                    }
                } else if (!n(interfaceC2256q)) {
                    return -1;
                }
            } else if (!k(interfaceC2256q)) {
                return -1;
            }
        }
    }

    @Override // U2.InterfaceC2255p
    public void a() {
    }
}
