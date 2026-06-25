package Ke;

import He.AbstractC1672t;
import Ke.p;
import Le.D;
import Oe.u;
import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pf.InterfaceC6036a;
import ye.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements U {

    /* JADX INFO: renamed from: a */
    private final k f11064a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6036a f11065b;

    public j(d components) {
        AbstractC5504s.h(components, "components");
        k kVar = new k(components, p.a.f11077a, AbstractC2163n.c(null));
        this.f11064a = kVar;
        this.f11065b = kVar.e().a();
    }

    private final D e(Xe.c cVar) {
        u uVarA = AbstractC1672t.a(this.f11064a.a().d(), cVar, false, 2, null);
        if (uVarA == null) {
            return null;
        }
        return (D) this.f11065b.a(cVar, new i(this, uVarA));
    }

    public static final D f(j jVar, u uVar) {
        return new D(jVar.f11064a, uVar);
    }

    @Override // ye.U
    public void a(Xe.c fqName, Collection packageFragments) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(packageFragments, "packageFragments");
        Af.a.a(packageFragments, e(fqName));
    }

    @Override // ye.U
    public boolean b(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return AbstractC1672t.a(this.f11064a.a().d(), fqName, false, 2, null) == null;
    }

    @Override // ye.O
    public List c(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        return AbstractC2279u.q(e(fqName));
    }

    @Override // ye.O
    /* JADX INFO: renamed from: g */
    public List t(Xe.c fqName, Function1 nameFilter) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(nameFilter, "nameFilter");
        D dE = e(fqName);
        List listQ0 = dE != null ? dE.Q0() : null;
        return listQ0 == null ? AbstractC2279u.m() : listQ0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f11064a.a().m();
    }
}
