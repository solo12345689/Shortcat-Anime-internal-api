package Gf;

import Td.u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class S0 extends H0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1627p f7536e;

    public S0(C1627p c1627p) {
        this.f7536e = c1627p;
    }

    @Override // Gf.H0
    public boolean v() {
        return false;
    }

    @Override // Gf.H0
    public void w(Throwable th2) {
        Object objE0 = u().e0();
        if (objE0 instanceof C) {
            C1627p c1627p = this.f7536e;
            u.a aVar = Td.u.f17466b;
            c1627p.resumeWith(Td.u.b(Td.v.a(((C) objE0).f7489a)));
        } else {
            C1627p c1627p2 = this.f7536e;
            u.a aVar2 = Td.u.f17466b;
            c1627p2.resumeWith(Td.u.b(J0.h(objE0)));
        }
    }
}
