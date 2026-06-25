package P9;

import P9.AbstractC2009s;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: P9.u */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2011u extends AbstractC2009s implements List, RandomAccess {

    /* JADX INFO: renamed from: b */
    private static final Y f13724b = new b(N.f13598e, 0);

    /* JADX INFO: renamed from: P9.u$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2009s.a {
        public a() {
            this(4);
        }

        @Override // P9.AbstractC2009s.b
        /* JADX INFO: renamed from: h */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            super.e(objArr);
            return this;
        }

        public a j(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public AbstractC2011u k() {
            this.f13721c = true;
            return AbstractC2011u.s(this.f13719a, this.f13720b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* JADX INFO: renamed from: P9.u$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b extends AbstractC1992a {

        /* JADX INFO: renamed from: c */
        private final AbstractC2011u f13725c;

        b(AbstractC2011u abstractC2011u, int i10) {
            super(abstractC2011u.size(), i10);
            this.f13725c = abstractC2011u;
        }

        @Override // P9.AbstractC1992a
        protected Object b(int i10) {
            return this.f13725c.get(i10);
        }
    }

    /* JADX INFO: renamed from: P9.u$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends AbstractC2011u {

        /* JADX INFO: renamed from: c */
        final transient int f13726c;

        /* JADX INFO: renamed from: d */
        final transient int f13727d;

        c(int i10, int i11) {
            this.f13726c = i10;
            this.f13727d = i11;
        }

        @Override // P9.AbstractC2011u, java.util.List
        /* JADX INFO: renamed from: M */
        public AbstractC2011u subList(int i10, int i11) {
            O9.n.o(i10, i11, this.f13727d);
            AbstractC2011u abstractC2011u = AbstractC2011u.this;
            int i12 = this.f13726c;
            return abstractC2011u.subList(i10 + i12, i11 + i12);
        }

        @Override // P9.AbstractC2009s
        Object[] d() {
            return AbstractC2011u.this.d();
        }

        @Override // P9.AbstractC2009s
        int e() {
            return AbstractC2011u.this.f() + this.f13726c + this.f13727d;
        }

        @Override // P9.AbstractC2009s
        int f() {
            return AbstractC2011u.this.f() + this.f13726c;
        }

        @Override // java.util.List
        public Object get(int i10) {
            O9.n.h(i10, this.f13727d);
            return AbstractC2011u.this.get(i10 + this.f13726c);
        }

        @Override // P9.AbstractC2009s
        boolean i() {
            return true;
        }

        @Override // P9.AbstractC2011u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // P9.AbstractC2011u, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f13727d;
        }

        @Override // P9.AbstractC2011u, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    AbstractC2011u() {
    }

    public static AbstractC2011u A() {
        return N.f13598e;
    }

    public static AbstractC2011u B(Object obj) {
        return v(obj);
    }

    public static AbstractC2011u D(Object obj, Object obj2) {
        return v(obj, obj2);
    }

    public static AbstractC2011u F(Object obj, Object obj2, Object obj3) {
        return v(obj, obj2, obj3);
    }

    public static AbstractC2011u G(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return v(obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC2011u I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return v(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static AbstractC2011u K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        O9.n.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return v(objArr2);
    }

    public static AbstractC2011u L(Comparator comparator, Iterable iterable) {
        O9.n.j(comparator);
        Object[] objArrK = AbstractC2014x.k(iterable);
        J.b(objArrK);
        Arrays.sort(objArrK, comparator);
        return p(objArrK);
    }

    static AbstractC2011u p(Object[] objArr) {
        return s(objArr, objArr.length);
    }

    static AbstractC2011u s(Object[] objArr, int i10) {
        return i10 == 0 ? A() : new N(objArr, i10);
    }

    public static a t() {
        return new a();
    }

    public static a u(int i10) {
        AbstractC1999h.b(i10, "expectedSize");
        return new a(i10);
    }

    private static AbstractC2011u v(Object... objArr) {
        return p(J.b(objArr));
    }

    public static AbstractC2011u w(Collection collection) {
        if (!(collection instanceof AbstractC2009s)) {
            return v(collection.toArray());
        }
        AbstractC2011u abstractC2011uB = ((AbstractC2009s) collection).b();
        return abstractC2011uB.i() ? p(abstractC2011uB.toArray()) : abstractC2011uB;
    }

    public static AbstractC2011u x(Object[] objArr) {
        return objArr.length == 0 ? A() : v((Object[]) objArr.clone());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: M */
    public AbstractC2011u subList(int i10, int i11) {
        O9.n.o(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? A() : N(i10, i11);
    }

    AbstractC2011u N(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // P9.AbstractC2009s
    int c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // P9.AbstractC2009s, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return A.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return A.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: l */
    public X iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return A.f(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y */
    public Y listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: z */
    public Y listIterator(int i10) {
        O9.n.m(i10, size());
        return isEmpty() ? f13724b : new b(this, i10);
    }

    @Override // P9.AbstractC2009s
    public final AbstractC2011u b() {
        return this;
    }
}
