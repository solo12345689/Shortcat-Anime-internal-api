package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements io.sentry.util.thread.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f49905a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f49906b = Process.myTid();

    private l() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.k
            @Override // java.lang.Runnable
            public final void run() {
                l.f49906b = Process.myTid();
            }
        });
    }

    public static l e() {
        return f49905a;
    }

    @Override // io.sentry.util.thread.a
    public boolean a() {
        return h(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.a
    public String b() {
        return a() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public long c() {
        return Process.myTid();
    }

    public boolean f(long j10) {
        return Looper.getMainLooper().getThread().getId() == j10;
    }

    public boolean g(io.sentry.protocol.D d10) {
        Long l10 = d10.l();
        return l10 != null && f(l10.longValue());
    }

    public boolean h(Thread thread) {
        return f(thread.getId());
    }
}
