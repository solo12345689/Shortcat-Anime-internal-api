package Vd;

import Ud.AbstractC2266g;
import java.util.Collection;
import java.util.Iterator;
import je.InterfaceC5372b;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC2266g implements Collection, InterfaceC5372b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f20024a;

    public g(d backing) {
        AbstractC5504s.h(backing, "backing");
        this.f20024a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // Ud.AbstractC2266g
    public int b() {
        return this.f20024a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f20024a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f20024a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f20024a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f20024a.V();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f20024a.T(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        this.f20024a.o();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        this.f20024a.o();
        return super.retainAll(elements);
    }
}
