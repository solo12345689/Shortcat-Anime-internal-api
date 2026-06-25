package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class A0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Future f40130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC3759z0 f40131b;

    A0(Future future, InterfaceC3759z0 interfaceC3759z0) {
        this.f40130a = future;
        this.f40131b = interfaceC3759z0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thA;
        Future future = this.f40130a;
        if ((future instanceof N0) && (thA = O0.a((N0) future)) != null) {
            this.f40131b.zza(thA);
            return;
        }
        try {
            if (!future.isDone()) {
                throw new IllegalStateException(D.a("Future was expected to be done: %s", future));
            }
            boolean z10 = false;
            Future future2 = future;
            while (true) {
                try {
                    obj = future2.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    future2 = future2;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.f40131b.a(obj);
        } catch (ExecutionException e10) {
            this.f40131b.zza(e10.getCause());
        } catch (Throwable th3) {
            this.f40131b.zza(th3);
        }
    }

    public final String toString() {
        C3746w c3746wA = AbstractC3754y.a(this);
        c3746wA.a(this.f40131b);
        return c3746wA.toString();
    }
}
