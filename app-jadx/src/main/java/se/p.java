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
public final class p extends Ze.i implements Ze.q {

    /* JADX INFO: renamed from: f */
    private static final p f16447f;

    /* JADX INFO: renamed from: g */
    public static Ze.r f16448g = new a();

    /* JADX INFO: renamed from: b */
    private final Ze.d f16449b;

    /* JADX INFO: renamed from: c */
    private List f16450c;

    /* JADX INFO: renamed from: d */
    private byte f16451d;

    /* JADX INFO: renamed from: e */
    private int f16452e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public p b(Ze.e eVar, Ze.g gVar) {
            return new p(eVar, gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends Ze.i implements Ze.q {

        /* JADX INFO: renamed from: i */
        private static final c f16455i;

        /* JADX INFO: renamed from: j */
        public static Ze.r f16456j = new a();

        /* JADX INFO: renamed from: b */
        private final Ze.d f16457b;

        /* JADX INFO: renamed from: c */
        private int f16458c;

        /* JADX INFO: renamed from: d */
        private int f16459d;

        /* JADX INFO: renamed from: e */
        private int f16460e;

        /* JADX INFO: renamed from: f */
        private EnumC0283c f16461f;

        /* JADX INFO: renamed from: g */
        private byte f16462g;

        /* JADX INFO: renamed from: h */
        private int f16463h;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a extends Ze.b {
            a() {
            }

            @Override // Ze.r
            /* JADX INFO: renamed from: j */
            public c b(Ze.e eVar, Ze.g gVar) {
                return new c(eVar, gVar);
            }
        }

        /* JADX INFO: renamed from: Se.p$c$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum EnumC0283c implements j.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* JADX INFO: renamed from: e */
            private static j.b f16471e = new a();

            /* JADX INFO: renamed from: a */
            private final int f16473a;

            /* JADX INFO: renamed from: Se.p$c$c$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static class a implements j.b {
                a() {
                }

                @Override // Ze.j.b
                /* JADX INFO: renamed from: b */
                public EnumC0283c a(int i10) {
                    return EnumC0283c.a(i10);
                }
            }

            EnumC0283c(int i10, int i11) {
                this.f16473a = i11;
            }

            public static EnumC0283c a(int i10) {
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return PACKAGE;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // Ze.j.a
            public final int d() {
                return this.f16473a;
            }
        }

        static {
            c cVar = new c(true);
            f16455i = cVar;
            cVar.E();
        }

        /* synthetic */ c(Ze.e eVar, Ze.g gVar, Se.a aVar) {
            this(eVar, gVar);
        }

        private void E() {
            this.f16459d = -1;
            this.f16460e = 0;
            this.f16461f = EnumC0283c.PACKAGE;
        }

        public static b F() {
            return b.r();
        }

        public static b G(c cVar) {
            return F().j(cVar);
        }

        public static c x() {
            return f16455i;
        }

        public int A() {
            return this.f16460e;
        }

        public boolean B() {
            return (this.f16458c & 4) == 4;
        }

        public boolean C() {
            return (this.f16458c & 1) == 1;
        }

        public boolean D() {
            return (this.f16458c & 2) == 2;
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: H */
        public b a() {
            return F();
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: I */
        public b f() {
            return G(this);
        }

        @Override // Ze.p
        public int d() {
            int i10 = this.f16463h;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f16458c & 1) == 1 ? Ze.f.o(1, this.f16459d) : 0;
            if ((this.f16458c & 2) == 2) {
                iO += Ze.f.o(2, this.f16460e);
            }
            if ((this.f16458c & 4) == 4) {
                iO += Ze.f.h(3, this.f16461f.d());
            }
            int size = iO + this.f16457b.size();
            this.f16463h = size;
            return size;
        }

        @Override // Ze.q
        public final boolean e() {
            byte b10 = this.f16462g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (D()) {
                this.f16462g = (byte) 1;
                return true;
            }
            this.f16462g = (byte) 0;
            return false;
        }

        @Override // Ze.p
        public void g(Ze.f fVar) throws IOException {
            d();
            if ((this.f16458c & 1) == 1) {
                fVar.Z(1, this.f16459d);
            }
            if ((this.f16458c & 2) == 2) {
                fVar.Z(2, this.f16460e);
            }
            if ((this.f16458c & 4) == 4) {
                fVar.R(3, this.f16461f.d());
            }
            fVar.h0(this.f16457b);
        }

        public EnumC0283c y() {
            return this.f16461f;
        }

        public int z() {
            return this.f16459d;
        }

        /* synthetic */ c(i.b bVar, Se.a aVar) {
            this(bVar);
        }

        private c(i.b bVar) {
            super(bVar);
            this.f16462g = (byte) -1;
            this.f16463h = -1;
            this.f16457b = bVar.i();
        }

        private c(boolean z10) {
            this.f16462g = (byte) -1;
            this.f16463h = -1;
            this.f16457b = Ze.d.f23287a;
        }

        private c(Ze.e eVar, Ze.g gVar) {
            this.f16462g = (byte) -1;
            this.f16463h = -1;
            E();
            d.b bVarT = Ze.d.t();
            Ze.f fVarI = Ze.f.I(bVarT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.f16458c |= 1;
                                    this.f16459d = eVar.r();
                                } else if (iJ == 16) {
                                    this.f16458c |= 2;
                                    this.f16460e = eVar.r();
                                } else if (iJ != 24) {
                                    if (!p(eVar, fVarI, gVar, iJ)) {
                                    }
                                } else {
                                    int iM = eVar.m();
                                    EnumC0283c enumC0283cA = EnumC0283c.a(iM);
                                    if (enumC0283cA == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f16458c |= 4;
                                        this.f16461f = enumC0283cA;
                                    }
                                }
                            }
                            z10 = true;
                        } catch (Ze.k e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new Ze.k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f16457b = bVarT.h();
                        throw th3;
                    }
                    this.f16457b = bVarT.h();
                    l();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f16457b = bVarT.h();
                throw th4;
            }
            this.f16457b = bVarT.h();
            l();
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends i.b implements Ze.q {

            /* JADX INFO: renamed from: b */
            private int f16464b;

            /* JADX INFO: renamed from: d */
            private int f16466d;

            /* JADX INFO: renamed from: c */
            private int f16465c = -1;

            /* JADX INFO: renamed from: e */
            private EnumC0283c f16467e = EnumC0283c.PACKAGE;

            private b() {
                s();
            }

            public static b r() {
                return new b();
            }

            @Override // Ze.p.a
            /* JADX INFO: renamed from: n */
            public c build() {
                c cVarP = p();
                if (cVarP.e()) {
                    return cVarP;
                }
                throw a.AbstractC0406a.h(cVarP);
            }

            public c p() {
                c cVar = new c(this);
                int i10 = this.f16464b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f16459d = this.f16465c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f16460e = this.f16466d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                cVar.f16461f = this.f16467e;
                cVar.f16458c = i11;
                return cVar;
            }

            /* JADX INFO: renamed from: q */
            public b clone() {
                return r().j(p());
            }

            @Override // Ze.i.b
            /* JADX INFO: renamed from: t */
            public b j(c cVar) {
                if (cVar == c.x()) {
                    return this;
                }
                if (cVar.C()) {
                    x(cVar.z());
                }
                if (cVar.D()) {
                    y(cVar.A());
                }
                if (cVar.B()) {
                    v(cVar.y());
                }
                k(i().c(cVar.f16457b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // Ze.p.a
            /* JADX INFO: renamed from: u */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Se.p.c.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    Ze.r r1 = Se.p.c.f16456j     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    Se.p$c r3 = (Se.p.c) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                    Se.p$c r4 = (Se.p.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Se.p.c.b.y1(Ze.e, Ze.g):Se.p$c$b");
            }

            public b v(EnumC0283c enumC0283c) {
                enumC0283c.getClass();
                this.f16464b |= 4;
                this.f16467e = enumC0283c;
                return this;
            }

            public b x(int i10) {
                this.f16464b |= 1;
                this.f16465c = i10;
                return this;
            }

            public b y(int i10) {
                this.f16464b |= 2;
                this.f16466d = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    static {
        p pVar = new p(true);
        f16447f = pVar;
        pVar.y();
    }

    /* synthetic */ p(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static b A(p pVar) {
        return z().j(pVar);
    }

    public static p v() {
        return f16447f;
    }

    private void y() {
        this.f16450c = Collections.EMPTY_LIST;
    }

    public static b z() {
        return b.r();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: B */
    public b a() {
        return z();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: C */
    public b f() {
        return A(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16452e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f16450c.size(); i11++) {
            iR += Ze.f.r(1, (Ze.p) this.f16450c.get(i11));
        }
        int size = iR + this.f16449b.size();
        this.f16452e = size;
        return size;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16451d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < x(); i10++) {
            if (!w(i10).e()) {
                this.f16451d = (byte) 0;
                return false;
            }
        }
        this.f16451d = (byte) 1;
        return true;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f16450c.size(); i10++) {
            fVar.c0(1, (Ze.p) this.f16450c.get(i10));
        }
        fVar.h0(this.f16449b);
    }

    public c w(int i10) {
        return (c) this.f16450c.get(i10);
    }

    public int x() {
        return this.f16450c.size();
    }

    /* synthetic */ p(i.b bVar, Se.a aVar) {
        this(bVar);
    }

    private p(i.b bVar) {
        super(bVar);
        this.f16451d = (byte) -1;
        this.f16452e = -1;
        this.f16449b = bVar.i();
    }

    private p(boolean z10) {
        this.f16451d = (byte) -1;
        this.f16452e = -1;
        this.f16449b = Ze.d.f23287a;
    }

    private p(Ze.e eVar, Ze.g gVar) {
        this.f16451d = (byte) -1;
        this.f16452e = -1;
        y();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ != 10) {
                            if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            if (!z11) {
                                this.f16450c = new ArrayList();
                                z11 = true;
                            }
                            this.f16450c.add(eVar.t(c.f16456j, gVar));
                        }
                    }
                    z10 = true;
                } catch (Ze.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new Ze.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.f16450c = Collections.unmodifiableList(this.f16450c);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16449b = bVarT.h();
                    throw th3;
                }
                this.f16449b = bVarT.h();
                l();
                throw th2;
            }
        }
        if (z11) {
            this.f16450c = Collections.unmodifiableList(this.f16450c);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16449b = bVarT.h();
            throw th4;
        }
        this.f16449b = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.b implements Ze.q {

        /* JADX INFO: renamed from: b */
        private int f16453b;

        /* JADX INFO: renamed from: c */
        private List f16454c = Collections.EMPTY_LIST;

        private b() {
            t();
        }

        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f16453b & 1) != 1) {
                this.f16454c = new ArrayList(this.f16454c);
                this.f16453b |= 1;
            }
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: n */
        public p build() {
            p pVarP = p();
            if (pVarP.e()) {
                return pVarP;
            }
            throw a.AbstractC0406a.h(pVarP);
        }

        public p p() {
            p pVar = new p(this);
            if ((this.f16453b & 1) == 1) {
                this.f16454c = Collections.unmodifiableList(this.f16454c);
                this.f16453b &= -2;
            }
            pVar.f16450c = this.f16454c;
            return pVar;
        }

        /* JADX INFO: renamed from: q */
        public b clone() {
            return r().j(p());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: u */
        public b j(p pVar) {
            if (pVar == p.v()) {
                return this;
            }
            if (!pVar.f16450c.isEmpty()) {
                if (this.f16454c.isEmpty()) {
                    this.f16454c = pVar.f16450c;
                    this.f16453b &= -2;
                } else {
                    s();
                    this.f16454c.addAll(pVar.f16450c);
                }
            }
            k(i().c(pVar.f16449b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: v */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.p.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.p.f16448g     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.p r3 = (Se.p) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.p r4 = (Se.p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.p.b.y1(Ze.e, Ze.g):Se.p$b");
        }

        private void t() {
        }
    }
}
