package Ba;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final String a(Context context) {
        ComponentName componentNameUnflattenFromString;
        AbstractC5504s.h(context, "<this>");
        String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
        if (string == null || (componentNameUnflattenFromString = ComponentName.unflattenFromString(string)) == null) {
            return null;
        }
        return componentNameUnflattenFromString.getPackageName();
    }

    public static final Point b(Context context) {
        AbstractC5504s.h(context, "<this>");
        Point point = new Point();
        if (Build.VERSION.SDK_INT < 30) {
            Object systemService = context.getSystemService("window");
            AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            AbstractC5504s.g(defaultDisplay, "getDefaultDisplay(...)");
            defaultDisplay.getRealSize(point);
            return point;
        }
        WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        AbstractC5504s.g(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        Rect bounds = currentWindowMetrics.getBounds();
        AbstractC5504s.g(bounds, "getBounds(...)");
        point.x = bounds.width();
        point.y = bounds.height();
        return point;
    }

    public static final boolean c(Context context) {
        AbstractC5504s.h(context, "<this>");
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService = context.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager != null && uiModeManager.getNightMode() == 2) {
                return true;
            }
        }
        return false;
    }
}
