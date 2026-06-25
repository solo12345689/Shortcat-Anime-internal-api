package Se;

import Ze.a;
import Ze.d;
import Ze.i;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends i.d implements Ze.q {

    /* JADX INFO: renamed from: h */
    private static final h f16289h;

    /* JADX INFO: renamed from: i */
    public static Ze.r f16290i = new a();

    /* JADX INFO: renamed from: c */
    private final Ze.d f16291c;

    /* JADX INFO: renamed from: d */
    private int f16292d;

    /* JADX INFO: renamed from: e */
    private int f16293e;

    /* JADX INFO: renamed from: f */
    private byte f16294f;

    /* JADX INFO: renamed from: g */
    private int f16295g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public h b(Ze.e eVar, Ze.g gVar) {
            return new h(eVar, gVar);
        }
    }

    static {
        h hVar = new h(true);
        f16289h = hVar;
        hVar.I();
    }

    /* synthetic */ h(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static h E() {
        return f16289h;
    }

    private void I() {
        this.f16293e = 0;
    }

    public static b J() {
        return b.v();
    }

    public static b K(h hVar) {
        return J().j(hVar);
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: F */
    public h c() {
        return f16289h;
    }

    public int G() {
        return this.f16293e;
    }

    public boolean H() {
        return (this.f16292d & 1) == 1;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: L */
    public b a() {
        return J();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: M */
    public b f() {
        return K(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16295g;
        if (i10 != -1) {
            return i10;
        }
        int iO = ((this.f16292d & 1) == 1 ? Ze.f.o(1, this.f16293e) : 0) + u() + this.f16291c.size();
        this.f16295g = iO;
        return iO;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16294f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (t()) {
            this.f16294f = (byte) 1;
            return true;
        }
        this.f16294f = (byte) 0;
        return false;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        if ((this.f16292d & 1) == 1) {
            fVar.Z(1, this.f16293e);
        }
        aVarZ.a(200, fVar);
        fVar.h0(this.f16291c);
    }

    /* synthetic */ h(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private h(i.c cVar) {
        super(cVar);
        this.f16294f = (byte) -1;
        this.f16295g = -1;
        this.f16291c = cVar.i();
    }

    private h(boolean z10) {
        this.f16294f = (byte) -1;
        this.f16295g = -1;
        this.f16291c = Ze.d.f23287a;
    }

    private h(Ze.e eVar, Ze.g gVar) {
        this.f16294f = (byte) -1;
        this.f16295g = -1;
        I();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ != 8) {
                            if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            this.f16292d |= 1;
                            this.f16293e = eVar.r();
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
                    this.f16291c = bVarT.h();
                    throw th3;
                }
                this.f16291c = bVarT.h();
                l();
                throw th2;
            }
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16291c = bVarT.h();
            throw th4;
        }
        this.f16291c = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.c implements Ze.q {

        /* JADX INFO: renamed from: d */
        private int f16296d;

        /* JADX INFO: renamed from: e */
        private int f16297e;

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
        public Se.h.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.h.f16290i     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.h r3 = (Se.h) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.h r4 = (Se.h) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.h.b.y1(Ze.e, Ze.g):Se.h$b");
        }

        public b B(int i10) {
            this.f16296d |= 1;
            this.f16297e = i10;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public h build() {
            h hVarT = t();
            if (hVarT.e()) {
                return hVarT;
            }
            throw a.AbstractC0406a.h(hVarT);
        }

        public h t() {
            h hVar = new h(this);
            int i10 = (this.f16296d & 1) != 1 ? 0 : 1;
            hVar.f16293e = this.f16297e;
            hVar.f16292d = i10;
            return hVar;
        }

        /* JADX INFO: renamed from: u */
        public b clone() {
            return v().j(t());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: y */
        public b j(h hVar) {
            if (hVar == h.E()) {
                return this;
            }
            if (hVar.H()) {
                B(hVar.G());
            }
            q(hVar);
            k(i().c(hVar.f16291c));
            return this;
        }

        private void x() {
        }
    }
}
