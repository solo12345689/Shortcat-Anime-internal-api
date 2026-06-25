package f6;

import Ud.AbstractC2279u;
import Ud.O;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46936a;

    public h(int i10) {
        this.f46936a = i10;
    }

    public final int a(int i10) {
        int i11 = i10 % this.f46936a;
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11 + this.f46936a;
    }

    public final int b() {
        return this.f46936a;
    }

    public final boolean c(int i10, int i11, int i12) {
        int iA = a(i12 + i10);
        return i10 < iA ? i10 <= i11 && i11 <= iA : (i10 <= i11 && i11 <= this.f46936a) || (i11 >= 0 && i11 <= iA);
    }

    public final List d(int i10, int i11) {
        C5870f c5870fX = AbstractC5874j.x(0, i11);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(c5870fX, 10));
        Iterator it = c5870fX.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(a(((O) it).nextInt() + i10)));
        }
        return arrayList;
    }
}
