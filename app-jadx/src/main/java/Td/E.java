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
public final class E implements Collection, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f17424a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f17425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17426b;

        public a(int[] array) {
            AbstractC5504s.h(array, "array");
            this.f17425a = array;
        }

        public int b() {
            int i10 = this.f17426b;
            int[] iArr = this.f17425a;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f17426b));
            }
            this.f17426b = i10 + 1;
            return D.b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17426b < this.f17425a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return D.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ E(int[] iArr) {
        this.f17424a = iArr;
    }

    public static final /* synthetic */ E b(int[] iArr) {
        return new E(iArr);
    }

    public static int[] d(int i10) {
        return e(new int[i10]);
    }

    public static int[] e(int[] storage) {
        AbstractC5504s.h(storage, "storage");
        return storage;
    }

    public static boolean i(int[] iArr, int i10) {
        return AbstractC2273n.P(iArr, i10);
    }

    public static boolean l(int[] iArr, Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof D) || !AbstractC2273n.P(iArr, ((D) obj).m())) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(int[] iArr, Object obj) {
        return (obj instanceof E) && AbstractC5504s.c(iArr, ((E) obj).A());
    }

    public static final int p(int[] iArr, int i10) {
        return D.b(iArr[i10]);
    }

    public static int t(int[] iArr) {
        return iArr.length;
    }

    public static int u(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean v(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator w(int[] iArr) {
        return new a(iArr);
    }

    public static final void y(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String z(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public final /* synthetic */ int[] A() {
        return this.f17424a;
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
        if (obj instanceof D) {
            return f(((D) obj).m());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return l(this.f17424a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return n(this.f17424a, obj);
    }

    public boolean f(int i10) {
        return i(this.f17424a, i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return u(this.f17424a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return v(this.f17424a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return w(this.f17424a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return t(this.f17424a);
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
        return z(this.f17424a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        return AbstractC5496j.b(this, array);
    }
}
