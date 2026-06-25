package com.amazon.a.a.b;

import android.app.ActivityManager;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.amazon.a.a.o.e;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f34276A = "deviceDisplay";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f34277B = "deviceBrand";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f34278C = "deviceBoard";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f34279D = "androidVersion";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f34280E = "deviceModel";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f34281F = "packageFilePath";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final String f34282G = "packageName";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final String f34283H = "packageVersionName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34284a = new com.amazon.a.a.o.c("CrashReport");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f34285b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f34286c = "([a-zA-Z0-9_.]+(Exception|Error))|(at\\s.*\\(.*\\))";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f34287d = "SHA1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f34288e = "crashTime";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f34289f = "UTF-8";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f34290g = "crashId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f34291h = "threadDump";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f34292i = "stackTrace";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f34293j = "threadAllocSize";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f34294k = "threadAllocCount";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f34295l = "nativeHeapFreeSize";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f34296m = "nativeHeapSize";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f34297n = "memLowThreshold";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f34298o = "memLowFlag";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f34299p = "availableInternalMemorySize";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f34300q = "totalInternalMemorySize";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f34301r = "deviceUser";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f34302s = "deviceType";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f34303t = "deviceTime";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f34304u = "deviceTags";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f34305v = "deviceProduct";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f34306w = "deviceManufacturer";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f34307x = "deviceId";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f34308y = "deviceHost";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f34309z = "deviceFingerPrint";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final HashMap<String, String> f34310I = new LinkedHashMap();

    public c(Application application, Throwable th2) {
        try {
            a(application, th2);
        } catch (Throwable th3) {
            if (com.amazon.a.a.o.c.f34700b) {
                f34284a.b("Error collection crash report details", th3);
            }
        }
    }

    private void a(Application application, Throwable th2) {
        b();
        a(application);
        c(application);
        a(th2);
        e();
        f();
    }

    private void b() {
        this.f34310I.put(f34288e, new Date().toString());
    }

    private void c(Application application) {
        this.f34310I.put(f34280E, Build.MODEL);
        this.f34310I.put(f34279D, Build.VERSION.RELEASE);
        this.f34310I.put(f34278C, Build.BOARD);
        this.f34310I.put(f34277B, Build.BRAND);
        this.f34310I.put(f34276A, Build.DISPLAY);
        this.f34310I.put(f34309z, Build.FINGERPRINT);
        this.f34310I.put(f34308y, Build.HOST);
        this.f34310I.put(f34307x, Build.ID);
        this.f34310I.put(f34306w, Build.MANUFACTURER);
        this.f34310I.put(f34305v, Build.PRODUCT);
        this.f34310I.put(f34304u, Build.TAGS);
        this.f34310I.put(f34303t, Long.toString(Build.TIME));
        this.f34310I.put(f34302s, Build.TYPE);
        this.f34310I.put(f34301r, Build.USER);
        this.f34310I.put(f34300q, Long.toString(d()));
        this.f34310I.put(f34299p, Long.toString(c()));
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            this.f34310I.put(f34298o, Boolean.toString(memoryInfo.lowMemory));
            this.f34310I.put(f34297n, Long.toString(memoryInfo.threshold));
        }
        this.f34310I.put(f34296m, Long.toString(Debug.getNativeHeapSize()));
        this.f34310I.put(f34295l, Long.toString(Debug.getNativeHeapAllocatedSize()));
        this.f34310I.put(f34294k, Long.toString(Debug.getThreadAllocCount()));
        this.f34310I.put(f34293j, Long.toString(Debug.getThreadAllocSize()));
    }

    private long d() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    private void e() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            sb2.append("Thread : " + key.getId());
            if (!e.a(key.getName())) {
                sb2.append("/" + key.getName());
            }
            sb2.append("\n");
            sb2.append("isAlive : " + key.isAlive() + "\n");
            sb2.append("isInterrupted : " + key.isInterrupted() + "\n");
            sb2.append("isDaemon : " + key.isDaemon() + "\n");
            for (StackTraceElement stackTraceElement : value) {
                sb2.append("\tat " + stackTraceElement + "\n");
            }
            sb2.append("\n\n");
        }
        this.f34310I.put(f34291h, sb2.toString());
    }

    private void f() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f34310I.get(f34282G));
            sb2.append(this.f34310I.get(f34283H));
            sb2.append(this.f34310I.get(f34279D));
            String str = this.f34310I.get(f34292i);
            if (str != null) {
                Matcher matcher = Pattern.compile(f34286c).matcher(str);
                while (matcher.find()) {
                    sb2.append(matcher.group());
                }
            }
            this.f34310I.put(f34290g, new BigInteger(MessageDigest.getInstance(f34287d).digest(sb2.toString().getBytes("UTF-8"))).abs().toString(16));
        } catch (Exception e10) {
            if (com.amazon.a.a.o.c.f34700b) {
                f34284a.b("Error capturing crash id", e10);
            }
        }
    }

    private PackageInfo b(Application application) {
        try {
            return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (!com.amazon.a.a.o.c.f34700b) {
                return null;
            }
            f34284a.b("Unable to fetch package info", e10);
            return null;
        }
    }

    private void a(Application application) {
        PackageInfo packageInfoB = b(application);
        if (packageInfoB == null) {
            return;
        }
        this.f34310I.put(f34283H, packageInfoB.versionName);
        this.f34310I.put(f34282G, packageInfoB.packageName);
        this.f34310I.put(f34281F, application.getFilesDir().getAbsolutePath());
    }

    private void a(Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        sb2.append(stringWriter.toString());
        sb2.append("\n");
        Throwable cause = th2.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            sb2.append(stringWriter.toString());
            cause = cause.getCause();
            sb2.append("\n\n");
        }
        printWriter.close();
        this.f34310I.put(f34292i, sb2.toString());
    }

    public Map<String, String> a() {
        return this.f34310I;
    }

    private long c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }
}
