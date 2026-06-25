package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38481a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f38482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f38483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f38484d;

    private a() {
    }

    public static final void a(Canvas canvas, boolean z10) {
        Method method;
        AbstractC5504s.h(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        f38481a.b();
        if (z10) {
            try {
                Method method2 = f38482b;
                if (method2 != null) {
                    if (method2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return;
            }
        }
        if (z10 || (method = f38483c) == null) {
            return;
        }
        if (method == null) {
            throw new IllegalStateException("Required value was null.");
        }
        method.invoke(canvas, null);
    }

    private final void b() {
        Method method;
        if (f38484d) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT == 28) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Object[].class);
                Object objInvoke = declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
                f38482b = (Method) objInvoke;
                Object objInvoke2 = declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                AbstractC5504s.f(objInvoke2, "null cannot be cast to non-null type java.lang.reflect.Method");
                f38483c = (Method) objInvoke2;
            } else {
                f38482b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f38483c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
            }
            method = f38482b;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (method != null && f38483c != null) {
            if (method != null) {
                method.setAccessible(true);
            }
            Method method2 = f38483c;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            f38484d = true;
        }
    }
}
