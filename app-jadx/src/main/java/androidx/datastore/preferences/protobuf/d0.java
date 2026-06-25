package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class d0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f29269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f29270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile f f29272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f29273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f29274f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends d0 {
        a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.t((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.d0
        public void q() {
            if (!p()) {
                if (l() > 0) {
                    android.support.v4.media.session.b.a(k(0).getKey());
                    throw null;
                }
                Iterator it = n().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c extends f {
        private c() {
            super(d0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.d0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(d0.this, null);
        }

        /* synthetic */ c(d0 d0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f29279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f29280b;

        d(d0 d0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f29279a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f29279a, entry.getKey()) && b(this.f29280b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f29280b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f29279a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f29280b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            d0.this.h();
            Object obj2 = this.f29280b;
            this.f29280b = obj;
            return obj2;
        }

        public String toString() {
            return this.f29279a + com.amazon.a.a.o.b.f.f34695b + this.f29280b;
        }

        d(Comparable comparable, Object obj) {
            this.f29279a = comparable;
            this.f29280b = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class f extends AbstractSet {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            d0.this.t((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = d0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(d0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            d0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d0.this.size();
        }

        /* synthetic */ f(d0 d0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ d0(a aVar) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int g(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f29269a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f29269a
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.d0$d r2 = (androidx.datastore.preferences.protobuf.d0.d) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f29269a
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.d0$d r3 = (androidx.datastore.preferences.protobuf.d0.d) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.d0.g(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f29271c) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        h();
        if (!this.f29269a.isEmpty() || (this.f29269a instanceof ArrayList)) {
            return;
        }
        this.f29269a = new ArrayList(16);
    }

    private SortedMap o() {
        h();
        if (this.f29270b.isEmpty() && !(this.f29270b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f29270b = treeMap;
            this.f29273e = treeMap.descendingMap();
        }
        return (SortedMap) this.f29270b;
    }

    static d0 r() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object u(int i10) {
        h();
        Object value = ((d) this.f29269a.remove(i10)).getValue();
        if (!this.f29270b.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            this.f29269a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f29269a.isEmpty()) {
            this.f29269a.clear();
        }
        if (this.f29270b.isEmpty()) {
            return;
        }
        this.f29270b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f29270b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f29272d == null) {
            this.f29272d = new f(this, null);
        }
        return this.f29272d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        int size = size();
        if (size != d0Var.size()) {
            return false;
        }
        int iL = l();
        if (iL != d0Var.l()) {
            return entrySet().equals(d0Var.entrySet());
        }
        for (int i10 = 0; i10 < iL; i10++) {
            if (!k(i10).equals(d0Var.k(i10))) {
                return false;
            }
        }
        if (iL != size) {
            return this.f29270b.equals(d0Var.f29270b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((d) this.f29269a.get(iG)).getValue() : this.f29270b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iHashCode += ((d) this.f29269a.get(i10)).hashCode();
        }
        return m() > 0 ? iHashCode + this.f29270b.hashCode() : iHashCode;
    }

    Set i() {
        if (this.f29274f == null) {
            this.f29274f = new c(this, null);
        }
        return this.f29274f;
    }

    public Map.Entry k(int i10) {
        return (Map.Entry) this.f29269a.get(i10);
    }

    public int l() {
        return this.f29269a.size();
    }

    public int m() {
        return this.f29270b.size();
    }

    public Iterable n() {
        return this.f29270b.isEmpty() ? Collections.EMPTY_SET : this.f29270b.entrySet();
    }

    public boolean p() {
        return this.f29271c;
    }

    public void q() {
        if (this.f29271c) {
            return;
        }
        this.f29270b = this.f29270b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f29270b);
        this.f29273e = this.f29273e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f29273e);
        this.f29271c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return u(iG);
        }
        if (this.f29270b.isEmpty()) {
            return null;
        }
        return this.f29270b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f29269a.size() + this.f29270b.size();
    }

    public Object t(Comparable comparable, Object obj) {
        h();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((d) this.f29269a.get(iG)).setValue(obj);
        }
        j();
        int i10 = -(iG + 1);
        if (i10 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.f29269a.size() == 16) {
            d dVar = (d) this.f29269a.remove(15);
            o().put(dVar.getKey(), dVar.getValue());
        }
        this.f29269a.add(i10, new d(comparable, obj));
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f29276b;

        private b() {
            this.f29275a = d0.this.f29269a.size();
        }

        private Iterator b() {
            if (this.f29276b == null) {
                this.f29276b = d0.this.f29273e.entrySet().iterator();
            }
            return this.f29276b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (b().hasNext()) {
                return (Map.Entry) b().next();
            }
            List list = d0.this.f29269a;
            int i10 = this.f29275a - 1;
            this.f29275a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f29275a;
            return (i10 > 0 && i10 <= d0.this.f29269a.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(d0 d0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f29284c;

        private e() {
            this.f29282a = -1;
        }

        private Iterator b() {
            if (this.f29284c == null) {
                this.f29284c = d0.this.f29270b.entrySet().iterator();
            }
            return this.f29284c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f29283b = true;
            int i10 = this.f29282a + 1;
            this.f29282a = i10;
            return i10 < d0.this.f29269a.size() ? (Map.Entry) d0.this.f29269a.get(this.f29282a) : (Map.Entry) b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29282a + 1 < d0.this.f29269a.size() || (!d0.this.f29270b.isEmpty() && b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f29283b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f29283b = false;
            d0.this.h();
            if (this.f29282a >= d0.this.f29269a.size()) {
                b().remove();
                return;
            }
            d0 d0Var = d0.this;
            int i10 = this.f29282a;
            this.f29282a = i10 - 1;
            d0Var.u(i10);
        }

        /* synthetic */ e(d0 d0Var, a aVar) {
            this();
        }
    }

    private d0() {
        this.f29269a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f29270b = map;
        this.f29273e = map;
    }
}
