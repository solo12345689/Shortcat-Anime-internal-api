package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.M3;
import io.sentry.android.core.AbstractC5156p0;
import io.sentry.android.core.C5131g0;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class G implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f49865n = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f49866o = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5131g0 f49867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f49868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f49869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f49870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference f49871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f49872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f49874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Window.OnFrameMetricsAvailableListener f49875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Choreographer f49876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Field f49877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f49878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f49879m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements c {
        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        default void a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    public G(Context context, ILogger iLogger, C5131g0 c5131g0) {
        this(context, iLogger, c5131g0, new a());
    }

    public static /* synthetic */ void a(G g10, ILogger iLogger) {
        g10.getClass();
        try {
            g10.f49876j = Choreographer.getInstance();
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th2);
        }
    }

    public static /* synthetic */ void b(G g10, Window window) {
        if (g10.f49868b.add(window)) {
            try {
                g10.f49874h.a(window, g10.f49875i, g10.f49870d);
            } catch (Throwable th2) {
                g10.f49869c.b(EnumC5215i3.ERROR, "Failed to add frameMetricsAvailableListener", th2);
            }
        }
    }

    public static /* synthetic */ void c(G g10, Window window) {
        g10.getClass();
        try {
            if (g10.f49868b.remove(window)) {
                g10.f49874h.b(window, g10.f49875i);
            }
        } catch (Throwable th2) {
            g10.f49869c.b(EnumC5215i3.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
        }
    }

    public static /* synthetic */ void e(G g10, C5131g0 c5131g0, Window window, FrameMetrics frameMetrics, int i10) {
        g10.getClass();
        long jNanoTime = System.nanoTime();
        float refreshRate = c5131g0.d() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f10 = f49865n;
        long jF = g10.f(frameMetrics);
        long jMax = Math.max(0L, jF - ((long) (f10 / refreshRate)));
        long jG = g10.g(frameMetrics);
        if (jG < 0) {
            jG = jNanoTime - jF;
        }
        long jMax2 = Math.max(jG, g10.f49879m);
        if (jMax2 == g10.f49878l) {
            return;
        }
        g10.f49878l = jMax2;
        g10.f49879m = jMax2 + jF;
        boolean zJ = j(jF, (long) (f10 / (refreshRate - 1.0f)));
        boolean z10 = zJ && i(jF);
        Iterator it = g10.f49872f.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).e(jMax2, g10.f49879m, jF, jMax, zJ, z10, refreshRate);
        }
    }

    private long f(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    private long g(FrameMetrics frameMetrics) {
        return this.f49867a.d() >= 26 ? frameMetrics.getMetric(10) : h();
    }

    public static boolean i(long j10) {
        return j10 > f49866o;
    }

    public static boolean j(long j10, long j11) {
        return j10 > j11;
    }

    private void k(Window window) {
        WeakReference weakReference = this.f49871e;
        if (weakReference == null || weakReference.get() != window) {
            this.f49871e = new WeakReference(window);
            o();
        }
    }

    private void n(final Window window) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.C
            @Override // java.lang.Runnable
            public final void run() {
                G.c(this.f49858a, window);
            }
        });
    }

    private void o() {
        WeakReference weakReference = this.f49871e;
        final Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f49873g || this.f49872f.isEmpty() || this.f49870d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.B
            @Override // java.lang.Runnable
            public final void run() {
                G.b(this.f49856a, window);
            }
        });
    }

    public long h() {
        Field field;
        Choreographer choreographer = this.f49876j;
        if (choreographer == null || (field = this.f49877k) == null) {
            return -1L;
        }
        try {
            Long l10 = (Long) field.get(choreographer);
            if (l10 != null) {
                return l10.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    public String l(b bVar) {
        if (!this.f49873g) {
            return null;
        }
        String strA = M3.a();
        this.f49872f.put(strA, bVar);
        o();
        return strA;
    }

    public void m(String str) {
        if (this.f49873g) {
            if (str != null) {
                this.f49872f.remove(str);
            }
            WeakReference weakReference = this.f49871e;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !this.f49872f.isEmpty()) {
                return;
            }
            n(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        k(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        n(activity.getWindow());
        WeakReference weakReference = this.f49871e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f49871e = null;
    }

    public G(Context context, final ILogger iLogger, final C5131g0 c5131g0, c cVar) {
        this.f49868b = new CopyOnWriteArraySet();
        this.f49872f = new ConcurrentHashMap();
        this.f49873g = false;
        this.f49878l = 0L;
        this.f49879m = 0L;
        Context context2 = (Context) io.sentry.util.w.c(AbstractC5156p0.g(context), "The context is required");
        this.f49869c = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required");
        this.f49867a = (C5131g0) io.sentry.util.w.c(c5131g0, "BuildInfoProvider is required");
        this.f49874h = (c) io.sentry.util.w.c(cVar, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && c5131g0.d() >= 24) {
            this.f49873g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.D
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    iLogger.b(EnumC5215i3.ERROR, "Error during frames measurements.", th2);
                }
            });
            handlerThread.start();
            this.f49870d = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.E
                @Override // java.lang.Runnable
                public final void run() {
                    G.a(this.f49861a, iLogger);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f49877k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                iLogger.b(EnumC5215i3.ERROR, "Unable to get the frame timestamp from the choreographer: ", e10);
            }
            this.f49875i = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.F
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                    G.e(this.f49863a, c5131g0, window, frameMetrics, i10);
                }
            };
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
