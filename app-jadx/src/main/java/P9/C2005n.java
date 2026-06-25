package P9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: P9.n */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C2005n extends K implements Serializable {

    /* JADX INFO: renamed from: a */
    final Comparator[] f13717a;

    C2005n(Comparator comparator, Comparator comparator2) {
        this.f13717a = new Comparator[]{comparator, comparator2};
    }

    @Override // P9.K, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f13717a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2005n) {
            return Arrays.equals(this.f13717a, ((C2005n) obj).f13717a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f13717a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f13717a) + ")";
    }
}
