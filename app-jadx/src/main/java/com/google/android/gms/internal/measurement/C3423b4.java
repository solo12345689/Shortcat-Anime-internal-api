package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3423b4 extends AbstractC3499k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3427c f39714c;

    public C3423b4(C3427c c3427c) {
        super("internal.eventLogger");
        this.f39714c = c3427c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3499k
    public final InterfaceC3553q a(Y1 y12, List list) {
        AbstractC3633z2.a(this.f39806a, 3, list);
        String strK = y12.a((InterfaceC3553q) list.get(0)).k();
        long jI = (long) AbstractC3633z2.i(y12.a((InterfaceC3553q) list.get(1)).l().doubleValue());
        InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(2));
        this.f39714c.e(strK, jI, interfaceC3553qA instanceof C3526n ? AbstractC3633z2.k((C3526n) interfaceC3553qA) : new HashMap());
        return InterfaceC3553q.f39929W;
    }
}
