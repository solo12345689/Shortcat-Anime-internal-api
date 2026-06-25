package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class k0 implements Runnable {

    /* JADX INFO: renamed from: f */
    private static final Object f43483f = new Object();

    /* JADX INFO: renamed from: g */
    private static Boolean f43484g;

    /* JADX INFO: renamed from: h */
    private static Boolean f43485h;

    /* JADX INFO: renamed from: a */
    private final Context f43486a;

    /* JADX INFO: renamed from: b */
    private final M f43487b;

    /* JADX INFO: renamed from: c */
    private final PowerManager.WakeLock f43488c;

    /* JADX INFO: renamed from: d */
    private final j0 f43489d;

    /* JADX INFO: renamed from: e */
    private final long f43490e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        private k0 f43491a;

        public a(k0 k0Var) {
            this.f43491a = k0Var;
        }

        public void a() {
            if (k0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            k0.this.f43486a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                k0 k0Var = this.f43491a;
                if (k0Var == null) {
                    return;
                }
                if (k0Var.i()) {
                    if (k0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f43491a.f43489d.l(this.f43491a, 0L);
                    context.unregisterReceiver(this);
                    this.f43491a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    k0(j0 j0Var, Context context, M m10, long j10) {
        this.f43489d = j0Var;
        this.f43486a = context;
        this.f43490e = j10;
        this.f43487b = m10;
        this.f43488c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f43483f) {
            try {
                Boolean bool = f43485h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f43485h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f43483f) {
            try {
                Boolean bool = f43484g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f43484g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f43486a     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.k0.i():boolean");
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (h(this.f43486a)) {
            this.f43488c.acquire(AbstractC3967e.f43430a);
        }
        try {
            try {
                try {
                    this.f43489d.n(true);
                    if (!this.f43487b.g()) {
                        this.f43489d.n(false);
                        if (h(this.f43486a)) {
                            try {
                                this.f43488c.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!f(this.f43486a) || i()) {
                        if (this.f43489d.r()) {
                            this.f43489d.n(false);
                        } else {
                            this.f43489d.s(this.f43490e);
                        }
                        if (h(this.f43486a)) {
                            this.f43488c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).a();
                    if (h(this.f43486a)) {
                        try {
                            this.f43488c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    this.f43489d.n(false);
                    if (h(this.f43486a)) {
                        this.f43488c.release();
                    }
                }
            } catch (Throwable th2) {
                if (h(this.f43486a)) {
                    try {
                        this.f43488c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th2;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
