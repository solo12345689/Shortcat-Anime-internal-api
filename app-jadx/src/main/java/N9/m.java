package n9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f54020a = new CountDownLatch(1);

    /* synthetic */ m(byte[] bArr) {
    }

    @Override // n9.InterfaceC5759c
    public final void a() {
        this.f54020a.countDown();
    }

    public final void b() throws InterruptedException {
        this.f54020a.await();
    }

    public final boolean c(long j10, TimeUnit timeUnit) {
        return this.f54020a.await(j10, timeUnit);
    }

    @Override // n9.InterfaceC5761e
    public final void onFailure(Exception exc) {
        this.f54020a.countDown();
    }

    @Override // n9.InterfaceC5762f
    public final void onSuccess(Object obj) {
        this.f54020a.countDown();
    }
}
