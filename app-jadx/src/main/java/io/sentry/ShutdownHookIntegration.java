package io.sentry;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class ShutdownHookIntegration implements InterfaceC5247p0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f49318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f49319b;

    public ShutdownHookIntegration(Runtime runtime) {
        this.f49318a = (Runtime) io.sentry.util.w.c(runtime, "Runtime is required");
    }

    public static /* synthetic */ void a(ShutdownHookIntegration shutdownHookIntegration, C5322z3 c5322z3) {
        shutdownHookIntegration.f49318a.addShutdownHook(shutdownHookIntegration.f49319b);
        c5322z3.getLogger().c(EnumC5215i3.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        io.sentry.util.n.a("ShutdownHook");
    }

    private void j(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e10;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f49319b != null) {
            j(new Runnable() { // from class: io.sentry.P3
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration shutdownHookIntegration = this.f49290a;
                    shutdownHookIntegration.f49318a.removeShutdownHook(shutdownHookIntegration.f49319b);
                }
            });
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(final InterfaceC5114a0 interfaceC5114a0, final C5322z3 c5322z3) {
        io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        io.sentry.util.w.c(c5322z3, "SentryOptions is required");
        if (!c5322z3.isEnableShutdownHook()) {
            c5322z3.getLogger().c(EnumC5215i3.INFO, "enableShutdownHook is disabled.", new Object[0]);
        } else {
            this.f49319b = new Thread(new Runnable() { // from class: io.sentry.Q3
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC5114a0.d(c5322z3.getFlushTimeoutMillis());
                }
            }, "sentry-shutdownhook");
            j(new Runnable() { // from class: io.sentry.R3
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.a(this.f49297a, c5322z3);
                }
            });
        }
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }
}
