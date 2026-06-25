package v8;

import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: v8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6852a {
    private static String a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    public static void b(String str, String str2, Object obj) {
        String strE = e(str);
        if (Log.isLoggable(strE, 3)) {
            Log.d(strE, String.format(str2, obj));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        String strE = e(str);
        if (Log.isLoggable(strE, 3)) {
            Log.d(strE, String.format(str2, objArr));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        String strE = e(str);
        if (Log.isLoggable(strE, 6)) {
            Log.e(strE, str2, th2);
        }
    }

    private static String e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    public static void f(String str, String str2, Object obj) {
        String strE = e(str);
        if (Log.isLoggable(strE, 4)) {
            Log.i(strE, String.format(str2, obj));
        }
    }

    public static void g(String str, String str2, Object obj) {
        String strE = e(str);
        if (Log.isLoggable(strE, 5)) {
            Log.w(strE, String.format(str2, obj));
        }
    }
}
