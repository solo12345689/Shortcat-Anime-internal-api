package io.sentry.android.core;

import android.net.TrafficStats;
import io.sentry.InterfaceC5202g0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class N implements InterfaceC5202g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N f49541a = new N();

    private N() {
    }

    public static N c() {
        return f49541a;
    }

    @Override // io.sentry.InterfaceC5202g0
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.InterfaceC5202g0
    public void b() {
        TrafficStats.setThreadStatsTag(61441);
    }
}
