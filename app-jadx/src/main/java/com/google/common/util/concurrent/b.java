package com.google.common.util.concurrent;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends AbstractExecutorService implements r, AutoCloseable {
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p submit(Runnable runnable) {
        return (p) super.submit(runnable);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        z1.f.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p submit(Runnable runnable, Object obj) {
        return (p) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return x.J(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return x.K(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public p submit(Callable callable) {
        return (p) super.submit(callable);
    }
}
