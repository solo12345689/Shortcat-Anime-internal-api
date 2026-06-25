package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import j9.InterfaceC5343A;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class A6 implements InterfaceC5343A {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.internal.measurement.E0 f40621a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f40622b;

    A6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.E0 e02) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f40622b = appMeasurementDynamiteService;
        this.f40621a = e02;
    }

    @Override // j9.InterfaceC5343A
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f40621a.L(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            X2 x22 = this.f40622b.f40623a;
            if (x22 != null) {
                x22.a().r().b("Event listener threw exception", e10);
            }
        }
    }
}
