package io.sentry.android.core;

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
public final class AppLifecycleIntegration implements InterfaceC5247p0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5288a f49467a = new C5288a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile M0 f49468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f49469c;

    private void a() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49467a.a();
        try {
            M0 m02 = this.f49468b;
            this.f49468b = null;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            if (m02 != null) {
                C5123c0.l().q(m02);
                SentryAndroidOptions sentryAndroidOptions = this.f49469c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
        C5123c0.l().C();
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        this.f49469c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        logger.c(enumC5215i3, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f49469c.isEnableAutoSessionTracking()));
        this.f49469c.getLogger().c(enumC5215i3, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f49469c.isEnableAppLifecycleBreadcrumbs()));
        if (!this.f49469c.isEnableAutoSessionTracking() && !this.f49469c.isEnableAppLifecycleBreadcrumbs()) {
            return;
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f49467a.a();
        try {
            if (this.f49468b != null) {
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } else {
                this.f49468b = new M0(interfaceC5114a0, this.f49469c.getSessionTrackingIntervalMillis(), this.f49469c.isEnableAutoSessionTracking(), this.f49469c.isEnableAppLifecycleBreadcrumbs());
                C5123c0.l().h(this.f49468b);
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                c5322z3.getLogger().c(enumC5215i3, "AppLifecycleIntegration installed.", new Object[0]);
                io.sentry.util.n.a("AppLifecycle");
            }
        } finally {
        }
    }
}
