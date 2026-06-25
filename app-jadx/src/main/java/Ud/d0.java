package Ud;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d0 extends c0 {
    public static Set j(Set set, Iterable elements) {
        AbstractC5504s.h(set, "<this>");
        AbstractC5504s.h(elements, "elements");
        Collection<?> collectionF = B.F(elements);
        if (collectionF.isEmpty()) {
            return F.f1(set);
        }
        if (!(collectionF instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionF);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionF).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set k(Set set, Object obj) {
        AbstractC5504s.h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.e(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && AbstractC5504s.c(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set l(Set set, Iterable elements) {
        int size;
        AbstractC5504s.h(set, "<this>");
        AbstractC5504s.h(elements, "elements");
        Integer numY = AbstractC2282x.y(elements);
        if (numY != null) {
            size = set.size() + numY.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.e(size));
        linkedHashSet.addAll(set);
        B.D(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static Set m(Set set, Object obj) {
        AbstractC5504s.h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
