package I0;

import i1.C5009b;

/* JADX INFO: renamed from: I0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1682h implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1686l f8712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC1688n f8713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC1689o f8714c;

    public C1682h(InterfaceC1686l interfaceC1686l, EnumC1688n enumC1688n, EnumC1689o enumC1689o) {
        this.f8712a = interfaceC1686l;
        this.f8713b = enumC1688n;
        this.f8714c = enumC1689o;
    }

    @Override // I0.InterfaceC1686l
    public int I(int i10) {
        return this.f8712a.I(i10);
    }

    @Override // I0.InterfaceC1686l
    public int Z(int i10) {
        return this.f8712a.Z(i10);
    }

    @Override // I0.InterfaceC1686l
    public Object j() {
        return this.f8712a.j();
    }

    @Override // I0.InterfaceC1686l
    public int l0(int i10) {
        return this.f8712a.l0(i10);
    }

    @Override // I0.InterfaceC1686l
    public int q0(int i10) {
        return this.f8712a.q0(i10);
    }

    @Override // I0.A
    public androidx.compose.ui.layout.s v0(long j10) {
        if (this.f8714c == EnumC1689o.f8720a) {
            return new C1684j(this.f8713b == EnumC1688n.f8717b ? this.f8712a.q0(C5009b.k(j10)) : this.f8712a.l0(C5009b.k(j10)), C5009b.g(j10) ? C5009b.k(j10) : 32767);
        }
        return new C1684j(C5009b.h(j10) ? C5009b.l(j10) : 32767, this.f8713b == EnumC1688n.f8717b ? this.f8712a.I(C5009b.l(j10)) : this.f8712a.Z(C5009b.l(j10)));
    }
}
