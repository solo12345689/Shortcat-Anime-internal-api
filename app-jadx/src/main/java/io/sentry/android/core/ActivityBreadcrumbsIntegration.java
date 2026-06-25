package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C5191e;
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
public final class ActivityBreadcrumbsIntegration implements InterfaceC5247p0, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f49420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5114a0 f49421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5288a f49423d = new C5288a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f49420a = (Application) io.sentry.util.w.c(application, "Application is required");
    }

    private void a(Activity activity, String str) {
        if (this.f49421b == null) {
            return;
        }
        C5191e c5191e = new C5191e();
        c5191e.H("navigation");
        c5191e.D("state", str);
        c5191e.D("screen", b(activity));
        c5191e.C("ui.lifecycle");
        c5191e.E(EnumC5215i3.INFO);
        io.sentry.H h10 = new io.sentry.H();
        h10.k("android:activity", activity);
        this.f49421b.e(c5191e, h10);
    }

    private String b(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f49422c) {
            this.f49420a.unregisterActivityLifecycleCallbacks(this);
            InterfaceC5114a0 interfaceC5114a0 = this.f49421b;
            if (interfaceC5114a0 != null) {
                interfaceC5114a0.h().getLogger().c(EnumC5215i3.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        this.f49421b = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        this.f49422c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = c5322z3.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        logger.c(enumC5215i3, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f49422c));
        if (this.f49422c) {
            this.f49420a.registerActivityLifecycleCallbacks(this);
            c5322z3.getLogger().c(enumC5215i3, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.util.n.a("ActivityBreadcrumbs");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49423d.a();
        try {
            a(activity, "created");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49423d.a();
        try {
            a(activity, "destroyed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49423d.a();
        try {
            a(activity, "paused");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49423d.a();
        try {
            a(activity, "resumed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49423d.a();
        try {
            a(activity, "saveInstanceState");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49423d.a();
        try {
            a(activity, "started");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49423d.a();
        try {
            a(activity, "stopped");
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
}
