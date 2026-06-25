package I0;

import androidx.compose.ui.layout.C2678g;
import i1.AbstractC5010c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface B {
    default int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1682h((InterfaceC1686l) list.get(i11), EnumC1688n.f8717b, EnumC1689o.f8721b));
        }
        return mo0measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), arrayList, AbstractC5010c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1682h((InterfaceC1686l) list.get(i11), EnumC1688n.f8717b, EnumC1689o.f8720a));
        }
        return mo0measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), arrayList, AbstractC5010c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    C mo0measure3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j10);

    default int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1682h((InterfaceC1686l) list.get(i11), EnumC1688n.f8716a, EnumC1689o.f8721b));
        }
        return mo0measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), arrayList, AbstractC5010c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1682h((InterfaceC1686l) list.get(i11), EnumC1688n.f8716a, EnumC1689o.f8720a));
        }
        return mo0measure3p2s80s(new C2678g(interfaceC1687m, interfaceC1687m.getLayoutDirection()), arrayList, AbstractC5010c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
