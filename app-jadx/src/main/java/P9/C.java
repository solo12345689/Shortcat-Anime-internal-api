package P9;

import P9.T;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends V {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // P9.V
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Object b(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class b implements O9.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13578a = new a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f13579b = new C0220b("VALUE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f13580c = a();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // O9.f
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: P9.C$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        enum C0220b extends b {
            C0220b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // O9.f
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i10) {
        }

        private static /* synthetic */ b[] a() {
            return new b[]{f13578a, f13579b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f13580c.clone();
        }

        /* synthetic */ b(String str, int i10, B b10) {
            this(str, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class c extends T.e {
        c() {
        }

        abstract Map b();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // P9.T.e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) O9.n.j(collection));
            } catch (UnsupportedOperationException unused) {
                return T.j(this, collection.iterator());
            }
        }

        @Override // P9.T.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) O9.n.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetG = T.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetG.add(((Map.Entry) obj).getKey());
                    }
                }
                return b().keySet().retainAll(hashSetG);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d extends T.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f13581a;

        d(Map map) {
            this.f13581a = (Map) O9.n.j(map);
        }

        Map b() {
            return this.f13581a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f13582a;

        e(Map map) {
            this.f13582a = (Map) O9.n.j(map);
        }

        final Map b() {
            return this.f13582a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return b().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return b().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C.l(b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : b().entrySet()) {
                    if (O9.j.a(obj, entry.getValue())) {
                        b().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) O9.n.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = T.f();
                for (Map.Entry entry : b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return b().keySet().removeAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) O9.n.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetF = T.f();
                for (Map.Entry entry : b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetF.add(entry.getKey());
                    }
                }
                return b().keySet().retainAll(hashSetF);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b().size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class f extends AbstractMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Set f13583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Collection f13584b;

        f() {
        }

        abstract Set a();

        Collection b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f13583a;
            if (set != null) {
                return set;
            }
            Set setA = a();
            this.f13583a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f13584b;
            if (collection != null) {
                return collection;
            }
            Collection collectionB = b();
            this.f13584b = collectionB;
            return collectionB;
        }
    }

    static int a(int i10) {
        if (i10 < 3) {
            AbstractC1999h.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static boolean b(Map map, Object obj) {
        return AbstractC2015y.d(l(map.entrySet().iterator()), obj);
    }

    static boolean c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Map.Entry d(Object obj, Object obj2) {
        return new C2010t(obj, obj2);
    }

    public static HashMap e(int i10) {
        return new HashMap(a(i10));
    }

    public static IdentityHashMap f() {
        return new IdentityHashMap();
    }

    static boolean g(Map map, Object obj) {
        O9.n.j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static Object h(Map map, Object obj) {
        O9.n.j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static Object i(Map map, Object obj) {
        O9.n.j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String j(Map map) {
        StringBuilder sbB = AbstractC2000i.b(map.size());
        sbB.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                sbB.append(", ");
            }
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
            z10 = false;
        }
        sbB.append('}');
        return sbB.toString();
    }

    static O9.f k() {
        return b.f13579b;
    }

    static Iterator l(Iterator it) {
        return new a(it);
    }
}
