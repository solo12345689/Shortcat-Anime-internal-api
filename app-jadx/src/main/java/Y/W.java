package Y;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class W implements InterfaceC2453v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f22229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private X f22230b;

    public W(Function1 function1) {
        this.f22229a = function1;
    }

    @Override // Y.InterfaceC2453v1
    public void c() {
        this.f22230b = (X) this.f22229a.invoke(AbstractC2393b0.f22272a);
    }

    @Override // Y.InterfaceC2453v1
    public void e() {
        X x10 = this.f22230b;
        if (x10 != null) {
            x10.dispose();
        }
        this.f22230b = null;
    }

    @Override // Y.InterfaceC2453v1
    public void d() {
    }
}
