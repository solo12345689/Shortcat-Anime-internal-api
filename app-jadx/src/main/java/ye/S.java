package ye;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class S implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f65082a;

    public S(Collection packageFragments) {
        AbstractC5504s.h(packageFragments, "packageFragments");
        this.f65082a = packageFragments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xe.c f(N it) {
        AbstractC5504s.h(it, "it");
        return it.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(Xe.c cVar, Xe.c it) {
        AbstractC5504s.h(it, "it");
        return !it.c() && AbstractC5504s.c(it.d(), cVar);
    }

    @Override // ye.U
    public void a(Xe.c fqName, Collection packageFragments) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(packageFragments, "packageFragments");
        for (Object obj : this.f65082a) {
            if (AbstractC5504s.c(((N) obj).f(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // ye.U
    public boolean b(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        Collection collection = this.f65082a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (AbstractC5504s.c(((N) it.next()).f(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // ye.O
    public List c(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        Collection collection = this.f65082a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (AbstractC5504s.c(((N) obj).f(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // ye.O
    public Collection t(Xe.c fqName, Function1 nameFilter) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(nameFilter, "nameFilter");
        return Cf.l.T(Cf.l.z(Cf.l.K(AbstractC2279u.c0(this.f65082a), P.f65080a), new Q(fqName)));
    }
}
