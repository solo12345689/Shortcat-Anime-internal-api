package g0;

import Td.L;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f47210a = new AtomicReference(s.f47213a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f47211b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f47212c;

    public final Object a() {
        long jA = w.a();
        return jA == v.a() ? this.f47212c : ((u) this.f47210a.get()).b(jA);
    }

    public final void b(Object obj) {
        long jA = w.a();
        if (jA == v.a()) {
            this.f47212c = obj;
            return;
        }
        synchronized (this.f47211b) {
            u uVar = (u) this.f47210a.get();
            if (uVar.d(jA, obj)) {
                return;
            }
            this.f47210a.set(uVar.c(jA, obj));
            L l10 = L.f17438a;
        }
    }
}
