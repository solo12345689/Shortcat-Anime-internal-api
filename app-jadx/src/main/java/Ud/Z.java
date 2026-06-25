package Ud;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
class Z extends AbstractC2263d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19496b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements ListIterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListIterator f19497a;

        a(int i10) {
            this.f19497a = Z.this.f19496b.listIterator(C.Y(Z.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19497a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19497a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f19497a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return C.X(Z.this, this.f19497a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f19497a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return C.X(Z.this, this.f19497a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public Z(List delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f19496b = delegate;
    }

    @Override // Ud.AbstractC2261b
    public int d() {
        return this.f19496b.size();
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public Object get(int i10) {
        return this.f19496b.get(C.W(this, i10));
    }

    @Override // Ud.AbstractC2263d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // Ud.AbstractC2263d, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
