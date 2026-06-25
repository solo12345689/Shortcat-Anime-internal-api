package X1;

import Ud.AbstractC2279u;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Set a(Set set) {
        AbstractC5504s.h(set, "set");
        Set setUnmodifiableSet = Collections.unmodifiableSet(AbstractC2279u.f1(set));
        AbstractC5504s.g(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final Map b(Map map) {
        AbstractC5504s.h(map, "map");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        AbstractC5504s.g(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }
}
