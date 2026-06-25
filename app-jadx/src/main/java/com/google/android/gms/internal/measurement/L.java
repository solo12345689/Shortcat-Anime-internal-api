package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class L extends AbstractC3614x {
    @Override // com.google.android.gms.internal.measurement.AbstractC3614x
    public final InterfaceC3553q a(String str, Y1 y12, List list) {
        if (str == null || str.isEmpty() || !y12.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC3553q interfaceC3553qH = y12.h(str);
        if (interfaceC3553qH instanceof AbstractC3499k) {
            return ((AbstractC3499k) interfaceC3553qH).a(y12, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
