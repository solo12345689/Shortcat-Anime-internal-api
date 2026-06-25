package Se;

import Ze.a;
import Ze.d;
import Ze.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends i.d implements Ze.q {

    /* JADX INFO: renamed from: k */
    private static final e f16239k;

    /* JADX INFO: renamed from: l */
    public static Ze.r f16240l = new a();

    /* JADX INFO: renamed from: c */
    private final Ze.d f16241c;

    /* JADX INFO: renamed from: d */
    private int f16242d;

    /* JADX INFO: renamed from: e */
    private int f16243e;

    /* JADX INFO: renamed from: f */
    private List f16244f;

    /* JADX INFO: renamed from: g */
    private List f16245g;

    /* JADX INFO: renamed from: h */
    private List f16246h;

    /* JADX INFO: renamed from: i */
    private byte f16247i;

    /* JADX INFO: renamed from: j */
    private int f16248j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public e b(Ze.e eVar, Ze.g gVar) {
            return new e(eVar, gVar);
        }
    }

    static {
        e eVar = new e(true);
        f16239k = eVar;
        eVar.U();
    }

    /* synthetic */ e(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static e M() {
        return f16239k;
    }

    private void U() {
        this.f16243e = 6;
        List list = Collections.EMPTY_LIST;
        this.f16244f = list;
        this.f16245g = list;
        this.f16246h = list;
    }

    public static b V() {
        return b.v();
    }

    public static b W(e eVar) {
        return V().j(eVar);
    }

    public d K(int i10) {
        return (d) this.f16246h.get(i10);
    }

    public int L() {
        return this.f16246h.size();
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: N */
    public e c() {
        return f16239k;
    }

    public int O() {
        return this.f16243e;
    }

    public v P(int i10) {
        return (v) this.f16244f.get(i10);
    }

    public int Q() {
        return this.f16244f.size();
    }

    public List R() {
        return this.f16244f;
    }

    public List S() {
        return this.f16245g;
    }

    public boolean T() {
        return (this.f16242d & 1) == 1;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: X */
    public b a() {
        return V();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: Y */
    public b f() {
        return W(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16248j;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16242d & 1) == 1 ? Ze.f.o(1, this.f16243e) : 0;
        for (int i11 = 0; i11 < this.f16244f.size(); i11++) {
            iO += Ze.f.r(2, (Ze.p) this.f16244f.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f16245g.size(); i12++) {
            iP += Ze.f.p(((Integer) this.f16245g.get(i12)).intValue());
        }
        int size = iO + iP + (S().size() * 2);
        for (int i13 = 0; i13 < this.f16246h.size(); i13++) {
            size += Ze.f.r(32, (Ze.p) this.f16246h.get(i13));
        }
        int iU = size + u() + this.f16241c.size();
        this.f16248j = iU;
        return iU;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16247i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < Q(); i10++) {
            if (!P(i10).e()) {
                this.f16247i = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < L(); i11++) {
            if (!K(i11).e()) {
                this.f16247i = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f16247i = (byte) 1;
            return true;
        }
        this.f16247i = (byte) 0;
        return false;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        if ((this.f16242d & 1) == 1) {
            fVar.Z(1, this.f16243e);
        }
        for (int i10 = 0; i10 < this.f16244f.size(); i10++) {
            fVar.c0(2, (Ze.p) this.f16244f.get(i10));
        }
        for (int i11 = 0; i11 < this.f16245g.size(); i11++) {
            fVar.Z(31, ((Integer) this.f16245g.get(i11)).intValue());
        }
        for (int i12 = 0; i12 < this.f16246h.size(); i12++) {
            fVar.c0(32, (Ze.p) this.f16246h.get(i12));
        }
        aVarZ.a(19000, fVar);
        fVar.h0(this.f16241c);
    }

    /* synthetic */ e(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private e(i.c cVar) {
        super(cVar);
        this.f16247i = (byte) -1;
        this.f16248j = -1;
        this.f16241c = cVar.i();
    }

    private e(boolean z10) {
        this.f16247i = (byte) -1;
        this.f16248j = -1;
        this.f16241c = Ze.d.f23287a;
    }

    private e(Ze.e eVar, Ze.g gVar) {
        this.f16247i = (byte) -1;
        this.f16248j = -1;
        U();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f16242d |= 1;
                            this.f16243e = eVar.r();
                        } else if (iJ == 18) {
                            if ((i10 & 2) != 2) {
                                this.f16244f = new ArrayList();
                                i10 |= 2;
                            }
                            this.f16244f.add(eVar.t(v.f16602n, gVar));
                        } else if (iJ == 248) {
                            if ((i10 & 4) != 4) {
                                this.f16245g = new ArrayList();
                                i10 |= 4;
                            }
                            this.f16245g.add(Integer.valueOf(eVar.r()));
                        } else if (iJ == 250) {
                            int i11 = eVar.i(eVar.z());
                            if ((i10 & 4) != 4 && eVar.e() > 0) {
                                this.f16245g = new ArrayList();
                                i10 |= 4;
                            }
                            while (eVar.e() > 0) {
                                this.f16245g.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i11);
                        } else if (iJ != 258) {
                            if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            if ((i10 & 8) != 8) {
                                this.f16246h = new ArrayList();
                                i10 |= 8;
                            }
                            this.f16246h.add(eVar.t(d.f16229i, gVar));
                        }
                    }
                    z10 = true;
                } catch (Ze.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new Ze.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 2) == 2) {
                    this.f16244f = Collections.unmodifiableList(this.f16244f);
                }
                if ((i10 & 4) == 4) {
                    this.f16245g = Collections.unmodifiableList(this.f16245g);
                }
                if ((i10 & 8) == 8) {
                    this.f16246h = Collections.unmodifiableList(this.f16246h);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16241c = bVarT.h();
                    throw th3;
                }
                this.f16241c = bVarT.h();
                l();
                throw th2;
            }
        }
        if ((i10 & 2) == 2) {
            this.f16244f = Collections.unmodifiableList(this.f16244f);
        }
        if ((i10 & 4) == 4) {
            this.f16245g = Collections.unmodifiableList(this.f16245g);
        }
        if ((i10 & 8) == 8) {
            this.f16246h = Collections.unmodifiableList(this.f16246h);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16241c = bVarT.h();
            throw th4;
        }
        this.f16241c = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.c implements Ze.q {

        /* JADX INFO: renamed from: d */
        private int f16249d;

        /* JADX INFO: renamed from: e */
        private int f16250e = 6;

        /* JADX INFO: renamed from: f */
        private List f16251f;

        /* JADX INFO: renamed from: g */
        private List f16252g;

        /* JADX INFO: renamed from: h */
        private List f16253h;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f16251f = list;
            this.f16252g = list;
            this.f16253h = list;
            B();
        }

        private void A() {
            if ((this.f16249d & 4) != 4) {
                this.f16252g = new ArrayList(this.f16252g);
                this.f16249d |= 4;
            }
        }

        public static b v() {
            return new b();
        }

        private void x() {
            if ((this.f16249d & 8) != 8) {
                this.f16253h = new ArrayList(this.f16253h);
                this.f16249d |= 8;
            }
        }

        private void y() {
            if ((this.f16249d & 2) != 2) {
                this.f16251f = new ArrayList(this.f16251f);
                this.f16249d |= 2;
            }
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: C */
        public b j(e eVar) {
            if (eVar == e.M()) {
                return this;
            }
            if (eVar.T()) {
                E(eVar.O());
            }
            if (!eVar.f16244f.isEmpty()) {
                if (this.f16251f.isEmpty()) {
                    this.f16251f = eVar.f16244f;
                    this.f16249d &= -3;
                } else {
                    y();
                    this.f16251f.addAll(eVar.f16244f);
                }
            }
            if (!eVar.f16245g.isEmpty()) {
                if (this.f16252g.isEmpty()) {
                    this.f16252g = eVar.f16245g;
                    this.f16249d &= -5;
                } else {
                    A();
                    this.f16252g.addAll(eVar.f16245g);
                }
            }
            if (!eVar.f16246h.isEmpty()) {
                if (this.f16253h.isEmpty()) {
                    this.f16253h = eVar.f16246h;
                    this.f16249d &= -9;
                } else {
                    x();
                    this.f16253h.addAll(eVar.f16246h);
                }
            }
            q(eVar);
            k(i().c(eVar.f16241c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.e.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.e.f16240l     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.e r3 = (Se.e) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.e r4 = (Se.e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.e.b.y1(Ze.e, Ze.g):Se.e$b");
        }

        public b E(int i10) {
            this.f16249d |= 1;
            this.f16250e = i10;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public e build() {
            e eVarT = t();
            if (eVarT.e()) {
                return eVarT;
            }
            throw a.AbstractC0406a.h(eVarT);
        }

        public e t() {
            e eVar = new e(this);
            int i10 = (this.f16249d & 1) != 1 ? 0 : 1;
            eVar.f16243e = this.f16250e;
            if ((this.f16249d & 2) == 2) {
                this.f16251f = Collections.unmodifiableList(this.f16251f);
                this.f16249d &= -3;
            }
            eVar.f16244f = this.f16251f;
            if ((this.f16249d & 4) == 4) {
                this.f16252g = Collections.unmodifiableList(this.f16252g);
                this.f16249d &= -5;
            }
            eVar.f16245g = this.f16252g;
            if ((this.f16249d & 8) == 8) {
                this.f16253h = Collections.unmodifiableList(this.f16253h);
                this.f16249d &= -9;
            }
            eVar.f16246h = this.f16253h;
            eVar.f16242d = i10;
            return eVar;
        }

        /* JADX INFO: renamed from: u */
        public b clone() {
            return v().j(t());
        }

        private void B() {
        }
    }
}
