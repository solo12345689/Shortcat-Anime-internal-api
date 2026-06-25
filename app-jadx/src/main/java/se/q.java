package Se;

import Ze.a;
import Ze.d;
import Ze.i;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class q extends Ze.i implements Ze.q {

    /* JADX INFO: renamed from: f */
    private static final q f16474f;

    /* JADX INFO: renamed from: g */
    public static Ze.r f16475g = new a();

    /* JADX INFO: renamed from: b */
    private final Ze.d f16476b;

    /* JADX INFO: renamed from: c */
    private Ze.n f16477c;

    /* JADX INFO: renamed from: d */
    private byte f16478d;

    /* JADX INFO: renamed from: e */
    private int f16479e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public q b(Ze.e eVar, Ze.g gVar) {
            return new q(eVar, gVar);
        }
    }

    static {
        q qVar = new q(true);
        f16474f = qVar;
        qVar.y();
    }

    /* synthetic */ q(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static b A(q qVar) {
        return z().j(qVar);
    }

    public static q v() {
        return f16474f;
    }

    private void y() {
        this.f16477c = Ze.m.f23346b;
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
        int i10 = this.f16479e;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f16477c.size(); i11++) {
            iE += Ze.f.e(this.f16477c.G0(i11));
        }
        int size = iE + x().size() + this.f16476b.size();
        this.f16479e = size;
        return size;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16478d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f16478d = (byte) 1;
        return true;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f16477c.size(); i10++) {
            fVar.N(1, this.f16477c.G0(i10));
        }
        fVar.h0(this.f16476b);
    }

    public String w(int i10) {
        return (String) this.f16477c.get(i10);
    }

    public Ze.s x() {
        return this.f16477c;
    }

    /* synthetic */ q(i.b bVar, Se.a aVar) {
        this(bVar);
    }

    private q(i.b bVar) {
        super(bVar);
        this.f16478d = (byte) -1;
        this.f16479e = -1;
        this.f16476b = bVar.i();
    }

    private q(boolean z10) {
        this.f16478d = (byte) -1;
        this.f16479e = -1;
        this.f16476b = Ze.d.f23287a;
    }

    private q(Ze.e eVar, Ze.g gVar) {
        this.f16478d = (byte) -1;
        this.f16479e = -1;
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
                            Ze.d dVarK = eVar.k();
                            if (!z11) {
                                this.f16477c = new Ze.m();
                                z11 = true;
                            }
                            this.f16477c.S1(dVarK);
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
                    this.f16477c = this.f16477c.J();
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16476b = bVarT.h();
                    throw th3;
                }
                this.f16476b = bVarT.h();
                l();
                throw th2;
            }
        }
        if (z11) {
            this.f16477c = this.f16477c.J();
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16476b = bVarT.h();
            throw th4;
        }
        this.f16476b = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.b implements Ze.q {

        /* JADX INFO: renamed from: b */
        private int f16480b;

        /* JADX INFO: renamed from: c */
        private Ze.n f16481c = Ze.m.f23346b;

        private b() {
            t();
        }

        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f16480b & 1) != 1) {
                this.f16481c = new Ze.m(this.f16481c);
                this.f16480b |= 1;
            }
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: n */
        public q build() {
            q qVarP = p();
            if (qVarP.e()) {
                return qVarP;
            }
            throw a.AbstractC0406a.h(qVarP);
        }

        public q p() {
            q qVar = new q(this);
            if ((this.f16480b & 1) == 1) {
                this.f16481c = this.f16481c.J();
                this.f16480b &= -2;
            }
            qVar.f16477c = this.f16481c;
            return qVar;
        }

        /* JADX INFO: renamed from: q */
        public b clone() {
            return r().j(p());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: u */
        public b j(q qVar) {
            if (qVar == q.v()) {
                return this;
            }
            if (!qVar.f16477c.isEmpty()) {
                if (this.f16481c.isEmpty()) {
                    this.f16481c = qVar.f16477c;
                    this.f16480b &= -2;
                } else {
                    s();
                    this.f16481c.addAll(qVar.f16477c);
                }
            }
            k(i().c(qVar.f16476b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: v */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.q.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.q.f16475g     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.q r3 = (Se.q) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.q r4 = (Se.q) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.q.b.y1(Ze.e, Ze.g):Se.q$b");
        }

        private void t() {
        }
    }
}
