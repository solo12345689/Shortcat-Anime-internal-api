package n9;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class r implements InterfaceC5762f, InterfaceC5761e, InterfaceC5759c, C {

    /* JADX INFO: renamed from: a */
    private final Executor f54028a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5757a f54029b;

    /* JADX INFO: renamed from: c */
    private final G f54030c;

    public r(Executor executor, InterfaceC5757a interfaceC5757a, G g10) {
        this.f54028a = executor;
        this.f54029b = interfaceC5757a;
        this.f54030c = g10;
    }

    @Override // n9.InterfaceC5759c
    public final void a() {
        this.f54030c.v();
    }

    @Override // n9.C
    public final void b(i iVar) {
        this.f54028a.execute(new q(this, iVar));
    }

    final /* synthetic */ InterfaceC5757a c() {
        return this.f54029b;
    }

    final /* synthetic */ G d() {
        return this.f54030c;
    }

    @Override // n9.InterfaceC5761e
    public final void onFailure(Exception exc) {
        this.f54030c.t(exc);
    }

    @Override // n9.InterfaceC5762f
    public final void onSuccess(Object obj) {
        this.f54030c.r(obj);
    }
}
