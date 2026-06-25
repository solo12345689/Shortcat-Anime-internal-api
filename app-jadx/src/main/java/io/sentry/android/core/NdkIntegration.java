package io.sentry.android.core;

import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5247p0;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class NdkIntegration implements InterfaceC5247p0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f49543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SentryAndroidOptions f49544b;

    public NdkIntegration(Class cls) {
        this.f49543a = cls;
    }

    private void a(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f49544b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f49543a;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.f49544b.getLogger().c(EnumC5215i3.DEBUG, "NdkIntegration removed.", new Object[0]);
                        a(this.f49544b);
                    } catch (Throwable th2) {
                        this.f49544b.getLogger().b(EnumC5215i3.ERROR, "Failed to close SentryNdk.", th2);
                        a(this.f49544b);
                    }
                } catch (NoSuchMethodException e10) {
                    this.f49544b.getLogger().b(EnumC5215i3.ERROR, "Failed to invoke the SentryNdk.close method.", e10);
                    a(this.f49544b);
                }
            }
        } catch (Throwable th3) {
            a(this.f49544b);
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public final void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        this.f49544b = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f49544b.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        logger.c(enumC5215i3, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || this.f49543a == null) {
            a(this.f49544b);
            return;
        }
        if (this.f49544b.getCacheDirPath() == null) {
            this.f49544b.getLogger().c(EnumC5215i3.ERROR, "No cache dir path is defined in options.", new Object[0]);
            a(this.f49544b);
            return;
        }
        try {
            this.f49543a.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f49544b);
            this.f49544b.getLogger().c(enumC5215i3, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.n.a("Ndk");
        } catch (NoSuchMethodException e10) {
            a(this.f49544b);
            this.f49544b.getLogger().b(EnumC5215i3.ERROR, "Failed to invoke the SentryNdk.init method.", e10);
        } catch (Throwable th2) {
            a(this.f49544b);
            this.f49544b.getLogger().b(EnumC5215i3.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }
}
