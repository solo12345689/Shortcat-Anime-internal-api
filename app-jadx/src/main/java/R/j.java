package r;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class j {
    static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return b(context, str, o.f58297a);
    }

    private static boolean b(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i10)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return b(context, str, o.f58300d);
    }

    static boolean f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return c(context, str, o.f58301e);
    }

    static boolean g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return d(context, str, o.f58299c) || c(context, str2, o.f58298b);
    }
}
