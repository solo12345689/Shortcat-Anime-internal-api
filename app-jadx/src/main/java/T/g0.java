package t;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5496j;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class g0 implements Set, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f60072a;

    public g0(e0 parent) {
        AbstractC5504s.h(parent, "parent");
        this.f60072a = parent;
    }

    public int b() {
        return this.f60072a.f60057d;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f60072a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC5504s.h(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f60072a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AbstractC5504s.c(this.f60072a, ((g0) obj).f60072a);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f60072a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f60072a.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC5496j.a(this);
    }

    public String toString() {
        return this.f60072a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC5504s.h(array, "array");
        return AbstractC5496j.b(this, array);
    }
}
