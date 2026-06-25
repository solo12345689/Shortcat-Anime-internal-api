package Ud;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class U extends T {
    public static Map b(Map builder) {
        AbstractC5504s.h(builder, "builder");
        return ((Vd.d) builder).m();
    }

    public static Map c() {
        return new Vd.d();
    }

    public static Map d(int i10) {
        return new Vd.d(i10);
    }

    public static int e(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map f(Pair pair) {
        AbstractC5504s.h(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.c(), pair.d());
        AbstractC5504s.g(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map g(Map map) {
        AbstractC5504s.h(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC5504s.g(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static SortedMap h(Map map, Comparator comparator) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
