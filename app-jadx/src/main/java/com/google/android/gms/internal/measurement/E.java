package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends AbstractC3614x {
    protected E() {
        this.f40020a.add(N.AND);
        this.f40020a.add(N.NOT);
        this.f40020a.add(N.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3614x
    public final InterfaceC3553q a(String str, Y1 y12, List list) {
        N n10 = N.ADD;
        int iOrdinal = AbstractC3633z2.e(str).ordinal();
        if (iOrdinal == 1) {
            AbstractC3633z2.a(N.AND.name(), 2, list);
            InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(0));
            return interfaceC3553qA.m().booleanValue() ? y12.a((InterfaceC3553q) list.get(1)) : interfaceC3553qA;
        }
        if (iOrdinal == 47) {
            AbstractC3633z2.a(N.NOT.name(), 1, list);
            return new C3463g(Boolean.valueOf(!y12.a((InterfaceC3553q) list.get(0)).m().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        AbstractC3633z2.a(N.OR.name(), 2, list);
        InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(0));
        return !interfaceC3553qA2.m().booleanValue() ? y12.a((InterfaceC3553q) list.get(1)) : interfaceC3553qA2;
    }
}
