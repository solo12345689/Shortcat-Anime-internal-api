package Td;

import Ud.AbstractC2273n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class G implements Collection, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f17429a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f17430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17431b;

        public a(long[] array) {
            AbstractC5504s.h(array, "array");
            this.f17430a = array;
        }

        public long b() {
            int i10 = this.f17431b;
            long[] jArr = this.f17430a;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f17431b));
            }
            this.f17431b = i10 + 1;
            return F.b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17431b < this.f17430a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return F.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ G(long[] jArr) {
        this.f17429a = jArr;
    }

    public static final /* synthetic */ G b(long[] jArr) {
        return new G(jArr);
    }

    public static long[] d(int i10) {
        return e(new long[i10]);
    }

    public static long[] e(long[] storage) {
        AbstractC5504s.h(storage, "storage");
        return storage;
    }

    public static boolean i(long[] jArr, long j10) {
        return AbstractC2273n.Q(jArr, j10);
    }

    public static boolean l(long[] jArr, Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof F) || !AbstractC2273n.Q(jArr, ((F) obj).n())) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(long[] jArr, Object obj) {
        return (obj instanceof G) && AbstractC5504s.c(jArr, ((G) obj).A());
    }

    public static final long p(long[] jArr, int i10) {
        return F.b(jArr[i10]);
    }

    public static int t(long[] jArr) {
        return jArr.length;
    }

    public static int u(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean v(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator w(long[] jArr) {
        return new a(jArr);
    }

    public static final void y(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String z(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public final /* synthetic */ long[] A() {
        return this.f17429a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof F) {
            return f(((F) obj).n());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return l(this.f17429a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return n(this.f17429a, obj);
    }

    public boolean f(long j10) {
        return i(this.f17429a, j10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return u(this.f17429a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return v(this.f17429a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return w(this.f17429a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return t(this.f17429a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    public String toString() {
        return z(this.f17429a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        return AbstractC5496j.b(this, array);
    }
}
