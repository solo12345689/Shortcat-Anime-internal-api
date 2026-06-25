package rf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.E;
import qf.I;
import qf.L;
import qf.M0;
import qf.V;
import qf.W;

/* JADX INFO: renamed from: rf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6314d {
    public static final M0 a(Collection types) {
        AbstractC6183d0 abstractC6183d0V0;
        AbstractC5504s.h(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (M0) AbstractC2279u.L0(types);
        }
        Collection<M0> collection = types;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(collection, 10));
        boolean z10 = false;
        boolean z11 = false;
        for (M0 m02 : collection) {
            z10 = z10 || W.a(m02);
            if (m02 instanceof AbstractC6183d0) {
                abstractC6183d0V0 = (AbstractC6183d0) m02;
            } else {
                if (!(m02 instanceof I)) {
                    throw new Td.r();
                }
                if (E.a(m02)) {
                    return m02;
                }
                abstractC6183d0V0 = ((I) m02).V0();
                z11 = true;
            }
            arrayList.add(abstractC6183d0V0);
        }
        if (z10) {
            return sf.l.d(sf.k.f59665T0, types.toString());
        }
        if (!z11) {
            return z.f58805a.d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(L.d((M0) it.next()));
        }
        z zVar = z.f58805a;
        return V.e(zVar.d(arrayList), zVar.d(arrayList2));
    }
}
