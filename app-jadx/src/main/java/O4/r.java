package o4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54501a;

    static {
        String strI = i4.i.i("ProcessUtils");
        AbstractC5504s.g(strI, "tagWithPrefix(\"ProcessUtils\")");
        f54501a = strI;
    }

    private static final String a(Context context) {
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            return C5820a.f54482a.a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, i4.t.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            AbstractC5504s.e(objInvoke);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th2) {
            i4.i.e().b(f54501a, "Unable to check ActivityThread for processName", th2);
        }
        int iMyPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean b(Context context, androidx.work.a configuration) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        String strA = a(context);
        String strC = configuration.c();
        return (strC == null || strC.length() == 0) ? AbstractC5504s.c(strA, context.getApplicationInfo().processName) : AbstractC5504s.c(strA, configuration.c());
    }
}
