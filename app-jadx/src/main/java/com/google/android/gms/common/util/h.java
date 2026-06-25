package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a */
    private static Boolean f38989a;

    /* JADX INFO: renamed from: b */
    private static Boolean f38990b;

    /* JADX INFO: renamed from: c */
    private static Boolean f38991c;

    /* JADX INFO: renamed from: d */
    private static Boolean f38992d;

    public static boolean a(Context context) {
        return h(context.getPackageManager());
    }

    public static boolean b() {
        int i10 = com.google.android.gms.common.d.f38949a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return e(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !l.d()) {
            return true;
        }
        if (f(context)) {
            return !l.e() || l.h();
        }
        return false;
    }

    public static boolean e(PackageManager packageManager) {
        if (f38989a == null) {
            f38989a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f38989a.booleanValue();
    }

    public static boolean f(Context context) {
        if (f38990b == null) {
            f38990b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f38990b.booleanValue();
    }

    public static boolean g(Context context) {
        if (f38991c == null) {
            f38991c = Boolean.valueOf(l.e() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f38991c.booleanValue();
    }

    public static boolean h(PackageManager packageManager) {
        if (f38992d == null) {
            boolean z10 = false;
            if (l.e() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f38992d = Boolean.valueOf(z10);
        }
        return f38992d.booleanValue();
    }
}
