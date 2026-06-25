package d0;

import Ud.AbstractC2269j;
import java.util.Iterator;
import java.util.Set;
import je.InterfaceC5376f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC2269j implements Set, InterfaceC5376f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f44921a;

    public j(f fVar) {
        this.f44921a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // Ud.AbstractC2269j
    public int b() {
        return this.f44921a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f44921a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f44921a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new k(this.f44921a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f44921a.containsKey(obj)) {
            return false;
        }
        this.f44921a.remove(obj);
        return true;
    }
}
