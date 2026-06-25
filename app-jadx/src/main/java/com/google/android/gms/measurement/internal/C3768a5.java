package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3768a5 extends AbstractC3932x {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C3931w5 f41095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3768a5(C3931w5 c3931w5, C3 c32) {
        super(c32);
        Objects.requireNonNull(c3931w5);
        this.f41095e = c3931w5;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3932x
    public final void a() {
        this.f41095e.f40611a.a().r().a("Tasks have been queued for a long time");
    }
}
