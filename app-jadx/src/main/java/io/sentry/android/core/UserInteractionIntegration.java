package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.AbstractC2857k;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5247p0;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserInteractionIntegration implements InterfaceC5247p0, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f49639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5114a0 f49640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f49641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f49642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f49643e;

    public UserInteractionIntegration(Application application, io.sentry.util.s sVar) {
        this.f49639a = (Application) io.sentry.util.w.c(application, "Application is required");
        this.f49642d = sVar.d("androidx.core.view.GestureDetectorCompat", this.f49641c);
        this.f49643e = sVar.d("androidx.lifecycle.Lifecycle", this.f49641c);
    }

    private void a(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f49641c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC5215i3.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f49640b == null || this.f49641c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.f49640b, this.f49641c), this.f49641c));
    }

    private void b(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f49641c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(EnumC5215i3.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar = (io.sentry.android.core.internal.gestures.h) callback;
            hVar.c();
            if (hVar.a() instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.a());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f49639a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f49641c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC5215i3.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        this.f49641c = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        this.f49640b = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        boolean z10 = this.f49641c.isEnableUserInteractionBreadcrumbs() || this.f49641c.isEnableUserInteractionTracing();
        ILogger logger = this.f49641c.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        logger.c(enumC5215i3, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z10));
        if (z10) {
            if (!this.f49642d) {
                c5322z3.getLogger().c(EnumC5215i3.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f49639a.registerActivityLifecycleCallbacks(this);
            this.f49641c.getLogger().c(enumC5215i3, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.util.n.a("UserInteraction");
            if (this.f49643e) {
                Activity activityB = C5158q0.c().b();
                if ((activityB instanceof androidx.lifecycle.r) && ((androidx.lifecycle.r) activityB).getLifecycle().getCurrentState() == AbstractC2857k.b.f30239e) {
                    a(activityB);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
