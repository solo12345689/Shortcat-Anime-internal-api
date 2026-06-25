package com.google.android.gms.measurement.internal;

import j9.InterfaceC5347d;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3855l5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5347d f41416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC3890q5 f41417b;

    RunnableC3855l5(ServiceConnectionC3890q5 serviceConnectionC3890q5, InterfaceC5347d interfaceC5347d) {
        this.f41416a = interfaceC5347d;
        Objects.requireNonNull(serviceConnectionC3890q5);
        this.f41417b = serviceConnectionC3890q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC3890q5 serviceConnectionC3890q5 = this.f41417b;
        synchronized (serviceConnectionC3890q5) {
            try {
                serviceConnectionC3890q5.f(false);
                C3931w5 c3931w5 = serviceConnectionC3890q5.f41526c;
                if (!c3931w5.W()) {
                    c3931w5.f40611a.a().v().a("Connected to remote service");
                    c3931w5.z(this.f41416a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C3931w5 c3931w52 = this.f41417b.f41526c;
        if (c3931w52.P() != null) {
            c3931w52.P().shutdownNow();
            c3931w52.Q(null);
        }
    }
}
