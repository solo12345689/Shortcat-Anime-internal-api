package Be;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Be.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1117l implements ye.U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1807b;

    public C1117l(List providers, String debugName) {
        AbstractC5504s.h(providers, "providers");
        AbstractC5504s.h(debugName, "debugName");
        this.f1806a = providers;
        this.f1807b = debugName;
        providers.size();
        AbstractC2279u.f1(providers).size();
    }

    @Override // ye.U
    public void a(Xe.c fqName, Collection packageFragments) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(packageFragments, "packageFragments");
        Iterator it = this.f1806a.iterator();
        while (it.hasNext()) {
            ye.T.a((ye.O) it.next(), fqName, packageFragments);
        }
    }

    @Override // ye.U
    public boolean b(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        List list = this.f1806a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!ye.T.b((ye.O) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // ye.O
    public List c(Xe.c fqName) {
        AbstractC5504s.h(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1806a.iterator();
        while (it.hasNext()) {
            ye.T.a((ye.O) it.next(), fqName, arrayList);
        }
        return AbstractC2279u.b1(arrayList);
    }

    @Override // ye.O
    public Collection t(Xe.c fqName, Function1 nameFilter) {
        AbstractC5504s.h(fqName, "fqName");
        AbstractC5504s.h(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f1806a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((ye.O) it.next()).t(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f1807b;
    }
}
