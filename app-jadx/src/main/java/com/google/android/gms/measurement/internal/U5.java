package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class U5 extends AbstractC3932x {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ V5 f40990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U5(V5 v52, C3 c32) {
        super(c32);
        Objects.requireNonNull(v52);
        this.f40990e = v52;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3932x
    public final void a() {
        V5 v52 = this.f40990e;
        v52.n();
        v52.f40611a.a().w().a("Starting upload from DelayedRunnable");
        v52.f41010b.r();
    }
}
