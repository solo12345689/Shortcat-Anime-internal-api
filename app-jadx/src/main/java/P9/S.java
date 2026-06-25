package P9;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class S extends K implements Serializable {

    /* JADX INFO: renamed from: a */
    final K f13623a;

    S(K k10) {
        this.f13623a = (K) O9.n.j(k10);
    }

    @Override // P9.K, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f13623a.compare(obj2, obj);
    }

    @Override // P9.K
    public K e() {
        return this.f13623a;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof S) {
            return this.f13623a.equals(((S) obj).f13623a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f13623a.hashCode();
    }

    public String toString() {
        return this.f13623a + ".reverse()";
    }
}
