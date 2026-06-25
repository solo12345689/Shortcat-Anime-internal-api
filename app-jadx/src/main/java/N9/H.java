package n9;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class H implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f54015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f54016b;

    H(G g10, Callable callable) {
        this.f54015a = g10;
        this.f54016b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f54015a.r(this.f54016b.call());
        } catch (Exception e10) {
            this.f54015a.t(e10);
        } catch (Throwable th2) {
            this.f54015a.t(new RuntimeException(th2));
        }
    }
}
