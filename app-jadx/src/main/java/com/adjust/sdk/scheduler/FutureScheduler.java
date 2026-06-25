package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j10);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j10, long j11);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j10);

    void teardown();
}
