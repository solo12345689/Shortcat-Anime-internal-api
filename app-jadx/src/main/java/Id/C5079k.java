package id;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: id.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5079k implements Map {

    /* JADX INFO: renamed from: b */
    public static final C5079k f48870b = new C5079k(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: a */
    private final Map f48871a;

    private C5079k(Map map) {
        this.f48871a = Collections.unmodifiableMap(b(map));
    }

    private static InterfaceC5075g a(String str, Object obj) {
        if (obj instanceof InterfaceC5075g) {
            return (InterfaceC5075g) obj;
        }
        if (obj instanceof Integer) {
            return C5074f.e(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return C5074f.e(((Long) obj).longValue());
        }
        if (obj instanceof String) {
            return o.f((String) obj);
        }
        if (obj instanceof Boolean) {
            return C5069a.e(((Boolean) obj).booleanValue());
        }
        if (obj instanceof byte[]) {
            return C5070b.e((byte[]) obj);
        }
        if (obj instanceof BigDecimal) {
            return C5071c.f((BigDecimal) obj);
        }
        throw new IllegalArgumentException("Can't map value for parameter '" + str + "': " + obj.getClass());
    }

    private static Map b(Map map) {
        Objects.requireNonNull(map, "Map must not be null");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String strA = r.a((String) entry.getKey());
            InterfaceC5075g interfaceC5075gA = a(strA, entry.getValue());
            if (!interfaceC5075gA.a().isEmpty()) {
                throw new IllegalArgumentException("Parameter value for '" + strA + "' must be bare item (no parameters)");
            }
            linkedHashMap.put((String) entry.getKey(), interfaceC5075gA);
        }
        return linkedHashMap;
    }

    public static C5079k p(Map map) {
        return new C5079k(map);
    }

    @Override // java.util.Map
    public void clear() {
        this.f48871a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f48871a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f48871a.containsValue(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d */
    public InterfaceC5075g compute(String str, BiFunction biFunction) {
        return (InterfaceC5075g) this.f48871a.compute(str, biFunction);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e */
    public InterfaceC5075g computeIfAbsent(String str, Function function) {
        return (InterfaceC5075g) this.f48871a.computeIfAbsent(str, function);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.f48871a.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.f48871a.equals(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f */
    public InterfaceC5075g computeIfPresent(String str, BiFunction biFunction) {
        return (InterfaceC5075g) this.f48871a.computeIfPresent(str, biFunction);
    }

    @Override // java.util.Map
    public void forEach(BiConsumer biConsumer) {
        this.f48871a.forEach(biConsumer);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g */
    public InterfaceC5075g get(Object obj) {
        return (InterfaceC5075g) this.f48871a.get(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h */
    public InterfaceC5075g getOrDefault(Object obj, InterfaceC5075g interfaceC5075g) {
        return (InterfaceC5075g) this.f48871a.getOrDefault(obj, interfaceC5075g);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f48871a.hashCode();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i */
    public InterfaceC5075g merge(String str, InterfaceC5075g interfaceC5075g, BiFunction biFunction) {
        return (InterfaceC5075g) this.f48871a.merge(str, interfaceC5075g, biFunction);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f48871a.isEmpty();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j */
    public InterfaceC5075g put(String str, InterfaceC5075g interfaceC5075g) {
        return (InterfaceC5075g) this.f48871a.put(str, interfaceC5075g);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: k */
    public InterfaceC5075g putIfAbsent(String str, InterfaceC5075g interfaceC5075g) {
        return (InterfaceC5075g) this.f48871a.putIfAbsent(str, interfaceC5075g);
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f48871a.keySet();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: l */
    public InterfaceC5075g remove(Object obj) {
        return (InterfaceC5075g) this.f48871a.remove(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: m */
    public InterfaceC5075g replace(String str, InterfaceC5075g interfaceC5075g) {
        return (InterfaceC5075g) this.f48871a.replace(str, interfaceC5075g);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: n */
    public boolean replace(String str, InterfaceC5075g interfaceC5075g, InterfaceC5075g interfaceC5075g2) {
        return this.f48871a.replace(str, interfaceC5075g, interfaceC5075g2);
    }

    public StringBuilder o(StringBuilder sb2) {
        for (Map.Entry entry : this.f48871a.entrySet()) {
            sb2.append(';');
            sb2.append((String) entry.getKey());
            if (!((InterfaceC5075g) entry.getValue()).get().equals(Boolean.TRUE)) {
                sb2.append('=');
                ((InterfaceC5075g) entry.getValue()).c(sb2);
            }
        }
        return sb2;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f48871a.putAll(map);
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        this.f48871a.replaceAll(biFunction);
    }

    @Override // java.util.Map
    public int size() {
        return this.f48871a.size();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f48871a.values();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.f48871a.remove(obj, obj2);
    }
}
