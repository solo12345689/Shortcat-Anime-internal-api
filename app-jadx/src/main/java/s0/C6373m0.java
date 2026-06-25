package s0;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: s0.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6373m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6373m0 f58962a = new C6373m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f58963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f58964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f58965d;

    private C6373m0() {
    }

    public final void a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            C6382p0.f58975a.a(canvas, z10);
            return;
        }
        if (!f58965d) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f58963b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f58964c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f58963b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f58964c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f58963b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f58964c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f58965d = true;
        }
        if (z10) {
            try {
                Method method4 = f58963b;
                if (method4 != null) {
                    AbstractC5504s.e(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f58964c) == null) {
            return;
        }
        AbstractC5504s.e(method);
        method.invoke(canvas, null);
    }
}
