package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3883p5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f41496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC3890q5 f41497b;

    RunnableC3883p5(ServiceConnectionC3890q5 serviceConnectionC3890q5, ConnectionResult connectionResult) {
        this.f41496a = connectionResult;
        Objects.requireNonNull(serviceConnectionC3890q5);
        this.f41497b = serviceConnectionC3890q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3931w5 c3931w5 = this.f41497b.f41526c;
        c3931w5.O(null);
        if (this.f41496a.d() != 7777) {
            c3931w5.L();
            return;
        }
        if (c3931w5.P() == null) {
            c3931w5.Q(Executors.newScheduledThreadPool(1));
        }
        c3931w5.P().schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.n5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final C3931w5 c3931w52 = this.f41466a.f41497b.f41526c;
                c3931w52.f40611a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.o5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        c3931w52.w();
                    }
                });
            }
        }, ((Long) AbstractC3789d2.f41194a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
