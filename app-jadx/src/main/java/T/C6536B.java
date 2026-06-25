package t;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: t.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C6536B implements Map, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f59958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C6557g f59959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C6568s f59960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l0 f59961d;

    public C6536B(c0 parent) {
        AbstractC5504s.h(parent, "parent");
        this.f59958a = parent;
    }

    public Set a() {
        C6557g c6557g = this.f59959b;
        if (c6557g != null) {
            return c6557g;
        }
        C6557g c6557g2 = new C6557g(this.f59958a);
        this.f59959b = c6557g2;
        return c6557g2;
    }

    public Set b() {
        C6568s c6568s = this.f59960c;
        if (c6568s != null) {
            return c6568s;
        }
        C6568s c6568s2 = new C6568s(this.f59958a);
        this.f59960c = c6568s2;
        return c6568s2;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f59958a.c(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f59958a.d(obj);
    }

    public int d() {
        return this.f59958a.f60047e;
    }

    public Collection e() {
        l0 l0Var = this.f59961d;
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(this.f59958a);
        this.f59961d = l0Var2;
        return l0Var2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AbstractC5504s.c(this.f59958a, ((C6536B) obj).f59958a);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f59958a.e(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f59958a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f59958a.h();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return d();
    }

    public String toString() {
        return this.f59958a.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return e();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
