package P9;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class Q extends K implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Q f13622a = new Q();

    private Q() {
    }

    @Override // P9.K
    public K e() {
        return K.c();
    }

    @Override // P9.K, java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        O9.n.j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
