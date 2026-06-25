package com.google.android.gms.common.util;

import R8.AbstractC2115p;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import f9.F;
import f9.G;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f38998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f38999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f39000c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f38998a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f38998a = Application.getProcessName();
            } else {
                int iMyPid = f38999b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f38999b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(iMyPid);
                        sb2.append("/cmdline");
                        String string = sb2.toString();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(string));
                            try {
                                String line = bufferedReader.readLine();
                                AbstractC2115p.l(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                k.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    k.a(bufferedReader);
                }
                f38998a = strTrim;
            }
        }
        return f38998a;
    }

    public static boolean b() {
        Boolean boolValueOf = f39000c;
        if (boolValueOf == null) {
            if (l.f()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = f9.r.a(Process.class, "isIsolated", new f9.q[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new G(F.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f39000c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
