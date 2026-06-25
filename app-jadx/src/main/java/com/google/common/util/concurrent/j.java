package com.google.common.util.concurrent;

import com.google.common.util.concurrent.m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends l {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future f43167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final i f43168b;

        a(Future future, i iVar) {
            this.f43167a = future;
            this.f43168b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Object obj = this.f43167a;
            if ((obj instanceof T9.a) && (thA = T9.b.a((T9.a) obj)) != null) {
                this.f43168b.a(thA);
                return;
            }
            try {
                this.f43168b.onSuccess(j.b(this.f43167a));
            } catch (ExecutionException e10) {
                this.f43168b.a(e10.getCause());
            } catch (Throwable th2) {
                this.f43168b.a(th2);
            }
        }

        public String toString() {
            return O9.h.b(this).c(this.f43168b).toString();
        }
    }

    public static void a(p pVar, i iVar, Executor executor) {
        O9.n.j(iVar);
        pVar.k(new a(pVar, iVar), executor);
    }

    public static Object b(Future future) {
        O9.n.r(future.isDone(), "Future was expected to be done: %s", future);
        return y.a(future);
    }

    public static p c(Throwable th2) {
        O9.n.j(th2);
        return new m.a(th2);
    }

    public static p d(Object obj) {
        return obj == null ? m.f43169b : new m(obj);
    }

    public static p e() {
        return m.f43169b;
    }

    public static p f(p pVar, d dVar, Executor executor) {
        return c.J(pVar, dVar, executor);
    }
}
