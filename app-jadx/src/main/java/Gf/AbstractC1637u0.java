package Gf;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: Gf.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1637u0 {
    public static final Executor a(K k10) {
        Executor executorB2;
        AbstractC1633s0 abstractC1633s0 = k10 instanceof AbstractC1633s0 ? (AbstractC1633s0) k10 : null;
        return (abstractC1633s0 == null || (executorB2 = abstractC1633s0.b2()) == null) ? new ExecutorC1606e0(k10) : executorB2;
    }

    public static final K b(Executor executor) {
        K k10;
        ExecutorC1606e0 executorC1606e0 = executor instanceof ExecutorC1606e0 ? (ExecutorC1606e0) executor : null;
        return (executorC1606e0 == null || (k10 = executorC1606e0.f7569a) == null) ? new C1635t0(executor) : k10;
    }

    public static final AbstractC1633s0 c(ExecutorService executorService) {
        return new C1635t0(executorService);
    }
}
