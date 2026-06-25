package E0;

import E0.Q;

/* JADX INFO: renamed from: E0.w */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1312w extends AbstractC1296f {

    /* JADX INFO: renamed from: d */
    private final String f4191d;

    public C1312w(InterfaceC1313x interfaceC1313x, boolean z10) {
        super(interfaceC1313x, z10, null, 4, null);
        this.f4191d = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // E0.AbstractC1296f
    public void G1(InterfaceC1313x interfaceC1313x) {
        z zVarN1 = N1();
        if (zVarN1 != null) {
            zVarN1.b(interfaceC1313x);
        }
    }

    @Override // E0.AbstractC1296f
    public boolean O1(int i10) {
        Q.a aVar = Q.f4086a;
        return (Q.g(i10, aVar.c()) || Q.g(i10, aVar.a())) ? false : true;
    }

    @Override // K0.I0
    /* JADX INFO: renamed from: T1 */
    public String B() {
        return this.f4191d;
    }
}
