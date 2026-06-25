package xa;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: xa.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7097x extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C7097x f64284b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f64285a;

    static {
        C7097x c7097x = new C7097x();
        f64284b = c7097x;
        c7097x.k();
    }

    private C7097x() {
        this.f64285a = true;
    }

    static int a(Map map) {
        int iD = 0;
        for (Map.Entry entry : map.entrySet()) {
            iD += d(entry.getValue()) ^ d(entry.getKey());
        }
        return iD;
    }

    private static int d(Object obj) {
        return obj instanceof byte[] ? AbstractC7091q.d((byte[]) obj) : obj.hashCode();
    }

    private static void e(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC7091q.a(obj);
            AbstractC7091q.a(map.get(obj));
        }
    }

    public static C7097x f() {
        return f64284b;
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
        return this.f64285a;
    }

    public void k() {
        this.f64285a = false;
    }

    public void m(C7097x c7097x) {
        g();
        if (c7097x.isEmpty()) {
            return;
        }
        putAll(c7097x);
    }

    public C7097x p() {
        return isEmpty() ? new C7097x() : new C7097x(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        g();
        AbstractC7091q.a(obj);
        AbstractC7091q.a(obj2);
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

    private C7097x(Map map) {
        super(map);
        this.f64285a = true;
    }
}
