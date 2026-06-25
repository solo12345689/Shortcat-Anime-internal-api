package n9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class y implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ i f54045a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ z f54046b;

    y(z zVar, i iVar) {
        this.f54045a = iVar;
        Objects.requireNonNull(zVar);
        this.f54046b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f54046b;
        synchronized (zVar.a()) {
            try {
                if (zVar.c() != null) {
                    zVar.c().onSuccess(this.f54045a.k());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
