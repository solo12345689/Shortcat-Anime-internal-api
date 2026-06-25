package W;

import C.P;
import Y.C0;
import Y.b2;
import i1.EnumC5027t;
import i1.InterfaceC5011d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f20504b;

    public e(P p10) {
        this.f20504b = b2.e(p10, null, 2, null);
    }

    @Override // C.P
    public int a(InterfaceC5011d interfaceC5011d) {
        return e().a(interfaceC5011d);
    }

    @Override // C.P
    public int b(InterfaceC5011d interfaceC5011d) {
        return e().b(interfaceC5011d);
    }

    @Override // C.P
    public int c(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return e().c(interfaceC5011d, enumC5027t);
    }

    @Override // C.P
    public int d(InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t) {
        return e().d(interfaceC5011d, enumC5027t);
    }

    public final P e() {
        return (P) this.f20504b.getValue();
    }

    public final void f(P p10) {
        this.f20504b.setValue(p10);
    }
}
