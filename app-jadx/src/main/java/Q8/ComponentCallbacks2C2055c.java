package Q8;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Q8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComponentCallbacks2C2055c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C2055c f14456e = new ComponentCallbacks2C2055c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f14457a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f14458b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f14459c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14460d = false;

    /* JADX INFO: renamed from: Q8.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(boolean z10);
    }

    private ComponentCallbacks2C2055c() {
    }

    public static ComponentCallbacks2C2055c b() {
        return f14456e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C2055c componentCallbacks2C2055c = f14456e;
        synchronized (componentCallbacks2C2055c) {
            try {
                if (!componentCallbacks2C2055c.f14460d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C2055c);
                    application.registerComponentCallbacks(componentCallbacks2C2055c);
                    componentCallbacks2C2055c.f14460d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f14456e) {
            try {
                Iterator it = this.f14459c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f14456e) {
            this.f14459c.add(aVar);
        }
    }

    public boolean d() {
        return this.f14457a.get();
    }

    public boolean e(boolean z10) {
        AtomicBoolean atomicBoolean = this.f14458b;
        if (!atomicBoolean.get()) {
            if (com.google.android.gms.common.util.o.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f14457a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f14458b;
        boolean zCompareAndSet = this.f14457a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f14458b;
        boolean zCompareAndSet = this.f14457a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f14457a.compareAndSet(false, true)) {
            this.f14458b.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
