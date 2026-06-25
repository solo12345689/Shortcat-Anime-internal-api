package Se;

import Se.r;
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
public final class i extends Ze.i implements Ze.q {

    /* JADX INFO: renamed from: m */
    private static final i f16298m;

    /* JADX INFO: renamed from: n */
    public static Ze.r f16299n = new a();

    /* JADX INFO: renamed from: b */
    private final Ze.d f16300b;

    /* JADX INFO: renamed from: c */
    private int f16301c;

    /* JADX INFO: renamed from: d */
    private int f16302d;

    /* JADX INFO: renamed from: e */
    private int f16303e;

    /* JADX INFO: renamed from: f */
    private c f16304f;

    /* JADX INFO: renamed from: g */
    private r f16305g;

    /* JADX INFO: renamed from: h */
    private int f16306h;

    /* JADX INFO: renamed from: i */
    private List f16307i;

    /* JADX INFO: renamed from: j */
    private List f16308j;

    /* JADX INFO: renamed from: k */
    private byte f16309k;

    /* JADX INFO: renamed from: l */
    private int f16310l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public i b(Ze.e eVar, Ze.g gVar) {
            return new i(eVar, gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c implements j.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* JADX INFO: renamed from: e */
        private static j.b f16322e = new a();

        /* JADX INFO: renamed from: a */
        private final int f16324a;

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
            this.f16324a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // Ze.j.a
        public final int d() {
            return this.f16324a;
        }
    }

    static {
        i iVar = new i(true);
        f16298m = iVar;
        iVar.S();
    }

    /* synthetic */ i(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static i G() {
        return f16298m;
    }

    private void S() {
        this.f16302d = 0;
        this.f16303e = 0;
        this.f16304f = c.TRUE;
        this.f16305g = r.Y();
        this.f16306h = 0;
        List list = Collections.EMPTY_LIST;
        this.f16307i = list;
        this.f16308j = list;
    }

    public static b T() {
        return b.r();
    }

    public static b U(i iVar) {
        return T().j(iVar);
    }

    public i D(int i10) {
        return (i) this.f16307i.get(i10);
    }

    public int E() {
        return this.f16307i.size();
    }

    public c F() {
        return this.f16304f;
    }

    public int H() {
        return this.f16302d;
    }

    public r I() {
        return this.f16305g;
    }

    public int J() {
        return this.f16306h;
    }

    public i K(int i10) {
        return (i) this.f16308j.get(i10);
    }

    public int L() {
        return this.f16308j.size();
    }

    public int M() {
        return this.f16303e;
    }

    public boolean N() {
        return (this.f16301c & 4) == 4;
    }

    public boolean O() {
        return (this.f16301c & 1) == 1;
    }

    public boolean P() {
        return (this.f16301c & 8) == 8;
    }

    public boolean Q() {
        return (this.f16301c & 16) == 16;
    }

    public boolean R() {
        return (this.f16301c & 2) == 2;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: V */
    public b a() {
        return T();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: W */
    public b f() {
        return U(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16310l;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16301c & 1) == 1 ? Ze.f.o(1, this.f16302d) : 0;
        if ((this.f16301c & 2) == 2) {
            iO += Ze.f.o(2, this.f16303e);
        }
        if ((this.f16301c & 4) == 4) {
            iO += Ze.f.h(3, this.f16304f.d());
        }
        if ((this.f16301c & 8) == 8) {
            iO += Ze.f.r(4, this.f16305g);
        }
        if ((this.f16301c & 16) == 16) {
            iO += Ze.f.o(5, this.f16306h);
        }
        for (int i11 = 0; i11 < this.f16307i.size(); i11++) {
            iO += Ze.f.r(6, (Ze.p) this.f16307i.get(i11));
        }
        for (int i12 = 0; i12 < this.f16308j.size(); i12++) {
            iO += Ze.f.r(7, (Ze.p) this.f16308j.get(i12));
        }
        int size = iO + this.f16300b.size();
        this.f16310l = size;
        return size;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16309k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (P() && !I().e()) {
            this.f16309k = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < E(); i10++) {
            if (!D(i10).e()) {
                this.f16309k = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < L(); i11++) {
            if (!K(i11).e()) {
                this.f16309k = (byte) 0;
                return false;
            }
        }
        this.f16309k = (byte) 1;
        return true;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        if ((this.f16301c & 1) == 1) {
            fVar.Z(1, this.f16302d);
        }
        if ((this.f16301c & 2) == 2) {
            fVar.Z(2, this.f16303e);
        }
        if ((this.f16301c & 4) == 4) {
            fVar.R(3, this.f16304f.d());
        }
        if ((this.f16301c & 8) == 8) {
            fVar.c0(4, this.f16305g);
        }
        if ((this.f16301c & 16) == 16) {
            fVar.Z(5, this.f16306h);
        }
        for (int i10 = 0; i10 < this.f16307i.size(); i10++) {
            fVar.c0(6, (Ze.p) this.f16307i.get(i10));
        }
        for (int i11 = 0; i11 < this.f16308j.size(); i11++) {
            fVar.c0(7, (Ze.p) this.f16308j.get(i11));
        }
        fVar.h0(this.f16300b);
    }

    /* synthetic */ i(i.b bVar, Se.a aVar) {
        this(bVar);
    }

    private i(i.b bVar) {
        super(bVar);
        this.f16309k = (byte) -1;
        this.f16310l = -1;
        this.f16300b = bVar.i();
    }

    private i(boolean z10) {
        this.f16309k = (byte) -1;
        this.f16310l = -1;
        this.f16300b = Ze.d.f23287a;
    }

    private i(Ze.e eVar, Ze.g gVar) {
        this.f16309k = (byte) -1;
        this.f16310l = -1;
        S();
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
                            this.f16301c |= 1;
                            this.f16302d = eVar.r();
                        } else if (iJ == 16) {
                            this.f16301c |= 2;
                            this.f16303e = eVar.r();
                        } else if (iJ == 24) {
                            int iM = eVar.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f16301c |= 4;
                                this.f16304f = cVarA;
                            }
                        } else if (iJ == 34) {
                            r.c cVarF = (this.f16301c & 8) == 8 ? this.f16305g.f() : null;
                            r rVar = (r) eVar.t(r.f16483v, gVar);
                            this.f16305g = rVar;
                            if (cVarF != null) {
                                cVarF.j(rVar);
                                this.f16305g = cVarF.t();
                            }
                            this.f16301c |= 8;
                        } else if (iJ == 40) {
                            this.f16301c |= 16;
                            this.f16306h = eVar.r();
                        } else if (iJ == 50) {
                            if ((i10 & 32) != 32) {
                                this.f16307i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f16307i.add(eVar.t(f16299n, gVar));
                        } else if (iJ != 58) {
                            if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            if ((i10 & 64) != 64) {
                                this.f16308j = new ArrayList();
                                i10 |= 64;
                            }
                            this.f16308j.add(eVar.t(f16299n, gVar));
                        }
                    }
                    z10 = true;
                } catch (Ze.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new Ze.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 32) == 32) {
                    this.f16307i = Collections.unmodifiableList(this.f16307i);
                }
                if ((i10 & 64) == 64) {
                    this.f16308j = Collections.unmodifiableList(this.f16308j);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16300b = bVarT.h();
                    throw th3;
                }
                this.f16300b = bVarT.h();
                l();
                throw th2;
            }
        }
        if ((i10 & 32) == 32) {
            this.f16307i = Collections.unmodifiableList(this.f16307i);
        }
        if ((i10 & 64) == 64) {
            this.f16308j = Collections.unmodifiableList(this.f16308j);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16300b = bVarT.h();
            throw th4;
        }
        this.f16300b = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.b implements Ze.q {

        /* JADX INFO: renamed from: b */
        private int f16311b;

        /* JADX INFO: renamed from: c */
        private int f16312c;

        /* JADX INFO: renamed from: d */
        private int f16313d;

        /* JADX INFO: renamed from: e */
        private c f16314e = c.TRUE;

        /* JADX INFO: renamed from: f */
        private r f16315f = r.Y();

        /* JADX INFO: renamed from: g */
        private int f16316g;

        /* JADX INFO: renamed from: h */
        private List f16317h;

        /* JADX INFO: renamed from: i */
        private List f16318i;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f16317h = list;
            this.f16318i = list;
            u();
        }

        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f16311b & 32) != 32) {
                this.f16317h = new ArrayList(this.f16317h);
                this.f16311b |= 32;
            }
        }

        private void t() {
            if ((this.f16311b & 64) != 64) {
                this.f16318i = new ArrayList(this.f16318i);
                this.f16311b |= 64;
            }
        }

        public b A(c cVar) {
            cVar.getClass();
            this.f16311b |= 4;
            this.f16314e = cVar;
            return this;
        }

        public b B(int i10) {
            this.f16311b |= 1;
            this.f16312c = i10;
            return this;
        }

        public b C(int i10) {
            this.f16311b |= 16;
            this.f16316g = i10;
            return this;
        }

        public b D(int i10) {
            this.f16311b |= 2;
            this.f16313d = i10;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: n */
        public i build() {
            i iVarP = p();
            if (iVarP.e()) {
                return iVarP;
            }
            throw a.AbstractC0406a.h(iVarP);
        }

        public i p() {
            i iVar = new i(this);
            int i10 = this.f16311b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            iVar.f16302d = this.f16312c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            iVar.f16303e = this.f16313d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            iVar.f16304f = this.f16314e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            iVar.f16305g = this.f16315f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            iVar.f16306h = this.f16316g;
            if ((this.f16311b & 32) == 32) {
                this.f16317h = Collections.unmodifiableList(this.f16317h);
                this.f16311b &= -33;
            }
            iVar.f16307i = this.f16317h;
            if ((this.f16311b & 64) == 64) {
                this.f16318i = Collections.unmodifiableList(this.f16318i);
                this.f16311b &= -65;
            }
            iVar.f16308j = this.f16318i;
            iVar.f16301c = i11;
            return iVar;
        }

        /* JADX INFO: renamed from: q */
        public b clone() {
            return r().j(p());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: v */
        public b j(i iVar) {
            if (iVar == i.G()) {
                return this;
            }
            if (iVar.O()) {
                B(iVar.H());
            }
            if (iVar.R()) {
                D(iVar.M());
            }
            if (iVar.N()) {
                A(iVar.F());
            }
            if (iVar.P()) {
                y(iVar.I());
            }
            if (iVar.Q()) {
                C(iVar.J());
            }
            if (!iVar.f16307i.isEmpty()) {
                if (this.f16317h.isEmpty()) {
                    this.f16317h = iVar.f16307i;
                    this.f16311b &= -33;
                } else {
                    s();
                    this.f16317h.addAll(iVar.f16307i);
                }
            }
            if (!iVar.f16308j.isEmpty()) {
                if (this.f16318i.isEmpty()) {
                    this.f16318i = iVar.f16308j;
                    this.f16311b &= -65;
                } else {
                    t();
                    this.f16318i.addAll(iVar.f16308j);
                }
            }
            k(i().c(iVar.f16300b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: x */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.i.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.i.f16299n     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.i r3 = (Se.i) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.i r4 = (Se.i) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.i.b.y1(Ze.e, Ze.g):Se.i$b");
        }

        public b y(r rVar) {
            if ((this.f16311b & 8) != 8 || this.f16315f == r.Y()) {
                this.f16315f = rVar;
            } else {
                this.f16315f = r.z0(this.f16315f).j(rVar).t();
            }
            this.f16311b |= 8;
            return this;
        }

        private void u() {
        }
    }
}
