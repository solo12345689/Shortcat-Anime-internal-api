package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.C5191e;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5247p0;
import io.sentry.protocol.C5255e;
import java.io.Closeable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class AppComponentsBreadcrumbsIntegration implements InterfaceC5247p0, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.H f49462e = new io.sentry.H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5114a0 f49464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f49465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.p f49466d = new io.sentry.android.core.internal.util.p(io.sentry.android.core.internal.util.h.a(), 60000, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f49463a = (Context) io.sentry.util.w.c(AbstractC5156p0.g(context), "Context is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(long j10, Configuration configuration) {
        if (this.f49464b != null) {
            C5255e.b bVarA = io.sentry.android.core.internal.util.q.a(this.f49463a.getResources().getConfiguration().orientation);
            String lowerCase = bVarA != null ? bVarA.name().toLowerCase(Locale.ROOT) : "undefined";
            C5191e c5191e = new C5191e(j10);
            c5191e.H("navigation");
            c5191e.C("device.orientation");
            c5191e.D("position", lowerCase);
            c5191e.E(EnumC5215i3.INFO);
            io.sentry.H h10 = new io.sentry.H();
            h10.k("android:configuration", configuration);
            this.f49464b.e(c5191e, h10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(long j10, int i10) {
        if (this.f49464b != null) {
            C5191e c5191e = new C5191e(j10);
            c5191e.H("system");
            c5191e.C("device.event");
            c5191e.F("Low memory");
            c5191e.D("action", "LOW_MEMORY");
            c5191e.D("level", Integer.valueOf(i10));
            c5191e.E(EnumC5215i3.WARNING);
            this.f49464b.e(c5191e, f49462e);
        }
    }

    private void k(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f49465c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.f49465c.getLogger().a(EnumC5215i3.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f49463a.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f49465c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(EnumC5215i3.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f49465c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(EnumC5215i3.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        this.f49464b = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        this.f49465c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        logger.c(enumC5215i3, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f49465c.isEnableAppComponentBreadcrumbs()));
        if (this.f49465c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f49463a.registerComponentCallbacks(this);
                c5322z3.getLogger().c(enumC5215i3, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.n.a("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.f49465c.setEnableAppComponentBreadcrumbs(false);
                c5322z3.getLogger().a(EnumC5215i3.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(final Configuration configuration) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        k(new Runnable() { // from class: io.sentry.android.core.Y
            @Override // java.lang.Runnable
            public final void run() {
                this.f49650a.h(jCurrentTimeMillis, configuration);
            }
        });
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(final int i10) {
        if (i10 >= 40 && !this.f49466d.a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            k(new Runnable() { // from class: io.sentry.android.core.Z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49655a.j(jCurrentTimeMillis, i10);
                }
            });
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
