package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class f28745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f28746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f28747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f28748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f28749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f28750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f28751g = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0492d f28752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f28753b;

        a(C0492d c0492d, Object obj) {
            this.f28752a = c0492d;
            this.f28753b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28752a.f28758a = this.f28753b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f28754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0492d f28755b;

        b(Application application, C0492d c0492d) {
            this.f28754a = application;
            this.f28755b = c0492d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28754a.unregisterActivityLifecycleCallbacks(this.f28755b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f28756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f28757b;

        c(Object obj, Object obj2) {
            this.f28756a = obj;
            this.f28757b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f28748d;
                if (method != null) {
                    method.invoke(this.f28756a, this.f28757b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f28749e.invoke(this.f28756a, this.f28757b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    static {
        Class clsA = a();
        f28745a = clsA;
        f28746b = b();
        f28747c = f();
        f28748d = d(clsA);
        f28749e = c(clsA);
        f28750f = e(clsA);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f28747c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f28751g.postAtFrontOfQueue(new c(f28746b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f28750f == null) {
            return false;
        }
        if (f28749e == null && f28748d == null) {
            return false;
        }
        try {
            Object obj2 = f28747c.get(activity);
            if (obj2 == null || (obj = f28746b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0492d c0492d = new C0492d(activity);
            application.registerActivityLifecycleCallbacks(c0492d);
            Handler handler = f28751g;
            handler.post(new a(c0492d, obj2));
            try {
                if (g()) {
                    Method method = f28750f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0492d));
                return true;
            } catch (Throwable th2) {
                f28751g.post(new b(application, c0492d));
                throw th2;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0492d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f28759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f28760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f28761d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f28762e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f28763f = false;

        C0492d(Activity activity) {
            this.f28759b = activity;
            this.f28760c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f28759b == activity) {
                this.f28759b = null;
                this.f28762e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f28762e || this.f28763f || this.f28761d || !d.h(this.f28758a, this.f28760c, activity)) {
                return;
            }
            this.f28763f = true;
            this.f28758a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f28759b == activity) {
                this.f28761d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
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
}
