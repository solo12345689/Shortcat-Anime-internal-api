package Jf;

import Gf.C0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class v implements y, InterfaceC1742e, Kf.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ y f9667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f9668b;

    public v(y yVar, C0 c02) {
        this.f9667a = yVar;
        this.f9668b = c02;
    }

    @Override // Kf.m
    public InterfaceC1742e a(Zd.i iVar, int i10, If.a aVar) {
        return A.e(this, iVar, i10, aVar);
    }

    @Override // Jf.y, Jf.InterfaceC1742e
    public Object collect(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
        return this.f9667a.collect(interfaceC1743f, eVar);
    }
}
