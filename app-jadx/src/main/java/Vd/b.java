package Vd;

import Ud.AbstractC2263d;
import Ud.AbstractC2267h;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import je.InterfaceC5371a;
import je.InterfaceC5374d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2267h implements List, RandomAccess, Serializable, InterfaceC5374d {

    /* JADX INFO: renamed from: d */
    private static final C0348b f19982d = new C0348b(null);

    /* JADX INFO: renamed from: e */
    private static final b f19983e;

    /* JADX INFO: renamed from: a */
    private Object[] f19984a;

    /* JADX INFO: renamed from: b */
    private int f19985b;

    /* JADX INFO: renamed from: c */
    private boolean f19986c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2267h implements List, RandomAccess, Serializable, InterfaceC5374d {

        /* JADX INFO: renamed from: a */
        private Object[] f19987a;

        /* JADX INFO: renamed from: b */
        private final int f19988b;

        /* JADX INFO: renamed from: c */
        private int f19989c;

        /* JADX INFO: renamed from: d */
        private final a f19990d;

        /* JADX INFO: renamed from: e */
        private final b f19991e;

        /* JADX INFO: renamed from: Vd.b$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0347a implements ListIterator, InterfaceC5371a {

            /* JADX INFO: renamed from: a */
            private final a f19992a;

            /* JADX INFO: renamed from: b */
            private int f19993b;

            /* JADX INFO: renamed from: c */
            private int f19994c;

            /* JADX INFO: renamed from: d */
            private int f19995d;

            public C0347a(a list, int i10) {
                AbstractC5504s.h(list, "list");
                this.f19992a = list;
                this.f19993b = i10;
                this.f19994c = -1;
                this.f19995d = ((AbstractList) list).modCount;
            }

            private final void b() {
                if (((AbstractList) this.f19992a.f19991e).modCount != this.f19995d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                b();
                a aVar = this.f19992a;
                int i10 = this.f19993b;
                this.f19993b = i10 + 1;
                aVar.add(i10, obj);
                this.f19994c = -1;
                this.f19995d = ((AbstractList) this.f19992a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f19993b < this.f19992a.f19989c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f19993b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                b();
                if (this.f19993b >= this.f19992a.f19989c) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f19993b;
                this.f19993b = i10 + 1;
                this.f19994c = i10;
                return this.f19992a.f19987a[this.f19992a.f19988b + this.f19994c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f19993b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                b();
                int i10 = this.f19993b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f19993b = i11;
                this.f19994c = i11;
                return this.f19992a.f19987a[this.f19992a.f19988b + this.f19994c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f19993b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i10 = this.f19994c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f19992a.remove(i10);
                this.f19993b = this.f19994c;
                this.f19994c = -1;
                this.f19995d = ((AbstractList) this.f19992a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                b();
                int i10 = this.f19994c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f19992a.set(i10, obj);
            }
        }

        public a(Object[] backing, int i10, int i11, a aVar, b root) {
            AbstractC5504s.h(backing, "backing");
            AbstractC5504s.h(root, "root");
            this.f19987a = backing;
            this.f19988b = i10;
            this.f19989c = i11;
            this.f19990d = aVar;
            this.f19991e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void A() {
            ((AbstractList) this).modCount++;
        }

        private final Object B(int i10) {
            A();
            a aVar = this.f19990d;
            this.f19989c--;
            return aVar != null ? aVar.B(i10) : this.f19991e.L(i10);
        }

        private final void D(int i10, int i11) {
            if (i11 > 0) {
                A();
            }
            a aVar = this.f19990d;
            if (aVar != null) {
                aVar.D(i10, i11);
            } else {
                this.f19991e.M(i10, i11);
            }
            this.f19989c -= i11;
        }

        private final int F(int i10, int i11, Collection collection, boolean z10) {
            a aVar = this.f19990d;
            int iF = aVar != null ? aVar.F(i10, i11, collection, z10) : this.f19991e.N(i10, i11, collection, z10);
            if (iF > 0) {
                A();
            }
            this.f19989c -= iF;
            return iF;
        }

        private final void t(int i10, Collection collection, int i11) {
            A();
            a aVar = this.f19990d;
            if (aVar != null) {
                aVar.t(i10, collection, i11);
            } else {
                this.f19991e.y(i10, collection, i11);
            }
            this.f19987a = this.f19991e.f19984a;
            this.f19989c += i11;
        }

        private final void u(int i10, Object obj) {
            A();
            a aVar = this.f19990d;
            if (aVar != null) {
                aVar.u(i10, obj);
            } else {
                this.f19991e.z(i10, obj);
            }
            this.f19987a = this.f19991e.f19984a;
            this.f19989c++;
        }

        private final void v() {
            if (((AbstractList) this.f19991e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void w() {
            if (z()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean y(List list) {
            return Vd.c.h(this.f19987a, this.f19988b, this.f19989c, list);
        }

        private final boolean z() {
            return this.f19991e.f19986c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            w();
            v();
            u(this.f19988b + this.f19989c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            AbstractC5504s.h(elements, "elements");
            w();
            v();
            int size = elements.size();
            t(this.f19988b + this.f19989c, elements, size);
            return size > 0;
        }

        @Override // Ud.AbstractC2267h
        public int b() {
            v();
            return this.f19989c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            w();
            v();
            D(this.f19988b, this.f19989c);
        }

        @Override // Ud.AbstractC2267h
        public Object d(int i10) {
            w();
            v();
            AbstractC2263d.f19502a.b(i10, this.f19989c);
            return B(this.f19988b + i10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            v();
            if (obj != this) {
                return (obj instanceof List) && y((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            v();
            AbstractC2263d.f19502a.b(i10, this.f19989c);
            return this.f19987a[this.f19988b + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            v();
            return Vd.c.i(this.f19987a, this.f19988b, this.f19989c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            v();
            for (int i10 = 0; i10 < this.f19989c; i10++) {
                if (AbstractC5504s.c(this.f19987a[this.f19988b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            v();
            return this.f19989c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            v();
            for (int i10 = this.f19989c - 1; i10 >= 0; i10--) {
                if (AbstractC5504s.c(this.f19987a[this.f19988b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            w();
            v();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            AbstractC5504s.h(elements, "elements");
            w();
            v();
            return F(this.f19988b, this.f19989c, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            AbstractC5504s.h(elements, "elements");
            w();
            v();
            return F(this.f19988b, this.f19989c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            w();
            v();
            AbstractC2263d.f19502a.b(i10, this.f19989c);
            Object[] objArr = this.f19987a;
            int i11 = this.f19988b;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC2263d.f19502a.d(i10, i11, this.f19989c);
            return new a(this.f19987a, this.f19988b + i10, i11 - i10, this, this.f19991e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            AbstractC5504s.h(array, "array");
            v();
            int length = array.length;
            int i10 = this.f19989c;
            if (length >= i10) {
                Object[] objArr = this.f19987a;
                int i11 = this.f19988b;
                AbstractC2273n.m(objArr, array, 0, i11, i10 + i11);
                return AbstractC2279u.f(this.f19989c, array);
            }
            Object[] objArr2 = this.f19987a;
            int i12 = this.f19988b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            AbstractC5504s.g(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            v();
            return Vd.c.j(this.f19987a, this.f19988b, this.f19989c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            v();
            AbstractC2263d.f19502a.c(i10, this.f19989c);
            return new C0347a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            w();
            v();
            AbstractC2263d.f19502a.c(i10, this.f19989c);
            u(this.f19988b + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            AbstractC5504s.h(elements, "elements");
            w();
            v();
            AbstractC2263d.f19502a.c(i10, this.f19989c);
            int size = elements.size();
            t(this.f19988b + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            v();
            Object[] objArr = this.f19987a;
            int i10 = this.f19988b;
            return AbstractC2273n.t(objArr, i10, this.f19989c + i10);
        }
    }

    /* JADX INFO: renamed from: Vd.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0348b {
        public /* synthetic */ C0348b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0348b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements ListIterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a */
        private final b f19996a;

        /* JADX INFO: renamed from: b */
        private int f19997b;

        /* JADX INFO: renamed from: c */
        private int f19998c;

        /* JADX INFO: renamed from: d */
        private int f19999d;

        public c(b list, int i10) {
            AbstractC5504s.h(list, "list");
            this.f19996a = list;
            this.f19997b = i10;
            this.f19998c = -1;
            this.f19999d = ((AbstractList) list).modCount;
        }

        private final void b() {
            if (((AbstractList) this.f19996a).modCount != this.f19999d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            b();
            b bVar = this.f19996a;
            int i10 = this.f19997b;
            this.f19997b = i10 + 1;
            bVar.add(i10, obj);
            this.f19998c = -1;
            this.f19999d = ((AbstractList) this.f19996a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19997b < this.f19996a.f19985b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19997b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            b();
            if (this.f19997b >= this.f19996a.f19985b) {
                throw new NoSuchElementException();
            }
            int i10 = this.f19997b;
            this.f19997b = i10 + 1;
            this.f19998c = i10;
            return this.f19996a.f19984a[this.f19998c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f19997b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            b();
            int i10 = this.f19997b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f19997b = i11;
            this.f19998c = i11;
            return this.f19996a.f19984a[this.f19998c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f19997b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i10 = this.f19998c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f19996a.remove(i10);
            this.f19997b = this.f19998c;
            this.f19998c = -1;
            this.f19999d = ((AbstractList) this.f19996a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            b();
            int i10 = this.f19998c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f19996a.set(i10, obj);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f19986c = true;
        f19983e = bVar;
    }

    public b(int i10) {
        this.f19984a = Vd.c.d(i10);
    }

    private final void B() {
        if (this.f19986c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean D(List list) {
        return Vd.c.h(this.f19984a, 0, this.f19985b, list);
    }

    private final void F(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f19984a;
        if (i10 > objArr.length) {
            this.f19984a = Vd.c.e(this.f19984a, AbstractC2263d.f19502a.e(objArr.length, i10));
        }
    }

    private final void G(int i10) {
        F(this.f19985b + i10);
    }

    private final void I(int i10, int i11) {
        G(i11);
        Object[] objArr = this.f19984a;
        AbstractC2273n.m(objArr, objArr, i10 + i11, i10, this.f19985b);
        this.f19985b += i11;
    }

    private final void K() {
        ((AbstractList) this).modCount++;
    }

    public final Object L(int i10) {
        K();
        Object[] objArr = this.f19984a;
        Object obj = objArr[i10];
        AbstractC2273n.m(objArr, objArr, i10, i10 + 1, this.f19985b);
        Vd.c.f(this.f19984a, this.f19985b - 1);
        this.f19985b--;
        return obj;
    }

    public final void M(int i10, int i11) {
        if (i11 > 0) {
            K();
        }
        Object[] objArr = this.f19984a;
        AbstractC2273n.m(objArr, objArr, i10, i10 + i11, this.f19985b);
        Object[] objArr2 = this.f19984a;
        int i12 = this.f19985b;
        Vd.c.g(objArr2, i12 - i11, i12);
        this.f19985b -= i11;
    }

    public final int N(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f19984a[i14]) == z10) {
                Object[] objArr = this.f19984a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f19984a;
        AbstractC2273n.m(objArr2, objArr2, i10 + i13, i11 + i10, this.f19985b);
        Object[] objArr3 = this.f19984a;
        int i16 = this.f19985b;
        Vd.c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            K();
        }
        this.f19985b -= i15;
        return i15;
    }

    public final void y(int i10, Collection collection, int i11) {
        K();
        I(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f19984a[i10 + i12] = it.next();
        }
    }

    public final void z(int i10, Object obj) {
        K();
        I(i10, 1);
        this.f19984a[i10] = obj;
    }

    public final List A() {
        B();
        this.f19986c = true;
        return this.f19985b > 0 ? this : f19983e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        B();
        z(this.f19985b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        B();
        int size = elements.size();
        y(this.f19985b, elements, size);
        return size > 0;
    }

    @Override // Ud.AbstractC2267h
    public int b() {
        return this.f19985b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        B();
        M(0, this.f19985b);
    }

    @Override // Ud.AbstractC2267h
    public Object d(int i10) {
        B();
        AbstractC2263d.f19502a.b(i10, this.f19985b);
        return L(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && D((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC2263d.f19502a.b(i10, this.f19985b);
        return this.f19984a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return Vd.c.i(this.f19984a, 0, this.f19985b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f19985b; i10++) {
            if (AbstractC5504s.c(this.f19984a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f19985b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f19985b - 1; i10 >= 0; i10--) {
            if (AbstractC5504s.c(this.f19984a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        B();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        B();
        return N(0, this.f19985b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        B();
        return N(0, this.f19985b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        B();
        AbstractC2263d.f19502a.b(i10, this.f19985b);
        Object[] objArr = this.f19984a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC2263d.f19502a.d(i10, i11, this.f19985b);
        return new a(this.f19984a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        int length = array.length;
        int i10 = this.f19985b;
        if (length >= i10) {
            AbstractC2273n.m(this.f19984a, array, 0, 0, i10);
            return AbstractC2279u.f(this.f19985b, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f19984a, 0, i10, array.getClass());
        AbstractC5504s.g(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return Vd.c.j(this.f19984a, 0, this.f19985b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC2263d.f19502a.c(i10, this.f19985b);
        return new c(this, i10);
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        B();
        AbstractC2263d.f19502a.c(i10, this.f19985b);
        z(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC5504s.h(elements, "elements");
        B();
        AbstractC2263d.f19502a.c(i10, this.f19985b);
        int size = elements.size();
        y(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC2273n.t(this.f19984a, 0, this.f19985b);
    }
}
