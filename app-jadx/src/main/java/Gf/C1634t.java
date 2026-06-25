package Gf;

/* JADX INFO: renamed from: Gf.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1634t extends H0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1627p f7610e;

    public C1634t(C1627p c1627p) {
        this.f7610e = c1627p;
    }

    @Override // Gf.H0
    public boolean v() {
        return true;
    }

    @Override // Gf.H0
    public void w(Throwable th2) {
        C1627p c1627p = this.f7610e;
        c1627p.K(c1627p.t(u()));
    }
}
