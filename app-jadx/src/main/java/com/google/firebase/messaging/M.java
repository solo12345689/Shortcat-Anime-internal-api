package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.revenuecat.purchases.common.Constants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f43346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43347e = 0;

    M(Context context) {
        this.f43343a = context;
    }

    static String c(X9.e eVar) {
        String strF = eVar.q().f();
        if (strF != null) {
            return strF;
        }
        String strC = eVar.q().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f43343a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo packageInfoF = f(this.f43343a.getPackageName());
        if (packageInfoF != null) {
            this.f43344b = Integer.toString(packageInfoF.versionCode);
            this.f43345c = packageInfoF.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f43344b == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f43344b;
    }

    synchronized String b() {
        try {
            if (this.f43345c == null) {
                h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f43345c;
    }

    synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f43346d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f43346d = packageInfoF.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f43346d;
    }

    synchronized int e() {
        int i10 = this.f43347e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f43343a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.l.e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f43347e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f43347e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.l.e()) {
            this.f43347e = 2;
        } else {
            this.f43347e = 1;
        }
        return this.f43347e;
    }

    boolean g() {
        return e() != 0;
    }
}
