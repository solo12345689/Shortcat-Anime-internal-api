package S2;

import A2.C1004b;
import A2.C1005c;
import S2.K;
import android.os.Handler;
import android.os.SystemClock;
import q2.C6109x;
import q2.l0;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface K {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f15659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final K f15660b;

        public a(Handler handler, K k10) {
            this.f15659a = k10 != null ? (Handler) AbstractC6614a.e(handler) : null;
            this.f15660b = k10;
        }

        public static /* synthetic */ void d(a aVar, C1004b c1004b) {
            aVar.getClass();
            c1004b.c();
            ((K) a0.l(aVar.f15660b)).o(c1004b);
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f15659a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: S2.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((K) a0.l(this.f15633a.f15660b)).i(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f15659a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: S2.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((K) a0.l(this.f15644a.f15660b)).h(str);
                    }
                });
            }
        }

        public void m(final C1004b c1004b) {
            c1004b.c();
            Handler handler = this.f15659a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: S2.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.a.d(this.f15657a, c1004b);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f15659a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: S2.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((K) a0.l(this.f15646a.f15660b)).v(i10, j10);
                    }
                });
            }
        }

        public void o(final C1004b c1004b) {
            Handler handler = this.f15659a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: S2.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((K) a0.l(this.f15652a.f15660b)).s(c1004b);
                    }
                });
            }
        }

        public void p(final C6109x c6109x, final C1005c c1005c) {
            Handler handler = this.f15659a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: S2.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((K) a0.l(this.f15654a.f15660b)).m(c6109x, c1005c);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f15659a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f15659a.post(new Runnable() { // from class: S2.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((K) a0.l(this.f15639a.f15660b)).x(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j10, final int i10) {
            Handler handler = this.f15659a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: S2.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((K) a0.l(this.f15649a.f15660b)).B(j10, i10);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f15659a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: S2.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((K) a0.l(this.f15642a.f15660b)).r(exc);
                    }
                });
            }
        }

        public void t(final l0 l0Var) {
            Handler handler = this.f15659a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: S2.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((K) a0.l(this.f15637a.f15660b)).b(l0Var);
                    }
                });
            }
        }
    }

    void B(long j10, int i10);

    void b(l0 l0Var);

    void h(String str);

    void i(String str, long j10, long j11);

    void m(C6109x c6109x, C1005c c1005c);

    void o(C1004b c1004b);

    void r(Exception exc);

    void s(C1004b c1004b);

    void v(int i10, long j10);

    void x(Object obj, long j10);
}
