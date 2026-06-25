package E3;

import E3.A;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class D extends com.google.common.util.concurrent.a implements A.b {

    /* JADX INFO: renamed from: h */
    private final Handler f4396h;

    /* JADX INFO: renamed from: i */
    private A f4397i;

    /* JADX INFO: renamed from: j */
    private boolean f4398j;

    public D(Looper looper) {
        this.f4396h = new Handler(looper);
    }

    public static /* synthetic */ void K(D d10, A a10) {
        if (d10.isCancelled()) {
            a10.a();
        }
    }

    private void L() {
        G(new SecurityException("Session rejected the connection request."));
    }

    private void M() {
        A a10 = this.f4397i;
        if (a10 == null || !this.f4398j) {
            return;
        }
        F(a10);
    }

    public void N(final A a10) {
        this.f4397i = a10;
        M();
        k(new Runnable() { // from class: E3.B
            @Override // java.lang.Runnable
            public final void run() {
                D.K(this.f4328a, a10);
            }
        }, new Executor() { // from class: E3.C
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                t2.a0.g1(this.f4382a.f4396h, runnable);
            }
        });
    }

    @Override // E3.A.b
    public void a() {
        L();
    }

    @Override // E3.A.b
    public void b() {
        this.f4398j = true;
        M();
    }
}
