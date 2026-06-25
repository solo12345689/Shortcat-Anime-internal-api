package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.compose.ui.platform.j0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2708j0 implements InterfaceC2702h0 {

    /* JADX INFO: renamed from: b */
    public static final C2708j0 f27471b = new C2708j0();

    private C2708j0() {
    }

    @Override // androidx.compose.ui.platform.InterfaceC2702h0
    public Rect a(Activity activity) throws Exception {
        DisplayCutout displayCutoutF;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                AbstractC5504s.f(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e10) {
            if (!(e10 instanceof NoSuchFieldException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException)) {
                throw e10;
            }
            AbstractC2690d0.h(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int iG = AbstractC2690d0.g(activity);
            int i10 = rect.bottom;
            if (i10 + iG == point.y) {
                rect.bottom = i10 + iG;
            } else {
                int i11 = rect.right;
                if (i11 + iG == point.x) {
                    rect.right = i11 + iG;
                } else if (rect.left == iG) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (displayCutoutF = AbstractC2690d0.f(defaultDisplay)) != null) {
            if (rect.left == displayCutoutF.getSafeInsetLeft()) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCutoutF.getSafeInsetRight()) {
                rect.right += displayCutoutF.getSafeInsetRight();
            }
            if (rect.top == displayCutoutF.getSafeInsetTop()) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCutoutF.getSafeInsetBottom()) {
                rect.bottom += displayCutoutF.getSafeInsetBottom();
            }
        }
        return rect;
    }
}
