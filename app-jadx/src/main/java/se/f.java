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
public final class f extends Ze.i implements Ze.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f16254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Ze.r f16255g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ze.d f16256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f16257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f16258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16259e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public f b(Ze.e eVar, Ze.g gVar) {
            return new f(eVar, gVar);
        }
    }

    static {
        f fVar = new f(true);
        f16254f = fVar;
        fVar.y();
    }

    public static b A(f fVar) {
        return z().j(fVar);
    }

    public static f v() {
        return f16254f;
    }

    private void y() {
        this.f16257c = Collections.EMPTY_LIST;
    }

    public static b z() {
        return b.r();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public b a() {
        return z();
    }

    @Override // Ze.p
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public b f() {
        return A(this);
    }

    @Override // Ze.p
    public int d() {
        int i10 = this.f16259e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f16257c.size(); i11++) {
            iR += Ze.f.r(1, (Ze.p) this.f16257c.get(i11));
        }
        int size = iR + this.f16256b.size();
        this.f16259e = size;
        return size;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16258d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < x(); i10++) {
            if (!w(i10).e()) {
                this.f16258d = (byte) 0;
                return false;
            }
        }
        this.f16258d = (byte) 1;
        return true;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f16257c.size(); i10++) {
            fVar.c0(1, (Ze.p) this.f16257c.get(i10));
        }
        fVar.h0(this.f16256b);
    }

    public g w(int i10) {
        return (g) this.f16257c.get(i10);
    }

    public int x() {
        return this.f16257c.size();
    }

    private f(i.b bVar) {
        super(bVar);
        this.f16258d = (byte) -1;
        this.f16259e = -1;
        this.f16256b = bVar.i();
    }

    private f(boolean z10) {
        this.f16258d = (byte) -1;
        this.f16259e = -1;
        this.f16256b = Ze.d.f23287a;
    }

    private f(Ze.e eVar, Ze.g gVar) {
        this.f16258d = (byte) -1;
        this.f16259e = -1;
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
                            if (!z11) {
                                this.f16257c = new ArrayList();
                                z11 = true;
                            }
                            this.f16257c.add(eVar.t(g.f16263k, gVar));
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
                    this.f16257c = Collections.unmodifiableList(this.f16257c);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16256b = bVarT.h();
                    throw th3;
                }
                this.f16256b = bVarT.h();
                l();
                throw th2;
            }
        }
        if (z11) {
            this.f16257c = Collections.unmodifiableList(this.f16257c);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16256b = bVarT.h();
            throw th4;
        }
        this.f16256b = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.b implements Ze.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f16261c = Collections.EMPTY_LIST;

        private b() {
            t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f16260b & 1) != 1) {
                this.f16261c = new ArrayList(this.f16261c);
                this.f16260b |= 1;
            }
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public f build() {
            f fVarP = p();
            if (fVarP.e()) {
                return fVarP;
            }
            throw a.AbstractC0406a.h(fVarP);
        }

        public f p() {
            f fVar = new f(this);
            if ((this.f16260b & 1) == 1) {
                this.f16261c = Collections.unmodifiableList(this.f16261c);
                this.f16260b &= -2;
            }
            fVar.f16257c = this.f16261c;
            return fVar;
        }

        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().j(p());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b j(f fVar) {
            if (fVar == f.v()) {
                return this;
            }
            if (!fVar.f16257c.isEmpty()) {
                if (this.f16261c.isEmpty()) {
                    this.f16261c = fVar.f16257c;
                    this.f16260b &= -2;
                } else {
                    s();
                    this.f16261c.addAll(fVar.f16257c);
                }
            }
            k(i().c(fVar.f16256b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.f.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.f.f16255g     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.f r3 = (Se.f) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.f r4 = (Se.f) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.f.b.y1(Ze.e, Ze.g):Se.f$b");
        }

        private void t() {
        }
    }
}
