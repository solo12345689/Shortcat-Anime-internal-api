package bf;

import Ud.AbstractC2279u;
import bf.o;
import java.util.Collection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import qf.v0;
import rf.AbstractC6317g;
import ye.D;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.N;
import ye.h0;
import ye.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f33298a = new g();

    private g() {
    }

    public static /* synthetic */ boolean f(g gVar, InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2, boolean z10, boolean z11, boolean z12, AbstractC6317g abstractC6317g, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return gVar.e(interfaceC7223a, interfaceC7223a2, z10, z13, z12, abstractC6317g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z10, InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2, v0 c12, v0 c22) {
        AbstractC5504s.h(c12, "c1");
        AbstractC5504s.h(c22, "c2");
        if (AbstractC5504s.c(c12, c22)) {
            return true;
        }
        InterfaceC7230h interfaceC7230hP = c12.p();
        InterfaceC7230h interfaceC7230hP2 = c22.p();
        if ((interfaceC7230hP instanceof m0) && (interfaceC7230hP2 instanceof m0)) {
            return f33298a.n((m0) interfaceC7230hP, (m0) interfaceC7230hP2, z10, new f(interfaceC7223a, interfaceC7223a2));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC7223a interfaceC7223a, InterfaceC7223a interfaceC7223a2, InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2) {
        return AbstractC5504s.c(interfaceC7235m, interfaceC7223a) && AbstractC5504s.c(interfaceC7235m2, interfaceC7223a2);
    }

    private final boolean j(InterfaceC7227e interfaceC7227e, InterfaceC7227e interfaceC7227e2) {
        return AbstractC5504s.c(interfaceC7227e.l(), interfaceC7227e2.l());
    }

    public static /* synthetic */ boolean l(g gVar, InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return gVar.k(interfaceC7235m, interfaceC7235m2, z10, z11);
    }

    public static /* synthetic */ boolean o(g gVar, m0 m0Var, m0 m0Var2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = c.f33291a;
        }
        return gVar.n(m0Var, m0Var2, z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2) {
        return false;
    }

    private final boolean q(InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2, Function2 function2, boolean z10) {
        InterfaceC7235m interfaceC7235mB = interfaceC7235m.b();
        InterfaceC7235m interfaceC7235mB2 = interfaceC7235m2.b();
        return ((interfaceC7235mB instanceof InterfaceC7224b) || (interfaceC7235mB2 instanceof InterfaceC7224b)) ? ((Boolean) function2.invoke(interfaceC7235mB, interfaceC7235mB2)).booleanValue() : l(this, interfaceC7235mB, interfaceC7235mB2, z10, false, 8, null);
    }

    private final h0 r(InterfaceC7223a interfaceC7223a) {
        while (interfaceC7223a instanceof InterfaceC7224b) {
            InterfaceC7224b interfaceC7224b = (InterfaceC7224b) interfaceC7223a;
            if (interfaceC7224b.h() != InterfaceC7224b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionE = interfaceC7224b.e();
            AbstractC5504s.g(collectionE, "getOverriddenDescriptors(...)");
            interfaceC7223a = (InterfaceC7224b) AbstractC2279u.N0(collectionE);
            if (interfaceC7223a == null) {
                return null;
            }
        }
        return interfaceC7223a.k();
    }

    public final boolean e(InterfaceC7223a a10, InterfaceC7223a b10, boolean z10, boolean z11, boolean z12, AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(a10, "a");
        AbstractC5504s.h(b10, "b");
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (AbstractC5504s.c(a10, b10)) {
            return true;
        }
        if (!AbstractC5504s.c(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof D) && (b10 instanceof D) && ((D) a10).m0() != ((D) b10).m0()) {
            return false;
        }
        if ((AbstractC5504s.c(a10.b(), b10.b()) && (!z10 || !AbstractC5504s.c(r(a10), r(b10)))) || i.E(a10) || i.E(b10) || !q(a10, b10, d.f33292a, z10)) {
            return false;
        }
        o oVarI = o.i(kotlinTypeRefiner, new e(z10, a10, b10));
        AbstractC5504s.g(oVarI, "create(...)");
        o.i.a aVarC = oVarI.E(a10, b10, null, !z12).c();
        o.i.a aVar = o.i.a.OVERRIDABLE;
        return aVarC == aVar && oVarI.E(b10, a10, null, z12 ^ true).c() == aVar;
    }

    public final boolean k(InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2, boolean z10, boolean z11) {
        return ((interfaceC7235m instanceof InterfaceC7227e) && (interfaceC7235m2 instanceof InterfaceC7227e)) ? j((InterfaceC7227e) interfaceC7235m, (InterfaceC7227e) interfaceC7235m2) : ((interfaceC7235m instanceof m0) && (interfaceC7235m2 instanceof m0)) ? o(this, (m0) interfaceC7235m, (m0) interfaceC7235m2, z10, null, 8, null) : ((interfaceC7235m instanceof InterfaceC7223a) && (interfaceC7235m2 instanceof InterfaceC7223a)) ? f(this, (InterfaceC7223a) interfaceC7235m, (InterfaceC7223a) interfaceC7235m2, z10, z11, false, AbstractC6317g.a.f58775a, 16, null) : ((interfaceC7235m instanceof N) && (interfaceC7235m2 instanceof N)) ? AbstractC5504s.c(((N) interfaceC7235m).f(), ((N) interfaceC7235m2).f()) : AbstractC5504s.c(interfaceC7235m, interfaceC7235m2);
    }

    public final boolean m(m0 a10, m0 b10, boolean z10) {
        AbstractC5504s.h(a10, "a");
        AbstractC5504s.h(b10, "b");
        return o(this, a10, b10, z10, null, 8, null);
    }

    public final boolean n(m0 a10, m0 b10, boolean z10, Function2 equivalentCallables) {
        AbstractC5504s.h(a10, "a");
        AbstractC5504s.h(b10, "b");
        AbstractC5504s.h(equivalentCallables, "equivalentCallables");
        if (AbstractC5504s.c(a10, b10)) {
            return true;
        }
        return !AbstractC5504s.c(a10.b(), b10.b()) && q(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }
}
