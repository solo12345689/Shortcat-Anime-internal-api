package n9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class u implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ i f54035a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ v f54036b;

    u(v vVar, i iVar) {
        this.f54035a = iVar;
        Objects.requireNonNull(vVar);
        this.f54036b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f54036b;
        synchronized (vVar.a()) {
            try {
                if (vVar.c() != null) {
                    vVar.c().a(this.f54035a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
