package t;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import je.InterfaceC5372b;
import je.InterfaceC5376f;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6702a;

/* JADX INFO: renamed from: t.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6552b implements Collection, Set, InterfaceC5372b, InterfaceC5376f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f60038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f60039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60040c;

    /* JADX INFO: renamed from: t.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a extends AbstractC6559i {
        public a() {
            super(C6552b.this.i());
        }

        @Override // t.AbstractC6559i
        protected Object b(int i10) {
            return C6552b.this.t(i10);
        }

        @Override // t.AbstractC6559i
        protected void d(int i10) {
            C6552b.this.l(i10);
        }
    }

    public C6552b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iC;
        int i11 = i();
        if (obj == null) {
            iC = AbstractC6554d.d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = AbstractC6554d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i12 = ~iC;
        if (i11 >= e().length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            int[] iArrE = e();
            Object[] objArrD = d();
            AbstractC6554d.a(this, i13);
            if (i11 != i()) {
                throw new ConcurrentModificationException();
            }
            if (!(e().length == 0)) {
                AbstractC2273n.p(iArrE, e(), 0, 0, iArrE.length, 6, null);
                AbstractC2273n.r(objArrD, d(), 0, 0, objArrD.length, 6, null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            AbstractC2273n.k(e(), e(), i14, i12, i11);
            AbstractC2273n.m(d(), d(), i14, i12, i11);
        }
        if (i11 != i() || i12 >= e().length) {
            throw new ConcurrentModificationException();
        }
        e()[i12] = i10;
        d()[i12] = obj;
        r(i() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        b(i() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int i10) {
        int i11 = i();
        if (e().length < i10) {
            int[] iArrE = e();
            Object[] objArrD = d();
            AbstractC6554d.a(this, i10);
            if (i() > 0) {
                AbstractC2273n.p(iArrE, e(), 0, 0, i(), 6, null);
                AbstractC2273n.r(objArrD, d(), 0, 0, i(), 6, null);
            }
        }
        if (i() != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (i() != 0) {
            p(AbstractC6702a.f61093a);
            n(AbstractC6702a.f61095c);
            r(0);
        }
        if (i() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object[] d() {
        return this.f60039b;
    }

    public final int[] e() {
        return this.f60038a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = i();
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(t(i11))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public int f() {
        return this.f60040c;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrE = e();
        int i10 = i();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArrE[i12];
        }
        return i11;
    }

    public final int i() {
        return this.f60040c;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC6554d.d(this) : AbstractC6554d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return i() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final Object l(int i10) {
        int i11;
        Object[] objArr;
        int i12 = i();
        Object obj = d()[i10];
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        if (e().length <= 8 || i() >= e().length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                AbstractC2273n.k(e(), e(), i10, i14, i12);
                AbstractC2273n.m(d(), d(), i10, i14, i12);
            }
            d()[i13] = null;
        } else {
            int i15 = i() > 8 ? i() + (i() >> 1) : 8;
            int[] iArrE = e();
            Object[] objArrD = d();
            AbstractC6554d.a(this, i15);
            if (i10 > 0) {
                AbstractC2273n.p(iArrE, e(), 0, 0, i10, 6, null);
                objArr = objArrD;
                AbstractC2273n.r(objArr, d(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrD;
            }
            if (i11 < i13) {
                int i16 = i11 + 1;
                AbstractC2273n.k(iArrE, e(), i11, i16, i12);
                AbstractC2273n.m(objArr, d(), i11, i16, i12);
            }
        }
        if (i12 != i()) {
            throw new ConcurrentModificationException();
        }
        r(i13);
        return obj;
    }

    public final void n(Object[] objArr) {
        AbstractC5504s.h(objArr, "<set-?>");
        this.f60039b = objArr;
    }

    public final void p(int[] iArr) {
        AbstractC5504s.h(iArr, "<set-?>");
        this.f60038a = iArr;
    }

    public final void r(int i10) {
        this.f60040c = i10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        l(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        boolean z10 = false;
        for (int i10 = i() - 1; -1 < i10; i10--) {
            if (!AbstractC2279u.e0(elements, d()[i10])) {
                l(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return f();
    }

    public final Object t(int i10) {
        return d()[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC2273n.t(this.f60039b, 0, this.f60040c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i() * 14);
        sb2.append('{');
        int i10 = i();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objT = t(i11);
            if (objT != this) {
                sb2.append(objT);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public C6552b(int i10) {
        this.f60038a = AbstractC6702a.f61093a;
        this.f60039b = AbstractC6702a.f61095c;
        if (i10 > 0) {
            AbstractC6554d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        Object[] objArrA = AbstractC6553c.a(array, this.f60040c);
        AbstractC2273n.m(this.f60039b, objArrA, 0, 0, this.f60040c);
        AbstractC5504s.e(objArrA);
        return objArrA;
    }

    public /* synthetic */ C6552b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
