package M2;

import M2.D;
import M2.L;
import P9.AbstractC2011u;
import android.net.Uri;
import q2.C6071C;
import q2.C6109x;
import t2.AbstractC6614a;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends AbstractC1911a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w2.o f11966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC6940g.a f11967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C6109x f11968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f11969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Q2.k f11970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f11971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final q2.Y f11972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C6071C f11973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final O9.t f11974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private InterfaceC6932F f11975q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC6940g.a f11976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Q2.k f11977b = new Q2.j();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f11978c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f11979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f11980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private O9.t f11981f;

        public b(InterfaceC6940g.a aVar) {
            this.f11976a = (InterfaceC6940g.a) AbstractC6614a.e(aVar);
        }

        public h0 a(C6071C.k kVar, long j10) {
            return new h0(this.f11980e, kVar, this.f11976a, j10, this.f11977b, this.f11978c, this.f11979d, this.f11981f);
        }

        public b b(Q2.k kVar) {
            if (kVar == null) {
                kVar = new Q2.j();
            }
            this.f11977b = kVar;
            return this;
        }
    }

    @Override // M2.AbstractC1911a
    protected void A(InterfaceC6932F interfaceC6932F) {
        this.f11975q = interfaceC6932F;
        B(this.f11972n);
    }

    @Override // M2.D
    public C6071C a() {
        return this.f11973o;
    }

    @Override // M2.D
    public C f(D.b bVar, Q2.b bVar2, long j10) {
        w2.o oVar = this.f11966h;
        InterfaceC6940g.a aVar = this.f11967i;
        InterfaceC6932F interfaceC6932F = this.f11975q;
        C6109x c6109x = this.f11968j;
        long j11 = this.f11969k;
        Q2.k kVar = this.f11970l;
        L.a aVarV = v(bVar);
        boolean z10 = this.f11971m;
        O9.t tVar = this.f11974p;
        return new g0(oVar, aVar, interfaceC6932F, c6109x, j11, kVar, aVarV, z10, tVar != null ? (R2.a) tVar.get() : null);
    }

    @Override // M2.D
    public void m(C c10) {
        ((g0) c10).w();
    }

    private h0(String str, C6071C.k kVar, InterfaceC6940g.a aVar, long j10, Q2.k kVar2, boolean z10, Object obj, O9.t tVar) {
        this.f11967i = aVar;
        this.f11969k = j10;
        this.f11970l = kVar2;
        this.f11971m = z10;
        C6071C c6071cA = new C6071C.c().j(Uri.EMPTY).d(kVar.f56456a.toString()).h(AbstractC2011u.B(kVar)).i(obj).a();
        this.f11973o = c6071cA;
        C6109x.b bVarL0 = new C6109x.b().y0((String) O9.h.a(kVar.f56457b, "text/x-unknown")).n0(kVar.f56458c).A0(kVar.f56459d).w0(kVar.f56460e).l0(kVar.f56461f);
        String str2 = kVar.f56462g;
        this.f11968j = bVarL0.j0(str2 != null ? str2 : str).P();
        this.f11966h = new o.b().i(kVar.f56456a).b(1).a();
        this.f11972n = new f0(j10, true, false, false, null, c6071cA);
        this.f11974p = tVar;
    }

    @Override // M2.AbstractC1911a
    protected void C() {
    }

    @Override // M2.D
    public void l() {
    }
}
