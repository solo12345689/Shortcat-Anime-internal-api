package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class U3 extends AbstractC3932x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3937x4 f40987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U3(C3937x4 c3937x4, C3 c32) {
        super(c32);
        Objects.requireNonNull(c3937x4);
        this.f40987e = c3937x4;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3932x
    public final void a() {
        C3937x4 c3937x4 = this.f40987e;
        if (c3937x4.f40611a.n()) {
            c3937x4.c0().b(2000L);
        }
    }
}
