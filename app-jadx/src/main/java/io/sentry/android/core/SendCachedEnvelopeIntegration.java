package io.sentry.android.core;

import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.EnumC5221k;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5247p0;
import io.sentry.M;
import io.sentry.T1;
import io.sentry.W1;
import io.sentry.util.C5288a;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class SendCachedEnvelopeIntegration implements InterfaceC5247p0, M.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W1 f49590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.p f49591b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.M f49593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC5114a0 f49594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SentryAndroidOptions f49595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private T1 f49596g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f49592c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f49597h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f49598i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C5288a f49599j = new C5288a();

    public SendCachedEnvelopeIntegration(W1 w12, io.sentry.util.p pVar) {
        this.f49590a = (W1) io.sentry.util.w.c(w12, "SendFireAndForgetFactory is required");
        this.f49591b = pVar;
    }

    public static /* synthetic */ void b(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, InterfaceC5114a0 interfaceC5114a0) {
        sendCachedEnvelopeIntegration.getClass();
        try {
            if (sendCachedEnvelopeIntegration.f49598i.get()) {
                sentryAndroidOptions.getLogger().c(EnumC5215i3.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeIntegration.f49597h.getAndSet(true)) {
                io.sentry.M connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                sendCachedEnvelopeIntegration.f49593d = connectionStatusProvider;
                connectionStatusProvider.C1(sendCachedEnvelopeIntegration);
                sendCachedEnvelopeIntegration.f49596g = sendCachedEnvelopeIntegration.f49590a.c(interfaceC5114a0, sentryAndroidOptions);
            }
            io.sentry.M m10 = sendCachedEnvelopeIntegration.f49593d;
            if (m10 != null && m10.x0() == M.a.DISCONNECTED) {
                sentryAndroidOptions.getLogger().c(EnumC5215i3.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            io.sentry.transport.z zVarN = interfaceC5114a0.n();
            if (zVarN != null && zVarN.o(EnumC5221k.All)) {
                sentryAndroidOptions.getLogger().c(EnumC5215i3.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            T1 t12 = sendCachedEnvelopeIntegration.f49596g;
            if (t12 == null) {
                sentryAndroidOptions.getLogger().c(EnumC5215i3.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                t12.a();
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(EnumC5215i3.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    private void h(final InterfaceC5114a0 interfaceC5114a0, final SentryAndroidOptions sentryAndroidOptions) {
        try {
            InterfaceC5192e0 interfaceC5192e0A = this.f49599j.a();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.U0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeIntegration.b(this.f49636a, sentryAndroidOptions, interfaceC5114a0);
                    }
                });
                if (((Boolean) this.f49591b.a()).booleanValue() && this.f49592c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } finally {
            }
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().b(EnumC5215i3.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(EnumC5215i3.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }

    @Override // io.sentry.M.b
    public void a(M.a aVar) {
        SentryAndroidOptions sentryAndroidOptions;
        InterfaceC5114a0 interfaceC5114a0 = this.f49594e;
        if (interfaceC5114a0 == null || (sentryAndroidOptions = this.f49595f) == null || aVar == M.a.DISCONNECTED) {
            return;
        }
        h(interfaceC5114a0, sentryAndroidOptions);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f49598i.set(true);
        io.sentry.M m10 = this.f49593d;
        if (m10 != null) {
            m10.P1(this);
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        this.f49594e = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        this.f49595f = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        if (!this.f49590a.d(c5322z3.getCacheDirPath(), c5322z3.getLogger())) {
            c5322z3.getLogger().c(EnumC5215i3.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.util.n.a("SendCachedEnvelope");
            h(interfaceC5114a0, this.f49595f);
        }
    }
}
