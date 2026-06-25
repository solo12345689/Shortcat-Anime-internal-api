package Gf;

import Td.u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class E {
    public static final Object a(Object obj, Zd.e eVar) {
        if (!(obj instanceof C)) {
            return Td.u.b(obj);
        }
        u.a aVar = Td.u.f17466b;
        return Td.u.b(Td.v.a(((C) obj).f7489a));
    }

    public static final Object b(Object obj) {
        Throwable thE = Td.u.e(obj);
        return thE == null ? obj : new C(thE, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC1623n interfaceC1623n) {
        Throwable thE = Td.u.e(obj);
        return thE == null ? obj : new C(thE, false, 2, null);
    }
}
