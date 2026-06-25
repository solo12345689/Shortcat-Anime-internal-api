package X3;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f21626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f21627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f21628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f21629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f21630e;

    public static void a(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(l(str), i10);
        } else {
            b(l(str), i10);
        }
    }

    private static void b(String str, int i10) {
        try {
            if (f21628c == null) {
                f21628c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f21628c.invoke(null, Long.valueOf(f21626a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(String str) {
        b.a(l(str));
    }

    public static void d(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(l(str), i10);
        } else {
            e(l(str), i10);
        }
    }

    private static void e(String str, int i10) {
        try {
            if (f21629d == null) {
                f21629d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f21629d.invoke(null, Long.valueOf(f21626a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        b.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? c.c() : i();
    }

    private static boolean i() {
        try {
            if (f21627b == null) {
                f21626a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f21627b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f21627b.invoke(null, Long.valueOf(f21626a))).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    public static void j(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.d(l(str), i10);
        } else {
            k(l(str), i10);
        }
    }

    private static void k(String str, int i10) {
        try {
            if (f21630e == null) {
                f21630e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f21630e.invoke(null, Long.valueOf(f21626a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }

    private static String l(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
