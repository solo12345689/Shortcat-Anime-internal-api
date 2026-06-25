package Hf;

import Td.u;
import Td.v;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: renamed from: a */
    public static final g f8602a;
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            u.a aVar = u.f17466b;
            objB = u.b(new f(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            u.a aVar2 = u.f17466b;
            objB = u.b(v.a(th2));
        }
        f8602a = (g) (u.g(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final g b(Handler handler, String str) {
        return new f(handler, str);
    }

    public static /* synthetic */ g c(Handler handler, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return b(handler, str);
    }
}
