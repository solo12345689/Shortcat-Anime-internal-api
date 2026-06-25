package Ud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Ud.x */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2282x extends AbstractC2281w {
    public static int x(Iterable iterable, int i10) {
        AbstractC5504s.h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static final Integer y(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static List z(Iterable iterable) {
        AbstractC5504s.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            B.D(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
