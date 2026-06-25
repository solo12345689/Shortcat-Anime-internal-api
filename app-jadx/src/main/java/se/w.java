package Se;

import Ze.a;
import Ze.d;
import Ze.i;
import Ze.j;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class w extends Ze.i implements Ze.q {

    /* JADX INFO: renamed from: l */
    private static final w f16620l;

    /* JADX INFO: renamed from: m */
    public static Ze.r f16621m = new a();

    /* JADX INFO: renamed from: b */
    private final Ze.d f16622b;

    /* JADX INFO: renamed from: c */
    private int f16623c;

    /* JADX INFO: renamed from: d */
    private int f16624d;

    /* JADX INFO: renamed from: e */
    private int f16625e;

    /* JADX INFO: renamed from: f */
    private c f16626f;

    /* JADX INFO: renamed from: g */
    private int f16627g;

    /* JADX INFO: renamed from: h */
    private int f16628h;

    /* JADX INFO: renamed from: i */
    private d f16629i;

    /* JADX INFO: renamed from: j */
    private byte f16630j;

    /* JADX INFO: renamed from: k */
    private int f16631k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public w b(Ze.e eVar, Ze.g gVar) {
            return new w(eVar, gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c implements j.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* JADX INFO: renamed from: e */
        private static j.b f16642e = new a();

        /* JADX INFO: renamed from: a */
        private final int f16644a;

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
            this.f16644a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // Ze.j.a
        public final int d() {
            return this.f16644a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum d implements j.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* JADX INFO: renamed from: e */
        private static j.b f16648e = new a();

        /* JADX INFO: renamed from: a */
        private final int f16650a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a implements j.b {
            a() {
            }

            @Override // Ze.j.b
            /* JADX INFO: renamed from: b */
            public d a(int i10) {
                return d.a(i10);
            }
        }

        d(int i10, int i11) {
            this.f16650a = i11;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // Ze.j.a
        public final int d() {
            return this.f16650a;
        }
    }

    static {
        w wVar = new w(true);
        f16620l = wVar;
        wVar.N();
    }

    /* synthetic */ w(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static w A() {
        return f16620l;
    }

    private void N() {
        this.f16624d = 0;
        this.f16625e = 0;
        this.f16626f = c.ERROR;
        this.f16627g = 0;
        this.f16628h = 0;
        this.f16629i = d.LANGUAGE_VERSION;
    }

    public static b O() {
        return b.r();
    }

    public static b P(w wVar) {
        return O().j(wVar);
    }

    public int B() {
        return this.f16627g;
    }

    public c C() {
        return this.f16626f;
    }

    public int D() {
        return this.f16628h;
    }

    public int E() {
        return this.f16624d;
    }

    public int F() {
        return this.f16625e;
    }

    public d G() {
        return this.f16629i;
    }

    public boolean H() {
        return (this.f16623c & 8) == 8;
    }

    public boolean I() {
        return (this.f16623c & 4) == 4;
    }

    public boolean J() {
        return (this.f16623c & 16) == 16;
    }

    public boolean K() {
        return (this.f16623c & 1) == 1;
    }

    public boolean L() {
        return (this.f16623c & 2) == 2;
    }

    public boolean M() {
        return (this.f16623c & 32) == 32;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: Q */
    public b a() {
        return O();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: R */
    public b f() {
        return P(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16631k;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16623c & 1) == 1 ? Ze.f.o(1, this.f16624d) : 0;
        if ((this.f16623c & 2) == 2) {
            iO += Ze.f.o(2, this.f16625e);
        }
        if ((this.f16623c & 4) == 4) {
            iO += Ze.f.h(3, this.f16626f.d());
        }
        if ((this.f16623c & 8) == 8) {
            iO += Ze.f.o(4, this.f16627g);
        }
        if ((this.f16623c & 16) == 16) {
            iO += Ze.f.o(5, this.f16628h);
        }
        if ((this.f16623c & 32) == 32) {
            iO += Ze.f.h(6, this.f16629i.d());
        }
        int size = iO + this.f16622b.size();
        this.f16631k = size;
        return size;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16630j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f16630j = (byte) 1;
        return true;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        if ((this.f16623c & 1) == 1) {
            fVar.Z(1, this.f16624d);
        }
        if ((this.f16623c & 2) == 2) {
            fVar.Z(2, this.f16625e);
        }
        if ((this.f16623c & 4) == 4) {
            fVar.R(3, this.f16626f.d());
        }
        if ((this.f16623c & 8) == 8) {
            fVar.Z(4, this.f16627g);
        }
        if ((this.f16623c & 16) == 16) {
            fVar.Z(5, this.f16628h);
        }
        if ((this.f16623c & 32) == 32) {
            fVar.R(6, this.f16629i.d());
        }
        fVar.h0(this.f16622b);
    }

    /* synthetic */ w(i.b bVar, Se.a aVar) {
        this(bVar);
    }

    private w(i.b bVar) {
        super(bVar);
        this.f16630j = (byte) -1;
        this.f16631k = -1;
        this.f16622b = bVar.i();
    }

    private w(boolean z10) {
        this.f16630j = (byte) -1;
        this.f16631k = -1;
        this.f16622b = Ze.d.f23287a;
    }

    private w(Ze.e eVar, Ze.g gVar) {
        this.f16630j = (byte) -1;
        this.f16631k = -1;
        N();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f16623c |= 1;
                            this.f16624d = eVar.r();
                        } else if (iJ == 16) {
                            this.f16623c |= 2;
                            this.f16625e = eVar.r();
                        } else if (iJ == 24) {
                            int iM = eVar.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f16623c |= 4;
                                this.f16626f = cVarA;
                            }
                        } else if (iJ == 32) {
                            this.f16623c |= 8;
                            this.f16627g = eVar.r();
                        } else if (iJ == 40) {
                            this.f16623c |= 16;
                            this.f16628h = eVar.r();
                        } else if (iJ != 48) {
                            if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            int iM2 = eVar.m();
                            d dVarA = d.a(iM2);
                            if (dVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM2);
                            } else {
                                this.f16623c |= 32;
                                this.f16629i = dVarA;
                            }
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
                    this.f16622b = bVarT.h();
                    throw th3;
                }
                this.f16622b = bVarT.h();
                l();
                throw th2;
            }
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16622b = bVarT.h();
            throw th4;
        }
        this.f16622b = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.b implements Ze.q {

        /* JADX INFO: renamed from: b */
        private int f16632b;

        /* JADX INFO: renamed from: c */
        private int f16633c;

        /* JADX INFO: renamed from: d */
        private int f16634d;

        /* JADX INFO: renamed from: f */
        private int f16636f;

        /* JADX INFO: renamed from: g */
        private int f16637g;

        /* JADX INFO: renamed from: e */
        private c f16635e = c.ERROR;

        /* JADX INFO: renamed from: h */
        private d f16638h = d.LANGUAGE_VERSION;

        private b() {
            s();
        }

        public static b r() {
            return new b();
        }

        public b A(int i10) {
            this.f16632b |= 1;
            this.f16633c = i10;
            return this;
        }

        public b B(int i10) {
            this.f16632b |= 2;
            this.f16634d = i10;
            return this;
        }

        public b C(d dVar) {
            dVar.getClass();
            this.f16632b |= 32;
            this.f16638h = dVar;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: n */
        public w build() {
            w wVarP = p();
            if (wVarP.e()) {
                return wVarP;
            }
            throw a.AbstractC0406a.h(wVarP);
        }

        public w p() {
            w wVar = new w(this);
            int i10 = this.f16632b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            wVar.f16624d = this.f16633c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            wVar.f16625e = this.f16634d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            wVar.f16626f = this.f16635e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            wVar.f16627g = this.f16636f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            wVar.f16628h = this.f16637g;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            wVar.f16629i = this.f16638h;
            wVar.f16623c = i11;
            return wVar;
        }

        /* JADX INFO: renamed from: q */
        public b clone() {
            return r().j(p());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: t */
        public b j(w wVar) {
            if (wVar == w.A()) {
                return this;
            }
            if (wVar.K()) {
                A(wVar.E());
            }
            if (wVar.L()) {
                B(wVar.F());
            }
            if (wVar.I()) {
                x(wVar.C());
            }
            if (wVar.H()) {
                v(wVar.B());
            }
            if (wVar.J()) {
                y(wVar.D());
            }
            if (wVar.M()) {
                C(wVar.G());
            }
            k(i().c(wVar.f16622b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.w.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.w.f16621m     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.w r3 = (Se.w) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.w r4 = (Se.w) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.w.b.y1(Ze.e, Ze.g):Se.w$b");
        }

        public b v(int i10) {
            this.f16632b |= 8;
            this.f16636f = i10;
            return this;
        }

        public b x(c cVar) {
            cVar.getClass();
            this.f16632b |= 4;
            this.f16635e = cVar;
            return this;
        }

        public b y(int i10) {
            this.f16632b |= 16;
            this.f16637g = i10;
            return this;
        }

        private void s() {
        }
    }
}
