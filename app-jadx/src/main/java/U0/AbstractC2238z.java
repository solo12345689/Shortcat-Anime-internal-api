package U0;

import Ud.AbstractC2279u;
import Y0.AbstractC2485u;
import i1.InterfaceC5011d;
import java.util.List;

/* JADX INFO: renamed from: U0.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2238z {
    public static final InterfaceC2236y a(String str, Y0 y02, List list, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, List list2) {
        return d1.f.a(str, y02, list, list2, interfaceC5011d, bVar);
    }

    public static final InterfaceC2236y b(String str, Y0 y02, List list, List list2, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar) {
        return d1.f.a(str, y02, list, list2, interfaceC5011d, bVar);
    }

    public static /* synthetic */ InterfaceC2236y c(String str, Y0 y02, List list, List list2, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC2279u.m();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = AbstractC2279u.m();
        }
        return b(str, y02, list3, list2, interfaceC5011d, bVar);
    }
}
