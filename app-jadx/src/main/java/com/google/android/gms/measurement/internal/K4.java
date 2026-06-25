package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class K4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC3623y0 f40832a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f40833b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f40834c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f40835d;

    K4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3623y0 interfaceC3623y0, String str, String str2) {
        this.f40832a = interfaceC3623y0;
        this.f40833b = str;
        this.f40834c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f40835d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40835d.f40623a.J().f0(this.f40832a, this.f40833b, this.f40834c);
    }
}
