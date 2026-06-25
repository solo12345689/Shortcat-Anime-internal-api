package M2;

import M2.D;
import M2.L;
import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface L {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f11689a;

        /* JADX INFO: renamed from: b */
        public final D.b f11690b;

        /* JADX INFO: renamed from: c */
        private final CopyOnWriteArrayList f11691c;

        /* JADX INFO: renamed from: M2.L$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0182a {

            /* JADX INFO: renamed from: a */
            public Handler f11692a;

            /* JADX INFO: renamed from: b */
            public L f11693b;

            public C0182a(Handler handler, L l10) {
                this.f11692a = handler;
                this.f11693b = l10;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a A(int i10, D.b bVar) {
            return new a(this.f11691c, i10, bVar);
        }

        public void h(Handler handler, L l10) {
            AbstractC6614a.e(handler);
            AbstractC6614a.e(l10);
            this.f11691c.add(new C0182a(handler, l10));
        }

        public void i(final InterfaceC6627n interfaceC6627n) {
            for (C0182a c0182a : this.f11691c) {
                final L l10 = c0182a.f11693b;
                t2.a0.g1(c0182a.f11692a, new Runnable() { // from class: M2.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC6627n.accept(l10);
                    }
                });
            }
        }

        public void j(int i10, C6109x c6109x, int i11, Object obj, long j10) {
            k(new B(1, i10, c6109x, i11, obj, t2.a0.F1(j10), -9223372036854775807L));
        }

        public void k(final B b10) {
            i(new InterfaceC6627n() { // from class: M2.E
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    L.a aVar = this.f11667a;
                    ((L) obj).j0(aVar.f11689a, aVar.f11690b, b10);
                }
            });
        }

        public void l(C1934y c1934y, int i10) {
            m(c1934y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void m(C1934y c1934y, int i10, int i11, C6109x c6109x, int i12, Object obj, long j10, long j11) {
            n(c1934y, new B(i10, i11, c6109x, i12, obj, t2.a0.F1(j10), t2.a0.F1(j11)));
        }

        public void n(final C1934y c1934y, final B b10) {
            i(new InterfaceC6627n() { // from class: M2.I
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    L.a aVar = this.f11681a;
                    ((L) obj).a0(aVar.f11689a, aVar.f11690b, c1934y, b10);
                }
            });
        }

        public void o(C1934y c1934y, int i10) {
            p(c1934y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void p(C1934y c1934y, int i10, int i11, C6109x c6109x, int i12, Object obj, long j10, long j11) {
            q(c1934y, new B(i10, i11, c6109x, i12, obj, t2.a0.F1(j10), t2.a0.F1(j11)));
        }

        public void q(final C1934y c1934y, final B b10) {
            i(new InterfaceC6627n() { // from class: M2.G
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    L.a aVar = this.f11673a;
                    ((L) obj).i0(aVar.f11689a, aVar.f11690b, c1934y, b10);
                }
            });
        }

        public void r(C1934y c1934y, int i10, int i11, C6109x c6109x, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            t(c1934y, new B(i10, i11, c6109x, i12, obj, t2.a0.F1(j10), t2.a0.F1(j11)), iOException, z10);
        }

        public void s(C1934y c1934y, int i10, IOException iOException, boolean z10) {
            r(c1934y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void t(final C1934y c1934y, final B b10, final IOException iOException, final boolean z10) {
            i(new InterfaceC6627n() { // from class: M2.H
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    L.a aVar = this.f11676a;
                    ((L) obj).G(aVar.f11689a, aVar.f11690b, c1934y, b10, iOException, z10);
                }
            });
        }

        public void u(C1934y c1934y, int i10, int i11) {
            v(c1934y, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i11);
        }

        public void v(C1934y c1934y, int i10, int i11, C6109x c6109x, int i12, Object obj, long j10, long j11, int i13) {
            w(c1934y, new B(i10, i11, c6109x, i12, obj, t2.a0.F1(j10), t2.a0.F1(j11)), i13);
        }

        public void w(final C1934y c1934y, final B b10, final int i10) {
            i(new InterfaceC6627n() { // from class: M2.F
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    L.a aVar = this.f11669a;
                    ((L) obj).O(aVar.f11689a, aVar.f11690b, c1934y, b10, i10);
                }
            });
        }

        public void x(L l10) {
            for (C0182a c0182a : this.f11691c) {
                if (c0182a.f11693b == l10) {
                    this.f11691c.remove(c0182a);
                }
            }
        }

        public void y(int i10, long j10, long j11) {
            z(new B(1, i10, null, 3, null, t2.a0.F1(j10), t2.a0.F1(j11)));
        }

        public void z(final B b10) {
            final D.b bVar = (D.b) AbstractC6614a.e(this.f11690b);
            i(new InterfaceC6627n() { // from class: M2.J
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    L l10 = (L) obj;
                    l10.x0(this.f11684a.f11689a, bVar, b10);
                }
            });
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, D.b bVar) {
            this.f11691c = copyOnWriteArrayList;
            this.f11689a = i10;
            this.f11690b = bVar;
        }
    }

    void G(int i10, D.b bVar, C1934y c1934y, B b10, IOException iOException, boolean z10);

    void O(int i10, D.b bVar, C1934y c1934y, B b10, int i11);

    void a0(int i10, D.b bVar, C1934y c1934y, B b10);

    void i0(int i10, D.b bVar, C1934y c1934y, B b10);

    void j0(int i10, D.b bVar, B b10);

    void x0(int i10, D.b bVar, B b10);
}
