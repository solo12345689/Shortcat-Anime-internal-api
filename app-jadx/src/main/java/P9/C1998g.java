package P9;

import java.io.Serializable;

/* JADX INFO: renamed from: P9.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C1998g extends K implements Serializable {

    /* JADX INFO: renamed from: a */
    final O9.f f13685a;

    /* JADX INFO: renamed from: b */
    final K f13686b;

    C1998g(O9.f fVar, K k10) {
        this.f13685a = (O9.f) O9.n.j(fVar);
        this.f13686b = (K) O9.n.j(k10);
    }

    @Override // P9.K, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f13686b.compare(this.f13685a.apply(obj), this.f13685a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1998g) {
            C1998g c1998g = (C1998g) obj;
            if (this.f13685a.equals(c1998g.f13685a) && this.f13686b.equals(c1998g.f13686b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return O9.j.b(this.f13685a, this.f13686b);
    }

    public String toString() {
        return this.f13686b + ".onResultOf(" + this.f13685a + ")";
    }
}
