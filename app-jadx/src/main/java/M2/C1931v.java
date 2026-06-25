package M2;

import M2.D;
import java.util.Objects;
import q2.C6071C;
import t2.AbstractC6614a;
import w2.InterfaceC6932F;

/* JADX INFO: renamed from: M2.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1931v extends AbstractC1911a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f12046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C6071C f12047i;

    @Override // M2.AbstractC1911a
    protected void A(InterfaceC6932F interfaceC6932F) {
        B(new f0(this.f12046h, true, false, false, null, a()));
    }

    @Override // M2.D
    public synchronized C6071C a() {
        return this.f12047i;
    }

    @Override // M2.D
    public boolean e(C6071C c6071c) {
        C6071C.h hVar = c6071c.f56328b;
        C6071C.h hVar2 = (C6071C.h) AbstractC6614a.e(a().f56328b);
        if (hVar == null || !hVar.f56429a.equals(hVar2.f56429a) || !Objects.equals(hVar.f56430b, hVar2.f56430b)) {
            return false;
        }
        long j10 = hVar.f56438j;
        return j10 == -9223372036854775807L || t2.a0.V0(j10) == this.f12046h;
    }

    @Override // M2.D
    public C f(D.b bVar, Q2.b bVar2, long j10) {
        C6071C c6071cA = a();
        AbstractC6614a.e(c6071cA.f56328b);
        AbstractC6614a.f(c6071cA.f56328b.f56430b, "Externally loaded mediaItems require a MIME type.");
        C6071C.h hVar = c6071cA.f56328b;
        return new C1930u(hVar.f56429a, hVar.f56430b, null);
    }

    @Override // M2.D
    public synchronized void j(C6071C c6071c) {
        this.f12047i = c6071c;
    }

    @Override // M2.D
    public void m(C c10) {
        ((C1930u) c10).m();
    }

    private C1931v(C6071C c6071c, long j10, InterfaceC1929t interfaceC1929t) {
        this.f12047i = c6071c;
        this.f12046h = j10;
    }

    @Override // M2.AbstractC1911a
    protected void C() {
    }

    @Override // M2.D
    public void l() {
    }

    /* JADX INFO: renamed from: M2.v$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements D.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f12048c;

        public b(long j10, InterfaceC1929t interfaceC1929t) {
            this.f12048c = j10;
        }

        @Override // M2.D.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1931v e(C6071C c6071c) {
            return new C1931v(c6071c, this.f12048c, null);
        }

        @Override // M2.D.a
        public D.a d(Q2.k kVar) {
            return this;
        }

        @Override // M2.D.a
        public D.a f(F2.w wVar) {
            return this;
        }
    }
}
