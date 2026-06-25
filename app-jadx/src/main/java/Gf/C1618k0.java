package Gf;

/* JADX INFO: renamed from: Gf.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1618k0 implements InterfaceC1643x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7584a;

    public C1618k0(boolean z10) {
        this.f7584a = z10;
    }

    @Override // Gf.InterfaceC1643x0
    public boolean b() {
        return this.f7584a;
    }

    @Override // Gf.InterfaceC1643x0
    public N0 c() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(b() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
