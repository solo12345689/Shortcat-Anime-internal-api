package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class S3 implements G0 {

    /* JADX INFO: renamed from: a */
    final WeakReference f40409a;

    /* JADX INFO: renamed from: b */
    private final N3 f40410b = new R3(this);

    S3(O3 o32) {
        this.f40409a = new WeakReference(o32);
    }

    final boolean a(Object obj) {
        return this.f40410b.c(obj);
    }

    final boolean b(Throwable th2) {
        V1 v12 = new V1(th2);
        H0 h02 = N3.f40234f;
        N3 n32 = this.f40410b;
        if (!h02.d(n32, null, v12)) {
            return false;
        }
        N3.b(n32);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        O3 o32 = (O3) this.f40409a.get();
        boolean zCancel = this.f40410b.cancel(z10);
        if (!zCancel || o32 == null) {
            return zCancel;
        }
        o32.a();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f40410b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f40410b.f40236a instanceof C3670g1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40410b.isDone();
    }

    @Override // com.google.android.gms.internal.play_billing.G0
    public final void p(Runnable runnable, Executor executor) {
        this.f40410b.p(runnable, executor);
    }

    public final String toString() {
        return this.f40410b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f40410b.get(j10, timeUnit);
    }
}
