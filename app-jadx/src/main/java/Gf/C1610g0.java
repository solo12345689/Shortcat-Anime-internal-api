package Gf;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: Gf.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1610g0 implements InterfaceC1612h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f7577a;

    public C1610g0(Future future) {
        this.f7577a = future;
    }

    @Override // Gf.InterfaceC1612h0
    public void dispose() {
        this.f7577a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f7577a + ']';
    }
}
