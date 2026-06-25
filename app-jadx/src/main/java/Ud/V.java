package Ud;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class V extends U {
    public static final Map A(Pair[] pairArr, Map destination) {
        AbstractC5504s.h(pairArr, "<this>");
        AbstractC5504s.h(destination, "destination");
        t(destination, pairArr);
        return destination;
    }

    public static Map B(Map map) {
        AbstractC5504s.h(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Map i() {
        I i10 = I.f19486a;
        AbstractC5504s.f(i10, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return i10;
    }

    public static Object j(Map map, Object obj) {
        AbstractC5504s.h(map, "<this>");
        return T.a(map, obj);
    }

    public static HashMap k(Pair... pairs) {
        AbstractC5504s.h(pairs, "pairs");
        HashMap map = new HashMap(U.e(pairs.length));
        t(map, pairs);
        return map;
    }

    public static Map l(Pair... pairs) {
        AbstractC5504s.h(pairs, "pairs");
        return pairs.length > 0 ? A(pairs, new LinkedHashMap(U.e(pairs.length))) : i();
    }

    public static Map m(Map map, Iterable keys) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(keys, "keys");
        Map mapB = B(map);
        B.J(mapB.keySet(), keys);
        return o(mapB);
    }

    public static Map n(Pair... pairs) {
        AbstractC5504s.h(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.e(pairs.length));
        t(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map o(Map map) {
        AbstractC5504s.h(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : U.g(map) : i();
    }

    public static Map p(Map map, Map map2) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map q(Map map, Pair pair) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(pair, "pair");
        if (map.isEmpty()) {
            return U.f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static final void r(Map map, Cf.i pairs) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static void s(Map map, Iterable pairs) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static final void t(Map map, Pair[] pairs) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static Map u(Cf.i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        return o(v(iVar, new LinkedHashMap()));
    }

    public static final Map v(Cf.i iVar, Map destination) {
        AbstractC5504s.h(iVar, "<this>");
        AbstractC5504s.h(destination, "destination");
        r(destination, iVar);
        return destination;
    }

    public static Map w(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return o(x(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i();
        }
        if (size != 1) {
            return x(iterable, new LinkedHashMap(U.e(collection.size())));
        }
        return U.f((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map x(Iterable iterable, Map destination) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(destination, "destination");
        s(destination, iterable);
        return destination;
    }

    public static Map y(Map map) {
        AbstractC5504s.h(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? B(map) : U.g(map) : i();
    }

    public static Map z(Pair[] pairArr) {
        AbstractC5504s.h(pairArr, "<this>");
        int length = pairArr.length;
        return length != 0 ? length != 1 ? A(pairArr, new LinkedHashMap(U.e(pairArr.length))) : U.f(pairArr[0]) : i();
    }
}
