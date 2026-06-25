package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n4 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3868n4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C3841j6 f41464a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f41465b;

    RunnableC3868n4(AppMeasurementDynamiteService appMeasurementDynamiteService, C3841j6 c3841j6) {
        this.f41464a = c3841j6;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f41465b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41465b.f40623a.B().I(this.f41464a);
    }
}
