package C2;

import A2.C1004b;
import A2.C1005c;
import C2.InterfaceC1176y;
import C2.InterfaceC1177z;
import android.os.Handler;
import q2.C6109x;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: C2.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1176y {

    /* JADX INFO: renamed from: C2.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f2796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC1176y f2797b;

        public a(Handler handler, InterfaceC1176y interfaceC1176y) {
            this.f2796a = interfaceC1176y != null ? (Handler) AbstractC6614a.e(handler) : null;
            this.f2797b = interfaceC1176y;
        }

        public static /* synthetic */ void d(a aVar, C1004b c1004b) {
            aVar.getClass();
            c1004b.c();
            ((InterfaceC1176y) t2.a0.l(aVar.f2797b)).w(c1004b);
        }

        public void n(final Exception exc) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2765a.f2797b)).y(exc);
                    }
                });
            }
        }

        public void o(final int i10) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2771a.f2797b)).d(i10);
                    }
                });
            }
        }

        public void p(final Exception exc) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2781a.f2797b)).g(exc);
                    }
                });
            }
        }

        public void q(final InterfaceC1177z.a aVar) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2769a.f2797b)).e(aVar);
                    }
                });
            }
        }

        public void r(final InterfaceC1177z.a aVar) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2794a.f2797b)).c(aVar);
                    }
                });
            }
        }

        public void s(final String str, final long j10, final long j11) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2773a.f2797b)).k(str, j10, j11);
                    }
                });
            }
        }

        public void t(final String str) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2777a.f2797b)).j(str);
                    }
                });
            }
        }

        public void u(final C1004b c1004b) {
            c1004b.c();
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1176y.a.d(this.f2786a, c1004b);
                    }
                });
            }
        }

        public void v(final C1004b c1004b) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2779a.f2797b)).u(c1004b);
                    }
                });
            }
        }

        public void w(final C6109x c6109x, final C1005c c1005c) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2783a.f2797b)).l(c6109x, c1005c);
                    }
                });
            }
        }

        public void x(final long j10) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2788a.f2797b)).q(j10);
                    }
                });
            }
        }

        public void y(final boolean z10) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2767a.f2797b)).f(z10);
                    }
                });
            }
        }

        public void z(final int i10, final long j10, final long j11) {
            Handler handler = this.f2796a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: C2.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1176y) t2.a0.l(this.f2790a.f2797b)).A(i10, j10, j11);
                    }
                });
            }
        }
    }

    void A(int i10, long j10, long j11);

    void c(InterfaceC1177z.a aVar);

    void d(int i10);

    void e(InterfaceC1177z.a aVar);

    void f(boolean z10);

    void g(Exception exc);

    void j(String str);

    void k(String str, long j10, long j11);

    void l(C6109x c6109x, C1005c c1005c);

    void q(long j10);

    void u(C1004b c1004b);

    void w(C1004b c1004b);

    void y(Exception exc);
}
