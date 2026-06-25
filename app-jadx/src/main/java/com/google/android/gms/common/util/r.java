package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f39002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f39003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f39004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f39005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f39006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Method f39007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Method f39008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Method f39009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Method f39010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Boolean f39011j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class cls = Integer.TYPE;
        f39002a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f39003b = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f39004c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f39005d = method3;
        try {
            method4 = WorkSource.class.getMethod(com.amazon.a.a.o.b.au, cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f39006e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method5 = null;
        }
        f39007f = method5;
        if (l.f()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f39008g = method6;
        if (l.f()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f39009h = method7;
        if (l.f()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        f39010i = method8;
        f39011j = null;
    }

    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f39004c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f39003b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = X8.e.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = applicationInfoC.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        Boolean bool = f39011j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z10 = AbstractC7194b.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f39011j = Boolean.valueOf(z10);
        return z10;
    }
}
