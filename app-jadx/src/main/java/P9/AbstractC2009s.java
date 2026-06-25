package P9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: renamed from: P9.s */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2009s extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: a */
    private static final Object[] f13718a = new Object[0];

    /* JADX INFO: renamed from: P9.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class a extends b {

        /* JADX INFO: renamed from: a */
        Object[] f13719a;

        /* JADX INFO: renamed from: b */
        int f13720b;

        /* JADX INFO: renamed from: c */
        boolean f13721c;

        a(int i10) {
            AbstractC1999h.b(i10, "initialCapacity");
            this.f13719a = new Object[i10];
            this.f13720b = 0;
        }

        private void g(int i10) {
            Object[] objArr = this.f13719a;
            int iC = b.c(objArr.length, this.f13720b + i10);
            if (iC > objArr.length || this.f13721c) {
                this.f13719a = Arrays.copyOf(this.f13719a, iC);
                this.f13721c = false;
            }
        }

        @Override // P9.AbstractC2009s.b
        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size());
                if (collection instanceof AbstractC2009s) {
                    this.f13720b = ((AbstractC2009s) collection).c(this.f13719a, this.f13720b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a d(Object obj) {
            O9.n.j(obj);
            g(1);
            Object[] objArr = this.f13719a;
            int i10 = this.f13720b;
            this.f13720b = i10 + 1;
            objArr[i10] = obj;
            return this;
        }

        public b e(Object... objArr) {
            f(objArr, objArr.length);
            return this;
        }

        final void f(Object[] objArr, int i10) {
            J.c(objArr, i10);
            g(i10);
            System.arraycopy(objArr, 0, this.f13719a, this.f13720b, i10);
            this.f13720b += i10;
        }
    }

    /* JADX INFO: renamed from: P9.s$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {
        b() {
        }

        static int c(int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i11 <= i10) {
                return i10;
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b a(Object obj);

        public b b(Iterable iterable) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    AbstractC2009s() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC2011u b();

    abstract int c(Object[] objArr, int i10);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    Object[] d() {
        return null;
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    int f() {
        throw new UnsupportedOperationException();
    }

    abstract boolean i();

    /* JADX INFO: renamed from: l */
    public abstract X iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f13718a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        O9.n.j(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrD = d();
            if (objArrD != null) {
                return L.a(objArrD, f(), e(), objArr);
            }
            objArr = J.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        c(objArr, 0);
        return objArr;
    }
}
