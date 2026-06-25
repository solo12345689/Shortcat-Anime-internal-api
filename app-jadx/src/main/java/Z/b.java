package Z;

import Y.AbstractC2454w;
import Y.AbstractC2458x0;
import Y.AbstractC2460y;
import Y.C2392b;
import Y.C2406f1;
import Y.C2414i0;
import Y.C2442s;
import Y.C2456w1;
import Y.C2461y0;
import Y.D1;
import Y.E1;
import Y.InterfaceC2457x;
import Y.g2;
import g0.k;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f23033m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f23034n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2442s f23035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Z.a f23036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23037c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23041g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23046l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2414i0 f23038d = new C2414i0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23039e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f23042h = g2.c(null, 1, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23043i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23044j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23045k = -1;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(C2442s c2442s, Z.a aVar) {
        this.f23035a = c2442s;
        this.f23036b = aVar;
    }

    private final void B() {
        C();
    }

    private final void C() {
        int i10 = this.f23041g;
        if (i10 > 0) {
            this.f23036b.J(i10);
            this.f23041g = 0;
        }
        if (g2.f(this.f23042h)) {
            this.f23036b.k(g2.k(this.f23042h));
            g2.a(this.f23042h);
        }
    }

    private final void D() {
        J(this, false, 1, null);
        L();
    }

    private final void E(boolean z10) {
        I(z10);
    }

    static /* synthetic */ void F(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.E(z10);
    }

    private final void G(int i10, int i11, int i12) {
        B();
        this.f23036b.v(i10, i11, i12);
    }

    private final void H() {
        int i10 = this.f23046l;
        if (i10 > 0) {
            int i11 = this.f23043i;
            if (i11 >= 0) {
                K(i11, i10);
                this.f23043i = -1;
            } else {
                G(this.f23045k, this.f23044j, i10);
                this.f23044j = -1;
                this.f23045k = -1;
            }
            this.f23046l = 0;
        }
    }

    private final void I(boolean z10) {
        int iU = z10 ? r().u() : r().k();
        int i10 = iU - this.f23040f;
        if (!(i10 >= 0)) {
            AbstractC2454w.t("Tried to seek backward");
        }
        if (i10 > 0) {
            this.f23036b.e(i10);
            this.f23040f = iU;
        }
    }

    static /* synthetic */ void J(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.I(z10);
    }

    private final void K(int i10, int i11) {
        B();
        this.f23036b.z(i10, i11);
    }

    private final void l(C2392b c2392b) {
        F(this, false, 1, null);
        this.f23036b.p(c2392b);
        this.f23037c = true;
    }

    private final void m() {
        if (this.f23037c || !this.f23039e) {
            return;
        }
        F(this, false, 1, null);
        this.f23036b.q();
        this.f23037c = true;
    }

    private final D1 r() {
        return this.f23035a.M0();
    }

    public final void A() {
        H();
        if (g2.f(this.f23042h)) {
            g2.i(this.f23042h);
        } else {
            this.f23041g++;
        }
    }

    public final void L() {
        D1 d1R;
        int iU;
        if (r().x() <= 0 || this.f23038d.f(-2) == (iU = (d1R = r()).u())) {
            return;
        }
        m();
        if (iU > 0) {
            C2392b c2392bA = d1R.a(iU);
            this.f23038d.h(iU);
            l(c2392bA);
        }
    }

    public final void M() {
        C();
        if (this.f23037c) {
            W();
            k();
        }
    }

    public final void N(C2456w1 c2456w1) {
        this.f23036b.w(c2456w1);
    }

    public final void O(C2406f1 c2406f1) {
        this.f23036b.x(c2406f1);
    }

    public final void P() {
        D();
        this.f23036b.y();
        this.f23040f += r().p();
    }

    public final void Q(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                AbstractC2454w.t("Invalid remove index " + i10);
            }
            if (this.f23043i == i10) {
                this.f23046l += i11;
                return;
            }
            H();
            this.f23043i = i10;
            this.f23046l = i11;
        }
    }

    public final void R() {
        this.f23036b.A();
    }

    public final void S() {
        this.f23037c = false;
        this.f23038d.a();
        this.f23040f = 0;
        this.f23039e = true;
        this.f23041g = 0;
        g2.a(this.f23042h);
        this.f23043i = -1;
        this.f23044j = -1;
        this.f23045k = -1;
        this.f23046l = 0;
    }

    public final void T(Z.a aVar) {
        this.f23036b = aVar;
    }

    public final void U(boolean z10) {
        this.f23039e = z10;
    }

    public final void V(InterfaceC5082a interfaceC5082a) {
        this.f23036b.B(interfaceC5082a);
    }

    public final void W() {
        this.f23036b.C();
    }

    public final void X(C2406f1 c2406f1) {
        this.f23036b.D(c2406f1);
    }

    public final void Y(int i10) {
        if (i10 > 0) {
            D();
            this.f23036b.E(i10);
        }
    }

    public final void Z(Object obj, C2392b c2392b, int i10) {
        this.f23036b.F(obj, c2392b, i10);
    }

    public final void a(C2392b c2392b, Object obj) {
        this.f23036b.f(c2392b, obj);
    }

    public final void a0(Object obj) {
        F(this, false, 1, null);
        this.f23036b.G(obj);
    }

    public final void b(List list, k kVar) {
        this.f23036b.g(list, kVar);
    }

    public final void b0(Object obj, Function2 function2) {
        B();
        this.f23036b.H(obj, function2);
    }

    public final void c(AbstractC2458x0 abstractC2458x0, AbstractC2460y abstractC2460y, C2461y0 c2461y0, C2461y0 c2461y02) {
        this.f23036b.h(abstractC2458x0, abstractC2460y, c2461y0, c2461y02);
    }

    public final void c0(Object obj, int i10) {
        E(true);
        this.f23036b.I(obj, i10);
    }

    public final void d() {
        F(this, false, 1, null);
        this.f23036b.i();
    }

    public final void d0(Object obj) {
        B();
        this.f23036b.K(obj);
    }

    public final void e(k kVar, C2392b c2392b) {
        C();
        this.f23036b.j(kVar, c2392b);
    }

    public final void f(Function1 function1, InterfaceC2457x interfaceC2457x) {
        this.f23036b.l(function1, interfaceC2457x);
    }

    public final void g() {
        int iU = r().u();
        if (!(this.f23038d.f(-1) <= iU)) {
            AbstractC2454w.t("Missed recording an endGroup");
        }
        if (this.f23038d.f(-1) == iU) {
            F(this, false, 1, null);
            this.f23038d.g();
            this.f23036b.m();
        }
    }

    public final void h() {
        this.f23036b.n();
        this.f23040f = 0;
    }

    public final void i() {
        H();
    }

    public final void j(C2406f1 c2406f1) {
        this.f23036b.o(c2406f1);
    }

    public final void k() {
        if (this.f23037c) {
            F(this, false, 1, null);
            F(this, false, 1, null);
            this.f23036b.m();
            this.f23037c = false;
        }
    }

    public final void n() {
        C();
        if (this.f23038d.f22338b == 0) {
            return;
        }
        AbstractC2454w.t("Missed recording an endGroup()");
    }

    public final Z.a o() {
        return this.f23036b;
    }

    public final boolean p() {
        return this.f23039e;
    }

    public final boolean q() {
        return r().u() - this.f23040f < 0;
    }

    public final void s(Z.a aVar, k kVar) {
        this.f23036b.r(aVar, kVar);
    }

    public final void t(C2392b c2392b, E1 e12) {
        C();
        D();
        H();
        this.f23036b.s(c2392b, e12);
    }

    public final void u(C2392b c2392b, E1 e12, c cVar) {
        C();
        D();
        H();
        this.f23036b.t(c2392b, e12, cVar);
    }

    public final void v(int i10) {
        D();
        this.f23036b.u(i10);
    }

    public final void w(Object obj) {
        H();
        g2.j(this.f23042h, obj);
    }

    public final void x(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.f23046l;
            if (i13 > 0 && this.f23044j == i10 - i13 && this.f23045k == i11 - i13) {
                this.f23046l = i13 + i12;
                return;
            }
            H();
            this.f23044j = i10;
            this.f23045k = i11;
            this.f23046l = i12;
        }
    }

    public final void y(int i10) {
        this.f23040f += i10 - r().k();
    }

    public final void z(int i10) {
        this.f23040f = i10;
    }
}
