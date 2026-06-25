package Be;

import Ud.AbstractC2279u;
import Ud.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import jf.AbstractC5379c;
import jf.AbstractC5388l;
import jf.C5380d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class P extends AbstractC5388l {

    /* JADX INFO: renamed from: b */
    private final ye.H f1738b;

    /* JADX INFO: renamed from: c */
    private final Xe.c f1739c;

    public P(ye.H moduleDescriptor, Xe.c fqName) {
        AbstractC5504s.h(moduleDescriptor, "moduleDescriptor");
        AbstractC5504s.h(fqName, "fqName");
        this.f1738b = moduleDescriptor;
        this.f1739c = fqName;
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5387k
    public Set f() {
        return a0.d();
    }

    @Override // jf.AbstractC5388l, jf.InterfaceC5390n
    public Collection g(C5380d kindFilter, Function1 nameFilter) {
        AbstractC5504s.h(kindFilter, "kindFilter");
        AbstractC5504s.h(nameFilter, "nameFilter");
        if (!kindFilter.a(C5380d.f51759c.f())) {
            return AbstractC2279u.m();
        }
        if (this.f1739c.c() && kindFilter.l().contains(AbstractC5379c.b.f51758a)) {
            return AbstractC2279u.m();
        }
        Collection collectionT = this.f1738b.t(this.f1739c, nameFilter);
        ArrayList arrayList = new ArrayList(collectionT.size());
        Iterator it = collectionT.iterator();
        while (it.hasNext()) {
            Xe.f fVarF = ((Xe.c) it.next()).f();
            if (((Boolean) nameFilter.invoke(fVarF)).booleanValue()) {
                Af.a.a(arrayList, h(fVarF));
            }
        }
        return arrayList;
    }

    protected final ye.V h(Xe.f name) {
        AbstractC5504s.h(name, "name");
        if (name.n()) {
            return null;
        }
        ye.V vS = this.f1738b.S(this.f1739c.b(name));
        if (vS.isEmpty()) {
            return null;
        }
        return vS;
    }

    public String toString() {
        return "subpackages of " + this.f1739c + " from " + this.f1738b;
    }
}
