package Jf;

import Gf.C0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class w implements I, InterfaceC1742e, Kf.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ I f9669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f9670b;

    public w(I i10, C0 c02) {
        this.f9669a = i10;
        this.f9670b = c02;
    }

    @Override // Kf.m
    public InterfaceC1742e a(Zd.i iVar, int i10, If.a aVar) {
        return K.d(this, iVar, i10, aVar);
    }

    @Override // Jf.y, Jf.InterfaceC1742e
    public Object collect(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
        return this.f9669a.collect(interfaceC1743f, eVar);
    }

    @Override // Jf.I
    public Object getValue() {
        return this.f9669a.getValue();
    }
}
