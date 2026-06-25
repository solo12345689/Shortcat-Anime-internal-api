package B2;

import A2.C1004b;
import A2.C1005c;
import B2.InterfaceC1024b;
import C2.InterfaceC1177z;
import M2.C1934y;
import M2.D;
import P9.AbstractC2011u;
import P9.AbstractC2012v;
import P9.AbstractC2014x;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.exoplayer.C2907s;
import com.adjust.sdk.network.ErrorCodes;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
import q2.Y;
import s2.C6407e;
import t2.AbstractC6614a;
import t2.C6634v;
import t2.InterfaceC6623j;
import t2.InterfaceC6631s;

/* JADX INFO: renamed from: B2.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C1078x0 implements InterfaceC1021a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6623j f1020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y.b f1021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y.d f1022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f1023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f1024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C6634v f1025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC6084P f1026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC6631s f1027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1028i;

    /* JADX INFO: renamed from: B2.x0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Y.b f1029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AbstractC2011u f1030b = AbstractC2011u.A();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AbstractC2012v f1031c = AbstractC2012v.k();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private D.b f1032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private D.b f1033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private D.b f1034f;

        public a(Y.b bVar) {
            this.f1029a = bVar;
        }

        private void b(AbstractC2012v.a aVar, D.b bVar, q2.Y y10) {
            if (bVar == null) {
                return;
            }
            if (y10.f(bVar.f11662a) != -1) {
                aVar.f(bVar, y10);
                return;
            }
            q2.Y y11 = (q2.Y) this.f1031c.get(bVar);
            if (y11 != null) {
                aVar.f(bVar, y11);
            }
        }

        private static D.b c(InterfaceC6084P interfaceC6084P, AbstractC2011u abstractC2011u, D.b bVar, Y.b bVar2) {
            q2.Y yH0 = interfaceC6084P.h0();
            int iU0 = interfaceC6084P.u0();
            Object objQ = yH0.u() ? null : yH0.q(iU0);
            int iE = (interfaceC6084P.D() || yH0.u()) ? -1 : yH0.j(iU0, bVar2).e(t2.a0.V0(interfaceC6084P.getCurrentPosition()) - bVar2.o());
            for (int i10 = 0; i10 < abstractC2011u.size(); i10++) {
                D.b bVar3 = (D.b) abstractC2011u.get(i10);
                if (i(bVar3, objQ, interfaceC6084P.D(), interfaceC6084P.c0(), interfaceC6084P.B0(), iE)) {
                    return bVar3;
                }
            }
            if (abstractC2011u.isEmpty() && bVar != null && i(bVar, objQ, interfaceC6084P.D(), interfaceC6084P.c0(), interfaceC6084P.B0(), iE)) {
                return bVar;
            }
            return null;
        }

        private static boolean i(D.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f11662a.equals(obj)) {
                return false;
            }
            if (z10 && bVar.f11663b == i10 && bVar.f11664c == i11) {
                return true;
            }
            return !z10 && bVar.f11663b == -1 && bVar.f11666e == i12;
        }

        private void m(q2.Y y10) {
            AbstractC2012v.a aVarA = AbstractC2012v.a();
            if (this.f1030b.isEmpty()) {
                b(aVarA, this.f1033e, y10);
                if (!Objects.equals(this.f1034f, this.f1033e)) {
                    b(aVarA, this.f1034f, y10);
                }
                if (!Objects.equals(this.f1032d, this.f1033e) && !Objects.equals(this.f1032d, this.f1034f)) {
                    b(aVarA, this.f1032d, y10);
                }
            } else {
                for (int i10 = 0; i10 < this.f1030b.size(); i10++) {
                    b(aVarA, (D.b) this.f1030b.get(i10), y10);
                }
                if (!this.f1030b.contains(this.f1032d)) {
                    b(aVarA, this.f1032d, y10);
                }
            }
            this.f1031c = aVarA.c();
        }

        public D.b d() {
            return this.f1032d;
        }

        public D.b e() {
            if (this.f1030b.isEmpty()) {
                return null;
            }
            return (D.b) AbstractC2014x.d(this.f1030b);
        }

        public q2.Y f(D.b bVar) {
            return (q2.Y) this.f1031c.get(bVar);
        }

        public D.b g() {
            return this.f1033e;
        }

        public D.b h() {
            return this.f1034f;
        }

        public void j(InterfaceC6084P interfaceC6084P) {
            this.f1032d = c(interfaceC6084P, this.f1030b, this.f1033e, this.f1029a);
        }

        public void k(List list, D.b bVar, InterfaceC6084P interfaceC6084P) {
            this.f1030b = AbstractC2011u.w(list);
            if (!list.isEmpty()) {
                this.f1033e = (D.b) list.get(0);
                this.f1034f = (D.b) AbstractC6614a.e(bVar);
            }
            if (this.f1032d == null) {
                this.f1032d = c(interfaceC6084P, this.f1030b, this.f1033e, this.f1029a);
            }
            m(interfaceC6084P.h0());
        }

        public void l(InterfaceC6084P interfaceC6084P) {
            this.f1032d = c(interfaceC6084P, this.f1030b, this.f1033e, this.f1029a);
            m(interfaceC6084P.h0());
        }
    }

    public C1078x0(InterfaceC6623j interfaceC6623j) {
        this.f1020a = (InterfaceC6623j) AbstractC6614a.e(interfaceC6623j);
        this.f1025f = new C6634v(t2.a0.Z(), interfaceC6623j, new C6634v.b() { // from class: B2.t
            @Override // t2.C6634v.b
            public final void a(Object obj, C6105t c6105t) {
                C1078x0.O1((InterfaceC1024b) obj, c6105t);
            }
        });
        Y.b bVar = new Y.b();
        this.f1021b = bVar;
        this.f1022c = new Y.d();
        this.f1023d = new a(bVar);
        this.f1024e = new SparseArray();
    }

    public static /* synthetic */ void C0(InterfaceC1024b.a aVar, int i10, InterfaceC1024b interfaceC1024b) {
        interfaceC1024b.s0(aVar);
        interfaceC1024b.a(aVar, i10);
    }

    public static /* synthetic */ void E0(InterfaceC1024b.a aVar, String str, long j10, long j11, InterfaceC1024b interfaceC1024b) {
        interfaceC1024b.H(aVar, str, j10);
        interfaceC1024b.y0(aVar, str, j11, j10);
    }

    public static /* synthetic */ void N0(InterfaceC1024b.a aVar, q2.l0 l0Var, InterfaceC1024b interfaceC1024b) {
        interfaceC1024b.g(aVar, l0Var);
        interfaceC1024b.N(aVar, l0Var.f56923a, l0Var.f56924b, 0, l0Var.f56926d);
    }

    public static /* synthetic */ void O0(InterfaceC1024b.a aVar, C1934y c1934y, M2.B b10, int i10, InterfaceC1024b interfaceC1024b) {
        interfaceC1024b.b0(aVar, c1934y, b10);
        interfaceC1024b.U(aVar, c1934y, b10, i10);
    }

    private InterfaceC1024b.a U1(D.b bVar) {
        AbstractC6614a.e(this.f1026g);
        q2.Y yF = bVar == null ? null : this.f1023d.f(bVar);
        if (bVar != null && yF != null) {
            return V1(yF, yF.l(bVar.f11662a, this.f1021b).f56653c, bVar);
        }
        int iK0 = this.f1026g.K0();
        q2.Y yH0 = this.f1026g.h0();
        if (iK0 >= yH0.t()) {
            yH0 = q2.Y.f56642a;
        }
        return V1(yH0, iK0, null);
    }

    private InterfaceC1024b.a W1() {
        return U1(this.f1023d.e());
    }

    private InterfaceC1024b.a X1(int i10, D.b bVar) {
        AbstractC6614a.e(this.f1026g);
        if (bVar != null) {
            return this.f1023d.f(bVar) != null ? U1(bVar) : V1(q2.Y.f56642a, i10, bVar);
        }
        q2.Y yH0 = this.f1026g.h0();
        if (i10 >= yH0.t()) {
            yH0 = q2.Y.f56642a;
        }
        return V1(yH0, i10, null);
    }

    public static /* synthetic */ void Y0(InterfaceC1024b.a aVar, String str, long j10, long j11, InterfaceC1024b interfaceC1024b) {
        interfaceC1024b.k0(aVar, str, j10);
        interfaceC1024b.P(aVar, str, j11, j10);
    }

    private InterfaceC1024b.a Y1() {
        return U1(this.f1023d.g());
    }

    private InterfaceC1024b.a Z1() {
        return U1(this.f1023d.h());
    }

    private InterfaceC1024b.a a2(C6082N c6082n) {
        D.b bVar;
        return (!(c6082n instanceof C2907s) || (bVar = ((C2907s) c6082n).f31217o) == null) ? T1() : U1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2() {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 1028, new C6634v.a() { // from class: B2.N
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).t(aVarT1);
            }
        });
        this.f1025f.i();
    }

    public static /* synthetic */ void f1(InterfaceC1024b.a aVar, boolean z10, InterfaceC1024b interfaceC1024b) {
        interfaceC1024b.o(aVar, z10);
        interfaceC1024b.d0(aVar, z10);
    }

    public static /* synthetic */ void o1(InterfaceC1024b.a aVar, int i10, InterfaceC6084P.e eVar, InterfaceC6084P.e eVar2, InterfaceC1024b interfaceC1024b) {
        interfaceC1024b.c0(aVar, i10);
        interfaceC1024b.p0(aVar, eVar, eVar2, i10);
    }

    @Override // B2.InterfaceC1021a
    public final void A(final int i10, final long j10, final long j11) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1011, new C6634v.a() { // from class: B2.m0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).i0(aVarZ1, i10, j10, j11);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void B(final long j10, final int i10) {
        final InterfaceC1024b.a aVarY1 = Y1();
        c2(aVarY1, 1021, new C6634v.a() { // from class: B2.U
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).T(aVarY1, j10, i10);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void C(final int i10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 6, new C6634v.a() { // from class: B2.l
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).h(aVarT1, i10);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void E(final C6071C c6071c, final int i10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 1, new C6634v.a() { // from class: B2.w0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).b(aVarT1, c6071c, i10);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void F(final int i10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 8, new C6634v.a() { // from class: B2.C
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).A0(aVarT1, i10);
            }
        });
    }

    @Override // M2.L
    public final void G(int i10, D.b bVar, final C1934y c1934y, final M2.B b10, final IOException iOException, final boolean z10) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, ErrorCodes.MALFORMED_URL_EXCEPTION, new C6634v.a() { // from class: B2.Q
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).Y(aVarX1, c1934y, b10, iOException, z10);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void H(final C6082N c6082n) {
        final InterfaceC1024b.a aVarA2 = a2(c6082n);
        c2(aVarA2, 10, new C6634v.a() { // from class: B2.u
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).S(aVarA2, c6082n);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void I(final InterfaceC6084P.b bVar) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 13, new C6634v.a() { // from class: B2.u0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).d(aVarT1, bVar);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void J(final int i10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 4, new C6634v.a() { // from class: B2.v
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).w(aVarT1, i10);
            }
        });
    }

    @Override // Q2.d.a
    public final void K(final int i10, final long j10, final long j11) {
        final InterfaceC1024b.a aVarW1 = W1();
        c2(aVarW1, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, new C6634v.a() { // from class: B2.l0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).R(aVarW1, i10, j10, j11);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void L() {
        if (this.f1028i) {
            return;
        }
        final InterfaceC1024b.a aVarT1 = T1();
        this.f1028i = true;
        c2(aVarT1, -1, new C6634v.a() { // from class: B2.z
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).j0(aVarT1);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void M(final boolean z10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 9, new C6634v.a() { // from class: B2.F
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).u(aVarT1, z10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void N(List list, D.b bVar) {
        this.f1023d.k(list, bVar, (InterfaceC6084P) AbstractC6614a.e(this.f1026g));
    }

    @Override // M2.L
    public final void O(int i10, D.b bVar, final C1934y c1934y, final M2.B b10, final int i11) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, 1000, new C6634v.a() { // from class: B2.L
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                C1078x0.O0(aVarX1, c1934y, b10, i11, (InterfaceC1024b) obj);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void P(final int i10, final boolean z10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 30, new C6634v.a() { // from class: B2.p
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).l(aVarT1, i10, z10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public void Q(InterfaceC1024b interfaceC1024b) {
        this.f1025f.j(interfaceC1024b);
    }

    @Override // q2.InterfaceC6084P.d
    public void R(final long j10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 16, new C6634v.a() { // from class: B2.K
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).F(aVarT1, j10);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void S(q2.Y y10, final int i10) {
        this.f1023d.l((InterfaceC6084P) AbstractC6614a.e(this.f1026g));
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 0, new C6634v.a() { // from class: B2.v0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).Q(aVarT1, i10);
            }
        });
    }

    protected final InterfaceC1024b.a T1() {
        return U1(this.f1023d.d());
    }

    @Override // F2.t
    public final void U(int i10, D.b bVar) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, 1026, new C6634v.a() { // from class: B2.n0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).h0(aVarX1);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void V(final C6077I c6077i) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 14, new C6634v.a() { // from class: B2.J
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).C(aVarT1, c6077i);
            }
        });
    }

    protected final InterfaceC1024b.a V1(q2.Y y10, int i10, D.b bVar) {
        D.b bVar2 = y10.u() ? null : bVar;
        long jC = this.f1020a.c();
        boolean z10 = y10.equals(this.f1026g.h0()) && i10 == this.f1026g.K0();
        long jC2 = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                jC2 = this.f1026g.G0();
            } else if (!y10.u()) {
                jC2 = y10.r(i10, this.f1022c).c();
            }
        } else if (z10 && this.f1026g.c0() == bVar2.f11663b && this.f1026g.B0() == bVar2.f11664c) {
            jC2 = this.f1026g.getCurrentPosition();
        }
        return new InterfaceC1024b.a(jC, y10, i10, bVar2, jC2, this.f1026g.h0(), this.f1026g.K0(), this.f1023d.d(), this.f1026g.getCurrentPosition(), this.f1026g.E());
    }

    @Override // q2.InterfaceC6084P.d
    public final void W(final int i10, final int i11) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 24, new C6634v.a() { // from class: B2.G
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).x0(aVarZ1, i10, i11);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void Z(final q2.d0 d0Var) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 19, new C6634v.a() { // from class: B2.V
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).J(aVarT1, d0Var);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public void a() {
        ((InterfaceC6631s) AbstractC6614a.i(this.f1027h)).i(new Runnable() { // from class: B2.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f803a.b2();
            }
        });
    }

    @Override // M2.L
    public final void a0(int i10, D.b bVar, final C1934y c1934y, final M2.B b10) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, new C6634v.a() { // from class: B2.W
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).X(aVarX1, c1934y, b10);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void b(final q2.l0 l0Var) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 25, new C6634v.a() { // from class: B2.d0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                C1078x0.N0(aVarZ1, l0Var, (InterfaceC1024b) obj);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void b0(final boolean z10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 3, new C6634v.a() { // from class: B2.g0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                C1078x0.f1(aVarT1, z10, (InterfaceC1024b) obj);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public void c(final InterfaceC1177z.a aVar) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1032, new C6634v.a() { // from class: B2.q0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).j(aVarZ1, aVar);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void c0(final C6077I c6077i) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 15, new C6634v.a() { // from class: B2.x
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).w0(aVarT1, c6077i);
            }
        });
    }

    protected final void c2(InterfaceC1024b.a aVar, int i10, C6634v.a aVar2) {
        this.f1024e.put(i10, aVar);
        this.f1025f.k(i10, aVar2);
    }

    @Override // q2.InterfaceC6084P.d
    public final void d(final int i10) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 21, new C6634v.a() { // from class: B2.c0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).L(aVarZ1, i10);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void d0(final float f10) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 22, new C6634v.a() { // from class: B2.d
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).W(aVarZ1, f10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public void e(final InterfaceC1177z.a aVar) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1031, new C6634v.a() { // from class: B2.t0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).n(aVarZ1, aVar);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void e0(final C6088c c6088c) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 20, new C6634v.a() { // from class: B2.h
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).n0(aVarZ1, c6088c);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void f(final boolean z10) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 23, new C6634v.a() { // from class: B2.s0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).x(aVarZ1, z10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public void f0(InterfaceC1024b interfaceC1024b) {
        AbstractC6614a.e(interfaceC1024b);
        this.f1025f.c(interfaceC1024b);
    }

    @Override // B2.InterfaceC1021a
    public final void g(final Exception exc) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1014, new C6634v.a() { // from class: B2.k0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).r(aVarZ1, exc);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void g0(final q2.h0 h0Var) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 2, new C6634v.a() { // from class: B2.n
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).f0(aVarT1, h0Var);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void h(final String str) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1019, new C6634v.a() { // from class: B2.m
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).i(aVarZ1, str);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public void h0(final int i10, final int i11, final boolean z10) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1033, new C6634v.a() { // from class: B2.r
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).V(aVarZ1, i10, i11, z10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void i(final String str, final long j10, final long j11) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1016, new C6634v.a() { // from class: B2.E
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                C1078x0.Y0(aVarZ1, str, j11, j10, (InterfaceC1024b) obj);
            }
        });
    }

    @Override // M2.L
    public final void i0(int i10, D.b bVar, final C1934y c1934y, final M2.B b10) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, ErrorCodes.SERVER_RETRY_IN, new C6634v.a() { // from class: B2.a0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).a0(aVarX1, c1934y, b10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void j(final String str) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1012, new C6634v.a() { // from class: B2.r0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).q(aVarZ1, str);
            }
        });
    }

    @Override // M2.L
    public final void j0(int i10, D.b bVar, final M2.B b10) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, ErrorCodes.PROTOCOL_EXCEPTION, new C6634v.a() { // from class: B2.H
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).K(aVarX1, b10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void k(final String str, final long j10, final long j11) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1008, new C6634v.a() { // from class: B2.k
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                C1078x0.E0(aVarZ1, str, j11, j10, (InterfaceC1024b) obj);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void k0(final boolean z10, final int i10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, -1, new C6634v.a() { // from class: B2.g
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).D(aVarT1, z10, i10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void l(final C6109x c6109x, final C1005c c1005c) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1009, new C6634v.a() { // from class: B2.e0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).m(aVarZ1, c6109x, c1005c);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void l0(final long j10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 17, new C6634v.a() { // from class: B2.P
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).e0(aVarT1, j10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void m(final C6109x c6109x, final C1005c c1005c) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1017, new C6634v.a() { // from class: B2.b0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).p(aVarZ1, c6109x, c1005c);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void m0(final InterfaceC6084P.e eVar, final InterfaceC6084P.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f1028i = false;
        }
        this.f1023d.j((InterfaceC6084P) AbstractC6614a.e(this.f1026g));
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 11, new C6634v.a() { // from class: B2.A
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                C1078x0.o1(aVarT1, i10, eVar, eVar2, (InterfaceC1024b) obj);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void n(final C6083O c6083o) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 12, new C6634v.a() { // from class: B2.c
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).O(aVarT1, c6083o);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void n0(final C6101p c6101p) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 29, new C6634v.a() { // from class: B2.w
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).v0(aVarT1, c6101p);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void o(final C1004b c1004b) {
        final InterfaceC1024b.a aVarY1 = Y1();
        c2(aVarY1, 1020, new C6634v.a() { // from class: B2.I
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).z(aVarY1, c1004b);
            }
        });
    }

    @Override // F2.t
    public final void o0(int i10, D.b bVar) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, 1023, new C6634v.a() { // from class: B2.p0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).o0(aVarX1);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void p(final List list) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 27, new C6634v.a() { // from class: B2.s
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).v(aVarT1, list);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public void p0(final InterfaceC6084P interfaceC6084P, Looper looper) {
        AbstractC6614a.g(this.f1026g == null || this.f1023d.f1030b.isEmpty());
        this.f1026g = (InterfaceC6084P) AbstractC6614a.e(interfaceC6084P);
        this.f1027h = this.f1020a.e(looper, null);
        this.f1025f = this.f1025f.e(looper, new C6634v.b() { // from class: B2.f
            @Override // t2.C6634v.b
            public final void a(Object obj, C6105t c6105t) {
                InterfaceC1024b interfaceC1024b = (InterfaceC1024b) obj;
                interfaceC1024b.Z(interfaceC6084P, new InterfaceC1024b.C0016b(c6105t, this.f939a.f1024e));
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void q(final long j10) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1010, new C6634v.a() { // from class: B2.S
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).I(aVarZ1, j10);
            }
        });
    }

    @Override // F2.t
    public final void q0(int i10, D.b bVar) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, 1027, new C6634v.a() { // from class: B2.j0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).E(aVarX1);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void r(final Exception exc) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1030, new C6634v.a() { // from class: B2.e
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).s(aVarZ1, exc);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void r0(final long j10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 18, new C6634v.a() { // from class: B2.M
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).e(aVarT1, j10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void s(final C1004b c1004b) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1015, new C6634v.a() { // from class: B2.f0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).l0(aVarZ1, c1004b);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void s0(final boolean z10, final int i10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 5, new C6634v.a() { // from class: B2.q
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).G(aVarT1, z10, i10);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void t(final C6407e c6407e) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 27, new C6634v.a() { // from class: B2.y
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).r0(aVarT1, c6407e);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void t0(final C6082N c6082n) {
        final InterfaceC1024b.a aVarA2 = a2(c6082n);
        c2(aVarA2, 10, new C6634v.a() { // from class: B2.o
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).C0(aVarA2, c6082n);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void u(final C1004b c1004b) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, ErrorCodes.IO_EXCEPTION, new C6634v.a() { // from class: B2.O
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).g0(aVarZ1, c1004b);
            }
        });
    }

    @Override // F2.t
    public final void u0(int i10, D.b bVar, final int i11) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, 1022, new C6634v.a() { // from class: B2.Y
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                C1078x0.C0(aVarX1, i11, (InterfaceC1024b) obj);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void v(final int i10, final long j10) {
        final InterfaceC1024b.a aVarY1 = Y1();
        c2(aVarY1, 1018, new C6634v.a() { // from class: B2.T
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).B(aVarY1, i10, j10);
            }
        });
    }

    @Override // F2.t
    public final void v0(int i10, D.b bVar) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, 1025, new C6634v.a() { // from class: B2.o0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).k(aVarX1);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void w(final C1004b c1004b) {
        final InterfaceC1024b.a aVarY1 = Y1();
        c2(aVarY1, 1013, new C6634v.a() { // from class: B2.X
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).B0(aVarY1, c1004b);
            }
        });
    }

    @Override // F2.t
    public final void w0(int i10, D.b bVar, final Exception exc) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, new C6634v.a() { // from class: B2.Z
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).c(aVarX1, exc);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void x(final Object obj, final long j10) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 26, new C6634v.a() { // from class: B2.h0
            @Override // t2.C6634v.a
            public final void invoke(Object obj2) {
                ((InterfaceC1024b) obj2).A(aVarZ1, obj, j10);
            }
        });
    }

    @Override // M2.L
    public final void x0(int i10, D.b bVar, final M2.B b10) {
        final InterfaceC1024b.a aVarX1 = X1(i10, bVar);
        c2(aVarX1, ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, new C6634v.a() { // from class: B2.i0
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).f(aVarX1, b10);
            }
        });
    }

    @Override // B2.InterfaceC1021a
    public final void y(final Exception exc) {
        final InterfaceC1024b.a aVarZ1 = Z1();
        c2(aVarZ1, 1029, new C6634v.a() { // from class: B2.D
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).q0(aVarZ1, exc);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void y0(final boolean z10) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 7, new C6634v.a() { // from class: B2.j
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).m0(aVarT1, z10);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public final void z(final C6078J c6078j) {
        final InterfaceC1024b.a aVarT1 = T1();
        c2(aVarT1, 28, new C6634v.a() { // from class: B2.i
            @Override // t2.C6634v.a
            public final void invoke(Object obj) {
                ((InterfaceC1024b) obj).t0(aVarT1, c6078j);
            }
        });
    }

    @Override // q2.InterfaceC6084P.d
    public void T() {
    }

    @Override // q2.InterfaceC6084P.d
    public void D(boolean z10) {
    }

    @Override // q2.InterfaceC6084P.d
    public void Y(int i10) {
    }

    public static /* synthetic */ void O1(InterfaceC1024b interfaceC1024b, C6105t c6105t) {
    }

    @Override // q2.InterfaceC6084P.d
    public void X(InterfaceC6084P interfaceC6084P, InterfaceC6084P.c cVar) {
    }
}
