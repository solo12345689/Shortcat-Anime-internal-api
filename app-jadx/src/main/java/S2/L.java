package S2;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import q2.C6109x;
import q2.l0;
import t2.C6611K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface L {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(long j10);

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6109x f15662a;

        public c(Throwable th2, C6109x c6109x) {
            super(th2);
            this.f15662a = c6109x;
        }
    }

    void A(a aVar, Executor executor);

    void a();

    boolean d();

    boolean e();

    void g(long j10, long j11);

    void h(long j10);

    void i();

    void j(Surface surface, C6611K c6611k);

    void k(List list);

    boolean l(boolean z10);

    void m();

    void n();

    Surface o();

    boolean p(C6109x c6109x);

    void q();

    void r();

    boolean s(long j10, b bVar);

    void t(float f10);

    void u(int i10);

    void v();

    void w(boolean z10);

    void x(int i10, C6109x c6109x, long j10, int i11, List list);

    void y(u uVar);

    void z(boolean z10);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15661a = new C0270a();

        /* JADX INFO: renamed from: S2.L$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0270a implements a {
            C0270a() {
            }
        }

        default void a() {
        }

        default void c() {
        }

        default void d() {
        }

        default void b(l0 l0Var) {
        }
    }
}
