package Y0;

import Y0.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class G {
    public final List a(List list, L l10, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            InterfaceC2484t interfaceC2484t = (InterfaceC2484t) obj;
            if (AbstractC5504s.c(interfaceC2484t.b(), l10) && H.f(interfaceC2484t.c(), i10)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj2 = list.get(i13);
            if (H.f(((InterfaceC2484t) obj2).c(), i10)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        L.a aVar = L.f22613b;
        L l11 = null;
        if (l10.compareTo(aVar.j()) < 0) {
            int size3 = list.size();
            L l12 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size3) {
                    break;
                }
                L lB = ((InterfaceC2484t) list.get(i14)).b();
                if (lB.compareTo(l10) >= 0) {
                    if (lB.compareTo(l10) <= 0) {
                        l12 = lB;
                        l11 = l12;
                        break;
                    }
                    if (l12 == null || lB.compareTo(l12) < 0) {
                        l12 = lB;
                    }
                } else if (l11 == null || lB.compareTo(l11) > 0) {
                    l11 = lB;
                }
                i14++;
            }
            if (l11 != null) {
                l12 = l11;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i11 < size4) {
                Object obj3 = list.get(i11);
                if (AbstractC5504s.c(((InterfaceC2484t) obj3).b(), l12)) {
                    arrayList3.add(obj3);
                }
                i11++;
            }
            return arrayList3;
        }
        if (l10.compareTo(aVar.k()) > 0) {
            int size5 = list.size();
            L l13 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    break;
                }
                L lB2 = ((InterfaceC2484t) list.get(i15)).b();
                if (lB2.compareTo(l10) >= 0) {
                    if (lB2.compareTo(l10) <= 0) {
                        l13 = lB2;
                        l11 = l13;
                        break;
                    }
                    if (l13 == null || lB2.compareTo(l13) < 0) {
                        l13 = lB2;
                    }
                } else if (l11 == null || lB2.compareTo(l11) > 0) {
                    l11 = lB2;
                }
                i15++;
            }
            if (l13 == null) {
                l13 = l11;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i11 < size6) {
                Object obj4 = list.get(i11);
                if (AbstractC5504s.c(((InterfaceC2484t) obj4).b(), l13)) {
                    arrayList4.add(obj4);
                }
                i11++;
            }
            return arrayList4;
        }
        L lK = aVar.k();
        int size7 = list.size();
        L l14 = null;
        L l15 = null;
        int i16 = 0;
        while (true) {
            if (i16 >= size7) {
                break;
            }
            L lB3 = ((InterfaceC2484t) list.get(i16)).b();
            if (lK == null || lB3.compareTo(lK) <= 0) {
                if (lB3.compareTo(l10) >= 0) {
                    if (lB3.compareTo(l10) <= 0) {
                        l14 = lB3;
                        l15 = l14;
                        break;
                    }
                    if (l15 == null || lB3.compareTo(l15) < 0) {
                        l15 = lB3;
                    }
                } else if (l14 == null || lB3.compareTo(l14) > 0) {
                    l14 = lB3;
                }
            }
            i16++;
        }
        if (l15 != null) {
            l14 = l15;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size8 = list.size();
        for (int i17 = 0; i17 < size8; i17++) {
            Object obj5 = list.get(i17);
            if (AbstractC5504s.c(((InterfaceC2484t) obj5).b(), l14)) {
                arrayList5.add(obj5);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        L lK2 = L.f22613b.k();
        int size9 = list.size();
        L l16 = null;
        int i18 = 0;
        while (true) {
            if (i18 >= size9) {
                break;
            }
            L lB4 = ((InterfaceC2484t) list.get(i18)).b();
            if (lK2 == null || lB4.compareTo(lK2) >= 0) {
                if (lB4.compareTo(l10) >= 0) {
                    if (lB4.compareTo(l10) <= 0) {
                        l11 = lB4;
                        l16 = l11;
                        break;
                    }
                    if (l16 == null || lB4.compareTo(l16) < 0) {
                        l16 = lB4;
                    }
                } else if (l11 == null || lB4.compareTo(l11) > 0) {
                    l11 = lB4;
                }
            }
            i18++;
        }
        if (l16 != null) {
            l11 = l16;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size10 = list.size();
        while (i11 < size10) {
            Object obj6 = list.get(i11);
            if (AbstractC5504s.c(((InterfaceC2484t) obj6).b(), l11)) {
                arrayList6.add(obj6);
            }
            i11++;
        }
        return arrayList6;
    }
}
