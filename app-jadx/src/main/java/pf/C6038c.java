package pf;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pf.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6038c extends C6039d {

    /* JADX INFO: renamed from: c */
    private final Runnable f56040c;

    /* JADX INFO: renamed from: d */
    private final Function1 f56041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6038c(Lock lock, Runnable checkCancelled, Function1 interruptedExceptionHandler) {
        super(lock);
        AbstractC5504s.h(lock, "lock");
        AbstractC5504s.h(checkCancelled, "checkCancelled");
        AbstractC5504s.h(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f56040c = checkCancelled;
        this.f56041d = interruptedExceptionHandler;
    }

    @Override // pf.C6039d, pf.InterfaceC6046k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f56040c.run();
            } catch (InterruptedException e10) {
                this.f56041d.invoke(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6038c(Runnable checkCancelled, Function1 interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        AbstractC5504s.h(checkCancelled, "checkCancelled");
        AbstractC5504s.h(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
