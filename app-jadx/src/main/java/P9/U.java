package P9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class U extends AbstractC2013w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f13633c;

    U(Object obj) {
        this.f13633c = O9.n.j(obj);
    }

    @Override // P9.AbstractC2013w, P9.AbstractC2009s
    public AbstractC2011u b() {
        return AbstractC2011u.B(this.f13633c);
    }

    @Override // P9.AbstractC2009s
    int c(Object[] objArr, int i10) {
        objArr[i10] = this.f13633c;
        return i10 + 1;
    }

    @Override // P9.AbstractC2009s, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f13633c.equals(obj);
    }

    @Override // P9.AbstractC2013w, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13633c.hashCode();
    }

    @Override // P9.AbstractC2009s
    boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l */
    public X iterator() {
        return AbstractC2015y.q(this.f13633c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f13633c.toString() + ']';
    }
}
