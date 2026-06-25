package Ud;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: Ud.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2272m extends AbstractC2267h {

    /* JADX INFO: renamed from: d */
    public static final a f19514d = new a(null);

    /* JADX INFO: renamed from: e */
    private static final Object[] f19515e = new Object[0];

    /* JADX INFO: renamed from: a */
    private int f19516a;

    /* JADX INFO: renamed from: b */
    private Object[] f19517b = f19515e;

    /* JADX INFO: renamed from: c */
    private int f19518c;

    /* JADX INFO: renamed from: Ud.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void B(int i10, int i11) {
        int iW = w(this.f19516a + (i10 - 1));
        int iW2 = w(this.f19516a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iW + 1;
            int iMin = Math.min(i10, Math.min(i12, iW2 + 1));
            Object[] objArr = this.f19517b;
            int i13 = iW2 - iMin;
            int i14 = iW - iMin;
            AbstractC2276q.m(objArr, objArr, i13 + 1, i14 + 1, i12);
            iW = u(i14);
            iW2 = u(i13);
            i10 -= iMin;
        }
    }

    private final void D(int i10, int i11) {
        int iW = w(this.f19516a + i11);
        int iW2 = w(this.f19516a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f19517b;
            i11 = Math.min(size, Math.min(objArr.length - iW, objArr.length - iW2));
            Object[] objArr2 = this.f19517b;
            int i12 = iW + i11;
            AbstractC2276q.m(objArr2, objArr2, iW2, iW, i12);
            iW = w(i12);
            iW2 = w(iW2 + i11);
        }
    }

    private final void e(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f19517b.length;
        while (i10 < length && it.hasNext()) {
            this.f19517b[i10] = it.next();
            i10++;
        }
        int i11 = this.f19516a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f19517b[i12] = it.next();
        }
        this.f19518c = size() + collection.size();
    }

    private final void f(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f19517b;
        AbstractC2276q.m(objArr2, objArr, 0, this.f19516a, objArr2.length);
        Object[] objArr3 = this.f19517b;
        int length = objArr3.length;
        int i11 = this.f19516a;
        AbstractC2276q.m(objArr3, objArr, length - i11, 0, i11);
        this.f19516a = 0;
        this.f19517b = objArr;
    }

    private final int i(int i10) {
        return i10 == 0 ? AbstractC2277s.f0(this.f19517b) : i10 - 1;
    }

    private final void l(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f19517b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f19515e) {
            this.f19517b = new Object[AbstractC5874j.e(i10, 10)];
        } else {
            f(AbstractC2263d.f19502a.e(objArr.length, i10));
        }
    }

    private final int p(int i10) {
        if (i10 == AbstractC2277s.f0(this.f19517b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int u(int i10) {
        return i10 < 0 ? i10 + this.f19517b.length : i10;
    }

    private final void v(int i10, int i11) {
        if (i10 < i11) {
            AbstractC2276q.w(this.f19517b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f19517b;
        AbstractC2276q.w(objArr, null, i10, objArr.length);
        AbstractC2276q.w(this.f19517b, null, 0, i11);
    }

    private final int w(int i10) {
        Object[] objArr = this.f19517b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void y() {
        ((AbstractList) this).modCount++;
    }

    public final Object A() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        y();
        l(size() + elements.size());
        e(w(this.f19516a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        y();
        l(size() + 1);
        int i10 = i(this.f19516a);
        this.f19516a = i10;
        this.f19517b[i10] = obj;
        this.f19518c = size() + 1;
    }

    public final void addLast(Object obj) {
        y();
        l(size() + 1);
        this.f19517b[w(this.f19516a + size())] = obj;
        this.f19518c = size() + 1;
    }

    @Override // Ud.AbstractC2267h
    public int b() {
        return this.f19518c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            y();
            v(this.f19516a, w(this.f19516a + size()));
        }
        this.f19516a = 0;
        this.f19518c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // Ud.AbstractC2267h
    public Object d(int i10) {
        AbstractC2263d.f19502a.b(i10, size());
        if (i10 == AbstractC2281w.o(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        y();
        int iW = w(this.f19516a + i10);
        Object obj = this.f19517b[iW];
        if (i10 < (size() >> 1)) {
            int i11 = this.f19516a;
            if (iW >= i11) {
                Object[] objArr = this.f19517b;
                AbstractC2276q.m(objArr, objArr, i11 + 1, i11, iW);
            } else {
                Object[] objArr2 = this.f19517b;
                AbstractC2276q.m(objArr2, objArr2, 1, 0, iW);
                Object[] objArr3 = this.f19517b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f19516a;
                AbstractC2276q.m(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f19517b;
            int i13 = this.f19516a;
            objArr4[i13] = null;
            this.f19516a = p(i13);
        } else {
            int iW2 = w(this.f19516a + AbstractC2281w.o(this));
            if (iW <= iW2) {
                Object[] objArr5 = this.f19517b;
                AbstractC2276q.m(objArr5, objArr5, iW, iW + 1, iW2 + 1);
            } else {
                Object[] objArr6 = this.f19517b;
                AbstractC2276q.m(objArr6, objArr6, iW, iW + 1, objArr6.length);
                Object[] objArr7 = this.f19517b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC2276q.m(objArr7, objArr7, 0, 1, iW2 + 1);
            }
            this.f19517b[iW2] = null;
        }
        this.f19518c = size() - 1;
        return obj;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f19517b[this.f19516a];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC2263d.f19502a.b(i10, size());
        return this.f19517b[w(this.f19516a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iW = w(this.f19516a + size());
        int length = this.f19516a;
        if (length < iW) {
            while (length < iW) {
                if (AbstractC5504s.c(obj, this.f19517b[length])) {
                    i10 = this.f19516a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iW) {
            return -1;
        }
        int length2 = this.f19517b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iW; i11++) {
                    if (AbstractC5504s.c(obj, this.f19517b[i11])) {
                        length = i11 + this.f19517b.length;
                        i10 = this.f19516a;
                    }
                }
                return -1;
            }
            if (AbstractC5504s.c(obj, this.f19517b[length])) {
                i10 = this.f19516a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f19517b[w(this.f19516a + AbstractC2281w.o(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iF0;
        int i10;
        int iW = w(this.f19516a + size());
        int i11 = this.f19516a;
        if (i11 < iW) {
            iF0 = iW - 1;
            if (i11 <= iF0) {
                while (!AbstractC5504s.c(obj, this.f19517b[iF0])) {
                    if (iF0 != i11) {
                        iF0--;
                    }
                }
                i10 = this.f19516a;
                return iF0 - i10;
            }
            return -1;
        }
        if (i11 > iW) {
            int i12 = iW - 1;
            while (true) {
                if (-1 >= i12) {
                    iF0 = AbstractC2277s.f0(this.f19517b);
                    int i13 = this.f19516a;
                    if (i13 <= iF0) {
                        while (!AbstractC5504s.c(obj, this.f19517b[iF0])) {
                            if (iF0 != i13) {
                                iF0--;
                            }
                        }
                        i10 = this.f19516a;
                    }
                } else {
                    if (AbstractC5504s.c(obj, this.f19517b[i12])) {
                        iF0 = i12 + this.f19517b.length;
                        i10 = this.f19516a;
                        break;
                    }
                    i12--;
                }
            }
            return iF0 - i10;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iW;
        AbstractC5504s.h(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f19517b.length != 0) {
            int iW2 = w(this.f19516a + size());
            int i10 = this.f19516a;
            if (i10 < iW2) {
                iW = i10;
                while (i10 < iW2) {
                    Object obj = this.f19517b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f19517b[iW] = obj;
                        iW++;
                    }
                    i10++;
                }
                AbstractC2276q.w(this.f19517b, null, iW, iW2);
            } else {
                int length = this.f19517b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f19517b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f19517b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iW = w(i11);
                for (int i12 = 0; i12 < iW2; i12++) {
                    Object[] objArr2 = this.f19517b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f19517b[iW] = obj3;
                        iW = p(iW);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                y();
                this.f19518c = u(iW - this.f19516a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        y();
        Object[] objArr = this.f19517b;
        int i10 = this.f19516a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f19516a = p(i10);
        this.f19518c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        y();
        int iW = w(this.f19516a + AbstractC2281w.o(this));
        Object[] objArr = this.f19517b;
        Object obj = objArr[iW];
        objArr[iW] = null;
        this.f19518c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        AbstractC2263d.f19502a.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        y();
        if (i10 < size() - i11) {
            B(i10, i11);
            int iW = w(this.f19516a + i12);
            v(this.f19516a, iW);
            this.f19516a = iW;
        } else {
            D(i10, i11);
            int iW2 = w(this.f19516a + size());
            v(u(iW2 - i12), iW2);
        }
        this.f19518c = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iW;
        AbstractC5504s.h(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f19517b.length != 0) {
            int iW2 = w(this.f19516a + size());
            int i10 = this.f19516a;
            if (i10 < iW2) {
                iW = i10;
                while (i10 < iW2) {
                    Object obj = this.f19517b[i10];
                    if (elements.contains(obj)) {
                        this.f19517b[iW] = obj;
                        iW++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                AbstractC2276q.w(this.f19517b, null, iW, iW2);
            } else {
                int length = this.f19517b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f19517b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f19517b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iW = w(i11);
                for (int i12 = 0; i12 < iW2; i12++) {
                    Object[] objArr2 = this.f19517b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f19517b[iW] = obj3;
                        iW = p(iW);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                y();
                this.f19518c = u(iW - this.f19516a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC2263d.f19502a.b(i10, size());
        int iW = w(this.f19516a + i10);
        Object[] objArr = this.f19517b;
        Object obj2 = objArr[iW];
        objArr[iW] = obj;
        return obj2;
    }

    public final Object t() {
        if (isEmpty()) {
            return null;
        }
        return this.f19517b[w(this.f19516a + AbstractC2281w.o(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        if (array.length < size()) {
            array = AbstractC2274o.a(array, size());
        }
        Object[] objArr = array;
        int iW = w(this.f19516a + size());
        int i10 = this.f19516a;
        if (i10 < iW) {
            AbstractC2276q.r(this.f19517b, objArr, 0, i10, iW, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f19517b;
            AbstractC2276q.m(objArr2, objArr, 0, this.f19516a, objArr2.length);
            Object[] objArr3 = this.f19517b;
            AbstractC2276q.m(objArr3, objArr, objArr3.length - this.f19516a, 0, iW);
        }
        return AbstractC2280v.f(size(), objArr);
    }

    public final Object z() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC2263d.f19502a.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        y();
        l(size() + 1);
        int iW = w(this.f19516a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = i(iW);
            int i12 = i(this.f19516a);
            int i13 = this.f19516a;
            if (i11 >= i13) {
                Object[] objArr = this.f19517b;
                objArr[i12] = objArr[i13];
                AbstractC2276q.m(objArr, objArr, i13, i13 + 1, i11 + 1);
            } else {
                Object[] objArr2 = this.f19517b;
                AbstractC2276q.m(objArr2, objArr2, i13 - 1, i13, objArr2.length);
                Object[] objArr3 = this.f19517b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC2276q.m(objArr3, objArr3, 0, 1, i11 + 1);
            }
            this.f19517b[i11] = obj;
            this.f19516a = i12;
        } else {
            int iW2 = w(this.f19516a + size());
            if (iW < iW2) {
                Object[] objArr4 = this.f19517b;
                AbstractC2276q.m(objArr4, objArr4, iW + 1, iW, iW2);
            } else {
                Object[] objArr5 = this.f19517b;
                AbstractC2276q.m(objArr5, objArr5, 1, 0, iW2);
                Object[] objArr6 = this.f19517b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC2276q.m(objArr6, objArr6, iW + 1, iW, objArr6.length - 1);
            }
            this.f19517b[iW] = obj;
        }
        this.f19518c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC5504s.h(elements, "elements");
        AbstractC2263d.f19502a.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        y();
        l(size() + elements.size());
        int iW = w(this.f19516a + size());
        int iW2 = w(this.f19516a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f19516a;
            int length = i11 - size;
            if (iW2 < i11) {
                Object[] objArr = this.f19517b;
                AbstractC2276q.m(objArr, objArr, length, i11, objArr.length);
                if (size >= iW2) {
                    Object[] objArr2 = this.f19517b;
                    AbstractC2276q.m(objArr2, objArr2, objArr2.length - size, 0, iW2);
                } else {
                    Object[] objArr3 = this.f19517b;
                    AbstractC2276q.m(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f19517b;
                    AbstractC2276q.m(objArr4, objArr4, 0, size, iW2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f19517b;
                AbstractC2276q.m(objArr5, objArr5, length, i11, iW2);
            } else {
                Object[] objArr6 = this.f19517b;
                length += objArr6.length;
                int i12 = iW2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    AbstractC2276q.m(objArr6, objArr6, length, i11, iW2);
                } else {
                    AbstractC2276q.m(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f19517b;
                    AbstractC2276q.m(objArr7, objArr7, 0, this.f19516a + length2, iW2);
                }
            }
            this.f19516a = length;
            e(u(iW2 - size), elements);
        } else {
            int i13 = iW2 + size;
            if (iW2 < iW) {
                int i14 = size + iW;
                Object[] objArr8 = this.f19517b;
                if (i14 <= objArr8.length) {
                    AbstractC2276q.m(objArr8, objArr8, i13, iW2, iW);
                } else if (i13 >= objArr8.length) {
                    AbstractC2276q.m(objArr8, objArr8, i13 - objArr8.length, iW2, iW);
                } else {
                    int length3 = iW - (i14 - objArr8.length);
                    AbstractC2276q.m(objArr8, objArr8, 0, length3, iW);
                    Object[] objArr9 = this.f19517b;
                    AbstractC2276q.m(objArr9, objArr9, i13, iW2, length3);
                }
            } else {
                Object[] objArr10 = this.f19517b;
                AbstractC2276q.m(objArr10, objArr10, size, 0, iW);
                Object[] objArr11 = this.f19517b;
                if (i13 >= objArr11.length) {
                    AbstractC2276q.m(objArr11, objArr11, i13 - objArr11.length, iW2, objArr11.length);
                } else {
                    AbstractC2276q.m(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f19517b;
                    AbstractC2276q.m(objArr12, objArr12, i13, iW2, objArr12.length - size);
                }
            }
            e(iW2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
