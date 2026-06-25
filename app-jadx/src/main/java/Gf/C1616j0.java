package Gf;

/* JADX INFO: renamed from: Gf.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1616j0 extends H0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1612h0 f7583e;

    public C1616j0(InterfaceC1612h0 interfaceC1612h0) {
        this.f7583e = interfaceC1612h0;
    }

    @Override // Gf.H0
    public boolean v() {
        return false;
    }

    @Override // Gf.H0
    public void w(Throwable th2) {
        this.f7583e.dispose();
    }
}
