package androidx.media3.exoplayer;

import B2.K1;
import M2.D;
import androidx.media3.exoplayer.L0;
import q2.C6109x;
import t2.InterfaceC6623j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface N0 extends L0.b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a();

        void b();
    }

    boolean A();

    void D(q2.Y y10);

    default long E(long j10, long j11) {
        if (getState() == 1) {
            return (isReady() || d()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    O0 G();

    M2.c0 M();

    long N();

    void O(long j10);

    A2.L P();

    void a();

    boolean d();

    void disable();

    int f();

    void g(long j10, long j11);

    String getName();

    int getState();

    boolean i();

    boolean isReady();

    void j(A2.N n10, C6109x[] c6109xArr, M2.c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12, D.b bVar);

    void n();

    void p(C6109x[] c6109xArr, M2.c0 c0Var, long j10, long j11, D.b bVar);

    void reset();

    void start();

    void stop();

    void w(int i10, K1 k12, InterfaceC6623j interfaceC6623j);

    void x();

    default void m() {
    }

    default void J(float f10, float f11) {
    }
}
