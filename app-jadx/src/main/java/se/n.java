package Se;

import Se.m;
import Se.p;
import Se.q;
import Ze.a;
import Ze.d;
import Ze.i;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends i.d implements Ze.q {

    /* JADX INFO: renamed from: k */
    private static final n f16394k;

    /* JADX INFO: renamed from: l */
    public static Ze.r f16395l = new a();

    /* JADX INFO: renamed from: c */
    private final Ze.d f16396c;

    /* JADX INFO: renamed from: d */
    private int f16397d;

    /* JADX INFO: renamed from: e */
    private q f16398e;

    /* JADX INFO: renamed from: f */
    private p f16399f;

    /* JADX INFO: renamed from: g */
    private m f16400g;

    /* JADX INFO: renamed from: h */
    private List f16401h;

    /* JADX INFO: renamed from: i */
    private byte f16402i;

    /* JADX INFO: renamed from: j */
    private int f16403j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public n b(Ze.e eVar, Ze.g gVar) {
            return new n(eVar, gVar);
        }
    }

    static {
        n nVar = new n(true);
        f16394k = nVar;
        nVar.T();
    }

    /* synthetic */ n(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static n L() {
        return f16394k;
    }

    private void T() {
        this.f16398e = q.v();
        this.f16399f = p.v();
        this.f16400g = m.L();
        this.f16401h = Collections.EMPTY_LIST;
    }

    public static b U() {
        return b.v();
    }

    public static b V(n nVar) {
        return U().j(nVar);
    }

    public static n X(InputStream inputStream, Ze.g gVar) {
        return (n) f16395l.c(inputStream, gVar);
    }

    public c I(int i10) {
        return (c) this.f16401h.get(i10);
    }

    public int J() {
        return this.f16401h.size();
    }

    public List K() {
        return this.f16401h;
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: M */
    public n c() {
        return f16394k;
    }

    public m N() {
        return this.f16400g;
    }

    public p O() {
        return this.f16399f;
    }

    public q P() {
        return this.f16398e;
    }

    public boolean Q() {
        return (this.f16397d & 4) == 4;
    }

    public boolean R() {
        return (this.f16397d & 2) == 2;
    }

    public boolean S() {
        return (this.f16397d & 1) == 1;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: W */
    public b a() {
        return U();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: Y */
    public b f() {
        return V(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16403j;
        if (i10 != -1) {
            return i10;
        }
        int iR = (this.f16397d & 1) == 1 ? Ze.f.r(1, this.f16398e) : 0;
        if ((this.f16397d & 2) == 2) {
            iR += Ze.f.r(2, this.f16399f);
        }
        if ((this.f16397d & 4) == 4) {
            iR += Ze.f.r(3, this.f16400g);
        }
        for (int i11 = 0; i11 < this.f16401h.size(); i11++) {
            iR += Ze.f.r(4, (Ze.p) this.f16401h.get(i11));
        }
        int iU = iR + u() + this.f16396c.size();
        this.f16403j = iU;
        return iU;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16402i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (R() && !O().e()) {
            this.f16402i = (byte) 0;
            return false;
        }
        if (Q() && !N().e()) {
            this.f16402i = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < J(); i10++) {
            if (!I(i10).e()) {
                this.f16402i = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f16402i = (byte) 1;
            return true;
        }
        this.f16402i = (byte) 0;
        return false;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        if ((this.f16397d & 1) == 1) {
            fVar.c0(1, this.f16398e);
        }
        if ((this.f16397d & 2) == 2) {
            fVar.c0(2, this.f16399f);
        }
        if ((this.f16397d & 4) == 4) {
            fVar.c0(3, this.f16400g);
        }
        for (int i10 = 0; i10 < this.f16401h.size(); i10++) {
            fVar.c0(4, (Ze.p) this.f16401h.get(i10));
        }
        aVarZ.a(200, fVar);
        fVar.h0(this.f16396c);
    }

    /* synthetic */ n(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private n(i.c cVar) {
        super(cVar);
        this.f16402i = (byte) -1;
        this.f16403j = -1;
        this.f16396c = cVar.i();
    }

    private n(boolean z10) {
        this.f16402i = (byte) -1;
        this.f16403j = -1;
        this.f16396c = Ze.d.f23287a;
    }

    private n(Ze.e eVar, Ze.g gVar) {
        this.f16402i = (byte) -1;
        this.f16403j = -1;
        T();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                q.b bVarF = (this.f16397d & 1) == 1 ? this.f16398e.f() : null;
                                q qVar = (q) eVar.t(q.f16475g, gVar);
                                this.f16398e = qVar;
                                if (bVarF != null) {
                                    bVarF.j(qVar);
                                    this.f16398e = bVarF.p();
                                }
                                this.f16397d |= 1;
                            } else if (iJ == 18) {
                                p.b bVarF2 = (this.f16397d & 2) == 2 ? this.f16399f.f() : null;
                                p pVar = (p) eVar.t(p.f16448g, gVar);
                                this.f16399f = pVar;
                                if (bVarF2 != null) {
                                    bVarF2.j(pVar);
                                    this.f16399f = bVarF2.p();
                                }
                                this.f16397d |= 2;
                            } else if (iJ == 26) {
                                m.b bVarF3 = (this.f16397d & 4) == 4 ? this.f16400g.f() : null;
                                m mVar = (m) eVar.t(m.f16378m, gVar);
                                this.f16400g = mVar;
                                if (bVarF3 != null) {
                                    bVarF3.j(mVar);
                                    this.f16400g = bVarF3.t();
                                }
                                this.f16397d |= 4;
                            } else if (iJ != 34) {
                                if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                int i10 = (c10 == true ? 1 : 0) & '\b';
                                c10 = c10;
                                if (i10 != 8) {
                                    this.f16401h = new ArrayList();
                                    c10 = '\b';
                                }
                                this.f16401h.add(eVar.t(c.f16156l0, gVar));
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new Ze.k(e10.getMessage()).i(this);
                    }
                } catch (Ze.k e11) {
                    throw e11.i(this);
                }
            } catch (Throwable th2) {
                if (((c10 == true ? 1 : 0) & '\b') == 8) {
                    this.f16401h = Collections.unmodifiableList(this.f16401h);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16396c = bVarT.h();
                    throw th3;
                }
                this.f16396c = bVarT.h();
                l();
                throw th2;
            }
        }
        if (((c10 == true ? 1 : 0) & '\b') == 8) {
            this.f16401h = Collections.unmodifiableList(this.f16401h);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16396c = bVarT.h();
            throw th4;
        }
        this.f16396c = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.c implements Ze.q {

        /* JADX INFO: renamed from: d */
        private int f16404d;

        /* JADX INFO: renamed from: e */
        private q f16405e = q.v();

        /* JADX INFO: renamed from: f */
        private p f16406f = p.v();

        /* JADX INFO: renamed from: g */
        private m f16407g = m.L();

        /* JADX INFO: renamed from: h */
        private List f16408h = Collections.EMPTY_LIST;

        private b() {
            y();
        }

        public static b v() {
            return new b();
        }

        private void x() {
            if ((this.f16404d & 8) != 8) {
                this.f16408h = new ArrayList(this.f16408h);
                this.f16404d |= 8;
            }
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: A */
        public b j(n nVar) {
            if (nVar == n.L()) {
                return this;
            }
            if (nVar.S()) {
                E(nVar.P());
            }
            if (nVar.R()) {
                D(nVar.O());
            }
            if (nVar.Q()) {
                C(nVar.N());
            }
            if (!nVar.f16401h.isEmpty()) {
                if (this.f16408h.isEmpty()) {
                    this.f16408h = nVar.f16401h;
                    this.f16404d &= -9;
                } else {
                    x();
                    this.f16408h.addAll(nVar.f16401h);
                }
            }
            q(nVar);
            k(i().c(nVar.f16396c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: B */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.n.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.n.f16395l     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.n r3 = (Se.n) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.n r4 = (Se.n) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.n.b.y1(Ze.e, Ze.g):Se.n$b");
        }

        public b C(m mVar) {
            if ((this.f16404d & 4) != 4 || this.f16407g == m.L()) {
                this.f16407g = mVar;
            } else {
                this.f16407g = m.c0(this.f16407g).j(mVar).t();
            }
            this.f16404d |= 4;
            return this;
        }

        public b D(p pVar) {
            if ((this.f16404d & 2) != 2 || this.f16406f == p.v()) {
                this.f16406f = pVar;
            } else {
                this.f16406f = p.A(this.f16406f).j(pVar).p();
            }
            this.f16404d |= 2;
            return this;
        }

        public b E(q qVar) {
            if ((this.f16404d & 1) != 1 || this.f16405e == q.v()) {
                this.f16405e = qVar;
            } else {
                this.f16405e = q.A(this.f16405e).j(qVar).p();
            }
            this.f16404d |= 1;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public n build() {
            n nVarT = t();
            if (nVarT.e()) {
                return nVarT;
            }
            throw a.AbstractC0406a.h(nVarT);
        }

        public n t() {
            n nVar = new n(this);
            int i10 = this.f16404d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            nVar.f16398e = this.f16405e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            nVar.f16399f = this.f16406f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            nVar.f16400g = this.f16407g;
            if ((this.f16404d & 8) == 8) {
                this.f16408h = Collections.unmodifiableList(this.f16408h);
                this.f16404d &= -9;
            }
            nVar.f16401h = this.f16408h;
            nVar.f16397d = i11;
            return nVar;
        }

        /* JADX INFO: renamed from: u */
        public b clone() {
            return v().j(t());
        }

        private void y() {
        }
    }
}
