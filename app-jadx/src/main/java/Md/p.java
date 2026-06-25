package Md;

import Ud.AbstractC2279u;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import je.InterfaceC5371a;
import je.InterfaceC5376f;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements Set, InterfaceC5376f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f12395a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReferenceQueue f12396b = new ReferenceQueue();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f12397a;

        a(Iterator it) {
            this.f12397a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12397a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            T t10 = ((o) this.f12397a.next()).get();
            if (t10 != 0) {
                return t10;
            }
            throw new NoSuchElementException("The next element was garbage collected.");
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f12397a.remove();
        }
    }

    private final void d() {
        while (true) {
            Reference referencePoll = this.f12396b.poll();
            o oVar = referencePoll instanceof o ? (o) referencePoll : null;
            if (oVar == null) {
                return;
            } else {
                V.a(this.f12395a).remove(oVar);
            }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        d();
        return this.f12395a.add(new o(obj, this.f12396b));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Iterator it = elements.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (add(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    public int b() {
        return this.f12395a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f12395a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f12395a.contains(new o(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f12395a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        d();
        Iterator it = this.f12395a.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        return new a(it);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove = this.f12395a.remove(new o(obj));
        d();
        return zRemove;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Iterator it = elements.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this) {
            if (!elements.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return removeAll(AbstractC2279u.f1(arrayList));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        return AbstractC5496j.b(this, array);
    }
}
