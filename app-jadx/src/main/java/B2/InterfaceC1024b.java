package B2;

import A2.C1004b;
import A2.C1005c;
import C2.InterfaceC1177z;
import M2.C1934y;
import M2.D;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import q2.C6071C;
import q2.C6077I;
import q2.C6078J;
import q2.C6082N;
import q2.C6083O;
import q2.C6088c;
import q2.C6101p;
import q2.C6105t;
import q2.C6109x;
import q2.InterfaceC6084P;
import s2.C6407e;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: B2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1024b {

    /* JADX INFO: renamed from: B2.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q2.Y f912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final D.b f914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final q2.Y f916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final D.b f918h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f919i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f920j;

        public a(long j10, q2.Y y10, int i10, D.b bVar, long j11, q2.Y y11, int i11, D.b bVar2, long j12, long j13) {
            this.f911a = j10;
            this.f912b = y10;
            this.f913c = i10;
            this.f914d = bVar;
            this.f915e = j11;
            this.f916f = y11;
            this.f917g = i11;
            this.f918h = bVar2;
            this.f919i = j12;
            this.f920j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f911a == aVar.f911a && this.f913c == aVar.f913c && this.f915e == aVar.f915e && this.f917g == aVar.f917g && this.f919i == aVar.f919i && this.f920j == aVar.f920j && Objects.equals(this.f912b, aVar.f912b) && Objects.equals(this.f914d, aVar.f914d) && Objects.equals(this.f916f, aVar.f916f) && Objects.equals(this.f918h, aVar.f918h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f911a), this.f912b, Integer.valueOf(this.f913c), this.f914d, Long.valueOf(this.f915e), this.f916f, Integer.valueOf(this.f917g), this.f918h, Long.valueOf(this.f919i), Long.valueOf(this.f920j));
        }
    }

    /* JADX INFO: renamed from: B2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0016b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6105t f921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f922b;

        public C0016b(C6105t c6105t, SparseArray sparseArray) {
            this.f921a = c6105t;
            SparseArray sparseArray2 = new SparseArray(c6105t.d());
            for (int i10 = 0; i10 < c6105t.d(); i10++) {
                int iC = c6105t.c(i10);
                sparseArray2.append(iC, (a) AbstractC6614a.e((a) sparseArray.get(iC)));
            }
            this.f922b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f921a.a(i10);
        }

        public int b(int i10) {
            return this.f921a.c(i10);
        }

        public a c(int i10) {
            return (a) AbstractC6614a.e((a) this.f922b.get(i10));
        }

        public int d() {
            return this.f921a.d();
        }
    }

    default void E(a aVar) {
    }

    default void h0(a aVar) {
    }

    default void j0(a aVar) {
    }

    default void k(a aVar) {
    }

    default void o0(a aVar) {
    }

    default void s0(a aVar) {
    }

    default void t(a aVar) {
    }

    default void A0(a aVar, int i10) {
    }

    default void B0(a aVar, C1004b c1004b) {
    }

    default void C(a aVar, C6077I c6077i) {
    }

    default void C0(a aVar, C6082N c6082n) {
    }

    default void F(a aVar, long j10) {
    }

    default void I(a aVar, long j10) {
    }

    default void J(a aVar, q2.d0 d0Var) {
    }

    default void K(a aVar, M2.B b10) {
    }

    default void L(a aVar, int i10) {
    }

    default void O(a aVar, C6083O c6083o) {
    }

    default void Q(a aVar, int i10) {
    }

    default void S(a aVar, C6082N c6082n) {
    }

    default void W(a aVar, float f10) {
    }

    default void Z(InterfaceC6084P interfaceC6084P, C0016b c0016b) {
    }

    default void a(a aVar, int i10) {
    }

    default void c(a aVar, Exception exc) {
    }

    default void c0(a aVar, int i10) {
    }

    default void d(a aVar, InterfaceC6084P.b bVar) {
    }

    default void d0(a aVar, boolean z10) {
    }

    default void e(a aVar, long j10) {
    }

    default void e0(a aVar, long j10) {
    }

    default void f(a aVar, M2.B b10) {
    }

    default void f0(a aVar, q2.h0 h0Var) {
    }

    default void g(a aVar, q2.l0 l0Var) {
    }

    default void g0(a aVar, C1004b c1004b) {
    }

    default void h(a aVar, int i10) {
    }

    default void i(a aVar, String str) {
    }

    default void j(a aVar, InterfaceC1177z.a aVar2) {
    }

    default void l0(a aVar, C1004b c1004b) {
    }

    default void m0(a aVar, boolean z10) {
    }

    default void n(a aVar, InterfaceC1177z.a aVar2) {
    }

    default void n0(a aVar, C6088c c6088c) {
    }

    default void o(a aVar, boolean z10) {
    }

    default void q(a aVar, String str) {
    }

    default void q0(a aVar, Exception exc) {
    }

    default void r(a aVar, Exception exc) {
    }

    default void r0(a aVar, C6407e c6407e) {
    }

    default void s(a aVar, Exception exc) {
    }

    default void t0(a aVar, C6078J c6078j) {
    }

    default void u(a aVar, boolean z10) {
    }

    default void v(a aVar, List list) {
    }

    default void v0(a aVar, C6101p c6101p) {
    }

    default void w(a aVar, int i10) {
    }

    default void w0(a aVar, C6077I c6077i) {
    }

    default void x(a aVar, boolean z10) {
    }

    default void z(a aVar, C1004b c1004b) {
    }

    default void A(a aVar, Object obj, long j10) {
    }

    default void B(a aVar, int i10, long j10) {
    }

    default void D(a aVar, boolean z10, int i10) {
    }

    default void G(a aVar, boolean z10, int i10) {
    }

    default void H(a aVar, String str, long j10) {
    }

    default void T(a aVar, long j10, int i10) {
    }

    default void X(a aVar, C1934y c1934y, M2.B b10) {
    }

    default void a0(a aVar, C1934y c1934y, M2.B b10) {
    }

    default void b(a aVar, C6071C c6071c, int i10) {
    }

    default void b0(a aVar, C1934y c1934y, M2.B b10) {
    }

    default void k0(a aVar, String str, long j10) {
    }

    default void l(a aVar, int i10, boolean z10) {
    }

    default void m(a aVar, C6109x c6109x, C1005c c1005c) {
    }

    default void p(a aVar, C6109x c6109x, C1005c c1005c) {
    }

    default void x0(a aVar, int i10, int i11) {
    }

    default void P(a aVar, String str, long j10, long j11) {
    }

    default void R(a aVar, int i10, long j10, long j11) {
    }

    default void U(a aVar, C1934y c1934y, M2.B b10, int i10) {
    }

    default void V(a aVar, int i10, int i11, boolean z10) {
    }

    default void i0(a aVar, int i10, long j10, long j11) {
    }

    default void p0(a aVar, InterfaceC6084P.e eVar, InterfaceC6084P.e eVar2, int i10) {
    }

    default void y0(a aVar, String str, long j10, long j11) {
    }

    default void N(a aVar, int i10, int i11, int i12, float f10) {
    }

    default void Y(a aVar, C1934y c1934y, M2.B b10, IOException iOException, boolean z10) {
    }
}
