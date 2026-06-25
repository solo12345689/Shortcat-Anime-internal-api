package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3597v implements InterfaceC3553q {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C3597v;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final String k() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Double l() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Boolean m() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Iterator n() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q p() {
        return InterfaceC3553q.f39929W;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q r(String str, Y1 y12, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
