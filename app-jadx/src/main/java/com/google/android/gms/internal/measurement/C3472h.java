package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3472h implements InterfaceC3553q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3553q f39769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39770b;

    public C3472h(String str) {
        this.f39769a = InterfaceC3553q.f39929W;
        this.f39770b = str;
    }

    public final InterfaceC3553q a() {
        return this.f39769a;
    }

    public final String b() {
        return this.f39770b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3472h)) {
            return false;
        }
        C3472h c3472h = (C3472h) obj;
        return this.f39770b.equals(c3472h.f39770b) && this.f39769a.equals(c3472h.f39769a);
    }

    public final int hashCode() {
        return (this.f39770b.hashCode() * 31) + this.f39769a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final String k() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Double l() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Boolean m() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Iterator n() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q p() {
        return new C3472h(this.f39770b, this.f39769a.p());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q r(String str, Y1 y12, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C3472h(String str, InterfaceC3553q interfaceC3553q) {
        this.f39769a = interfaceC3553q;
        this.f39770b = str;
    }
}
