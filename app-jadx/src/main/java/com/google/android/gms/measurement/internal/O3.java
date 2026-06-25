package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3623y0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class O3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC3623y0 f40887a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f40888b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f40889c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f40890d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f40891e;

    O3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3623y0 interfaceC3623y0, String str, String str2, boolean z10) {
        this.f40887a = interfaceC3623y0;
        this.f40888b = str;
        this.f40889c = str2;
        this.f40890d = z10;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f40891e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40891e.f40623a.J().h0(this.f40887a, this.f40888b, this.f40889c, this.f40890d);
    }
}
