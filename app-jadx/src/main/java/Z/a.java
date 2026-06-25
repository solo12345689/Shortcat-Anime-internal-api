package Z;

import Y.AbstractC2458x0;
import Y.AbstractC2460y;
import Y.C2392b;
import Y.C2406f1;
import Y.C2456w1;
import Y.C2461y0;
import Y.E1;
import Y.H1;
import Y.InterfaceC2398d;
import Y.InterfaceC2413i;
import Y.InterfaceC2450u1;
import Y.InterfaceC2457x;
import Z.d;
import Z.i;
import g0.k;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: a */
    private final i f23032a = new i();

    public final void A() {
        this.f23032a.i(d.z.f23085c);
    }

    public final void B(InterfaceC5082a interfaceC5082a) {
        i iVar = this.f23032a;
        d.A a10 = d.A.f23051c;
        iVar.j(a10);
        i.b.b(i.b.a(iVar), d.t.a(0), interfaceC5082a);
        iVar.c(a10);
    }

    public final void C() {
        this.f23032a.i(d.B.f23052c);
    }

    public final void D(C2406f1 c2406f1) {
        i iVar = this.f23032a;
        d.C c10 = d.C.f23053c;
        iVar.j(c10);
        i.b.b(i.b.a(iVar), d.t.a(0), c2406f1);
        iVar.c(c10);
    }

    public final void E(int i10) {
        i iVar = this.f23032a;
        d.D d10 = d.D.f23054c;
        iVar.j(d10);
        i iVarA = i.b.a(iVar);
        iVarA.f23093c[iVarA.f23094d - iVarA.f23091a[iVarA.f23092b - 1].d()] = i10;
        iVar.c(d10);
    }

    public final void F(Object obj, C2392b c2392b, int i10) {
        i iVar = this.f23032a;
        d.E e10 = d.E.f23055c;
        iVar.j(e10);
        i iVarA = i.b.a(iVar);
        i.b.c(iVarA, d.t.a(0), obj, d.t.a(1), c2392b);
        iVarA.f23093c[iVarA.f23094d - iVarA.f23091a[iVarA.f23092b - 1].d()] = i10;
        iVar.c(e10);
    }

    public final void G(Object obj) {
        i iVar = this.f23032a;
        d.F f10 = d.F.f23056c;
        iVar.j(f10);
        i.b.b(i.b.a(iVar), d.t.a(0), obj);
        iVar.c(f10);
    }

    public final void H(Object obj, Function2 function2) {
        i iVar = this.f23032a;
        d.G g10 = d.G.f23057c;
        iVar.j(g10);
        i iVarA = i.b.a(iVar);
        int iA = d.t.a(0);
        int iA2 = d.t.a(1);
        AbstractC5504s.f(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        i.b.c(iVarA, iA, obj, iA2, (Function2) V.e(function2, 2));
        iVar.c(g10);
    }

    public final void I(Object obj, int i10) {
        i iVar = this.f23032a;
        d.H h10 = d.H.f23058c;
        iVar.j(h10);
        i iVarA = i.b.a(iVar);
        i.b.b(iVarA, d.t.a(0), obj);
        iVarA.f23093c[iVarA.f23094d - iVarA.f23091a[iVarA.f23092b - 1].d()] = i10;
        iVar.c(h10);
    }

    public final void J(int i10) {
        i iVar = this.f23032a;
        d.I i11 = d.I.f23059c;
        iVar.j(i11);
        i iVarA = i.b.a(iVar);
        iVarA.f23093c[iVarA.f23094d - iVarA.f23091a[iVarA.f23092b - 1].d()] = i10;
        iVar.c(i11);
    }

    public final void K(Object obj) {
        if (obj instanceof InterfaceC2413i) {
            this.f23032a.i(d.J.f23060c);
        }
    }

    public final void a() {
        this.f23032a.a();
    }

    public final void b(InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
        this.f23032a.d(interfaceC2398d, h12, interfaceC2450u1, fVar);
    }

    public final boolean c() {
        return this.f23032a.f();
    }

    public final boolean d() {
        return this.f23032a.g();
    }

    public final void e(int i10) {
        i iVar = this.f23032a;
        d.C2493a c2493a = d.C2493a.f23061c;
        iVar.j(c2493a);
        i iVarA = i.b.a(iVar);
        iVarA.f23093c[iVarA.f23094d - iVarA.f23091a[iVarA.f23092b - 1].d()] = i10;
        iVar.c(c2493a);
    }

    public final void f(C2392b c2392b, Object obj) {
        i iVar = this.f23032a;
        d.C2494b c2494b = d.C2494b.f23062c;
        iVar.j(c2494b);
        i.b.c(i.b.a(iVar), d.t.a(0), c2392b, d.t.a(1), obj);
        iVar.c(c2494b);
    }

    public final void g(List list, k kVar) {
        if (list.isEmpty()) {
            return;
        }
        i iVar = this.f23032a;
        d.C0394d c0394d = d.C0394d.f23064c;
        iVar.j(c0394d);
        i.b.c(i.b.a(iVar), d.t.a(1), list, d.t.a(0), kVar);
        iVar.c(c0394d);
    }

    public final void h(AbstractC2458x0 abstractC2458x0, AbstractC2460y abstractC2460y, C2461y0 c2461y0, C2461y0 c2461y02) {
        i iVar = this.f23032a;
        d.C2496e c2496e = d.C2496e.f23065c;
        iVar.j(c2496e);
        i.b.d(i.b.a(iVar), d.t.a(0), abstractC2458x0, d.t.a(1), abstractC2460y, d.t.a(3), c2461y02, d.t.a(2), c2461y0);
        iVar.c(c2496e);
    }

    public final void i() {
        this.f23032a.i(d.C2497f.f23066c);
    }

    public final void j(k kVar, C2392b c2392b) {
        i iVar = this.f23032a;
        d.C2498g c2498g = d.C2498g.f23067c;
        iVar.j(c2498g);
        i.b.c(i.b.a(iVar), d.t.a(0), kVar, d.t.a(1), c2392b);
        iVar.c(c2498g);
    }

    public final void k(Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        i iVar = this.f23032a;
        d.C2499h c2499h = d.C2499h.f23068c;
        iVar.j(c2499h);
        i.b.b(i.b.a(iVar), d.t.a(0), objArr);
        iVar.c(c2499h);
    }

    public final void l(Function1 function1, InterfaceC2457x interfaceC2457x) {
        i iVar = this.f23032a;
        d.C2500i c2500i = d.C2500i.f23069c;
        iVar.j(c2500i);
        i.b.c(i.b.a(iVar), d.t.a(0), function1, d.t.a(1), interfaceC2457x);
        iVar.c(c2500i);
    }

    public final void m() {
        this.f23032a.i(d.C2501j.f23070c);
    }

    public final void n() {
        this.f23032a.i(d.k.f23071c);
    }

    public final void o(C2406f1 c2406f1) {
        i iVar = this.f23032a;
        d.l lVar = d.l.f23072c;
        iVar.j(lVar);
        i.b.b(i.b.a(iVar), d.t.a(0), c2406f1);
        iVar.c(lVar);
    }

    public final void p(C2392b c2392b) {
        i iVar = this.f23032a;
        d.m mVar = d.m.f23073c;
        iVar.j(mVar);
        i.b.b(i.b.a(iVar), d.t.a(0), c2392b);
        iVar.c(mVar);
    }

    public final void q() {
        this.f23032a.i(d.n.f23074c);
    }

    public final void r(a aVar, k kVar) {
        if (aVar.d()) {
            i iVar = this.f23032a;
            d.C2495c c2495c = d.C2495c.f23063c;
            iVar.j(c2495c);
            i.b.c(i.b.a(iVar), d.t.a(0), aVar, d.t.a(1), kVar);
            iVar.c(c2495c);
        }
    }

    public final void s(C2392b c2392b, E1 e12) {
        i iVar = this.f23032a;
        d.p pVar = d.p.f23076c;
        iVar.j(pVar);
        i.b.c(i.b.a(iVar), d.t.a(0), c2392b, d.t.a(1), e12);
        iVar.c(pVar);
    }

    public final void t(C2392b c2392b, E1 e12, c cVar) {
        i iVar = this.f23032a;
        d.q qVar = d.q.f23077c;
        iVar.j(qVar);
        i.b.e(i.b.a(iVar), d.t.a(0), c2392b, d.t.a(1), e12, d.t.a(2), cVar);
        iVar.c(qVar);
    }

    public final void u(int i10) {
        i iVar = this.f23032a;
        d.r rVar = d.r.f23078c;
        iVar.j(rVar);
        i iVarA = i.b.a(iVar);
        iVarA.f23093c[iVarA.f23094d - iVarA.f23091a[iVarA.f23092b - 1].d()] = i10;
        iVar.c(rVar);
    }

    public final void v(int i10, int i11, int i12) {
        i iVar = this.f23032a;
        d.s sVar = d.s.f23079c;
        iVar.j(sVar);
        i iVarA = i.b.a(iVar);
        int iD = iVarA.f23094d - iVarA.f23091a[iVarA.f23092b - 1].d();
        int[] iArr = iVarA.f23093c;
        iArr[iD + 1] = i10;
        iArr[iD] = i11;
        iArr[iD + 2] = i12;
        iVar.c(sVar);
    }

    public final void w(C2456w1 c2456w1) {
        i iVar = this.f23032a;
        d.v vVar = d.v.f23081c;
        iVar.j(vVar);
        i.b.b(i.b.a(iVar), d.t.a(0), c2456w1);
        iVar.c(vVar);
    }

    public final void x(C2406f1 c2406f1) {
        i iVar = this.f23032a;
        d.w wVar = d.w.f23082c;
        iVar.j(wVar);
        i.b.b(i.b.a(iVar), d.t.a(0), c2406f1);
        iVar.c(wVar);
    }

    public final void y() {
        this.f23032a.i(d.x.f23083c);
    }

    public final void z(int i10, int i11) {
        i iVar = this.f23032a;
        d.y yVar = d.y.f23084c;
        iVar.j(yVar);
        i iVarA = i.b.a(iVar);
        int iD = iVarA.f23094d - iVarA.f23091a[iVarA.f23092b - 1].d();
        int[] iArr = iVarA.f23093c;
        iArr[iD] = i10;
        iArr[iD + 1] = i11;
        iVar.c(yVar);
    }
}
