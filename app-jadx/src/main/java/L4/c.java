package L4;

import Ud.AbstractC2279u;
import Ud.S;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final List a(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(AbstractC2279u.m0(list)) : AbstractC2279u.m();
    }

    public static final Map b(Map map) {
        int size = map.size();
        if (size == 0) {
            return S.i();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) AbstractC2279u.l0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
