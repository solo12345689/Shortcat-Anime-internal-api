package T;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f16728a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f16729b = new LinkedHashMap();

    public final h a(k kVar) {
        return (h) this.f16729b.get(kVar);
    }

    public final k b(h hVar) {
        return (k) this.f16728a.get(hVar);
    }

    public final void c(h hVar) {
        k kVar = (k) this.f16728a.get(hVar);
        if (kVar != null) {
        }
        this.f16728a.remove(hVar);
    }

    public final void d(h hVar, k kVar) {
        this.f16728a.put(hVar, kVar);
        this.f16729b.put(kVar, hVar);
    }
}
