package P9;

import P9.AbstractC2009s;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: renamed from: P9.v */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2012v implements Map, Serializable {

    /* JADX INFO: renamed from: d */
    static final Map.Entry[] f13729d = new Map.Entry[0];

    /* JADX INFO: renamed from: a */
    private transient AbstractC2013w f13730a;

    /* JADX INFO: renamed from: b */
    private transient AbstractC2013w f13731b;

    /* JADX INFO: renamed from: c */
    private transient AbstractC2009s f13732c;

    /* JADX INFO: renamed from: P9.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        Comparator f13733a;

        /* JADX INFO: renamed from: b */
        Object[] f13734b;

        /* JADX INFO: renamed from: c */
        int f13735c;

        /* JADX INFO: renamed from: d */
        boolean f13736d;

        /* JADX INFO: renamed from: e */
        C0224a f13737e;

        /* JADX INFO: renamed from: P9.v$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0224a {

            /* JADX INFO: renamed from: a */
            private final Object f13738a;

            /* JADX INFO: renamed from: b */
            private final Object f13739b;

            /* JADX INFO: renamed from: c */
            private final Object f13740c;

            C0224a(Object obj, Object obj2, Object obj3) {
                this.f13738a = obj;
                this.f13739b = obj2;
                this.f13740c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f13738a + com.amazon.a.a.o.b.f.f34695b + this.f13739b + " and " + this.f13738a + com.amazon.a.a.o.b.f.f34695b + this.f13740c);
            }
        }

        public a() {
            this(4);
        }

        private AbstractC2012v b(boolean z10) {
            Object[] objArrE;
            C0224a c0224a;
            C0224a c0224a2;
            if (z10 && (c0224a2 = this.f13737e) != null) {
                throw c0224a2.a();
            }
            int length = this.f13735c;
            if (this.f13733a == null) {
                objArrE = this.f13734b;
            } else {
                if (this.f13736d) {
                    this.f13734b = Arrays.copyOf(this.f13734b, length * 2);
                }
                objArrE = this.f13734b;
                if (!z10) {
                    objArrE = e(objArrE, this.f13735c);
                    if (objArrE.length < this.f13734b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                j(objArrE, length, this.f13733a);
            }
            this.f13736d = true;
            O oT = O.t(length, objArrE, this);
            if (!z10 || (c0224a = this.f13737e) == null) {
                return oT;
            }
            throw c0224a.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f13734b;
            if (i11 > objArr.length) {
                this.f13734b = Arrays.copyOf(objArr, AbstractC2009s.b.c(objArr.length, i11));
                this.f13736d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static void j(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, K.b(comparator).d(C.k()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public AbstractC2012v a() {
            return c();
        }

        public AbstractC2012v c() {
            return b(true);
        }

        public a f(Object obj, Object obj2) {
            d(this.f13735c + 1);
            AbstractC1999h.a(obj, obj2);
            Object[] objArr = this.f13734b;
            int i10 = this.f13735c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f13735c = i10 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f13735c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a i(Map map) {
            return h(map.entrySet());
        }

        a(int i10) {
            this.f13734b = new Object[i10 * 2];
            this.f13735c = 0;
            this.f13736d = false;
        }
    }

    AbstractC2012v() {
    }

    public static a a() {
        return new a();
    }

    public static AbstractC2012v b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static AbstractC2012v d(Map map) {
        if ((map instanceof AbstractC2012v) && !(map instanceof SortedMap)) {
            AbstractC2012v abstractC2012v = (AbstractC2012v) map;
            if (!abstractC2012v.i()) {
                return abstractC2012v;
            }
        }
        return b(map.entrySet());
    }

    public static AbstractC2012v k() {
        return O.f13601h;
    }

    public static AbstractC2012v l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        AbstractC1999h.a(obj, obj2);
        AbstractC1999h.a(obj3, obj4);
        AbstractC1999h.a(obj5, obj6);
        AbstractC1999h.a(obj7, obj8);
        return O.q(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static AbstractC2012v m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        AbstractC1999h.a(obj, obj2);
        AbstractC1999h.a(obj3, obj4);
        AbstractC1999h.a(obj5, obj6);
        AbstractC1999h.a(obj7, obj8);
        AbstractC1999h.a(obj9, obj10);
        return O.q(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static AbstractC2012v o(Map.Entry... entryArr) {
        return b(Arrays.asList(entryArr));
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC2013w e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return C.c(this, obj);
    }

    abstract AbstractC2013w f();

    abstract AbstractC2009s g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h */
    public AbstractC2013w entrySet() {
        AbstractC2013w abstractC2013w = this.f13730a;
        if (abstractC2013w != null) {
            return abstractC2013w;
        }
        AbstractC2013w abstractC2013wE = e();
        this.f13730a = abstractC2013wE;
        return abstractC2013wE;
    }

    @Override // java.util.Map
    public int hashCode() {
        return T.d(entrySet());
    }

    abstract boolean i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j */
    public AbstractC2013w keySet() {
        AbstractC2013w abstractC2013w = this.f13731b;
        if (abstractC2013w != null) {
            return abstractC2013w;
        }
        AbstractC2013w abstractC2013wF = f();
        this.f13731b = abstractC2013wF;
        return abstractC2013wF;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: p */
    public AbstractC2009s values() {
        AbstractC2009s abstractC2009s = this.f13732c;
        if (abstractC2009s != null) {
            return abstractC2009s;
        }
        AbstractC2009s abstractC2009sG = g();
        this.f13732c = abstractC2009sG;
        return abstractC2009sG;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C.j(this);
    }
}
