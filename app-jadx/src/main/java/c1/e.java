package c1;

import Df.r;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Collection, InterfaceC5371a {

    /* JADX INFO: renamed from: c */
    public static final a f33423c = new a(null);

    /* JADX INFO: renamed from: d */
    private static final e f33424d = new e(AbstractC2279u.m());

    /* JADX INFO: renamed from: a */
    private final List f33425a;

    /* JADX INFO: renamed from: b */
    private final int f33426b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return g.a().a();
        }

        public final e b() {
            return e.f33424d;
        }

        private a() {
        }
    }

    public e(List list) {
        this.f33425a = list;
        this.f33426b = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d) {
            return d((d) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f33425a.containsAll(collection);
    }

    public boolean d(d dVar) {
        return this.f33425a.contains(dVar);
    }

    public final d e(int i10) {
        return (d) this.f33425a.get(i10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && AbstractC5504s.c(this.f33425a, ((e) obj).f33425a);
    }

    public final List f() {
        return this.f33425a;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f33425a.hashCode();
    }

    public int i() {
        return this.f33426b;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f33425a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f33425a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f33425a + ')';
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC5496j.b(this, objArr);
    }

    public e(String str) {
        List listN0 = r.N0(str, new String[]{com.amazon.a.a.o.b.f.f34694a}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(listN0.size());
        int size = listN0.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(r.k1((String) listN0.get(i10)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(new d((String) arrayList.get(i11)));
        }
        this(arrayList2);
    }
}
