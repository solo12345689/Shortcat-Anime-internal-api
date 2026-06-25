package n9;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class x implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f54042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f54043b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5761e f54044c;

    public x(Executor executor, InterfaceC5761e interfaceC5761e) {
        this.f54042a = executor;
        this.f54044c = interfaceC5761e;
    }

    final /* synthetic */ Object a() {
        return this.f54043b;
    }

    @Override // n9.C
    public final void b(i iVar) {
        if (iVar.o() || iVar.m()) {
            return;
        }
        synchronized (this.f54043b) {
            try {
                if (this.f54044c == null) {
                    return;
                }
                this.f54042a.execute(new w(this, iVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ InterfaceC5761e c() {
        return this.f54044c;
    }
}
