package P9;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class K implements Comparator {
    protected K() {
    }

    public static K b(Comparator comparator) {
        return comparator instanceof K ? (K) comparator : new C2003l(comparator);
    }

    public static K c() {
        return H.f13591a;
    }

    public K a(Comparator comparator) {
        return new C2005n(this, (Comparator) O9.n.j(comparator));
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public K d(O9.f fVar) {
        return new C1998g(fVar, this);
    }

    public K e() {
        return new S(this);
    }
}
