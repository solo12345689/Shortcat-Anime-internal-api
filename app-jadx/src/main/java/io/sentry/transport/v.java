package io.sentry.transport;

import io.sentry.AbstractC5226l;
import io.sentry.AbstractC5244o2;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5249p2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class v extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f51392f = AbstractC5226l.i(2000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC5244o2 f51394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f51395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5249p2 f51396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A f51397e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements Future {
        a() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public v(int i10, int i11, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, ILogger iLogger, InterfaceC5249p2 interfaceC5249p2) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f51394b = null;
        this.f51397e = new A();
        this.f51393a = i11;
        this.f51395c = iLogger;
        this.f51396d = interfaceC5249p2;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th2) {
        try {
            super.afterExecute(runnable, th2);
        } finally {
            this.f51397e.a();
        }
    }

    public boolean b() {
        AbstractC5244o2 abstractC5244o2 = this.f51394b;
        return abstractC5244o2 != null && this.f51396d.now().b(abstractC5244o2) < f51392f;
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        z1.f.a(this);
    }

    public boolean g() {
        return this.f51397e.b() < this.f51393a;
    }

    void h(long j10) {
        try {
            this.f51397e.d(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f51395c.b(EnumC5215i3.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        if (!g()) {
            this.f51394b = this.f51396d.now();
            this.f51395c.c(EnumC5215i3.WARNING, "Submit cancelled", new Object[0]);
            return new a();
        }
        this.f51397e.c();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e10) {
            this.f51397e.a();
            this.f51394b = this.f51396d.now();
            this.f51395c.b(EnumC5215i3.WARNING, "Submit rejected by thread pool executor", e10);
            return new a();
        }
    }
}
