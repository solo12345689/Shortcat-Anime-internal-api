package Bb;

import dg.t;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n {
    public static final t a(List list) {
        AbstractC5504s.h(list, "<this>");
        t.a aVar = new t.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            aVar.a((String) pair.c(), (String) pair.d());
        }
        return aVar.e();
    }
}
