package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class U2 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC3623y0 f40985a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f40986b;

    U2(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3623y0 interfaceC3623y0) {
        this.f40985a = interfaceC3623y0;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f40986b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40986b.f40623a.J().r(this.f40985a);
    }
}
