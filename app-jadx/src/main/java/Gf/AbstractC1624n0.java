package Gf;

import Gf.AbstractC1622m0;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: Gf.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1624n0 extends AbstractC1620l0 {
    protected abstract Thread n2();

    protected void o2(long j10, AbstractC1622m0.c cVar) {
        U.f7538i.C2(j10, cVar);
    }

    protected final void p2() {
        Thread threadN2 = n2();
        if (Thread.currentThread() != threadN2) {
            AbstractC1601c.a();
            LockSupport.unpark(threadN2);
        }
    }
}
