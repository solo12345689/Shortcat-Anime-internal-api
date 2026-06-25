package P9;

import P9.AbstractC2009s;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: P9.w */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2013w extends AbstractC2009s implements Set {

    /* JADX INFO: renamed from: b */
    private transient AbstractC2011u f13741b;

    /* JADX INFO: renamed from: P9.w$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends AbstractC2009s.a {

        /* JADX INFO: renamed from: d */
        Object[] f13742d;

        /* JADX INFO: renamed from: e */
        private int f13743e;

        public a() {
            super(4);
        }

        private void k(Object obj) {
            Objects.requireNonNull(this.f13742d);
            int length = this.f13742d.length - 1;
            int iHashCode = obj.hashCode();
            int iB = AbstractC2008q.b(iHashCode);
            while (true) {
                int i10 = iB & length;
                Object[] objArr = this.f13742d;
                Object obj2 = objArr[i10];
                if (obj2 == null) {
                    objArr[i10] = obj;
                    this.f13743e += iHashCode;
                    super.d(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iB = i10 + 1;
                }
            }
        }

        @Override // P9.AbstractC2009s.b
        /* JADX INFO: renamed from: h */
        public a a(Object obj) {
            O9.n.j(obj);
            if (this.f13742d != null && AbstractC2013w.t(this.f13720b) <= this.f13742d.length) {
                k(obj);
                return this;
            }
            this.f13742d = null;
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            if (this.f13742d == null) {
                super.e(objArr);
                return this;
            }
            for (Object obj : objArr) {
                a(obj);
            }
            return this;
        }

        public a j(Iterable iterable) {
            O9.n.j(iterable);
            if (this.f13742d == null) {
                super.b(iterable);
                return this;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public AbstractC2013w l() {
            AbstractC2013w abstractC2013wU;
            int i10 = this.f13720b;
            if (i10 == 0) {
                return AbstractC2013w.z();
            }
            if (i10 == 1) {
                Object obj = this.f13719a[0];
                Objects.requireNonNull(obj);
                return AbstractC2013w.A(obj);
            }
            if (this.f13742d == null || AbstractC2013w.t(i10) != this.f13742d.length) {
                abstractC2013wU = AbstractC2013w.u(this.f13720b, this.f13719a);
                this.f13720b = abstractC2013wU.size();
            } else {
                Object[] objArrCopyOf = AbstractC2013w.I(this.f13720b, this.f13719a.length) ? Arrays.copyOf(this.f13719a, this.f13720b) : this.f13719a;
                abstractC2013wU = new P(objArrCopyOf, this.f13743e, this.f13742d, r5.length - 1, this.f13720b);
            }
            this.f13721c = true;
            this.f13742d = null;
            return abstractC2013wU;
        }
    }

    AbstractC2013w() {
    }

    public static AbstractC2013w A(Object obj) {
        return new U(obj);
    }

    public static AbstractC2013w B(Object obj, Object obj2) {
        return u(2, obj, obj2);
    }

    public static AbstractC2013w D(Object obj, Object obj2, Object obj3) {
        return u(3, obj, obj2, obj3);
    }

    public static AbstractC2013w F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return u(5, obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC2013w G(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        O9.n.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return u(length, objArr2);
    }

    public static boolean I(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    static int t(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            O9.n.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static AbstractC2013w u(int i10, Object... objArr) {
        if (i10 == 0) {
            return z();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return A(obj);
        }
        int iT = t(i10);
        Object[] objArr2 = new Object[iT];
        int i11 = iT - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = J.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iB = AbstractC2008q.b(iHashCode);
            while (true) {
                int i15 = iB & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new U(obj3);
        }
        if (t(i13) < iT / 2) {
            return u(i13, objArr);
        }
        if (I(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new P(objArr, i12, objArr2, i11, i13);
    }

    public static AbstractC2013w v(Collection collection) {
        if ((collection instanceof AbstractC2013w) && !(collection instanceof SortedSet)) {
            AbstractC2013w abstractC2013w = (AbstractC2013w) collection;
            if (!abstractC2013w.i()) {
                return abstractC2013w;
            }
        }
        Object[] array = collection.toArray();
        return u(array.length, array);
    }

    public static AbstractC2013w w(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? u(objArr.length, (Object[]) objArr.clone()) : A(objArr[0]) : z();
    }

    public static AbstractC2013w z() {
        return P.f13616i;
    }

    @Override // P9.AbstractC2009s
    public AbstractC2011u b() {
        AbstractC2011u abstractC2011u = this.f13741b;
        if (abstractC2011u != null) {
            return abstractC2011u;
        }
        AbstractC2011u abstractC2011uX = x();
        this.f13741b = abstractC2011uX;
        return abstractC2011uX;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2013w) && y() && ((AbstractC2013w) obj).y() && hashCode() != obj.hashCode()) {
            return false;
        }
        return T.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return T.d(this);
    }

    @Override // P9.AbstractC2009s
    /* JADX INFO: renamed from: l */
    public abstract X iterator();

    AbstractC2011u x() {
        return AbstractC2011u.p(toArray());
    }

    boolean y() {
        return false;
    }
}
