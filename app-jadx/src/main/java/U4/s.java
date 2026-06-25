package U4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19314a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f19315b = new HashMap();

    s() {
    }

    private Map b(boolean z10) {
        return z10 ? this.f19315b : this.f19314a;
    }

    l a(S4.f fVar, boolean z10) {
        return (l) b(z10).get(fVar);
    }

    void c(S4.f fVar, l lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    void d(S4.f fVar, l lVar) {
        Map mapB = b(lVar.p());
        if (lVar.equals(mapB.get(fVar))) {
            mapB.remove(fVar);
        }
    }
}
