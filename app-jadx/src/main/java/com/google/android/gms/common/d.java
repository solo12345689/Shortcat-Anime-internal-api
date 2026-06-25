package com.google.android.gms.common;

import R8.AbstractC2115p;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a */
    public static final int f38949a = 12451000;

    /* JADX INFO: renamed from: c */
    public static boolean f38951c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f38952d = false;

    /* JADX INFO: renamed from: b */
    static final AtomicBoolean f38950b = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    private static final AtomicBoolean f38953e = new AtomicBoolean();

    public static void a(Context context, int i10) throws O8.g, O8.h {
        int iH = b.f().h(context, i10);
        if (iH != 0) {
            Intent intentB = b.f().b(context, iH, "e");
            StringBuilder sb2 = new StringBuilder(String.valueOf(iH).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(iH);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (intentB != null) {
                throw new O8.h(iH, "Google Play Services not available", intentB);
            }
            throw new O8.g(iH);
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static String c(int i10) {
        return ConnectionResult.s(i10);
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        try {
            if (!f38952d) {
                try {
                    PackageInfo packageInfoE = X8.e.a(context).e("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                    e.a(context);
                    if (packageInfoE == null || e.d(packageInfoE, false) || !e.d(packageInfoE, true)) {
                        f38951c = false;
                    } else {
                        f38951c = true;
                    }
                    f38952d = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f38952d = true;
                }
            }
            return f38951c || !com.google.android.gms.common.util.h.b();
        } catch (Throwable th2) {
            f38952d = true;
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(android.content.Context r11, int r12) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.d.g(android.content.Context, int):int");
    }

    public static boolean h(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return l(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean i(Context context) {
        Object systemService = context.getSystemService("user");
        AbstractC2115p.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && com.amazon.a.a.o.b.f34640af.equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean j(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    public static boolean k(Context context, int i10, String str) {
        return com.google.android.gms.common.util.q.b(context, i10, str);
    }

    static boolean l(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !i(context);
    }
}
