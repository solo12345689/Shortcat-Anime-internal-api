package n9;

import R8.AbstractC2115p;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class w implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ i f54040a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ x f54041b;

    w(x xVar, i iVar) {
        this.f54040a = iVar;
        Objects.requireNonNull(xVar);
        this.f54041b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f54041b;
        synchronized (xVar.a()) {
            try {
                if (xVar.c() != null) {
                    xVar.c().onFailure((Exception) AbstractC2115p.l(this.f54040a.j()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
