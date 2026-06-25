package Se;

import Se.i;
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
public final class g extends Ze.i implements Ze.q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final g f16262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Ze.r f16263k = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ze.d f16264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f16266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f16267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f16268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f16269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte f16270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16271i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public g b(Ze.e eVar, Ze.g gVar) {
            return new g(eVar, gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c implements j.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static j.b f16280e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16282a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a implements j.b {
            a() {
            }

            @Override // Ze.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        c(int i10, int i11) {
            this.f16282a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // Ze.j.a
        public final int d() {
            return this.f16282a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum d implements j.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static j.b f16286e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16288a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a implements j.b {
            a() {
            }

            @Override // Ze.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.a(i10);
            }
        }

        d(int i10, int i11) {
            this.f16288a = i11;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // Ze.j.a
        public final int d() {
            return this.f16288a;
        }
    }

    static {
        g gVar = new g(true);
        f16262j = gVar;
        gVar.I();
    }

    public static g A() {
        return f16262j;
    }

    private void I() {
        this.f16266d = c.RETURNS_CONSTANT;
        this.f16267e = Collections.EMPTY_LIST;
        this.f16268f = i.G();
        this.f16269g = d.AT_MOST_ONCE;
    }

    public static b J() {
        return b.r();
    }

    public static b K(g gVar) {
        return J().j(gVar);
    }

    public i B(int i10) {
        return (i) this.f16267e.get(i10);
    }

    public int C() {
        return this.f16267e.size();
    }

    public c D() {
        return this.f16266d;
    }

    public d E() {
        return this.f16269g;
    }

    public boolean F() {
        return (this.f16265c & 2) == 2;
    }

    public boolean G() {
        return (this.f16265c & 1) == 1;
    }

    public boolean H() {
        return (this.f16265c & 4) == 4;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public b a() {
        return J();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public b f() {
        return K(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16271i;
        if (i10 != -1) {
            return i10;
        }
        int iH = (this.f16265c & 1) == 1 ? Ze.f.h(1, this.f16266d.d()) : 0;
        for (int i11 = 0; i11 < this.f16267e.size(); i11++) {
            iH += Ze.f.r(2, (Ze.p) this.f16267e.get(i11));
        }
        if ((this.f16265c & 2) == 2) {
            iH += Ze.f.r(3, this.f16268f);
        }
        if ((this.f16265c & 4) == 4) {
            iH += Ze.f.h(4, this.f16269g.d());
        }
        int size = iH + this.f16264b.size();
        this.f16271i = size;
        return size;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16270h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < C(); i10++) {
            if (!B(i10).e()) {
                this.f16270h = (byte) 0;
                return false;
            }
        }
        if (!F() || z().e()) {
            this.f16270h = (byte) 1;
            return true;
        }
        this.f16270h = (byte) 0;
        return false;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        if ((this.f16265c & 1) == 1) {
            fVar.R(1, this.f16266d.d());
        }
        for (int i10 = 0; i10 < this.f16267e.size(); i10++) {
            fVar.c0(2, (Ze.p) this.f16267e.get(i10));
        }
        if ((this.f16265c & 2) == 2) {
            fVar.c0(3, this.f16268f);
        }
        if ((this.f16265c & 4) == 4) {
            fVar.R(4, this.f16269g.d());
        }
        fVar.h0(this.f16264b);
    }

    public i z() {
        return this.f16268f;
    }

    private g(i.b bVar) {
        super(bVar);
        this.f16270h = (byte) -1;
        this.f16271i = -1;
        this.f16264b = bVar.i();
    }

    private g(boolean z10) {
        this.f16270h = (byte) -1;
        this.f16271i = -1;
        this.f16264b = Ze.d.f23287a;
    }

    private g(Ze.e eVar, Ze.g gVar) {
        this.f16270h = (byte) -1;
        this.f16271i = -1;
        I();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            int iM = eVar.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM);
                            } else {
                                this.f16265c |= 1;
                                this.f16266d = cVarA;
                            }
                        } else if (iJ == 18) {
                            if ((c10 & 2) != 2) {
                                this.f16267e = new ArrayList();
                                c10 = 2;
                            }
                            this.f16267e.add(eVar.t(i.f16299n, gVar));
                        } else if (iJ == 26) {
                            i.b bVarF = (this.f16265c & 2) == 2 ? this.f16268f.f() : null;
                            i iVar = (i) eVar.t(i.f16299n, gVar);
                            this.f16268f = iVar;
                            if (bVarF != null) {
                                bVarF.j(iVar);
                                this.f16268f = bVarF.p();
                            }
                            this.f16265c |= 2;
                        } else if (iJ != 32) {
                            if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            int iM2 = eVar.m();
                            d dVarA = d.a(iM2);
                            if (dVarA == null) {
                                fVarI.n0(iJ);
                                fVarI.n0(iM2);
                            } else {
                                this.f16265c |= 4;
                                this.f16269g = dVarA;
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
                if ((c10 & 2) == 2) {
                    this.f16267e = Collections.unmodifiableList(this.f16267e);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16264b = bVarT.h();
                    throw th3;
                }
                this.f16264b = bVarT.h();
                l();
                throw th2;
            }
        }
        if ((c10 & 2) == 2) {
            this.f16267e = Collections.unmodifiableList(this.f16267e);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16264b = bVarT.h();
            throw th4;
        }
        this.f16264b = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.b implements Ze.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f16273c = c.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f16274d = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i f16275e = i.G();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f16276f = d.AT_MOST_ONCE;

        private b() {
            t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f16272b & 2) != 2) {
                this.f16274d = new ArrayList(this.f16274d);
                this.f16272b |= 2;
            }
        }

        public b A(d dVar) {
            dVar.getClass();
            this.f16272b |= 8;
            this.f16276f = dVar;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public g build() {
            g gVarP = p();
            if (gVarP.e()) {
                return gVarP;
            }
            throw a.AbstractC0406a.h(gVarP);
        }

        public g p() {
            g gVar = new g(this);
            int i10 = this.f16272b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            gVar.f16266d = this.f16273c;
            if ((this.f16272b & 2) == 2) {
                this.f16274d = Collections.unmodifiableList(this.f16274d);
                this.f16272b &= -3;
            }
            gVar.f16267e = this.f16274d;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            gVar.f16268f = this.f16275e;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            gVar.f16269g = this.f16276f;
            gVar.f16265c = i11;
            return gVar;
        }

        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().j(p());
        }

        public b u(i iVar) {
            if ((this.f16272b & 4) != 4 || this.f16275e == i.G()) {
                this.f16275e = iVar;
            } else {
                this.f16275e = i.U(this.f16275e).j(iVar).p();
            }
            this.f16272b |= 4;
            return this;
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b j(g gVar) {
            if (gVar == g.A()) {
                return this;
            }
            if (gVar.G()) {
                y(gVar.D());
            }
            if (!gVar.f16267e.isEmpty()) {
                if (this.f16274d.isEmpty()) {
                    this.f16274d = gVar.f16267e;
                    this.f16272b &= -3;
                } else {
                    s();
                    this.f16274d.addAll(gVar.f16267e);
                }
            }
            if (gVar.F()) {
                u(gVar.z());
            }
            if (gVar.H()) {
                A(gVar.E());
            }
            k(i().c(gVar.f16264b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.g.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.g.f16263k     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.g r3 = (Se.g) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.g r4 = (Se.g) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.g.b.y1(Ze.e, Ze.g):Se.g$b");
        }

        public b y(c cVar) {
            cVar.getClass();
            this.f16272b |= 1;
            this.f16273c = cVar;
            return this;
        }

        private void t() {
        }
    }
}
