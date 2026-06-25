package Lf;

import Gf.Q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class B extends AbstractC1896c implements Q0 {

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f11546d = AtomicIntegerFieldUpdater.newUpdater(B.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    public final long f11547c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public B(long j10, B b10, int i10) {
        super(b10);
        this.f11547c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // Lf.AbstractC1896c
    public boolean k() {
        return f11546d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f11546d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th2, Zd.i iVar);

    public final void t() {
        if (f11546d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11546d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
