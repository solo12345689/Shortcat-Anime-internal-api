package P9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: P9.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C2001j extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j */
    private static final Object f13689j = new Object();

    /* JADX INFO: renamed from: a */
    private transient Object f13690a;

    /* JADX INFO: renamed from: b */
    transient int[] f13691b;

    /* JADX INFO: renamed from: c */
    transient Object[] f13692c;

    /* JADX INFO: renamed from: d */
    transient Object[] f13693d;

    /* JADX INFO: renamed from: e */
    private transient int f13694e;

    /* JADX INFO: renamed from: f */
    private transient int f13695f;

    /* JADX INFO: renamed from: g */
    private transient Set f13696g;

    /* JADX INFO: renamed from: h */
    private transient Set f13697h;

    /* JADX INFO: renamed from: i */
    private transient Collection f13698i;

    /* JADX INFO: renamed from: P9.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends e {
        a() {
            super(C2001j.this, null);
        }

        @Override // P9.C2001j.e
        Object c(int i10) {
            return C2001j.this.L(i10);
        }
    }

    /* JADX INFO: renamed from: P9.j$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends e {
        b() {
            super(C2001j.this, null);
        }

        @Override // P9.C2001j.e
        /* JADX INFO: renamed from: e */
        public Map.Entry c(int i10) {
            return C2001j.this.new g(i10);
        }
    }

    /* JADX INFO: renamed from: P9.j$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends e {
        c() {
            super(C2001j.this, null);
        }

        @Override // P9.C2001j.e
        Object c(int i10) {
            return C2001j.this.b0(i10);
        }
    }

    /* JADX INFO: renamed from: P9.j$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2001j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapB = C2001j.this.B();
            if (mapB != null) {
                return mapB.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int I10 = C2001j.this.I(entry.getKey());
                if (I10 != -1 && O9.j.a(C2001j.this.b0(I10), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C2001j.this.D();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iG;
            int iF;
            Map mapB = C2001j.this.B();
            if (mapB != null) {
                return mapB.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C2001j.this.O() || (iF = AbstractC2002k.f(entry.getKey(), entry.getValue(), (iG = C2001j.this.G()), C2001j.this.S(), C2001j.this.Q(), C2001j.this.R(), C2001j.this.T())) == -1) {
                return false;
            }
            C2001j.this.N(iF, iG);
            C2001j.f(C2001j.this);
            C2001j.this.H();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2001j.this.size();
        }
    }

    /* JADX INFO: renamed from: P9.j$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2001j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C2001j.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C2001j.this.M();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapB = C2001j.this.B();
            return mapB != null ? mapB.keySet().remove(obj) : C2001j.this.P(obj) != C2001j.f13689j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2001j.this.size();
        }
    }

    /* JADX INFO: renamed from: P9.j$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class g extends AbstractC1996e {

        /* JADX INFO: renamed from: a */
        private final Object f13708a;

        /* JADX INFO: renamed from: b */
        private int f13709b;

        g(int i10) {
            this.f13708a = C2001j.this.L(i10);
            this.f13709b = i10;
        }

        private void a() {
            int i10 = this.f13709b;
            if (i10 == -1 || i10 >= C2001j.this.size() || !O9.j.a(this.f13708a, C2001j.this.L(this.f13709b))) {
                this.f13709b = C2001j.this.I(this.f13708a);
            }
        }

        @Override // P9.AbstractC1996e, java.util.Map.Entry
        public Object getKey() {
            return this.f13708a;
        }

        @Override // P9.AbstractC1996e, java.util.Map.Entry
        public Object getValue() {
            Map mapB = C2001j.this.B();
            if (mapB != null) {
                return I.a(mapB.get(this.f13708a));
            }
            a();
            int i10 = this.f13709b;
            return i10 == -1 ? I.b() : C2001j.this.b0(i10);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapB = C2001j.this.B();
            if (mapB != null) {
                return I.a(mapB.put(this.f13708a, obj));
            }
            a();
            int i10 = this.f13709b;
            if (i10 == -1) {
                C2001j.this.put(this.f13708a, obj);
                return I.b();
            }
            Object objB0 = C2001j.this.b0(i10);
            C2001j.this.a0(this.f13709b, obj);
            return objB0;
        }
    }

    /* JADX INFO: renamed from: P9.j$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C2001j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C2001j.this.c0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C2001j.this.size();
        }
    }

    C2001j(int i10) {
        J(i10);
    }

    public static C2001j A(int i10) {
        return new C2001j(i10);
    }

    private int C(int i10) {
        return Q()[i10];
    }

    public int G() {
        return (1 << (this.f13694e & 31)) - 1;
    }

    public int I(Object obj) {
        if (O()) {
            return -1;
        }
        int iC = AbstractC2008q.c(obj);
        int iG = G();
        int iH = AbstractC2002k.h(S(), iC & iG);
        if (iH == 0) {
            return -1;
        }
        int iB = AbstractC2002k.b(iC, iG);
        do {
            int i10 = iH - 1;
            int iC2 = C(i10);
            if (AbstractC2002k.b(iC2, iG) == iB && O9.j.a(obj, L(i10))) {
                return i10;
            }
            iH = AbstractC2002k.c(iC2, iG);
        } while (iH != 0);
        return -1;
    }

    public Object L(int i10) {
        return R()[i10];
    }

    public Object P(Object obj) {
        if (O()) {
            return f13689j;
        }
        int iG = G();
        int iF = AbstractC2002k.f(obj, null, iG, S(), Q(), R(), null);
        if (iF == -1) {
            return f13689j;
        }
        Object objB0 = b0(iF);
        N(iF, iG);
        this.f13695f--;
        H();
        return objB0;
    }

    public int[] Q() {
        int[] iArr = this.f13691b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public Object[] R() {
        Object[] objArr = this.f13692c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public Object S() {
        Object obj = this.f13690a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public Object[] T() {
        Object[] objArr = this.f13693d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void V(int i10) {
        int iMin;
        int length = Q().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        U(iMin);
    }

    private int W(int i10, int i11, int i12, int i13) {
        Object objA = AbstractC2002k.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            AbstractC2002k.i(objA, i12 & i14, i13 + 1);
        }
        Object objS = S();
        int[] iArrQ = Q();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = AbstractC2002k.h(objS, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrQ[i16];
                int iB = AbstractC2002k.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = AbstractC2002k.h(objA, i18);
                AbstractC2002k.i(objA, i18, iH);
                iArrQ[i16] = AbstractC2002k.d(iB, iH2, i14);
                iH = AbstractC2002k.c(i17, i10);
            }
        }
        this.f13690a = objA;
        Y(i14);
        return i14;
    }

    private void X(int i10, int i11) {
        Q()[i10] = i11;
    }

    private void Y(int i10) {
        this.f13694e = AbstractC2002k.d(this.f13694e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void Z(int i10, Object obj) {
        R()[i10] = obj;
    }

    public void a0(int i10, Object obj) {
        T()[i10] = obj;
    }

    public Object b0(int i10) {
        return T()[i10];
    }

    static /* synthetic */ int f(C2001j c2001j) {
        int i10 = c2001j.f13695f;
        c2001j.f13695f = i10 - 1;
        return i10;
    }

    Map B() {
        Object obj = this.f13690a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator D() {
        Map mapB = B();
        return mapB != null ? mapB.entrySet().iterator() : new b();
    }

    int E() {
        return isEmpty() ? -1 : 0;
    }

    int F(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f13695f) {
            return i11;
        }
        return -1;
    }

    void H() {
        this.f13694e += 32;
    }

    void J(int i10) {
        O9.n.e(i10 >= 0, "Expected size must be >= 0");
        this.f13694e = S9.f.g(i10, 1, 1073741823);
    }

    void K(int i10, Object obj, Object obj2, int i11, int i12) {
        X(i10, AbstractC2002k.d(i11, 0, i12));
        Z(i10, obj);
        a0(i10, obj2);
    }

    Iterator M() {
        Map mapB = B();
        return mapB != null ? mapB.keySet().iterator() : new a();
    }

    void N(int i10, int i11) {
        Object objS = S();
        int[] iArrQ = Q();
        Object[] objArrR = R();
        Object[] objArrT = T();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrR[i10] = null;
            objArrT[i10] = null;
            iArrQ[i10] = 0;
            return;
        }
        Object obj = objArrR[i12];
        objArrR[i10] = obj;
        objArrT[i10] = objArrT[i12];
        objArrR[i12] = null;
        objArrT[i12] = null;
        iArrQ[i10] = iArrQ[i12];
        iArrQ[i12] = 0;
        int iC = AbstractC2008q.c(obj) & i11;
        int iH = AbstractC2002k.h(objS, iC);
        if (iH == size) {
            AbstractC2002k.i(objS, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrQ[i13];
            int iC2 = AbstractC2002k.c(i14, i11);
            if (iC2 == size) {
                iArrQ[i13] = AbstractC2002k.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    boolean O() {
        return this.f13690a == null;
    }

    void U(int i10) {
        this.f13691b = Arrays.copyOf(Q(), i10);
        this.f13692c = Arrays.copyOf(R(), i10);
        this.f13693d = Arrays.copyOf(T(), i10);
    }

    Iterator c0() {
        Map mapB = B();
        return mapB != null ? mapB.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (O()) {
            return;
        }
        H();
        Map mapB = B();
        if (mapB != null) {
            this.f13694e = S9.f.g(size(), 3, 1073741823);
            mapB.clear();
            this.f13690a = null;
            this.f13695f = 0;
            return;
        }
        Arrays.fill(R(), 0, this.f13695f, (Object) null);
        Arrays.fill(T(), 0, this.f13695f, (Object) null);
        AbstractC2002k.g(S());
        Arrays.fill(Q(), 0, this.f13695f, 0);
        this.f13695f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapB = B();
        return mapB != null ? mapB.containsKey(obj) : I(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapB = B();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f13695f; i10++) {
            if (O9.j.a(obj, b0(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f13697h;
        if (set != null) {
            return set;
        }
        Set setV = v();
        this.f13697h = setV;
        return setV;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapB = B();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int I10 = I(obj);
        if (I10 == -1) {
            return null;
        }
        p(I10);
        return b0(I10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f13696g;
        if (set != null) {
            return set;
        }
        Set setY = y();
        this.f13696g = setY;
        return setY;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (O()) {
            t();
        }
        Map mapB = B();
        if (mapB != null) {
            return mapB.put(obj, obj2);
        }
        int[] iArrQ = Q();
        Object[] objArrR = R();
        Object[] objArrT = T();
        int i10 = this.f13695f;
        int i11 = i10 + 1;
        int iC = AbstractC2008q.c(obj);
        int iG = G();
        int i12 = iC & iG;
        int iH = AbstractC2002k.h(S(), i12);
        if (iH != 0) {
            int iB = AbstractC2002k.b(iC, iG);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrQ[i14];
                if (AbstractC2002k.b(i15, iG) == iB && O9.j.a(obj, objArrR[i14])) {
                    Object obj3 = objArrT[i14];
                    objArrT[i14] = obj2;
                    p(i14);
                    return obj3;
                }
                int iC2 = AbstractC2002k.c(i15, iG);
                i13++;
                if (iC2 != 0) {
                    obj = obj;
                    obj2 = obj2;
                    iH = iC2;
                } else {
                    if (i13 >= 9) {
                        return u().put(obj, obj2);
                    }
                    if (i11 > iG) {
                        iG = W(iG, AbstractC2002k.e(iG), iC, i10);
                    } else {
                        iArrQ[i14] = AbstractC2002k.d(i15, i11, iG);
                    }
                }
            }
        } else if (i11 > iG) {
            iG = W(iG, AbstractC2002k.e(iG), iC, i10);
        } else {
            AbstractC2002k.i(S(), i12, i11);
        }
        int i16 = iG;
        V(i11);
        K(i10, obj, obj2, iC, i16);
        this.f13695f = i11;
        H();
        return null;
    }

    int q(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapB = B();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objP = P(obj);
        if (objP == f13689j) {
            return null;
        }
        return objP;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapB = B();
        return mapB != null ? mapB.size() : this.f13695f;
    }

    int t() {
        O9.n.q(O(), "Arrays already allocated");
        int i10 = this.f13694e;
        int iJ = AbstractC2002k.j(i10);
        this.f13690a = AbstractC2002k.a(iJ);
        Y(iJ - 1);
        this.f13691b = new int[i10];
        this.f13692c = new Object[i10];
        this.f13693d = new Object[i10];
        return i10;
    }

    Map u() {
        Map mapW = w(G() + 1);
        int iE = E();
        while (iE >= 0) {
            mapW.put(L(iE), b0(iE));
            iE = F(iE);
        }
        this.f13690a = mapW;
        this.f13691b = null;
        this.f13692c = null;
        this.f13693d = null;
        H();
        return mapW;
    }

    Set v() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f13698i;
        if (collection != null) {
            return collection;
        }
        Collection collectionZ = z();
        this.f13698i = collectionZ;
        return collectionZ;
    }

    Map w(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    Set y() {
        return new f();
    }

    Collection z() {
        return new h();
    }

    /* JADX INFO: renamed from: P9.j$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private abstract class e implements Iterator {

        /* JADX INFO: renamed from: a */
        int f13703a;

        /* JADX INFO: renamed from: b */
        int f13704b;

        /* JADX INFO: renamed from: c */
        int f13705c;

        private e() {
            this.f13703a = C2001j.this.f13694e;
            this.f13704b = C2001j.this.E();
            this.f13705c = -1;
        }

        private void b() {
            if (C2001j.this.f13694e != this.f13703a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object c(int i10);

        void d() {
            this.f13703a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13704b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f13704b;
            this.f13705c = i10;
            Object objC = c(i10);
            this.f13704b = C2001j.this.F(this.f13704b);
            return objC;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            AbstractC1999h.c(this.f13705c >= 0);
            d();
            C2001j c2001j = C2001j.this;
            c2001j.remove(c2001j.L(this.f13705c));
            this.f13704b = C2001j.this.q(this.f13704b, this.f13705c);
            this.f13705c = -1;
        }

        /* synthetic */ e(C2001j c2001j, a aVar) {
            this();
        }
    }

    void p(int i10) {
    }
}
