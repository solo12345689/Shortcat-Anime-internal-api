package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class R7 extends AbstractC3499k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V7 f39565c;

    public R7(V7 v72) {
        super("internal.registerCallback");
        this.f39565c = v72;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3499k
    public final InterfaceC3553q a(Y1 y12, List list) {
        AbstractC3633z2.a(this.f39806a, 3, list);
        String strK = y12.a((InterfaceC3553q) list.get(0)).k();
        InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(1));
        if (!(interfaceC3553qA instanceof C3544p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(2));
        if (!(interfaceC3553qA2 instanceof C3526n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C3526n c3526n = (C3526n) interfaceC3553qA2;
        if (!c3526n.f("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f39565c.a(strK, c3526n.f("priority") ? AbstractC3633z2.g(c3526n.c("priority").l().doubleValue()) : 1000, (C3544p) interfaceC3553qA, c3526n.c("type").k());
        return InterfaceC3553q.f39929W;
    }
}
