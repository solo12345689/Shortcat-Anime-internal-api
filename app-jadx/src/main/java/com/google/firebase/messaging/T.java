package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class T {
    public static /* synthetic */ void a(Context context, boolean z10, n9.j jVar) {
        try {
            if (!b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            V.e(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            jVar.e(null);
        }
    }

    private static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    static void c(Context context) {
        if (V.c(context)) {
            return;
        }
        e(new androidx.privacysandbox.ads.adservices.measurement.k(), context, f(context));
    }

    static boolean d(Context context) {
        if (!com.google.android.gms.common.util.l.g()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        }
        if (!b(context)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "GMS core is set for proxying");
        return true;
    }

    static n9.i e(Executor executor, final Context context, final boolean z10) {
        if (!com.google.android.gms.common.util.l.g()) {
            return n9.l.f(null);
        }
        final n9.j jVar = new n9.j();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.S
            @Override // java.lang.Runnable
            public final void run() {
                T.a(context, z10, jVar);
            }
        });
        return jVar.a();
    }

    private static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
