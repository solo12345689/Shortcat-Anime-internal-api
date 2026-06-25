package rf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import ye.G;

/* JADX INFO: renamed from: rf.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6318h {

    /* JADX INFO: renamed from: a */
    private static final G f58776a = new G("KotlinTypeRefiner");

    public static final G a() {
        return f58776a;
    }

    public static final List b(AbstractC6317g abstractC6317g, Iterable types) {
        AbstractC5504s.h(abstractC6317g, "<this>");
        AbstractC5504s.h(types, "types");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC6317g.a((S) it.next()));
        }
        return arrayList;
    }
}
