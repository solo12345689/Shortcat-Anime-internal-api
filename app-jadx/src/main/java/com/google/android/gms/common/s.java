package com.google.android.gms.common;

import R8.AbstractC2115p;
import R8.Z;
import R8.a0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class s {

    /* JADX INFO: renamed from: g */
    static volatile a0 f38975g;

    /* JADX INFO: renamed from: i */
    private static Context f38977i;

    /* JADX INFO: renamed from: a */
    static final q f38969a = new h(n.H3("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* JADX INFO: renamed from: b */
    static final q f38970b = new i(n.H3("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* JADX INFO: renamed from: c */
    static final q f38971c = new j(n.H3("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: d */
    static final q f38972d = new k(n.H3("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: e */
    static final q f38973e = new l(n.H3("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: f */
    static final q f38974f = new m(n.H3("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: h */
    private static final Object f38976h = new Object();

    static synchronized void a(Context context) {
        if (f38977i != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f38977i = context.getApplicationContext();
        }
    }

    static void b() {
        if (f38975g != null) {
            return;
        }
        AbstractC2115p.l(f38977i);
        synchronized (f38976h) {
            try {
                if (f38975g == null) {
                    f38975g = Z.e(DynamiteModule.d(f38977i, DynamiteModule.f39027f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static A c(y yVar) {
        A aD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC2115p.l(f38977i);
            try {
                b();
                AbstractC2115p.l(f38977i);
                t tVarB = yVar.b(f38977i);
                try {
                    O8.q qVarS2 = yVar.a() ? f38975g.S2(tVarB) : f38975g.o3(tVarB);
                    if (qVarS2.zza()) {
                        aD = A.f(qVarS2.f(), qVarS2.d());
                    } else {
                        String strC = qVarS2.c();
                        PackageManager.NameNotFoundException nameNotFoundException = qVarS2.e() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strC == null) {
                            strC = "error checking package certificate";
                        }
                        aD = A.g(qVarS2.f(), qVarS2.e(), strC, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    aD = A.d("module call", e10);
                }
            } catch (DynamiteModule.a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                aD = A.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return aD;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    static A d(String str, n nVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, nVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static /* synthetic */ String e(boolean z10, String str, n nVar) {
        String str2 = (z10 || !f(str, nVar, true, false).f38914a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = com.google.android.gms.common.util.a.b("SHA-256");
        AbstractC2115p.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.i.a(messageDigestB.digest(nVar.G3())), Boolean.valueOf(z10), "12451000.false");
    }

    private static A f(final String str, final n nVar, final boolean z10, boolean z11) {
        try {
            b();
            AbstractC2115p.l(f38977i);
            try {
                return f38975g.B1(new v(str, nVar, z10, z11), Y8.b.G3(f38977i.getPackageManager())) ? A.b() : new z(new Callable() { // from class: com.google.android.gms.common.p
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return s.e(z10, str, nVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return A.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return A.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
