package L4;

import Gf.C1627p;
import ae.AbstractC2605b;
import dg.InterfaceC4624e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final Object a(InterfaceC4624e interfaceC4624e, Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        k kVar = new k(interfaceC4624e, c1627p);
        interfaceC4624e.O1(kVar);
        c1627p.p(kVar);
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }
}
