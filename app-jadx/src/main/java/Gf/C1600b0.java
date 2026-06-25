package Gf;

import Lf.AbstractC1903j;
import ae.AbstractC2605b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Gf.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1600b0 extends Lf.A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7551e = AtomicIntegerFieldUpdater.newUpdater(C1600b0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C1600b0(Zd.i iVar, Zd.e eVar) {
        super(iVar, eVar);
    }

    private final boolean X0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7551e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f7551e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean Y0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7551e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f7551e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // Lf.A, Gf.AbstractC1597a
    protected void Q0(Object obj) {
        if (X0()) {
            return;
        }
        AbstractC1903j.b(AbstractC2605b.c(this.f11545d), E.a(obj, this.f11545d));
    }

    public final Object V0() {
        if (Y0()) {
            return AbstractC2605b.f();
        }
        Object objH = J0.h(e0());
        if (objH instanceof C) {
            throw ((C) objH).f7489a;
        }
        return objH;
    }

    @Override // Lf.A, Gf.I0
    protected void t(Object obj) {
        Q0(obj);
    }
}
