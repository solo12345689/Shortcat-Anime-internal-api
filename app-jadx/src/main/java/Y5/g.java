package y5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends HashMap {
    private g(Map map) {
        super(map);
    }

    public static g a(Map map) {
        return new g(map);
    }

    public static Map of(Object obj, Object obj2) {
        HashMap map = new HashMap(1);
        map.put(obj, obj2);
        return Collections.unmodifiableMap(map);
    }

    public static Map of(Object obj, Object obj2, Object obj3, Object obj4) {
        HashMap map = new HashMap(2);
        map.put(obj, obj2);
        map.put(obj3, obj4);
        return Collections.unmodifiableMap(map);
    }
}
