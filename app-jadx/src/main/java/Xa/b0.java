package xa;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b0 extends AbstractList implements InterfaceC7093t, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7093t f64126a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements ListIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator f64127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f64128b;

        a(int i10) {
            this.f64128b = i10;
            this.f64127a = b0.this.f64126a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f64127a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f64127a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f64127a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f64127a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f64127a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f64127a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator f64130a;

        b() {
            this.f64130a = b0.this.f64126a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f64130a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64130a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public b0(InterfaceC7093t interfaceC7093t) {
        this.f64126a = interfaceC7093t;
    }

    @Override // xa.InterfaceC7093t
    public void S(AbstractC7079e abstractC7079e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f64126a.get(i10);
    }

    @Override // xa.InterfaceC7093t
    public List g() {
        return this.f64126a.g();
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
        return this.f64126a.size();
    }

    @Override // xa.InterfaceC7093t
    public InterfaceC7093t J() {
        return this;
    }
}
