package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import i1.C5025r;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2690d0 {
    public static final long d(AndroidComposeView androidComposeView) {
        Context context = androidComposeView.getContext();
        Activity activityE = e(context);
        if (activityE != null) {
            Rect rectA = InterfaceC2702h0.f27459a.a().a(activityE);
            return C5025r.c((((long) rectA.height()) & 4294967295L) | (((long) rectA.width()) << 32));
        }
        Configuration configuration = context.getResources().getConfiguration();
        float f10 = context.getResources().getDisplayMetrics().density;
        return C5025r.c((((long) Math.round(configuration.screenHeightDp * f10)) & 4294967295L) | (((long) Math.round(configuration.screenWidthDp * f10)) << 32));
    }

    private static final Activity e(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static final DisplayCutout f(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (AbstractC2684b0.a(obj)) {
                return AbstractC2687c0.a(obj);
            }
        } catch (Exception e10) {
            if (!(e10 instanceof ClassNotFoundException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof NoSuchFieldException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException) && !(e10 instanceof InstantiationException)) {
                throw e10;
            }
        }
        return null;
    }

    public static final int g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final void h(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
