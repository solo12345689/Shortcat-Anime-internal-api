package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class E0 implements G0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final F0 f40147b = new F0(E0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40148a;

    E0(Object obj) {
        this.f40148a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f40148a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.G0
    public final void p(Runnable runnable, Executor executor) {
        A.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f40147b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    public final String toString() {
        Object obj = this.f40148a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f40148a;
    }
}
