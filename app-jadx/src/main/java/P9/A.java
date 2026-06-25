package P9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class A {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends AbstractList implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f13572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final O9.f f13573b;

        /* JADX INFO: renamed from: P9.A$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0219a extends W {
            C0219a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // P9.V
            Object b(Object obj) {
                return a.this.f13573b.apply(obj);
            }
        }

        a(List list, O9.f fVar) {
            this.f13572a = (List) O9.n.j(list);
            this.f13573b = (O9.f) O9.n.j(fVar);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            return this.f13573b.apply(this.f13572a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f13572a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new C0219a(this.f13572a.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i10) {
            return this.f13573b.apply(this.f13572a.remove(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f13572a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f13572a.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends AbstractSequentialList implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f13575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final O9.f f13576b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends W {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // P9.V
            Object b(Object obj) {
                return b.this.f13576b.apply(obj);
            }
        }

        b(List list, O9.f fVar) {
            this.f13575a = (List) O9.n.j(list);
            this.f13576b = (O9.f) O9.n.j(fVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f13575a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new a(this.f13575a.listIterator(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f13575a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f13575a.size();
        }
    }

    static List a(Iterable iterable) {
        return (List) iterable;
    }

    static int b(int i10) {
        AbstractC1999h.b(i10, "arraySize");
        return S9.f.n(((long) i10) + 5 + ((long) (i10 / 10)));
    }

    static boolean c(List list, Object obj) {
        if (obj == O9.n.j(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return AbstractC2015y.e(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!O9.j.a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (O9.j.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int e(List list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (O9.j.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList h() {
        return new ArrayList();
    }

    public static ArrayList i(Iterator it) {
        ArrayList arrayListH = h();
        AbstractC2015y.a(arrayListH, it);
        return arrayListH;
    }

    public static ArrayList j(Object... objArr) {
        O9.n.j(objArr);
        ArrayList arrayList = new ArrayList(b(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List k(List list, O9.f fVar) {
        return list instanceof RandomAccess ? new a(list, fVar) : new b(list, fVar);
    }
}
