package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Z4 extends AbstractC3499k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ S5 f39698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z4(C3567r5 c3567r5, String str, S5 s52) {
        super("getValue");
        this.f39698c = s52;
        Objects.requireNonNull(c3567r5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3499k
    public final InterfaceC3553q a(Y1 y12, List list) {
        AbstractC3633z2.a("getValue", 2, list);
        InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(0));
        InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(1));
        String strA = this.f39698c.a(interfaceC3553qA.k());
        return strA != null ? new C3588u(strA) : interfaceC3553qA2;
    }
}
