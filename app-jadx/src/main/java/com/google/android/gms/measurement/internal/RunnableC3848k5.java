package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3848k5 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC3623y0 f41403a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f41404b;

    RunnableC3848k5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3623y0 interfaceC3623y0) {
        this.f41403a = interfaceC3623y0;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f41404b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f41404b;
        appMeasurementDynamiteService.f40623a.C().e0(this.f41403a, appMeasurementDynamiteService.f40623a.f());
    }
}
