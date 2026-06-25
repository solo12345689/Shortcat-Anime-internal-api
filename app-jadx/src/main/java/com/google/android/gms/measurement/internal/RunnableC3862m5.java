package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3862m5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC3890q5 f41435a;

    RunnableC3862m5(ServiceConnectionC3890q5 serviceConnectionC3890q5) {
        Objects.requireNonNull(serviceConnectionC3890q5);
        this.f41435a = serviceConnectionC3890q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3931w5 c3931w5 = this.f41435a.f41526c;
        X2 x22 = c3931w5.f40611a;
        Context contextD = x22.d();
        x22.c();
        c3931w5.K(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
