package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class SimpleSettableFuture implements Future {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f36555a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f36556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Exception f36557c;

    private final void a() {
        if (this.f36555a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public final Object b() {
        try {
            return get();
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void c(Object obj) {
        a();
        this.f36556b = obj;
        this.f36555a.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final void d(Exception exception) {
        AbstractC5504s.h(exception, "exception");
        a();
        this.f36557c = exception;
        this.f36555a.countDown();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        this.f36555a.await();
        if (this.f36557c == null) {
            return this.f36556b;
        }
        throw new ExecutionException(this.f36557c);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f36555a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit unit) throws ExecutionException, TimeoutException {
        AbstractC5504s.h(unit, "unit");
        if (this.f36555a.await(j10, unit)) {
            if (this.f36557c == null) {
                return this.f36556b;
            }
            throw new ExecutionException(this.f36557c);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
