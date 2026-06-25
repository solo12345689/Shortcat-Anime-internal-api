package P9;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class V implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f13634a;

    V(Iterator it) {
        this.f13634a = (Iterator) O9.n.j(it);
    }

    abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13634a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b(this.f13634a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f13634a.remove();
    }
}
