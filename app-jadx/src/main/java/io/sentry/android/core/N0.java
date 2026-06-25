package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f49542a;

    N0() {
        this(Looper.getMainLooper());
    }

    public Thread a() {
        return this.f49542a.getLooper().getThread();
    }

    public void b(Runnable runnable) {
        this.f49542a.post(runnable);
    }

    N0(Looper looper) {
        this.f49542a = new Handler(looper);
    }
}
