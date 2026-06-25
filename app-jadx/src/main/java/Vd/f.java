package Vd;

import Ud.AbstractC2269j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import je.InterfaceC5376f;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC2269j implements Set, InterfaceC5376f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f20023a;

    public f(d backing) {
        AbstractC5504s.h(backing, "backing");
        this.f20023a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // Ud.AbstractC2269j
    public int b() {
        return this.f20023a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f20023a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f20023a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f20023a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f20023a.J();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f20023a.S(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        this.f20023a.o();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        this.f20023a.o();
        return super.retainAll(elements);
    }
}
