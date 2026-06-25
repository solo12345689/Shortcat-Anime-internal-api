package io.sentry.android.core;

import android.content.Context;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5247p0;
import io.sentry.V2;
import io.sentry.android.core.C5122c;
import io.sentry.util.C5288a;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class AnrIntegration implements InterfaceC5247p0, Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static C5122c f49444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final C5288a f49445f = new C5288a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49447b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5288a f49448c = new C5288a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C5322z3 f49449d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements io.sentry.hints.a, io.sentry.hints.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f49450a;

        a(boolean z10) {
            this.f49450a = z10;
        }

        @Override // io.sentry.hints.a
        public Long a() {
            return null;
        }

        @Override // io.sentry.hints.a
        public boolean f() {
            return true;
        }

        @Override // io.sentry.hints.a
        public String h() {
            return this.f49450a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(Context context) {
        this.f49446a = AbstractC5156p0.g(context);
    }

    public static /* synthetic */ void a(AnrIntegration anrIntegration, InterfaceC5114a0 interfaceC5114a0, SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC5192e0 interfaceC5192e0A = anrIntegration.f49448c.a();
        try {
            if (!anrIntegration.f49447b) {
                anrIntegration.l(interfaceC5114a0, sentryAndroidOptions);
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

    private Throwable h(boolean z10, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z10) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.a());
        io.sentry.protocol.l lVar = new io.sentry.protocol.l();
        lVar.r("ANR");
        return new io.sentry.exception.a(lVar, applicationNotResponding2, applicationNotResponding2.a(), true);
    }

    private void j(final InterfaceC5114a0 interfaceC5114a0, final SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.n.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrIntegration.a(this.f49580a, interfaceC5114a0, sentryAndroidOptions);
                    }
                });
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().b(EnumC5215i3.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }

    private void l(final InterfaceC5114a0 interfaceC5114a0, final SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC5192e0 interfaceC5192e0A = f49445f.a();
        try {
            if (f49444e == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
                logger.c(enumC5215i3, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                C5122c c5122c = new C5122c(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C5122c.a() { // from class: io.sentry.android.core.T
                    @Override // io.sentry.android.core.C5122c.a
                    public final void a(ApplicationNotResponding applicationNotResponding) {
                        this.f49625a.k(interfaceC5114a0, sentryAndroidOptions, applicationNotResponding);
                    }
                }, sentryAndroidOptions.getLogger(), this.f49446a);
                f49444e = c5122c;
                c5122c.start();
                sentryAndroidOptions.getLogger().c(enumC5215i3, "AnrIntegration installed.", new Object[0]);
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A == null) {
                throw th2;
            }
            try {
                interfaceC5192e0A.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49448c.a();
        try {
            this.f49447b = true;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            interfaceC5192e0A = f49445f.a();
            try {
                C5122c c5122c = f49444e;
                if (c5122c != null) {
                    c5122c.interrupt();
                    f49444e = null;
                    C5322z3 c5322z3 = this.f49449d;
                    if (c5322z3 != null) {
                        c5322z3.getLogger().c(EnumC5215i3.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public final void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        this.f49449d = (C5322z3) io.sentry.util.w.c(c5322z3, "SentryOptions is required");
        j(interfaceC5114a0, (SentryAndroidOptions) c5322z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(InterfaceC5114a0 interfaceC5114a0, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().c(EnumC5215i3.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = Boolean.TRUE.equals(C5123c0.l().m());
        V2 v22 = new V2(h(zEquals, sentryAndroidOptions, applicationNotResponding));
        v22.C0(EnumC5215i3.ERROR);
        interfaceC5114a0.y(v22, io.sentry.util.l.c(new a(zEquals)));
    }
}
