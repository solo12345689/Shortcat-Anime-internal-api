package ve;

import Ud.AbstractC2279u;
import Xe.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ve.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f62095a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f62096b;

    static {
        Set set = l.f62118f;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(o.c((l) it.next()));
        }
        List listJ0 = AbstractC2279u.J0(AbstractC2279u.J0(AbstractC2279u.J0(arrayList, o.a.f62245h.m()), o.a.f62249j.m()), o.a.f62267s.m());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = Xe.b.f21759d;
        Iterator it2 = listJ0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(aVar.c((Xe.c) it2.next()));
        }
        f62096b = linkedHashSet;
    }

    private d() {
    }

    public final Set a() {
        return f62096b;
    }

    public final Set b() {
        return f62096b;
    }
}
