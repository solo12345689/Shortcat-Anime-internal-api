package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.android.core.util.a;
import io.sentry.protocol.C5251a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.android.core.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5156p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final io.sentry.android.core.util.a f49956a = new io.sentry.android.core.util.a(new a.InterfaceC0781a() { // from class: io.sentry.android.core.k0
        @Override // io.sentry.android.core.util.a.InterfaceC0781a
        public final Object a(Context context) {
            return AbstractC5156p0.d(context);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final io.sentry.android.core.util.a f49957b = new io.sentry.android.core.util.a(new a.InterfaceC0781a() { // from class: io.sentry.android.core.l0
        @Override // io.sentry.android.core.util.a.InterfaceC0781a
        public final Object a(Context context) {
            return AbstractC5156p0.b(context);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final io.sentry.android.core.util.a f49958c = new io.sentry.android.core.util.a(new a.InterfaceC0781a() { // from class: io.sentry.android.core.m0
        @Override // io.sentry.android.core.util.a.InterfaceC0781a
        public final Object a(Context context) {
            return AbstractC5156p0.a(context);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io.sentry.android.core.util.a f49959d = new io.sentry.android.core.util.a(new a.InterfaceC0781a() { // from class: io.sentry.android.core.n0
        @Override // io.sentry.android.core.util.a.InterfaceC0781a
        public final Object a(Context context) {
            return AbstractC5156p0.c(context);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.android.core.util.a f49960e = new io.sentry.android.core.util.a(new a.InterfaceC0781a() { // from class: io.sentry.android.core.o0
        @Override // io.sentry.android.core.util.a.InterfaceC0781a
        public final Object a(Context context) {
            return AbstractC5156p0.e(context);
        }
    });

    /* JADX INFO: renamed from: io.sentry.android.core.p0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f49961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f49962b;

        public a(boolean z10, String str) {
            this.f49961a = z10;
            this.f49962b = str;
        }

        public Map a() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.f49961a));
            String str = this.f49962b;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.core.p0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f49963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f49964b;

        public b(boolean z10, String[] strArr) {
            this.f49963a = z10;
            this.f49964b = strArr;
        }

        public String[] a() {
            return this.f49964b;
        }

        public boolean b() {
            return this.f49963a;
        }
    }

    public static /* synthetic */ String a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 != 0) {
                return context.getString(i10);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo e(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        if (!context.getPackageName().endsWith(".test")) {
            return false;
        }
        try {
            Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
            while (it.hasNext()) {
                ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Context g(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    static ApplicationInfo h(Context context, C5131g0 c5131g0) {
        return c5131g0.d() >= 33 ? (ApplicationInfo) f49959d.a(context) : (ApplicationInfo) f49960e.a(context);
    }

    static String i(Context context) {
        return (String) f49958c.a(context);
    }

    static String[] j() {
        return Build.SUPPORTED_ABIS;
    }

    static DisplayMetrics k(Context context, ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Error getting DisplayMetrics.", th2);
            return null;
        }
    }

    static String l(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    static String m(ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } finally {
            }
        } catch (IOException e10) {
            iLogger.b(EnumC5215i3.ERROR, "Exception while attempting to read kernel information", e10);
            return property;
        }
    }

    static ActivityManager.MemoryInfo n(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.c(EnumC5215i3.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    static PackageInfo o(Context context, int i10, ILogger iLogger, C5131g0 c5131g0) {
        try {
            return c5131g0.d() >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i10)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i10);
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    static PackageInfo p(Context context, C5131g0 c5131g0) {
        return c5131g0.d() >= 33 ? (PackageInfo) f49956a.a(context) : (PackageInfo) f49957b.a(context);
    }

    static String q(PackageInfo packageInfo, C5131g0 c5131g0) {
        return c5131g0.d() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : r(packageInfo);
    }

    private static String r(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    public static boolean s() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Intent t(Context context, C5322z3 c5322z3, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return u(context, new C5131g0(c5322z3.getLogger()), broadcastReceiver, intentFilter, handler);
    }

    static Intent u(Context context, C5131g0 c5131g0, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return c5131g0.d() >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }

    static a v(Context context, ILogger iLogger, C5131g0 c5131g0) {
        String str;
        try {
            PackageInfo packageInfoP = p(context, c5131g0);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoP != null && packageManager != null) {
                str = packageInfoP.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.c(EnumC5215i3.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    static b w(Context context, C5131g0 c5131g0) {
        Bundle bundle;
        ApplicationInfo applicationInfoH = h(context, c5131g0);
        PackageInfo packageInfoP = p(context, c5131g0);
        if (packageInfoP == null) {
            return null;
        }
        return new b((applicationInfoH == null || (bundle = applicationInfoH.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), packageInfoP.splitNames);
    }

    static void x(PackageInfo packageInfo, C5131g0 c5131g0, C5175z0 c5175z0, C5251a c5251a) {
        c5251a.n(packageInfo.packageName);
        c5251a.q(packageInfo.versionName);
        c5251a.m(q(packageInfo, c5131g0));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i10] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        c5251a.s(map);
        if (c5175z0 != null) {
            try {
                b bVarO = c5175z0.o();
                if (bVarO != null) {
                    c5251a.t(Boolean.valueOf(bVarO.b()));
                    if (bVarO.a() != null) {
                        c5251a.u(Arrays.asList(bVarO.a()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
