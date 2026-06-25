package Se;

import Se.r;
import Ze.a;
import Ze.d;
import Ze.i;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class v extends i.d implements Ze.q {

    /* JADX INFO: renamed from: m */
    private static final v f16601m;

    /* JADX INFO: renamed from: n */
    public static Ze.r f16602n = new a();

    /* JADX INFO: renamed from: c */
    private final Ze.d f16603c;

    /* JADX INFO: renamed from: d */
    private int f16604d;

    /* JADX INFO: renamed from: e */
    private int f16605e;

    /* JADX INFO: renamed from: f */
    private int f16606f;

    /* JADX INFO: renamed from: g */
    private r f16607g;

    /* JADX INFO: renamed from: h */
    private int f16608h;

    /* JADX INFO: renamed from: i */
    private r f16609i;

    /* JADX INFO: renamed from: j */
    private int f16610j;

    /* JADX INFO: renamed from: k */
    private byte f16611k;

    /* JADX INFO: renamed from: l */
    private int f16612l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public v b(Ze.e eVar, Ze.g gVar) {
            return new v(eVar, gVar);
        }
    }

    static {
        v vVar = new v(true);
        f16601m = vVar;
        vVar.X();
    }

    /* synthetic */ v(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static v J() {
        return f16601m;
    }

    private void X() {
        this.f16605e = 0;
        this.f16606f = 0;
        this.f16607g = r.Y();
        this.f16608h = 0;
        this.f16609i = r.Y();
        this.f16610j = 0;
    }

    public static b Y() {
        return b.v();
    }

    public static b Z(v vVar) {
        return Y().j(vVar);
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: K */
    public v c() {
        return f16601m;
    }

    public int L() {
        return this.f16605e;
    }

    public int M() {
        return this.f16606f;
    }

    public r N() {
        return this.f16607g;
    }

    public int O() {
        return this.f16608h;
    }

    public r P() {
        return this.f16609i;
    }

    public int Q() {
        return this.f16610j;
    }

    public boolean R() {
        return (this.f16604d & 1) == 1;
    }

    public boolean S() {
        return (this.f16604d & 2) == 2;
    }

    public boolean T() {
        return (this.f16604d & 4) == 4;
    }

    public boolean U() {
        return (this.f16604d & 8) == 8;
    }

    public boolean V() {
        return (this.f16604d & 16) == 16;
    }

    public boolean W() {
        return (this.f16604d & 32) == 32;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: a0 */
    public b a() {
        return Y();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: b0 */
    public b f() {
        return Z(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16612l;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16604d & 1) == 1 ? Ze.f.o(1, this.f16605e) : 0;
        if ((this.f16604d & 2) == 2) {
            iO += Ze.f.o(2, this.f16606f);
        }
        if ((this.f16604d & 4) == 4) {
            iO += Ze.f.r(3, this.f16607g);
        }
        if ((this.f16604d & 16) == 16) {
            iO += Ze.f.r(4, this.f16609i);
        }
        if ((this.f16604d & 8) == 8) {
            iO += Ze.f.o(5, this.f16608h);
        }
        if ((this.f16604d & 32) == 32) {
            iO += Ze.f.o(6, this.f16610j);
        }
        int iU = iO + u() + this.f16603c.size();
        this.f16612l = iU;
        return iU;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16611k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!S()) {
            this.f16611k = (byte) 0;
            return false;
        }
        if (T() && !N().e()) {
            this.f16611k = (byte) 0;
            return false;
        }
        if (V() && !P().e()) {
            this.f16611k = (byte) 0;
            return false;
        }
        if (t()) {
            this.f16611k = (byte) 1;
            return true;
        }
        this.f16611k = (byte) 0;
        return false;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        if ((this.f16604d & 1) == 1) {
            fVar.Z(1, this.f16605e);
        }
        if ((this.f16604d & 2) == 2) {
            fVar.Z(2, this.f16606f);
        }
        if ((this.f16604d & 4) == 4) {
            fVar.c0(3, this.f16607g);
        }
        if ((this.f16604d & 16) == 16) {
            fVar.c0(4, this.f16609i);
        }
        if ((this.f16604d & 8) == 8) {
            fVar.Z(5, this.f16608h);
        }
        if ((this.f16604d & 32) == 32) {
            fVar.Z(6, this.f16610j);
        }
        aVarZ.a(200, fVar);
        fVar.h0(this.f16603c);
    }

    /* synthetic */ v(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private v(i.c cVar) {
        super(cVar);
        this.f16611k = (byte) -1;
        this.f16612l = -1;
        this.f16603c = cVar.i();
    }

    private v(boolean z10) {
        this.f16611k = (byte) -1;
        this.f16612l = -1;
        this.f16603c = Ze.d.f23287a;
    }

    private v(Ze.e eVar, Ze.g gVar) {
        r.c cVarF;
        this.f16611k = (byte) -1;
        this.f16612l = -1;
        X();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f16604d |= 1;
                            this.f16605e = eVar.r();
                        } else if (iJ != 16) {
                            if (iJ == 26) {
                                cVarF = (this.f16604d & 4) == 4 ? this.f16607g.f() : null;
                                r rVar = (r) eVar.t(r.f16483v, gVar);
                                this.f16607g = rVar;
                                if (cVarF != null) {
                                    cVarF.j(rVar);
                                    this.f16607g = cVarF.t();
                                }
                                this.f16604d |= 4;
                            } else if (iJ == 34) {
                                cVarF = (this.f16604d & 16) == 16 ? this.f16609i.f() : null;
                                r rVar2 = (r) eVar.t(r.f16483v, gVar);
                                this.f16609i = rVar2;
                                if (cVarF != null) {
                                    cVarF.j(rVar2);
                                    this.f16609i = cVarF.t();
                                }
                                this.f16604d |= 16;
                            } else if (iJ == 40) {
                                this.f16604d |= 8;
                                this.f16608h = eVar.r();
                            } else if (iJ != 48) {
                                if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                this.f16604d |= 32;
                                this.f16610j = eVar.r();
                            }
                        } else {
                            this.f16604d |= 2;
                            this.f16606f = eVar.r();
                        }
                    }
                    z10 = true;
                } catch (Ze.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new Ze.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16603c = bVarT.h();
                    throw th3;
                }
                this.f16603c = bVarT.h();
                l();
                throw th2;
            }
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16603c = bVarT.h();
            throw th4;
        }
        this.f16603c = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.c implements Ze.q {

        /* JADX INFO: renamed from: d */
        private int f16613d;

        /* JADX INFO: renamed from: e */
        private int f16614e;

        /* JADX INFO: renamed from: f */
        private int f16615f;

        /* JADX INFO: renamed from: h */
        private int f16617h;

        /* JADX INFO: renamed from: j */
        private int f16619j;

        /* JADX INFO: renamed from: g */
        private r f16616g = r.Y();

        /* JADX INFO: renamed from: i */
        private r f16618i = r.Y();

        private b() {
            x();
        }

        public static b v() {
            return new b();
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.v.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.v.f16602n     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.v r3 = (Se.v) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                if (r3 == 0) goto Le
                r2.j(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                Ze.p r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                Se.v r4 = (Se.v) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.j(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Se.v.b.y1(Ze.e, Ze.g):Se.v$b");
        }

        public b B(r rVar) {
            if ((this.f16613d & 4) != 4 || this.f16616g == r.Y()) {
                this.f16616g = rVar;
            } else {
                this.f16616g = r.z0(this.f16616g).j(rVar).t();
            }
            this.f16613d |= 4;
            return this;
        }

        public b C(r rVar) {
            if ((this.f16613d & 16) != 16 || this.f16618i == r.Y()) {
                this.f16618i = rVar;
            } else {
                this.f16618i = r.z0(this.f16618i).j(rVar).t();
            }
            this.f16613d |= 16;
            return this;
        }

        public b D(int i10) {
            this.f16613d |= 1;
            this.f16614e = i10;
            return this;
        }

        public b E(int i10) {
            this.f16613d |= 2;
            this.f16615f = i10;
            return this;
        }

        public b F(int i10) {
            this.f16613d |= 8;
            this.f16617h = i10;
            return this;
        }

        public b G(int i10) {
            this.f16613d |= 32;
            this.f16619j = i10;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public v build() {
            v vVarT = t();
            if (vVarT.e()) {
                return vVarT;
            }
            throw a.AbstractC0406a.h(vVarT);
        }

        public v t() {
            v vVar = new v(this);
            int i10 = this.f16613d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            vVar.f16605e = this.f16614e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            vVar.f16606f = this.f16615f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            vVar.f16607g = this.f16616g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            vVar.f16608h = this.f16617h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            vVar.f16609i = this.f16618i;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            vVar.f16610j = this.f16619j;
            vVar.f16604d = i11;
            return vVar;
        }

        /* JADX INFO: renamed from: u */
        public b clone() {
            return v().j(t());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: y */
        public b j(v vVar) {
            if (vVar == v.J()) {
                return this;
            }
            if (vVar.R()) {
                D(vVar.L());
            }
            if (vVar.S()) {
                E(vVar.M());
            }
            if (vVar.T()) {
                B(vVar.N());
            }
            if (vVar.U()) {
                F(vVar.O());
            }
            if (vVar.V()) {
                C(vVar.P());
            }
            if (vVar.W()) {
                G(vVar.Q());
            }
            q(vVar);
            k(i().c(vVar.f16603c));
            return this;
        }

        private void x() {
        }
    }
}
