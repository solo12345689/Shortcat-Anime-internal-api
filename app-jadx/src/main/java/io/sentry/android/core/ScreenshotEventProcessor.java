package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import io.sentry.C5176b;
import io.sentry.EnumC5215i3;
import io.sentry.V2;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class ScreenshotEventProcessor implements io.sentry.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SentryAndroidOptions f49587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5131g0 f49588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.p f49589c = new io.sentry.android.core.internal.util.p(io.sentry.android.core.internal.util.h.a(), 2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C5131g0 c5131g0) {
        this.f49587a = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f49588b = (C5131g0) io.sentry.util.w.c(c5131g0, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.n.a("Screenshot");
        }
    }

    @Override // io.sentry.C
    public V2 b(V2 v22, io.sentry.H h10) {
        final Bitmap bitmapC;
        if (v22.z0()) {
            if (!this.f49587a.isAttachScreenshot()) {
                this.f49587a.getLogger().c(EnumC5215i3.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return v22;
            }
            Activity activityB = C5158q0.c().b();
            if (activityB != null && !io.sentry.util.l.g(h10)) {
                boolean zA = this.f49589c.a();
                this.f49587a.getBeforeScreenshotCaptureCallback();
                if (!zA && (bitmapC = io.sentry.android.core.internal.util.z.c(activityB, this.f49587a.getThreadChecker(), this.f49587a.getLogger(), this.f49588b)) != null) {
                    h10.m(C5176b.a(new Callable() { // from class: io.sentry.android.core.T0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return io.sentry.android.core.internal.util.z.d(bitmapC, this.f49628a.f49587a.getLogger());
                        }
                    }, "screenshot.png", "image/png", false));
                    h10.k("android:activity", activityB);
                }
            }
        }
        return v22;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E g(io.sentry.protocol.E e10, io.sentry.H h10) {
        return e10;
    }
}
