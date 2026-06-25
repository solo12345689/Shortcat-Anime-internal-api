package P9;

import P9.F;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: P9.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1997f implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Collection f13679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set f13680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection f13681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Map f13682d;

    /* JADX INFO: renamed from: P9.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends F.b {
        a() {
        }

        @Override // P9.F.b
        D b() {
            return AbstractC1997f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC1997f.this.h();
        }
    }

    /* JADX INFO: renamed from: P9.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractCollection {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC1997f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC1997f.this.c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC1997f.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC1997f.this.size();
        }
    }

    AbstractC1997f() {
    }

    @Override // P9.D
    public Collection a() {
        Collection collection = this.f13679a;
        if (collection != null) {
            return collection;
        }
        Collection collectionE = e();
        this.f13679a = collectionE;
        return collectionE;
    }

    @Override // P9.D
    public Map asMap() {
        Map map = this.f13682d;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.f13682d = mapD;
        return mapD;
    }

    @Override // P9.D
    public boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(Object obj) {
        Iterator it = asMap().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map d();

    abstract Collection e();

    public boolean equals(Object obj) {
        return F.a(this, obj);
    }

    abstract Set f();

    abstract Collection g();

    abstract Iterator h();

    public int hashCode() {
        return asMap().hashCode();
    }

    public Set i() {
        Set set = this.f13680b;
        if (set != null) {
            return set;
        }
        Set setF = f();
        this.f13680b = setF;
        return setF;
    }

    abstract Iterator j();

    @Override // P9.D
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // P9.D
    public Collection values() {
        Collection collection = this.f13681c;
        if (collection != null) {
            return collection;
        }
        Collection collectionG = g();
        this.f13681c = collectionG;
        return collectionG;
    }
}
