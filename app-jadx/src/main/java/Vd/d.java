package Vd;

import Ud.AbstractC2263d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import je.InterfaceC5371a;
import je.InterfaceC5375e;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Map, Serializable, InterfaceC5375e {

    /* JADX INFO: renamed from: n */
    public static final a f20000n = new a(null);

    /* JADX INFO: renamed from: o */
    private static final d f20001o;

    /* JADX INFO: renamed from: a */
    private Object[] f20002a;

    /* JADX INFO: renamed from: b */
    private Object[] f20003b;

    /* JADX INFO: renamed from: c */
    private int[] f20004c;

    /* JADX INFO: renamed from: d */
    private int[] f20005d;

    /* JADX INFO: renamed from: e */
    private int f20006e;

    /* JADX INFO: renamed from: f */
    private int f20007f;

    /* JADX INFO: renamed from: g */
    private int f20008g;

    /* JADX INFO: renamed from: h */
    private int f20009h;

    /* JADX INFO: renamed from: i */
    private int f20010i;

    /* JADX INFO: renamed from: j */
    private Vd.f f20011j;

    /* JADX INFO: renamed from: k */
    private g f20012k;

    /* JADX INFO: renamed from: l */
    private Vd.e f20013l;

    /* JADX INFO: renamed from: m */
    private boolean f20014m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int c(int i10) {
            return Integer.highestOneBit(AbstractC5874j.e(i10, 1) * 3);
        }

        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d e() {
            return d.f20001o;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends C0349d implements Iterator, InterfaceC5371a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            AbstractC5504s.h(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k */
        public c next() {
            b();
            if (d() >= f().f20007f) {
                throw new NoSuchElementException();
            }
            int iD = d();
            i(iD + 1);
            j(iD);
            c cVar = new c(f(), e());
            g();
            return cVar;
        }

        public final void l(StringBuilder sb2) {
            AbstractC5504s.h(sb2, "sb");
            if (d() >= f().f20007f) {
                throw new NoSuchElementException();
            }
            int iD = d();
            i(iD + 1);
            j(iD);
            Object obj = f().f20002a[e()];
            if (obj == f()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = f().f20003b;
            AbstractC5504s.e(objArr);
            Object obj2 = objArr[e()];
            if (obj2 == f()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            g();
        }

        public final int m() {
            if (d() >= f().f20007f) {
                throw new NoSuchElementException();
            }
            int iD = d();
            i(iD + 1);
            j(iD);
            Object obj = f().f20002a[e()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = f().f20003b;
            AbstractC5504s.e(objArr);
            Object obj2 = objArr[e()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            g();
            return iHashCode2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Map.Entry, InterfaceC5375e.a {

        /* JADX INFO: renamed from: a */
        private final d f20015a;

        /* JADX INFO: renamed from: b */
        private final int f20016b;

        /* JADX INFO: renamed from: c */
        private final int f20017c;

        public c(d map, int i10) {
            AbstractC5504s.h(map, "map");
            this.f20015a = map;
            this.f20016b = i10;
            this.f20017c = map.f20009h;
        }

        private final void a() {
            if (this.f20015a.f20009h != this.f20017c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC5504s.c(entry.getKey(), getKey()) && AbstractC5504s.c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            a();
            return this.f20015a.f20002a[this.f20016b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a();
            Object[] objArr = this.f20015a.f20003b;
            AbstractC5504s.e(objArr);
            return objArr[this.f20016b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            this.f20015a.o();
            Object[] objArrL = this.f20015a.l();
            int i10 = this.f20016b;
            Object obj2 = objArrL[i10];
            objArrL[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: Vd.d$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0349d {

        /* JADX INFO: renamed from: a */
        private final d f20018a;

        /* JADX INFO: renamed from: b */
        private int f20019b;

        /* JADX INFO: renamed from: c */
        private int f20020c;

        /* JADX INFO: renamed from: d */
        private int f20021d;

        public C0349d(d map) {
            AbstractC5504s.h(map, "map");
            this.f20018a = map;
            this.f20020c = -1;
            this.f20021d = map.f20009h;
            g();
        }

        public final void b() {
            if (this.f20018a.f20009h != this.f20021d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int d() {
            return this.f20019b;
        }

        public final int e() {
            return this.f20020c;
        }

        public final d f() {
            return this.f20018a;
        }

        public final void g() {
            while (this.f20019b < this.f20018a.f20007f) {
                int[] iArr = this.f20018a.f20004c;
                int i10 = this.f20019b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f20019b = i10 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f20019b < this.f20018a.f20007f;
        }

        public final void i(int i10) {
            this.f20019b = i10;
        }

        public final void j(int i10) {
            this.f20020c = i10;
        }

        public final void remove() {
            b();
            if (this.f20020c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f20018a.o();
            this.f20018a.Q(this.f20020c);
            this.f20020c = -1;
            this.f20021d = this.f20018a.f20009h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends C0349d implements Iterator, InterfaceC5371a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            AbstractC5504s.h(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (d() >= f().f20007f) {
                throw new NoSuchElementException();
            }
            int iD = d();
            i(iD + 1);
            j(iD);
            Object obj = f().f20002a[e()];
            g();
            return obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends C0349d implements Iterator, InterfaceC5371a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            AbstractC5504s.h(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (d() >= f().f20007f) {
                throw new NoSuchElementException();
            }
            int iD = d();
            i(iD + 1);
            j(iD);
            Object[] objArr = f().f20003b;
            AbstractC5504s.e(objArr);
            Object obj = objArr[e()];
            g();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f20014m = true;
        f20001o = dVar;
    }

    private d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f20002a = objArr;
        this.f20003b = objArr2;
        this.f20004c = iArr;
        this.f20005d = iArr2;
        this.f20006e = i10;
        this.f20007f = i11;
        this.f20008g = f20000n.d(D());
    }

    private final int A(Object obj) {
        int i10 = this.f20007f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f20004c[i10] >= 0) {
                Object[] objArr = this.f20003b;
                AbstractC5504s.e(objArr);
                if (AbstractC5504s.c(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    private final int D() {
        return this.f20005d.length;
    }

    private final int I(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f20008g;
    }

    private final boolean K(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        w(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (L((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean L(Map.Entry entry) {
        int iK = k(entry.getKey());
        Object[] objArrL = l();
        if (iK >= 0) {
            objArrL[iK] = entry.getValue();
            return true;
        }
        int i10 = (-iK) - 1;
        if (AbstractC5504s.c(entry.getValue(), objArrL[i10])) {
            return false;
        }
        objArrL[i10] = entry.getValue();
        return true;
    }

    private final boolean M(int i10) {
        int I10 = I(this.f20002a[i10]);
        int i11 = this.f20006e;
        while (true) {
            int[] iArr = this.f20005d;
            if (iArr[I10] == 0) {
                iArr[I10] = i10 + 1;
                this.f20004c[i10] = I10;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            I10 = I10 == 0 ? D() - 1 : I10 - 1;
        }
    }

    private final void N() {
        this.f20009h++;
    }

    private final void O(int i10) {
        N();
        int i11 = 0;
        if (this.f20007f > size()) {
            p(false);
        }
        this.f20005d = new int[i10];
        this.f20008g = f20000n.d(i10);
        while (i11 < this.f20007f) {
            int i12 = i11 + 1;
            if (!M(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    public final void Q(int i10) {
        Vd.c.f(this.f20002a, i10);
        Object[] objArr = this.f20003b;
        if (objArr != null) {
            Vd.c.f(objArr, i10);
        }
        R(this.f20004c[i10]);
        this.f20004c[i10] = -1;
        this.f20010i = size() - 1;
        N();
    }

    private final void R(int i10) {
        int i11 = AbstractC5874j.i(this.f20006e * 2, D() / 2);
        int i12 = 0;
        int i13 = i10;
        do {
            i10 = i10 == 0 ? D() - 1 : i10 - 1;
            i12++;
            if (i12 > this.f20006e) {
                this.f20005d[i13] = 0;
                return;
            }
            int[] iArr = this.f20005d;
            int i14 = iArr[i10];
            if (i14 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i13] = -1;
            } else {
                int i15 = i14 - 1;
                if (((I(this.f20002a[i15]) - i10) & (D() - 1)) >= i12) {
                    this.f20005d[i13] = i14;
                    this.f20004c[i15] = i13;
                }
                i11--;
            }
            i13 = i10;
            i12 = 0;
            i11--;
        } while (i11 >= 0);
        this.f20005d[i13] = -1;
    }

    private final boolean U(int i10) {
        int iB = B();
        int i11 = this.f20007f;
        int i12 = iB - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= B() / 4;
    }

    public final Object[] l() {
        Object[] objArr = this.f20003b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = Vd.c.d(B());
        this.f20003b = objArrD;
        return objArrD;
    }

    private final void p(boolean z10) {
        int i10;
        Object[] objArr = this.f20003b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f20007f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f20004c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f20002a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f20005d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        Vd.c.g(this.f20002a, i12, i10);
        if (objArr != null) {
            Vd.c.g(objArr, i12, this.f20007f);
        }
        this.f20007f = i12;
    }

    private final boolean u(Map map) {
        return size() == map.size() && q(map.entrySet());
    }

    private final void v(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > B()) {
            int iE = AbstractC2263d.f19502a.e(B(), i10);
            this.f20002a = Vd.c.e(this.f20002a, iE);
            Object[] objArr = this.f20003b;
            this.f20003b = objArr != null ? Vd.c.e(objArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f20004c, iE);
            AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
            this.f20004c = iArrCopyOf;
            int iC = f20000n.c(iE);
            if (iC > D()) {
                O(iC);
            }
        }
    }

    private final void w(int i10) {
        if (U(i10)) {
            p(true);
        } else {
            v(this.f20007f + i10);
        }
    }

    private final int z(Object obj) {
        int I10 = I(obj);
        int i10 = this.f20006e;
        while (true) {
            int i11 = this.f20005d[I10];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (AbstractC5504s.c(this.f20002a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            I10 = I10 == 0 ? D() - 1 : I10 - 1;
        }
    }

    public final int B() {
        return this.f20002a.length;
    }

    public Set C() {
        Vd.e eVar = this.f20013l;
        if (eVar != null) {
            return eVar;
        }
        Vd.e eVar2 = new Vd.e(this);
        this.f20013l = eVar2;
        return eVar2;
    }

    public Set E() {
        Vd.f fVar = this.f20011j;
        if (fVar != null) {
            return fVar;
        }
        Vd.f fVar2 = new Vd.f(this);
        this.f20011j = fVar2;
        return fVar2;
    }

    public int F() {
        return this.f20010i;
    }

    public Collection G() {
        g gVar = this.f20012k;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f20012k = gVar2;
        return gVar2;
    }

    public final e J() {
        return new e(this);
    }

    public final boolean P(Map.Entry entry) {
        AbstractC5504s.h(entry, "entry");
        o();
        int iZ = z(entry.getKey());
        if (iZ < 0) {
            return false;
        }
        Object[] objArr = this.f20003b;
        AbstractC5504s.e(objArr);
        if (!AbstractC5504s.c(objArr[iZ], entry.getValue())) {
            return false;
        }
        Q(iZ);
        return true;
    }

    public final boolean S(Object obj) {
        o();
        int iZ = z(obj);
        if (iZ < 0) {
            return false;
        }
        Q(iZ);
        return true;
    }

    public final boolean T(Object obj) {
        o();
        int iA = A(obj);
        if (iA < 0) {
            return false;
        }
        Q(iA);
        return true;
    }

    public final f V() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        o();
        int i10 = this.f20007f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f20004c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f20005d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        Vd.c.g(this.f20002a, 0, this.f20007f);
        Object[] objArr = this.f20003b;
        if (objArr != null) {
            Vd.c.g(objArr, 0, this.f20007f);
        }
        this.f20010i = 0;
        this.f20007f = 0;
        N();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return z(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return A(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return C();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && u((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iZ = z(obj);
        if (iZ < 0) {
            return null;
        }
        Object[] objArr = this.f20003b;
        AbstractC5504s.e(objArr);
        return objArr[iZ];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarY = y();
        int iM = 0;
        while (bVarY.hasNext()) {
            iM += bVarY.m();
        }
        return iM;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int k(Object obj) {
        o();
        while (true) {
            int I10 = I(obj);
            int i10 = AbstractC5874j.i(this.f20006e * 2, D() / 2);
            int i11 = 0;
            while (true) {
                int i12 = this.f20005d[I10];
                if (i12 <= 0) {
                    if (this.f20007f < B()) {
                        int i13 = this.f20007f;
                        int i14 = i13 + 1;
                        this.f20007f = i14;
                        this.f20002a[i13] = obj;
                        this.f20004c[i13] = I10;
                        this.f20005d[I10] = i14;
                        this.f20010i = size() + 1;
                        N();
                        if (i11 > this.f20006e) {
                            this.f20006e = i11;
                        }
                        return i13;
                    }
                    w(1);
                } else {
                    if (AbstractC5504s.c(this.f20002a[i12 - 1], obj)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > i10) {
                        O(D() * 2);
                        break;
                    }
                    I10 = I10 == 0 ? D() - 1 : I10 - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return E();
    }

    public final Map m() {
        o();
        this.f20014m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f20001o;
        AbstractC5504s.f(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void o() {
        if (this.f20014m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        o();
        int iK = k(obj);
        Object[] objArrL = l();
        if (iK >= 0) {
            objArrL[iK] = obj2;
            return null;
        }
        int i10 = (-iK) - 1;
        Object obj3 = objArrL[i10];
        objArrL[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        AbstractC5504s.h(from, "from");
        o();
        K(from.entrySet());
    }

    public final boolean q(Collection m10) {
        AbstractC5504s.h(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!t((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        o();
        int iZ = z(obj);
        if (iZ < 0) {
            return null;
        }
        Object[] objArr = this.f20003b;
        AbstractC5504s.e(objArr);
        Object obj2 = objArr[iZ];
        Q(iZ);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return F();
    }

    public final boolean t(Map.Entry entry) {
        AbstractC5504s.h(entry, "entry");
        int iZ = z(entry.getKey());
        if (iZ < 0) {
            return false;
        }
        Object[] objArr = this.f20003b;
        AbstractC5504s.e(objArr);
        return AbstractC5504s.c(objArr[iZ], entry.getValue());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b bVarY = y();
        int i10 = 0;
        while (bVarY.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarY.l(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return G();
    }

    public final b y() {
        return new b(this);
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(Vd.c.d(i10), null, new int[i10], new int[f20000n.c(i10)], 2, 0);
    }
}
