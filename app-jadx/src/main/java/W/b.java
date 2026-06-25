package W;

import B.o;
import w.InterfaceC6904i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20495a = new b();

    private b() {
    }

    public final InterfaceC6904i a(B.j jVar) {
        if ((jVar instanceof o.b) || (jVar instanceof B.b) || (jVar instanceof B.g) || (jVar instanceof B.d)) {
            return c.f20497b;
        }
        return null;
    }

    public final InterfaceC6904i b(B.j jVar) {
        if (!(jVar instanceof o.b) && !(jVar instanceof B.b)) {
            if (jVar instanceof B.g) {
                return c.f20499d;
            }
            if (jVar instanceof B.d) {
                return c.f20498c;
            }
            return null;
        }
        return c.f20498c;
    }
}
