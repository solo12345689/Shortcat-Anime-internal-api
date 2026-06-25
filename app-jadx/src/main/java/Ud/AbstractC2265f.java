package Ud;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import je.InterfaceC5371a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Ud.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2265f implements Map, InterfaceC5371a {

    /* JADX INFO: renamed from: a */
    public static final a f19510a = new a(null);

    /* JADX INFO: renamed from: Ud.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    protected AbstractC2265f() {
    }

    private final String j(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    private final String k(Map.Entry entry) {
        return j(entry.getKey()) + '=' + j(entry.getValue());
    }

    public static final CharSequence l(AbstractC2265f abstractC2265f, Map.Entry it) {
        AbstractC5504s.h(it, "it");
        return abstractC2265f.k(it);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (AbstractC5504s.c(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        AbstractC5504s.f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!AbstractC5504s.c(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    public abstract Set e();

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return e();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!d((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Set f();

    public abstract int g();

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    public abstract Collection i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return f();
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
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return g();
    }

    public String toString() {
        return F.w0(entrySet(), ", ", "{", "}", 0, null, new Function1() { // from class: Ud.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC2265f.l(this.f19509a, (Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return i();
    }
}
