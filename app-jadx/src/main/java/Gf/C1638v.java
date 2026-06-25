package Gf;

/* JADX INFO: renamed from: Gf.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1638v extends H0 implements InterfaceC1636u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1640w f7612e;

    public C1638v(InterfaceC1640w interfaceC1640w) {
        this.f7612e = interfaceC1640w;
    }

    @Override // Gf.InterfaceC1636u
    public boolean a(Throwable th2) {
        return u().K(th2);
    }

    @Override // Gf.InterfaceC1636u
    public C0 getParent() {
        return u();
    }

    @Override // Gf.H0
    public boolean v() {
        return true;
    }

    @Override // Gf.H0
    public void w(Throwable th2) {
        this.f7612e.S(u());
    }
}
