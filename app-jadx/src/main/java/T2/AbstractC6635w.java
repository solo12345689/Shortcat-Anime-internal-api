package t2;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: t2.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6635w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f60653b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f60654c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f60652a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f60655d = a.f60656a;

    /* JADX INFO: renamed from: t2.w$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f60656a = new C0906a();

        /* JADX INFO: renamed from: t2.w$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0906a implements a {
            C0906a() {
            }

            @Override // t2.AbstractC6635w.a
            public void a(String str, String str2, Throwable th2) {
                Log.d(str, AbstractC6635w.a(str2, th2));
            }

            @Override // t2.AbstractC6635w.a
            public void b(String str, String str2, Throwable th2) {
                Log.w(str, AbstractC6635w.a(str2, th2));
            }

            @Override // t2.AbstractC6635w.a
            public void c(String str, String str2, Throwable th2) {
                Log.i(str, AbstractC6635w.a(str2, th2));
            }

            @Override // t2.AbstractC6635w.a
            public void e(String str, String str2, Throwable th2) {
                Log.e(str, AbstractC6635w.a(str2, th2));
            }
        }

        void a(String str, String str2, Throwable th2);

        void b(String str, String str2, Throwable th2);

        void c(String str, String str2, Throwable th2);

        void e(String str, String str2, Throwable th2);
    }

    public static String a(String str, Throwable th2) {
        String strF = f(th2);
        if (TextUtils.isEmpty(strF)) {
            return str;
        }
        return str + "\n  " + strF.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f60652a) {
            try {
                if (f60653b == 0) {
                    f60655d.a(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        synchronized (f60652a) {
            try {
                if (f60653b == 0) {
                    f60655d.a(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void d(String str, String str2) {
        synchronized (f60652a) {
            try {
                if (f60653b <= 3) {
                    f60655d.e(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        synchronized (f60652a) {
            try {
                if (f60653b <= 3) {
                    f60655d.e(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String f(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f60652a) {
            try {
                if (h(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f60654c) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void g(String str, String str2) {
        synchronized (f60652a) {
            try {
                if (f60653b <= 1) {
                    f60655d.c(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean h(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f60652a) {
            try {
                if (f60653b <= 2) {
                    f60655d.b(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j(String str, String str2, Throwable th2) {
        synchronized (f60652a) {
            try {
                if (f60653b <= 2) {
                    f60655d.b(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
