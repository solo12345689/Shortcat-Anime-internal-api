package Gf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class A0 extends H0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7480f = AtomicIntegerFieldUpdater.newUpdater(A0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f7481e;

    public A0(Function1 function1) {
        this.f7481e = function1;
    }

    @Override // Gf.H0
    public boolean v() {
        return true;
    }

    @Override // Gf.H0
    public void w(Throwable th2) {
        if (f7480f.compareAndSet(this, 0, 1)) {
            this.f7481e.invoke(th2);
        }
    }
}
