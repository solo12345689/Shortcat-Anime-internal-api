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
public final class J implements Collection, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short[] f17435a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short[] f17436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17437b;

        public a(short[] array) {
            AbstractC5504s.h(array, "array");
            this.f17436a = array;
        }

        public short b() {
            int i10 = this.f17437b;
            short[] sArr = this.f17436a;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f17437b));
            }
            this.f17437b = i10 + 1;
            return I.b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17437b < this.f17436a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return I.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ J(short[] sArr) {
        this.f17435a = sArr;
    }

    public static final /* synthetic */ J b(short[] sArr) {
        return new J(sArr);
    }

    public static short[] d(int i10) {
        return e(new short[i10]);
    }

    public static short[] e(short[] storage) {
        AbstractC5504s.h(storage, "storage");
        return storage;
    }

    public static boolean i(short[] sArr, short s10) {
        return AbstractC2273n.S(sArr, s10);
    }

    public static boolean l(short[] sArr, Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof I) || !AbstractC2273n.S(sArr, ((I) obj).m())) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(short[] sArr, Object obj) {
        return (obj instanceof J) && AbstractC5504s.c(sArr, ((J) obj).A());
    }

    public static final short p(short[] sArr, int i10) {
        return I.b(sArr[i10]);
    }

    public static int t(short[] sArr) {
        return sArr.length;
    }

    public static int u(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean v(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator w(short[] sArr) {
        return new a(sArr);
    }

    public static final void y(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String z(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public final /* synthetic */ short[] A() {
        return this.f17435a;
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
        if (obj instanceof I) {
            return f(((I) obj).m());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return l(this.f17435a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return n(this.f17435a, obj);
    }

    public boolean f(short s10) {
        return i(this.f17435a, s10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return u(this.f17435a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return v(this.f17435a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return w(this.f17435a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return t(this.f17435a);
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
        return z(this.f17435a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        return AbstractC5496j.b(this, array);
    }
}
