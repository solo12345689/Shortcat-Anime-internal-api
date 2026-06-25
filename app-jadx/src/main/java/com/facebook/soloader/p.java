package com.facebook.soloader;

import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static void a(String str, String str2) {
        if (e(str, 3)) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        Log.e(str, str2);
    }

    public static void c(String str, String str2, Throwable th2) {
        Log.e(str, str2, th2);
    }

    public static void d(String str, String str2) {
        if (e(str, 4)) {
            Log.i(str, str2);
        }
    }

    private static boolean e(String str, int i10) {
        return (Build.VERSION.SDK_INT > 25 || str.length() <= 23) ? Log.isLoggable(str, i10) : Log.isLoggable(str.substring(0, 23), i10);
    }

    public static void f(String str, String str2) {
        if (e(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void g(String str, String str2) {
        Log.w(str, str2);
    }

    public static void h(String str, String str2, Throwable th2) {
        Log.w(str, str2, th2);
    }
}
