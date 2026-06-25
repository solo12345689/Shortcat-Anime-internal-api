package P1;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f13257a = new ArrayList();

    public final void a(b listener) {
        AbstractC5504s.h(listener, "listener");
        this.f13257a.add(listener);
    }

    public final void b() {
        for (int iO = AbstractC2279u.o(this.f13257a); -1 < iO; iO--) {
            ((b) this.f13257a.get(iO)).a();
        }
    }

    public final void c(b listener) {
        AbstractC5504s.h(listener, "listener");
        this.f13257a.remove(listener);
    }
}
