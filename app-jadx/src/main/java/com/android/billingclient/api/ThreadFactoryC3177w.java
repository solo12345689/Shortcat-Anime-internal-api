package com.android.billingclient.api;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.android.billingclient.api.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class ThreadFactoryC3177w implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadFactory f35552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f35553b;

    ThreadFactoryC3177w(C3157b c3157b) {
        Objects.requireNonNull(c3157b);
        this.f35552a = Executors.defaultThreadFactory();
        this.f35553b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f35553b;
        Thread threadNewThread = this.f35552a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
