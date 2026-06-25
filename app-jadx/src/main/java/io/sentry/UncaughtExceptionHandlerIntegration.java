package io.sentry;

import io.sentry.l4;
import io.sentry.util.C5288a;
import java.io.Closeable;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class UncaughtExceptionHandlerIntegration implements InterfaceC5247p0, Thread.UncaughtExceptionHandler, Closeable {

    /* JADX INFO: renamed from: f */
    private static final C5288a f49355f = new C5288a();

    /* JADX INFO: renamed from: a */
    private Thread.UncaughtExceptionHandler f49356a;

    /* JADX INFO: renamed from: b */
    private InterfaceC5114a0 f49357b;

    /* JADX INFO: renamed from: c */
    private C5322z3 f49358c;

    /* JADX INFO: renamed from: d */
    private boolean f49359d;

    /* JADX INFO: renamed from: e */
    private final l4 f49360e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends io.sentry.hints.d implements io.sentry.hints.m, io.sentry.hints.r {

        /* JADX INFO: renamed from: d */
        private final AtomicReference f49361d;

        public a(long j10, ILogger iLogger) {
            super(j10, iLogger);
            this.f49361d = new AtomicReference();
        }

        @Override // io.sentry.hints.f
        public boolean c(io.sentry.protocol.x xVar) {
            io.sentry.protocol.x xVar2 = (io.sentry.protocol.x) this.f49361d.get();
            return xVar2 != null && xVar2.equals(xVar);
        }

        @Override // io.sentry.hints.f
        public void d(io.sentry.protocol.x xVar) {
            this.f49361d.set(xVar);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(l4.a.c());
    }

    static Throwable a(Thread thread, Throwable th2) {
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.n(Boolean.FALSE);
        lVar.r("UncaughtExceptionHandler");
        return new io.sentry.exception.a(lVar, th2, thread);
    }

    private void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        h(uncaughtExceptionHandler, new HashSet());
    }

    private void h(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Set set) {
        if (uncaughtExceptionHandler == null) {
            C5322z3 c5322z3 = this.f49358c;
            if (c5322z3 != null) {
                c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!set.add(uncaughtExceptionHandler)) {
            C5322z3 c5322z32 = this.f49358c;
            if (c5322z32 != null) {
                c5322z32.getLogger().c(EnumC5215i3.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f49356a;
            if (this != uncaughtExceptionHandler2) {
                h(uncaughtExceptionHandler2, set);
                return;
            }
            uncaughtExceptionHandlerIntegration.f49356a = this.f49356a;
            C5322z3 c5322z33 = this.f49358c;
            if (c5322z33 != null) {
                c5322z33.getLogger().c(EnumC5215i3.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC5192e0 interfaceC5192e0A = f49355f.a();
        try {
            if (this == this.f49360e.b()) {
                this.f49360e.a(this.f49356a);
                C5322z3 c5322z3 = this.f49358c;
                if (c5322z3 != null) {
                    c5322z3.getLogger().c(EnumC5215i3.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                b(this.f49360e.b());
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public final void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        if (this.f49359d) {
            c5322z3.getLogger().c(EnumC5215i3.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f49359d = true;
        this.f49357b = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        C5322z3 c5322z32 = (C5322z3) io.sentry.util.w.c(c5322z3, "SentryOptions is required");
        this.f49358c = c5322z32;
        ILogger logger = c5322z32.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        logger.c(enumC5215i3, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f49358c.isEnableUncaughtExceptionHandler()));
        if (this.f49358c.isEnableUncaughtExceptionHandler()) {
            InterfaceC5192e0 interfaceC5192e0A = f49355f.a();
            try {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandlerB = this.f49360e.b();
                if (uncaughtExceptionHandlerB != null) {
                    this.f49358c.getLogger().c(enumC5215i3, "default UncaughtExceptionHandler class='" + uncaughtExceptionHandlerB.getClass().getName() + "'", new Object[0]);
                    if (uncaughtExceptionHandlerB instanceof UncaughtExceptionHandlerIntegration) {
                        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandlerB;
                        if (uncaughtExceptionHandlerIntegration.f49357b == null || interfaceC5114a0.v() != uncaughtExceptionHandlerIntegration.f49357b.v()) {
                            this.f49356a = uncaughtExceptionHandlerB;
                        } else {
                            this.f49356a = uncaughtExceptionHandlerIntegration.f49356a;
                        }
                    } else {
                        this.f49356a = uncaughtExceptionHandlerB;
                    }
                }
                this.f49360e.a(this);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                this.f49358c.getLogger().c(enumC5215i3, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.util.n.a("UncaughtExceptionHandler");
            } catch (Throwable th2) {
                if (interfaceC5192e0A != null) {
                    try {
                        interfaceC5192e0A.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        C5322z3 c5322z3 = this.f49358c;
        if (c5322z3 == null || this.f49357b == null) {
            return;
        }
        c5322z3.getLogger().c(EnumC5215i3.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f49358c.getFlushTimeoutMillis(), this.f49358c.getLogger());
            V2 v22 = new V2(a(thread, th2));
            v22.C0(EnumC5215i3.FATAL);
            if (this.f49357b.j() == null && v22.G() != null) {
                aVar.d(v22.G());
            }
            H hC = io.sentry.util.l.c(aVar);
            boolean zEquals = this.f49357b.y(v22, hC).equals(io.sentry.protocol.x.f51153b);
            io.sentry.hints.h hVarD = io.sentry.util.l.d(hC);
            if ((!zEquals || io.sentry.hints.h.MULTITHREADED_DEDUPLICATION.equals(hVarD)) && !aVar.g()) {
                this.f49358c.getLogger().c(EnumC5215i3.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", v22.G());
            }
        } catch (Throwable th3) {
            this.f49358c.getLogger().b(EnumC5215i3.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f49356a != null) {
            this.f49358c.getLogger().c(EnumC5215i3.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f49356a.uncaughtException(thread, th2);
        } else if (this.f49358c.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }

    UncaughtExceptionHandlerIntegration(l4 l4Var) {
        this.f49359d = false;
        this.f49360e = (l4) io.sentry.util.w.c(l4Var, "threadAdapter is required.");
    }
}
