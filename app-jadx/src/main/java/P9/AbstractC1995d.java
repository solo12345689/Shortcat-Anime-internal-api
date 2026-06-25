package P9;

import P9.AbstractC1997f;
import P9.C;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: P9.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1995d extends AbstractC1997f implements Serializable {

    /* JADX INFO: renamed from: e */
    private transient Map f13644e;

    /* JADX INFO: renamed from: f */
    private transient int f13645f;

    /* JADX INFO: renamed from: P9.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC0223d {
        b() {
            super();
        }

        @Override // P9.AbstractC1995d.AbstractC0223d
        /* JADX INFO: renamed from: c */
        public Map.Entry b(Object obj, Object obj2) {
            return C.d(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: P9.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c extends C.f {

        /* JADX INFO: renamed from: c */
        final transient Map f13648c;

        /* JADX INFO: renamed from: P9.d$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends C.c {
            a() {
            }

            @Override // P9.C.c
            Map b() {
                return c.this;
            }

            @Override // P9.C.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractC2000i.c(c.this.f13648c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC1995d.this.y(entry.getKey());
                return true;
            }
        }

        /* JADX INFO: renamed from: P9.d$c$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b implements Iterator {

            /* JADX INFO: renamed from: a */
            final Iterator f13651a;

            /* JADX INFO: renamed from: b */
            Collection f13652b;

            b() {
                this.f13651a = c.this.f13648c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f13651a.next();
                this.f13652b = (Collection) entry.getValue();
                return c.this.f(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f13651a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                O9.n.q(this.f13652b != null, "no calls to next() since the last call to remove()");
                this.f13651a.remove();
                AbstractC1995d.q(AbstractC1995d.this, this.f13652b.size());
                this.f13652b.clear();
                this.f13652b = null;
            }
        }

        c(Map map) {
            this.f13648c = map;
        }

        @Override // P9.C.f
        protected Set a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f13648c == AbstractC1995d.this.f13644e) {
                AbstractC1995d.this.clear();
            } else {
                AbstractC2015y.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return C.g(this.f13648c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d */
        public Collection get(Object obj) {
            Collection collection = (Collection) C.h(this.f13648c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC1995d.this.A(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f13648c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection collectionT = AbstractC1995d.this.t();
            collectionT.addAll(collection);
            AbstractC1995d.q(AbstractC1995d.this, collection.size());
            collection.clear();
            return collectionT;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f13648c.equals(obj);
        }

        Map.Entry f(Map.Entry entry) {
            Object key = entry.getKey();
            return C.d(key, AbstractC1995d.this.A(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f13648c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractC1995d.this.i();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f13648c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f13648c.toString();
        }
    }

    /* JADX INFO: renamed from: P9.d$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private abstract class AbstractC0223d implements Iterator {

        /* JADX INFO: renamed from: a */
        final Iterator f13654a;

        /* JADX INFO: renamed from: b */
        Object f13655b = null;

        /* JADX INFO: renamed from: c */
        Collection f13656c = null;

        /* JADX INFO: renamed from: d */
        Iterator f13657d = AbstractC2015y.f();

        AbstractC0223d() {
            this.f13654a = AbstractC1995d.this.f13644e.entrySet().iterator();
        }

        abstract Object b(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13654a.hasNext() || this.f13657d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f13657d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f13654a.next();
                this.f13655b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f13656c = collection;
                this.f13657d = collection.iterator();
            }
            return b(I.a(this.f13655b), this.f13657d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f13657d.remove();
            Collection collection = this.f13656c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f13654a.remove();
            }
            AbstractC1995d.o(AbstractC1995d.this);
        }
    }

    /* JADX INFO: renamed from: P9.d$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class e extends C.d {

        /* JADX INFO: renamed from: P9.d$e$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Iterator {

            /* JADX INFO: renamed from: a */
            Map.Entry f13660a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Iterator f13661b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ e f13662c;

            a(e eVar, Iterator it) {
                this.f13661b = it;
                this.f13662c = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f13661b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f13661b.next();
                this.f13660a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                O9.n.q(this.f13660a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f13660a.getValue();
                this.f13661b.remove();
                AbstractC1995d.q(AbstractC1995d.this, collection.size());
                collection.clear();
                this.f13660a = null;
            }
        }

        e(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC2015y.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return b().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || b().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return b().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(this, b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) b().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractC1995d.q(AbstractC1995d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: P9.d$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class f extends i implements NavigableMap {
        f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryCeilingEntry = i().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return i().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return AbstractC1995d.this.new f(i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry entryFirstEntry = i().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry entryFloorEntry = i().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return i().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry entryHigherEntry = i().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return i().higherKey(obj);
        }

        @Override // P9.AbstractC1995d.i
        /* JADX INFO: renamed from: j */
        public NavigableSet g() {
            return AbstractC1995d.this.new g(i());
        }

        @Override // P9.AbstractC1995d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: k */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // P9.AbstractC1995d.i, P9.AbstractC1995d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry entryLastEntry = i().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry entryLowerEntry = i().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return i().lowerKey(obj);
        }

        Map.Entry m(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionT = AbstractC1995d.this.t();
            collectionT.addAll((Collection) entry.getValue());
            it.remove();
            return C.d(entry.getKey(), AbstractC1995d.this.z(collectionT));
        }

        @Override // P9.AbstractC1995d.i
        /* JADX INFO: renamed from: n */
        public NavigableMap i() {
            return (NavigableMap) super.i();
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return h();
        }

        @Override // P9.AbstractC1995d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: o */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // P9.AbstractC1995d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: p */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return m(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z10) {
            return AbstractC1995d.this.new f(i().headMap(obj, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
            return AbstractC1995d.this.new f(i().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z10) {
            return AbstractC1995d.this.new f(i().tailMap(obj, z10));
        }
    }

    /* JADX INFO: renamed from: P9.d$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class g extends j implements NavigableSet {
        g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return c().ceilingKey(obj);
        }

        @Override // P9.AbstractC1995d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: d */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return AbstractC1995d.this.new g(c().descendingMap());
        }

        @Override // P9.AbstractC1995d.j
        /* JADX INFO: renamed from: e */
        public NavigableMap c() {
            return (NavigableMap) super.c();
        }

        @Override // P9.AbstractC1995d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: f */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return c().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return c().higherKey(obj);
        }

        @Override // P9.AbstractC1995d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: i */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return c().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return AbstractC2015y.n(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return AbstractC2015y.n(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z10) {
            return AbstractC1995d.this.new g(c().headMap(obj, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return AbstractC1995d.this.new g(c().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z10) {
            return AbstractC1995d.this.new g(c().tailMap(obj, z10));
        }
    }

    /* JADX INFO: renamed from: P9.d$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class h extends l implements RandomAccess {
        h(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }
    }

    /* JADX INFO: renamed from: P9.d$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class i extends c implements SortedMap {

        /* JADX INFO: renamed from: e */
        SortedSet f13666e;

        i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return i().firstKey();
        }

        SortedSet g() {
            return AbstractC1995d.this.new j(i());
        }

        @Override // P9.AbstractC1995d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f13666e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetG = g();
            this.f13666e = sortedSetG;
            return sortedSetG;
        }

        public SortedMap headMap(Object obj) {
            return AbstractC1995d.this.new i(i().headMap(obj));
        }

        SortedMap i() {
            return (SortedMap) this.f13648c;
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return i().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return AbstractC1995d.this.new i(i().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return AbstractC1995d.this.new i(i().tailMap(obj));
        }
    }

    /* JADX INFO: renamed from: P9.d$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class j extends e implements SortedSet {
        j(SortedMap sortedMap) {
            super(sortedMap);
        }

        SortedMap c() {
            return (SortedMap) super.b();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return c().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return AbstractC1995d.this.new j(c().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return c().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return AbstractC1995d.this.new j(c().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return AbstractC1995d.this.new j(c().tailMap(obj));
        }
    }

    protected AbstractC1995d(Map map) {
        O9.n.d(map.isEmpty());
        this.f13644e = map;
    }

    static /* synthetic */ int m(AbstractC1995d abstractC1995d) {
        int i10 = abstractC1995d.f13645f;
        abstractC1995d.f13645f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int o(AbstractC1995d abstractC1995d) {
        int i10 = abstractC1995d.f13645f;
        abstractC1995d.f13645f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int p(AbstractC1995d abstractC1995d, int i10) {
        int i11 = abstractC1995d.f13645f + i10;
        abstractC1995d.f13645f = i11;
        return i11;
    }

    static /* synthetic */ int q(AbstractC1995d abstractC1995d, int i10) {
        int i11 = abstractC1995d.f13645f - i10;
        abstractC1995d.f13645f = i11;
        return i11;
    }

    public static Iterator x(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void y(Object obj) {
        Collection collection = (Collection) C.i(this.f13644e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f13645f -= size;
        }
    }

    abstract Collection A(Object obj, Collection collection);

    final List B(Object obj, List list, k kVar) {
        return list instanceof RandomAccess ? new h(obj, list, kVar) : new l(obj, list, kVar);
    }

    @Override // P9.AbstractC1997f, P9.D
    public Collection a() {
        return super.a();
    }

    @Override // P9.D
    public void clear() {
        Iterator it = this.f13644e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f13644e.clear();
        this.f13645f = 0;
    }

    @Override // P9.AbstractC1997f
    Collection e() {
        return new AbstractC1997f.a();
    }

    @Override // P9.AbstractC1997f
    Collection g() {
        return new AbstractC1997f.b();
    }

    @Override // P9.D
    public Collection get(Object obj) {
        Collection collectionU = (Collection) this.f13644e.get(obj);
        if (collectionU == null) {
            collectionU = u(obj);
        }
        return A(obj, collectionU);
    }

    @Override // P9.AbstractC1997f
    Iterator h() {
        return new b();
    }

    @Override // P9.AbstractC1997f
    Iterator j() {
        return new a();
    }

    @Override // P9.D
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f13644e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f13645f++;
            return true;
        }
        Collection collectionU = u(obj);
        if (!collectionU.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f13645f++;
        this.f13644e.put(obj, collectionU);
        return true;
    }

    @Override // P9.D
    public int size() {
        return this.f13645f;
    }

    abstract Collection t();

    Collection u(Object obj) {
        return t();
    }

    final Map v() {
        Map map = this.f13644e;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f13644e) : map instanceof SortedMap ? new i((SortedMap) this.f13644e) : new c(this.f13644e);
    }

    @Override // P9.AbstractC1997f, P9.D
    public Collection values() {
        return super.values();
    }

    final Set w() {
        Map map = this.f13644e;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f13644e) : map instanceof SortedMap ? new j((SortedMap) this.f13644e) : new e(this.f13644e);
    }

    abstract Collection z(Collection collection);

    /* JADX INFO: renamed from: P9.d$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class k extends AbstractCollection {

        /* JADX INFO: renamed from: a */
        final Object f13669a;

        /* JADX INFO: renamed from: b */
        Collection f13670b;

        /* JADX INFO: renamed from: c */
        final k f13671c;

        /* JADX INFO: renamed from: d */
        final Collection f13672d;

        k(Object obj, Collection collection, k kVar) {
            this.f13669a = obj;
            this.f13670b = collection;
            this.f13671c = kVar;
            this.f13672d = kVar == null ? null : kVar.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            f();
            boolean zIsEmpty = this.f13670b.isEmpty();
            boolean zAdd = this.f13670b.add(obj);
            if (zAdd) {
                AbstractC1995d.m(AbstractC1995d.this);
                if (zIsEmpty) {
                    b();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f13670b.addAll(collection);
            if (zAddAll) {
                AbstractC1995d.p(AbstractC1995d.this, this.f13670b.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        void b() {
            k kVar = this.f13671c;
            if (kVar != null) {
                kVar.b();
            } else {
                AbstractC1995d.this.f13644e.put(this.f13669a, this.f13670b);
            }
        }

        k c() {
            return this.f13671c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f13670b.clear();
            AbstractC1995d.q(AbstractC1995d.this, size);
            i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            f();
            return this.f13670b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            f();
            return this.f13670b.containsAll(collection);
        }

        Collection d() {
            return this.f13670b;
        }

        Object e() {
            return this.f13669a;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.f13670b.equals(obj);
        }

        void f() {
            Collection collection;
            k kVar = this.f13671c;
            if (kVar != null) {
                kVar.f();
                if (this.f13671c.d() != this.f13672d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f13670b.isEmpty() || (collection = (Collection) AbstractC1995d.this.f13644e.get(this.f13669a)) == null) {
                    return;
                }
                this.f13670b = collection;
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            f();
            return this.f13670b.hashCode();
        }

        void i() {
            k kVar = this.f13671c;
            if (kVar != null) {
                kVar.i();
            } else if (this.f13670b.isEmpty()) {
                AbstractC1995d.this.f13644e.remove(this.f13669a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            f();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            f();
            boolean zRemove = this.f13670b.remove(obj);
            if (zRemove) {
                AbstractC1995d.o(AbstractC1995d.this);
                i();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f13670b.removeAll(collection);
            if (zRemoveAll) {
                AbstractC1995d.p(AbstractC1995d.this, this.f13670b.size() - size);
                i();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            O9.n.j(collection);
            int size = size();
            boolean zRetainAll = this.f13670b.retainAll(collection);
            if (zRetainAll) {
                AbstractC1995d.p(AbstractC1995d.this, this.f13670b.size() - size);
                i();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            f();
            return this.f13670b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            f();
            return this.f13670b.toString();
        }

        /* JADX INFO: renamed from: P9.d$k$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Iterator {

            /* JADX INFO: renamed from: a */
            final Iterator f13674a;

            /* JADX INFO: renamed from: b */
            final Collection f13675b;

            a() {
                Collection collection = k.this.f13670b;
                this.f13675b = collection;
                this.f13674a = AbstractC1995d.x(collection);
            }

            Iterator b() {
                c();
                return this.f13674a;
            }

            void c() {
                k.this.f();
                if (k.this.f13670b != this.f13675b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.f13674a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                c();
                return this.f13674a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f13674a.remove();
                AbstractC1995d.o(AbstractC1995d.this);
                k.this.i();
            }

            a(Iterator it) {
                this.f13675b = k.this.f13670b;
                this.f13674a = it;
            }
        }
    }

    /* JADX INFO: renamed from: P9.d$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class l extends k implements List {

        /* JADX INFO: renamed from: P9.d$l$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private class a extends k.a implements ListIterator {
            a() {
                super();
            }

            private ListIterator d() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = l.this.isEmpty();
                d().add(obj);
                AbstractC1995d.m(AbstractC1995d.this);
                if (zIsEmpty) {
                    l.this.b();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                d().set(obj);
            }

            public a(int i10) {
                super(l.this.l().listIterator(i10));
            }
        }

        l(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            f();
            boolean zIsEmpty = d().isEmpty();
            l().add(i10, obj);
            AbstractC1995d.m(AbstractC1995d.this);
            if (zIsEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = l().addAll(i10, collection);
            if (zAddAll) {
                AbstractC1995d.p(AbstractC1995d.this, d().size() - size);
                if (size == 0) {
                    b();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public Object get(int i10) {
            f();
            return l().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            f();
            return l().indexOf(obj);
        }

        List l() {
            return (List) d();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            f();
            return l().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public Object remove(int i10) {
            f();
            Object objRemove = l().remove(i10);
            AbstractC1995d.o(AbstractC1995d.this);
            i();
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            f();
            return l().set(i10, obj);
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            f();
            return AbstractC1995d.this.B(e(), l().subList(i10, i11), c() == null ? this : c());
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            f();
            return new a(i10);
        }
    }

    /* JADX INFO: renamed from: P9.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC0223d {
        a() {
            super();
        }

        @Override // P9.AbstractC1995d.AbstractC0223d
        Object b(Object obj, Object obj2) {
            return obj2;
        }
    }
}
