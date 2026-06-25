package Gf;

/* JADX INFO: renamed from: Gf.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1614i0 implements InterfaceC1621m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1612h0 f7580a;

    public C1614i0(InterfaceC1612h0 interfaceC1612h0) {
        this.f7580a = interfaceC1612h0;
    }

    @Override // Gf.InterfaceC1621m
    public void a(Throwable th2) {
        this.f7580a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f7580a + ']';
    }
}
