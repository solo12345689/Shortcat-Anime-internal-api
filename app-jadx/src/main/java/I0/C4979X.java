package i0;

import Td.C2160k;
import Y.V0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import je.InterfaceC5371a;
import je.InterfaceC5374d;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: i0.X */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4979X implements List, InterfaceC5374d {

    /* JADX INFO: renamed from: a */
    private final C4961E f48452a;

    /* JADX INFO: renamed from: b */
    private final int f48453b;

    /* JADX INFO: renamed from: c */
    private int f48454c;

    /* JADX INFO: renamed from: d */
    private int f48455d;

    /* JADX INFO: renamed from: i0.X$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements ListIterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.L f48456a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4979X f48457b;

        a(kotlin.jvm.internal.L l10, C4979X c4979x) {
            this.f48456a = l10;
            this.f48457b = c4979x;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b */
        public Void add(Object obj) {
            AbstractC4962F.j();
            throw new C2160k();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: d */
        public Void remove() {
            AbstractC4962F.j();
            throw new C2160k();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e */
        public Void set(Object obj) {
            AbstractC4962F.j();
            throw new C2160k();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f48456a.f52257a < this.f48457b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f48456a.f52257a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i10 = this.f48456a.f52257a + 1;
            AbstractC4962F.m(i10, this.f48457b.size());
            this.f48456a.f52257a = i10;
            return this.f48457b.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f48456a.f52257a + 1;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f48456a.f52257a;
            AbstractC4962F.m(i10, this.f48457b.size());
            this.f48456a.f52257a = i10 - 1;
            return this.f48457b.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f48456a.f52257a;
        }
    }

    public C4979X(C4961E c4961e, int i10, int i11) {
        this.f48452a = c4961e;
        this.f48453b = i10;
        this.f48454c = AbstractC4962F.h(c4961e);
        this.f48455d = i11 - i10;
    }

    private final void e() {
        if (AbstractC4962F.h(this.f48452a) != this.f48454c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        e();
        this.f48452a.add(this.f48453b + size(), obj);
        this.f48455d = size() + 1;
        this.f48454c = AbstractC4962F.h(this.f48452a);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        e();
        boolean zAddAll = this.f48452a.addAll(i10 + this.f48453b, collection);
        if (zAddAll) {
            this.f48455d = size() + collection.size();
            this.f48454c = AbstractC4962F.h(this.f48452a);
        }
        return zAddAll;
    }

    public int b() {
        return this.f48455d;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            e();
            C4961E c4961e = this.f48452a;
            int i10 = this.f48453b;
            c4961e.y(i10, size() + i10);
            this.f48455d = 0;
            this.f48454c = AbstractC4962F.h(this.f48452a);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Object d(int i10) {
        e();
        Object objRemove = this.f48452a.remove(this.f48453b + i10);
        this.f48455d = size() - 1;
        this.f48454c = AbstractC4962F.h(this.f48452a);
        return objRemove;
    }

    @Override // java.util.List
    public Object get(int i10) {
        e();
        AbstractC4962F.m(i10, size());
        return this.f48452a.get(this.f48453b + i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        e();
        int i10 = this.f48453b;
        Iterator it = AbstractC5874j.x(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((Ud.O) it).nextInt();
            if (AbstractC5504s.c(obj, this.f48452a.get(iNextInt))) {
                return iNextInt - this.f48453b;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        e();
        int size = this.f48453b + size();
        do {
            size--;
            if (size < this.f48453b) {
                return -1;
            }
        } while (!AbstractC5504s.c(obj, this.f48452a.get(size)));
        return size - this.f48453b;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i10) {
        return d(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
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

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        e();
        C4961E c4961e = this.f48452a;
        int i10 = this.f48453b;
        int iA = c4961e.A(collection, i10, size() + i10);
        if (iA > 0) {
            this.f48454c = AbstractC4962F.h(this.f48452a);
            this.f48455d = size() - iA;
        }
        return iA > 0;
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        AbstractC4962F.m(i10, size());
        e();
        Object obj2 = this.f48452a.set(i10 + this.f48453b, obj);
        this.f48454c = AbstractC4962F.h(this.f48452a);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            V0.a("fromIndex or toIndex are out of bounds");
        }
        e();
        C4961E c4961e = this.f48452a;
        int i12 = this.f48453b;
        return new C4979X(c4961e, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        e();
        kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        l10.f52257a = i10 - 1;
        return new a(l10, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC5496j.b(this, objArr);
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        e();
        this.f48452a.add(this.f48453b + i10, obj);
        this.f48455d = size() + 1;
        this.f48454c = AbstractC4962F.h(this.f48452a);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
