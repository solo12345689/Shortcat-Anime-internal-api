package c4;

import Ud.AbstractC2279u;
import a4.C2567b;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractC2684b0;
import androidx.compose.ui.platform.AbstractC2687c0;
import androidx.core.view.L0;
import g4.C4839a;
import g4.C4840b;
import g4.C4844f;
import g4.C4849k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements l {

    /* JADX INFO: renamed from: b */
    public static final m f33510b = new m();

    /* JADX INFO: renamed from: c */
    private static final String f33511c;

    /* JADX INFO: renamed from: d */
    private static final ArrayList f33512d;

    static {
        String simpleName = m.class.getSimpleName();
        AbstractC5504s.g(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f33511c = simpleName;
        f33512d = AbstractC2279u.g(Integer.valueOf(L0.p.h()), Integer.valueOf(L0.p.g()), Integer.valueOf(L0.p.b()), Integer.valueOf(L0.p.d()), Integer.valueOf(L0.p.j()), Integer.valueOf(L0.p.f()), Integer.valueOf(L0.p.k()), Integer.valueOf(L0.p.c()));
    }

    private m() {
    }

    private final DisplayCutout g(Display display) {
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
        } catch (ClassNotFoundException e10) {
            Log.w(f33511c, e10);
        } catch (IllegalAccessException e11) {
            Log.w(f33511c, e11);
        } catch (InstantiationException e12) {
            Log.w(f33511c, e12);
        } catch (NoSuchFieldException e13) {
            Log.w(f33511c, e13);
        } catch (NoSuchMethodException e14) {
            Log.w(f33511c, e14);
        } catch (InvocationTargetException e15) {
            Log.w(f33511c, e15);
        }
        return null;
    }

    private final int h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void j(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // c4.l
    public k a(Context context) {
        AbstractC5504s.h(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return C4844f.f47342a.c(context);
        }
        Context contextA = C4840b.f47341a.a(context);
        if (contextA instanceof Activity) {
            return b((Activity) contextA);
        }
        if (!(contextA instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        AbstractC5504s.g(defaultDisplay, "wm.defaultDisplay");
        Point pointI = i(defaultDisplay);
        return new k(new Rect(0, 0, pointI.x, pointI.y), null, 2, null);
    }

    @Override // c4.l
    public k b(Activity activity) throws Exception {
        L0 l0A;
        AbstractC5504s.h(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        Rect rectA = i10 >= 30 ? C4844f.f47342a.a(activity) : i10 >= 29 ? e(activity) : i10 >= 28 ? d(activity) : c(activity);
        if (i10 >= 30) {
            l0A = f(activity);
        } else {
            l0A = new L0.a().a();
            AbstractC5504s.g(l0A, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new C2567b(rectA), l0A);
    }

    public final Rect c(Activity activity) {
        AbstractC5504s.h(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C4839a.f47340a.a(activity)) {
            AbstractC5504s.g(defaultDisplay, "defaultDisplay");
            Point pointI = i(defaultDisplay);
            int iH = h(activity);
            int i10 = rect.bottom;
            if (i10 + iH == pointI.y) {
                rect.bottom = i10 + iH;
                return rect;
            }
            int i11 = rect.right;
            if (i11 + iH == pointI.x) {
                rect.right = i11 + iH;
            }
        }
        return rect;
    }

    public final Rect d(Activity activity) {
        AbstractC5504s.h(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C4839a.f47340a.a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                AbstractC5504s.f(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e10) {
            Log.w(f33511c, e10);
            j(activity, rect);
        } catch (NoSuchFieldException e11) {
            Log.w(f33511c, e11);
            j(activity, rect);
        } catch (NoSuchMethodException e12) {
            Log.w(f33511c, e12);
            j(activity, rect);
        } catch (InvocationTargetException e13) {
            Log.w(f33511c, e13);
            j(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        currentDisplay.getRealSize(point);
        C4839a c4839a = C4839a.f47340a;
        if (!c4839a.a(activity)) {
            int iH = h(activity);
            int i10 = rect.bottom;
            if (i10 + iH == point.y) {
                rect.bottom = i10 + iH;
            } else {
                int i11 = rect.right;
                if (i11 + iH == point.x) {
                    rect.right = i11 + iH;
                } else if (rect.left == iH) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !c4839a.a(activity)) {
            AbstractC5504s.g(currentDisplay, "currentDisplay");
            DisplayCutout displayCutoutG = g(currentDisplay);
            if (displayCutoutG != null) {
                int i12 = rect.left;
                C4849k c4849k = C4849k.f47343a;
                if (i12 == c4849k.b(displayCutoutG)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == c4849k.c(displayCutoutG)) {
                    rect.right += c4849k.c(displayCutoutG);
                }
                if (rect.top == c4849k.d(displayCutoutG)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == c4849k.a(displayCutoutG)) {
                    rect.bottom += c4849k.a(displayCutoutG);
                }
            }
        }
        return rect;
    }

    public final Rect e(Activity activity) {
        AbstractC5504s.h(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (IllegalAccessException e10) {
            Log.w(f33511c, e10);
            return d(activity);
        } catch (NoSuchFieldException e11) {
            Log.w(f33511c, e11);
            return d(activity);
        } catch (NoSuchMethodException e12) {
            Log.w(f33511c, e12);
            return d(activity);
        } catch (InvocationTargetException e13) {
            Log.w(f33511c, e13);
            return d(activity);
        }
    }

    public final L0 f(Context context) throws Exception {
        AbstractC5504s.h(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return C4844f.f47342a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final Point i(Display display) {
        AbstractC5504s.h(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
