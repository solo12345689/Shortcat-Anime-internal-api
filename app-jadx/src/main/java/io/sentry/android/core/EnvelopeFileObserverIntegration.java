package io.sentry.android.core;

import io.sentry.C5243o1;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5247p0;
import io.sentry.util.C5288a;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnvelopeFileObserverIntegration implements InterfaceC5247p0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private B0 f49488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ILogger f49489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49490c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final C5288a f49491d = new C5288a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        protected String h(C5322z3 c5322z3) {
            return c5322z3.getOutboxPath();
        }
    }

    public static /* synthetic */ void a(EnvelopeFileObserverIntegration envelopeFileObserverIntegration, InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3, String str) {
        InterfaceC5192e0 interfaceC5192e0A = envelopeFileObserverIntegration.f49491d.a();
        try {
            if (!envelopeFileObserverIntegration.f49490c) {
                envelopeFileObserverIntegration.j(interfaceC5114a0, c5322z3, str);
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

    public static EnvelopeFileObserverIntegration b() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    private void j(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3, String str) {
        B0 b02 = new B0(str, new C5243o1(interfaceC5114a0, c5322z3.getEnvelopeReader(), c5322z3.getSerializer(), c5322z3.getLogger(), c5322z3.getFlushTimeoutMillis(), c5322z3.getMaxQueueSize()), c5322z3.getLogger(), c5322z3.getFlushTimeoutMillis());
        this.f49488a = b02;
        try {
            b02.startWatching();
            c5322z3.getLogger().c(EnumC5215i3.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            io.sentry.util.n.a("EnvelopeFileObserver");
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49491d.a();
        try {
            this.f49490c = true;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            B0 b02 = this.f49488a;
            if (b02 != null) {
                b02.stopWatching();
                ILogger iLogger = this.f49489b;
                if (iLogger != null) {
                    iLogger.c(EnumC5215i3.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
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
    public final void g(final InterfaceC5114a0 interfaceC5114a0, final C5322z3 c5322z3) {
        io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        io.sentry.util.w.c(c5322z3, "SentryOptions is required");
        this.f49489b = c5322z3.getLogger();
        final String strH = h(c5322z3);
        if (strH == null) {
            this.f49489b.c(EnumC5215i3.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f49489b.c(EnumC5215i3.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", strH);
        try {
            c5322z3.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.C0
                @Override // java.lang.Runnable
                public final void run() {
                    EnvelopeFileObserverIntegration.a(this.f49480a, interfaceC5114a0, c5322z3, strH);
                }
            });
        } catch (Throwable th2) {
            this.f49489b.b(EnumC5215i3.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }

    abstract String h(C5322z3 c5322z3);
}
