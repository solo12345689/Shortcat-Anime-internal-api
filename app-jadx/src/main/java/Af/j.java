package Af;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class j extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f425b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f426a = new b();

        private b() {
        }

        public static b b() {
            return f426a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f427b;

        public c() {
            super();
            this.f427b = ((AbstractList) j.this).modCount;
        }

        @Override // Af.j.d
        protected void b() {
            if (((AbstractList) j.this).modCount == this.f427b) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) j.this).modCount + "; expected: " + this.f427b);
        }

        @Override // Af.j.d
        protected Object c() {
            return j.this.f425b;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            j.this.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f429a;

        private d() {
        }

        protected abstract void b();

        protected abstract Object c();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f429a;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f429a) {
                throw new NoSuchElementException();
            }
            this.f429a = true;
            b();
            return c();
        }
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        int i10 = this.f424a;
        if (i10 == 0) {
            this.f425b = obj;
        } else if (i10 == 1) {
            this.f425b = new Object[]{this.f425b, obj};
        } else {
            Object[] objArr = (Object[]) this.f425b;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f425b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f424a] = obj;
        }
        this.f424a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f425b = null;
        this.f424a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f424a)) {
            return i11 == 1 ? this.f425b : ((Object[]) this.f425b)[i10];
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f424a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        int i10 = this.f424a;
        if (i10 == 0) {
            b bVarB = b.b();
            if (bVarB == null) {
                b(2);
            }
            return bVarB;
        }
        if (i10 == 1) {
            return new c();
        }
        Iterator it = super.iterator();
        if (it == null) {
            b(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        int i11;
        Object obj;
        if (i10 < 0 || i10 >= (i11 = this.f424a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f424a);
        }
        if (i11 == 1) {
            obj = this.f425b;
            this.f425b = null;
        } else {
            Object[] objArr = (Object[]) this.f425b;
            Object obj2 = objArr[i10];
            if (i11 == 2) {
                this.f425b = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f424a - 1] = null;
            }
            obj = obj2;
        }
        this.f424a--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f424a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f424a);
        }
        if (i11 == 1) {
            Object obj2 = this.f425b;
            this.f425b = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f425b;
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f424a;
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        int i10 = this.f424a;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f425b, 0, i10, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            b(4);
        }
        int length = objArr.length;
        int i10 = this.f424a;
        if (i10 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f425b;
                return objArr2;
            }
            objArr[0] = this.f425b;
        } else {
            if (length < i10) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f425b, i10, objArr.getClass());
                if (objArrCopyOf == null) {
                    b(6);
                }
                return objArrCopyOf;
            }
            if (i10 != 0) {
                System.arraycopy(this.f425b, 0, objArr, 0, i10);
            }
        }
        int i11 = this.f424a;
        if (length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f424a)) {
            if (i11 == 0) {
                this.f425b = obj;
            } else if (i11 == 1 && i10 == 0) {
                this.f425b = new Object[]{obj, this.f425b};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f425b;
                } else {
                    Object[] objArr2 = (Object[]) this.f425b;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f424a - i10);
                }
                objArr[i10] = obj;
                this.f425b = objArr;
            }
            this.f424a++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f424a);
    }
}
