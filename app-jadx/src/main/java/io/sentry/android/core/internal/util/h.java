package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements io.sentry.transport.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final io.sentry.transport.o f49903a = new h();

    private h() {
    }

    public static io.sentry.transport.o a() {
        return f49903a;
    }

    @Override // io.sentry.transport.o
    public long getCurrentTimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
