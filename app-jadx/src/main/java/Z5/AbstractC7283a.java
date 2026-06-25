package z5;

/* JADX INFO: renamed from: z5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7283a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static InterfaceC7285c f65609a = C7284b.h();

    public static void A(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (w(2)) {
            x(cls, q(str, obj, obj2, obj3));
        }
    }

    public static void B(Class cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f65609a.g(2)) {
            f65609a.v(r(cls), q(str, obj, obj2, obj3, obj4));
        }
    }

    public static void C(Class cls, String str, Object... objArr) {
        if (f65609a.g(2)) {
            f65609a.v(r(cls), q(str, objArr));
        }
    }

    public static void D(String str, String str2, Object... objArr) {
        if (f65609a.g(2)) {
            f65609a.v(str, q(str2, objArr));
        }
    }

    public static void E(Class cls, String str) {
        if (f65609a.g(5)) {
            f65609a.w(r(cls), str);
        }
    }

    public static void F(Class cls, String str, Throwable th2) {
        if (f65609a.g(5)) {
            f65609a.b(r(cls), str, th2);
        }
    }

    public static void G(Class cls, String str, Object... objArr) {
        if (f65609a.g(5)) {
            f65609a.w(r(cls), q(str, objArr));
        }
    }

    public static void H(Class cls, Throwable th2, String str, Object... objArr) {
        if (w(5)) {
            F(cls, q(str, objArr), th2);
        }
    }

    public static void I(String str, String str2) {
        if (f65609a.g(5)) {
            f65609a.w(str, str2);
        }
    }

    public static void J(String str, String str2, Throwable th2) {
        if (f65609a.g(5)) {
            f65609a.b(str, str2, th2);
        }
    }

    public static void K(String str, String str2, Object... objArr) {
        if (f65609a.g(5)) {
            f65609a.w(str, q(str2, objArr));
        }
    }

    public static void L(String str, Throwable th2, String str2, Object... objArr) {
        if (f65609a.g(5)) {
            f65609a.b(str, q(str2, objArr), th2);
        }
    }

    public static void M(Class cls, String str, Throwable th2) {
        if (f65609a.g(6)) {
            f65609a.f(r(cls), str, th2);
        }
    }

    public static void N(String str, String str2, Object... objArr) {
        if (f65609a.g(6)) {
            f65609a.e(str, q(str2, objArr));
        }
    }

    public static void a(Class cls, String str, Object obj) {
        if (f65609a.g(3)) {
            f65609a.d(r(cls), q(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f65609a.g(3)) {
            f65609a.d(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (f65609a.g(3)) {
            f65609a.d(str, q(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (f65609a.g(3)) {
            f65609a.d(str, q(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f65609a.g(3)) {
            f65609a.d(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void f(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f65609a.g(3)) {
            f65609a.d(str, q(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        if (f65609a.g(3)) {
            f65609a.a(str, str2, th2);
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (f65609a.g(3)) {
            b(str, q(str2, objArr));
        }
    }

    public static void i(Class cls, String str) {
        if (f65609a.g(6)) {
            f65609a.c(r(cls), str);
        }
    }

    public static void j(Class cls, String str, Throwable th2) {
        if (f65609a.g(6)) {
            f65609a.e(r(cls), str, th2);
        }
    }

    public static void k(Class cls, String str, Object... objArr) {
        if (f65609a.g(6)) {
            f65609a.c(r(cls), q(str, objArr));
        }
    }

    public static void l(Class cls, Throwable th2, String str, Object... objArr) {
        if (f65609a.g(6)) {
            f65609a.e(r(cls), q(str, objArr), th2);
        }
    }

    public static void m(String str, String str2) {
        if (f65609a.g(6)) {
            f65609a.c(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th2) {
        if (f65609a.g(6)) {
            f65609a.e(str, str2, th2);
        }
    }

    public static void o(String str, String str2, Object... objArr) {
        if (f65609a.g(6)) {
            f65609a.c(str, q(str2, objArr));
        }
    }

    public static void p(String str, Throwable th2, String str2, Object... objArr) {
        if (f65609a.g(6)) {
            f65609a.e(str, q(str2, objArr), th2);
        }
    }

    private static String q(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private static String r(Class cls) {
        return cls.getSimpleName();
    }

    public static void s(String str, String str2) {
        if (f65609a.g(4)) {
            f65609a.i(str, str2);
        }
    }

    public static void t(String str, String str2, Object obj, Object obj2) {
        if (f65609a.g(4)) {
            f65609a.i(str, q(str2, obj, obj2));
        }
    }

    public static void u(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f65609a.g(4)) {
            f65609a.i(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        if (f65609a.g(4)) {
            f65609a.i(str, q(str2, objArr));
        }
    }

    public static boolean w(int i10) {
        return f65609a.g(i10);
    }

    public static void x(Class cls, String str) {
        if (f65609a.g(2)) {
            f65609a.v(r(cls), str);
        }
    }

    public static void y(Class cls, String str, Object obj) {
        if (f65609a.g(2)) {
            f65609a.v(r(cls), q(str, obj));
        }
    }

    public static void z(Class cls, String str, Object obj, Object obj2) {
        if (f65609a.g(2)) {
            f65609a.v(r(cls), q(str, obj, obj2));
        }
    }
}
