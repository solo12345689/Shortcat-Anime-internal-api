package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3841j6 implements j9.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.E0 f41391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f41392b;

    C3841j6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.E0 e02) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f41392b = appMeasurementDynamiteService;
        this.f41391a = e02;
    }

    @Override // j9.z
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f41391a.L(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            X2 x22 = this.f41392b.f40623a;
            if (x22 != null) {
                x22.a().r().b("Event interceptor threw exception", e10);
            }
        }
    }
}
