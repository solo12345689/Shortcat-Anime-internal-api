package g4;

import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.L0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: g4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4844f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4844f f47342a = new C4844f();

    private C4844f() {
    }

    public final Rect a(Context context) {
        AbstractC5504s.h(context, "context");
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        AbstractC5504s.g(bounds, "wm.currentWindowMetrics.bounds");
        return bounds;
    }

    public final L0 b(Context context) {
        AbstractC5504s.h(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        AbstractC5504s.g(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        L0 l0Z = L0.z(windowInsets);
        AbstractC5504s.g(l0Z, "toWindowInsetsCompat(platformInsets)");
        return l0Z;
    }

    public final c4.k c(Context context) {
        AbstractC5504s.h(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        L0 l0Z = L0.z(windowManager.getCurrentWindowMetrics().getWindowInsets());
        AbstractC5504s.g(l0Z, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        AbstractC5504s.g(bounds, "wm.currentWindowMetrics.bounds");
        return new c4.k(bounds, l0Z);
    }
}
