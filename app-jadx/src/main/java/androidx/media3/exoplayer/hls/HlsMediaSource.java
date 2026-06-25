package androidx.media3.exoplayer.hls;

import F2.C1557l;
import F2.u;
import F2.w;
import H2.f;
import H2.m;
import M2.AbstractC1911a;
import M2.C;
import M2.C1921k;
import M2.D;
import M2.InterfaceC1920j;
import M2.L;
import M2.M;
import M2.f0;
import android.os.Looper;
import java.util.List;
import java.util.Objects;
import q2.AbstractC6076H;
import q2.C6071C;
import r3.r;
import t2.AbstractC6614a;
import t2.a0;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends AbstractC1911a implements m.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G2.e f30796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final G2.d f30797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC1920j f30798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u f30799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Q2.k f30800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f30801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f30802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f30803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final m f30804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f30805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f30806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C6071C.g f30807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC6932F f30808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C6071C f30809u;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Factory implements M {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final /* synthetic */ int f30810r = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final G2.d f30811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private G2.e f30812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r.a f30813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f30814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f30815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private H2.l f30816h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private m.a f30817i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private InterfaceC1920j f30818j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private w f30819k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Q2.k f30820l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f30821m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f30822n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f30823o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f30824p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f30825q;

        public Factory(InterfaceC6940g.a aVar) {
            this(new G2.b(aVar));
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource e(C6071C c6071c) {
            AbstractC6614a.e(c6071c.f56328b);
            if (this.f30812d == null) {
                this.f30812d = new G2.c();
            }
            r.a aVar = this.f30813e;
            if (aVar != null) {
                this.f30812d.a(aVar);
            }
            this.f30812d.c(this.f30814f);
            this.f30812d.b(this.f30815g);
            G2.e eVar = this.f30812d;
            H2.l eVar2 = this.f30816h;
            List list = c6071c.f56328b.f56433e;
            if (!list.isEmpty()) {
                eVar2 = new H2.e(eVar2, list);
            }
            G2.d dVar = this.f30811c;
            InterfaceC1920j interfaceC1920j = this.f30818j;
            u uVarA = this.f30819k.a(c6071c);
            Q2.k kVar = this.f30820l;
            return new HlsMediaSource(c6071c, dVar, eVar, interfaceC1920j, null, uVarA, kVar, this.f30817i.a(this.f30811c, kVar, eVar2, null), this.f30824p, this.f30821m, this.f30822n, this.f30823o, this.f30825q);
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory c(boolean z10) {
            this.f30814f = z10;
            return this;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory b(int i10) {
            this.f30815g = i10;
            return this;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory f(w wVar) {
            this.f30819k = (w) AbstractC6614a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory d(Q2.k kVar) {
            this.f30820l = (Q2.k) AbstractC6614a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory a(r.a aVar) {
            this.f30813e = aVar;
            return this;
        }

        public Factory(G2.d dVar) {
            this.f30811c = (G2.d) AbstractC6614a.e(dVar);
            this.f30819k = new C1557l();
            this.f30816h = new H2.a();
            this.f30817i = H2.c.f7688p;
            this.f30820l = new Q2.j();
            this.f30818j = new C1921k();
            this.f30822n = 1;
            this.f30824p = -9223372036854775807L;
            this.f30821m = true;
            c(true);
        }
    }

    static {
        AbstractC6076H.a("media3.exoplayer.hls");
    }

    private f0 D(H2.f fVar, long j10, long j11, d dVar) {
        long jD = fVar.f7725h - this.f30804p.d();
        long j12 = fVar.f7732o ? jD + fVar.f7738u : -9223372036854775807L;
        long jH = H(fVar);
        long j13 = this.f30807s.f56411a;
        K(fVar, a0.s(j13 != -9223372036854775807L ? a0.V0(j13) : J(fVar, jH), jH, fVar.f7738u + jH));
        return new f0(j10, j11, -9223372036854775807L, j12, fVar.f7738u, jD, I(fVar, jH), true, !fVar.f7732o, fVar.f7721d == 2 && fVar.f7723f, dVar, a(), this.f30807s);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private M2.f0 E(H2.f r25, long r26, long r28, androidx.media3.exoplayer.hls.d r30) {
        /*
            r24 = this;
            r0 = r25
            long r1 = r0.f7722e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L31
            java.util.List r1 = r0.f7735r
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L31
        L16:
            boolean r1 = r0.f7724g
            if (r1 != 0) goto L2e
            long r1 = r0.f7722e
            long r3 = r0.f7738u
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L23
            goto L2e
        L23:
            java.util.List r3 = r0.f7735r
            H2.f$f r1 = G(r3, r1)
            long r1 = r1.f7790e
        L2b:
            r16 = r1
            goto L34
        L2e:
            long r1 = r0.f7722e
            goto L2b
        L31:
            r1 = 0
            goto L2b
        L34:
            M2.f0 r3 = new M2.f0
            long r10 = r0.f7738u
            q2.C r22 = r24.a()
            r23 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            r12 = r10
            r4 = r26
            r6 = r28
            r21 = r30
            r3.<init>(r4, r6, r8, r10, r12, r14, r16, r18, r19, r20, r21, r22, r23)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.E(H2.f, long, long, androidx.media3.exoplayer.hls.d):M2.f0");
    }

    private static f.d F(List list, long j10) {
        f.d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            f.d dVar2 = (f.d) list.get(i10);
            long j11 = dVar2.f7790e;
            if (j11 > j10 || !dVar2.f7779l) {
                if (j11 > j10) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    private static f.C0100f G(List list, long j10) {
        return (f.C0100f) list.get(a0.h(list, Long.valueOf(j10), true, true));
    }

    private long H(H2.f fVar) {
        if (fVar.f7733p) {
            return a0.V0(a0.k0(this.f30805q)) - fVar.e();
        }
        return 0L;
    }

    private long I(H2.f fVar, long j10) {
        long jV0 = fVar.f7722e;
        if (jV0 == -9223372036854775807L) {
            jV0 = (fVar.f7738u + j10) - a0.V0(this.f30807s.f56411a);
        }
        if (fVar.f7724g) {
            return jV0;
        }
        f.d dVarF = F(fVar.f7736s, jV0);
        if (dVarF != null) {
            return dVarF.f7790e;
        }
        if (fVar.f7735r.isEmpty()) {
            return 0L;
        }
        f.C0100f c0100fG = G(fVar.f7735r, jV0);
        f.d dVarF2 = F(c0100fG.f7785m, jV0);
        return dVarF2 != null ? dVarF2.f7790e : c0100fG.f7790e;
    }

    private static long J(H2.f fVar, long j10) {
        long j11;
        f.h hVar = fVar.f7739v;
        long j12 = fVar.f7722e;
        if (j12 != -9223372036854775807L) {
            j11 = fVar.f7738u - j12;
        } else {
            long j13 = hVar.f7800d;
            if (j13 == -9223372036854775807L || fVar.f7731n == -9223372036854775807L) {
                long j14 = hVar.f7799c;
                j11 = j14 != -9223372036854775807L ? j14 : fVar.f7730m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void K(H2.f r5, long r6) {
        /*
            r4 = this;
            q2.C r0 = r4.a()
            q2.C$g r0 = r0.f56330d
            float r1 = r0.f56414d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2a
            float r0 = r0.f56415e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            H2.f$h r5 = r5.f7739v
            long r0 = r5.f7799c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            long r0 = r5.f7800d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            q2.C$g$a r0 = new q2.C$g$a
            r0.<init>()
            long r6 = t2.a0.F1(r6)
            q2.C$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3e
            r0 = r7
            goto L42
        L3e:
            q2.C$g r0 = r4.f30807s
            float r0 = r0.f56414d
        L42:
            q2.C$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L49
            goto L4d
        L49:
            q2.C$g r5 = r4.f30807s
            float r7 = r5.f56415e
        L4d:
            q2.C$g$a r5 = r6.h(r7)
            q2.C$g r5 = r5.f()
            r4.f30807s = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.K(H2.f, long):void");
    }

    @Override // M2.AbstractC1911a
    protected void A(InterfaceC6932F interfaceC6932F) {
        this.f30808t = interfaceC6932F;
        this.f30799k.e((Looper) AbstractC6614a.e(Looper.myLooper()), y());
        this.f30799k.s();
        this.f30804p.a(((C6071C.h) AbstractC6614a.e(a().f56328b)).f56429a, v(null), this);
    }

    @Override // M2.AbstractC1911a
    protected void C() {
        this.f30804p.stop();
        this.f30799k.a();
    }

    @Override // M2.D
    public synchronized C6071C a() {
        return this.f30809u;
    }

    @Override // M2.D
    public boolean e(C6071C c6071c) {
        C6071C c6071cA = a();
        C6071C.h hVar = (C6071C.h) AbstractC6614a.e(c6071cA.f56328b);
        C6071C.h hVar2 = c6071c.f56328b;
        return hVar2 != null && hVar2.f56429a.equals(hVar.f56429a) && hVar2.f56433e.equals(hVar.f56433e) && Objects.equals(hVar2.f56431c, hVar.f56431c) && c6071cA.f56330d.equals(c6071c.f56330d);
    }

    @Override // M2.D
    public C f(D.b bVar, Q2.b bVar2, long j10) {
        L.a aVarV = v(bVar);
        return new g(this.f30796h, this.f30804p, this.f30797i, this.f30808t, null, this.f30799k, t(bVar), this.f30800l, aVarV, bVar2, this.f30798j, this.f30801m, this.f30802n, this.f30803o, y(), this.f30806r);
    }

    @Override // H2.m.e
    public void i(H2.f fVar) {
        long jF1 = fVar.f7733p ? a0.F1(fVar.f7725h) : -9223372036854775807L;
        int i10 = fVar.f7721d;
        long j10 = (i10 == 2 || i10 == 1) ? jF1 : -9223372036854775807L;
        d dVar = new d((H2.i) AbstractC6614a.e(this.f30804p.e()), fVar);
        B(this.f30804p.i() ? D(fVar, j10, jF1, dVar) : E(fVar, j10, jF1, dVar));
    }

    @Override // M2.D
    public synchronized void j(C6071C c6071c) {
        this.f30809u = c6071c;
    }

    @Override // M2.D
    public void l() {
        this.f30804p.l();
    }

    @Override // M2.D
    public void m(C c10) {
        ((g) c10).D();
    }

    private HlsMediaSource(C6071C c6071c, G2.d dVar, G2.e eVar, InterfaceC1920j interfaceC1920j, Q2.e eVar2, u uVar, Q2.k kVar, m mVar, long j10, boolean z10, int i10, boolean z11, long j11) {
        this.f30809u = c6071c;
        this.f30807s = c6071c.f56330d;
        this.f30797i = dVar;
        this.f30796h = eVar;
        this.f30798j = interfaceC1920j;
        this.f30799k = uVar;
        this.f30800l = kVar;
        this.f30804p = mVar;
        this.f30805q = j10;
        this.f30801m = z10;
        this.f30802n = i10;
        this.f30803o = z11;
        this.f30806r = j11;
    }
}
