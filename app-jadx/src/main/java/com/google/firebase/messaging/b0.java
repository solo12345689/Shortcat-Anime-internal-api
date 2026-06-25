package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b0 f43414e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43415a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f43416b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f43417c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f43418d = new ArrayDeque();

    private b0() {
    }

    private int a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strF = f(context, intent);
        if (strF != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + strF);
            }
            intent.setClassName(context.getPackageName(), strF);
        }
        try {
            if (e(context)) {
                componentNameStartService = m0.g(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return RCHTTPStatusCodes.NOT_FOUND;
        } catch (IllegalStateException e10) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
            return 402;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return RCHTTPStatusCodes.UNAUTHORIZED;
        }
    }

    static synchronized b0 b() {
        try {
            if (f43414e == null) {
                f43414e = new b0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f43414e;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f43415a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f43415a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f43415a = serviceInfo.name;
                    }
                    return this.f43415a;
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    Intent c() {
        return (Intent) this.f43418d.poll();
    }

    boolean d(Context context) {
        if (this.f43417c == null) {
            this.f43417c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f43416b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f43417c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f43416b == null) {
            this.f43416b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f43416b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f43416b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f43418d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
