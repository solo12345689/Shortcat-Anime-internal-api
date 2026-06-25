package V1;

import Ud.AbstractC2279u;
import Ud.S;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f19709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f19710b;

    public c(SharedPreferences prefs, Set set) {
        AbstractC5504s.h(prefs, "prefs");
        this.f19709a = prefs;
        this.f19710b = set;
    }

    public final Map a() {
        Map<String, ?> all = this.f19709a.getAll();
        AbstractC5504s.g(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.f19710b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(S.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = AbstractC2279u.f1((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }
}
