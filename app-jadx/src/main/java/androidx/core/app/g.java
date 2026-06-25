package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static Object a(Context context, Class cls) {
            return context.getSystemService(cls);
        }

        static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        static String c(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        static int a(AppOpsManager appOpsManager, String str, int i10, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        static String b(Context context) {
            return context.getOpPackageName();
        }

        static AppOpsManager c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context context, int i10, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return b(context, str, str2);
        }
        AppOpsManager appOpsManagerC = b.c(context);
        int iA = b.a(appOpsManagerC, str, Binder.getCallingUid(), str2);
        return iA != 0 ? iA : b.a(appOpsManagerC, str, i10, b.b(context));
    }

    public static int b(Context context, String str, String str2) {
        return a.b((AppOpsManager) a.a(context, AppOpsManager.class), str, str2);
    }

    public static String c(String str) {
        return a.c(str);
    }
}
