package Gf;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Gf.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1609g extends AbstractC1597a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Thread f7575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1620l0 f7576e;

    public C1609g(Zd.i iVar, Thread thread, AbstractC1620l0 abstractC1620l0) {
        super(iVar, true, true);
        this.f7575d = thread;
        this.f7576e = abstractC1620l0;
    }

    public final Object U0() throws Throwable {
        AbstractC1601c.a();
        try {
            AbstractC1620l0 abstractC1620l0 = this.f7576e;
            if (abstractC1620l0 != null) {
                AbstractC1620l0.h2(abstractC1620l0, false, 1, null);
            }
            while (true) {
                try {
                    AbstractC1620l0 abstractC1620l02 = this.f7576e;
                    long jK2 = abstractC1620l02 != null ? abstractC1620l02.k2() : Long.MAX_VALUE;
                    if (j()) {
                        break;
                    }
                    AbstractC1601c.a();
                    LockSupport.parkNanos(this, jK2);
                    if (Thread.interrupted()) {
                        x(new InterruptedException());
                    }
                } catch (Throwable th2) {
                    AbstractC1620l0 abstractC1620l03 = this.f7576e;
                    if (abstractC1620l03 != null) {
                        AbstractC1620l0.c2(abstractC1620l03, false, 1, null);
                    }
                    throw th2;
                }
            }
            AbstractC1620l0 abstractC1620l04 = this.f7576e;
            if (abstractC1620l04 != null) {
                AbstractC1620l0.c2(abstractC1620l04, false, 1, null);
            }
            AbstractC1601c.a();
            Object objH = J0.h(e0());
            C c10 = objH instanceof C ? (C) objH : null;
            if (c10 == null) {
                return objH;
            }
            throw c10.f7489a;
        } catch (Throwable th3) {
            AbstractC1601c.a();
            throw th3;
        }
    }

    @Override // Gf.I0
    protected boolean n0() {
        return true;
    }

    @Override // Gf.I0
    protected void t(Object obj) {
        if (AbstractC5504s.c(Thread.currentThread(), this.f7575d)) {
            return;
        }
        Thread thread = this.f7575d;
        AbstractC1601c.a();
        LockSupport.unpark(thread);
    }
}
