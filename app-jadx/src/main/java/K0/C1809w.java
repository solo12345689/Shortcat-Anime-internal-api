package K0;

import Ud.AbstractC2279u;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6542H;
import t.C6546L;

/* JADX INFO: renamed from: K0.w */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1809w implements List, InterfaceC5371a {

    /* JADX INFO: renamed from: a */
    private C6546L f10819a = new C6546L(16);

    /* JADX INFO: renamed from: b */
    private C6542H f10820b = new C6542H(16);

    /* JADX INFO: renamed from: c */
    private int f10821c = -1;

    /* JADX INFO: renamed from: K0.w$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements List, InterfaceC5371a {

        /* JADX INFO: renamed from: a */
        private final int f10826a;

        /* JADX INFO: renamed from: b */
        private final int f10827b;

        public b(int i10, int i11) {
            this.f10826a = i10;
            this.f10827b = i11;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean b(e.c cVar) {
            return indexOf(cVar) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof e.c) {
                return b((e.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((e.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: d */
        public e.c get(int i10) {
            Object objC = C1809w.this.f10819a.c(i10 + this.f10826a);
            AbstractC5504s.f(objC, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) objC;
        }

        public int e() {
            return this.f10827b - this.f10826a;
        }

        public int f(e.c cVar) {
            int i10 = this.f10826a;
            int i11 = this.f10827b;
            if (i10 > i11) {
                return -1;
            }
            while (!AbstractC5504s.c(C1809w.this.f10819a.c(i10), cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.f10826a;
        }

        public int i(e.c cVar) {
            int i10 = this.f10827b;
            int i11 = this.f10826a;
            if (i11 > i10) {
                return -1;
            }
            while (!AbstractC5504s.c(C1809w.this.f10819a.c(i10), cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f10826a;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof e.c) {
                return f((e.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            C1809w c1809w = C1809w.this;
            int i10 = this.f10826a;
            return c1809w.new a(i10, i10, this.f10827b);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof e.c) {
                return i((e.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            C1809w c1809w = C1809w.this;
            int i10 = this.f10826a;
            return c1809w.new a(i10, i10, this.f10827b);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            C1809w c1809w = C1809w.this;
            int i12 = this.f10826a;
            return c1809w.new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC5496j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            C1809w c1809w = C1809w.this;
            int i11 = this.f10826a;
            return c1809w.new a(i10 + i11, i11, this.f10827b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC5496j.b(this, objArr);
        }
    }

    private final void A(int i10) {
        this.f10819a.r(i10);
        this.f10820b.h(i10);
    }

    public final void B(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.f10819a.s(i10, i11);
        this.f10820b.i(i10, i11);
    }

    private final long p() {
        long jB = AbstractC1810x.b(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i10 = this.f10821c + 1;
        int iO = AbstractC2279u.o(this);
        if (i10 <= iO) {
            while (true) {
                long jB2 = r.b(this.f10820b.a(i10));
                if (r.a(jB2, jB) < 0) {
                    jB = jB2;
                }
                if ((r.c(jB) < 0.0f && r.e(jB)) || i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        return jB;
    }

    public final void D(e.c cVar, float f10, boolean z10, InterfaceC5082a interfaceC5082a) {
        if (this.f10821c == AbstractC2279u.o(this)) {
            int i10 = this.f10821c;
            B(this.f10821c + 1, size());
            this.f10821c++;
            this.f10819a.k(cVar);
            this.f10820b.d(AbstractC1810x.a(f10, z10, false));
            interfaceC5082a.invoke();
            this.f10821c = i10;
            if (this.f10821c + 1 == AbstractC2279u.o(this) || r.d(p())) {
                A(this.f10821c + 1);
                return;
            }
            return;
        }
        long jP = p();
        int i11 = this.f10821c;
        this.f10821c = AbstractC2279u.o(this);
        int i12 = this.f10821c;
        B(this.f10821c + 1, size());
        this.f10821c++;
        this.f10819a.k(cVar);
        this.f10820b.d(AbstractC1810x.a(f10, z10, false));
        interfaceC5082a.invoke();
        this.f10821c = i12;
        long jP2 = p();
        if (this.f10821c + 1 >= AbstractC2279u.o(this) || r.a(jP, jP2) <= 0) {
            B(this.f10821c + 1, size());
        } else {
            B(i11 + 1, r.d(jP2) ? this.f10821c + 2 : this.f10821c + 1);
        }
        this.f10821c = i11;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        this.f10821c = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f10821c = -1;
        this.f10819a.n();
        this.f10820b.f();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof e.c) {
            return n((e.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((e.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof e.c) {
            return w((e.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f10819a.f();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof e.c) {
            return z((e.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public boolean n(e.c cVar) {
        return indexOf(cVar) != -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r */
    public e.c get(int i10) {
        Object objC = this.f10819a.c(i10);
        AbstractC5504s.f(objC, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (e.c) objC;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return t();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return new b(i10, i11);
    }

    public int t() {
        return this.f10819a.d();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    public final boolean u() {
        long jP = p();
        return r.c(jP) < 0.0f && r.e(jP) && !r.d(jP);
    }

    public final void v(e.c cVar, boolean z10, InterfaceC5082a interfaceC5082a) {
        if (this.f10821c == AbstractC2279u.o(this)) {
            int i10 = this.f10821c;
            B(this.f10821c + 1, size());
            this.f10821c++;
            this.f10819a.k(cVar);
            this.f10820b.d(AbstractC1810x.a(0.0f, z10, true));
            interfaceC5082a.invoke();
            this.f10821c = i10;
            return;
        }
        long jP = p();
        int i11 = this.f10821c;
        if (!r.d(jP)) {
            if (r.c(jP) > 0.0f) {
                int i12 = this.f10821c;
                B(this.f10821c + 1, size());
                this.f10821c++;
                this.f10819a.k(cVar);
                this.f10820b.d(AbstractC1810x.a(0.0f, z10, true));
                interfaceC5082a.invoke();
                this.f10821c = i12;
                return;
            }
            return;
        }
        this.f10821c = AbstractC2279u.o(this);
        int i13 = this.f10821c;
        B(this.f10821c + 1, size());
        this.f10821c++;
        this.f10819a.k(cVar);
        this.f10820b.d(AbstractC1810x.a(0.0f, z10, true));
        interfaceC5082a.invoke();
        this.f10821c = i13;
        if (r.c(p()) < 0.0f) {
            B(i11 + 1, this.f10821c + 1);
        }
        this.f10821c = i11;
    }

    public int w(e.c cVar) {
        int iO = AbstractC2279u.o(this);
        if (iO < 0) {
            return -1;
        }
        int i10 = 0;
        while (!AbstractC5504s.c(this.f10819a.c(i10), cVar)) {
            if (i10 == iO) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public final boolean y(float f10, boolean z10) {
        if (this.f10821c == AbstractC2279u.o(this)) {
            return true;
        }
        return r.a(p(), AbstractC1810x.b(f10, z10, false, 4, null)) > 0;
    }

    public int z(e.c cVar) {
        for (int iO = AbstractC2279u.o(this); -1 < iO; iO--) {
            if (AbstractC5504s.c(this.f10819a.c(iO), cVar)) {
                return iO;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC5496j.b(this, objArr);
    }

    /* JADX INFO: renamed from: K0.w$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements ListIterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a */
        private int f10822a;

        /* JADX INFO: renamed from: b */
        private final int f10823b;

        /* JADX INFO: renamed from: c */
        private final int f10824c;

        public a(int i10, int i11, int i12) {
            this.f10822a = i10;
            this.f10823b = i11;
            this.f10824c = i12;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b */
        public e.c next() {
            C6546L c6546l = C1809w.this.f10819a;
            int i10 = this.f10822a;
            this.f10822a = i10 + 1;
            Object objC = c6546l.c(i10);
            AbstractC5504s.f(objC, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) objC;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d */
        public e.c previous() {
            C6546L c6546l = C1809w.this.f10819a;
            int i10 = this.f10822a - 1;
            this.f10822a = i10;
            Object objC = c6546l.c(i10);
            AbstractC5504s.f(objC, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) objC;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f10822a < this.f10824c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f10822a > this.f10823b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f10822a - this.f10823b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f10822a - this.f10823b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(C1809w c1809w, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? c1809w.size() : i12);
        }
    }
}
