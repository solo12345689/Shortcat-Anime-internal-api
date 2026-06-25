package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f50430a;

    public i(Looper looper) {
        AbstractC5504s.h(looper, "looper");
        this.f50430a = new Handler(looper);
    }

    public final Handler a() {
        return this.f50430a;
    }

    public final boolean b(Runnable runnable) {
        AbstractC5504s.h(runnable, "runnable");
        return this.f50430a.post(runnable);
    }

    public final boolean c(Runnable runnable, long j10) {
        Handler handler = this.f50430a;
        if (runnable == null) {
            return false;
        }
        return handler.postDelayed(runnable, j10);
    }

    public final void d(Runnable runnable) {
        Handler handler = this.f50430a;
        if (runnable == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(Looper looper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            looper = Looper.getMainLooper();
            AbstractC5504s.g(looper, "getMainLooper(...)");
        }
        this(looper);
    }
}
