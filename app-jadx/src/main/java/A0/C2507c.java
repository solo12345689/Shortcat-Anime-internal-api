package a0;

import Td.C2160k;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import je.InterfaceC5371a;
import je.InterfaceC5374d;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: a0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2507c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23495d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f23496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f23497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23498c;

    /* JADX INFO: renamed from: a0.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements List, InterfaceC5374d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C2507c f23499a;

        public a(C2507c c2507c) {
            this.f23499a = c2507c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f23499a.c(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            return this.f23499a.e(i10, collection);
        }

        public int b() {
            return this.f23499a.p();
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f23499a.i();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f23499a.l(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f23499a.m(collection);
        }

        public Object d(int i10) {
            d.a(this, i10);
            return this.f23499a.y(i10);
        }

        @Override // java.util.List
        public Object get(int i10) {
            d.a(this, i10);
            return this.f23499a.f23496a[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f23499a.r(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f23499a.p() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C0410c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f23499a.v(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C0410c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return d(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f23499a.x(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f23499a.B(collection);
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            d.a(this, i10);
            return this.f23499a.D(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            d.b(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC5496j.a(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f23499a.b(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f23499a.g(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new C0410c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f23499a.w(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC5496j.b(this, objArr);
        }
    }

    /* JADX INFO: renamed from: a0.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements List, InterfaceC5374d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f23500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23502c;

        public b(List list, int i10, int i11) {
            this.f23500a = list;
            this.f23501b = i10;
            this.f23502c = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f23500a;
            int i10 = this.f23502c;
            this.f23502c = i10 + 1;
            list.add(i10, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            this.f23500a.addAll(i10 + this.f23501b, collection);
            int size = collection.size();
            this.f23502c += size;
            return size > 0;
        }

        public int b() {
            return this.f23502c - this.f23501b;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f23502c - 1;
            int i11 = this.f23501b;
            if (i11 <= i10) {
                while (true) {
                    this.f23500a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f23502c = this.f23501b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f23502c;
            for (int i11 = this.f23501b; i11 < i10; i11++) {
                if (AbstractC5504s.c(this.f23500a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public Object d(int i10) {
            d.a(this, i10);
            this.f23502c--;
            return this.f23500a.remove(i10 + this.f23501b);
        }

        @Override // java.util.List
        public Object get(int i10) {
            d.a(this, i10);
            return this.f23500a.get(i10 + this.f23501b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f23502c;
            for (int i11 = this.f23501b; i11 < i10; i11++) {
                if (AbstractC5504s.c(this.f23500a.get(i11), obj)) {
                    return i11 - this.f23501b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f23502c == this.f23501b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C0410c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f23502c - 1;
            int i11 = this.f23501b;
            if (i11 > i10) {
                return -1;
            }
            while (!AbstractC5504s.c(this.f23500a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f23501b;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C0410c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return d(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i10 = this.f23502c;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f23502c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i10 = this.f23502c;
            int i11 = i10 - 1;
            int i12 = this.f23501b;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f23500a.get(i11))) {
                        this.f23500a.remove(i11);
                        this.f23502c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f23502c;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            d.a(this, i10);
            return this.f23500a.set(i10 + this.f23501b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            d.b(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC5496j.a(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f23500a.add(i10 + this.f23501b, obj);
            this.f23502c++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new C0410c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f23502c;
            for (int i11 = this.f23501b; i11 < i10; i11++) {
                if (AbstractC5504s.c(this.f23500a.get(i11), obj)) {
                    this.f23500a.remove(i11);
                    this.f23502c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC5496j.b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f23500a.addAll(this.f23502c, collection);
            int size = collection.size();
            this.f23502c += size;
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: a0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0410c implements ListIterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f23503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23504b;

        public C0410c(List list, int i10) {
            this.f23503a = list;
            this.f23504b = i10;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f23503a.add(this.f23504b, obj);
            this.f23504b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f23504b < this.f23503a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23504b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f23503a;
            int i10 = this.f23504b;
            this.f23504b = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f23504b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f23504b - 1;
            this.f23504b = i10;
            return this.f23503a.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f23504b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f23504b - 1;
            this.f23504b = i10;
            this.f23503a.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f23503a.set(this.f23504b, obj);
        }
    }

    public C2507c(Object[] objArr, int i10) {
        this.f23496a = objArr;
        this.f23498c = i10;
    }

    public final void A(int i10) {
        Object[] objArr = this.f23496a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f23496a = objArr2;
    }

    public final boolean B(Collection collection) {
        int i10 = this.f23498c;
        for (int iP = p() - 1; -1 < iP; iP--) {
            if (!collection.contains(this.f23496a[iP])) {
                y(iP);
            }
        }
        return i10 != this.f23498c;
    }

    public final Object D(int i10, Object obj) {
        Object[] objArr = this.f23496a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final void F(int i10) {
        this.f23498c = i10;
    }

    public final void G(Comparator comparator) {
        AbstractC2273n.J(this.f23496a, comparator, 0, this.f23498c);
    }

    public final Void H(String str) {
        throw new NoSuchElementException(str);
    }

    public final void b(int i10, Object obj) {
        int i11 = this.f23498c + 1;
        if (this.f23496a.length < i11) {
            A(i11);
        }
        Object[] objArr = this.f23496a;
        int i12 = this.f23498c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f23498c++;
    }

    public final boolean c(Object obj) {
        int i10 = this.f23498c + 1;
        if (this.f23496a.length < i10) {
            A(i10);
        }
        Object[] objArr = this.f23496a;
        int i11 = this.f23498c;
        objArr[i11] = obj;
        this.f23498c = i11 + 1;
        return true;
    }

    public final boolean d(int i10, C2507c c2507c) {
        int i11 = c2507c.f23498c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f23498c + i11;
        if (this.f23496a.length < i12) {
            A(i12);
        }
        Object[] objArr = this.f23496a;
        int i13 = this.f23498c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(c2507c.f23496a, 0, objArr, i10, i11);
        this.f23498c += i11;
        return true;
    }

    public final boolean e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f23498c + size;
        if (this.f23496a.length < i12) {
            A(i12);
        }
        Object[] objArr = this.f23496a;
        int i13 = this.f23498c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                AbstractC2279u.w();
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f23498c += size;
        return true;
    }

    public final boolean f(int i10, List list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i11 = this.f23498c + size;
        if (this.f23496a.length < i11) {
            A(i11);
        }
        Object[] objArr = this.f23496a;
        int i12 = this.f23498c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f23498c += size;
        return true;
    }

    public final boolean g(Collection collection) {
        return e(this.f23498c, collection);
    }

    public final List h() {
        List list = this.f23497b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f23497b = aVar;
        return aVar;
    }

    public final void i() {
        Object[] objArr = this.f23496a;
        int i10 = this.f23498c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f23498c = 0;
    }

    public final boolean l(Object obj) {
        int iP = p() - 1;
        if (iP >= 0) {
            for (int i10 = 0; !AbstractC5504s.c(this.f23496a[i10], obj); i10++) {
                if (i10 != iP) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean m(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!l(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object n() {
        if (p() != 0) {
            return this.f23496a[0];
        }
        H("MutableVector is empty.");
        throw new C2160k();
    }

    public final Object[] o() {
        return this.f23496a;
    }

    public final int p() {
        return this.f23498c;
    }

    public final int r(Object obj) {
        Object[] objArr = this.f23496a;
        int i10 = this.f23498c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (AbstractC5504s.c(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean s() {
        return p() == 0;
    }

    public final boolean t() {
        return p() != 0;
    }

    public final Object u() {
        if (p() != 0) {
            return this.f23496a[p() - 1];
        }
        H("MutableVector is empty.");
        throw new C2160k();
    }

    public final int v(Object obj) {
        Object[] objArr = this.f23496a;
        for (int i10 = this.f23498c - 1; i10 >= 0; i10--) {
            if (AbstractC5504s.c(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean w(Object obj) {
        int iR = r(obj);
        if (iR < 0) {
            return false;
        }
        y(iR);
        return true;
    }

    public final boolean x(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f23498c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
        return i10 != this.f23498c;
    }

    public final Object y(int i10) {
        Object[] objArr = this.f23496a;
        Object obj = objArr[i10];
        if (i10 != p() - 1) {
            int i11 = i10 + 1;
            System.arraycopy(objArr, i11, objArr, i10, this.f23498c - i11);
        }
        int i12 = this.f23498c - 1;
        this.f23498c = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void z(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f23498c;
            if (i11 < i12) {
                Object[] objArr = this.f23496a;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f23498c - (i11 - i10);
            int iP = p() - 1;
            if (i13 <= iP) {
                int i14 = i13;
                while (true) {
                    this.f23496a[i14] = null;
                    if (i14 == iP) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f23498c = i13;
        }
    }
}
