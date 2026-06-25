package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class W4 extends AbstractC3932x {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C3931w5 f41009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W4(C3931w5 c3931w5, C3 c32) {
        super(c32);
        Objects.requireNonNull(c3931w5);
        this.f41009e = c3931w5;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3932x
    public final void a() {
        C3931w5 c3931w5 = this.f41009e;
        c3931w5.h();
        if (c3931w5.W()) {
            c3931w5.f40611a.a().w().a("Inactivity, disconnecting from the service");
            c3931w5.A();
        }
    }
}
