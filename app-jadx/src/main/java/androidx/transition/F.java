package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f32325a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f32326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f32327c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    F() {
    }

    public float b(View view) {
        if (f32325a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f32325a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void d(View view, int i10, int i11, int i12, int i13);

    public void e(View view, float f10) {
        if (f32325a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f32325a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void f(View view, int i10) {
        if (!f32327c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f32326b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f32327c = true;
        }
        Field field = f32326b;
        if (field != null) {
            try {
                f32326b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);

    public void a(View view) {
    }

    public void c(View view) {
    }
}
