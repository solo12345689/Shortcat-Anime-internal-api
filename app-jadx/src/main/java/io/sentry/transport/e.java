package io.sentry.transport;

import io.sentry.AbstractC5226l;
import io.sentry.B1;
import io.sentry.C5265q2;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.H;
import io.sentry.ILogger;
import io.sentry.InterfaceC5249p2;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.transport.e;
import io.sentry.util.l;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f51359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.cache.g f51360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5322z3 f51361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f51362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f51363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n f51364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Runnable f51365g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51366a;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i10 = this.f51366a;
            this.f51366a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5265q2 f51367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final H f51368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.sentry.cache.g f51369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final B f51370d = B.a();

        c(C5265q2 c5265q2, H h10, io.sentry.cache.g gVar) {
            this.f51367a = (C5265q2) io.sentry.util.w.c(c5265q2, "Envelope is required.");
            this.f51368b = h10;
            this.f51369c = (io.sentry.cache.g) io.sentry.util.w.c(gVar, "EnvelopeCache is required.");
        }

        public static /* synthetic */ void a(c cVar, B b10, io.sentry.hints.q qVar) {
            e.this.f51361c.getLogger().c(EnumC5215i3.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(b10.d()));
            qVar.c(b10.d());
        }

        public static /* synthetic */ void b(c cVar, io.sentry.hints.f fVar) {
            if (!fVar.c(cVar.f51367a.b().a())) {
                e.this.f51361c.getLogger().c(EnumC5215i3.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                fVar.e();
                e.this.f51361c.getLogger().c(EnumC5215i3.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        public static /* synthetic */ void d(c cVar, boolean z10, C5265q2 c5265q2, Object obj, Class cls) {
            if (z10) {
                cVar.getClass();
            } else {
                io.sentry.util.t.a(cls, obj, e.this.f51361c.getLogger());
                e.this.f51361c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, c5265q2);
            }
        }

        public static /* synthetic */ void f(c cVar, boolean z10, Object obj, Class cls) {
            if (z10) {
                cVar.getClass();
            } else {
                io.sentry.util.t.a(cls, obj, e.this.f51361c.getLogger());
                e.this.f51361c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, cVar.f51367a);
            }
        }

        private B i() {
            B b10 = this.f51370d;
            this.f51367a.b().d(null);
            final boolean zQ1 = this.f51369c.q1(this.f51367a, this.f51368b);
            io.sentry.util.l.h(this.f51368b, io.sentry.hints.f.class, new l.a() { // from class: io.sentry.transport.g
                @Override // io.sentry.util.l.a
                public final void accept(Object obj) {
                    e.c.b(this.f51374a, (io.sentry.hints.f) obj);
                }
            });
            if (!e.this.f51363e.A()) {
                io.sentry.util.l.i(this.f51368b, io.sentry.hints.l.class, new l.a() { // from class: io.sentry.transport.j
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.l) obj).d(true);
                    }
                }, new l.b() { // from class: io.sentry.transport.k
                    @Override // io.sentry.util.l.b
                    public final void a(Object obj, Class cls) {
                        e.c.f(this.f51378a, zQ1, obj, cls);
                    }
                });
                return b10;
            }
            final C5265q2 c5265q2E = e.this.f51361c.getClientReportRecorder().e(this.f51367a);
            try {
                c5265q2E.b().d(AbstractC5226l.k(e.this.f51361c.getDateProvider().now().m()));
                B bH = e.this.f51364f.h(c5265q2E);
                if (bH.d()) {
                    this.f51369c.O(this.f51367a);
                    return bH;
                }
                String str = "The transport failed to send the envelope with response code " + bH.c();
                e.this.f51361c.getLogger().c(EnumC5215i3.ERROR, str, new Object[0]);
                if (bH.c() >= 400) {
                    this.f51369c.O(this.f51367a);
                    if (bH.c() != 429) {
                        e.this.f51361c.getClientReportRecorder().b(io.sentry.clientreport.f.NETWORK_ERROR, c5265q2E);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e10) {
                io.sentry.util.l.i(this.f51368b, io.sentry.hints.l.class, new l.a() { // from class: io.sentry.transport.h
                    @Override // io.sentry.util.l.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.l) obj).d(true);
                    }
                }, new l.b() { // from class: io.sentry.transport.i
                    @Override // io.sentry.util.l.b
                    public final void a(Object obj, Class cls) {
                        e.c.d(this.f51375a, zQ1, c5265q2E, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f51365g = this;
            final B bI = this.f51370d;
            try {
                bI = i();
                e.this.f51361c.getLogger().c(EnumC5215i3.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public e(C5322z3 c5322z3, z zVar, q qVar, B1 b12) {
        this(o(c5322z3.getMaxQueueSize(), c5322z3.getEnvelopeDiskCache(), c5322z3.getLogger(), c5322z3.getDateProvider()), c5322z3, zVar, qVar, new n(c5322z3, b12, zVar));
    }

    public static /* synthetic */ void b(e eVar, io.sentry.hints.g gVar) {
        eVar.getClass();
        gVar.b();
        eVar.f51361c.getLogger().c(EnumC5215i3.DEBUG, "Envelope enqueued", new Object[0]);
    }

    public static /* synthetic */ void h(io.sentry.cache.g gVar, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof c) {
            c cVar = (c) runnable;
            if (!io.sentry.util.l.f(cVar.f51368b, io.sentry.hints.e.class)) {
                gVar.q1(cVar.f51367a, cVar.f51368b);
            }
            q(cVar.f51368b, true);
            iLogger.c(EnumC5215i3.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    private static v o(int i10, final io.sentry.cache.g gVar, final ILogger iLogger, InterfaceC5249p2 interfaceC5249p2) {
        return new v(1, i10, new b(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                e.h(gVar, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger, interfaceC5249p2);
    }

    private static void q(H h10, final boolean z10) {
        io.sentry.util.l.h(h10, io.sentry.hints.q.class, new l.a() { // from class: io.sentry.transport.c
            @Override // io.sentry.util.l.a
            public final void accept(Object obj) {
                ((io.sentry.hints.q) obj).c(false);
            }
        });
        io.sentry.util.l.h(h10, io.sentry.hints.l.class, new l.a() { // from class: io.sentry.transport.d
            @Override // io.sentry.util.l.a
            public final void accept(Object obj) {
                ((io.sentry.hints.l) obj).d(z10);
            }
        });
    }

    @Override // io.sentry.transport.p
    public void c(boolean z10) {
        this.f51362d.close();
        this.f51359a.shutdown();
        this.f51361c.getLogger().c(EnumC5215i3.DEBUG, "Shutting down", new Object[0]);
        if (z10) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f51361c.getFlushTimeoutMillis();
            if (this.f51359a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f51361c.getLogger().c(EnumC5215i3.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f51359a.shutdownNow();
            if (this.f51365g != null) {
                this.f51359a.getRejectedExecutionHandler().rejectedExecution(this.f51365g, this.f51359a);
            }
        } catch (InterruptedException unused) {
            this.f51361c.getLogger().c(EnumC5215i3.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c(false);
    }

    @Override // io.sentry.transport.p
    public void d(long j10) {
        this.f51359a.h(j10);
    }

    @Override // io.sentry.transport.p
    public void e0(C5265q2 c5265q2, H h10) {
        io.sentry.cache.g gVarB = this.f51360b;
        boolean z10 = false;
        if (io.sentry.util.l.f(h10, io.sentry.hints.e.class)) {
            gVarB = r.b();
            this.f51361c.getLogger().c(EnumC5215i3.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z10 = true;
        }
        C5265q2 c5265q2L = this.f51362d.l(c5265q2, h10);
        if (c5265q2L == null) {
            if (z10) {
                this.f51360b.O(c5265q2);
                return;
            }
            return;
        }
        if (io.sentry.util.l.f(h10, UncaughtExceptionHandlerIntegration.a.class)) {
            c5265q2L = this.f51361c.getClientReportRecorder().e(c5265q2L);
        }
        Future futureSubmit = this.f51359a.submit(new c(c5265q2L, h10, gVarB));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            io.sentry.util.l.h(h10, io.sentry.hints.g.class, new l.a() { // from class: io.sentry.transport.b
                @Override // io.sentry.util.l.a
                public final void accept(Object obj) {
                    e.b(this.f51357a, (io.sentry.hints.g) obj);
                }
            });
        } else {
            this.f51361c.getClientReportRecorder().b(io.sentry.clientreport.f.QUEUE_OVERFLOW, c5265q2L);
        }
    }

    @Override // io.sentry.transport.p
    public boolean f() {
        return (this.f51362d.q() || this.f51359a.b()) ? false : true;
    }

    @Override // io.sentry.transport.p
    public z n() {
        return this.f51362d;
    }

    public e(v vVar, C5322z3 c5322z3, z zVar, q qVar, n nVar) {
        this.f51365g = null;
        this.f51359a = (v) io.sentry.util.w.c(vVar, "executor is required");
        this.f51360b = (io.sentry.cache.g) io.sentry.util.w.c(c5322z3.getEnvelopeDiskCache(), "envelopeCache is required");
        this.f51361c = (C5322z3) io.sentry.util.w.c(c5322z3, "options is required");
        this.f51362d = (z) io.sentry.util.w.c(zVar, "rateLimiter is required");
        this.f51363e = (q) io.sentry.util.w.c(qVar, "transportGate is required");
        this.f51364f = (n) io.sentry.util.w.c(nVar, "httpConnection is required");
    }
}
