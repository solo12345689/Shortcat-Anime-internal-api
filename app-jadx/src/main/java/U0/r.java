package U0;

import U0.C2197e;
import b1.AbstractC2968a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(List list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C2197e.d dVar = (C2197e.d) list.get(i12);
            if (AbstractC2201g.j(i10, i11, dVar.h(), dVar.f())) {
                if (!(i10 <= dVar.h() && dVar.f() <= i11)) {
                    AbstractC2968a.a("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new C2197e.d(dVar.g(), dVar.h() - i10, dVar.f() - i10));
            }
        }
        return arrayList;
    }
}
