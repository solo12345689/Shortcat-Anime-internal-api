package Gf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class E0 extends I0 implements A {

    /* JADX INFO: renamed from: c */
    private final boolean f7493c;

    public E0(C0 c02) {
        super(true);
        l0(c02);
        this.f7493c = Q0();
    }

    private final boolean Q0() {
        I0 i0U;
        InterfaceC1636u interfaceC1636uD0 = d0();
        C1638v c1638v = interfaceC1636uD0 instanceof C1638v ? (C1638v) interfaceC1636uD0 : null;
        if (c1638v != null && (i0U = c1638v.u()) != null) {
            while (!i0U.Z()) {
                InterfaceC1636u interfaceC1636uD02 = i0U.d0();
                C1638v c1638v2 = interfaceC1636uD02 instanceof C1638v ? (C1638v) interfaceC1636uD02 : null;
                if (c1638v2 == null || (i0U = c1638v2.u()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Gf.I0
    public boolean Z() {
        return this.f7493c;
    }

    @Override // Gf.I0
    public boolean a0() {
        return true;
    }

    @Override // Gf.A
    public boolean h(Throwable th2) {
        return r0(new C(th2, false, 2, null));
    }
}
