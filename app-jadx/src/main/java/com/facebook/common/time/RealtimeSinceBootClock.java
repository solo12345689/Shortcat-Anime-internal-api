package com.facebook.common.time;

import F5.b;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class RealtimeSinceBootClock implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RealtimeSinceBootClock f35736a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    public static RealtimeSinceBootClock get() {
        return f35736a;
    }

    @Override // F5.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // F5.b
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
