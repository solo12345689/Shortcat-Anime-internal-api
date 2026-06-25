package Y;

import ie.InterfaceC5082a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class Z extends AbstractC2394b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T1 f22262b;

    public Z(T1 t12, InterfaceC5082a interfaceC5082a) {
        super(interfaceC5082a);
        this.f22262b = t12;
    }

    @Override // Y.AbstractC2394b1
    public C2397c1 c(Object obj) {
        return new C2397c1(this, obj, obj == null, this.f22262b, null, null, true);
    }
}
