package n9;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class z implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f54047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f54048b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5762f f54049c;

    public z(Executor executor, InterfaceC5762f interfaceC5762f) {
        this.f54047a = executor;
        this.f54049c = interfaceC5762f;
    }

    final /* synthetic */ Object a() {
        return this.f54048b;
    }

    @Override // n9.C
    public final void b(i iVar) {
        if (iVar.o()) {
            synchronized (this.f54048b) {
                try {
                    if (this.f54049c == null) {
                        return;
                    }
                    this.f54047a.execute(new y(this, iVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    final /* synthetic */ InterfaceC5762f c() {
        return this.f54049c;
    }
}
