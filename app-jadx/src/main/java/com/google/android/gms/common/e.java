package com.google.android.gms.common;

import R8.AbstractC2115p;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e f38954c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f38955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f38956b;

    public e(Context context) {
        this.f38955a = context.getApplicationContext();
    }

    public static e a(Context context) {
        AbstractC2115p.l(context);
        synchronized (e.class) {
            try {
                if (f38954c == null) {
                    s.a(context);
                    f38954c = new e(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f38954c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static final boolean d(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.e.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    private final A e(String str, boolean z10, boolean z11) {
        A aC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return A.c("null pkg");
        }
        if (str.equals(this.f38956b)) {
            return A.b();
        }
        q qVar = s.f38969a;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                s.b();
            } catch (RemoteException | DynamiteModule.a e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
            if (s.f38975g.o()) {
                x xVar = new x(null);
                xVar.a(str);
                xVar.b(d.f(this.f38955a));
                xVar.c(true);
                aC = s.c(xVar.d());
            } else {
                threadPolicyAllowThreadDiskReads = Build.VERSION.SDK_INT;
                try {
                    PackageInfo packageInfo = this.f38955a.getPackageManager().getPackageInfo(str, threadPolicyAllowThreadDiskReads >= 28 ? 134217792 : 64);
                    boolean zF = d.f(this.f38955a);
                    if (packageInfo == null) {
                        aC = A.c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr == null || signatureArr.length != 1) {
                            aC = A.c("single cert required");
                        } else {
                            o oVar = new o(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            A aD = s.d(str2, oVar, zF, false);
                            aC = (!aD.f38914a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !s.d(str2, oVar, false, true).f38914a) ? aD : A.c("debuggable release cert app rejected");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    return A.d("no pkg ".concat(str), e11);
                }
            }
            if (aC.f38914a) {
                this.f38956b = str;
            }
            return aC;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static n f(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < nVarArr.length; i10++) {
                if (nVarArr[i10].equals(oVar)) {
                    return nVarArr[i10];
                }
            }
        }
        return null;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (d.f(this.f38955a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        A aC;
        int length;
        String[] packagesForUid = this.f38955a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            aC = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    AbstractC2115p.l(aC);
                    break;
                }
                aC = e(packagesForUid[i11], false, false);
                if (aC.f38914a) {
                    break;
                }
                i11++;
            }
        } else {
            aC = A.c("no pkgs");
        }
        aC.e();
        return aC.f38914a;
    }
}
