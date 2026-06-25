package Ze;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class w extends AbstractList implements RandomAccess, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f23383a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ListIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator f23384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23385b;

        a(int i10) {
            this.f23385b = i10;
            this.f23384a = w.this.f23383a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f23384a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f23384a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f23384a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23384a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f23384a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f23384a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator f23387a;

        b() {
            this.f23387a = w.this.f23383a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f23387a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23387a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public w(n nVar) {
        this.f23383a = nVar;
    }

    @Override // Ze.n
    public d G0(int i10) {
        return this.f23383a.G0(i10);
    }

    @Override // Ze.n
    public void S1(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f23383a.get(i10);
    }

    @Override // Ze.n
    public List g() {
        return this.f23383a.g();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f23383a.size();
    }

    @Override // Ze.n
    public n J() {
        return this;
    }
}
