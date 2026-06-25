package androidx.fragment.app;

import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import t.i0;

/* JADX INFO: renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2846z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i0 f30127a = new i0();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return AbstractComponentCallbacksC2838q.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        i0 i0Var = f30127a;
        i0 i0Var2 = (i0) i0Var.get(classLoader);
        if (i0Var2 == null) {
            i0Var2 = new i0();
            i0Var.put(classLoader, i0Var2);
        }
        Class cls = (Class) i0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        i0Var2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new AbstractComponentCallbacksC2838q.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new AbstractComponentCallbacksC2838q.l("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public abstract AbstractComponentCallbacksC2838q a(ClassLoader classLoader, String str);
}
