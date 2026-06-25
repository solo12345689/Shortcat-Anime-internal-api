package Ud;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class Y extends AbstractC2267h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19493a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements ListIterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListIterator f19494a;

        a(int i10) {
            this.f19494a = Y.this.f19493a.listIterator(C.Y(Y.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f19494a.add(obj);
            this.f19494a.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19494a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19494a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f19494a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return C.X(Y.this, this.f19494a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f19494a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return C.X(Y.this, this.f19494a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f19494a.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f19494a.set(obj);
        }
    }

    public Y(List delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f19493a = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f19493a.add(C.Y(this, i10), obj);
    }

    @Override // Ud.AbstractC2267h
    public int b() {
        return this.f19493a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f19493a.clear();
    }

    @Override // Ud.AbstractC2267h
    public Object d(int i10) {
        return this.f19493a.remove(C.W(this, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f19493a.get(C.W(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return this.f19493a.set(C.W(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
