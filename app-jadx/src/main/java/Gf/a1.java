package Gf;

import Td.C2160k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class a1 extends H0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7548g = AtomicIntegerFieldUpdater.newUpdater(a1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Thread f7549e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC1612h0 f7550f;

    private final Void A(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void B(C0 c02) {
        int i10;
        this.f7550f = G0.m(c02, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7548g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new C2160k();
            }
        } while (!f7548g.compareAndSet(this, i10, 0));
    }

    @Override // Gf.H0
    public boolean v() {
        return true;
    }

    @Override // Gf.H0
    public void w(Throwable th2) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7548g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new C2160k();
            }
        } while (!f7548g.compareAndSet(this, i10, 2));
        this.f7549e.interrupt();
        f7548g.set(this, 3);
    }

    public final void y() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7548g;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        A(i10);
                        throw new C2160k();
                    }
                }
            } else if (f7548g.compareAndSet(this, i10, 1)) {
                InterfaceC1612h0 interfaceC1612h0 = this.f7550f;
                if (interfaceC1612h0 != null) {
                    interfaceC1612h0.dispose();
                    return;
                }
                return;
            }
        }
    }
}
