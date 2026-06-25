package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class J5 extends AbstractC3932x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ L5 f40820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J5(L5 l52, C3 c32) {
        super(c32);
        Objects.requireNonNull(l52);
        this.f40820e = l52;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3932x
    public final void a() {
        L5 l52 = this.f40820e;
        N5 n52 = l52.f40848d;
        n52.h();
        X2 x22 = n52.f40611a;
        l52.d(false, false, x22.e().c());
        n52.f40611a.M().k(x22.e().c());
    }
}
