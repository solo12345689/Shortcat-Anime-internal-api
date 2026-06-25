package F;

import F.B;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import oe.C5870f;

/* JADX INFO: renamed from: F.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1541l {
    public static final List a(q qVar, B b10, C1537h c1537h) {
        if (!c1537h.d() && b10.isEmpty()) {
            return AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList();
        C5870f c5870f = c1537h.d() ? new C5870f(c1537h.c(), Math.min(c1537h.b(), qVar.a() - 1)) : C5870f.f55403e.a();
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            B.a aVar = (B.a) b10.get(i10);
            int iA = r.a(qVar, aVar.getKey(), aVar.getIndex());
            int iF = c5870f.f();
            if ((iA > c5870f.i() || iF > iA) && iA >= 0 && iA < qVar.a()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int iF2 = c5870f.f();
        int i11 = c5870f.i();
        if (iF2 <= i11) {
            while (true) {
                arrayList.add(Integer.valueOf(iF2));
                if (iF2 == i11) {
                    break;
                }
                iF2++;
            }
        }
        return arrayList;
    }
}
