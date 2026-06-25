package D;

import Ud.AbstractC2279u;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final t a(List list, u uVar, List list2, int i10, int i11, int i12) {
        int index = ((t) AbstractC2279u.m0(list)).getIndex();
        int size = list2.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i13 = 0;
        while (i13 < size && ((Number) list2.get(i13)).intValue() <= index) {
            iIntValue2 = ((Number) list2.get(i13)).intValue();
            i13++;
            iIntValue = ((Number) ((i13 < 0 || i13 > AbstractC2279u.o(list2)) ? -1 : list2.get(i13))).intValue();
        }
        int size2 = list.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i14 = -1;
        for (int i15 = 0; i15 < size2; i15++) {
            t tVar = (t) list.get(i15);
            if (tVar.getIndex() == iIntValue2) {
                offset = tVar.getOffset();
                i14 = i15;
            } else if (tVar.getIndex() == iIntValue) {
                offset2 = tVar.getOffset();
            }
        }
        if (iIntValue2 == -1) {
            return null;
        }
        t tVarE = u.e(uVar, iIntValue2, 0L, 2, null);
        tVarE.h(true);
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i10, offset) : -i10;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - tVarE.getSize());
        }
        tVarE.q(iMax, i11, i12);
        if (i14 != -1) {
            list.set(i14, tVarE);
            return tVarE;
        }
        list.add(0, tVarE);
        return tVarE;
    }
}
