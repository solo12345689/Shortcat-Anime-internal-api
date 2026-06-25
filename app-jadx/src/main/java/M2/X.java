package M2;

import B2.K1;
import F2.C1557l;
import F2.t;
import M2.D;
import M2.L;
import M2.Q;
import M2.W;
import M2.X;
import android.net.Uri;
import android.os.Looper;
import java.util.Objects;
import q2.C6071C;
import q2.C6109x;
import q2.Y;
import t2.AbstractC6614a;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC1911a implements W.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC6940g.a f11797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q.a f11798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final F2.u f11799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Q2.k f11800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f11801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f11802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C6109x f11803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final O9.t f11804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f11806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC6932F f11809t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C6071C f11810u;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC1932w {
        a(q2.Y y10) {
            super(y10);
        }

        @Override // M2.AbstractC1932w, q2.Y
        public Y.b k(int i10, Y.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f56656f = true;
            return bVar;
        }

        @Override // M2.AbstractC1932w, q2.Y
        public Y.d s(int i10, Y.d dVar, long j10) {
            super.s(i10, dVar, j10);
            dVar.f56688k = true;
            return dVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements M {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC6940g.a f11812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Q.a f11813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private F2.w f11814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Q2.k f11815f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f11816g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private O9.t f11817h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f11818i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private C6109x f11819j;

        public b(InterfaceC6940g.a aVar, final U2.u uVar) {
            this(aVar, new Q.a() { // from class: M2.Y
                @Override // M2.Q.a
                public final Q a(K1 k12) {
                    return X.b.g(uVar, k12);
                }
            });
        }

        public static /* synthetic */ Q g(U2.u uVar, K1 k12) {
            return new C1914d(uVar);
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public X e(C6071C c6071c) {
            AbstractC6614a.e(c6071c.f56328b);
            return new X(c6071c, this.f11812c, this.f11813d, this.f11814e.a(c6071c), this.f11815f, this.f11816g, this.f11818i, this.f11819j, this.f11817h, null);
        }

        b i(int i10, C6109x c6109x) {
            this.f11818i = i10;
            this.f11819j = (C6109x) AbstractC6614a.e(c6109x);
            return this;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b f(F2.w wVar) {
            this.f11814e = (F2.w) AbstractC6614a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b d(Q2.k kVar) {
            this.f11815f = (Q2.k) AbstractC6614a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(InterfaceC6940g.a aVar, Q.a aVar2) {
            this(aVar, aVar2, new C1557l(), new Q2.j(), 1048576);
        }

        public b(InterfaceC6940g.a aVar, Q.a aVar2, F2.w wVar, Q2.k kVar, int i10) {
            this.f11812c = aVar;
            this.f11813d = aVar2;
            this.f11814e = wVar;
            this.f11815f = kVar;
            this.f11816g = i10;
        }
    }

    /* synthetic */ X(C6071C c6071c, InterfaceC6940g.a aVar, Q.a aVar2, F2.u uVar, Q2.k kVar, int i10, int i11, C6109x c6109x, O9.t tVar, a aVar3) {
        this(c6071c, aVar, aVar2, uVar, kVar, i10, i11, c6109x, tVar);
    }

    private C6071C.h D() {
        return (C6071C.h) AbstractC6614a.e(a().f56328b);
    }

    private void E() {
        q2.Y f0Var = new f0(this.f11806q, this.f11807r, false, this.f11808s, null, a());
        if (this.f11805p) {
            f0Var = new a(f0Var);
        }
        B(f0Var);
    }

    @Override // M2.AbstractC1911a
    protected void A(InterfaceC6932F interfaceC6932F) {
        this.f11809t = interfaceC6932F;
        this.f11799j.e((Looper) AbstractC6614a.e(Looper.myLooper()), y());
        this.f11799j.s();
        E();
    }

    @Override // M2.AbstractC1911a
    protected void C() {
        this.f11799j.a();
    }

    @Override // M2.D
    public synchronized C6071C a() {
        return this.f11810u;
    }

    @Override // M2.D
    public boolean e(C6071C c6071c) {
        C6071C.h hVarD = D();
        C6071C.h hVar = c6071c.f56328b;
        return hVar != null && hVar.f56429a.equals(hVarD.f56429a) && hVar.f56438j == hVarD.f56438j && Objects.equals(hVar.f56434f, hVarD.f56434f);
    }

    @Override // M2.D
    public C f(D.b bVar, Q2.b bVar2, long j10) {
        InterfaceC6940g interfaceC6940gA = this.f11797h.a();
        InterfaceC6932F interfaceC6932F = this.f11809t;
        if (interfaceC6932F != null) {
            interfaceC6940gA.i(interfaceC6932F);
        }
        C6071C.h hVarD = D();
        Uri uri = hVarD.f56429a;
        Q qA = this.f11798i.a(y());
        F2.u uVar = this.f11799j;
        t.a aVarT = t(bVar);
        Q2.k kVar = this.f11800k;
        L.a aVarV = v(bVar);
        String str = hVarD.f56434f;
        int i10 = this.f11801l;
        int i11 = this.f11802m;
        C6109x c6109x = this.f11803n;
        long jV0 = t2.a0.V0(hVarD.f56438j);
        O9.t tVar = this.f11804o;
        return new W(uri, interfaceC6940gA, qA, uVar, aVarT, kVar, aVarV, this, bVar2, str, i10, i11, c6109x, jV0, tVar != null ? (R2.a) tVar.get() : null);
    }

    @Override // M2.W.c
    public void g(long j10, U2.J j11, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f11806q;
        }
        boolean zK = j11.k();
        if (!this.f11805p && this.f11806q == j10 && this.f11807r == zK && this.f11808s == z10) {
            return;
        }
        this.f11806q = j10;
        this.f11807r = zK;
        this.f11808s = z10;
        this.f11805p = false;
        E();
    }

    @Override // M2.D
    public synchronized void j(C6071C c6071c) {
        this.f11810u = c6071c;
    }

    @Override // M2.D
    public void m(C c10) {
        ((W) c10).f0();
    }

    private X(C6071C c6071c, InterfaceC6940g.a aVar, Q.a aVar2, F2.u uVar, Q2.k kVar, int i10, int i11, C6109x c6109x, O9.t tVar) {
        this.f11810u = c6071c;
        this.f11797h = aVar;
        this.f11798i = aVar2;
        this.f11799j = uVar;
        this.f11800k = kVar;
        this.f11801l = i10;
        this.f11803n = c6109x;
        this.f11802m = i11;
        this.f11805p = true;
        this.f11806q = -9223372036854775807L;
        this.f11804o = tVar;
    }

    @Override // M2.D
    public void l() {
    }
}
