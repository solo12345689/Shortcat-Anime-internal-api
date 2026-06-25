package Gf;

import Lf.C1902i;
import Td.u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class T {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(Zd.e eVar) {
        Object objB;
        if (eVar instanceof C1902i) {
            return ((C1902i) eVar).toString();
        }
        try {
            u.a aVar = Td.u.f17466b;
            objB = Td.u.b(eVar + '@' + b(eVar));
        } catch (Throwable th2) {
            u.a aVar2 = Td.u.f17466b;
            objB = Td.u.b(Td.v.a(th2));
        }
        if (Td.u.e(objB) != null) {
            objB = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) objB;
    }
}
