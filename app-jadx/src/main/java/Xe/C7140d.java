package xe;

import Ud.AbstractC2279u;
import Ud.a0;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7227e;

/* JADX INFO: renamed from: xe.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7140d {

    /* JADX INFO: renamed from: a */
    public static final C7140d f64395a = new C7140d();

    private C7140d() {
    }

    public static /* synthetic */ InterfaceC7227e f(C7140d c7140d, Xe.c cVar, ve.i iVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return c7140d.e(cVar, iVar, num);
    }

    public final InterfaceC7227e a(InterfaceC7227e mutable) {
        AbstractC5504s.h(mutable, "mutable");
        Xe.c cVarO = C7139c.f64375a.o(bf.i.m(mutable));
        if (cVarO != null) {
            InterfaceC7227e interfaceC7227eP = ff.e.m(mutable).p(cVarO);
            AbstractC5504s.g(interfaceC7227eP, "getBuiltInClassByFqName(...)");
            return interfaceC7227eP;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final InterfaceC7227e b(InterfaceC7227e readOnly) {
        AbstractC5504s.h(readOnly, "readOnly");
        Xe.c cVarP = C7139c.f64375a.p(bf.i.m(readOnly));
        if (cVarP != null) {
            InterfaceC7227e interfaceC7227eP = ff.e.m(readOnly).p(cVarP);
            AbstractC5504s.g(interfaceC7227eP, "getBuiltInClassByFqName(...)");
            return interfaceC7227eP;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean c(InterfaceC7227e mutable) {
        AbstractC5504s.h(mutable, "mutable");
        return C7139c.f64375a.k(bf.i.m(mutable));
    }

    public final boolean d(InterfaceC7227e readOnly) {
        AbstractC5504s.h(readOnly, "readOnly");
        return C7139c.f64375a.l(bf.i.m(readOnly));
    }

    public final InterfaceC7227e e(Xe.c fqName, ve.i builtIns, Integer num) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(builtIns, "builtIns");
        Xe.b bVarM = (num == null || !AbstractC5504s.c(fqName, C7139c.f64375a.h())) ? C7139c.f64375a.m(fqName) : ve.o.a(num.intValue());
        if (bVarM != null) {
            return builtIns.p(bVarM.a());
        }
        return null;
    }

    public final Collection g(Xe.c fqName, ve.i builtIns) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(builtIns, "builtIns");
        InterfaceC7227e interfaceC7227eF = f(this, fqName, builtIns, null, 4, null);
        if (interfaceC7227eF == null) {
            return a0.d();
        }
        Xe.c cVarP = C7139c.f64375a.p(ff.e.p(interfaceC7227eF));
        return cVarP == null ? a0.c(interfaceC7227eF) : AbstractC2279u.p(interfaceC7227eF, builtIns.p(cVarP));
    }
}
