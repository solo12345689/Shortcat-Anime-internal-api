package Se;

import Se.u;
import Se.x;
import Ze.a;
import Ze.d;
import Ze.i;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class m extends i.d implements Ze.q {

    /* JADX INFO: renamed from: l */
    private static final m f16377l;

    /* JADX INFO: renamed from: m */
    public static Ze.r f16378m = new a();

    /* JADX INFO: renamed from: c */
    private final Ze.d f16379c;

    /* JADX INFO: renamed from: d */
    private int f16380d;

    /* JADX INFO: renamed from: e */
    private List f16381e;

    /* JADX INFO: renamed from: f */
    private List f16382f;

    /* JADX INFO: renamed from: g */
    private List f16383g;

    /* JADX INFO: renamed from: h */
    private u f16384h;

    /* JADX INFO: renamed from: i */
    private x f16385i;

    /* JADX INFO: renamed from: j */
    private byte f16386j;

    /* JADX INFO: renamed from: k */
    private int f16387k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public m b(Ze.e eVar, Ze.g gVar) {
            return new m(eVar, gVar);
        }
    }

    static {
        m mVar = new m(true);
        f16377l = mVar;
        mVar.a0();
    }

    /* synthetic */ m(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static m L() {
        return f16377l;
    }

    private void a0() {
        List list = Collections.EMPTY_LIST;
        this.f16381e = list;
        this.f16382f = list;
        this.f16383g = list;
        this.f16384h = u.x();
        this.f16385i = x.v();
    }

    public static b b0() {
        return b.v();
    }

    public static b c0(m mVar) {
        return b0().j(mVar);
    }

    public static m e0(InputStream inputStream, Ze.g gVar) {
        return (m) f16378m.c(inputStream, gVar);
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: M */
    public m c() {
        return f16377l;
    }

    public j N(int i10) {
        return (j) this.f16381e.get(i10);
    }

    public int O() {
        return this.f16381e.size();
    }

    public List P() {
        return this.f16381e;
    }

    public o Q(int i10) {
        return (o) this.f16382f.get(i10);
    }

    public int R() {
        return this.f16382f.size();
    }

    public List S() {
        return this.f16382f;
    }

    public s T(int i10) {
        return (s) this.f16383g.get(i10);
    }

    public int U() {
        return this.f16383g.size();
    }

    public List V() {
        return this.f16383g;
    }

    public u W() {
        return this.f16384h;
    }

    public x X() {
        return this.f16385i;
    }

    public boolean Y() {
        return (this.f16380d & 1) == 1;
    }

    public boolean Z() {
        return (this.f16380d & 2) == 2;
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16387k;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f16381e.size(); i11++) {
            iR += Ze.f.r(3, (Ze.p) this.f16381e.get(i11));
        }
        for (int i12 = 0; i12 < this.f16382f.size(); i12++) {
            iR += Ze.f.r(4, (Ze.p) this.f16382f.get(i12));
        }
        for (int i13 = 0; i13 < this.f16383g.size(); i13++) {
            iR += Ze.f.r(5, (Ze.p) this.f16383g.get(i13));
        }
        if ((this.f16380d & 1) == 1) {
            iR += Ze.f.r(30, this.f16384h);
        }
        if ((this.f16380d & 2) == 2) {
            iR += Ze.f.r(32, this.f16385i);
        }
        int iU = iR + u() + this.f16379c.size();
        this.f16387k = iU;
        return iU;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: d0 */
    public b a() {
        return b0();
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16386j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < O(); i10++) {
            if (!N(i10).e()) {
                this.f16386j = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < R(); i11++) {
            if (!Q(i11).e()) {
                this.f16386j = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < U(); i12++) {
            if (!T(i12).e()) {
                this.f16386j = (byte) 0;
                return false;
            }
        }
        if (Y() && !W().e()) {
            this.f16386j = (byte) 0;
            return false;
        }
        if (t()) {
            this.f16386j = (byte) 1;
            return true;
        }
        this.f16386j = (byte) 0;
        return false;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: f0 */
    public b f() {
        return c0(this);
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        for (int i10 = 0; i10 < this.f16381e.size(); i10++) {
            fVar.c0(3, (Ze.p) this.f16381e.get(i10));
        }
        for (int i11 = 0; i11 < this.f16382f.size(); i11++) {
            fVar.c0(4, (Ze.p) this.f16382f.get(i11));
        }
        for (int i12 = 0; i12 < this.f16383g.size(); i12++) {
            fVar.c0(5, (Ze.p) this.f16383g.get(i12));
        }
        if ((this.f16380d & 1) == 1) {
            fVar.c0(30, this.f16384h);
        }
        if ((this.f16380d & 2) == 2) {
            fVar.c0(32, this.f16385i);
        }
        aVarZ.a(200, fVar);
        fVar.h0(this.f16379c);
    }

    /* synthetic */ m(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private m(i.c cVar) {
        super(cVar);
        this.f16386j = (byte) -1;
        this.f16387k = -1;
        this.f16379c = cVar.i();
    }

    private m(boolean z10) {
        this.f16386j = (byte) -1;
        this.f16387k = -1;
        this.f16379c = Ze.d.f23287a;
    }

    private m(Ze.e eVar, Ze.g gVar) {
        this.f16386j = (byte) -1;
        this.f16387k = -1;
        a0();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 26) {
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 != 1) {
                                this.f16381e = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.f16381e.add(eVar.t(j.f16326x, gVar));
                        } else if (iJ == 34) {
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 != 2) {
                                this.f16382f = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.f16382f.add(eVar.t(o.f16410x, gVar));
                        } else if (iJ != 42) {
                            if (iJ == 242) {
                                u.b bVarF = (this.f16380d & 1) == 1 ? this.f16384h.f() : null;
                                u uVar = (u) eVar.t(u.f16591i, gVar);
                                this.f16384h = uVar;
                                if (bVarF != null) {
                                    bVarF.j(uVar);
                                    this.f16384h = bVarF.p();
                                }
                                this.f16380d |= 1;
                            } else if (iJ != 258) {
                                if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                x.b bVarF2 = (this.f16380d & 2) == 2 ? this.f16385i.f() : null;
                                x xVar = (x) eVar.t(x.f16652g, gVar);
                                this.f16385i = xVar;
                                if (bVarF2 != null) {
                                    bVarF2.j(xVar);
                                    this.f16385i = bVarF2.p();
                                }
                                this.f16380d |= 2;
                            }
                        } else {
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 != 4) {
                                this.f16383g = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.f16383g.add(eVar.t(s.f16538r, gVar));
                        }
                    }
                    z10 = true;
                } catch (Ze.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new Ze.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th2) {
                if (((i10 == true ? 1 : 0) & 1) == 1) {
                    this.f16381e = Collections.unmodifiableList(this.f16381e);
                }
                if (((i10 == true ? 1 : 0) & 2) == 2) {
                    this.f16382f = Collections.unmodifiableList(this.f16382f);
                }
                if (((i10 == true ? 1 : 0) & 4) == 4) {
                    this.f16383g = Collections.unmodifiableList(this.f16383g);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16379c = bVarT.h();
                    throw th3;
                }
                this.f16379c = bVarT.h();
                l();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) == 1) {
            this.f16381e = Collections.unmodifiableList(this.f16381e);
        }
        if (((i10 == true ? 1 : 0) & 2) == 2) {
            this.f16382f = Collections.unmodifiableList(this.f16382f);
        }
        if (((i10 == true ? 1 : 0) & 4) == 4) {
            this.f16383g = Collections.unmodifiableList(this.f16383g);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16379c = bVarT.h();
            throw th4;
        }
        this.f16379c = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.c implements Ze.q {

        /* JADX INFO: renamed from: d */
        private int f16388d;

        /* JADX INFO: renamed from: e */
        private List f16389e;

        /* JADX INFO: renamed from: f */
        private List f16390f;

        /* JADX INFO: renamed from: g */
        private List f16391g;

        /* JADX INFO: renamed from: h */
        private u f16392h;

        /* JADX INFO: renamed from: i */
        private x f16393i;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f16389e = list;
            this.f16390f = list;
            this.f16391g = list;
            this.f16392h = u.x();
            this.f16393i = x.v();
            B();
        }

        private void A() {
            if ((this.f16388d & 4) != 4) {
                this.f16391g = new ArrayList(this.f16391g);
                this.f16388d |= 4;
            }
        }

        public static b v() {
            return new b();
        }

        private void x() {
            if ((this.f16388d & 1) != 1) {
                this.f16389e = new ArrayList(this.f16389e);
                this.f16388d |= 1;
            }
        }

        private void y() {
            if ((this.f16388d & 2) != 2) {
                this.f16390f = new ArrayList(this.f16390f);
                this.f16388d |= 2;
            }
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: C */
        public b j(m mVar) {
            if (mVar == m.L()) {
                return this;
            }
            if (!mVar.f16381e.isEmpty()) {
                if (this.f16389e.isEmpty()) {
                    this.f16389e = mVar.f16381e;
                    this.f16388d &= -2;
                } else {
                    x();
                    this.f16389e.addAll(mVar.f16381e);
                }
            }
            if (!mVar.f16382f.isEmpty()) {
                if (this.f16390f.isEmpty()) {
                    this.f16390f = mVar.f16382f;
                    this.f16388d &= -3;
                } else {
                    y();
                    this.f16390f.addAll(mVar.f16382f);
                }
            }
            if (!mVar.f16383g.isEmpty()) {
                if (this.f16391g.isEmpty()) {
                    this.f16391g = mVar.f16383g;
                    this.f16388d &= -5;
                } else {
                    A();
                    this.f16391g.addAll(mVar.f16383g);
                }
            }
            if (mVar.Y()) {
                E(mVar.W());
            }
            if (mVar.Z()) {
                F(mVar.X());
            }
            q(mVar);
            k(i().c(mVar.f16379c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.m.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.m.f16378m     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.m r3 = (Se.m) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.m r4 = (Se.m) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.m.b.y1(Ze.e, Ze.g):Se.m$b");
        }

        public b E(u uVar) {
            if ((this.f16388d & 8) != 8 || this.f16392h == u.x()) {
                this.f16392h = uVar;
            } else {
                this.f16392h = u.F(this.f16392h).j(uVar).p();
            }
            this.f16388d |= 8;
            return this;
        }

        public b F(x xVar) {
            if ((this.f16388d & 16) != 16 || this.f16393i == x.v()) {
                this.f16393i = xVar;
            } else {
                this.f16393i = x.A(this.f16393i).j(xVar).p();
            }
            this.f16388d |= 16;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public m build() {
            m mVarT = t();
            if (mVarT.e()) {
                return mVarT;
            }
            throw a.AbstractC0406a.h(mVarT);
        }

        public m t() {
            m mVar = new m(this);
            int i10 = this.f16388d;
            if ((i10 & 1) == 1) {
                this.f16389e = Collections.unmodifiableList(this.f16389e);
                this.f16388d &= -2;
            }
            mVar.f16381e = this.f16389e;
            if ((this.f16388d & 2) == 2) {
                this.f16390f = Collections.unmodifiableList(this.f16390f);
                this.f16388d &= -3;
            }
            mVar.f16382f = this.f16390f;
            if ((this.f16388d & 4) == 4) {
                this.f16391g = Collections.unmodifiableList(this.f16391g);
                this.f16388d &= -5;
            }
            mVar.f16383g = this.f16391g;
            int i11 = (i10 & 8) != 8 ? 0 : 1;
            mVar.f16384h = this.f16392h;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            mVar.f16385i = this.f16393i;
            mVar.f16380d = i11;
            return mVar;
        }

        /* JADX INFO: renamed from: u */
        public b clone() {
            return v().j(t());
        }

        private void B() {
        }
    }
}
