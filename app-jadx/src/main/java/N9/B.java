package n9;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class B implements InterfaceC5762f, InterfaceC5761e, InterfaceC5759c, C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f54002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5764h f54003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f54004c;

    public B(Executor executor, InterfaceC5764h interfaceC5764h, G g10) {
        this.f54002a = executor;
        this.f54003b = interfaceC5764h;
        this.f54004c = g10;
    }

    @Override // n9.InterfaceC5759c
    public final void a() {
        this.f54004c.v();
    }

    @Override // n9.C
    public final void b(i iVar) {
        this.f54002a.execute(new RunnableC5756A(this, iVar));
    }

    final /* synthetic */ InterfaceC5764h c() {
        return this.f54003b;
    }

    @Override // n9.InterfaceC5761e
    public final void onFailure(Exception exc) {
        this.f54004c.t(exc);
    }

    @Override // n9.InterfaceC5762f
    public final void onSuccess(Object obj) {
        this.f54004c.r(obj);
    }
}
