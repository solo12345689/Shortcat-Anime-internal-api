package Kf;

import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import ae.AbstractC2605b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends g {
    public /* synthetic */ h(InterfaceC1742e interfaceC1742e, Zd.i iVar, int i10, If.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1742e, (i11 & 2) != 0 ? Zd.j.f23275a : iVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? If.a.f9114a : aVar);
    }

    @Override // Kf.e
    protected e i(Zd.i iVar, int i10, If.a aVar) {
        return new h(this.f11094d, iVar, i10, aVar);
    }

    @Override // Kf.e
    public InterfaceC1742e j() {
        return this.f11094d;
    }

    @Override // Kf.g
    protected Object q(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
        Object objCollect = this.f11094d.collect(interfaceC1743f, eVar);
        return objCollect == AbstractC2605b.f() ? objCollect : L.f17438a;
    }

    public h(InterfaceC1742e interfaceC1742e, Zd.i iVar, int i10, If.a aVar) {
        super(interfaceC1742e, iVar, i10, aVar);
    }
}
