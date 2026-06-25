package d0;

import Ud.AbstractC2269j;
import java.util.Map;

/* JADX INFO: renamed from: d0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4550a extends AbstractC2269j {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return d((Map.Entry) obj);
        }
        return false;
    }

    public final boolean d(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return e(entry);
    }

    public abstract boolean e(Map.Entry entry);

    public final boolean f(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return i(entry);
    }

    public abstract boolean i(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }
}
