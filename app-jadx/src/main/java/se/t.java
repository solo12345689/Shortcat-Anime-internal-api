package Se;

import Ze.a;
import Ze.d;
import Ze.i;
import Ze.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class t extends i.d implements Ze.q {

    /* JADX INFO: renamed from: n */
    private static final t f16564n;

    /* JADX INFO: renamed from: o */
    public static Ze.r f16565o = new a();

    /* JADX INFO: renamed from: c */
    private final Ze.d f16566c;

    /* JADX INFO: renamed from: d */
    private int f16567d;

    /* JADX INFO: renamed from: e */
    private int f16568e;

    /* JADX INFO: renamed from: f */
    private int f16569f;

    /* JADX INFO: renamed from: g */
    private boolean f16570g;

    /* JADX INFO: renamed from: h */
    private c f16571h;

    /* JADX INFO: renamed from: i */
    private List f16572i;

    /* JADX INFO: renamed from: j */
    private List f16573j;

    /* JADX INFO: renamed from: k */
    private int f16574k;

    /* JADX INFO: renamed from: l */
    private byte f16575l;

    /* JADX INFO: renamed from: m */
    private int f16576m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public t b(Ze.e eVar, Ze.g gVar) {
            return new t(eVar, gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c implements j.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* JADX INFO: renamed from: e */
        private static j.b f16587e = new a();

        /* JADX INFO: renamed from: a */
        private final int f16589a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a implements j.b {
            a() {
            }

            @Override // Ze.j.b
            /* JADX INFO: renamed from: b */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        c(int i10, int i11) {
            this.f16589a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return IN;
            }
            if (i10 == 1) {
                return OUT;
            }
            if (i10 != 2) {
                return null;
            }
            return INV;
        }

        @Override // Ze.j.a
        public final int d() {
            return this.f16589a;
        }
    }

    static {
        t tVar = new t(true);
        f16564n = tVar;
        tVar.Z();
    }

    /* synthetic */ t(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static t L() {
        return f16564n;
    }

    private void Z() {
        this.f16568e = 0;
        this.f16569f = 0;
        this.f16570g = false;
        this.f16571h = c.INV;
        List list = Collections.EMPTY_LIST;
        this.f16572i = list;
        this.f16573j = list;
    }

    public static b a0() {
        return b.v();
    }

    public static b b0(t tVar) {
        return a0().j(tVar);
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: M */
    public t c() {
        return f16564n;
    }

    public int N() {
        return this.f16568e;
    }

    public int O() {
        return this.f16569f;
    }

    public boolean P() {
        return this.f16570g;
    }

    public r Q(int i10) {
        return (r) this.f16572i.get(i10);
    }

    public int R() {
        return this.f16572i.size();
    }

    public List S() {
        return this.f16573j;
    }

    public List T() {
        return this.f16572i;
    }

    public c U() {
        return this.f16571h;
    }

    public boolean V() {
        return (this.f16567d & 1) == 1;
    }

    public boolean W() {
        return (this.f16567d & 2) == 2;
    }

    public boolean X() {
        return (this.f16567d & 4) == 4;
    }

    public boolean Y() {
        return (this.f16567d & 8) == 8;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: c0 */
    public b a() {
        return a0();
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16576m;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16567d & 1) == 1 ? Ze.f.o(1, this.f16568e) : 0;
        if ((this.f16567d & 2) == 2) {
            iO += Ze.f.o(2, this.f16569f);
        }
        if ((this.f16567d & 4) == 4) {
            iO += Ze.f.a(3, this.f16570g);
        }
        if ((this.f16567d & 8) == 8) {
            iO += Ze.f.h(4, this.f16571h.d());
        }
        for (int i11 = 0; i11 < this.f16572i.size(); i11++) {
            iO += Ze.f.r(5, (Ze.p) this.f16572i.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f16573j.size(); i12++) {
            iP += Ze.f.p(((Integer) this.f16573j.get(i12)).intValue());
        }
        int iP2 = iO + iP;
        if (!S().isEmpty()) {
            iP2 = iP2 + 1 + Ze.f.p(iP);
        }
        this.f16574k = iP;
        int iU = iP2 + u() + this.f16566c.size();
        this.f16576m = iU;
        return iU;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: d0 */
    public b f() {
        return b0(this);
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16575l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!V()) {
            this.f16575l = (byte) 0;
            return false;
        }
        if (!W()) {
            this.f16575l = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < R(); i10++) {
            if (!Q(i10).e()) {
                this.f16575l = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f16575l = (byte) 1;
            return true;
        }
        this.f16575l = (byte) 0;
        return false;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        if ((this.f16567d & 1) == 1) {
            fVar.Z(1, this.f16568e);
        }
        if ((this.f16567d & 2) == 2) {
            fVar.Z(2, this.f16569f);
        }
        if ((this.f16567d & 4) == 4) {
            fVar.K(3, this.f16570g);
        }
        if ((this.f16567d & 8) == 8) {
            fVar.R(4, this.f16571h.d());
        }
        for (int i10 = 0; i10 < this.f16572i.size(); i10++) {
            fVar.c0(5, (Ze.p) this.f16572i.get(i10));
        }
        if (S().size() > 0) {
            fVar.n0(50);
            fVar.n0(this.f16574k);
        }
        for (int i11 = 0; i11 < this.f16573j.size(); i11++) {
            fVar.a0(((Integer) this.f16573j.get(i11)).intValue());
        }
        aVarZ.a(1000, fVar);
        fVar.h0(this.f16566c);
    }

    /* synthetic */ t(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private t(i.c cVar) {
        super(cVar);
        this.f16574k = -1;
        this.f16575l = (byte) -1;
        this.f16576m = -1;
        this.f16566c = cVar.i();
    }

    private t(boolean z10) {
        this.f16574k = -1;
        this.f16575l = (byte) -1;
        this.f16576m = -1;
        this.f16566c = Ze.d.f23287a;
    }

    private t(Ze.e eVar, Ze.g gVar) {
        this.f16574k = -1;
        this.f16575l = (byte) -1;
        this.f16576m = -1;
        Z();
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
                            this.f16567d |= 1;
                            this.f16568e = eVar.r();
                        } else if (iJ == 16) {
                            this.f16567d |= 2;
                            this.f16569f = eVar.r();
                        } else if (iJ == 24) {
                            this.f16567d |= 4;
                            this.f16570g = eVar.j();
                        } else if (iJ == 32) {
                            int iM = eVar.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f16567d |= 8;
                                this.f16571h = cVarA;
                            }
                        } else if (iJ == 42) {
                            if ((i10 & 16) != 16) {
                                this.f16572i = new ArrayList();
                                i10 |= 16;
                            }
                            this.f16572i.add(eVar.t(r.f16483v, gVar));
                        } else if (iJ == 48) {
                            if ((i10 & 32) != 32) {
                                this.f16573j = new ArrayList();
                                i10 |= 32;
                            }
                            this.f16573j.add(Integer.valueOf(eVar.r()));
                        } else if (iJ != 50) {
                            if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            int i11 = eVar.i(eVar.z());
                            if ((i10 & 32) != 32 && eVar.e() > 0) {
                                this.f16573j = new ArrayList();
                                i10 |= 32;
                            }
                            while (eVar.e() > 0) {
                                this.f16573j.add(Integer.valueOf(eVar.r()));
                            }
                            eVar.h(i11);
                        }
                    }
                    z10 = true;
                } catch (Ze.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new Ze.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 16) == 16) {
                    this.f16572i = Collections.unmodifiableList(this.f16572i);
                }
                if ((i10 & 32) == 32) {
                    this.f16573j = Collections.unmodifiableList(this.f16573j);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16566c = bVarT.h();
                    throw th3;
                }
                this.f16566c = bVarT.h();
                l();
                throw th2;
            }
        }
        if ((i10 & 16) == 16) {
            this.f16572i = Collections.unmodifiableList(this.f16572i);
        }
        if ((i10 & 32) == 32) {
            this.f16573j = Collections.unmodifiableList(this.f16573j);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16566c = bVarT.h();
            throw th4;
        }
        this.f16566c = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.c implements Ze.q {

        /* JADX INFO: renamed from: d */
        private int f16577d;

        /* JADX INFO: renamed from: e */
        private int f16578e;

        /* JADX INFO: renamed from: f */
        private int f16579f;

        /* JADX INFO: renamed from: g */
        private boolean f16580g;

        /* JADX INFO: renamed from: h */
        private c f16581h = c.INV;

        /* JADX INFO: renamed from: i */
        private List f16582i;

        /* JADX INFO: renamed from: j */
        private List f16583j;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f16582i = list;
            this.f16583j = list;
            A();
        }

        public static b v() {
            return new b();
        }

        private void x() {
            if ((this.f16577d & 32) != 32) {
                this.f16583j = new ArrayList(this.f16583j);
                this.f16577d |= 32;
            }
        }

        private void y() {
            if ((this.f16577d & 16) != 16) {
                this.f16582i = new ArrayList(this.f16582i);
                this.f16577d |= 16;
            }
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: B */
        public b j(t tVar) {
            if (tVar == t.L()) {
                return this;
            }
            if (tVar.V()) {
                D(tVar.N());
            }
            if (tVar.W()) {
                E(tVar.O());
            }
            if (tVar.X()) {
                F(tVar.P());
            }
            if (tVar.Y()) {
                G(tVar.U());
            }
            if (!tVar.f16572i.isEmpty()) {
                if (this.f16582i.isEmpty()) {
                    this.f16582i = tVar.f16572i;
                    this.f16577d &= -17;
                } else {
                    y();
                    this.f16582i.addAll(tVar.f16572i);
                }
            }
            if (!tVar.f16573j.isEmpty()) {
                if (this.f16583j.isEmpty()) {
                    this.f16583j = tVar.f16573j;
                    this.f16577d &= -33;
                } else {
                    x();
                    this.f16583j.addAll(tVar.f16573j);
                }
            }
            q(tVar);
            k(i().c(tVar.f16566c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.t.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.t.f16565o     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.t r3 = (Se.t) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.t r4 = (Se.t) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.t.b.y1(Ze.e, Ze.g):Se.t$b");
        }

        public b D(int i10) {
            this.f16577d |= 1;
            this.f16578e = i10;
            return this;
        }

        public b E(int i10) {
            this.f16577d |= 2;
            this.f16579f = i10;
            return this;
        }

        public b F(boolean z10) {
            this.f16577d |= 4;
            this.f16580g = z10;
            return this;
        }

        public b G(c cVar) {
            cVar.getClass();
            this.f16577d |= 8;
            this.f16581h = cVar;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public t build() {
            t tVarT = t();
            if (tVarT.e()) {
                return tVarT;
            }
            throw a.AbstractC0406a.h(tVarT);
        }

        public t t() {
            t tVar = new t(this);
            int i10 = this.f16577d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            tVar.f16568e = this.f16578e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            tVar.f16569f = this.f16579f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            tVar.f16570g = this.f16580g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            tVar.f16571h = this.f16581h;
            if ((this.f16577d & 16) == 16) {
                this.f16582i = Collections.unmodifiableList(this.f16582i);
                this.f16577d &= -17;
            }
            tVar.f16572i = this.f16582i;
            if ((this.f16577d & 32) == 32) {
                this.f16583j = Collections.unmodifiableList(this.f16583j);
                this.f16577d &= -33;
            }
            tVar.f16573j = this.f16583j;
            tVar.f16567d = i11;
            return tVar;
        }

        /* JADX INFO: renamed from: u */
        public b clone() {
            return v().j(t());
        }

        private void A() {
        }
    }
}
