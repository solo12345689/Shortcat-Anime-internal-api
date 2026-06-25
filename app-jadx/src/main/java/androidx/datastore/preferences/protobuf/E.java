package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f29216b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29217a;

    static {
        E e10 = new E();
        f29216b = e10;
        e10.k();
    }

    private E() {
        this.f29217a = true;
    }

    static int a(Map map) {
        int iD = 0;
        for (Map.Entry entry : map.entrySet()) {
            iD += d(entry.getValue()) ^ d(entry.getKey());
        }
        return iD;
    }

    private static int d(Object obj) {
        return obj instanceof byte[] ? AbstractC2816u.d((byte[]) obj) : obj.hashCode();
    }

    private static void e(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC2816u.a(obj);
            AbstractC2816u.a(map.get(obj));
        }
    }

    public static E f() {
        return f29216b;
    }

    private void g() {
        if (!j()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean h(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean i(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !h(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean j() {
        return this.f29217a;
    }

    public void k() {
        this.f29217a = false;
    }

    public void m(E e10) {
        g();
        if (e10.isEmpty()) {
            return;
        }
        putAll(e10);
    }

    public E p() {
        return isEmpty() ? new E() : new E(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        g();
        AbstractC2816u.a(obj);
        AbstractC2816u.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        g();
        e(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        return super.remove(obj);
    }

    private E(Map map) {
        super(map);
        this.f29217a = true;
    }
}
