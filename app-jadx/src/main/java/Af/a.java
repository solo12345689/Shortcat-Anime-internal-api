package Af;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final void a(Collection collection, Object obj) {
        AbstractC5504s.h(collection, "<this>");
        if (obj != null) {
            collection.add(obj);
        }
    }

    private static final int b(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return i10 + (i10 / 3) + 1;
    }

    public static final List c(ArrayList arrayList) {
        AbstractC5504s.h(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return AbstractC2279u.m();
        }
        if (size == 1) {
            return AbstractC2279u.e(AbstractC2279u.m0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final Map d(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    public static final HashMap e(int i10) {
        return new HashMap(b(i10));
    }

    public static final HashSet f(int i10) {
        return new HashSet(b(i10));
    }

    public static final LinkedHashSet g(int i10) {
        return new LinkedHashSet(b(i10));
    }
}
