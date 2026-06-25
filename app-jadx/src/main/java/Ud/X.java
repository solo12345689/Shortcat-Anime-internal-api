package Ud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class X extends W {
    public static Cf.i C(Map map) {
        AbstractC5504s.h(map, "<this>");
        return F.c0(map.entrySet());
    }

    public static List D(Map map) {
        AbstractC5504s.h(map, "<this>");
        if (map.size() == 0) {
            return AbstractC2281w.m();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return AbstractC2281w.m();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC2280v.e(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
