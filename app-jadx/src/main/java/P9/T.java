package P9;

import P9.AbstractC2000i;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Set f13624a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Set f13625b;

        /* JADX INFO: renamed from: P9.T$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0222a extends AbstractC1993b {

            /* JADX INFO: renamed from: c */
            final Iterator f13626c;

            /* JADX INFO: renamed from: d */
            final Iterator f13627d;

            C0222a() {
                this.f13626c = a.this.f13624a.iterator();
                this.f13627d = a.this.f13625b.iterator();
            }

            @Override // P9.AbstractC1993b
            protected Object b() {
                if (this.f13626c.hasNext()) {
                    return this.f13626c.next();
                }
                while (this.f13627d.hasNext()) {
                    Object next = this.f13627d.next();
                    if (!a.this.f13624a.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f13624a = set;
            this.f13625b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: b */
        public X iterator() {
            return new C0222a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f13624a.contains(obj) || this.f13625b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f13624a.isEmpty() && this.f13625b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f13624a.size();
            Iterator it = this.f13625b.iterator();
            while (it.hasNext()) {
                if (!this.f13624a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Set f13629a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Set f13630b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends AbstractC1993b {

            /* JADX INFO: renamed from: c */
            final Iterator f13631c;

            a() {
                this.f13631c = b.this.f13629a.iterator();
            }

            @Override // P9.AbstractC1993b
            protected Object b() {
                while (this.f13631c.hasNext()) {
                    Object next = this.f13631c.next();
                    if (b.this.f13630b.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, Set set2) {
            super(null);
            this.f13629a = set;
            this.f13630b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: b */
        public X iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f13629a.contains(obj) && this.f13630b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f13629a.containsAll(collection) && this.f13630b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f13630b, this.f13629a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f13629a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f13630b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends AbstractC2000i.a implements Set {
        c(Set set, O9.o oVar) {
            super(set, oVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return T.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return T.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends c implements SortedSet {
        d(SortedSet sortedSet, O9.o oVar) {
            super(sortedSet, oVar);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f13687a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return AbstractC2015y.h(this.f13687a.iterator(), this.f13688b);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new d(((SortedSet) this.f13687a).headSet(obj), this.f13688b);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f13687a;
            while (true) {
                Object objLast = sortedSetHeadSet.last();
                if (this.f13688b.apply(objLast)) {
                    return objLast;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new d(((SortedSet) this.f13687a).subSet(obj, obj2), this.f13688b);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new d(((SortedSet) this.f13687a).tailSet(obj), this.f13688b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class e extends AbstractSet {
        e() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return T.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) O9.n.j(collection));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class f extends AbstractSet {
        /* synthetic */ f(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: b */
        public abstract X iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private f() {
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static Set b(Set set, O9.o oVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, oVar);
        }
        if (!(set instanceof c)) {
            return new c((Set) O9.n.j(set), (O9.o) O9.n.j(oVar));
        }
        c cVar = (c) set;
        return new c((Set) cVar.f13687a, O9.p.b(cVar.f13688b, oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet c(SortedSet sortedSet, O9.o oVar) {
        if (!(sortedSet instanceof c)) {
            return new d((SortedSet) O9.n.j(sortedSet), (O9.o) O9.n.j(oVar));
        }
        c cVar = (c) sortedSet;
        return new d((SortedSet) cVar.f13687a, O9.p.b(cVar.f13688b, oVar));
    }

    static int d(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static f e(Set set, Set set2) {
        O9.n.k(set, "set1");
        O9.n.k(set2, "set2");
        return new b(set, set2);
    }

    public static HashSet f() {
        return new HashSet();
    }

    public static HashSet g(int i10) {
        return new HashSet(C.a(i10));
    }

    public static Set h() {
        return Collections.newSetFromMap(C.f());
    }

    static boolean i(Set set, Collection collection) {
        O9.n.j(collection);
        if (collection instanceof G) {
            collection = ((G) collection).a1();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : AbstractC2015y.o(set.iterator(), collection);
    }

    static boolean j(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static f k(Set set, Set set2) {
        O9.n.k(set, "set1");
        O9.n.k(set2, "set2");
        return new a(set, set2);
    }
}
