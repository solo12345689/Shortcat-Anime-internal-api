package F2;

import F2.t;
import M2.D;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface t {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f6268a;

        /* JADX INFO: renamed from: b */
        public final D.b f6269b;

        /* JADX INFO: renamed from: c */
        private final CopyOnWriteArrayList f6270c;

        /* JADX INFO: renamed from: F2.t$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0071a {

            /* JADX INFO: renamed from: a */
            public Handler f6271a;

            /* JADX INFO: renamed from: b */
            public t f6272b;

            public C0071a(Handler handler, t tVar) {
                this.f6271a = handler;
                this.f6272b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, t tVar) {
            AbstractC6614a.e(handler);
            AbstractC6614a.e(tVar);
            this.f6270c.add(new C0071a(handler, tVar));
        }

        public void h() {
            for (C0071a c0071a : this.f6270c) {
                final t tVar = c0071a.f6272b;
                a0.g1(c0071a.f6271a, new Runnable() { // from class: F2.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f6266a;
                        tVar.o0(aVar.f6268a, aVar.f6269b);
                    }
                });
            }
        }

        public void i() {
            for (C0071a c0071a : this.f6270c) {
                final t tVar = c0071a.f6272b;
                a0.g1(c0071a.f6271a, new Runnable() { // from class: F2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f6262a;
                        tVar.U(aVar.f6268a, aVar.f6269b);
                    }
                });
            }
        }

        public void j() {
            for (C0071a c0071a : this.f6270c) {
                final t tVar = c0071a.f6272b;
                a0.g1(c0071a.f6271a, new Runnable() { // from class: F2.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f6264a;
                        tVar.v0(aVar.f6268a, aVar.f6269b);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C0071a c0071a : this.f6270c) {
                final t tVar = c0071a.f6272b;
                a0.g1(c0071a.f6271a, new Runnable() { // from class: F2.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f6257a;
                        tVar.u0(aVar.f6268a, aVar.f6269b, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0071a c0071a : this.f6270c) {
                final t tVar = c0071a.f6272b;
                a0.g1(c0071a.f6271a, new Runnable() { // from class: F2.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f6254a;
                        tVar.w0(aVar.f6268a, aVar.f6269b, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0071a c0071a : this.f6270c) {
                final t tVar = c0071a.f6272b;
                a0.g1(c0071a.f6271a, new Runnable() { // from class: F2.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a aVar = this.f6260a;
                        tVar.q0(aVar.f6268a, aVar.f6269b);
                    }
                });
            }
        }

        public void n(t tVar) {
            for (C0071a c0071a : this.f6270c) {
                if (c0071a.f6272b == tVar) {
                    this.f6270c.remove(c0071a);
                }
            }
        }

        public a o(int i10, D.b bVar) {
            return new a(this.f6270c, i10, bVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, D.b bVar) {
            this.f6270c = copyOnWriteArrayList;
            this.f6268a = i10;
            this.f6269b = bVar;
        }
    }

    void U(int i10, D.b bVar);

    void o0(int i10, D.b bVar);

    void q0(int i10, D.b bVar);

    void u0(int i10, D.b bVar, int i11);

    void v0(int i10, D.b bVar);

    void w0(int i10, D.b bVar, Exception exc);
}
