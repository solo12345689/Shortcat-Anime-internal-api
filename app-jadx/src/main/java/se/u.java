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
public final class u extends Ze.i implements Ze.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u f16590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Ze.r f16591i = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ze.d f16592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f16594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f16596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16597g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public u b(Ze.e eVar, Ze.g gVar) {
            return new u(eVar, gVar);
        }
    }

    static {
        u uVar = new u(true);
        f16590h = uVar;
        uVar.D();
    }

    private void D() {
        this.f16594d = Collections.EMPTY_LIST;
        this.f16595e = -1;
    }

    public static b E() {
        return b.r();
    }

    public static b F(u uVar) {
        return E().j(uVar);
    }

    public static u x() {
        return f16590h;
    }

    public int A() {
        return this.f16594d.size();
    }

    public List B() {
        return this.f16594d;
    }

    public boolean C() {
        return (this.f16593c & 1) == 1;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b a() {
        return E();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b f() {
        return F(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16597g;
        if (i10 != -1) {
            return i10;
        }
        int iO = 0;
        for (int i11 = 0; i11 < this.f16594d.size(); i11++) {
            iO += Ze.f.r(1, (Ze.p) this.f16594d.get(i11));
        }
        if ((this.f16593c & 1) == 1) {
            iO += Ze.f.o(2, this.f16595e);
        }
        int size = iO + this.f16592b.size();
        this.f16597g = size;
        return size;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16596f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < A(); i10++) {
            if (!z(i10).e()) {
                this.f16596f = (byte) 0;
                return false;
            }
        }
        this.f16596f = (byte) 1;
        return true;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f16594d.size(); i10++) {
            fVar.c0(1, (Ze.p) this.f16594d.get(i10));
        }
        if ((this.f16593c & 1) == 1) {
            fVar.Z(2, this.f16595e);
        }
        fVar.h0(this.f16592b);
    }

    public int y() {
        return this.f16595e;
    }

    public r z(int i10) {
        return (r) this.f16594d.get(i10);
    }

    private u(i.b bVar) {
        super(bVar);
        this.f16596f = (byte) -1;
        this.f16597g = -1;
        this.f16592b = bVar.i();
    }

    private u(boolean z10) {
        this.f16596f = (byte) -1;
        this.f16597g = -1;
        this.f16592b = Ze.d.f23287a;
    }

    private u(Ze.e eVar, Ze.g gVar) {
        this.f16596f = (byte) -1;
        this.f16597g = -1;
        D();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            if (!z11) {
                                this.f16594d = new ArrayList();
                                z11 = true;
                            }
                            this.f16594d.add(eVar.t(r.f16483v, gVar));
                        } else if (iJ != 16) {
                            if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            this.f16593c |= 1;
                            this.f16595e = eVar.r();
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
                    this.f16594d = Collections.unmodifiableList(this.f16594d);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16592b = bVarT.h();
                    throw th3;
                }
                this.f16592b = bVarT.h();
                l();
                throw th2;
            }
        }
        if (z11) {
            this.f16594d = Collections.unmodifiableList(this.f16594d);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16592b = bVarT.h();
            throw th4;
        }
        this.f16592b = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.b implements Ze.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f16599c = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16600d = -1;

        private b() {
            t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f16598b & 1) != 1) {
                this.f16599c = new ArrayList(this.f16599c);
                this.f16598b |= 1;
            }
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public u build() {
            u uVarP = p();
            if (uVarP.e()) {
                return uVarP;
            }
            throw a.AbstractC0406a.h(uVarP);
        }

        public u p() {
            u uVar = new u(this);
            int i10 = this.f16598b;
            if ((i10 & 1) == 1) {
                this.f16599c = Collections.unmodifiableList(this.f16599c);
                this.f16598b &= -2;
            }
            uVar.f16594d = this.f16599c;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            uVar.f16595e = this.f16600d;
            uVar.f16593c = i11;
            return uVar;
        }

        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().j(p());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b j(u uVar) {
            if (uVar == u.x()) {
                return this;
            }
            if (!uVar.f16594d.isEmpty()) {
                if (this.f16599c.isEmpty()) {
                    this.f16599c = uVar.f16594d;
                    this.f16598b &= -2;
                } else {
                    s();
                    this.f16599c.addAll(uVar.f16594d);
                }
            }
            if (uVar.C()) {
                x(uVar.y());
            }
            k(i().c(uVar.f16592b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.u.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.u.f16591i     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.u r3 = (Se.u) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.u r4 = (Se.u) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.u.b.y1(Ze.e, Ze.g):Se.u$b");
        }

        public b x(int i10) {
            this.f16598b |= 2;
            this.f16600d = i10;
            return this;
        }

        private void t() {
        }
    }
}
