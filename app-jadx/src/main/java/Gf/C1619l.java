package Gf;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: Gf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1619l implements InterfaceC1621m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f7585a;

    public C1619l(Future future) {
        this.f7585a = future;
    }

    @Override // Gf.InterfaceC1621m
    public void a(Throwable th2) {
        this.f7585a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f7585a + ']';
    }
}
