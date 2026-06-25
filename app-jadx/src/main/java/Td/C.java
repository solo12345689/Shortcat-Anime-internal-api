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
public final class C implements Collection, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f17419a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f17420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17421b;

        public a(byte[] array) {
            AbstractC5504s.h(array, "array");
            this.f17420a = array;
        }

        public byte b() {
            int i10 = this.f17421b;
            byte[] bArr = this.f17420a;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f17421b));
            }
            this.f17421b = i10 + 1;
            return B.b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17421b < this.f17420a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return B.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C(byte[] bArr) {
        this.f17419a = bArr;
    }

    public static final /* synthetic */ C b(byte[] bArr) {
        return new C(bArr);
    }

    public static byte[] d(int i10) {
        return e(new byte[i10]);
    }

    public static byte[] e(byte[] storage) {
        AbstractC5504s.h(storage, "storage");
        return storage;
    }

    public static boolean i(byte[] bArr, byte b10) {
        return AbstractC2273n.N(bArr, b10);
    }

    public static boolean l(byte[] bArr, Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof B) || !AbstractC2273n.N(bArr, ((B) obj).m())) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(byte[] bArr, Object obj) {
        return (obj instanceof C) && AbstractC5504s.c(bArr, ((C) obj).A());
    }

    public static final byte p(byte[] bArr, int i10) {
        return B.b(bArr[i10]);
    }

    public static int t(byte[] bArr) {
        return bArr.length;
    }

    public static int u(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean v(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator w(byte[] bArr) {
        return new a(bArr);
    }

    public static final void y(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String z(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public final /* synthetic */ byte[] A() {
        return this.f17419a;
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
        if (obj instanceof B) {
            return f(((B) obj).m());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        return l(this.f17419a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return n(this.f17419a, obj);
    }

    public boolean f(byte b10) {
        return i(this.f17419a, b10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return u(this.f17419a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return v(this.f17419a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return w(this.f17419a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return t(this.f17419a);
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
        return z(this.f17419a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        return AbstractC5496j.b(this, array);
    }
}
