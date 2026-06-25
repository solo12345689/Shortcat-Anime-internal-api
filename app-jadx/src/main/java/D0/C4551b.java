package d0;

import java.util.Map;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: d0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C4551b implements Map.Entry, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f44897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f44898b;

    public C4551b(Object obj, Object obj2) {
        this.f44897a = obj;
        this.f44898b = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && AbstractC5504s.c(entry.getKey(), getKey()) && AbstractC5504s.c(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f44897a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f44898b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
