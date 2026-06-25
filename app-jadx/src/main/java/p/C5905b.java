package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: p.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5905b implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f55657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f55658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f55659c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55660d = 0;

    /* JADX INFO: renamed from: p.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p.C5905b.e
        c c(c cVar) {
            return cVar.f55664d;
        }

        @Override // p.C5905b.e
        c d(c cVar) {
            return cVar.f55663c;
        }
    }

    /* JADX INFO: renamed from: p.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0853b extends e {
        C0853b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p.C5905b.e
        c c(c cVar) {
            return cVar.f55663c;
        }

        @Override // p.C5905b.e
        c d(c cVar) {
            return cVar.f55664d;
        }
    }

    /* JADX INFO: renamed from: p.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f55661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f55662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f55663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f55664d;

        c(Object obj, Object obj2) {
            this.f55661a = obj;
            this.f55662b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f55661a.equals(cVar.f55661a) && this.f55662b.equals(cVar.f55662b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f55661a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f55662b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f55661a.hashCode() ^ this.f55662b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f55661a + com.amazon.a.a.o.b.f.f34695b + this.f55662b;
        }
    }

    /* JADX INFO: renamed from: p.b$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f55665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f55666b = true;

        d() {
        }

        @Override // p.C5905b.f
        void b(c cVar) {
            c cVar2 = this.f55665a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f55664d;
                this.f55665a = cVar3;
                this.f55666b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f55666b) {
                this.f55666b = false;
                this.f55665a = C5905b.this.f55657a;
            } else {
                c cVar = this.f55665a;
                this.f55665a = cVar != null ? cVar.f55663c : null;
            }
            return this.f55665a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f55666b) {
                return C5905b.this.f55657a != null;
            }
            c cVar = this.f55665a;
            return (cVar == null || cVar.f55663c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: p.b$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f55668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c f55669b;

        e(c cVar, c cVar2) {
            this.f55668a = cVar2;
            this.f55669b = cVar;
        }

        private c f() {
            c cVar = this.f55669b;
            c cVar2 = this.f55668a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // p.C5905b.f
        public void b(c cVar) {
            if (this.f55668a == cVar && cVar == this.f55669b) {
                this.f55669b = null;
                this.f55668a = null;
            }
            c cVar2 = this.f55668a;
            if (cVar2 == cVar) {
                this.f55668a = c(cVar2);
            }
            if (this.f55669b == cVar) {
                this.f55669b = f();
            }
        }

        abstract c c(c cVar);

        abstract c d(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f55669b;
            this.f55669b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55669b != null;
        }
    }

    /* JADX INFO: renamed from: p.b$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class f {
        abstract void b(c cVar);
    }

    public Map.Entry b() {
        return this.f55657a;
    }

    protected c c(Object obj) {
        c cVar = this.f55657a;
        while (cVar != null && !cVar.f55661a.equals(obj)) {
            cVar = cVar.f55663c;
        }
        return cVar;
    }

    public d d() {
        d dVar = new d();
        this.f55659c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        C0853b c0853b = new C0853b(this.f55658b, this.f55657a);
        this.f55659c.put(c0853b, Boolean.FALSE);
        return c0853b;
    }

    public Map.Entry e() {
        return this.f55658b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5905b)) {
            return false;
        }
        C5905b c5905b = (C5905b) obj;
        if (size() != c5905b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c5905b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    c f(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f55660d++;
        c cVar2 = this.f55658b;
        if (cVar2 == null) {
            this.f55657a = cVar;
            this.f55658b = cVar;
            return cVar;
        }
        cVar2.f55663c = cVar;
        cVar.f55664d = cVar2;
        this.f55658b = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public Object i(Object obj, Object obj2) {
        c cVarC = c(obj);
        if (cVarC != null) {
            return cVarC.f55662b;
        }
        f(obj, obj2);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f55657a, this.f55658b);
        this.f55659c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object l(Object obj) {
        c cVarC = c(obj);
        if (cVarC == null) {
            return null;
        }
        this.f55660d--;
        if (!this.f55659c.isEmpty()) {
            Iterator it = this.f55659c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).b(cVarC);
            }
        }
        c cVar = cVarC.f55664d;
        if (cVar != null) {
            cVar.f55663c = cVarC.f55663c;
        } else {
            this.f55657a = cVarC.f55663c;
        }
        c cVar2 = cVarC.f55663c;
        if (cVar2 != null) {
            cVar2.f55664d = cVar;
        } else {
            this.f55658b = cVar;
        }
        cVarC.f55663c = null;
        cVarC.f55664d = null;
        return cVarC.f55662b;
    }

    public int size() {
        return this.f55660d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
