package n9;

import R8.AbstractC2115p;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static Object a(i iVar) throws InterruptedException {
        AbstractC2115p.j();
        AbstractC2115p.h();
        AbstractC2115p.m(iVar, "Task must not be null");
        if (iVar.n()) {
            return g(iVar);
        }
        m mVar = new m(null);
        h(iVar, mVar);
        mVar.b();
        return g(iVar);
    }

    public static Object b(i iVar, long j10, TimeUnit timeUnit) throws TimeoutException {
        AbstractC2115p.j();
        AbstractC2115p.h();
        AbstractC2115p.m(iVar, "Task must not be null");
        AbstractC2115p.m(timeUnit, "TimeUnit must not be null");
        if (iVar.n()) {
            return g(iVar);
        }
        m mVar = new m(null);
        h(iVar, mVar);
        if (mVar.c(j10, timeUnit)) {
            return g(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static i c(Callable callable) {
        return d(k.f54018a, callable);
    }

    public static i d(Executor executor, Callable callable) {
        AbstractC2115p.m(executor, "Executor must not be null");
        AbstractC2115p.m(callable, "Callback must not be null");
        G g10 = new G();
        executor.execute(new H(g10, callable));
        return g10;
    }

    public static i e(Exception exc) {
        G g10 = new G();
        g10.t(exc);
        return g10;
    }

    public static i f(Object obj) {
        G g10 = new G();
        g10.r(obj);
        return g10;
    }

    private static Object g(i iVar) throws ExecutionException {
        if (iVar.o()) {
            return iVar.k();
        }
        if (iVar.m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.j());
    }

    private static void h(i iVar, n nVar) {
        Executor executor = k.f54019b;
        iVar.f(executor, nVar);
        iVar.d(executor, nVar);
        iVar.a(executor, nVar);
    }
}
