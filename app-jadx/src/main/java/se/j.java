package Se;

import Se.f;
import Se.r;
import Se.u;
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
public final class j extends i.d implements Ze.q {

    /* JADX INFO: renamed from: w */
    private static final j f16325w;

    /* JADX INFO: renamed from: x */
    public static Ze.r f16326x = new a();

    /* JADX INFO: renamed from: c */
    private final Ze.d f16327c;

    /* JADX INFO: renamed from: d */
    private int f16328d;

    /* JADX INFO: renamed from: e */
    private int f16329e;

    /* JADX INFO: renamed from: f */
    private int f16330f;

    /* JADX INFO: renamed from: g */
    private int f16331g;

    /* JADX INFO: renamed from: h */
    private r f16332h;

    /* JADX INFO: renamed from: i */
    private int f16333i;

    /* JADX INFO: renamed from: j */
    private List f16334j;

    /* JADX INFO: renamed from: k */
    private r f16335k;

    /* JADX INFO: renamed from: l */
    private int f16336l;

    /* JADX INFO: renamed from: m */
    private List f16337m;

    /* JADX INFO: renamed from: n */
    private List f16338n;

    /* JADX INFO: renamed from: o */
    private int f16339o;

    /* JADX INFO: renamed from: p */
    private List f16340p;

    /* JADX INFO: renamed from: q */
    private u f16341q;

    /* JADX INFO: renamed from: r */
    private List f16342r;

    /* JADX INFO: renamed from: s */
    private f f16343s;

    /* JADX INFO: renamed from: t */
    private List f16344t;

    /* JADX INFO: renamed from: u */
    private byte f16345u;

    /* JADX INFO: renamed from: v */
    private int f16346v;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j */
        public j b(Ze.e eVar, Ze.g gVar) {
            return new j(eVar, gVar);
        }
    }

    static {
        j jVar = new j(true);
        f16325w = jVar;
        jVar.F0();
    }

    /* synthetic */ j(Ze.e eVar, Ze.g gVar, Se.a aVar) {
        this(eVar, gVar);
    }

    private void F0() {
        this.f16329e = 6;
        this.f16330f = 6;
        this.f16331g = 0;
        this.f16332h = r.Y();
        this.f16333i = 0;
        List list = Collections.EMPTY_LIST;
        this.f16334j = list;
        this.f16335k = r.Y();
        this.f16336l = 0;
        this.f16337m = list;
        this.f16338n = list;
        this.f16340p = list;
        this.f16341q = u.x();
        this.f16342r = list;
        this.f16343s = f.v();
        this.f16344t = list;
    }

    public static b G0() {
        return b.v();
    }

    public static b H0(j jVar) {
        return G0().j(jVar);
    }

    public static j J0(InputStream inputStream, Ze.g gVar) {
        return (j) f16326x.c(inputStream, gVar);
    }

    public static j f0() {
        return f16325w;
    }

    public boolean A0() {
        return (this.f16328d & 32) == 32;
    }

    public boolean B0() {
        return (this.f16328d & 64) == 64;
    }

    public boolean C0() {
        return (this.f16328d & 8) == 8;
    }

    public boolean D0() {
        return (this.f16328d & 16) == 16;
    }

    public boolean E0() {
        return (this.f16328d & 128) == 128;
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: I0 */
    public b a() {
        return G0();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: K0 */
    public b f() {
        return H0(this);
    }

    public d Y(int i10) {
        return (d) this.f16344t.get(i10);
    }

    public int Z() {
        return this.f16344t.size();
    }

    public r a0(int i10) {
        return (r) this.f16337m.get(i10);
    }

    public int b0() {
        return this.f16337m.size();
    }

    public List c0() {
        return this.f16338n;
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16346v;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f16328d & 2) == 2 ? Ze.f.o(1, this.f16330f) : 0;
        if ((this.f16328d & 4) == 4) {
            iO += Ze.f.o(2, this.f16331g);
        }
        if ((this.f16328d & 8) == 8) {
            iO += Ze.f.r(3, this.f16332h);
        }
        for (int i11 = 0; i11 < this.f16334j.size(); i11++) {
            iO += Ze.f.r(4, (Ze.p) this.f16334j.get(i11));
        }
        if ((this.f16328d & 32) == 32) {
            iO += Ze.f.r(5, this.f16335k);
        }
        for (int i12 = 0; i12 < this.f16340p.size(); i12++) {
            iO += Ze.f.r(6, (Ze.p) this.f16340p.get(i12));
        }
        if ((this.f16328d & 16) == 16) {
            iO += Ze.f.o(7, this.f16333i);
        }
        if ((this.f16328d & 64) == 64) {
            iO += Ze.f.o(8, this.f16336l);
        }
        if ((this.f16328d & 1) == 1) {
            iO += Ze.f.o(9, this.f16329e);
        }
        for (int i13 = 0; i13 < this.f16337m.size(); i13++) {
            iO += Ze.f.r(10, (Ze.p) this.f16337m.get(i13));
        }
        int iP = 0;
        for (int i14 = 0; i14 < this.f16338n.size(); i14++) {
            iP += Ze.f.p(((Integer) this.f16338n.get(i14)).intValue());
        }
        int iR = iO + iP;
        if (!c0().isEmpty()) {
            iR = iR + 1 + Ze.f.p(iP);
        }
        this.f16339o = iP;
        if ((this.f16328d & 128) == 128) {
            iR += Ze.f.r(30, this.f16341q);
        }
        int iP2 = 0;
        for (int i15 = 0; i15 < this.f16342r.size(); i15++) {
            iP2 += Ze.f.p(((Integer) this.f16342r.get(i15)).intValue());
        }
        int size = iR + iP2 + (v0().size() * 2);
        if ((this.f16328d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            size += Ze.f.r(32, this.f16343s);
        }
        for (int i16 = 0; i16 < this.f16344t.size(); i16++) {
            size += Ze.f.r(33, (Ze.p) this.f16344t.get(i16));
        }
        int iU = size + u() + this.f16327c.size();
        this.f16346v = iU;
        return iU;
    }

    public List d0() {
        return this.f16337m;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16345u;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!y0()) {
            this.f16345u = (byte) 0;
            return false;
        }
        if (C0() && !m0().e()) {
            this.f16345u = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < p0(); i10++) {
            if (!o0(i10).e()) {
                this.f16345u = (byte) 0;
                return false;
            }
        }
        if (A0() && !k0().e()) {
            this.f16345u = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < b0(); i11++) {
            if (!a0(i11).e()) {
                this.f16345u = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < t0(); i12++) {
            if (!s0(i12).e()) {
                this.f16345u = (byte) 0;
                return false;
            }
        }
        if (E0() && !r0().e()) {
            this.f16345u = (byte) 0;
            return false;
        }
        if (w0() && !e0().e()) {
            this.f16345u = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < Z(); i13++) {
            if (!Y(i13).e()) {
                this.f16345u = (byte) 0;
                return false;
            }
        }
        if (t()) {
            this.f16345u = (byte) 1;
            return true;
        }
        this.f16345u = (byte) 0;
        return false;
    }

    public f e0() {
        return this.f16343s;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        i.d.a aVarZ = z();
        if ((this.f16328d & 2) == 2) {
            fVar.Z(1, this.f16330f);
        }
        if ((this.f16328d & 4) == 4) {
            fVar.Z(2, this.f16331g);
        }
        if ((this.f16328d & 8) == 8) {
            fVar.c0(3, this.f16332h);
        }
        for (int i10 = 0; i10 < this.f16334j.size(); i10++) {
            fVar.c0(4, (Ze.p) this.f16334j.get(i10));
        }
        if ((this.f16328d & 32) == 32) {
            fVar.c0(5, this.f16335k);
        }
        for (int i11 = 0; i11 < this.f16340p.size(); i11++) {
            fVar.c0(6, (Ze.p) this.f16340p.get(i11));
        }
        if ((this.f16328d & 16) == 16) {
            fVar.Z(7, this.f16333i);
        }
        if ((this.f16328d & 64) == 64) {
            fVar.Z(8, this.f16336l);
        }
        if ((this.f16328d & 1) == 1) {
            fVar.Z(9, this.f16329e);
        }
        for (int i12 = 0; i12 < this.f16337m.size(); i12++) {
            fVar.c0(10, (Ze.p) this.f16337m.get(i12));
        }
        if (c0().size() > 0) {
            fVar.n0(90);
            fVar.n0(this.f16339o);
        }
        for (int i13 = 0; i13 < this.f16338n.size(); i13++) {
            fVar.a0(((Integer) this.f16338n.get(i13)).intValue());
        }
        if ((this.f16328d & 128) == 128) {
            fVar.c0(30, this.f16341q);
        }
        for (int i14 = 0; i14 < this.f16342r.size(); i14++) {
            fVar.Z(31, ((Integer) this.f16342r.get(i14)).intValue());
        }
        if ((this.f16328d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            fVar.c0(32, this.f16343s);
        }
        for (int i15 = 0; i15 < this.f16344t.size(); i15++) {
            fVar.c0(33, (Ze.p) this.f16344t.get(i15));
        }
        aVarZ.a(19000, fVar);
        fVar.h0(this.f16327c);
    }

    @Override // Ze.q
    /* JADX INFO: renamed from: g0 */
    public j c() {
        return f16325w;
    }

    public int h0() {
        return this.f16329e;
    }

    public int i0() {
        return this.f16331g;
    }

    public int j0() {
        return this.f16330f;
    }

    public r k0() {
        return this.f16335k;
    }

    public int l0() {
        return this.f16336l;
    }

    public r m0() {
        return this.f16332h;
    }

    public int n0() {
        return this.f16333i;
    }

    public t o0(int i10) {
        return (t) this.f16334j.get(i10);
    }

    public int p0() {
        return this.f16334j.size();
    }

    public List q0() {
        return this.f16334j;
    }

    public u r0() {
        return this.f16341q;
    }

    public v s0(int i10) {
        return (v) this.f16340p.get(i10);
    }

    public int t0() {
        return this.f16340p.size();
    }

    public List u0() {
        return this.f16340p;
    }

    public List v0() {
        return this.f16342r;
    }

    public boolean w0() {
        return (this.f16328d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256;
    }

    public boolean x0() {
        return (this.f16328d & 1) == 1;
    }

    public boolean y0() {
        return (this.f16328d & 4) == 4;
    }

    public boolean z0() {
        return (this.f16328d & 2) == 2;
    }

    /* synthetic */ j(i.c cVar, Se.a aVar) {
        this(cVar);
    }

    private j(i.c cVar) {
        super(cVar);
        this.f16339o = -1;
        this.f16345u = (byte) -1;
        this.f16346v = -1;
        this.f16327c = cVar.i();
    }

    private j(boolean z10) {
        this.f16339o = -1;
        this.f16345u = (byte) -1;
        this.f16346v = -1;
        this.f16327c = Ze.d.f23287a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    private j(Ze.e eVar, Ze.g gVar) {
        boolean z10;
        this.f16339o = -1;
        this.f16345u = (byte) -1;
        this.f16346v = -1;
        F0();
        d.b bVarT = Ze.d.t();
        boolean z11 = true;
        Ze.f fVarI = Ze.f.I(bVarT, 1);
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            ?? P10 = 1024;
            if (!z12) {
                try {
                    try {
                        int iJ = eVar.J();
                        switch (iJ) {
                            case 0:
                                z10 = z11;
                                z12 = z10;
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 8:
                                z10 = z11;
                                this.f16328d |= 2;
                                this.f16330f = eVar.r();
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 16:
                                z10 = z11;
                                this.f16328d |= 4;
                                this.f16331g = eVar.r();
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 26:
                                z10 = z11;
                                r.c cVarF = (this.f16328d & 8) == 8 ? this.f16332h.f() : null;
                                r rVar = (r) eVar.t(r.f16483v, gVar);
                                this.f16332h = rVar;
                                if (cVarF != null) {
                                    cVarF.j(rVar);
                                    this.f16332h = cVarF.t();
                                }
                                this.f16328d |= 8;
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 34:
                                z10 = z11;
                                int i11 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i11 != 32) {
                                    this.f16334j = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f16334j.add(eVar.t(t.f16565o, gVar));
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 42:
                                z10 = z11;
                                r.c cVarF2 = (this.f16328d & 32) == 32 ? this.f16335k.f() : null;
                                r rVar2 = (r) eVar.t(r.f16483v, gVar);
                                this.f16335k = rVar2;
                                if (cVarF2 != null) {
                                    cVarF2.j(rVar2);
                                    this.f16335k = cVarF2.t();
                                }
                                this.f16328d |= 32;
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 50:
                                z10 = z11;
                                int i12 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                i10 = i10;
                                if (i12 != 1024) {
                                    this.f16340p = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                }
                                this.f16340p.add(eVar.t(v.f16602n, gVar));
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 56:
                                z10 = z11;
                                this.f16328d |= 16;
                                this.f16333i = eVar.r();
                                z11 = z10;
                                i10 = i10;
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                z10 = z11;
                                this.f16328d |= 64;
                                this.f16336l = eVar.r();
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 72:
                                z10 = z11;
                                this.f16328d |= 1;
                                this.f16329e = eVar.r();
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 82:
                                z10 = z11;
                                int i13 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                i10 = i10;
                                if (i13 != 256) {
                                    this.f16337m = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                }
                                this.f16337m.add(eVar.t(r.f16483v, gVar));
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 88:
                                z10 = z11;
                                int i14 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                i10 = i10;
                                if (i14 != 512) {
                                    this.f16338n = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                }
                                this.f16338n.add(Integer.valueOf(eVar.r()));
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 90:
                                z10 = z11;
                                int i15 = eVar.i(eVar.z());
                                int i16 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                i10 = i10;
                                if (i16 != 512) {
                                    i10 = i10;
                                    if (eVar.e() > 0) {
                                        this.f16338n = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f16338n.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i15);
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 242:
                                z10 = z11;
                                u.b bVarF = (this.f16328d & 128) == 128 ? this.f16341q.f() : null;
                                u uVar = (u) eVar.t(u.f16591i, gVar);
                                this.f16341q = uVar;
                                if (bVarF != null) {
                                    bVarF.j(uVar);
                                    this.f16341q = bVarF.p();
                                }
                                this.f16328d |= 128;
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 248:
                                z10 = z11;
                                int i17 = (i10 == true ? 1 : 0) & 4096;
                                i10 = i10;
                                if (i17 != 4096) {
                                    this.f16342r = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4096;
                                }
                                this.f16342r.add(Integer.valueOf(eVar.r()));
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 250:
                                int i18 = eVar.i(eVar.z());
                                int i19 = (i10 == true ? 1 : 0) & 4096;
                                i10 = i10;
                                if (i19 != 4096) {
                                    i10 = i10;
                                    if (eVar.e() > 0) {
                                        this.f16342r = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (eVar.e() > 0) {
                                    this.f16342r.add(Integer.valueOf(eVar.r()));
                                    z11 = z11;
                                }
                                z10 = z11;
                                eVar.h(i18);
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 258:
                                f.b bVarF2 = (this.f16328d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256 ? this.f16343s.f() : null;
                                f fVar = (f) eVar.t(f.f16255g, gVar);
                                this.f16343s = fVar;
                                if (bVarF2 != null) {
                                    bVarF2.j(fVar);
                                    this.f16343s = bVarF2.p();
                                }
                                this.f16328d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                i10 = i10;
                                z10 = z11;
                                z11 = z10;
                                i10 = i10;
                                break;
                            case 266:
                                int i20 = (i10 == true ? 1 : 0) & 16384;
                                int i21 = i10;
                                if (i20 != 16384) {
                                    this.f16344t = new ArrayList();
                                    i21 = (i10 == true ? 1 : 0) | 16384;
                                }
                                this.f16344t.add(eVar.t(d.f16229i, gVar));
                                i10 = i21;
                                z10 = z11;
                                z11 = z10;
                                i10 = i10;
                                break;
                            default:
                                P10 = p(eVar, fVarI, gVar, iJ);
                                i10 = i10;
                                if (P10 == 0) {
                                    z12 = z11;
                                    z10 = z12;
                                } else {
                                    z10 = z11;
                                }
                                z11 = z10;
                                i10 = i10;
                                break;
                        }
                    } catch (Ze.k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new Ze.k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f16334j = Collections.unmodifiableList(this.f16334j);
                    }
                    if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == P10) {
                        this.f16340p = Collections.unmodifiableList(this.f16340p);
                    }
                    if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                        this.f16337m = Collections.unmodifiableList(this.f16337m);
                    }
                    if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                        this.f16338n = Collections.unmodifiableList(this.f16338n);
                    }
                    if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                        this.f16342r = Collections.unmodifiableList(this.f16342r);
                    }
                    if (((i10 == true ? 1 : 0) & 16384) == 16384) {
                        this.f16344t = Collections.unmodifiableList(this.f16344t);
                    }
                    try {
                        fVarI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f16327c = bVarT.h();
                        throw th3;
                    }
                    this.f16327c = bVarT.h();
                    l();
                    throw th2;
                }
            } else {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f16334j = Collections.unmodifiableList(this.f16334j);
                }
                if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                    this.f16340p = Collections.unmodifiableList(this.f16340p);
                }
                if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.f16337m = Collections.unmodifiableList(this.f16337m);
                }
                if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.f16338n = Collections.unmodifiableList(this.f16338n);
                }
                if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f16342r = Collections.unmodifiableList(this.f16342r);
                }
                if (((i10 == true ? 1 : 0) & 16384) == 16384) {
                    this.f16344t = Collections.unmodifiableList(this.f16344t);
                }
                try {
                    fVarI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f16327c = bVarT.h();
                    throw th4;
                }
                this.f16327c = bVarT.h();
                l();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.c implements Ze.q {

        /* JADX INFO: renamed from: d */
        private int f16347d;

        /* JADX INFO: renamed from: g */
        private int f16350g;

        /* JADX INFO: renamed from: i */
        private int f16352i;

        /* JADX INFO: renamed from: j */
        private List f16353j;

        /* JADX INFO: renamed from: k */
        private r f16354k;

        /* JADX INFO: renamed from: l */
        private int f16355l;

        /* JADX INFO: renamed from: m */
        private List f16356m;

        /* JADX INFO: renamed from: n */
        private List f16357n;

        /* JADX INFO: renamed from: o */
        private List f16358o;

        /* JADX INFO: renamed from: p */
        private u f16359p;

        /* JADX INFO: renamed from: q */
        private List f16360q;

        /* JADX INFO: renamed from: r */
        private f f16361r;

        /* JADX INFO: renamed from: s */
        private List f16362s;

        /* JADX INFO: renamed from: e */
        private int f16348e = 6;

        /* JADX INFO: renamed from: f */
        private int f16349f = 6;

        /* JADX INFO: renamed from: h */
        private r f16351h = r.Y();

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f16353j = list;
            this.f16354k = r.Y();
            this.f16356m = list;
            this.f16357n = list;
            this.f16358o = list;
            this.f16359p = u.x();
            this.f16360q = list;
            this.f16361r = f.v();
            this.f16362s = list;
            E();
        }

        private void A() {
            if ((this.f16347d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                this.f16356m = new ArrayList(this.f16356m);
                this.f16347d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
        }

        private void B() {
            if ((this.f16347d & 32) != 32) {
                this.f16353j = new ArrayList(this.f16353j);
                this.f16347d |= 32;
            }
        }

        private void C() {
            if ((this.f16347d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024) {
                this.f16358o = new ArrayList(this.f16358o);
                this.f16347d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
        }

        private void D() {
            if ((this.f16347d & 4096) != 4096) {
                this.f16360q = new ArrayList(this.f16360q);
                this.f16347d |= 4096;
            }
        }

        public static b v() {
            return new b();
        }

        private void x() {
            if ((this.f16347d & 16384) != 16384) {
                this.f16362s = new ArrayList(this.f16362s);
                this.f16347d |= 16384;
            }
        }

        private void y() {
            if ((this.f16347d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                this.f16357n = new ArrayList(this.f16357n);
                this.f16347d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
        }

        public b F(f fVar) {
            if ((this.f16347d & 8192) != 8192 || this.f16361r == f.v()) {
                this.f16361r = fVar;
            } else {
                this.f16361r = f.A(this.f16361r).j(fVar).p();
            }
            this.f16347d |= 8192;
            return this;
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: G */
        public b j(j jVar) {
            if (jVar == j.f0()) {
                return this;
            }
            if (jVar.x0()) {
                L(jVar.h0());
            }
            if (jVar.z0()) {
                N(jVar.j0());
            }
            if (jVar.y0()) {
                M(jVar.i0());
            }
            if (jVar.C0()) {
                J(jVar.m0());
            }
            if (jVar.D0()) {
                P(jVar.n0());
            }
            if (!jVar.f16334j.isEmpty()) {
                if (this.f16353j.isEmpty()) {
                    this.f16353j = jVar.f16334j;
                    this.f16347d &= -33;
                } else {
                    B();
                    this.f16353j.addAll(jVar.f16334j);
                }
            }
            if (jVar.A0()) {
                I(jVar.k0());
            }
            if (jVar.B0()) {
                O(jVar.l0());
            }
            if (!jVar.f16337m.isEmpty()) {
                if (this.f16356m.isEmpty()) {
                    this.f16356m = jVar.f16337m;
                    this.f16347d &= -257;
                } else {
                    A();
                    this.f16356m.addAll(jVar.f16337m);
                }
            }
            if (!jVar.f16338n.isEmpty()) {
                if (this.f16357n.isEmpty()) {
                    this.f16357n = jVar.f16338n;
                    this.f16347d &= -513;
                } else {
                    y();
                    this.f16357n.addAll(jVar.f16338n);
                }
            }
            if (!jVar.f16340p.isEmpty()) {
                if (this.f16358o.isEmpty()) {
                    this.f16358o = jVar.f16340p;
                    this.f16347d &= -1025;
                } else {
                    C();
                    this.f16358o.addAll(jVar.f16340p);
                }
            }
            if (jVar.E0()) {
                K(jVar.r0());
            }
            if (!jVar.f16342r.isEmpty()) {
                if (this.f16360q.isEmpty()) {
                    this.f16360q = jVar.f16342r;
                    this.f16347d &= -4097;
                } else {
                    D();
                    this.f16360q.addAll(jVar.f16342r);
                }
            }
            if (jVar.w0()) {
                F(jVar.e0());
            }
            if (!jVar.f16344t.isEmpty()) {
                if (this.f16362s.isEmpty()) {
                    this.f16362s = jVar.f16344t;
                    this.f16347d &= -16385;
                } else {
                    x();
                    this.f16362s.addAll(jVar.f16344t);
                }
            }
            q(jVar);
            k(i().c(jVar.f16327c));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: H */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.j.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.j.f16326x     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.j r3 = (Se.j) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.j r4 = (Se.j) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.j.b.y1(Ze.e, Ze.g):Se.j$b");
        }

        public b I(r rVar) {
            if ((this.f16347d & 64) != 64 || this.f16354k == r.Y()) {
                this.f16354k = rVar;
            } else {
                this.f16354k = r.z0(this.f16354k).j(rVar).t();
            }
            this.f16347d |= 64;
            return this;
        }

        public b J(r rVar) {
            if ((this.f16347d & 8) != 8 || this.f16351h == r.Y()) {
                this.f16351h = rVar;
            } else {
                this.f16351h = r.z0(this.f16351h).j(rVar).t();
            }
            this.f16347d |= 8;
            return this;
        }

        public b K(u uVar) {
            if ((this.f16347d & 2048) != 2048 || this.f16359p == u.x()) {
                this.f16359p = uVar;
            } else {
                this.f16359p = u.F(this.f16359p).j(uVar).p();
            }
            this.f16347d |= 2048;
            return this;
        }

        public b L(int i10) {
            this.f16347d |= 1;
            this.f16348e = i10;
            return this;
        }

        public b M(int i10) {
            this.f16347d |= 4;
            this.f16350g = i10;
            return this;
        }

        public b N(int i10) {
            this.f16347d |= 2;
            this.f16349f = i10;
            return this;
        }

        public b O(int i10) {
            this.f16347d |= 128;
            this.f16355l = i10;
            return this;
        }

        public b P(int i10) {
            this.f16347d |= 16;
            this.f16352i = i10;
            return this;
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: s */
        public j build() {
            j jVarT = t();
            if (jVarT.e()) {
                return jVarT;
            }
            throw a.AbstractC0406a.h(jVarT);
        }

        public j t() {
            j jVar = new j(this);
            int i10 = this.f16347d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            jVar.f16329e = this.f16348e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            jVar.f16330f = this.f16349f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            jVar.f16331g = this.f16350g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            jVar.f16332h = this.f16351h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            jVar.f16333i = this.f16352i;
            if ((this.f16347d & 32) == 32) {
                this.f16353j = Collections.unmodifiableList(this.f16353j);
                this.f16347d &= -33;
            }
            jVar.f16334j = this.f16353j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            jVar.f16335k = this.f16354k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            jVar.f16336l = this.f16355l;
            if ((this.f16347d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                this.f16356m = Collections.unmodifiableList(this.f16356m);
                this.f16347d &= -257;
            }
            jVar.f16337m = this.f16356m;
            if ((this.f16347d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.f16357n = Collections.unmodifiableList(this.f16357n);
                this.f16347d &= -513;
            }
            jVar.f16338n = this.f16357n;
            if ((this.f16347d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                this.f16358o = Collections.unmodifiableList(this.f16358o);
                this.f16347d &= -1025;
            }
            jVar.f16340p = this.f16358o;
            if ((i10 & 2048) == 2048) {
                i11 |= 128;
            }
            jVar.f16341q = this.f16359p;
            if ((this.f16347d & 4096) == 4096) {
                this.f16360q = Collections.unmodifiableList(this.f16360q);
                this.f16347d &= -4097;
            }
            jVar.f16342r = this.f16360q;
            if ((i10 & 8192) == 8192) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            jVar.f16343s = this.f16361r;
            if ((this.f16347d & 16384) == 16384) {
                this.f16362s = Collections.unmodifiableList(this.f16362s);
                this.f16347d &= -16385;
            }
            jVar.f16344t = this.f16362s;
            jVar.f16328d = i11;
            return jVar;
        }

        /* JADX INFO: renamed from: u */
        public b clone() {
            return v().j(t());
        }

        private void E() {
        }
    }
}
