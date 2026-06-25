package n9;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class t implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f54032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f54033b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5759c f54034c;

    public t(Executor executor, InterfaceC5759c interfaceC5759c) {
        this.f54032a = executor;
        this.f54034c = interfaceC5759c;
    }

    final /* synthetic */ Object a() {
        return this.f54033b;
    }

    @Override // n9.C
    public final void b(i iVar) {
        if (iVar.m()) {
            synchronized (this.f54033b) {
                try {
                    if (this.f54034c == null) {
                        return;
                    }
                    this.f54032a.execute(new s(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    final /* synthetic */ InterfaceC5759c c() {
        return this.f54034c;
    }
}
