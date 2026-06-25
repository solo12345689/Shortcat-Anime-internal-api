package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class K extends AbstractC3614x {
    protected K() {
        this.f40020a.add(N.ADD);
        this.f40020a.add(N.DIVIDE);
        this.f40020a.add(N.MODULUS);
        this.f40020a.add(N.MULTIPLY);
        this.f40020a.add(N.NEGATE);
        this.f40020a.add(N.POST_DECREMENT);
        this.f40020a.add(N.POST_INCREMENT);
        this.f40020a.add(N.PRE_DECREMENT);
        this.f40020a.add(N.PRE_INCREMENT);
        this.f40020a.add(N.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3614x
    public final InterfaceC3553q a(String str, Y1 y12, List list) {
        N n10 = N.ADD;
        int iOrdinal = AbstractC3633z2.e(str).ordinal();
        if (iOrdinal == 0) {
            AbstractC3633z2.a(N.ADD.name(), 2, list);
            InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(0));
            InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(1));
            if (!(interfaceC3553qA instanceof InterfaceC3517m) && !(interfaceC3553qA instanceof C3588u) && !(interfaceC3553qA2 instanceof InterfaceC3517m) && !(interfaceC3553qA2 instanceof C3588u)) {
                return new C3490j(Double.valueOf(interfaceC3553qA.l().doubleValue() + interfaceC3553qA2.l().doubleValue()));
            }
            return new C3588u(String.valueOf(interfaceC3553qA.k()).concat(String.valueOf(interfaceC3553qA2.k())));
        }
        if (iOrdinal == 21) {
            AbstractC3633z2.a(N.DIVIDE.name(), 2, list);
            return new C3490j(Double.valueOf(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue() / y12.a((InterfaceC3553q) list.get(1)).l().doubleValue()));
        }
        if (iOrdinal == 59) {
            AbstractC3633z2.a(N.SUBTRACT.name(), 2, list);
            return new C3490j(Double.valueOf(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue() + new C3490j(Double.valueOf(-y12.a((InterfaceC3553q) list.get(1)).l().doubleValue())).l().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            AbstractC3633z2.a(str, 2, list);
            InterfaceC3553q interfaceC3553qA3 = y12.a((InterfaceC3553q) list.get(0));
            y12.a((InterfaceC3553q) list.get(1));
            return interfaceC3553qA3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            AbstractC3633z2.a(str, 1, list);
            return y12.a((InterfaceC3553q) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                AbstractC3633z2.a(N.MODULUS.name(), 2, list);
                return new C3490j(Double.valueOf(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue() % y12.a((InterfaceC3553q) list.get(1)).l().doubleValue()));
            case 45:
                AbstractC3633z2.a(N.MULTIPLY.name(), 2, list);
                return new C3490j(Double.valueOf(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue() * y12.a((InterfaceC3553q) list.get(1)).l().doubleValue()));
            case 46:
                AbstractC3633z2.a(N.NEGATE.name(), 1, list);
                return new C3490j(Double.valueOf(-y12.a((InterfaceC3553q) list.get(0)).l().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
