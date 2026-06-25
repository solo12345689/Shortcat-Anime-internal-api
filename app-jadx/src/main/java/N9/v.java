package n9;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class v implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f54037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f54038b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5760d f54039c;

    public v(Executor executor, InterfaceC5760d interfaceC5760d) {
        this.f54037a = executor;
        this.f54039c = interfaceC5760d;
    }

    final /* synthetic */ Object a() {
        return this.f54038b;
    }

    @Override // n9.C
    public final void b(i iVar) {
        synchronized (this.f54038b) {
            try {
                if (this.f54039c == null) {
                    return;
                }
                this.f54037a.execute(new u(this, iVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ InterfaceC5760d c() {
        return this.f54039c;
    }
}
