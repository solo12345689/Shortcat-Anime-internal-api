package d0;

import Ud.AbstractC2266g;
import java.util.Collection;
import java.util.Iterator;
import je.InterfaceC5372b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC2266g implements Collection, InterfaceC5372b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f44922a;

    public l(f fVar) {
        this.f44922a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // Ud.AbstractC2266g
    public int b() {
        return this.f44922a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f44922a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f44922a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new m(this.f44922a);
    }
}
