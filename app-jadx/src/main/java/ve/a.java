package Ve;

import Se.m;
import Se.o;
import Se.t;
import Ze.a;
import Ze.d;
import Ze.f;
import Ze.g;
import Ze.i;
import Ze.j;
import Ze.k;
import Ze.p;
import Ze.q;
import Ze.r;
import Ze.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.f f20028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i.f f20029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i.f f20030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i.f f20031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i.f f20032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i.f f20033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i.f f20034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i.f f20035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i.f f20036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i.f f20037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i.f f20038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i.f f20039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i.f f20040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i.f f20041n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final e f20081h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static r f20082i = new C0355a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Ze.d f20083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f20084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f20085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f20086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f20087f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20088g;

        /* JADX INFO: renamed from: Ve.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class C0355a extends Ze.b {
            C0355a() {
            }

            @Override // Ze.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public e b(Ze.e eVar, g gVar) {
                return new e(eVar, gVar);
            }
        }

        static {
            e eVar = new e(true);
            f20081h = eVar;
            eVar.A();
        }

        private void A() {
            List list = Collections.EMPTY_LIST;
            this.f20084c = list;
            this.f20085d = list;
        }

        public static b B() {
            return b.r();
        }

        public static b C(e eVar) {
            return B().j(eVar);
        }

        public static e E(InputStream inputStream, g gVar) {
            return (e) f20082i.a(inputStream, gVar);
        }

        public static e x() {
            return f20081h;
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b a() {
            return B();
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b f() {
            return C(this);
        }

        @Override // Ze.p
        public int d() {
            int i10 = this.f20088g;
            if (i10 != -1) {
                return i10;
            }
            int iR = 0;
            for (int i11 = 0; i11 < this.f20084c.size(); i11++) {
                iR += f.r(1, (p) this.f20084c.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f20085d.size(); i12++) {
                iP += f.p(((Integer) this.f20085d.get(i12)).intValue());
            }
            int iP2 = iR + iP;
            if (!y().isEmpty()) {
                iP2 = iP2 + 1 + f.p(iP);
            }
            this.f20086e = iP;
            int size = iP2 + this.f20083b.size();
            this.f20088g = size;
            return size;
        }

        @Override // Ze.q
        public final boolean e() {
            byte b10 = this.f20087f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f20087f = (byte) 1;
            return true;
        }

        @Override // Ze.p
        public void g(f fVar) throws IOException {
            d();
            for (int i10 = 0; i10 < this.f20084c.size(); i10++) {
                fVar.c0(1, (p) this.f20084c.get(i10));
            }
            if (y().size() > 0) {
                fVar.n0(42);
                fVar.n0(this.f20086e);
            }
            for (int i11 = 0; i11 < this.f20085d.size(); i11++) {
                fVar.a0(((Integer) this.f20085d.get(i11)).intValue());
            }
            fVar.h0(this.f20083b);
        }

        public List y() {
            return this.f20085d;
        }

        public List z() {
            return this.f20084c;
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends i implements q {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final c f20092n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static r f20093o = new C0356a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Ze.d f20094b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f20095c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f20096d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f20097e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Object f20098f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private EnumC0357c f20099g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List f20100h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f20101i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List f20102j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f20103k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private byte f20104l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f20105m;

            /* JADX INFO: renamed from: Ve.a$e$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static class C0356a extends Ze.b {
                C0356a() {
                }

                @Override // Ze.r
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c b(Ze.e eVar, g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* JADX INFO: renamed from: Ve.a$e$c$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public enum EnumC0357c implements j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static j.b f20116e = new C0358a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f20118a;

                /* JADX INFO: renamed from: Ve.a$e$c$c$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                static class C0358a implements j.b {
                    C0358a() {
                    }

                    @Override // Ze.j.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0357c a(int i10) {
                        return EnumC0357c.a(i10);
                    }
                }

                EnumC0357c(int i10, int i11) {
                    this.f20118a = i11;
                }

                public static EnumC0357c a(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // Ze.j.a
                public final int d() {
                    return this.f20118a;
                }
            }

            static {
                c cVar = new c(true);
                f20092n = cVar;
                cVar.R();
            }

            public static c D() {
                return f20092n;
            }

            private void R() {
                this.f20096d = 1;
                this.f20097e = 0;
                this.f20098f = "";
                this.f20099g = EnumC0357c.NONE;
                List list = Collections.EMPTY_LIST;
                this.f20100h = list;
                this.f20102j = list;
            }

            public static b S() {
                return b.r();
            }

            public static b T(c cVar) {
                return S().j(cVar);
            }

            public EnumC0357c E() {
                return this.f20099g;
            }

            public int F() {
                return this.f20097e;
            }

            public int G() {
                return this.f20096d;
            }

            public int H() {
                return this.f20102j.size();
            }

            public List I() {
                return this.f20102j;
            }

            public String J() {
                Object obj = this.f20098f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                Ze.d dVar = (Ze.d) obj;
                String strZ = dVar.z();
                if (dVar.s()) {
                    this.f20098f = strZ;
                }
                return strZ;
            }

            public Ze.d K() {
                Object obj = this.f20098f;
                if (!(obj instanceof String)) {
                    return (Ze.d) obj;
                }
                Ze.d dVarI = Ze.d.i((String) obj);
                this.f20098f = dVarI;
                return dVarI;
            }

            public int L() {
                return this.f20100h.size();
            }

            public List M() {
                return this.f20100h;
            }

            public boolean N() {
                return (this.f20095c & 8) == 8;
            }

            public boolean O() {
                return (this.f20095c & 2) == 2;
            }

            public boolean P() {
                return (this.f20095c & 1) == 1;
            }

            public boolean Q() {
                return (this.f20095c & 4) == 4;
            }

            @Override // Ze.p
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            public b a() {
                return S();
            }

            @Override // Ze.p
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public b f() {
                return T(this);
            }

            @Override // Ze.p
            public int d() {
                int i10 = this.f20105m;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f20095c & 1) == 1 ? f.o(1, this.f20096d) : 0;
                if ((this.f20095c & 2) == 2) {
                    iO += f.o(2, this.f20097e);
                }
                if ((this.f20095c & 8) == 8) {
                    iO += f.h(3, this.f20099g.d());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f20100h.size(); i11++) {
                    iP += f.p(((Integer) this.f20100h.get(i11)).intValue());
                }
                int iP2 = iO + iP;
                if (!M().isEmpty()) {
                    iP2 = iP2 + 1 + f.p(iP);
                }
                this.f20101i = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f20102j.size(); i12++) {
                    iP3 += f.p(((Integer) this.f20102j.get(i12)).intValue());
                }
                int iD = iP2 + iP3;
                if (!I().isEmpty()) {
                    iD = iD + 1 + f.p(iP3);
                }
                this.f20103k = iP3;
                if ((this.f20095c & 4) == 4) {
                    iD += f.d(6, K());
                }
                int size = iD + this.f20094b.size();
                this.f20105m = size;
                return size;
            }

            @Override // Ze.q
            public final boolean e() {
                byte b10 = this.f20104l;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f20104l = (byte) 1;
                return true;
            }

            @Override // Ze.p
            public void g(f fVar) throws IOException {
                d();
                if ((this.f20095c & 1) == 1) {
                    fVar.Z(1, this.f20096d);
                }
                if ((this.f20095c & 2) == 2) {
                    fVar.Z(2, this.f20097e);
                }
                if ((this.f20095c & 8) == 8) {
                    fVar.R(3, this.f20099g.d());
                }
                if (M().size() > 0) {
                    fVar.n0(34);
                    fVar.n0(this.f20101i);
                }
                for (int i10 = 0; i10 < this.f20100h.size(); i10++) {
                    fVar.a0(((Integer) this.f20100h.get(i10)).intValue());
                }
                if (I().size() > 0) {
                    fVar.n0(42);
                    fVar.n0(this.f20103k);
                }
                for (int i11 = 0; i11 < this.f20102j.size(); i11++) {
                    fVar.a0(((Integer) this.f20102j.get(i11)).intValue());
                }
                if ((this.f20095c & 4) == 4) {
                    fVar.N(6, K());
                }
                fVar.h0(this.f20094b);
            }

            private c(i.b bVar) {
                super(bVar);
                this.f20101i = -1;
                this.f20103k = -1;
                this.f20104l = (byte) -1;
                this.f20105m = -1;
                this.f20094b = bVar.i();
            }

            private c(boolean z10) {
                this.f20101i = -1;
                this.f20103k = -1;
                this.f20104l = (byte) -1;
                this.f20105m = -1;
                this.f20094b = Ze.d.f23287a;
            }

            private c(Ze.e eVar, g gVar) {
                this.f20101i = -1;
                this.f20103k = -1;
                this.f20104l = (byte) -1;
                this.f20105m = -1;
                R();
                d.b bVarT = Ze.d.t();
                f fVarI = f.I(bVarT, 1);
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.f20095c |= 1;
                                    this.f20096d = eVar.r();
                                } else if (iJ == 16) {
                                    this.f20095c |= 2;
                                    this.f20097e = eVar.r();
                                } else if (iJ == 24) {
                                    int iM = eVar.m();
                                    EnumC0357c enumC0357cA = EnumC0357c.a(iM);
                                    if (enumC0357cA == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f20095c |= 8;
                                        this.f20099g = enumC0357cA;
                                    }
                                } else if (iJ == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f20100h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f20100h.add(Integer.valueOf(eVar.r()));
                                } else if (iJ == 34) {
                                    int i11 = eVar.i(eVar.z());
                                    if ((i10 & 16) != 16 && eVar.e() > 0) {
                                        this.f20100h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f20100h.add(Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i11);
                                } else if (iJ == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f20102j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f20102j.add(Integer.valueOf(eVar.r()));
                                } else if (iJ == 42) {
                                    int i12 = eVar.i(eVar.z());
                                    if ((i10 & 32) != 32 && eVar.e() > 0) {
                                        this.f20102j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.f20102j.add(Integer.valueOf(eVar.r()));
                                    }
                                    eVar.h(i12);
                                } else if (iJ != 50) {
                                    if (!p(eVar, fVarI, gVar, iJ)) {
                                    }
                                } else {
                                    Ze.d dVarK = eVar.k();
                                    this.f20095c |= 4;
                                    this.f20098f = dVarK;
                                }
                            }
                            z10 = true;
                        } catch (k e10) {
                            throw e10.i(this);
                        } catch (IOException e11) {
                            throw new k(e11.getMessage()).i(this);
                        }
                    } catch (Throwable th2) {
                        if ((i10 & 16) == 16) {
                            this.f20100h = Collections.unmodifiableList(this.f20100h);
                        }
                        if ((i10 & 32) == 32) {
                            this.f20102j = Collections.unmodifiableList(this.f20102j);
                        }
                        try {
                            fVarI.H();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f20094b = bVarT.h();
                            throw th3;
                        }
                        this.f20094b = bVarT.h();
                        l();
                        throw th2;
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f20100h = Collections.unmodifiableList(this.f20100h);
                }
                if ((i10 & 32) == 32) {
                    this.f20102j = Collections.unmodifiableList(this.f20102j);
                }
                try {
                    fVarI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f20094b = bVarT.h();
                    throw th4;
                }
                this.f20094b = bVarT.h();
                l();
            }

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class b extends i.b implements q {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f20106b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f20108d;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private List f20111g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private List f20112h;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f20107c = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Object f20109e = "";

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private EnumC0357c f20110f = EnumC0357c.NONE;

                private b() {
                    List list = Collections.EMPTY_LIST;
                    this.f20111g = list;
                    this.f20112h = list;
                    u();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b r() {
                    return new b();
                }

                private void s() {
                    if ((this.f20106b & 32) != 32) {
                        this.f20112h = new ArrayList(this.f20112h);
                        this.f20106b |= 32;
                    }
                }

                private void t() {
                    if ((this.f20106b & 16) != 16) {
                        this.f20111g = new ArrayList(this.f20111g);
                        this.f20106b |= 16;
                    }
                }

                public b A(int i10) {
                    this.f20106b |= 2;
                    this.f20108d = i10;
                    return this;
                }

                public b B(int i10) {
                    this.f20106b |= 1;
                    this.f20107c = i10;
                    return this;
                }

                @Override // Ze.p.a
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarP = p();
                    if (cVarP.e()) {
                        return cVarP;
                    }
                    throw a.AbstractC0406a.h(cVarP);
                }

                public c p() {
                    c cVar = new c(this);
                    int i10 = this.f20106b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f20096d = this.f20107c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f20097e = this.f20108d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f20098f = this.f20109e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f20099g = this.f20110f;
                    if ((this.f20106b & 16) == 16) {
                        this.f20111g = Collections.unmodifiableList(this.f20111g);
                        this.f20106b &= -17;
                    }
                    cVar.f20100h = this.f20111g;
                    if ((this.f20106b & 32) == 32) {
                        this.f20112h = Collections.unmodifiableList(this.f20112h);
                        this.f20106b &= -33;
                    }
                    cVar.f20102j = this.f20112h;
                    cVar.f20095c = i11;
                    return cVar;
                }

                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public b clone() {
                    return r().j(p());
                }

                @Override // Ze.i.b
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public b j(c cVar) {
                    if (cVar == c.D()) {
                        return this;
                    }
                    if (cVar.P()) {
                        B(cVar.G());
                    }
                    if (cVar.O()) {
                        A(cVar.F());
                    }
                    if (cVar.Q()) {
                        this.f20106b |= 4;
                        this.f20109e = cVar.f20098f;
                    }
                    if (cVar.N()) {
                        y(cVar.E());
                    }
                    if (!cVar.f20100h.isEmpty()) {
                        if (this.f20111g.isEmpty()) {
                            this.f20111g = cVar.f20100h;
                            this.f20106b &= -17;
                        } else {
                            t();
                            this.f20111g.addAll(cVar.f20100h);
                        }
                    }
                    if (!cVar.f20102j.isEmpty()) {
                        if (this.f20112h.isEmpty()) {
                            this.f20112h = cVar.f20102j;
                            this.f20106b &= -33;
                        } else {
                            s();
                            this.f20112h.addAll(cVar.f20102j);
                        }
                    }
                    k(i().c(cVar.f20094b));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // Ze.p.a
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public Ve.a.e.c.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        Ze.r r1 = Ve.a.e.c.f20093o     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                        Ve.a$e$c r3 = (Ve.a.e.c) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                        Ve.a$e$c r4 = (Ve.a.e.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: Ve.a.e.c.b.y1(Ze.e, Ze.g):Ve.a$e$c$b");
                }

                public b y(EnumC0357c enumC0357c) {
                    enumC0357c.getClass();
                    this.f20106b |= 8;
                    this.f20110f = enumC0357c;
                    return this;
                }

                private void u() {
                }
            }
        }

        private e(i.b bVar) {
            super(bVar);
            this.f20086e = -1;
            this.f20087f = (byte) -1;
            this.f20088g = -1;
            this.f20083b = bVar.i();
        }

        private e(boolean z10) {
            this.f20086e = -1;
            this.f20087f = (byte) -1;
            this.f20088g = -1;
            this.f20083b = Ze.d.f23287a;
        }

        private e(Ze.e eVar, g gVar) {
            this.f20086e = -1;
            this.f20087f = (byte) -1;
            this.f20088g = -1;
            A();
            d.b bVarT = Ze.d.t();
            f fVarI = f.I(bVarT, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f20084c = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f20084c.add(eVar.t(c.f20093o, gVar));
                            } else if (iJ == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f20085d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f20085d.add(Integer.valueOf(eVar.r()));
                            } else if (iJ != 42) {
                                if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & 2) != 2 && eVar.e() > 0) {
                                    this.f20085d = new ArrayList();
                                    i10 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f20085d.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 1) == 1) {
                        this.f20084c = Collections.unmodifiableList(this.f20084c);
                    }
                    if ((i10 & 2) == 2) {
                        this.f20085d = Collections.unmodifiableList(this.f20085d);
                    }
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f20083b = bVarT.h();
                        throw th3;
                    }
                    this.f20083b = bVarT.h();
                    l();
                    throw th2;
                }
            }
            if ((i10 & 1) == 1) {
                this.f20084c = Collections.unmodifiableList(this.f20084c);
            }
            if ((i10 & 2) == 2) {
                this.f20085d = Collections.unmodifiableList(this.f20085d);
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f20083b = bVarT.h();
                throw th4;
            }
            this.f20083b = bVarT.h();
            l();
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f20089b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List f20090c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List f20091d;

            private b() {
                List list = Collections.EMPTY_LIST;
                this.f20090c = list;
                this.f20091d = list;
                u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b r() {
                return new b();
            }

            private void s() {
                if ((this.f20089b & 2) != 2) {
                    this.f20091d = new ArrayList(this.f20091d);
                    this.f20089b |= 2;
                }
            }

            private void t() {
                if ((this.f20089b & 1) != 1) {
                    this.f20090c = new ArrayList(this.f20090c);
                    this.f20089b |= 1;
                }
            }

            @Override // Ze.p.a
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public e build() {
                e eVarP = p();
                if (eVarP.e()) {
                    return eVarP;
                }
                throw a.AbstractC0406a.h(eVarP);
            }

            public e p() {
                e eVar = new e(this);
                if ((this.f20089b & 1) == 1) {
                    this.f20090c = Collections.unmodifiableList(this.f20090c);
                    this.f20089b &= -2;
                }
                eVar.f20084c = this.f20090c;
                if ((this.f20089b & 2) == 2) {
                    this.f20091d = Collections.unmodifiableList(this.f20091d);
                    this.f20089b &= -3;
                }
                eVar.f20085d = this.f20091d;
                return eVar;
            }

            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return r().j(p());
            }

            @Override // Ze.i.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b j(e eVar) {
                if (eVar == e.x()) {
                    return this;
                }
                if (!eVar.f20084c.isEmpty()) {
                    if (this.f20090c.isEmpty()) {
                        this.f20090c = eVar.f20084c;
                        this.f20089b &= -2;
                    } else {
                        t();
                        this.f20090c.addAll(eVar.f20084c);
                    }
                }
                if (!eVar.f20085d.isEmpty()) {
                    if (this.f20091d.isEmpty()) {
                        this.f20091d = eVar.f20085d;
                        this.f20089b &= -3;
                    } else {
                        s();
                        this.f20091d.addAll(eVar.f20085d);
                    }
                }
                k(i().c(eVar.f20083b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // Ze.p.a
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Ve.a.e.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    Ze.r r1 = Ve.a.e.f20082i     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    Ve.a$e r3 = (Ve.a.e) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                    Ve.a$e r4 = (Ve.a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Ve.a.e.b.y1(Ze.e, Ze.g):Ve.a$e$b");
            }

            private void u() {
            }
        }
    }

    static {
        Se.e eVarM = Se.e.M();
        c cVarW = c.w();
        c cVarW2 = c.w();
        y.b bVar = y.b.f23403m;
        f20028a = i.o(eVarM, cVarW, cVarW2, null, 100, bVar, c.class);
        f20029b = i.o(Se.j.f0(), c.w(), c.w(), null, 100, bVar, c.class);
        Se.j jVarF0 = Se.j.f0();
        y.b bVar2 = y.b.f23397g;
        f20030c = i.o(jVarF0, 0, null, null, 101, bVar2, Integer.class);
        f20031d = i.o(o.d0(), d.z(), d.z(), null, 100, bVar, d.class);
        f20032e = i.o(o.d0(), 0, null, null, 101, bVar2, Integer.class);
        f20033f = i.m(Se.r.Y(), Se.b.A(), null, 100, bVar, false, Se.b.class);
        f20034g = i.o(Se.r.Y(), Boolean.FALSE, null, null, 101, y.b.f23400j, Boolean.class);
        f20035h = i.m(t.L(), Se.b.A(), null, 100, bVar, false, Se.b.class);
        f20036i = i.o(Se.c.D0(), 0, null, null, 101, bVar2, Integer.class);
        f20037j = i.m(Se.c.D0(), o.d0(), null, 102, bVar, false, o.class);
        f20038k = i.o(Se.c.D0(), 0, null, null, 103, bVar2, Integer.class);
        f20039l = i.o(Se.c.D0(), 0, null, null, 104, bVar2, Integer.class);
        f20040m = i.o(m.L(), 0, null, null, 101, bVar2, Integer.class);
        f20041n = i.m(m.L(), o.d0(), null, 102, bVar, false, o.class);
    }

    public static void a(g gVar) {
        gVar.a(f20028a);
        gVar.a(f20029b);
        gVar.a(f20030c);
        gVar.a(f20031d);
        gVar.a(f20032e);
        gVar.a(f20033f);
        gVar.a(f20034g);
        gVar.a(f20035h);
        gVar.a(f20036i);
        gVar.a(f20037j);
        gVar.a(f20038k);
        gVar.a(f20039l);
        gVar.a(f20040m);
        gVar.a(f20041n);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final b f20042h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static r f20043i = new C0351a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Ze.d f20044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f20046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f20047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f20048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20049g;

        /* JADX INFO: renamed from: Ve.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class C0351a extends Ze.b {
            C0351a() {
            }

            @Override // Ze.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b b(Ze.e eVar, g gVar) {
                return new b(eVar, gVar);
            }
        }

        static {
            b bVar = new b(true);
            f20042h = bVar;
            bVar.B();
        }

        private void B() {
            this.f20046d = 0;
            this.f20047e = 0;
        }

        public static C0352b C() {
            return C0352b.r();
        }

        public static C0352b D(b bVar) {
            return C().j(bVar);
        }

        public static b w() {
            return f20042h;
        }

        public boolean A() {
            return (this.f20045c & 1) == 1;
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public C0352b a() {
            return C();
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public C0352b f() {
            return D(this);
        }

        @Override // Ze.p
        public int d() {
            int i10 = this.f20049g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f20045c & 1) == 1 ? f.o(1, this.f20046d) : 0;
            if ((this.f20045c & 2) == 2) {
                iO += f.o(2, this.f20047e);
            }
            int size = iO + this.f20044b.size();
            this.f20049g = size;
            return size;
        }

        @Override // Ze.q
        public final boolean e() {
            byte b10 = this.f20048f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f20048f = (byte) 1;
            return true;
        }

        @Override // Ze.p
        public void g(f fVar) throws IOException {
            d();
            if ((this.f20045c & 1) == 1) {
                fVar.Z(1, this.f20046d);
            }
            if ((this.f20045c & 2) == 2) {
                fVar.Z(2, this.f20047e);
            }
            fVar.h0(this.f20044b);
        }

        public int x() {
            return this.f20047e;
        }

        public int y() {
            return this.f20046d;
        }

        public boolean z() {
            return (this.f20045c & 2) == 2;
        }

        private b(i.b bVar) {
            super(bVar);
            this.f20048f = (byte) -1;
            this.f20049g = -1;
            this.f20044b = bVar.i();
        }

        private b(boolean z10) {
            this.f20048f = (byte) -1;
            this.f20049g = -1;
            this.f20044b = Ze.d.f23287a;
        }

        private b(Ze.e eVar, g gVar) {
            this.f20048f = (byte) -1;
            this.f20049g = -1;
            B();
            d.b bVarT = Ze.d.t();
            f fVarI = f.I(bVarT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f20045c |= 1;
                                this.f20046d = eVar.r();
                            } else if (iJ != 16) {
                                if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                this.f20045c |= 2;
                                this.f20047e = eVar.r();
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f20044b = bVarT.h();
                        throw th3;
                    }
                    this.f20044b = bVarT.h();
                    l();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f20044b = bVarT.h();
                throw th4;
            }
            this.f20044b = bVarT.h();
            l();
        }

        /* JADX INFO: renamed from: Ve.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0352b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f20050b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f20051c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f20052d;

            private C0352b() {
                s();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0352b r() {
                return new C0352b();
            }

            @Override // Ze.p.a
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarP = p();
                if (bVarP.e()) {
                    return bVarP;
                }
                throw a.AbstractC0406a.h(bVarP);
            }

            public b p() {
                b bVar = new b(this);
                int i10 = this.f20050b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f20046d = this.f20051c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f20047e = this.f20052d;
                bVar.f20045c = i11;
                return bVar;
            }

            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public C0352b clone() {
                return r().j(p());
            }

            @Override // Ze.i.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0352b j(b bVar) {
                if (bVar == b.w()) {
                    return this;
                }
                if (bVar.A()) {
                    x(bVar.y());
                }
                if (bVar.z()) {
                    v(bVar.x());
                }
                k(i().c(bVar.f20044b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // Ze.p.a
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Ve.a.b.C0352b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    Ze.r r1 = Ve.a.b.f20043i     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    Ve.a$b r3 = (Ve.a.b) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                    Ve.a$b r4 = (Ve.a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Ve.a.b.C0352b.y1(Ze.e, Ze.g):Ve.a$b$b");
            }

            public C0352b v(int i10) {
                this.f20050b |= 2;
                this.f20052d = i10;
                return this;
            }

            public C0352b x(int i10) {
                this.f20050b |= 1;
                this.f20051c = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final c f20053h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static r f20054i = new C0353a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Ze.d f20055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f20057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f20058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f20059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20060g;

        /* JADX INFO: renamed from: Ve.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class C0353a extends Ze.b {
            C0353a() {
            }

            @Override // Ze.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c b(Ze.e eVar, g gVar) {
                return new c(eVar, gVar);
            }
        }

        static {
            c cVar = new c(true);
            f20053h = cVar;
            cVar.B();
        }

        private void B() {
            this.f20057d = 0;
            this.f20058e = 0;
        }

        public static b C() {
            return b.r();
        }

        public static b D(c cVar) {
            return C().j(cVar);
        }

        public static c w() {
            return f20053h;
        }

        public boolean A() {
            return (this.f20056c & 1) == 1;
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
            int i10 = this.f20060g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f20056c & 1) == 1 ? f.o(1, this.f20057d) : 0;
            if ((this.f20056c & 2) == 2) {
                iO += f.o(2, this.f20058e);
            }
            int size = iO + this.f20055b.size();
            this.f20060g = size;
            return size;
        }

        @Override // Ze.q
        public final boolean e() {
            byte b10 = this.f20059f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f20059f = (byte) 1;
            return true;
        }

        @Override // Ze.p
        public void g(f fVar) throws IOException {
            d();
            if ((this.f20056c & 1) == 1) {
                fVar.Z(1, this.f20057d);
            }
            if ((this.f20056c & 2) == 2) {
                fVar.Z(2, this.f20058e);
            }
            fVar.h0(this.f20055b);
        }

        public int x() {
            return this.f20058e;
        }

        public int y() {
            return this.f20057d;
        }

        public boolean z() {
            return (this.f20056c & 2) == 2;
        }

        private c(i.b bVar) {
            super(bVar);
            this.f20059f = (byte) -1;
            this.f20060g = -1;
            this.f20055b = bVar.i();
        }

        private c(boolean z10) {
            this.f20059f = (byte) -1;
            this.f20060g = -1;
            this.f20055b = Ze.d.f23287a;
        }

        private c(Ze.e eVar, g gVar) {
            this.f20059f = (byte) -1;
            this.f20060g = -1;
            B();
            d.b bVarT = Ze.d.t();
            f fVarI = f.I(bVarT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f20056c |= 1;
                                this.f20057d = eVar.r();
                            } else if (iJ != 16) {
                                if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                this.f20056c |= 2;
                                this.f20058e = eVar.r();
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f20055b = bVarT.h();
                        throw th3;
                    }
                    this.f20055b = bVarT.h();
                    l();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f20055b = bVarT.h();
                throw th4;
            }
            this.f20055b = bVarT.h();
            l();
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f20061b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f20062c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f20063d;

            private b() {
                s();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b r() {
                return new b();
            }

            @Override // Ze.p.a
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarP = p();
                if (cVarP.e()) {
                    return cVarP;
                }
                throw a.AbstractC0406a.h(cVarP);
            }

            public c p() {
                c cVar = new c(this);
                int i10 = this.f20061b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f20057d = this.f20062c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f20058e = this.f20063d;
                cVar.f20056c = i11;
                return cVar;
            }

            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return r().j(p());
            }

            @Override // Ze.i.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b j(c cVar) {
                if (cVar == c.w()) {
                    return this;
                }
                if (cVar.A()) {
                    x(cVar.y());
                }
                if (cVar.z()) {
                    v(cVar.x());
                }
                k(i().c(cVar.f20055b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // Ze.p.a
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Ve.a.c.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    Ze.r r1 = Ve.a.c.f20054i     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    Ve.a$c r3 = (Ve.a.c) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                    Ve.a$c r4 = (Ve.a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Ve.a.c.b.y1(Ze.e, Ze.g):Ve.a$c$b");
            }

            public b v(int i10) {
                this.f20061b |= 2;
                this.f20063d = i10;
                return this;
            }

            public b x(int i10) {
                this.f20061b |= 1;
                this.f20062c = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends i implements q {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final d f20064k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static r f20065l = new C0354a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Ze.d f20066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f20068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f20069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f20070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f20071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private c f20072h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte f20073i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f20074j;

        /* JADX INFO: renamed from: Ve.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class C0354a extends Ze.b {
            C0354a() {
            }

            @Override // Ze.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public d b(Ze.e eVar, g gVar) {
                return new d(eVar, gVar);
            }
        }

        static {
            d dVar = new d(true);
            f20064k = dVar;
            dVar.K();
        }

        private void K() {
            this.f20068d = b.w();
            this.f20069e = c.w();
            this.f20070f = c.w();
            this.f20071g = c.w();
            this.f20072h = c.w();
        }

        public static b L() {
            return b.r();
        }

        public static b M(d dVar) {
            return L().j(dVar);
        }

        public static d z() {
            return f20064k;
        }

        public c A() {
            return this.f20072h;
        }

        public b B() {
            return this.f20068d;
        }

        public c C() {
            return this.f20070f;
        }

        public c D() {
            return this.f20071g;
        }

        public c E() {
            return this.f20069e;
        }

        public boolean F() {
            return (this.f20067c & 16) == 16;
        }

        public boolean G() {
            return (this.f20067c & 1) == 1;
        }

        public boolean H() {
            return (this.f20067c & 4) == 4;
        }

        public boolean I() {
            return (this.f20067c & 8) == 8;
        }

        public boolean J() {
            return (this.f20067c & 2) == 2;
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public b a() {
            return L();
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public b f() {
            return M(this);
        }

        @Override // Ze.p
        public int d() {
            int i10 = this.f20074j;
            if (i10 != -1) {
                return i10;
            }
            int iR = (this.f20067c & 1) == 1 ? f.r(1, this.f20068d) : 0;
            if ((this.f20067c & 2) == 2) {
                iR += f.r(2, this.f20069e);
            }
            if ((this.f20067c & 4) == 4) {
                iR += f.r(3, this.f20070f);
            }
            if ((this.f20067c & 8) == 8) {
                iR += f.r(4, this.f20071g);
            }
            if ((this.f20067c & 16) == 16) {
                iR += f.r(5, this.f20072h);
            }
            int size = iR + this.f20066b.size();
            this.f20074j = size;
            return size;
        }

        @Override // Ze.q
        public final boolean e() {
            byte b10 = this.f20073i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f20073i = (byte) 1;
            return true;
        }

        @Override // Ze.p
        public void g(f fVar) throws IOException {
            d();
            if ((this.f20067c & 1) == 1) {
                fVar.c0(1, this.f20068d);
            }
            if ((this.f20067c & 2) == 2) {
                fVar.c0(2, this.f20069e);
            }
            if ((this.f20067c & 4) == 4) {
                fVar.c0(3, this.f20070f);
            }
            if ((this.f20067c & 8) == 8) {
                fVar.c0(4, this.f20071g);
            }
            if ((this.f20067c & 16) == 16) {
                fVar.c0(5, this.f20072h);
            }
            fVar.h0(this.f20066b);
        }

        private d(i.b bVar) {
            super(bVar);
            this.f20073i = (byte) -1;
            this.f20074j = -1;
            this.f20066b = bVar.i();
        }

        private d(boolean z10) {
            this.f20073i = (byte) -1;
            this.f20074j = -1;
            this.f20066b = Ze.d.f23287a;
        }

        private d(Ze.e eVar, g gVar) {
            this.f20073i = (byte) -1;
            this.f20074j = -1;
            K();
            d.b bVarT = Ze.d.t();
            f fVarI = f.I(bVarT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                b.C0352b c0352bF = (this.f20067c & 1) == 1 ? this.f20068d.f() : null;
                                b bVar = (b) eVar.t(b.f20043i, gVar);
                                this.f20068d = bVar;
                                if (c0352bF != null) {
                                    c0352bF.j(bVar);
                                    this.f20068d = c0352bF.p();
                                }
                                this.f20067c |= 1;
                            } else if (iJ == 18) {
                                c.b bVarF = (this.f20067c & 2) == 2 ? this.f20069e.f() : null;
                                c cVar = (c) eVar.t(c.f20054i, gVar);
                                this.f20069e = cVar;
                                if (bVarF != null) {
                                    bVarF.j(cVar);
                                    this.f20069e = bVarF.p();
                                }
                                this.f20067c |= 2;
                            } else if (iJ == 26) {
                                c.b bVarF2 = (this.f20067c & 4) == 4 ? this.f20070f.f() : null;
                                c cVar2 = (c) eVar.t(c.f20054i, gVar);
                                this.f20070f = cVar2;
                                if (bVarF2 != null) {
                                    bVarF2.j(cVar2);
                                    this.f20070f = bVarF2.p();
                                }
                                this.f20067c |= 4;
                            } else if (iJ == 34) {
                                c.b bVarF3 = (this.f20067c & 8) == 8 ? this.f20071g.f() : null;
                                c cVar3 = (c) eVar.t(c.f20054i, gVar);
                                this.f20071g = cVar3;
                                if (bVarF3 != null) {
                                    bVarF3.j(cVar3);
                                    this.f20071g = bVarF3.p();
                                }
                                this.f20067c |= 8;
                            } else if (iJ != 42) {
                                if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                c.b bVarF4 = (this.f20067c & 16) == 16 ? this.f20072h.f() : null;
                                c cVar4 = (c) eVar.t(c.f20054i, gVar);
                                this.f20072h = cVar4;
                                if (bVarF4 != null) {
                                    bVarF4.j(cVar4);
                                    this.f20072h = bVarF4.p();
                                }
                                this.f20067c |= 16;
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f20066b = bVarT.h();
                        throw th3;
                    }
                    this.f20066b = bVarT.h();
                    l();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f20066b = bVarT.h();
                throw th4;
            }
            this.f20066b = bVarT.h();
            l();
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f20075b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private b f20076c = b.w();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private c f20077d = c.w();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private c f20078e = c.w();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private c f20079f = c.w();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private c f20080g = c.w();

            private b() {
                s();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b r() {
                return new b();
            }

            public b A(c cVar) {
                if ((this.f20075b & 8) != 8 || this.f20079f == c.w()) {
                    this.f20079f = cVar;
                } else {
                    this.f20079f = c.D(this.f20079f).j(cVar).p();
                }
                this.f20075b |= 8;
                return this;
            }

            public b B(c cVar) {
                if ((this.f20075b & 2) != 2 || this.f20077d == c.w()) {
                    this.f20077d = cVar;
                } else {
                    this.f20077d = c.D(this.f20077d).j(cVar).p();
                }
                this.f20075b |= 2;
                return this;
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
                int i10 = this.f20075b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                dVar.f20068d = this.f20076c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                dVar.f20069e = this.f20077d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                dVar.f20070f = this.f20078e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                dVar.f20071g = this.f20079f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                dVar.f20072h = this.f20080g;
                dVar.f20067c = i11;
                return dVar;
            }

            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return r().j(p());
            }

            public b t(c cVar) {
                if ((this.f20075b & 16) != 16 || this.f20080g == c.w()) {
                    this.f20080g = cVar;
                } else {
                    this.f20080g = c.D(this.f20080g).j(cVar).p();
                }
                this.f20075b |= 16;
                return this;
            }

            public b u(b bVar) {
                if ((this.f20075b & 1) != 1 || this.f20076c == b.w()) {
                    this.f20076c = bVar;
                } else {
                    this.f20076c = b.D(this.f20076c).j(bVar).p();
                }
                this.f20075b |= 1;
                return this;
            }

            @Override // Ze.i.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b j(d dVar) {
                if (dVar == d.z()) {
                    return this;
                }
                if (dVar.G()) {
                    u(dVar.B());
                }
                if (dVar.J()) {
                    B(dVar.E());
                }
                if (dVar.H()) {
                    y(dVar.C());
                }
                if (dVar.I()) {
                    A(dVar.D());
                }
                if (dVar.F()) {
                    t(dVar.A());
                }
                k(i().c(dVar.f20066b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // Ze.p.a
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Ve.a.d.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    Ze.r r1 = Ve.a.d.f20065l     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    Ve.a$d r3 = (Ve.a.d) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                    Ve.a$d r4 = (Ve.a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Ve.a.d.b.y1(Ze.e, Ze.g):Ve.a$d$b");
            }

            public b y(c cVar) {
                if ((this.f20075b & 4) != 4 || this.f20078e == c.w()) {
                    this.f20078e = cVar;
                } else {
                    this.f20078e = c.D(this.f20078e).j(cVar).p();
                }
                this.f20075b |= 4;
                return this;
            }

            private void s() {
            }
        }
    }
}
