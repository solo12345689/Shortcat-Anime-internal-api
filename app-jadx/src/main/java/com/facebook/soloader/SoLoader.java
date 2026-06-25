package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class SoLoader {

    /* JADX INFO: renamed from: b */
    static x f38553b;

    /* JADX INFO: renamed from: m */
    private static int f38564m;

    /* JADX INFO: renamed from: c */
    private static final ReentrantReadWriteLock f38554c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d */
    static Context f38555d = null;

    /* JADX INFO: renamed from: e */
    private static volatile E[] f38556e = null;

    /* JADX INFO: renamed from: f */
    private static final AtomicInteger f38557f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    private static T7.i f38558g = null;

    /* JADX INFO: renamed from: h */
    private static final Set f38559h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: i */
    private static final Map f38560i = new HashMap();

    /* JADX INFO: renamed from: j */
    private static final Set f38561j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: k */
    private static final Map f38562k = new HashMap();

    /* JADX INFO: renamed from: l */
    private static boolean f38563l = true;

    /* JADX INFO: renamed from: n */
    private static int f38565n = 0;

    /* JADX INFO: renamed from: o */
    private static l f38566o = null;

    /* JADX INFO: renamed from: a */
    static final boolean f38552a = true;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends UnsatisfiedLinkError {
        a(Throwable th2, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th2);
        }
    }

    private static int A() {
        ReentrantReadWriteLock reentrantReadWriteLock = f38554c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i10 = f38564m;
            int i11 = (i10 & 2) != 0 ? 1 : 0;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                i11 |= 4;
            }
            if ((i10 & 128) == 0) {
                i11 |= 8;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i11;
        } catch (Throwable th2) {
            f38554c.writeLock().unlock();
            throw th2;
        }
    }

    private static int B(int i10) {
        return (i10 & 2048) != 0 ? 1 : 0;
    }

    private static T7.h C(String str, UnsatisfiedLinkError unsatisfiedLinkError, T7.h hVar) {
        p.g("SoLoader", "Running a recovery step for " + str + " due to " + unsatisfiedLinkError.toString());
        ReentrantReadWriteLock reentrantReadWriteLock = f38554c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (hVar == null) {
                try {
                    hVar = j();
                    if (hVar == null) {
                        p.g("SoLoader", "No recovery strategy");
                        throw unsatisfiedLinkError;
                    }
                } catch (v e10) {
                    p.c("SoLoader", "Base APK not found during recovery", e10);
                    throw e10;
                } catch (Exception e11) {
                    p.c("SoLoader", "Got an exception during recovery, will throw the initial error instead", e11);
                    throw unsatisfiedLinkError;
                }
            }
            if (D(unsatisfiedLinkError, hVar)) {
                f38557f.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
                return hVar;
            }
            reentrantReadWriteLock.writeLock().unlock();
            p.g("SoLoader", "Failed to recover");
            throw unsatisfiedLinkError;
        } catch (Throwable th2) {
            f38554c.writeLock().unlock();
            throw th2;
        }
    }

    private static boolean D(UnsatisfiedLinkError unsatisfiedLinkError, T7.h hVar) {
        S7.b.h(hVar);
        try {
            boolean zA = hVar.a(unsatisfiedLinkError, f38556e);
            S7.b.g(null);
            return zA;
        } finally {
        }
    }

    private static void a(ArrayList arrayList, int i10) {
        C3326a c3326a = new C3326a(f38555d, i10);
        p.a("SoLoader", "Adding application source: " + c3326a.toString());
        arrayList.add(0, c3326a);
    }

    private static void b(Context context, ArrayList arrayList, boolean z10) {
        if ((f38564m & 8) != 0) {
            return;
        }
        arrayList.add(0, new C3328c(context, "lib-main", !z10));
    }

    private static void c(Context context, ArrayList arrayList) {
        C3329d c3329d = new C3329d(context);
        p.a("SoLoader", "validating/adding directApk source: " + c3329d.toString());
        if (c3329d.o()) {
            arrayList.add(0, c3329d);
        }
    }

    private static void d(ArrayList arrayList) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)))) {
            p.a("SoLoader", "adding system library source: " + str3);
            arrayList.add(new C3331f(new File(str3), 2));
        }
    }

    private static void e(Context context, ArrayList arrayList) {
        F f10 = new F();
        p.a("SoLoader", "adding systemLoadWrapper source: " + f10);
        arrayList.add(0, f10);
    }

    private static void f() {
        if (!r()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    private static void g(String str, String str2, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        ReentrantReadWriteLock reentrantReadWriteLock = f38554c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f38556e == null) {
                p.b("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z10 = true;
            } else {
                z10 = false;
            }
            if (f38552a) {
                if (str2 != null) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (E e10 : f38556e) {
                            if (x(e10, str, i10, threadPolicy)) {
                                if (z10) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw B.b(str, f38555d, f38556e);
                    } catch (IOException e11) {
                        C c10 = new C(str, e11.toString());
                        c10.initCause(e11);
                        throw c10;
                    }
                } finally {
                }
            } finally {
                if (f38552a) {
                    if (str2 != null) {
                        Api18TraceUtils.b();
                    }
                    Api18TraceUtils.b();
                }
                if (z10) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    private static int h(Context context) {
        int i10 = f38565n;
        if (i10 != 0) {
            return i10;
        }
        if (context == null) {
            p.a("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i11 = applicationInfo.flags;
        int i12 = (i11 & 1) != 0 ? (i11 & 128) != 0 ? 3 : 2 : 1;
        p.a("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i12);
        return i12;
    }

    private static int i() {
        int i10 = f38565n;
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static void init(Context context, int i10) {
        k(context, i10, null);
    }

    private static synchronized T7.h j() {
        T7.i iVar;
        iVar = f38558g;
        return iVar == null ? null : iVar.get();
    }

    public static void k(Context context, int i10, x xVar) {
        if (r()) {
            p.g("SoLoader", "SoLoader already initialized");
            return;
        }
        p.g("SoLoader", "Initializing SoLoader: " + i10);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zO = o(context);
            f38563l = zO;
            if (zO) {
                int iH = h(context);
                f38565n = iH;
                if ((i10 & 128) == 0 && SysUtil.l(context, iH)) {
                    i10 |= 8;
                }
                p(context, xVar, i10);
                q(context, i10);
                p.f("SoLoader", "Init SoLoader delegate");
                R7.a.b(new u());
            } else {
                n();
                p.f("SoLoader", "Init System Loader delegate");
                R7.a.b(new R7.c());
            }
            p.g("SoLoader", "SoLoader initialized: " + i10);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th2;
        }
    }

    public static void l(Context context, l lVar) {
        synchronized (SoLoader.class) {
            f38566o = lVar;
        }
        init(context, 0);
    }

    public static void m(Context context, boolean z10) {
        try {
            k(context, z10 ? 1 : 0, null);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void n() {
        if (f38556e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f38554c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f38556e == null) {
                f38556e = new E[0];
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f38554c.writeLock().unlock();
            throw th2;
        }
    }

    private static boolean o(Context context) {
        String packageName;
        if (f38566o != null) {
            return true;
        }
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
            try {
                bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            } catch (Exception e10) {
                e = e10;
                p.h("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
            }
        } catch (Exception e11) {
            e = e11;
            packageName = null;
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    private static synchronized void p(Context context, x xVar, int i10) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    p.g("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                f38555d = context;
                f38558g = new T7.f(context, B(i10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (xVar != null || f38553b == null) {
            if (xVar != null) {
                f38553b = xVar;
            } else {
                f38553b = new o(new y());
            }
        }
    }

    private static void q(Context context, int i10) {
        ReentrantReadWriteLock.WriteLock writeLock;
        if (f38556e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f38554c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f38556e != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                f38564m = i10;
                ArrayList arrayList = new ArrayList();
                boolean z10 = true;
                boolean z11 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
                boolean z12 = (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
                if (z11) {
                    e(context, arrayList);
                } else if (z12) {
                    d(arrayList);
                    arrayList.add(0, new C3330e("base"));
                } else {
                    d(arrayList);
                    if (context != null) {
                        if ((i10 & 1) != 0) {
                            a(arrayList, i());
                            p.a("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new k(context, "lib-main"));
                        } else {
                            if (SysUtil.l(context, f38565n)) {
                                c(context, arrayList);
                            }
                            a(arrayList, i());
                            if ((i10 & 4096) == 0) {
                                z10 = false;
                            }
                            b(context, arrayList, z10);
                        }
                    }
                }
                E[] eArr = (E[]) arrayList.toArray(new E[arrayList.size()]);
                int iA = A();
                int length = eArr.length;
                while (true) {
                    int i11 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    p.d("SoLoader", "Preparing SO source: " + eArr[i11]);
                    boolean z13 = f38552a;
                    if (z13) {
                        Api18TraceUtils.a("SoLoader", "_", eArr[i11].getClass().getSimpleName());
                    }
                    eArr[i11].e(iA);
                    if (z13) {
                        Api18TraceUtils.b();
                    }
                    length = i11;
                }
                f38556e = eArr;
                f38557f.getAndIncrement();
                p.d("SoLoader", "init finish: " + f38556e.length + " SO sources prepared");
                writeLock = f38554c.writeLock();
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            f38554c.writeLock().unlock();
            throw th2;
        }
    }

    public static boolean r() {
        if (f38556e != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f38554c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z10 = f38556e != null;
            reentrantReadWriteLock.readLock().unlock();
            return z10;
        } catch (Throwable th2) {
            f38554c.readLock().unlock();
            throw th2;
        }
    }

    static void s(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        S7.b.d(str, i10);
        try {
            S7.b.c(null, w(str, null, null, i10 | 1, threadPolicy));
        } finally {
        }
    }

    public static boolean t(String str) {
        return f38563l ? u(str, 0) : R7.a.d(str);
    }

    public static boolean u(String str, int i10) {
        Boolean boolZ = z(str);
        if (boolZ != null) {
            return boolZ.booleanValue();
        }
        if (!f38563l) {
            return R7.a.d(str);
        }
        if (f38565n != 2) {
        }
        return y(str, i10);
    }

    private static boolean v(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        T7.h hVarC = null;
        while (true) {
            try {
                return w(str, str2, str3, i10, threadPolicy);
            } catch (UnsatisfiedLinkError e10) {
                hVarC = C(str, e10, hVarC);
            }
        }
    }

    private static boolean w(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        Object obj;
        Object obj2;
        if (!TextUtils.isEmpty(str2) && f38561j.contains(str2)) {
            return false;
        }
        Set set = f38559h;
        if (set.contains(str) && str3 == null) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                if (!set.contains(str)) {
                    z10 = false;
                } else {
                    if (str3 == null) {
                        return false;
                    }
                    z10 = true;
                }
                Map map = f38560i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj3 = new Object();
                    map.put(str, obj3);
                    obj = obj3;
                }
                Map map2 = f38562k;
                if (map2.containsKey(str2)) {
                    obj2 = map2.get(str2);
                } else {
                    Object obj4 = new Object();
                    map2.put(str2, obj4);
                    obj2 = obj4;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f38554c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z10) {
                            if (set.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z10 = true;
                            }
                            if (!z10) {
                                try {
                                    p.a("SoLoader", "About to load: " + str);
                                    g(str, str2, i10, threadPolicy);
                                    p.a("SoLoader", "Loaded: " + str);
                                    set.add(str);
                                } catch (UnsatisfiedLinkError e10) {
                                    String message = e10.getMessage();
                                    if (message == null || !message.contains("unexpected e_machine:")) {
                                        throw e10;
                                    }
                                    throw new a(e10, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                }
                            }
                        }
                        synchronized (obj2) {
                            if ((i10 & 16) == 0 && str3 != null) {
                                try {
                                    if (TextUtils.isEmpty(str2) || !f38561j.contains(str2)) {
                                        boolean z11 = f38552a;
                                        if (z11 && f38566o == null) {
                                            Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                        }
                                        try {
                                            p.a("SoLoader", "About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                            l lVar = f38566o;
                                            if (lVar != null) {
                                                lVar.a(str2);
                                            } else {
                                                r.a(str2);
                                            }
                                            f38561j.add(str2);
                                            if (z11 && f38566o == null) {
                                                Api18TraceUtils.b();
                                            }
                                        } catch (UnsatisfiedLinkError e11) {
                                            throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e11);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    if (f38552a && f38566o == null) {
                                        Api18TraceUtils.b();
                                    }
                                    throw th2;
                                } finally {
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z10;
                    }
                } catch (Throwable th3) {
                    f38554c.readLock().unlock();
                    throw th3;
                }
            } finally {
            }
        }
    }

    private static boolean x(E e10, String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        S7.b.l(e10);
        try {
            boolean z10 = e10.d(str, i10, threadPolicy) != 0;
            S7.b.k(null);
            return z10;
        } finally {
        }
    }

    private static boolean y(String str, int i10) {
        l lVar = f38566o;
        String strB = lVar != null ? lVar.b(str) : r.b(str);
        String str2 = strB != null ? strB : str;
        S7.b.f(str, strB, i10);
        try {
            boolean zV = v(System.mapLibraryName(str2), str, strB, i10, null);
            S7.b.e(null, zV);
            return zV;
        } finally {
        }
    }

    private static Boolean z(String str) {
        Boolean boolValueOf;
        if (f38556e != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f38554c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f38556e == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean zContains = f38559h.contains(str);
                            boolean z10 = !zContains;
                            if (!zContains) {
                                System.loadLibrary(str);
                            }
                            boolValueOf = Boolean.valueOf(z10);
                        } finally {
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return boolValueOf;
                }
                f();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th2) {
            f38554c.readLock().unlock();
            throw th2;
        }
    }
}
