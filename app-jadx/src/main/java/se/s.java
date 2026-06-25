package Se;

import Se.r;
import Ze.a;
import Ze.d;
import Ze.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class s extends i.d implements Ze.q {

    /* JADX INFO: renamed from: q */
    private static final s f16537q;

    /* JADX INFO: renamed from: r */
    public static Ze.r f16538r = new a();

    /* JADX INFO: renamed from: c */
    private final Ze.d f16539c;

    /* JADX INFO: renamed from: d */
    private int f16540d;

    /* JADX INFO: renamed from: e */
    private int f16541e;

    /* JADX INFO: renamed from: f */
    private int f16542f;

    /* JADX INFO: renamed from: g */
    private List f16543g;

    /* JADX INFO: renamed from: h */
    private r f16544h;

    /* JADX INFO: renamed from: i */
    private int f16545i;

    /* JADX INFO: renamed from: j */
    private r f16546j;

    /* JADX INFO: renamed from: k */
    private int f16547k;

    /* JADX INFO: renamed from: l */
    private List f16548l;

    /* JADX INFO: renamed from: m */
    private List f16549m;

    /* JADX INFO: renamed from: n */
    private List f16550n;

    /* JADX INFO: renamed from: o */
    private byte f16551o;

    /* JADX INFO: renamed from: p */
    private int f16552p;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public s b(Ze.e eVar, Ze.g gVar) {
            return new s(eVar, gVar);
        }
    }

    static {
        s sVar = new s(true);
        f16537q = sVar;
        sVar.o0();
    }

    /* synthetic */ s(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    public static s W() {
        return f16537q;
    }

    private void o0() {
        this.f16541e = 6;
        this.f16542f = 0;
        List list = Collections.EMPTY_LIST;
        this.f16543g = list;
        this.f16544h = r.Y();
        this.f16545i = 0;
        this.f16546j = r.Y();
        this.f16547k = 0;
        this.f16548l = list;
        this.f16549m = list;
        this.f16550n = list;
    }

    public static b p0() {
        return b.v();
    }

    public static b q0(s sVar) {
        return p0().j(sVar);
    }

    public static s s0(InputStream inputStream, Ze.g gVar) {
        return (s) f16538r.a(inputStream, gVar);
    }

    public Se.b R(int i10) {
        return (Se.b) this.f16548l.get(i10);
    }

    public int S() {
        return this.f16548l.size();
    }

    public List T() {
        return this.f16548l;
    }

    public d U(int i10) {
        return (d) this.f16550n.get(i10);
    }

    public int V() {
        return this.f16550n.size();
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: X */
    public s c() {
        return f16537q;
    }

    public r Y() {
        return this.f16546j;
    }

    public int Z() {
        return this.f16547k;
    }

    public int a0() {
        return this.f16541e;
    }

    public int b0() {
        return this.f16542f;
    }

    public t c0(int i10) {
        return (t) this.f16543g.get(i10);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16552p;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16540d & 1) == 1 ? Ze.f.o(1, this.f16541e) : 0;
        if ((this.f16540d & 2) == 2) {
            iO += Ze.f.o(2, this.f16542f);
        }
        for (int i11 = 0; i11 < this.f16543g.size(); i11++) {
            iO += Ze.f.r(3, (Ze.p) this.f16543g.get(i11));
        }
        if ((this.f16540d & 4) == 4) {
            iO += Ze.f.r(4, this.f16544h);
        }
        if ((this.f16540d & 8) == 8) {
            iO += Ze.f.o(5, this.f16545i);
        }
        if ((this.f16540d & 16) == 16) {
            iO += Ze.f.r(6, this.f16546j);
        }
        if ((this.f16540d & 32) == 32) {
            iO += Ze.f.o(7, this.f16547k);
        }
        for (int i12 = 0; i12 < this.f16548l.size(); i12++) {
            iO += Ze.f.r(8, (Ze.p) this.f16548l.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f16549m.size(); i13++) {
            iP += Ze.f.p(((Integer) this.f16549m.get(i13)).intValue());
        }
        int size = iO + iP + (h0().size() * 2);
        for (int i14 = 0; i14 < this.f16550n.size(); i14++) {
            size += Ze.f.r(32, (Ze.p) this.f16550n.get(i14));
        }
        int iU = size + u() + this.f16539c.size();
        this.f16552p = iU;
        return iU;
    }

    public int d0() {
        return this.f16543g.size();
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16551o;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!l0()) {
            this.f16551o = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < d0(); i10++) {
            if (!c0(i10).e()) {
                this.f16551o = (byte) 0;
                return false;
            }
        }
        if (m0() && !f0().e()) {
            this.f16551o = (byte) 0;
            return false;
        }
        if (i0() && !Y().e()) {
            this.f16551o = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < S(); i11++) {
            if (!R(i11).e()) {
                this.f16551o = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < V(); i12++) {
            if (!U(i12).e()) {
                this.f16551o = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f16551o = (byte) 1;
            return true;
        }
        this.f16551o = (byte) 0;
        return false;
    }

    public List e0() {
        return this.f16543g;
    }

    public r f0() {
        return this.f16544h;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        if ((this.f16540d & 1) == 1) {
            fVar.Z(1, this.f16541e);
        }
        if ((this.f16540d & 2) == 2) {
            fVar.Z(2, this.f16542f);
        }
        for (int i10 = 0; i10 < this.f16543g.size(); i10++) {
            fVar.c0(3, (Ze.p) this.f16543g.get(i10));
        }
        if ((this.f16540d & 4) == 4) {
            fVar.c0(4, this.f16544h);
        }
        if ((this.f16540d & 8) == 8) {
            fVar.Z(5, this.f16545i);
        }
        if ((this.f16540d & 16) == 16) {
            fVar.c0(6, this.f16546j);
        }
        if ((this.f16540d & 32) == 32) {
            fVar.Z(7, this.f16547k);
        }
        for (int i11 = 0; i11 < this.f16548l.size(); i11++) {
            fVar.c0(8, (Ze.p) this.f16548l.get(i11));
        }
        for (int i12 = 0; i12 < this.f16549m.size(); i12++) {
            fVar.Z(31, ((Integer) this.f16549m.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f16550n.size(); i13++) {
            fVar.c0(32, (Ze.p) this.f16550n.get(i13));
        }
        aVarZ.a(200, fVar);
        fVar.h0(this.f16539c);
    }

    public int g0() {
        return this.f16545i;
    }

    public List h0() {
        return this.f16549m;
    }

    public boolean i0() {
        return (this.f16540d & 16) == 16;
    }

    public boolean j0() {
        return (this.f16540d & 32) == 32;
    }

    public boolean k0() {
        return (this.f16540d & 1) == 1;
    }

    public boolean l0() {
        return (this.f16540d & 2) == 2;
    }

    public boolean m0() {
        return (this.f16540d & 4) == 4;
    }

    public boolean n0() {
        return (this.f16540d & 8) == 8;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: r0 */
    public b a() {
        return p0();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: t0 */
    public b f() {
        return q0(this);
    }

    /* synthetic */ s(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private s(i.c cVar) {
        super(cVar);
        this.f16551o = (byte) -1;
        this.f16552p = -1;
        this.f16539c = cVar.i();
    }

    private s(boolean z10) {
        this.f16551o = (byte) -1;
        this.f16552p = -1;
        this.f16539c = Ze.d.f23287a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private s(Ze.e eVar, Ze.g gVar) {
        r.c cVarF;
        this.f16551o = (byte) -1;
        this.f16552p = -1;
        o0();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? P10 = 128;
            if (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f16540d |= 1;
                                this.f16541e = eVar.r();
                                break;
                            case 16:
                                this.f16540d |= 2;
                                this.f16542f = eVar.r();
                                break;
                            case 26:
                                if ((i10 & 4) != 4) {
                                    this.f16543g = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f16543g.add(eVar.t(t.f16565o, gVar));
                                break;
                            case 34:
                                cVarF = (this.f16540d & 4) == 4 ? this.f16544h.f() : null;
                                r rVar = (r) eVar.t(r.f16483v, gVar);
                                this.f16544h = rVar;
                                if (cVarF != null) {
                                    cVarF.j(rVar);
                                    this.f16544h = cVarF.t();
                                }
                                this.f16540d |= 4;
                                break;
                            case 40:
                                this.f16540d |= 8;
                                this.f16545i = eVar.r();
                                break;
                            case 50:
                                cVarF = (this.f16540d & 16) == 16 ? this.f16546j.f() : null;
                                r rVar2 = (r) eVar.t(r.f16483v, gVar);
                                this.f16546j = rVar2;
                                if (cVarF != null) {
                                    cVarF.j(rVar2);
                                    this.f16546j = cVarF.t();
                                }
                                this.f16540d |= 16;
                                break;
                            case 56:
                                this.f16540d |= 32;
                                this.f16547k = eVar.r();
                                break;
                            case 66:
                                if ((i10 & 128) != 128) {
                                    this.f16548l = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f16548l.add(eVar.t(Se.b.f16089i, gVar));
                                break;
                            case 248:
                                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                                    this.f16549m = new ArrayList();
                                    i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                }
                                this.f16549m.add(Integer.valueOf(eVar.r()));
                                break;
                            case 250:
                                int i11 = eVar.i(eVar.z());
                                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256 && eVar.e() > 0) {
                                    this.f16549m = new ArrayList();
                                    i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                }
                                while (eVar.e() > 0) {
                                    this.f16549m.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                                break;
                            case 258:
                                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                                    this.f16550n = new ArrayList();
                                    i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                }
                                this.f16550n.add(eVar.t(d.f16229i, gVar));
                                break;
                            default:
                                P10 = p(eVar, fVarI, gVar, iJ);
                                if (P10 == 0) {
                                    z10 = true;
                                }
                                break;
                        }
                    } catch (Ze.k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new Ze.k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 4) == 4) {
                        this.f16543g = Collections.unmodifiableList(this.f16543g);
                    }
                    if ((i10 & 128) == P10) {
                        this.f16548l = Collections.unmodifiableList(this.f16548l);
                    }
                    if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                        this.f16549m = Collections.unmodifiableList(this.f16549m);
                    }
                    if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                        this.f16550n = Collections.unmodifiableList(this.f16550n);
                    }
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f16539c = bVarT.h();
                        throw th3;
                    }
                    this.f16539c = bVarT.h();
                    l();
                    throw th2;
                }
            } else {
                if ((i10 & 4) == 4) {
                    this.f16543g = Collections.unmodifiableList(this.f16543g);
                }
                if ((i10 & 128) == 128) {
                    this.f16548l = Collections.unmodifiableList(this.f16548l);
                }
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.f16549m = Collections.unmodifiableList(this.f16549m);
                }
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.f16550n = Collections.unmodifiableList(this.f16550n);
                }
                try {
                    fVarI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f16539c = bVarT.h();
                    throw th4;
                }
                this.f16539c = bVarT.h();
                l();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.c implements Ze.q {

        /* JADX INFO: renamed from: d */
        private int f16553d;

        /* JADX INFO: renamed from: e */
        private int f16554e = 6;

        /* JADX INFO: renamed from: f */
        private int f16555f;

        /* JADX INFO: renamed from: g */
        private List f16556g;

        /* JADX INFO: renamed from: h */
        private r f16557h;

        /* JADX INFO: renamed from: i */
        private int f16558i;

        /* JADX INFO: renamed from: j */
        private r f16559j;

        /* JADX INFO: renamed from: k */
        private int f16560k;

        /* JADX INFO: renamed from: l */
        private List f16561l;

        /* JADX INFO: renamed from: m */
        private List f16562m;

        /* JADX INFO: renamed from: n */
        private List f16563n;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f16556g = list;
            this.f16557h = r.Y();
            this.f16559j = r.Y();
            this.f16561l = list;
            this.f16562m = list;
            this.f16563n = list;
            C();
        }

        private void A() {
            if ((this.f16553d & 4) != 4) {
                this.f16556g = new ArrayList(this.f16556g);
                this.f16553d |= 4;
            }
        }

        private void B() {
            if ((this.f16553d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                this.f16562m = new ArrayList(this.f16562m);
                this.f16553d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
        }

        public static b v() {
            return new b();
        }

        private void x() {
            if ((this.f16553d & 128) != 128) {
                this.f16561l = new ArrayList(this.f16561l);
                this.f16553d |= 128;
            }
        }

        private void y() {
            if ((this.f16553d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                this.f16563n = new ArrayList(this.f16563n);
                this.f16553d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
        }

        public b D(r rVar) {
            if ((this.f16553d & 32) != 32 || this.f16559j == r.Y()) {
                this.f16559j = rVar;
            } else {
                this.f16559j = r.z0(this.f16559j).j(rVar).t();
            }
            this.f16553d |= 32;
            return this;
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: E */
        public b j(s sVar) {
            if (sVar == s.W()) {
                return this;
            }
            if (sVar.k0()) {
                I(sVar.a0());
            }
            if (sVar.l0()) {
                J(sVar.b0());
            }
            if (!sVar.f16543g.isEmpty()) {
                if (this.f16556g.isEmpty()) {
                    this.f16556g = sVar.f16543g;
                    this.f16553d &= -5;
                } else {
                    A();
                    this.f16556g.addAll(sVar.f16543g);
                }
            }
            if (sVar.m0()) {
                G(sVar.f0());
            }
            if (sVar.n0()) {
                K(sVar.g0());
            }
            if (sVar.i0()) {
                D(sVar.Y());
            }
            if (sVar.j0()) {
                H(sVar.Z());
            }
            if (!sVar.f16548l.isEmpty()) {
                if (this.f16561l.isEmpty()) {
                    this.f16561l = sVar.f16548l;
                    this.f16553d &= -129;
                } else {
                    x();
                    this.f16561l.addAll(sVar.f16548l);
                }
            }
            if (!sVar.f16549m.isEmpty()) {
                if (this.f16562m.isEmpty()) {
                    this.f16562m = sVar.f16549m;
                    this.f16553d &= -257;
                } else {
                    B();
                    this.f16562m.addAll(sVar.f16549m);
                }
            }
            if (!sVar.f16550n.isEmpty()) {
                if (this.f16563n.isEmpty()) {
                    this.f16563n = sVar.f16550n;
                    this.f16553d &= -513;
                } else {
                    y();
                    this.f16563n.addAll(sVar.f16550n);
                }
            }
            q(sVar);
            k(i().c(sVar.f16539c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.s.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.s.f16538r     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.s r3 = (Se.s) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.s r4 = (Se.s) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.s.b.y1(Ze.e, Ze.g):Se.s$b");
        }

        public b G(r rVar) {
            if ((this.f16553d & 8) != 8 || this.f16557h == r.Y()) {
                this.f16557h = rVar;
            } else {
                this.f16557h = r.z0(this.f16557h).j(rVar).t();
            }
            this.f16553d |= 8;
            return this;
        }

        public b H(int i10) {
            this.f16553d |= 64;
            this.f16560k = i10;
            return this;
        }

        public b I(int i10) {
            this.f16553d |= 1;
            this.f16554e = i10;
            return this;
        }

        public b J(int i10) {
            this.f16553d |= 2;
            this.f16555f = i10;
            return this;
        }

        public b K(int i10) {
            this.f16553d |= 16;
            this.f16558i = i10;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public s build() {
            s sVarT = t();
            if (sVarT.e()) {
                return sVarT;
            }
            throw a.AbstractC0406a.h(sVarT);
        }

        public s t() {
            s sVar = new s(this);
            int i10 = this.f16553d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            sVar.f16541e = this.f16554e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            sVar.f16542f = this.f16555f;
            if ((this.f16553d & 4) == 4) {
                this.f16556g = Collections.unmodifiableList(this.f16556g);
                this.f16553d &= -5;
            }
            sVar.f16543g = this.f16556g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            sVar.f16544h = this.f16557h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            sVar.f16545i = this.f16558i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            sVar.f16546j = this.f16559j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            sVar.f16547k = this.f16560k;
            if ((this.f16553d & 128) == 128) {
                this.f16561l = Collections.unmodifiableList(this.f16561l);
                this.f16553d &= -129;
            }
            sVar.f16548l = this.f16561l;
            if ((this.f16553d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                this.f16562m = Collections.unmodifiableList(this.f16562m);
                this.f16553d &= -257;
            }
            sVar.f16549m = this.f16562m;
            if ((this.f16553d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.f16563n = Collections.unmodifiableList(this.f16563n);
                this.f16553d &= -513;
            }
            sVar.f16550n = this.f16563n;
            sVar.f16540d = i11;
            return sVar;
        }

        /* JADX INFO: renamed from: u */
        public b clone() {
            return v().j(t());
        }

        private void C() {
        }
    }
}
