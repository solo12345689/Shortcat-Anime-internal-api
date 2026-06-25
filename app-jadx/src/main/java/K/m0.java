package K;

import a1.InterfaceC2517J;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class m0 implements InterfaceC2517J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2517J f10257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10259d;

    public m0(InterfaceC2517J interfaceC2517J, int i10, int i11) {
        this.f10257b = interfaceC2517J;
        this.f10258c = i10;
        this.f10259d = i11;
    }

    @Override // a1.InterfaceC2517J
    public int a(int i10) {
        int iA = this.f10257b.a(i10);
        if (i10 >= 0 && i10 <= this.f10259d) {
            n0.h(iA, this.f10258c, i10);
        }
        return iA;
    }

    @Override // a1.InterfaceC2517J
    public int b(int i10) {
        int iB = this.f10257b.b(i10);
        if (i10 >= 0 && i10 <= this.f10258c) {
            n0.g(iB, this.f10259d, i10);
        }
        return iB;
    }
}
