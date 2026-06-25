package P9;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: P9.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2006o extends AbstractC2007p implements Map {
    protected AbstractC2006o() {
    }

    protected abstract Map b();

    @Override // java.util.Map
    public void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return b().get(obj);
    }

    protected boolean h(Object obj) {
        return C.b(this, obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return b().keySet();
    }

    protected boolean m(Object obj) {
        return C.c(this, obj);
    }

    protected int n() {
        return T.d(entrySet());
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return b().values();
    }
}
