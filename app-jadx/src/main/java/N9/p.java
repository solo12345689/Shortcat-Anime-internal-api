package n9;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class p implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f54023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5757a f54024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f54025c;

    public p(Executor executor, InterfaceC5757a interfaceC5757a, G g10) {
        this.f54023a = executor;
        this.f54024b = interfaceC5757a;
        this.f54025c = g10;
    }

    final /* synthetic */ InterfaceC5757a a() {
        return this.f54024b;
    }

    @Override // n9.C
    public final void b(i iVar) {
        this.f54023a.execute(new o(this, iVar));
    }

    final /* synthetic */ G c() {
        return this.f54025c;
    }
}
