package We;

import Ve.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g {
    public static final List a(List list) {
        AbstractC5504s.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a.e.c cVar = (a.e.c) it.next();
            int iG = cVar.G();
            for (int i10 = 0; i10 < iG; i10++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
