package n9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class s implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ t f54031a;

    s(t tVar) {
        Objects.requireNonNull(tVar);
        this.f54031a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f54031a;
        synchronized (tVar.a()) {
            try {
                if (tVar.c() != null) {
                    tVar.c().a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
