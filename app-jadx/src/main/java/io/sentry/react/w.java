package io.sentry.react;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.react.bridge.Promise;
import io.sentry.InterfaceC5249p2;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f51266a = new a(51, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f51267b = null;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends LinkedHashMap {
        a(int i10, float f10, boolean z10) {
            super(i10, f10, z10);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 50;
        }
    }

    public static /* synthetic */ void a(final InterfaceC5249p2 interfaceC5249p2, final Promise promise) {
        try {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: io.sentry.react.v
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    InterfaceC5249p2 interfaceC5249p22 = interfaceC5249p2;
                    promise.resolve(Double.valueOf(interfaceC5249p22.now().m() / 1.0E9d));
                }
            });
        } catch (Exception e10) {
            promise.reject("Failed to receive the instance of Choreographer", e10);
        }
    }

    public static void c(final Promise promise, final InterfaceC5249p2 interfaceC5249p2) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            promise.reject("GetTimeToDisplay is not able to measure the time to display: Main looper not available.");
        } else {
            new Handler(mainLooper).post(new Runnable() { // from class: io.sentry.react.u
                @Override // java.lang.Runnable
                public final void run() {
                    w.a(interfaceC5249p2, promise);
                }
            });
        }
    }

    public static Double d(String str) {
        return (Double) f51266a.remove(str);
    }

    public static void e(String str, Double d10) {
        f51266a.put(str, d10);
    }

    public static void f(Double d10) {
        if (f51267b != null) {
            e("ttid-navigation-" + f51267b, d10);
        }
    }

    public static void g(String str) {
        f51267b = str;
    }
}
