package io.sentry.hints;

import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements f, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f50734a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f50735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f50736c;

    public d(long j10, ILogger iLogger) {
        this.f50735b = j10;
        this.f50736c = iLogger;
    }

    @Override // io.sentry.hints.f
    public void e() {
        this.f50734a.countDown();
    }

    @Override // io.sentry.hints.i
    public boolean g() {
        try {
            return this.f50734a.await(this.f50735b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f50736c.b(EnumC5215i3.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }
}
