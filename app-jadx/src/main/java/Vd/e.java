package Vd;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f20022a;

    public e(d backing) {
        AbstractC5504s.h(backing, "backing");
        this.f20022a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // Ud.AbstractC2269j
    public int b() {
        return this.f20022a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f20022a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return this.f20022a.q(elements);
    }

    @Override // Vd.a
    public boolean e(Map.Entry element) {
        AbstractC5504s.h(element, "element");
        return this.f20022a.t(element);
    }

    @Override // Vd.a
    public boolean f(Map.Entry element) {
        AbstractC5504s.h(element, "element");
        return this.f20022a.P(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        AbstractC5504s.h(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f20022a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f20022a.y();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        this.f20022a.o();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        this.f20022a.o();
        return super.retainAll(elements);
    }
}
