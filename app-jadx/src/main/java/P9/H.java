package P9;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class H extends K implements Serializable {

    /* JADX INFO: renamed from: a */
    static final H f13591a = new H();

    private H() {
    }

    @Override // P9.K
    public K e() {
        return Q.f13622a;
    }

    @Override // P9.K, java.util.Comparator
    /* JADX INFO: renamed from: f */
    public int compare(Comparable comparable, Comparable comparable2) {
        O9.n.j(comparable);
        O9.n.j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
