package qf;

import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;
import pf.InterfaceC6044i;
import rf.AbstractC6317g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class Y extends O0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pf.n f58031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5082a f58032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6044i f58033d;

    public Y(pf.n storageManager, InterfaceC5082a computation) {
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(computation, "computation");
        this.f58031b = storageManager;
        this.f58032c = computation;
        this.f58033d = storageManager.c(computation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S V0(AbstractC6317g abstractC6317g, Y y10) {
        return abstractC6317g.a((uf.i) y10.f58032c.invoke());
    }

    @Override // qf.O0
    protected S R0() {
        return (S) this.f58033d.invoke();
    }

    @Override // qf.O0
    public boolean S0() {
        return this.f58033d.o();
    }

    @Override // qf.S
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public Y X0(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new Y(this.f58031b, new X(kotlinTypeRefiner, this));
    }
}
