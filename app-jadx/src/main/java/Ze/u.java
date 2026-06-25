package Ze;

import Ze.h;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract class u extends AbstractMap {

    /* JADX INFO: renamed from: a */
    private final int f23367a;

    /* JADX INFO: renamed from: b */
    private List f23368b;

    /* JADX INFO: renamed from: c */
    private Map f23369c;

    /* JADX INFO: renamed from: d */
    private boolean f23370d;

    /* JADX INFO: renamed from: e */
    private volatile e f23371e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends u {
        a(int i10) {
            super(i10, null);
        }

        @Override // Ze.u
        public void n() {
            if (!m()) {
                for (int i10 = 0; i10 < j(); i10++) {
                    Map.Entry entryI = i(i10);
                    if (((h.b) entryI.getKey()).e()) {
                        entryI.setValue(Collections.unmodifiableList((List) entryI.getValue()));
                    }
                }
                for (Map.Entry entry : k()) {
                    if (((h.b) entry.getKey()).e()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.p((h.b) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a */
        private static final Iterator f23372a = new a();

        /* JADX INFO: renamed from: b */
        private static final Iterable f23373b = new C0408b();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a implements Iterator {
            a() {
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
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: Ze.u$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class C0408b implements Iterable {
            C0408b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.f23372a;
            }
        }

        static Iterable b() {
            return f23373b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c implements Comparable, Map.Entry {

        /* JADX INFO: renamed from: a */
        private final Comparable f23374a;

        /* JADX INFO: renamed from: b */
        private Object f23375b;

        c(u uVar, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a */
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c */
        public Comparable getKey() {
            return this.f23374a;
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
            return b(this.f23374a, entry.getKey()) && b(this.f23375b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f23375b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f23374a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f23375b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            u.this.g();
            Object obj2 = this.f23375b;
            this.f23375b = obj;
            return obj2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f23374a);
            String strValueOf2 = String.valueOf(this.f23375b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append(com.amazon.a.a.o.b.f.f34695b);
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        c(Comparable comparable, Object obj) {
            this.f23374a = comparable;
            this.f23375b = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class e extends AbstractSet {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: b */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            u.this.p((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(u.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.size();
        }

        /* synthetic */ e(u uVar, a aVar) {
            this();
        }
    }

    /* synthetic */ u(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int f(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f23368b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f23368b
            java.lang.Object r2 = r2.get(r1)
            Ze.u$c r2 = (Ze.u.c) r2
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
            java.util.List r3 = r4.f23368b
            java.lang.Object r3 = r3.get(r2)
            Ze.u$c r3 = (Ze.u.c) r3
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
        throw new UnsupportedOperationException("Method not decompiled: Ze.u.f(java.lang.Comparable):int");
    }

    public void g() {
        if (this.f23370d) {
            throw new UnsupportedOperationException();
        }
    }

    private void h() {
        g();
        if (!this.f23368b.isEmpty() || (this.f23368b instanceof ArrayList)) {
            return;
        }
        this.f23368b = new ArrayList(this.f23367a);
    }

    private SortedMap l() {
        g();
        if (this.f23369c.isEmpty() && !(this.f23369c instanceof TreeMap)) {
            this.f23369c = new TreeMap();
        }
        return (SortedMap) this.f23369c;
    }

    static u o(int i10) {
        return new a(i10);
    }

    public Object q(int i10) {
        g();
        Object value = ((c) this.f23368b.remove(i10)).getValue();
        if (!this.f23369c.isEmpty()) {
            Iterator it = l().entrySet().iterator();
            this.f23368b.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f23368b.isEmpty()) {
            this.f23368b.clear();
        }
        if (this.f23369c.isEmpty()) {
            return;
        }
        this.f23369c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f23369c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f23371e == null) {
            this.f23371e = new e(this, null);
        }
        return this.f23371e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((c) this.f23368b.get(iF)).getValue() : this.f23369c.get(comparable);
    }

    public Map.Entry i(int i10) {
        return (Map.Entry) this.f23368b.get(i10);
    }

    public int j() {
        return this.f23368b.size();
    }

    public Iterable k() {
        return this.f23369c.isEmpty() ? b.b() : this.f23369c.entrySet();
    }

    public boolean m() {
        return this.f23370d;
    }

    public void n() {
        if (this.f23370d) {
            return;
        }
        this.f23369c = this.f23369c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f23369c);
        this.f23370d = true;
    }

    public Object p(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((c) this.f23368b.get(iF)).setValue(obj);
        }
        h();
        int i10 = -(iF + 1);
        if (i10 >= this.f23367a) {
            return l().put(comparable, obj);
        }
        int size = this.f23368b.size();
        int i11 = this.f23367a;
        if (size == i11) {
            c cVar = (c) this.f23368b.remove(i11 - 1);
            l().put(cVar.getKey(), cVar.getValue());
        }
        this.f23368b.add(i10, new c(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return q(iF);
        }
        if (this.f23369c.isEmpty()) {
            return null;
        }
        return this.f23369c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f23368b.size() + this.f23369c.size();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class d implements Iterator {

        /* JADX INFO: renamed from: a */
        private int f23377a;

        /* JADX INFO: renamed from: b */
        private boolean f23378b;

        /* JADX INFO: renamed from: c */
        private Iterator f23379c;

        private d() {
            this.f23377a = -1;
        }

        private Iterator b() {
            if (this.f23379c == null) {
                this.f23379c = u.this.f23369c.entrySet().iterator();
            }
            return this.f23379c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c */
        public Map.Entry next() {
            this.f23378b = true;
            int i10 = this.f23377a + 1;
            this.f23377a = i10;
            return i10 < u.this.f23368b.size() ? (Map.Entry) u.this.f23368b.get(this.f23377a) : (Map.Entry) b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23377a + 1 < u.this.f23368b.size() || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f23378b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f23378b = false;
            u.this.g();
            if (this.f23377a >= u.this.f23368b.size()) {
                b().remove();
                return;
            }
            u uVar = u.this;
            int i10 = this.f23377a;
            this.f23377a = i10 - 1;
            uVar.q(i10);
        }

        /* synthetic */ d(u uVar, a aVar) {
            this();
        }
    }

    private u(int i10) {
        this.f23367a = i10;
        this.f23368b = Collections.EMPTY_LIST;
        this.f23369c = Collections.EMPTY_MAP;
    }
}
