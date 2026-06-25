package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3606w extends AbstractC3614x {
    public C3606w() {
        this.f40020a.add(N.BITWISE_AND);
        this.f40020a.add(N.BITWISE_LEFT_SHIFT);
        this.f40020a.add(N.BITWISE_NOT);
        this.f40020a.add(N.BITWISE_OR);
        this.f40020a.add(N.BITWISE_RIGHT_SHIFT);
        this.f40020a.add(N.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f40020a.add(N.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3614x
    public final InterfaceC3553q a(String str, Y1 y12, List list) {
        N n10 = N.ADD;
        switch (AbstractC3633z2.e(str).ordinal()) {
            case 4:
                AbstractC3633z2.a(N.BITWISE_AND.name(), 2, list);
                return new C3490j(Double.valueOf(AbstractC3633z2.g(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue()) & AbstractC3633z2.g(y12.a((InterfaceC3553q) list.get(1)).l().doubleValue())));
            case 5:
                AbstractC3633z2.a(N.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C3490j(Double.valueOf(AbstractC3633z2.g(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue()) << ((int) (AbstractC3633z2.h(y12.a((InterfaceC3553q) list.get(1)).l().doubleValue()) & 31))));
            case 6:
                AbstractC3633z2.a(N.BITWISE_NOT.name(), 1, list);
                return new C3490j(Double.valueOf(~AbstractC3633z2.g(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue())));
            case 7:
                AbstractC3633z2.a(N.BITWISE_OR.name(), 2, list);
                return new C3490j(Double.valueOf(AbstractC3633z2.g(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue()) | AbstractC3633z2.g(y12.a((InterfaceC3553q) list.get(1)).l().doubleValue())));
            case 8:
                AbstractC3633z2.a(N.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C3490j(Double.valueOf(AbstractC3633z2.g(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue()) >> ((int) (AbstractC3633z2.h(y12.a((InterfaceC3553q) list.get(1)).l().doubleValue()) & 31))));
            case 9:
                AbstractC3633z2.a(N.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C3490j(Double.valueOf(AbstractC3633z2.h(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue()) >>> ((int) (AbstractC3633z2.h(y12.a((InterfaceC3553q) list.get(1)).l().doubleValue()) & 31))));
            case 10:
                AbstractC3633z2.a(N.BITWISE_XOR.name(), 2, list);
                return new C3490j(Double.valueOf(AbstractC3633z2.g(y12.a((InterfaceC3553q) list.get(0)).l().doubleValue()) ^ AbstractC3633z2.g(y12.a((InterfaceC3553q) list.get(1)).l().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
