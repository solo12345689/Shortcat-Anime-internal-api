package io.sentry.util;

import io.sentry.h4;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class A {
    public static h4 a(h4 h4Var) {
        if (h4Var.c() != null) {
            return h4Var;
        }
        return new h4(h4Var.e(), h4Var.d(), b(null, h4Var.d(), h4Var.e()), h4Var.b(), h4Var.a());
    }

    public static Double b(Double d10, Double d11, Boolean bool) {
        if (d10 != null) {
            return d10;
        }
        double dC = B.a().c();
        return (d11 == null || bool == null) ? Double.valueOf(dC) : bool.booleanValue() ? Double.valueOf(dC * d11.doubleValue()) : Double.valueOf(d11.doubleValue() + (dC * (1.0d - d11.doubleValue())));
    }

    public static boolean c(Double d10) {
        return e(d10, true);
    }

    public static boolean d(Double d10) {
        return e(d10, true);
    }

    private static boolean e(Double d10, boolean z10) {
        return d10 == null ? z10 : !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.doubleValue() <= 1.0d;
    }

    public static boolean f(Double d10) {
        return e(d10, true);
    }

    public static boolean g(Double d10) {
        return h(d10, true);
    }

    public static boolean h(Double d10, boolean z10) {
        return e(d10, z10);
    }
}
