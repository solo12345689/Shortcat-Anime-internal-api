package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3922v3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC3623y0 f41662a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ G f41663b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f41664c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f41665d;

    RunnableC3922v3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3623y0 interfaceC3623y0, G g10, String str) {
        this.f41662a = interfaceC3623y0;
        this.f41663b = g10;
        this.f41664c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f41665d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41665d.f40623a.J().B(this.f41662a, this.f41663b, this.f41664c);
    }
}
