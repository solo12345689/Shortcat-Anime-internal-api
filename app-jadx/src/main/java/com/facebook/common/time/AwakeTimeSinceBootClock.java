package com.facebook.common.time;

import F5.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AwakeTimeSinceBootClock implements c {
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // F5.c, F5.b
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // F5.c, F5.b
    public long nowNanos() {
        return System.nanoTime();
    }
}
