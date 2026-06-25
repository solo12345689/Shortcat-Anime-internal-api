package Se;

import Ze.a;
import Ze.d;
import Ze.i;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends Ze.i implements Ze.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f16228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Ze.r f16229i = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ze.d f16230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Ze.d f16233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f16234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16235g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public d b(Ze.e eVar, Ze.g gVar) {
            return new d(eVar, gVar);
        }
    }

    static {
        d dVar = new d(true);
        f16228h = dVar;
        dVar.B();
    }

    private void B() {
        this.f16232d = 0;
        this.f16233e = Ze.d.f23287a;
    }

    public static b C() {
        return b.r();
    }

    public static b D(d dVar) {
        return C().j(dVar);
    }

    public static d x() {
        return f16228h;
    }

    public boolean A() {
        return (this.f16231c & 1) == 1;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b a() {
        return C();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b f() {
        return D(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16235g;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16231c & 1) == 1 ? Ze.f.o(1, this.f16232d) : 0;
        if ((this.f16231c & 2) == 2) {
            iO += Ze.f.d(2, this.f16233e);
        }
        int size = iO + this.f16230b.size();
        this.f16235g = size;
        return size;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16234f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!A()) {
            this.f16234f = (byte) 0;
            return false;
        }
        if (z()) {
            this.f16234f = (byte) 1;
            return true;
        }
        this.f16234f = (byte) 0;
        return false;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        if ((this.f16231c & 1) == 1) {
            fVar.Z(1, this.f16232d);
        }
        if ((this.f16231c & 2) == 2) {
            fVar.N(2, this.f16233e);
        }
        fVar.h0(this.f16230b);
    }

    public Ze.d w() {
        return this.f16233e;
    }

    public int y() {
        return this.f16232d;
    }

    public boolean z() {
        return (this.f16231c & 2) == 2;
    }

    private d(i.b bVar) {
        super(bVar);
        this.f16234f = (byte) -1;
        this.f16235g = -1;
        this.f16230b = bVar.i();
    }

    private d(boolean z10) {
        this.f16234f = (byte) -1;
        this.f16235g = -1;
        this.f16230b = Ze.d.f23287a;
    }

    private d(Ze.e eVar, Ze.g gVar) {
        this.f16234f = (byte) -1;
        this.f16235g = -1;
        B();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f16231c |= 1;
                            this.f16232d = eVar.r();
                        } else if (iJ != 18) {
                            if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            this.f16231c |= 2;
                            this.f16233e = eVar.k();
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
                    this.f16230b = bVarT.h();
                    throw th3;
                }
                this.f16230b = bVarT.h();
                l();
                throw th2;
            }
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16230b = bVarT.h();
            throw th4;
        }
        this.f16230b = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.b implements Ze.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Ze.d f16238d = Ze.d.f23287a;

        private b() {
            s();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public d build() {
            d dVarP = p();
            if (dVarP.e()) {
                return dVarP;
            }
            throw a.AbstractC0406a.h(dVarP);
        }

        public d p() {
            d dVar = new d(this);
            int i10 = this.f16236b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            dVar.f16232d = this.f16237c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            dVar.f16233e = this.f16238d;
            dVar.f16231c = i11;
            return dVar;
        }

        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().j(p());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b j(d dVar) {
            if (dVar == d.x()) {
                return this;
            }
            if (dVar.A()) {
                x(dVar.y());
            }
            if (dVar.z()) {
                v(dVar.w());
            }
            k(i().c(dVar.f16230b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.d.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.d.f16229i     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.d r3 = (Se.d) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.d r4 = (Se.d) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.d.b.y1(Ze.e, Ze.g):Se.d$b");
        }

        public b v(Ze.d dVar) {
            dVar.getClass();
            this.f16236b |= 2;
            this.f16238d = dVar;
            return this;
        }

        public b x(int i10) {
            this.f16236b |= 1;
            this.f16237c = i10;
            return this;
        }

        private void s() {
        }
    }
}
