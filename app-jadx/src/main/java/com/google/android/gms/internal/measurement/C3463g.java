package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3463g implements InterfaceC3553q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f39758a;

    public C3463g(Boolean bool) {
        this.f39758a = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3463g) && this.f39758a == ((C3463g) obj).f39758a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f39758a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final String k() {
        return Boolean.toString(this.f39758a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Double l() {
        return Double.valueOf(true != this.f39758a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Boolean m() {
        return Boolean.valueOf(this.f39758a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Iterator n() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q p() {
        return new C3463g(Boolean.valueOf(this.f39758a));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q r(String str, Y1 y12, List list) {
        if ("toString".equals(str)) {
            return new C3588u(Boolean.toString(this.f39758a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f39758a), str));
    }

    public final String toString() {
        return String.valueOf(this.f39758a);
    }
}
