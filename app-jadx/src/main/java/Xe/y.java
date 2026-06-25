package xe;

import Ud.AbstractC2279u;
import Ud.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;
import qf.w0;
import vf.AbstractC6867d;
import ye.InterfaceC7227e;
import ye.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class y {
    public static final w0 a(InterfaceC7227e from, InterfaceC7227e to) {
        AbstractC5504s.h(from, "from");
        AbstractC5504s.h(to, "to");
        from.q().size();
        to.q().size();
        w0.a aVar = w0.f58118c;
        List listQ = from.q();
        AbstractC5504s.g(listQ, "getDeclaredTypeParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((m0) it.next()).l());
        }
        List listQ2 = to.q();
        AbstractC5504s.g(listQ2, "getDeclaredTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(listQ2, 10));
        Iterator it2 = listQ2.iterator();
        while (it2.hasNext()) {
            AbstractC6183d0 abstractC6183d0P = ((m0) it2.next()).p();
            AbstractC5504s.g(abstractC6183d0P, "getDefaultType(...)");
            arrayList2.add(AbstractC6867d.d(abstractC6183d0P));
        }
        return w0.a.e(aVar, S.w(AbstractC2279u.j1(arrayList, arrayList2)), false, 2, null);
    }
}
