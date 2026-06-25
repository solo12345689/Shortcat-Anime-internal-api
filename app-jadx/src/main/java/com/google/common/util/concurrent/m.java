package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class m implements p {

    /* JADX INFO: renamed from: b */
    static final p f43169b = new m(null);

    /* JADX INFO: renamed from: c */
    private static final o f43170c = new o(m.class);

    /* JADX INFO: renamed from: a */
    private final Object f43171a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends a.j {
        a(Throwable th2) {
            G(th2);
        }
    }

    m(Object obj) {
        this.f43171a = obj;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f43171a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.p
    public void k(Runnable runnable, Executor executor) {
        O9.n.k(runnable, "Runnable was null.");
        O9.n.k(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f43170c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f43171a + "]]";
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        O9.n.j(timeUnit);
        return get();
    }
}
