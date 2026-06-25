package V;

import c4.InterfaceC3075c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import s0.s1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final d a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            InterfaceC3075c interfaceC3075c = (InterfaceC3075c) it.next();
            if (AbstractC5504s.c(interfaceC3075c.a(), InterfaceC3075c.b.f33466d) && AbstractC5504s.c(interfaceC3075c.getState(), InterfaceC3075c.C0564c.f33470d)) {
                z10 = true;
            }
            arrayList.add(new c(s1.e(interfaceC3075c.getBounds()), AbstractC5504s.c(interfaceC3075c.getState(), InterfaceC3075c.C0564c.f33469c), AbstractC5504s.c(interfaceC3075c.a(), InterfaceC3075c.b.f33465c), interfaceC3075c.b(), AbstractC5504s.c(interfaceC3075c.c(), InterfaceC3075c.a.f33462d)));
        }
        return new d(z10, arrayList);
    }
}
