package Se;

import Ze.a;
import Ze.d;
import Ze.i;
import Ze.j;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r extends i.d implements Ze.q {

    /* JADX INFO: renamed from: u */
    private static final r f16482u;

    /* JADX INFO: renamed from: v */
    public static Ze.r f16483v = new a();

    /* JADX INFO: renamed from: c */
    private final Ze.d f16484c;

    /* JADX INFO: renamed from: d */
    private int f16485d;

    /* JADX INFO: renamed from: e */
    private List f16486e;

    /* JADX INFO: renamed from: f */
    private boolean f16487f;

    /* JADX INFO: renamed from: g */
    private int f16488g;

    /* JADX INFO: renamed from: h */
    private r f16489h;

    /* JADX INFO: renamed from: i */
    private int f16490i;

    /* JADX INFO: renamed from: j */
    private int f16491j;

    /* JADX INFO: renamed from: k */
    private int f16492k;

    /* JADX INFO: renamed from: l */
    private int f16493l;

    /* JADX INFO: renamed from: m */
    private int f16494m;

    /* JADX INFO: renamed from: n */
    private r f16495n;

    /* JADX INFO: renamed from: o */
    private int f16496o;

    /* JADX INFO: renamed from: p */
    private r f16497p;

    /* JADX INFO: renamed from: q */
    private int f16498q;

    /* JADX INFO: renamed from: r */
    private int f16499r;

    /* JADX INFO: renamed from: s */
    private byte f16500s;

    /* JADX INFO: renamed from: t */
    private int f16501t;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public r b(Ze.e eVar, Ze.g gVar) {
            return new r(eVar, gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends Ze.i implements Ze.q {

        /* JADX INFO: renamed from: i */
        private static final b f16502i;

        /* JADX INFO: renamed from: j */
        public static Ze.r f16503j = new a();

        /* JADX INFO: renamed from: b */
        private final Ze.d f16504b;

        /* JADX INFO: renamed from: c */
        private int f16505c;

        /* JADX INFO: renamed from: d */
        private c f16506d;

        /* JADX INFO: renamed from: e */
        private r f16507e;

        /* JADX INFO: renamed from: f */
        private int f16508f;

        /* JADX INFO: renamed from: g */
        private byte f16509g;

        /* JADX INFO: renamed from: h */
        private int f16510h;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a extends Ze.b {
            a() {
            }

            @Override // Ze.r
            /* JADX INFO: renamed from: j */
            public b b(Ze.e eVar, Ze.g gVar) {
                return new b(eVar, gVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public enum c implements j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* JADX INFO: renamed from: f */
            private static j.b f16519f = new a();

            /* JADX INFO: renamed from: a */
            private final int f16521a;

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
                this.f16521a = i11;
            }

            public static c a(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // Ze.j.a
            public final int d() {
                return this.f16521a;
            }
        }

        static {
            b bVar = new b(true);
            f16502i = bVar;
            bVar.E();
        }

        /* synthetic */ b(Ze.e eVar, Ze.g gVar, Se.a aVar) {
            this(eVar, gVar);
        }

        private void E() {
            this.f16506d = c.INV;
            this.f16507e = r.Y();
            this.f16508f = 0;
        }

        public static C0284b F() {
            return C0284b.r();
        }

        public static C0284b G(b bVar) {
            return F().j(bVar);
        }

        public static b x() {
            return f16502i;
        }

        public int A() {
            return this.f16508f;
        }

        public boolean B() {
            return (this.f16505c & 1) == 1;
        }

        public boolean C() {
            return (this.f16505c & 2) == 2;
        }

        public boolean D() {
            return (this.f16505c & 4) == 4;
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: H */
        public C0284b a() {
            return F();
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: I */
        public C0284b f() {
            return G(this);
        }

        @Override // Ze.p
        public int d() {
            int i10 = this.f16510h;
            if (i10 != -1) {
                return i10;
            }
            int iH = (this.f16505c & 1) == 1 ? Ze.f.h(1, this.f16506d.d()) : 0;
            if ((this.f16505c & 2) == 2) {
                iH += Ze.f.r(2, this.f16507e);
            }
            if ((this.f16505c & 4) == 4) {
                iH += Ze.f.o(3, this.f16508f);
            }
            int size = iH + this.f16504b.size();
            this.f16510h = size;
            return size;
        }

        @Override // Ze.q
        public final boolean e() {
            byte b10 = this.f16509g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!C() || z().e()) {
                this.f16509g = (byte) 1;
                return true;
            }
            this.f16509g = (byte) 0;
            return false;
        }

        @Override // Ze.p
        public void g(Ze.f fVar) throws IOException {
            d();
            if ((this.f16505c & 1) == 1) {
                fVar.R(1, this.f16506d.d());
            }
            if ((this.f16505c & 2) == 2) {
                fVar.c0(2, this.f16507e);
            }
            if ((this.f16505c & 4) == 4) {
                fVar.Z(3, this.f16508f);
            }
            fVar.h0(this.f16504b);
        }

        public c y() {
            return this.f16506d;
        }

        public r z() {
            return this.f16507e;
        }

        /* synthetic */ b(i.b bVar, Se.a aVar) {
            this(bVar);
        }

        private b(i.b bVar) {
            super(bVar);
            this.f16509g = (byte) -1;
            this.f16510h = -1;
            this.f16504b = bVar.i();
        }

        private b(boolean z10) {
            this.f16509g = (byte) -1;
            this.f16510h = -1;
            this.f16504b = Ze.d.f23287a;
        }

        private b(Ze.e eVar, Ze.g gVar) {
            this.f16509g = (byte) -1;
            this.f16510h = -1;
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
                                    int iM = eVar.m();
                                    c cVarA = c.a(iM);
                                    if (cVarA == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f16505c |= 1;
                                        this.f16506d = cVarA;
                                    }
                                } else if (iJ == 18) {
                                    c cVarF = (this.f16505c & 2) == 2 ? this.f16507e.f() : null;
                                    r rVar = (r) eVar.t(r.f16483v, gVar);
                                    this.f16507e = rVar;
                                    if (cVarF != null) {
                                        cVarF.j(rVar);
                                        this.f16507e = cVarF.t();
                                    }
                                    this.f16505c |= 2;
                                } else if (iJ != 24) {
                                    if (!p(eVar, fVarI, gVar, iJ)) {
                                    }
                                } else {
                                    this.f16505c |= 4;
                                    this.f16508f = eVar.r();
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
                        this.f16504b = bVarT.h();
                        throw th3;
                    }
                    this.f16504b = bVarT.h();
                    l();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f16504b = bVarT.h();
                throw th4;
            }
            this.f16504b = bVarT.h();
            l();
        }

        /* JADX INFO: renamed from: Se.r$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0284b extends i.b implements Ze.q {

            /* JADX INFO: renamed from: b */
            private int f16511b;

            /* JADX INFO: renamed from: c */
            private c f16512c = c.INV;

            /* JADX INFO: renamed from: d */
            private r f16513d = r.Y();

            /* JADX INFO: renamed from: e */
            private int f16514e;

            private C0284b() {
                s();
            }

            public static C0284b r() {
                return new C0284b();
            }

            @Override // Ze.p.a
            /* JADX INFO: renamed from: n */
            public b build() {
                b bVarP = p();
                if (bVarP.e()) {
                    return bVarP;
                }
                throw a.AbstractC0406a.h(bVarP);
            }

            public b p() {
                b bVar = new b(this);
                int i10 = this.f16511b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f16506d = this.f16512c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f16507e = this.f16513d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                bVar.f16508f = this.f16514e;
                bVar.f16505c = i11;
                return bVar;
            }

            /* JADX INFO: renamed from: q */
            public C0284b clone() {
                return r().j(p());
            }

            @Override // Ze.i.b
            /* JADX INFO: renamed from: t */
            public C0284b j(b bVar) {
                if (bVar == b.x()) {
                    return this;
                }
                if (bVar.B()) {
                    x(bVar.y());
                }
                if (bVar.C()) {
                    v(bVar.z());
                }
                if (bVar.D()) {
                    y(bVar.A());
                }
                k(i().c(bVar.f16504b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // Ze.p.a
            /* JADX INFO: renamed from: u */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Se.r.b.C0284b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    Ze.r r1 = Se.r.b.f16503j     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    Se.r$b r3 = (Se.r.b) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                    Se.r$b r4 = (Se.r.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Se.r.b.C0284b.y1(Ze.e, Ze.g):Se.r$b$b");
            }

            public C0284b v(r rVar) {
                if ((this.f16511b & 2) != 2 || this.f16513d == r.Y()) {
                    this.f16513d = rVar;
                } else {
                    this.f16513d = r.z0(this.f16513d).j(rVar).t();
                }
                this.f16511b |= 2;
                return this;
            }

            public C0284b x(c cVar) {
                cVar.getClass();
                this.f16511b |= 1;
                this.f16512c = cVar;
                return this;
            }

            public C0284b y(int i10) {
                this.f16511b |= 4;
                this.f16514e = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    static {
        r rVar = new r(true);
        f16482u = rVar;
        rVar.x0();
    }

    /* synthetic */ r(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static r Y() {
        return f16482u;
    }

    private void x0() {
        this.f16486e = Collections.EMPTY_LIST;
        this.f16487f = false;
        this.f16488g = 0;
        this.f16489h = Y();
        this.f16490i = 0;
        this.f16491j = 0;
        this.f16492k = 0;
        this.f16493l = 0;
        this.f16494m = 0;
        this.f16495n = Y();
        this.f16496o = 0;
        this.f16497p = Y();
        this.f16498q = 0;
        this.f16499r = 0;
    }

    public static c y0() {
        return c.v();
    }

    public static c z0(r rVar) {
        return y0().j(rVar);
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: A0 */
    public c a() {
        return y0();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: B0 */
    public c f() {
        return z0(this);
    }

    public r S() {
        return this.f16497p;
    }

    public int T() {
        return this.f16498q;
    }

    public b U(int i10) {
        return (b) this.f16486e.get(i10);
    }

    public int V() {
        return this.f16486e.size();
    }

    public List W() {
        return this.f16486e;
    }

    public int X() {
        return this.f16491j;
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: Z */
    public r c() {
        return f16482u;
    }

    public int a0() {
        return this.f16499r;
    }

    public int b0() {
        return this.f16488g;
    }

    public r c0() {
        return this.f16489h;
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16501t;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16485d & 4096) == 4096 ? Ze.f.o(1, this.f16499r) : 0;
        for (int i11 = 0; i11 < this.f16486e.size(); i11++) {
            iO += Ze.f.r(2, (Ze.p) this.f16486e.get(i11));
        }
        if ((this.f16485d & 1) == 1) {
            iO += Ze.f.a(3, this.f16487f);
        }
        if ((this.f16485d & 2) == 2) {
            iO += Ze.f.o(4, this.f16488g);
        }
        if ((this.f16485d & 4) == 4) {
            iO += Ze.f.r(5, this.f16489h);
        }
        if ((this.f16485d & 16) == 16) {
            iO += Ze.f.o(6, this.f16491j);
        }
        if ((this.f16485d & 32) == 32) {
            iO += Ze.f.o(7, this.f16492k);
        }
        if ((this.f16485d & 8) == 8) {
            iO += Ze.f.o(8, this.f16490i);
        }
        if ((this.f16485d & 64) == 64) {
            iO += Ze.f.o(9, this.f16493l);
        }
        if ((this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            iO += Ze.f.r(10, this.f16495n);
        }
        if ((this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            iO += Ze.f.o(11, this.f16496o);
        }
        if ((this.f16485d & 128) == 128) {
            iO += Ze.f.o(12, this.f16494m);
        }
        if ((this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            iO += Ze.f.r(13, this.f16497p);
        }
        if ((this.f16485d & 2048) == 2048) {
            iO += Ze.f.o(14, this.f16498q);
        }
        int iU = iO + u() + this.f16484c.size();
        this.f16501t = iU;
        return iU;
    }

    public int d0() {
        return this.f16490i;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16500s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < V(); i10++) {
            if (!U(i10).e()) {
                this.f16500s = (byte) 0;
                return false;
            }
        }
        if (p0() && !c0().e()) {
            this.f16500s = (byte) 0;
            return false;
        }
        if (s0() && !f0().e()) {
            this.f16500s = (byte) 0;
            return false;
        }
        if (k0() && !S().e()) {
            this.f16500s = (byte) 0;
            return false;
        }
        if (t()) {
            this.f16500s = (byte) 1;
            return true;
        }
        this.f16500s = (byte) 0;
        return false;
    }

    public boolean e0() {
        return this.f16487f;
    }

    public r f0() {
        return this.f16495n;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        if ((this.f16485d & 4096) == 4096) {
            fVar.Z(1, this.f16499r);
        }
        for (int i10 = 0; i10 < this.f16486e.size(); i10++) {
            fVar.c0(2, (Ze.p) this.f16486e.get(i10));
        }
        if ((this.f16485d & 1) == 1) {
            fVar.K(3, this.f16487f);
        }
        if ((this.f16485d & 2) == 2) {
            fVar.Z(4, this.f16488g);
        }
        if ((this.f16485d & 4) == 4) {
            fVar.c0(5, this.f16489h);
        }
        if ((this.f16485d & 16) == 16) {
            fVar.Z(6, this.f16491j);
        }
        if ((this.f16485d & 32) == 32) {
            fVar.Z(7, this.f16492k);
        }
        if ((this.f16485d & 8) == 8) {
            fVar.Z(8, this.f16490i);
        }
        if ((this.f16485d & 64) == 64) {
            fVar.Z(9, this.f16493l);
        }
        if ((this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            fVar.c0(10, this.f16495n);
        }
        if ((this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            fVar.Z(11, this.f16496o);
        }
        if ((this.f16485d & 128) == 128) {
            fVar.Z(12, this.f16494m);
        }
        if ((this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            fVar.c0(13, this.f16497p);
        }
        if ((this.f16485d & 2048) == 2048) {
            fVar.Z(14, this.f16498q);
        }
        aVarZ.a(200, fVar);
        fVar.h0(this.f16484c);
    }

    public int g0() {
        return this.f16496o;
    }

    public int h0() {
        return this.f16494m;
    }

    public int i0() {
        return this.f16492k;
    }

    public int j0() {
        return this.f16493l;
    }

    public boolean k0() {
        return (this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024;
    }

    public boolean l0() {
        return (this.f16485d & 2048) == 2048;
    }

    public boolean m0() {
        return (this.f16485d & 16) == 16;
    }

    public boolean n0() {
        return (this.f16485d & 4096) == 4096;
    }

    public boolean o0() {
        return (this.f16485d & 2) == 2;
    }

    public boolean p0() {
        return (this.f16485d & 4) == 4;
    }

    public boolean q0() {
        return (this.f16485d & 8) == 8;
    }

    public boolean r0() {
        return (this.f16485d & 1) == 1;
    }

    public boolean s0() {
        return (this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256;
    }

    public boolean t0() {
        return (this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512;
    }

    public boolean u0() {
        return (this.f16485d & 128) == 128;
    }

    public boolean v0() {
        return (this.f16485d & 32) == 32;
    }

    public boolean w0() {
        return (this.f16485d & 64) == 64;
    }

    /* synthetic */ r(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private r(i.c cVar) {
        super(cVar);
        this.f16500s = (byte) -1;
        this.f16501t = -1;
        this.f16484c = cVar.i();
    }

    private r(boolean z10) {
        this.f16500s = (byte) -1;
        this.f16501t = -1;
        this.f16484c = Ze.d.f23287a;
    }

    private r(Ze.e eVar, Ze.g gVar) {
        c cVarF;
        this.f16500s = (byte) -1;
        this.f16501t = -1;
        x0();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f16485d |= 4096;
                                this.f16499r = eVar.r();
                                break;
                            case 18:
                                if (!z11) {
                                    this.f16486e = new ArrayList();
                                    z11 = true;
                                }
                                this.f16486e.add(eVar.t(b.f16503j, gVar));
                                break;
                            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                                this.f16485d |= 1;
                                this.f16487f = eVar.j();
                                break;
                            case 32:
                                this.f16485d |= 2;
                                this.f16488g = eVar.r();
                                break;
                            case 42:
                                cVarF = (this.f16485d & 4) == 4 ? this.f16489h.f() : null;
                                r rVar = (r) eVar.t(f16483v, gVar);
                                this.f16489h = rVar;
                                if (cVarF != null) {
                                    cVarF.j(rVar);
                                    this.f16489h = cVarF.t();
                                }
                                this.f16485d |= 4;
                                break;
                            case 48:
                                this.f16485d |= 16;
                                this.f16491j = eVar.r();
                                break;
                            case 56:
                                this.f16485d |= 32;
                                this.f16492k = eVar.r();
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                this.f16485d |= 8;
                                this.f16490i = eVar.r();
                                break;
                            case 72:
                                this.f16485d |= 64;
                                this.f16493l = eVar.r();
                                break;
                            case 82:
                                cVarF = (this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256 ? this.f16495n.f() : null;
                                r rVar2 = (r) eVar.t(f16483v, gVar);
                                this.f16495n = rVar2;
                                if (cVarF != null) {
                                    cVarF.j(rVar2);
                                    this.f16495n = cVarF.t();
                                }
                                this.f16485d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                break;
                            case 88:
                                this.f16485d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                this.f16496o = eVar.r();
                                break;
                            case 96:
                                this.f16485d |= 128;
                                this.f16494m = eVar.r();
                                break;
                            case 106:
                                cVarF = (this.f16485d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024 ? this.f16497p.f() : null;
                                r rVar3 = (r) eVar.t(f16483v, gVar);
                                this.f16497p = rVar3;
                                if (cVarF != null) {
                                    cVarF.j(rVar3);
                                    this.f16497p = cVarF.t();
                                }
                                this.f16485d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                break;
                            case 112:
                                this.f16485d |= 2048;
                                this.f16498q = eVar.r();
                                break;
                            default:
                                if (!p(eVar, fVarI, gVar, iJ)) {
                                    z10 = true;
                                }
                                break;
                        }
                    } catch (IOException e10) {
                        throw new Ze.k(e10.getMessage()).i(this);
                    }
                } catch (Ze.k e11) {
                    throw e11.i(this);
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.f16486e = Collections.unmodifiableList(this.f16486e);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16484c = bVarT.h();
                    throw th3;
                }
                this.f16484c = bVarT.h();
                l();
                throw th2;
            }
        }
        if (z11) {
            this.f16486e = Collections.unmodifiableList(this.f16486e);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16484c = bVarT.h();
            throw th4;
        }
        this.f16484c = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends i.c implements Ze.q {

        /* JADX INFO: renamed from: d */
        private int f16522d;

        /* JADX INFO: renamed from: f */
        private boolean f16524f;

        /* JADX INFO: renamed from: g */
        private int f16525g;

        /* JADX INFO: renamed from: i */
        private int f16527i;

        /* JADX INFO: renamed from: j */
        private int f16528j;

        /* JADX INFO: renamed from: k */
        private int f16529k;

        /* JADX INFO: renamed from: l */
        private int f16530l;

        /* JADX INFO: renamed from: m */
        private int f16531m;

        /* JADX INFO: renamed from: o */
        private int f16533o;

        /* JADX INFO: renamed from: q */
        private int f16535q;

        /* JADX INFO: renamed from: r */
        private int f16536r;

        /* JADX INFO: renamed from: e */
        private List f16523e = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: h */
        private r f16526h = r.Y();

        /* JADX INFO: renamed from: n */
        private r f16532n = r.Y();

        /* JADX INFO: renamed from: p */
        private r f16534p = r.Y();

        private c() {
            y();
        }

        public static c v() {
            return new c();
        }

        private void x() {
            if ((this.f16522d & 1) != 1) {
                this.f16523e = new ArrayList(this.f16523e);
                this.f16522d |= 1;
            }
        }

        public c A(r rVar) {
            if ((this.f16522d & 2048) != 2048 || this.f16534p == r.Y()) {
                this.f16534p = rVar;
            } else {
                this.f16534p = r.z0(this.f16534p).j(rVar).t();
            }
            this.f16522d |= 2048;
            return this;
        }

        public c B(r rVar) {
            if ((this.f16522d & 8) != 8 || this.f16526h == r.Y()) {
                this.f16526h = rVar;
            } else {
                this.f16526h = r.z0(this.f16526h).j(rVar).t();
            }
            this.f16522d |= 8;
            return this;
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: C */
        public c j(r rVar) {
            if (rVar == r.Y()) {
                return this;
            }
            if (!rVar.f16486e.isEmpty()) {
                if (this.f16523e.isEmpty()) {
                    this.f16523e = rVar.f16486e;
                    this.f16522d &= -2;
                } else {
                    x();
                    this.f16523e.addAll(rVar.f16486e);
                }
            }
            if (rVar.r0()) {
                K(rVar.e0());
            }
            if (rVar.o0()) {
                I(rVar.b0());
            }
            if (rVar.p0()) {
                B(rVar.c0());
            }
            if (rVar.q0()) {
                J(rVar.d0());
            }
            if (rVar.m0()) {
                G(rVar.X());
            }
            if (rVar.v0()) {
                N(rVar.i0());
            }
            if (rVar.w0()) {
                O(rVar.j0());
            }
            if (rVar.u0()) {
                M(rVar.h0());
            }
            if (rVar.s0()) {
                E(rVar.f0());
            }
            if (rVar.t0()) {
                L(rVar.g0());
            }
            if (rVar.k0()) {
                A(rVar.S());
            }
            if (rVar.l0()) {
                F(rVar.T());
            }
            if (rVar.n0()) {
                H(rVar.a0());
            }
            q(rVar);
            k(i().c(rVar.f16484c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.r.c y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.r.f16483v     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.r r3 = (Se.r) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.r r4 = (Se.r) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.r.c.y1(Ze.e, Ze.g):Se.r$c");
        }

        public c E(r rVar) {
            if ((this.f16522d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512 || this.f16532n == r.Y()) {
                this.f16532n = rVar;
            } else {
                this.f16532n = r.z0(this.f16532n).j(rVar).t();
            }
            this.f16522d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            return this;
        }

        public c F(int i10) {
            this.f16522d |= 4096;
            this.f16535q = i10;
            return this;
        }

        public c G(int i10) {
            this.f16522d |= 32;
            this.f16528j = i10;
            return this;
        }

        public c H(int i10) {
            this.f16522d |= 8192;
            this.f16536r = i10;
            return this;
        }

        public c I(int i10) {
            this.f16522d |= 4;
            this.f16525g = i10;
            return this;
        }

        public c J(int i10) {
            this.f16522d |= 16;
            this.f16527i = i10;
            return this;
        }

        public c K(boolean z10) {
            this.f16522d |= 2;
            this.f16524f = z10;
            return this;
        }

        public c L(int i10) {
            this.f16522d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            this.f16533o = i10;
            return this;
        }

        public c M(int i10) {
            this.f16522d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            this.f16531m = i10;
            return this;
        }

        public c N(int i10) {
            this.f16522d |= 64;
            this.f16529k = i10;
            return this;
        }

        public c O(int i10) {
            this.f16522d |= 128;
            this.f16530l = i10;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public r build() {
            r rVarT = t();
            if (rVarT.e()) {
                return rVarT;
            }
            throw a.AbstractC0406a.h(rVarT);
        }

        public r t() {
            r rVar = new r(this);
            int i10 = this.f16522d;
            if ((i10 & 1) == 1) {
                this.f16523e = Collections.unmodifiableList(this.f16523e);
                this.f16522d &= -2;
            }
            rVar.f16486e = this.f16523e;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            rVar.f16487f = this.f16524f;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            rVar.f16488g = this.f16525g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            rVar.f16489h = this.f16526h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            rVar.f16490i = this.f16527i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            rVar.f16491j = this.f16528j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            rVar.f16492k = this.f16529k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            rVar.f16493l = this.f16530l;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                i11 |= 128;
            }
            rVar.f16494m = this.f16531m;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            rVar.f16495n = this.f16532n;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            rVar.f16496o = this.f16533o;
            if ((i10 & 2048) == 2048) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
            rVar.f16497p = this.f16534p;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            rVar.f16498q = this.f16535q;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            rVar.f16499r = this.f16536r;
            rVar.f16485d = i11;
            return rVar;
        }

        /* JADX INFO: renamed from: u */
        public c clone() {
            return v().j(t());
        }

        private void y() {
        }
    }
}
