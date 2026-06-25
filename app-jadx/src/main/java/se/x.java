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
public final class x extends Ze.i implements Ze.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x f16651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Ze.r f16652g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ze.d f16653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f16654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f16655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16656e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends Ze.b {
        a() {
        }

        @Override // Ze.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public x b(Ze.e eVar, Ze.g gVar) {
            return new x(eVar, gVar);
        }
    }

    static {
        x xVar = new x(true);
        f16651f = xVar;
        xVar.y();
    }

    public static b A(x xVar) {
        return z().j(xVar);
    }

    public static x v() {
        return f16651f;
    }

    private void y() {
        this.f16654c = Collections.EMPTY_LIST;
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
        int i10 = this.f16656e;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f16654c.size(); i11++) {
            iR += Ze.f.r(1, (Ze.p) this.f16654c.get(i11));
        }
        int size = iR + this.f16653b.size();
        this.f16656e = size;
        return size;
    }

    @Override // Ze.q
    public final boolean e() {
        byte b10 = this.f16655d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f16655d = (byte) 1;
        return true;
    }

    @Override // Ze.p
    public void g(Ze.f fVar) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f16654c.size(); i10++) {
            fVar.c0(1, (Ze.p) this.f16654c.get(i10));
        }
        fVar.h0(this.f16653b);
    }

    public int w() {
        return this.f16654c.size();
    }

    public List x() {
        return this.f16654c;
    }

    private x(i.b bVar) {
        super(bVar);
        this.f16655d = (byte) -1;
        this.f16656e = -1;
        this.f16653b = bVar.i();
    }

    private x(boolean z10) {
        this.f16655d = (byte) -1;
        this.f16656e = -1;
        this.f16653b = Ze.d.f23287a;
    }

    private x(Ze.e eVar, Ze.g gVar) {
        this.f16655d = (byte) -1;
        this.f16656e = -1;
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
                                this.f16654c = new ArrayList();
                                z11 = true;
                            }
                            this.f16654c.add(eVar.t(w.f16621m, gVar));
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
                    this.f16654c = Collections.unmodifiableList(this.f16654c);
                }
                try {
                    fVarI.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f16653b = bVarT.h();
                    throw th3;
                }
                this.f16653b = bVarT.h();
                l();
                throw th2;
            }
        }
        if (z11) {
            this.f16654c = Collections.unmodifiableList(this.f16654c);
        }
        try {
            fVarI.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f16653b = bVarT.h();
            throw th4;
        }
        this.f16653b = bVarT.h();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends i.b implements Ze.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f16658c = Collections.EMPTY_LIST;

        private b() {
            t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f16657b & 1) != 1) {
                this.f16658c = new ArrayList(this.f16658c);
                this.f16657b |= 1;
            }
        }

        @Override // Ze.p.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public x build() {
            x xVarP = p();
            if (xVarP.e()) {
                return xVarP;
            }
            throw a.AbstractC0406a.h(xVarP);
        }

        public x p() {
            x xVar = new x(this);
            if ((this.f16657b & 1) == 1) {
                this.f16658c = Collections.unmodifiableList(this.f16658c);
                this.f16657b &= -2;
            }
            xVar.f16654c = this.f16658c;
            return xVar;
        }

        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return r().j(p());
        }

        @Override // Ze.i.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b j(x xVar) {
            if (xVar == x.v()) {
                return this;
            }
            if (!xVar.f16654c.isEmpty()) {
                if (this.f16658c.isEmpty()) {
                    this.f16658c = xVar.f16654c;
                    this.f16657b &= -2;
                } else {
                    s();
                    this.f16658c.addAll(xVar.f16654c);
                }
            }
            k(i().c(xVar.f16653b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // Ze.p.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Se.x.b y1(Ze.e r3, Ze.g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                Ze.r r1 = Se.x.f16652g     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
                Se.x r3 = (Se.x) r3     // Catch: java.lang.Throwable -> Lf Ze.k -> L11
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
                Se.x r4 = (Se.x) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: Se.x.b.y1(Ze.e, Ze.g):Se.x$b");
        }

        private void t() {
        }
    }
}
