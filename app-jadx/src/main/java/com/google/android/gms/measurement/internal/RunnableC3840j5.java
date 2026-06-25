package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3840j5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentName f41389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC3890q5 f41390b;

    RunnableC3840j5(ServiceConnectionC3890q5 serviceConnectionC3890q5, ComponentName componentName) {
        this.f41389a = componentName;
        Objects.requireNonNull(serviceConnectionC3890q5);
        this.f41390b = serviceConnectionC3890q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41390b.f41526c.K(this.f41389a);
    }
}
