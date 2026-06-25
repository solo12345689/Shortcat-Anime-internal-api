package Z;

import Y.AbstractC2454w;
import Y.C2392b;
import Y.H1;
import Y.InterfaceC2398d;
import Y.InterfaceC2450u1;
import Z.d;
import Z.i;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: a */
    private final i f23047a = new i();

    /* JADX INFO: renamed from: b */
    private final i f23048b = new i();

    public final void a() {
        this.f23048b.a();
        this.f23047a.a();
    }

    public final void b(InterfaceC5082a interfaceC5082a, int i10, C2392b c2392b) {
        i iVar = this.f23047a;
        d.o oVar = d.o.f23075c;
        iVar.j(oVar);
        i iVarA = i.b.a(iVar);
        i.b.b(iVarA, d.t.a(0), interfaceC5082a);
        iVarA.f23093c[iVarA.f23094d - iVarA.f23091a[iVarA.f23092b - 1].d()] = i10;
        i.b.b(iVarA, d.t.a(1), c2392b);
        iVar.c(oVar);
        i iVar2 = this.f23048b;
        d.u uVar = d.u.f23080c;
        iVar2.j(uVar);
        i iVarA2 = i.b.a(iVar2);
        iVarA2.f23093c[iVarA2.f23094d - iVarA2.f23091a[iVarA2.f23092b - 1].d()] = i10;
        i.b.b(iVarA2, d.t.a(0), c2392b);
        iVar2.c(uVar);
    }

    public final void c() {
        if (!this.f23048b.g()) {
            AbstractC2454w.t("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.f23048b.h(this.f23047a);
    }

    public final void d(InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
        if (!this.f23048b.f()) {
            AbstractC2454w.t("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f23047a.d(interfaceC2398d, h12, interfaceC2450u1, fVar);
    }

    public final boolean e() {
        return this.f23047a.f();
    }

    public final void f(Object obj, Function2 function2) {
        i iVar = this.f23047a;
        d.G g10 = d.G.f23057c;
        iVar.j(g10);
        i iVarA = i.b.a(iVar);
        i.b.b(iVarA, d.t.a(0), obj);
        int iA = d.t.a(1);
        AbstractC5504s.f(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        i.b.b(iVarA, iA, (Function2) V.e(function2, 2));
        iVar.c(g10);
    }
}
