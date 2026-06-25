package Nd;

import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f12810a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f12811b;

    private final void a(sb.c cVar) {
        this.f12810a.add(cVar);
    }

    private final void d() {
        if (this.f12811b == null) {
            return;
        }
        sb.c cVar = (sb.c) this.f12810a.poll();
        while (cVar != null) {
            cVar.apply(this.f12811b);
            cVar = (sb.c) this.f12810a.poll();
        }
    }

    public final void b() {
        this.f12811b = null;
        this.f12810a.clear();
    }

    public final void c(sb.c action) {
        AbstractC5504s.h(action, "action");
        Object obj = this.f12811b;
        if (obj != null) {
            action.apply(obj);
        } else {
            a(action);
        }
    }

    public final boolean e() {
        return this.f12811b != null;
    }

    public final void f(Object obj) {
        this.f12811b = obj;
        d();
    }
}
