package t;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import u.AbstractC6702a;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6551a extends i0 implements Map {

    /* JADX INFO: renamed from: d */
    C0903a f60025d;

    /* JADX INFO: renamed from: e */
    c f60026e;

    /* JADX INFO: renamed from: f */
    e f60027f;

    /* JADX INFO: renamed from: t.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class C0903a extends AbstractSet {
        C0903a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C6551a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6551a.this.size();
        }
    }

    /* JADX INFO: renamed from: t.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class b extends AbstractC6559i {
        b() {
            super(C6551a.this.size());
        }

        @Override // t.AbstractC6559i
        protected Object b(int i10) {
            return C6551a.this.g(i10);
        }

        @Override // t.AbstractC6559i
        protected void d(int i10) {
            C6551a.this.i(i10);
        }
    }

    /* JADX INFO: renamed from: t.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class d implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: a */
        int f60031a;

        /* JADX INFO: renamed from: b */
        int f60032b = -1;

        /* JADX INFO: renamed from: c */
        boolean f60033c;

        d() {
            this.f60031a = C6551a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f60032b++;
            this.f60033c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f60033c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC6702a.c(entry.getKey(), C6551a.this.g(this.f60032b)) && AbstractC6702a.c(entry.getValue(), C6551a.this.k(this.f60032b));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f60033c) {
                return C6551a.this.g(this.f60032b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f60033c) {
                return C6551a.this.k(this.f60032b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60032b < this.f60031a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f60033c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objG = C6551a.this.g(this.f60032b);
            Object objK = C6551a.this.k(this.f60032b);
            return (objG == null ? 0 : objG.hashCode()) ^ (objK != null ? objK.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f60033c) {
                throw new IllegalStateException();
            }
            C6551a.this.i(this.f60032b);
            this.f60032b--;
            this.f60031a--;
            this.f60033c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f60033c) {
                return C6551a.this.j(this.f60032b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + com.amazon.a.a.o.b.f.f34695b + getValue();
        }
    }

    /* JADX INFO: renamed from: t.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class f extends AbstractC6559i {
        f() {
            super(C6551a.this.size());
        }

        @Override // t.AbstractC6559i
        protected Object b(int i10) {
            return C6551a.this.k(i10);
        }

        @Override // t.AbstractC6559i
        protected void d(int i10) {
            C6551a.this.i(i10);
        }
    }

    public C6551a() {
    }

    static boolean m(Set set, Object obj) {
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

    @Override // t.i0, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // t.i0, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        C0903a c0903a = this.f60025d;
        if (c0903a != null) {
            return c0903a;
        }
        C0903a c0903a2 = new C0903a();
        this.f60025d = c0903a2;
        return c0903a2;
    }

    @Override // t.i0, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f60026e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f60026e = cVar2;
        return cVar2;
    }

    public boolean l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean n(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean o(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(g(size2))) {
                i(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // t.i0, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f60027f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f60027f = eVar2;
        return eVar2;
    }

    public C6551a(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: t.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C6551a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C6551a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C6551a.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C6551a.m(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C6551a.this.size() - 1; size >= 0; size--) {
                Object objG = C6551a.this.g(size);
                iHashCode += objG == null ? 0 : objG.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C6551a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C6551a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = C6551a.this.e(obj);
            if (iE < 0) {
                return false;
            }
            C6551a.this.i(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C6551a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C6551a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C6551a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C6551a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C6551a.this.g(i10);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C6551a.this.g(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: t.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C6551a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C6551a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C6551a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C6551a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = C6551a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            C6551a.this.i(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C6551a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C6551a.this.k(i10))) {
                    C6551a.this.i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C6551a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C6551a.this.k(i10))) {
                    C6551a.this.i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return C6551a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C6551a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C6551a.this.k(i10);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C6551a.this.k(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    public C6551a(i0 i0Var) {
        super(i0Var);
    }
}
