package Se;

import Se.r;
import Se.v;
import Ze.a;
import Ze.d;
import Ze.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.utils.EventsFileHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class o extends i.d implements Ze.q {

    /* JADX INFO: renamed from: w */
    private static final o f16409w;

    /* JADX INFO: renamed from: x */
    public static Ze.r f16410x = new a();

    /* JADX INFO: renamed from: c */
    private final Ze.d f16411c;

    /* JADX INFO: renamed from: d */
    private int f16412d;

    /* JADX INFO: renamed from: e */
    private int f16413e;

    /* JADX INFO: renamed from: f */
    private int f16414f;

    /* JADX INFO: renamed from: g */
    private int f16415g;

    /* JADX INFO: renamed from: h */
    private r f16416h;

    /* JADX INFO: renamed from: i */
    private int f16417i;

    /* JADX INFO: renamed from: j */
    private List f16418j;

    /* JADX INFO: renamed from: k */
    private r f16419k;

    /* JADX INFO: renamed from: l */
    private int f16420l;

    /* JADX INFO: renamed from: m */
    private List f16421m;

    /* JADX INFO: renamed from: n */
    private List f16422n;

    /* JADX INFO: renamed from: o */
    private int f16423o;

    /* JADX INFO: renamed from: p */
    private v f16424p;

    /* JADX INFO: renamed from: q */
    private int f16425q;

    /* JADX INFO: renamed from: r */
    private int f16426r;

    /* JADX INFO: renamed from: s */
    private List f16427s;

    /* JADX INFO: renamed from: t */
    private List f16428t;

    /* JADX INFO: renamed from: u */
    private byte f16429u;

    /* JADX INFO: renamed from: v */
    private int f16430v;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public o b(Ze.e eVar, Ze.g gVar) {
            return new o(eVar, gVar);
        }
    }

    static {
        o oVar = new o(true);
        f16409w = oVar;
        oVar.D0();
    }

    /* synthetic */ o(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    private void D0() {
        this.f16413e = 518;
        this.f16414f = 2054;
        this.f16415g = 0;
        this.f16416h = r.Y();
        this.f16417i = 0;
        List list = Collections.EMPTY_LIST;
        this.f16418j = list;
        this.f16419k = r.Y();
        this.f16420l = 0;
        this.f16421m = list;
        this.f16422n = list;
        this.f16424p = v.J();
        this.f16425q = 0;
        this.f16426r = 0;
        this.f16427s = list;
        this.f16428t = list;
    }

    public static b E0() {
        return b.v();
    }

    public static b F0(o oVar) {
        return E0().j(oVar);
    }

    public static o d0() {
        return f16409w;
    }

    public boolean A0() {
        return (this.f16412d & 16) == 16;
    }

    public boolean B0() {
        return (this.f16412d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512;
    }

    public boolean C0() {
        return (this.f16412d & 128) == 128;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: G0 */
    public b a() {
        return E0();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: H0 */
    public b f() {
        return F0(this);
    }

    public d X(int i10) {
        return (d) this.f16428t.get(i10);
    }

    public int Y() {
        return this.f16428t.size();
    }

    public r Z(int i10) {
        return (r) this.f16421m.get(i10);
    }

    public int a0() {
        return this.f16421m.size();
    }

    public List b0() {
        return this.f16422n;
    }

    public List c0() {
        return this.f16421m;
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16430v;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16412d & 2) == 2 ? Ze.f.o(1, this.f16414f) : 0;
        if ((this.f16412d & 4) == 4) {
            iO += Ze.f.o(2, this.f16415g);
        }
        if ((this.f16412d & 8) == 8) {
            iO += Ze.f.r(3, this.f16416h);
        }
        for (int i11 = 0; i11 < this.f16418j.size(); i11++) {
            iO += Ze.f.r(4, (Ze.p) this.f16418j.get(i11));
        }
        if ((this.f16412d & 32) == 32) {
            iO += Ze.f.r(5, this.f16419k);
        }
        if ((this.f16412d & 128) == 128) {
            iO += Ze.f.r(6, this.f16424p);
        }
        if ((this.f16412d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            iO += Ze.f.o(7, this.f16425q);
        }
        if ((this.f16412d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            iO += Ze.f.o(8, this.f16426r);
        }
        if ((this.f16412d & 16) == 16) {
            iO += Ze.f.o(9, this.f16417i);
        }
        if ((this.f16412d & 64) == 64) {
            iO += Ze.f.o(10, this.f16420l);
        }
        if ((this.f16412d & 1) == 1) {
            iO += Ze.f.o(11, this.f16413e);
        }
        for (int i12 = 0; i12 < this.f16421m.size(); i12++) {
            iO += Ze.f.r(12, (Ze.p) this.f16421m.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f16422n.size(); i13++) {
            iP += Ze.f.p(((Integer) this.f16422n.get(i13)).intValue());
        }
        int iP2 = iO + iP;
        if (!b0().isEmpty()) {
            iP2 = iP2 + 1 + Ze.f.p(iP);
        }
        this.f16423o = iP;
        int iP3 = 0;
        for (int i14 = 0; i14 < this.f16427s.size(); i14++) {
            iP3 += Ze.f.p(((Integer) this.f16427s.get(i14)).intValue());
        }
        int size = iP2 + iP3 + (s0().size() * 2);
        for (int i15 = 0; i15 < this.f16428t.size(); i15++) {
            size += Ze.f.r(32, (Ze.p) this.f16428t.get(i15));
        }
        int iU = size + u() + this.f16411c.size();
        this.f16430v = iU;
        return iU;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16429u;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!v0()) {
            this.f16429u = (byte) 0;
            return false;
        }
        if (z0() && !l0().e()) {
            this.f16429u = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < q0(); i10++) {
            if (!p0(i10).e()) {
                this.f16429u = (byte) 0;
                return false;
            }
        }
        if (x0() && !j0().e()) {
            this.f16429u = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < a0(); i11++) {
            if (!Z(i11).e()) {
                this.f16429u = (byte) 0;
                return false;
            }
        }
        if (C0() && !o0().e()) {
            this.f16429u = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < Y(); i12++) {
            if (!X(i12).e()) {
                this.f16429u = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f16429u = (byte) 1;
            return true;
        }
        this.f16429u = (byte) 0;
        return false;
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: e0 */
    public o c() {
        return f16409w;
    }

    public int f0() {
        return this.f16413e;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        if ((this.f16412d & 2) == 2) {
            fVar.Z(1, this.f16414f);
        }
        if ((this.f16412d & 4) == 4) {
            fVar.Z(2, this.f16415g);
        }
        if ((this.f16412d & 8) == 8) {
            fVar.c0(3, this.f16416h);
        }
        for (int i10 = 0; i10 < this.f16418j.size(); i10++) {
            fVar.c0(4, (Ze.p) this.f16418j.get(i10));
        }
        if ((this.f16412d & 32) == 32) {
            fVar.c0(5, this.f16419k);
        }
        if ((this.f16412d & 128) == 128) {
            fVar.c0(6, this.f16424p);
        }
        if ((this.f16412d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            fVar.Z(7, this.f16425q);
        }
        if ((this.f16412d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            fVar.Z(8, this.f16426r);
        }
        if ((this.f16412d & 16) == 16) {
            fVar.Z(9, this.f16417i);
        }
        if ((this.f16412d & 64) == 64) {
            fVar.Z(10, this.f16420l);
        }
        if ((this.f16412d & 1) == 1) {
            fVar.Z(11, this.f16413e);
        }
        for (int i11 = 0; i11 < this.f16421m.size(); i11++) {
            fVar.c0(12, (Ze.p) this.f16421m.get(i11));
        }
        if (b0().size() > 0) {
            fVar.n0(106);
            fVar.n0(this.f16423o);
        }
        for (int i12 = 0; i12 < this.f16422n.size(); i12++) {
            fVar.a0(((Integer) this.f16422n.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f16427s.size(); i13++) {
            fVar.Z(31, ((Integer) this.f16427s.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f16428t.size(); i14++) {
            fVar.c0(32, (Ze.p) this.f16428t.get(i14));
        }
        aVarZ.a(19000, fVar);
        fVar.h0(this.f16411c);
    }

    public int g0() {
        return this.f16425q;
    }

    public int h0() {
        return this.f16415g;
    }

    public int i0() {
        return this.f16414f;
    }

    public r j0() {
        return this.f16419k;
    }

    public int k0() {
        return this.f16420l;
    }

    public r l0() {
        return this.f16416h;
    }

    public int m0() {
        return this.f16417i;
    }

    public int n0() {
        return this.f16426r;
    }

    public v o0() {
        return this.f16424p;
    }

    public t p0(int i10) {
        return (t) this.f16418j.get(i10);
    }

    public int q0() {
        return this.f16418j.size();
    }

    public List r0() {
        return this.f16418j;
    }

    public List s0() {
        return this.f16427s;
    }

    public boolean t0() {
        return (this.f16412d & 1) == 1;
    }

    public boolean u0() {
        return (this.f16412d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256;
    }

    public boolean v0() {
        return (this.f16412d & 4) == 4;
    }

    public boolean w0() {
        return (this.f16412d & 2) == 2;
    }

    public boolean x0() {
        return (this.f16412d & 32) == 32;
    }

    public boolean y0() {
        return (this.f16412d & 64) == 64;
    }

    public boolean z0() {
        return (this.f16412d & 8) == 8;
    }

    /* synthetic */ o(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private o(i.c cVar) {
        super(cVar);
        this.f16423o = -1;
        this.f16429u = (byte) -1;
        this.f16430v = -1;
        this.f16411c = cVar.i();
    }

    private o(boolean z10) {
        this.f16423o = -1;
        this.f16429u = (byte) -1;
        this.f16430v = -1;
        this.f16411c = Ze.d.f23287a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private o(Ze.e eVar, Ze.g gVar) {
        this.f16423o = -1;
        this.f16429u = (byte) -1;
        this.f16430v = -1;
        D0();
        d.b bVarT = Ze.d.t();
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? P10 = 16384;
            if (!z10) {
                try {
                    try {
                        int iJ = eVar.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f16412d |= 2;
                                this.f16414f = eVar.r();
                                break;
                            case 16:
                                this.f16412d |= 4;
                                this.f16415g = eVar.r();
                                break;
                            case 26:
                                r.c cVarF = (this.f16412d & 8) == 8 ? this.f16416h.f() : null;
                                r rVar = (r) eVar.t(r.f16483v, gVar);
                                this.f16416h = rVar;
                                if (cVarF != null) {
                                    cVarF.j(rVar);
                                    this.f16416h = cVarF.t();
                                }
                                this.f16412d |= 8;
                                break;
                            case 34:
                                int i11 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i11 != 32) {
                                    this.f16418j = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f16418j.add(eVar.t(t.f16565o, gVar));
                                break;
                            case 42:
                                r.c cVarF2 = (this.f16412d & 32) == 32 ? this.f16419k.f() : null;
                                r rVar2 = (r) eVar.t(r.f16483v, gVar);
                                this.f16419k = rVar2;
                                if (cVarF2 != null) {
                                    cVarF2.j(rVar2);
                                    this.f16419k = cVarF2.t();
                                }
                                this.f16412d |= 32;
                                break;
                            case 50:
                                v.b bVarF = (this.f16412d & 128) == 128 ? this.f16424p.f() : null;
                                v vVar = (v) eVar.t(v.f16602n, gVar);
                                this.f16424p = vVar;
                                if (bVarF != null) {
                                    bVarF.j(vVar);
                                    this.f16424p = bVarF.t();
                                }
                                this.f16412d |= 128;
                                break;
                            case 56:
                                this.f16412d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                this.f16425q = eVar.r();
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                this.f16412d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                this.f16426r = eVar.r();
                                break;
                            case 72:
                                this.f16412d |= 16;
                                this.f16417i = eVar.r();
                                break;
                            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                                this.f16412d |= 64;
                                this.f16420l = eVar.r();
                                break;
                            case 88:
                                this.f16412d |= 1;
                                this.f16413e = eVar.r();
                                break;
                            case 98:
                                int i12 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                i10 = i10;
                                if (i12 != 256) {
                                    this.f16421m = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                }
                                this.f16421m.add(eVar.t(r.f16483v, gVar));
                                break;
                            case 104:
                                int i13 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                i10 = i10;
                                if (i13 != 512) {
                                    this.f16422n = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                }
                                this.f16422n.add(Integer.valueOf(eVar.r()));
                                break;
                            case 106:
                                int i14 = eVar.i(eVar.z());
                                int i15 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                i10 = i10;
                                if (i15 != 512) {
                                    i10 = i10;
                                    if (eVar.e() > 0) {
                                        this.f16422n = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f16422n.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i14);
                                break;
                            case 248:
                                int i16 = (i10 == true ? 1 : 0) & 8192;
                                i10 = i10;
                                if (i16 != 8192) {
                                    this.f16427s = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8192;
                                }
                                this.f16427s.add(Integer.valueOf(eVar.r()));
                                break;
                            case 250:
                                int i17 = eVar.i(eVar.z());
                                int i18 = (i10 == true ? 1 : 0) & 8192;
                                i10 = i10;
                                if (i18 != 8192) {
                                    i10 = i10;
                                    if (eVar.e() > 0) {
                                        this.f16427s = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 8192;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f16427s.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i17);
                                break;
                            case 258:
                                int i19 = (i10 == true ? 1 : 0) & 16384;
                                i10 = i10;
                                if (i19 != 16384) {
                                    this.f16428t = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 16384;
                                }
                                this.f16428t.add(eVar.t(d.f16229i, gVar));
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
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f16418j = Collections.unmodifiableList(this.f16418j);
                    }
                    if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                        this.f16421m = Collections.unmodifiableList(this.f16421m);
                    }
                    if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                        this.f16422n = Collections.unmodifiableList(this.f16422n);
                    }
                    if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                        this.f16427s = Collections.unmodifiableList(this.f16427s);
                    }
                    if (((i10 == true ? 1 : 0) & 16384) == P10) {
                        this.f16428t = Collections.unmodifiableList(this.f16428t);
                    }
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f16411c = bVarT.h();
                        throw th3;
                    }
                    this.f16411c = bVarT.h();
                    l();
                    throw th2;
                }
            } else {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f16418j = Collections.unmodifiableList(this.f16418j);
                }
                if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.f16421m = Collections.unmodifiableList(this.f16421m);
                }
                if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.f16422n = Collections.unmodifiableList(this.f16422n);
                }
                if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f16427s = Collections.unmodifiableList(this.f16427s);
                }
                if (((i10 == true ? 1 : 0) & 16384) == 16384) {
                    this.f16428t = Collections.unmodifiableList(this.f16428t);
                }
                try {
                    fVarI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f16411c = bVarT.h();
                    throw th4;
                }
                this.f16411c = bVarT.h();
                l();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.c implements Ze.q {

        /* JADX INFO: renamed from: d */
        private int f16431d;

        /* JADX INFO: renamed from: g */
        private int f16434g;

        /* JADX INFO: renamed from: i */
        private int f16436i;

        /* JADX INFO: renamed from: j */
        private List f16437j;

        /* JADX INFO: renamed from: k */
        private r f16438k;

        /* JADX INFO: renamed from: l */
        private int f16439l;

        /* JADX INFO: renamed from: m */
        private List f16440m;

        /* JADX INFO: renamed from: n */
        private List f16441n;

        /* JADX INFO: renamed from: o */
        private v f16442o;

        /* JADX INFO: renamed from: p */
        private int f16443p;

        /* JADX INFO: renamed from: q */
        private int f16444q;

        /* JADX INFO: renamed from: r */
        private List f16445r;

        /* JADX INFO: renamed from: s */
        private List f16446s;

        /* JADX INFO: renamed from: e */
        private int f16432e = 518;

        /* JADX INFO: renamed from: f */
        private int f16433f = 2054;

        /* JADX INFO: renamed from: h */
        private r f16435h = r.Y();

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f16437j = list;
            this.f16438k = r.Y();
            this.f16440m = list;
            this.f16441n = list;
            this.f16442o = v.J();
            this.f16445r = list;
            this.f16446s = list;
            D();
        }

        private void A() {
            if ((this.f16431d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                this.f16440m = new ArrayList(this.f16440m);
                this.f16431d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
        }

        private void B() {
            if ((this.f16431d & 32) != 32) {
                this.f16437j = new ArrayList(this.f16437j);
                this.f16431d |= 32;
            }
        }

        private void C() {
            if ((this.f16431d & 8192) != 8192) {
                this.f16445r = new ArrayList(this.f16445r);
                this.f16431d |= 8192;
            }
        }

        public static b v() {
            return new b();
        }

        private void x() {
            if ((this.f16431d & 16384) != 16384) {
                this.f16446s = new ArrayList(this.f16446s);
                this.f16431d |= 16384;
            }
        }

        private void y() {
            if ((this.f16431d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                this.f16441n = new ArrayList(this.f16441n);
                this.f16431d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: E */
        public b j(o oVar) {
            if (oVar == o.d0()) {
                return this;
            }
            if (oVar.t0()) {
                J(oVar.f0());
            }
            if (oVar.w0()) {
                M(oVar.i0());
            }
            if (oVar.v0()) {
                L(oVar.h0());
            }
            if (oVar.z0()) {
                H(oVar.l0());
            }
            if (oVar.A0()) {
                O(oVar.m0());
            }
            if (!oVar.f16418j.isEmpty()) {
                if (this.f16437j.isEmpty()) {
                    this.f16437j = oVar.f16418j;
                    this.f16431d &= -33;
                } else {
                    B();
                    this.f16437j.addAll(oVar.f16418j);
                }
            }
            if (oVar.x0()) {
                G(oVar.j0());
            }
            if (oVar.y0()) {
                N(oVar.k0());
            }
            if (!oVar.f16421m.isEmpty()) {
                if (this.f16440m.isEmpty()) {
                    this.f16440m = oVar.f16421m;
                    this.f16431d &= -257;
                } else {
                    A();
                    this.f16440m.addAll(oVar.f16421m);
                }
            }
            if (!oVar.f16422n.isEmpty()) {
                if (this.f16441n.isEmpty()) {
                    this.f16441n = oVar.f16422n;
                    this.f16431d &= -513;
                } else {
                    y();
                    this.f16441n.addAll(oVar.f16422n);
                }
            }
            if (oVar.C0()) {
                I(oVar.o0());
            }
            if (oVar.u0()) {
                K(oVar.g0());
            }
            if (oVar.B0()) {
                P(oVar.n0());
            }
            if (!oVar.f16427s.isEmpty()) {
                if (this.f16445r.isEmpty()) {
                    this.f16445r = oVar.f16427s;
                    this.f16431d &= -8193;
                } else {
                    C();
                    this.f16445r.addAll(oVar.f16427s);
                }
            }
            if (!oVar.f16428t.isEmpty()) {
                if (this.f16446s.isEmpty()) {
                    this.f16446s = oVar.f16428t;
                    this.f16431d &= -16385;
                } else {
                    x();
                    this.f16446s.addAll(oVar.f16428t);
                }
            }
            q(oVar);
            k(i().c(oVar.f16411c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.o.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.o.f16410x     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.o r3 = (Se.o) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.o r4 = (Se.o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.o.b.y1(Ze.e, Ze.g):Se.o$b");
        }

        public b G(r rVar) {
            if ((this.f16431d & 64) != 64 || this.f16438k == r.Y()) {
                this.f16438k = rVar;
            } else {
                this.f16438k = r.z0(this.f16438k).j(rVar).t();
            }
            this.f16431d |= 64;
            return this;
        }

        public b H(r rVar) {
            if ((this.f16431d & 8) != 8 || this.f16435h == r.Y()) {
                this.f16435h = rVar;
            } else {
                this.f16435h = r.z0(this.f16435h).j(rVar).t();
            }
            this.f16431d |= 8;
            return this;
        }

        public b I(v vVar) {
            if ((this.f16431d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024 || this.f16442o == v.J()) {
                this.f16442o = vVar;
            } else {
                this.f16442o = v.Z(this.f16442o).j(vVar).t();
            }
            this.f16431d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            return this;
        }

        public b J(int i10) {
            this.f16431d |= 1;
            this.f16432e = i10;
            return this;
        }

        public b K(int i10) {
            this.f16431d |= 2048;
            this.f16443p = i10;
            return this;
        }

        public b L(int i10) {
            this.f16431d |= 4;
            this.f16434g = i10;
            return this;
        }

        public b M(int i10) {
            this.f16431d |= 2;
            this.f16433f = i10;
            return this;
        }

        public b N(int i10) {
            this.f16431d |= 128;
            this.f16439l = i10;
            return this;
        }

        public b O(int i10) {
            this.f16431d |= 16;
            this.f16436i = i10;
            return this;
        }

        public b P(int i10) {
            this.f16431d |= 4096;
            this.f16444q = i10;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public o build() {
            o oVarT = t();
            if (oVarT.e()) {
                return oVarT;
            }
            throw a.AbstractC0406a.h(oVarT);
        }

        public o t() {
            o oVar = new o(this);
            int i10 = this.f16431d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            oVar.f16413e = this.f16432e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            oVar.f16414f = this.f16433f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            oVar.f16415g = this.f16434g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            oVar.f16416h = this.f16435h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            oVar.f16417i = this.f16436i;
            if ((this.f16431d & 32) == 32) {
                this.f16437j = Collections.unmodifiableList(this.f16437j);
                this.f16431d &= -33;
            }
            oVar.f16418j = this.f16437j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            oVar.f16419k = this.f16438k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            oVar.f16420l = this.f16439l;
            if ((this.f16431d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                this.f16440m = Collections.unmodifiableList(this.f16440m);
                this.f16431d &= -257;
            }
            oVar.f16421m = this.f16440m;
            if ((this.f16431d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.f16441n = Collections.unmodifiableList(this.f16441n);
                this.f16431d &= -513;
            }
            oVar.f16422n = this.f16441n;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                i11 |= 128;
            }
            oVar.f16424p = this.f16442o;
            if ((i10 & 2048) == 2048) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            oVar.f16425q = this.f16443p;
            if ((i10 & 4096) == 4096) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            oVar.f16426r = this.f16444q;
            if ((this.f16431d & 8192) == 8192) {
                this.f16445r = Collections.unmodifiableList(this.f16445r);
                this.f16431d &= -8193;
            }
            oVar.f16427s = this.f16445r;
            if ((this.f16431d & 16384) == 16384) {
                this.f16446s = Collections.unmodifiableList(this.f16446s);
                this.f16431d &= -16385;
            }
            oVar.f16428t = this.f16446s;
            oVar.f16412d = i11;
            return oVar;
        }

        /* JADX INFO: renamed from: u */
        public b clone() {
            return v().j(t());
        }

        private void D() {
        }
    }
}
