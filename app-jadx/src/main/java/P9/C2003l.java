package P9;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: P9.l */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C2003l extends K implements Serializable {

    /* JADX INFO: renamed from: a */
    final Comparator f13712a;

    C2003l(Comparator comparator) {
        this.f13712a = (Comparator) O9.n.j(comparator);
    }

    @Override // P9.K, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f13712a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2003l) {
            return this.f13712a.equals(((C2003l) obj).f13712a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13712a.hashCode();
    }

    public String toString() {
        return this.f13712a.toString();
    }
}
