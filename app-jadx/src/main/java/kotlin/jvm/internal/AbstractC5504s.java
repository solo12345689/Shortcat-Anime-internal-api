package kotlin.jvm.internal;

import java.util.Arrays;

/* JADX INFO: renamed from: kotlin.jvm.internal.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5504s {

    /* JADX INFO: renamed from: kotlin.jvm.internal.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {
    }

    public static boolean a(double d10, Double d11) {
        return d11 != null && d10 == d11.doubleValue();
    }

    public static boolean b(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m(new IllegalStateException(str + " must not be null")));
    }

    public static void e(Object obj) {
        if (obj == null) {
            o();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            p(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m(new NullPointerException(str + " must not be null")));
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static int i(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int j(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    private static String k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC5504s.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void l(int i10, String str) {
        r();
    }

    private static Throwable m(Throwable th2) {
        return n(th2, AbstractC5504s.class.getName());
    }

    static Throwable n(Throwable th2, String str) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th2;
    }

    public static void o() {
        throw ((NullPointerException) m(new NullPointerException()));
    }

    public static void p(String str) {
        throw ((NullPointerException) m(new NullPointerException(str)));
    }

    private static void q(String str) {
        throw ((NullPointerException) m(new NullPointerException(k(str))));
    }

    public static void r() {
        s("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void s(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void t(String str) {
        throw ((Td.K) m(new Td.K(str)));
    }

    public static void u(String str) {
        t("lateinit property " + str + " has not been initialized");
    }
}
