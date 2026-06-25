package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class B0 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.Q f49472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f49473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f49474d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements io.sentry.hints.e, io.sentry.hints.l, io.sentry.hints.q, io.sentry.hints.i, io.sentry.hints.b, io.sentry.hints.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f49475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f49476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CountDownLatch f49477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f49478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ILogger f49479e;

        public a(long j10, ILogger iLogger) {
            reset();
            this.f49478d = j10;
            this.f49479e = (ILogger) io.sentry.util.w.c(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.l
        public boolean a() {
            return this.f49475a;
        }

        @Override // io.sentry.hints.q
        public void c(boolean z10) {
            this.f49476b = z10;
            this.f49477c.countDown();
        }

        @Override // io.sentry.hints.l
        public void d(boolean z10) {
            this.f49475a = z10;
        }

        @Override // io.sentry.hints.q
        public boolean e() {
            return this.f49476b;
        }

        @Override // io.sentry.hints.i
        public boolean g() {
            try {
                return this.f49477c.await(this.f49478d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f49479e.b(EnumC5215i3.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }

        @Override // io.sentry.hints.k
        public void reset() {
            this.f49477c = new CountDownLatch(1);
            this.f49475a = false;
            this.f49476b = false;
        }
    }

    B0(String str, io.sentry.Q q10, ILogger iLogger, long j10) {
        super(str);
        this.f49471a = str;
        this.f49472b = (io.sentry.Q) io.sentry.util.w.c(q10, "Envelope sender is required.");
        this.f49473c = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
        this.f49474d = j10;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        if (str == null || i10 != 8) {
            return;
        }
        this.f49473c.c(EnumC5215i3.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i10), this.f49471a, str);
        io.sentry.H hC = io.sentry.util.l.c(new a(this.f49474d, this.f49473c));
        this.f49472b.a(this.f49471a + File.separator + str, hC);
    }
}
