package n9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class o implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ i f54021a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ p f54022b;

    o(p pVar, i iVar) {
        this.f54021a = iVar;
        Objects.requireNonNull(pVar);
        this.f54022b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f54021a;
        if (iVar.m()) {
            this.f54022b.c().v();
            return;
        }
        try {
            this.f54022b.c().r(this.f54022b.a().a(iVar));
        } catch (C5763g e10) {
            if (!(e10.getCause() instanceof Exception)) {
                this.f54022b.c().t(e10);
                return;
            }
            p pVar = this.f54022b;
            pVar.c().t((Exception) e10.getCause());
        } catch (Exception e11) {
            this.f54022b.c().t(e11);
        }
    }
}
