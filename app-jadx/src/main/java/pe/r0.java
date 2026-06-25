package Pe;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13932a;

    public r0(Map map) {
        AbstractC5504s.h(map, "map");
        this.f13932a = map;
    }

    public final r0 a() {
        Map map = this.f13932a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ud.S.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C2023h.c((C2023h) entry.getValue(), null, null, false, true, 7, null));
        }
        return new r0(linkedHashMap);
    }

    public final Map b() {
        return this.f13932a;
    }
}
