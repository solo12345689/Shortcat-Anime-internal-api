package Se;

import Ze.a;
import Ze.d;
import Ze.i;
import Ze.j;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends Ze.i implements Ze.q {

    /* JADX INFO: renamed from: h */
    private static final b f16088h;

    /* JADX INFO: renamed from: i */
    public static Ze.r f16089i = new a();

    /* JADX INFO: renamed from: b */
    private final Ze.d f16090b;

    /* JADX INFO: renamed from: c */
    private int f16091c;

    /* JADX INFO: renamed from: d */
    private int f16092d;

    /* JADX INFO: renamed from: e */
    private List f16093e;

    /* JADX INFO: renamed from: f */
    private byte f16094f;

    /* JADX INFO: renamed from: g */
    private int f16095g;

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

    /* JADX INFO: renamed from: Se.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0278b extends Ze.i implements Ze.q {

        /* JADX INFO: renamed from: h */
        private static final C0278b f16096h;

        /* JADX INFO: renamed from: i */
        public static Ze.r f16097i = new a();

        /* JADX INFO: renamed from: b */
        private final Ze.d f16098b;

        /* JADX INFO: renamed from: c */
        private int f16099c;

        /* JADX INFO: renamed from: d */
        private int f16100d;

        /* JADX INFO: renamed from: e */
        private c f16101e;

        /* JADX INFO: renamed from: f */
        private byte f16102f;

        /* JADX INFO: renamed from: g */
        private int f16103g;

        /* JADX INFO: renamed from: Se.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a extends Ze.b {
            a() {
            }

            @Override // Ze.r
            /* JADX INFO: renamed from: j */
            public C0278b b(Ze.e eVar, Ze.g gVar) {
                return new C0278b(eVar, gVar);
            }
        }

        /* JADX INFO: renamed from: Se.b$b$c */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class c extends Ze.i implements Ze.q {

            /* JADX INFO: renamed from: q */
            private static final c f16107q;

            /* JADX INFO: renamed from: r */
            public static Ze.r f16108r = new a();

            /* JADX INFO: renamed from: b */
            private final Ze.d f16109b;

            /* JADX INFO: renamed from: c */
            private int f16110c;

            /* JADX INFO: renamed from: d */
            private EnumC0281c f16111d;

            /* JADX INFO: renamed from: e */
            private long f16112e;

            /* JADX INFO: renamed from: f */
            private float f16113f;

            /* JADX INFO: renamed from: g */
            private double f16114g;

            /* JADX INFO: renamed from: h */
            private int f16115h;

            /* JADX INFO: renamed from: i */
            private int f16116i;

            /* JADX INFO: renamed from: j */
            private int f16117j;

            /* JADX INFO: renamed from: k */
            private b f16118k;

            /* JADX INFO: renamed from: l */
            private List f16119l;

            /* JADX INFO: renamed from: m */
            private int f16120m;

            /* JADX INFO: renamed from: n */
            private int f16121n;

            /* JADX INFO: renamed from: o */
            private byte f16122o;

            /* JADX INFO: renamed from: p */
            private int f16123p;

            /* JADX INFO: renamed from: Se.b$b$c$a */
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

            /* JADX INFO: renamed from: Se.b$b$c$c */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public enum EnumC0281c implements j.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* JADX INFO: renamed from: o */
                private static j.b f16149o = new a();

                /* JADX INFO: renamed from: a */
                private final int f16151a;

                /* JADX INFO: renamed from: Se.b$b$c$c$a */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                static class a implements j.b {
                    a() {
                    }

                    @Override // Ze.j.b
                    /* JADX INFO: renamed from: b */
                    public EnumC0281c a(int i10) {
                        return EnumC0281c.a(i10);
                    }
                }

                EnumC0281c(int i10, int i11) {
                    this.f16151a = i11;
                }

                public static EnumC0281c a(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // Ze.j.a
                public final int d() {
                    return this.f16151a;
                }
            }

            static {
                c cVar = new c(true);
                f16107q = cVar;
                cVar.e0();
            }

            /* synthetic */ c(Ze.e eVar, Ze.g gVar, Se.a aVar) {
                this(eVar, gVar);
            }

            public static c M() {
                return f16107q;
            }

            private void e0() {
                this.f16111d = EnumC0281c.BYTE;
                this.f16112e = 0L;
                this.f16113f = 0.0f;
                this.f16114g = 0.0d;
                this.f16115h = 0;
                this.f16116i = 0;
                this.f16117j = 0;
                this.f16118k = b.A();
                this.f16119l = Collections.EMPTY_LIST;
                this.f16120m = 0;
                this.f16121n = 0;
            }

            public static C0280b f0() {
                return C0280b.r();
            }

            public static C0280b g0(c cVar) {
                return f0().j(cVar);
            }

            public b G() {
                return this.f16118k;
            }

            public int H() {
                return this.f16120m;
            }

            public c I(int i10) {
                return (c) this.f16119l.get(i10);
            }

            public int J() {
                return this.f16119l.size();
            }

            public List K() {
                return this.f16119l;
            }

            public int L() {
                return this.f16116i;
            }

            public double N() {
                return this.f16114g;
            }

            public int O() {
                return this.f16117j;
            }

            public int P() {
                return this.f16121n;
            }

            public float Q() {
                return this.f16113f;
            }

            public long R() {
                return this.f16112e;
            }

            public int S() {
                return this.f16115h;
            }

            public EnumC0281c T() {
                return this.f16111d;
            }

            public boolean U() {
                return (this.f16110c & 128) == 128;
            }

            public boolean V() {
                return (this.f16110c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256;
            }

            public boolean W() {
                return (this.f16110c & 32) == 32;
            }

            public boolean X() {
                return (this.f16110c & 8) == 8;
            }

            public boolean Y() {
                return (this.f16110c & 64) == 64;
            }

            public boolean Z() {
                return (this.f16110c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512;
            }

            public boolean a0() {
                return (this.f16110c & 4) == 4;
            }

            public boolean b0() {
                return (this.f16110c & 2) == 2;
            }

            public boolean c0() {
                return (this.f16110c & 16) == 16;
            }

            @Override // Ze.p
            public int d() {
                int i10 = this.f16123p;
                if (i10 != -1) {
                    return i10;
                }
                int iH = (this.f16110c & 1) == 1 ? Ze.f.h(1, this.f16111d.d()) : 0;
                if ((this.f16110c & 2) == 2) {
                    iH += Ze.f.z(2, this.f16112e);
                }
                if ((this.f16110c & 4) == 4) {
                    iH += Ze.f.l(3, this.f16113f);
                }
                if ((this.f16110c & 8) == 8) {
                    iH += Ze.f.f(4, this.f16114g);
                }
                if ((this.f16110c & 16) == 16) {
                    iH += Ze.f.o(5, this.f16115h);
                }
                if ((this.f16110c & 32) == 32) {
                    iH += Ze.f.o(6, this.f16116i);
                }
                if ((this.f16110c & 64) == 64) {
                    iH += Ze.f.o(7, this.f16117j);
                }
                if ((this.f16110c & 128) == 128) {
                    iH += Ze.f.r(8, this.f16118k);
                }
                for (int i11 = 0; i11 < this.f16119l.size(); i11++) {
                    iH += Ze.f.r(9, (Ze.p) this.f16119l.get(i11));
                }
                if ((this.f16110c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    iH += Ze.f.o(10, this.f16121n);
                }
                if ((this.f16110c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    iH += Ze.f.o(11, this.f16120m);
                }
                int size = iH + this.f16109b.size();
                this.f16123p = size;
                return size;
            }

            public boolean d0() {
                return (this.f16110c & 1) == 1;
            }

            @Override // Ze.q
            public final boolean e() {
                byte b10 = this.f16122o;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (U() && !G().e()) {
                    this.f16122o = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < J(); i10++) {
                    if (!I(i10).e()) {
                        this.f16122o = (byte) 0;
                        return false;
                    }
                }
                this.f16122o = (byte) 1;
                return true;
            }

            @Override // Ze.p
            public void g(Ze.f fVar) throws IOException {
                d();
                if ((this.f16110c & 1) == 1) {
                    fVar.R(1, this.f16111d.d());
                }
                if ((this.f16110c & 2) == 2) {
                    fVar.s0(2, this.f16112e);
                }
                if ((this.f16110c & 4) == 4) {
                    fVar.V(3, this.f16113f);
                }
                if ((this.f16110c & 8) == 8) {
                    fVar.P(4, this.f16114g);
                }
                if ((this.f16110c & 16) == 16) {
                    fVar.Z(5, this.f16115h);
                }
                if ((this.f16110c & 32) == 32) {
                    fVar.Z(6, this.f16116i);
                }
                if ((this.f16110c & 64) == 64) {
                    fVar.Z(7, this.f16117j);
                }
                if ((this.f16110c & 128) == 128) {
                    fVar.c0(8, this.f16118k);
                }
                for (int i10 = 0; i10 < this.f16119l.size(); i10++) {
                    fVar.c0(9, (Ze.p) this.f16119l.get(i10));
                }
                if ((this.f16110c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    fVar.Z(10, this.f16121n);
                }
                if ((this.f16110c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    fVar.Z(11, this.f16120m);
                }
                fVar.h0(this.f16109b);
            }

            @Override // Ze.p
            /* JADX INFO: renamed from: h0 */
            public C0280b a() {
                return f0();
            }

            @Override // Ze.p
            /* JADX INFO: renamed from: i0 */
            public C0280b f() {
                return g0(this);
            }

            /* synthetic */ c(i.b bVar, Se.a aVar) {
                this(bVar);
            }

            private c(i.b bVar) {
                super(bVar);
                this.f16122o = (byte) -1;
                this.f16123p = -1;
                this.f16109b = bVar.i();
            }

            private c(boolean z10) {
                this.f16122o = (byte) -1;
                this.f16123p = -1;
                this.f16109b = Ze.d.f23287a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private c(Ze.e eVar, Ze.g gVar) {
                this.f16122o = (byte) -1;
                this.f16123p = -1;
                e0();
                d.b bVarT = Ze.d.t();
                Ze.f fVarI = Ze.f.I(bVarT, 1);
                boolean z10 = false;
                char c10 = 0;
                while (true) {
                    ?? P10 = 256;
                    if (!z10) {
                        try {
                            try {
                                try {
                                    int iJ = eVar.J();
                                    switch (iJ) {
                                        case 0:
                                            z10 = true;
                                            break;
                                        case 8:
                                            int iM = eVar.m();
                                            EnumC0281c enumC0281cA = EnumC0281c.a(iM);
                                            if (enumC0281cA == null) {
                                                fVarI.n0(iJ);
                                                fVarI.n0(iM);
                                            } else {
                                                this.f16110c |= 1;
                                                this.f16111d = enumC0281cA;
                                            }
                                            break;
                                        case 16:
                                            this.f16110c |= 2;
                                            this.f16112e = eVar.G();
                                            break;
                                        case 29:
                                            this.f16110c |= 4;
                                            this.f16113f = eVar.p();
                                            break;
                                        case 33:
                                            this.f16110c |= 8;
                                            this.f16114g = eVar.l();
                                            break;
                                        case 40:
                                            this.f16110c |= 16;
                                            this.f16115h = eVar.r();
                                            break;
                                        case 48:
                                            this.f16110c |= 32;
                                            this.f16116i = eVar.r();
                                            break;
                                        case 56:
                                            this.f16110c |= 64;
                                            this.f16117j = eVar.r();
                                            break;
                                        case 66:
                                            c cVarF = (this.f16110c & 128) == 128 ? this.f16118k.f() : null;
                                            b bVar = (b) eVar.t(b.f16089i, gVar);
                                            this.f16118k = bVar;
                                            if (cVarF != null) {
                                                cVarF.j(bVar);
                                                this.f16118k = cVarF.p();
                                            }
                                            this.f16110c |= 128;
                                            break;
                                        case 74:
                                            if ((c10 & 256) != 256) {
                                                this.f16119l = new ArrayList();
                                                c10 = 256;
                                            }
                                            this.f16119l.add(eVar.t(f16108r, gVar));
                                            break;
                                        case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                                            this.f16110c |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                            this.f16121n = eVar.r();
                                            break;
                                        case 88:
                                            this.f16110c |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                            this.f16120m = eVar.r();
                                            break;
                                        default:
                                            P10 = p(eVar, fVarI, gVar, iJ);
                                            if (P10 == 0) {
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
                            if ((c10 & 256) == P10) {
                                this.f16119l = Collections.unmodifiableList(this.f16119l);
                            }
                            try {
                                fVarI.H();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f16109b = bVarT.h();
                                throw th3;
                            }
                            this.f16109b = bVarT.h();
                            l();
                            throw th2;
                        }
                    } else {
                        if ((c10 & 256) == 256) {
                            this.f16119l = Collections.unmodifiableList(this.f16119l);
                        }
                        try {
                            fVarI.H();
                        } catch (IOException unused2) {
                        } catch (Throwable th4) {
                            this.f16109b = bVarT.h();
                            throw th4;
                        }
                        this.f16109b = bVarT.h();
                        l();
                        return;
                    }
                }
            }

            /* JADX INFO: renamed from: Se.b$b$c$b */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class C0280b extends i.b implements Ze.q {

                /* JADX INFO: renamed from: b */
                private int f16124b;

                /* JADX INFO: renamed from: d */
                private long f16126d;

                /* JADX INFO: renamed from: e */
                private float f16127e;

                /* JADX INFO: renamed from: f */
                private double f16128f;

                /* JADX INFO: renamed from: g */
                private int f16129g;

                /* JADX INFO: renamed from: h */
                private int f16130h;

                /* JADX INFO: renamed from: i */
                private int f16131i;

                /* JADX INFO: renamed from: l */
                private int f16134l;

                /* JADX INFO: renamed from: m */
                private int f16135m;

                /* JADX INFO: renamed from: c */
                private EnumC0281c f16125c = EnumC0281c.BYTE;

                /* JADX INFO: renamed from: j */
                private b f16132j = b.A();

                /* JADX INFO: renamed from: k */
                private List f16133k = Collections.EMPTY_LIST;

                private C0280b() {
                    t();
                }

                public static C0280b r() {
                    return new C0280b();
                }

                private void s() {
                    if ((this.f16124b & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                        this.f16133k = new ArrayList(this.f16133k);
                        this.f16124b |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    }
                }

                public C0280b A(int i10) {
                    this.f16124b |= 32;
                    this.f16130h = i10;
                    return this;
                }

                public C0280b B(double d10) {
                    this.f16124b |= 8;
                    this.f16128f = d10;
                    return this;
                }

                public C0280b C(int i10) {
                    this.f16124b |= 64;
                    this.f16131i = i10;
                    return this;
                }

                public C0280b D(int i10) {
                    this.f16124b |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    this.f16135m = i10;
                    return this;
                }

                public C0280b E(float f10) {
                    this.f16124b |= 4;
                    this.f16127e = f10;
                    return this;
                }

                public C0280b F(long j10) {
                    this.f16124b |= 2;
                    this.f16126d = j10;
                    return this;
                }

                public C0280b G(int i10) {
                    this.f16124b |= 16;
                    this.f16129g = i10;
                    return this;
                }

                public C0280b H(EnumC0281c enumC0281c) {
                    enumC0281c.getClass();
                    this.f16124b |= 1;
                    this.f16125c = enumC0281c;
                    return this;
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
                    int i10 = this.f16124b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f16111d = this.f16125c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f16112e = this.f16126d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f16113f = this.f16127e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f16114g = this.f16128f;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    cVar.f16115h = this.f16129g;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    cVar.f16116i = this.f16130h;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    cVar.f16117j = this.f16131i;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    cVar.f16118k = this.f16132j;
                    if ((this.f16124b & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                        this.f16133k = Collections.unmodifiableList(this.f16133k);
                        this.f16124b &= -257;
                    }
                    cVar.f16119l = this.f16133k;
                    if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    }
                    cVar.f16120m = this.f16134l;
                    if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    }
                    cVar.f16121n = this.f16135m;
                    cVar.f16110c = i11;
                    return cVar;
                }

                /* JADX INFO: renamed from: q */
                public C0280b clone() {
                    return r().j(p());
                }

                public C0280b u(b bVar) {
                    if ((this.f16124b & 128) != 128 || this.f16132j == b.A()) {
                        this.f16132j = bVar;
                    } else {
                        this.f16132j = b.F(this.f16132j).j(bVar).p();
                    }
                    this.f16124b |= 128;
                    return this;
                }

                @Override // Ze.i.b
                /* JADX INFO: renamed from: v */
                public C0280b j(c cVar) {
                    if (cVar == c.M()) {
                        return this;
                    }
                    if (cVar.d0()) {
                        H(cVar.T());
                    }
                    if (cVar.b0()) {
                        F(cVar.R());
                    }
                    if (cVar.a0()) {
                        E(cVar.Q());
                    }
                    if (cVar.X()) {
                        B(cVar.N());
                    }
                    if (cVar.c0()) {
                        G(cVar.S());
                    }
                    if (cVar.W()) {
                        A(cVar.L());
                    }
                    if (cVar.Y()) {
                        C(cVar.O());
                    }
                    if (cVar.U()) {
                        u(cVar.G());
                    }
                    if (!cVar.f16119l.isEmpty()) {
                        if (this.f16133k.isEmpty()) {
                            this.f16133k = cVar.f16119l;
                            this.f16124b &= -257;
                        } else {
                            s();
                            this.f16133k.addAll(cVar.f16119l);
                        }
                    }
                    if (cVar.V()) {
                        y(cVar.H());
                    }
                    if (cVar.Z()) {
                        D(cVar.P());
                    }
                    k(i().c(cVar.f16109b));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
                @Override // Ze.p.a
                /* JADX INFO: renamed from: x */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public Se.b.C0278b.c.C0280b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        Ze.r r1 = Se.b.C0278b.c.f16108r     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                        java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                        Se.b$b$c r3 = (Se.b.C0278b.c) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                        Se.b$b$c r4 = (Se.b.C0278b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: Se.b.C0278b.c.C0280b.y1(Ze.e, Ze.g):Se.b$b$c$b");
                }

                public C0280b y(int i10) {
                    this.f16124b |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    this.f16134l = i10;
                    return this;
                }

                private void t() {
                }
            }
        }

        static {
            C0278b c0278b = new C0278b(true);
            f16096h = c0278b;
            c0278b.B();
        }

        /* synthetic */ C0278b(Ze.e eVar, Ze.g gVar, Se.a aVar) {
            this(eVar, gVar);
        }

        private void B() {
            this.f16100d = 0;
            this.f16101e = c.M();
        }

        public static C0279b C() {
            return C0279b.r();
        }

        public static C0279b D(C0278b c0278b) {
            return C().j(c0278b);
        }

        public static C0278b w() {
            return f16096h;
        }

        public boolean A() {
            return (this.f16099c & 2) == 2;
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: E */
        public C0279b a() {
            return C();
        }

        @Override // Ze.p
        /* JADX INFO: renamed from: F */
        public C0279b f() {
            return D(this);
        }

        @Override // Ze.p
        public int d() {
            int i10 = this.f16103g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f16099c & 1) == 1 ? Ze.f.o(1, this.f16100d) : 0;
            if ((this.f16099c & 2) == 2) {
                iO += Ze.f.r(2, this.f16101e);
            }
            int size = iO + this.f16098b.size();
            this.f16103g = size;
            return size;
        }

        @Override // Ze.q
        public final boolean e() {
            byte b10 = this.f16102f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!z()) {
                this.f16102f = (byte) 0;
                return false;
            }
            if (!A()) {
                this.f16102f = (byte) 0;
                return false;
            }
            if (y().e()) {
                this.f16102f = (byte) 1;
                return true;
            }
            this.f16102f = (byte) 0;
            return false;
        }

        @Override // Ze.p
        public void g(Ze.f fVar) throws IOException {
            d();
            if ((this.f16099c & 1) == 1) {
                fVar.Z(1, this.f16100d);
            }
            if ((this.f16099c & 2) == 2) {
                fVar.c0(2, this.f16101e);
            }
            fVar.h0(this.f16098b);
        }

        public int x() {
            return this.f16100d;
        }

        public c y() {
            return this.f16101e;
        }

        public boolean z() {
            return (this.f16099c & 1) == 1;
        }

        /* synthetic */ C0278b(i.b bVar, Se.a aVar) {
            this(bVar);
        }

        private C0278b(i.b bVar) {
            super(bVar);
            this.f16102f = (byte) -1;
            this.f16103g = -1;
            this.f16098b = bVar.i();
        }

        private C0278b(boolean z10) {
            this.f16102f = (byte) -1;
            this.f16103g = -1;
            this.f16098b = Ze.d.f23287a;
        }

        private C0278b(Ze.e eVar, Ze.g gVar) {
            this.f16102f = (byte) -1;
            this.f16103g = -1;
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
                                this.f16099c |= 1;
                                this.f16100d = eVar.r();
                            } else if (iJ != 18) {
                                if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                            } else {
                                c.C0280b c0280bF = (this.f16099c & 2) == 2 ? this.f16101e.f() : null;
                                c cVar = (c) eVar.t(c.f16108r, gVar);
                                this.f16101e = cVar;
                                if (c0280bF != null) {
                                    c0280bF.j(cVar);
                                    this.f16101e = c0280bF.p();
                                }
                                this.f16099c |= 2;
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
                        this.f16098b = bVarT.h();
                        throw th3;
                    }
                    this.f16098b = bVarT.h();
                    l();
                    throw th2;
                }
            }
            try {
                fVarI.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f16098b = bVarT.h();
                throw th4;
            }
            this.f16098b = bVarT.h();
            l();
        }

        /* JADX INFO: renamed from: Se.b$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0279b extends i.b implements Ze.q {

            /* JADX INFO: renamed from: b */
            private int f16104b;

            /* JADX INFO: renamed from: c */
            private int f16105c;

            /* JADX INFO: renamed from: d */
            private c f16106d = c.M();

            private C0279b() {
                s();
            }

            public static C0279b r() {
                return new C0279b();
            }

            @Override // Ze.p.a
            /* JADX INFO: renamed from: n */
            public C0278b build() {
                C0278b c0278bP = p();
                if (c0278bP.e()) {
                    return c0278bP;
                }
                throw a.AbstractC0406a.h(c0278bP);
            }

            public C0278b p() {
                C0278b c0278b = new C0278b(this);
                int i10 = this.f16104b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                c0278b.f16100d = this.f16105c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c0278b.f16101e = this.f16106d;
                c0278b.f16099c = i11;
                return c0278b;
            }

            /* JADX INFO: renamed from: q */
            public C0279b clone() {
                return r().j(p());
            }

            @Override // Ze.i.b
            /* JADX INFO: renamed from: t */
            public C0279b j(C0278b c0278b) {
                if (c0278b == C0278b.w()) {
                    return this;
                }
                if (c0278b.z()) {
                    x(c0278b.x());
                }
                if (c0278b.A()) {
                    v(c0278b.y());
                }
                k(i().c(c0278b.f16098b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
            @Override // Ze.p.a
            /* JADX INFO: renamed from: u */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public Se.b.C0278b.C0279b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    Ze.r r1 = Se.b.C0278b.f16097i     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                    Se.b$b r3 = (Se.b.C0278b) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                    Se.b$b r4 = (Se.b.C0278b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: Se.b.C0278b.C0279b.y1(Ze.e, Ze.g):Se.b$b$b");
            }

            public C0279b v(c cVar) {
                if ((this.f16104b & 2) != 2 || this.f16106d == c.M()) {
                    this.f16106d = cVar;
                } else {
                    this.f16106d = c.g0(this.f16106d).j(cVar).p();
                }
                this.f16104b |= 2;
                return this;
            }

            public C0279b x(int i10) {
                this.f16104b |= 1;
                this.f16105c = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    static {
        b bVar = new b(true);
        f16088h = bVar;
        bVar.D();
    }

    /* synthetic */ b(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static b A() {
        return f16088h;
    }

    private void D() {
        this.f16092d = 0;
        this.f16093e = Collections.EMPTY_LIST;
    }

    public static c E() {
        return c.r();
    }

    public static c F(b bVar) {
        return E().j(bVar);
    }

    public int B() {
        return this.f16092d;
    }

    public boolean C() {
        return (this.f16091c & 1) == 1;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: G */
    public c a() {
        return E();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: H */
    public c f() {
        return F(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16095g;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16091c & 1) == 1 ? Ze.f.o(1, this.f16092d) : 0;
        for (int i11 = 0; i11 < this.f16093e.size(); i11++) {
            iO += Ze.f.r(2, (Ze.p) this.f16093e.get(i11));
        }
        int size = iO + this.f16090b.size();
        this.f16095g = size;
        return size;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16094f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!C()) {
            this.f16094f = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < y(); i10++) {
            if (!x(i10).e()) {
                this.f16094f = (byte) 0;
                return false;
            }
        }
        this.f16094f = (byte) 1;
        return true;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        if ((this.f16091c & 1) == 1) {
            fVar.Z(1, this.f16092d);
        }
        for (int i10 = 0; i10 < this.f16093e.size(); i10++) {
            fVar.c0(2, (Ze.p) this.f16093e.get(i10));
        }
        fVar.h0(this.f16090b);
    }

    public C0278b x(int i10) {
        return (C0278b) this.f16093e.get(i10);
    }

    public int y() {
        return this.f16093e.size();
    }

    public List z() {
        return this.f16093e;
    }

    /* synthetic */ b(i.b bVar, Se.a aVar) {
        this(bVar);
    }

    private b(i.b bVar) {
        super(bVar);
        this.f16094f = (byte) -1;
        this.f16095g = -1;
        this.f16090b = bVar.i();
    }

    private b(boolean z10) {
        this.f16094f = (byte) -1;
        this.f16095g = -1;
        this.f16090b = Ze.d.f23287a;
    }

    private b(Ze.e eVar, Ze.g gVar) {
        this.f16094f = (byte) -1;
        this.f16095g = -1;
        D();
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
                            this.f16091c |= 1;
                            this.f16092d = eVar.r();
                        } else if (iJ != 18) {
                            if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        } else {
                            if ((c10 & 2) != 2) {
                                this.f16093e = new ArrayList();
                                c10 = 2;
                            }
                            this.f16093e.add(eVar.t(C0278b.f16097i, gVar));
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
                    this.f16093e = Collections.unmodifiableList(this.f16093e);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16090b = bVarT.h();
                    throw th3;
                }
                this.f16090b = bVarT.h();
                l();
                throw th2;
            }
        }
        if ((c10 & 2) == 2) {
            this.f16093e = Collections.unmodifiableList(this.f16093e);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16090b = bVarT.h();
            throw th4;
        }
        this.f16090b = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends i.b implements Ze.q {

        /* JADX INFO: renamed from: b */
        private int f16152b;

        /* JADX INFO: renamed from: c */
        private int f16153c;

        /* JADX INFO: renamed from: d */
        private List f16154d = Collections.EMPTY_LIST;

        private c() {
            t();
        }

        public static c r() {
            return new c();
        }

        private void s() {
            if ((this.f16152b & 2) != 2) {
                this.f16154d = new ArrayList(this.f16154d);
                this.f16152b |= 2;
            }
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
            int i10 = (this.f16152b & 1) != 1 ? 0 : 1;
            bVar.f16092d = this.f16153c;
            if ((this.f16152b & 2) == 2) {
                this.f16154d = Collections.unmodifiableList(this.f16154d);
                this.f16152b &= -3;
            }
            bVar.f16093e = this.f16154d;
            bVar.f16091c = i10;
            return bVar;
        }

        /* JADX INFO: renamed from: q */
        public c clone() {
            return r().j(p());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: u */
        public c j(b bVar) {
            if (bVar == b.A()) {
                return this;
            }
            if (bVar.C()) {
                x(bVar.B());
            }
            if (!bVar.f16093e.isEmpty()) {
                if (this.f16154d.isEmpty()) {
                    this.f16154d = bVar.f16093e;
                    this.f16152b &= -3;
                } else {
                    s();
                    this.f16154d.addAll(bVar.f16093e);
                }
            }
            k(i().c(bVar.f16090b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: v */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.b.c y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.b.f16089i     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.b r3 = (Se.b) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.b r4 = (Se.b) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.b.c.y1(Ze.e, Ze.g):Se.b$c");
        }

        public c x(int i10) {
            this.f16152b |= 1;
            this.f16153c = i10;
            return this;
        }

        private void t() {
        }
    }
}
