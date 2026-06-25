package app.notifee.core;

import android.util.Log;
import app.notifee.core.event.LogEvent;
import cg.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Logger {
    public static String a(String str, String str2) {
        return "(" + str + "): " + str2;
    }

    public static void d(String str, String str2) {
        Log.d("NOTIFEE", a(str, str2));
    }

    public static void e(String str, String str2, Exception exc) {
        Log.e("NOTIFEE", a(str, str2), exc);
        g.a(new LogEvent(LogEvent.LEVEL_ERROR, str, str2, exc));
    }

    public static void i(String str, String str2) {
        Log.i("NOTIFEE", a(str, str2));
    }

    public static void v(String str, String str2) {
        Log.v("NOTIFEE", a(str, str2));
    }

    public static void w(String str, String str2) {
        Log.w("NOTIFEE", a(str, str2));
    }

    public static void e(String str, String str2) {
        Log.e("NOTIFEE", a(str, str2));
        g.a(new LogEvent(LogEvent.LEVEL_ERROR, str, str2));
    }

    public static void e(String str, String str2, Throwable th2) {
        Log.e("NOTIFEE", a(str, str2), th2);
        g.a(new LogEvent(LogEvent.LEVEL_ERROR, str, str2, th2));
    }
}
