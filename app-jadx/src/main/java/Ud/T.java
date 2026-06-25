package Ud;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class T {
    public static final Object a(Map map, Object obj) {
        AbstractC5504s.h(map, "<this>");
        if (map instanceof Q) {
            return ((Q) map).s(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
