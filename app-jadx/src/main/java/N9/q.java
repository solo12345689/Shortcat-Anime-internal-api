package n9;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f54026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f54027b;

    q(r rVar, i iVar) {
        this.f54026a = iVar;
        Objects.requireNonNull(rVar);
        this.f54027b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i iVar = (i) this.f54027b.c().a(this.f54026a);
            if (iVar == null) {
                this.f54027b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            r rVar = this.f54027b;
            Executor executor = k.f54019b;
            iVar.f(executor, rVar);
            iVar.d(executor, rVar);
            iVar.a(executor, rVar);
        } catch (C5763g e10) {
            if (!(e10.getCause() instanceof Exception)) {
                this.f54027b.d().t(e10);
                return;
            }
            r rVar2 = this.f54027b;
            rVar2.d().t((Exception) e10.getCause());
        } catch (Exception e11) {
            this.f54027b.d().t(e11);
        }
    }
}
