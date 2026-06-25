package gd;

import I1.g;
import I1.r;
import Td.L;
import Td.u;
import Td.v;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import expo.modules.splashscreen.SplashScreenOptions;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f47436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static g f47437d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f47434a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f47435b = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ReactMarker.MarkerListener f47438e = new ReactMarker.MarkerListener() { // from class: gd.a
        @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
        public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
            d.i(reactMarkerConstants, str, i10);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f47439a;

        a(View view) {
            this.f47439a = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (d.f47435b) {
                return false;
            }
            this.f47439a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f47440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f47441b;

        b(Activity activity, Application application) {
            this.f47440a = activity;
            this.f47441b = application;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC5504s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC5504s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC5504s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC5504s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            AbstractC5504s.h(activity, "activity");
            AbstractC5504s.h(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC5504s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC5504s.h(activity, "activity");
            if (AbstractC5504s.c(activity, this.f47440a)) {
                Activity activity2 = this.f47440a;
                try {
                    u.a aVar = u.f17466b;
                    activity2.getSplashScreen().clearOnExitAnimationListener();
                    u.b(L.f17438a);
                } catch (Throwable th2) {
                    u.a aVar2 = u.f17466b;
                    u.b(v.a(th2));
                }
                this.f47441b.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    private d() {
    }

    private final void e(SplashScreenOptions splashScreenOptions) {
        if (f47437d == null) {
            return;
        }
        final long duration = splashScreenOptions.getDuration();
        g gVar = f47437d;
        if (gVar == null) {
            AbstractC5504s.u("splashScreen");
            gVar = null;
        }
        gVar.c(new g.e() { // from class: gd.b
            @Override // I1.g.e
            public final void a(I1.u uVar) {
                d.g(duration, uVar);
            }
        });
    }

    static /* synthetic */ void f(d dVar, SplashScreenOptions splashScreenOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            splashScreenOptions = new SplashScreenOptions();
        }
        dVar.e(splashScreenOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(long j10, final I1.u splashScreenViewProvider) {
        AbstractC5504s.h(splashScreenViewProvider, "splashScreenViewProvider");
        final View viewA = splashScreenViewProvider.a();
        viewA.animate().setDuration(j10).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).withEndAction(new Runnable() { // from class: gd.c
            @Override // java.lang.Runnable
            public final void run() {
                d.h(splashScreenViewProvider, viewA);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(I1.u uVar, View view) {
        if (Build.VERSION.SDK_INT < 31) {
            uVar.b();
        } else {
            AbstractC5504s.f(view, "null cannot be cast to non-null type android.window.SplashScreenView");
            r.a(view).remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ReactMarkerConstants name, String str, int i10) {
        AbstractC5504s.h(name, "name");
        if (name != ReactMarkerConstants.CONTENT_APPEARED || f47436c) {
            return;
        }
        f47434a.j();
    }

    public final void j() {
        f47435b = false;
    }

    public final void k(Activity mainActivity) {
        AbstractC5504s.h(mainActivity, "mainActivity");
        f47437d = g.f8745b.a(mainActivity);
        ReactMarker.addListener(f47438e);
        View viewFindViewById = mainActivity.findViewById(R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new a(viewFindViewById));
        f(this, null, 1, null);
        int i10 = Build.VERSION.SDK_INT;
        if (31 > i10 || i10 >= 34) {
            return;
        }
        Application application = mainActivity.getApplication();
        application.registerActivityLifecycleCallbacks(new b(mainActivity, application));
    }

    public final void l(boolean z10) {
        f47436c = z10;
    }

    public final void m(SplashScreenOptions options) {
        AbstractC5504s.h(options, "options");
        e(options);
    }

    public final void n() {
        ReactMarker.removeListener(f47438e);
    }
}
