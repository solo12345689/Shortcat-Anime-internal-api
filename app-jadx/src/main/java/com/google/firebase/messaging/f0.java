package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f43440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FirebaseMessaging f43441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExecutorService f43442d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new W8.a("firebase-iid-executor"));

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f0 f43443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f43444b;

        public a(f0 f0Var) {
            this.f43443a = f0Var;
        }

        public void a() {
            if (f0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            f0 f0Var = this.f43443a;
            if (f0Var != null) {
                Context contextB = f0Var.b();
                this.f43444b = contextB;
                contextB.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            f0 f0Var = this.f43443a;
            if (f0Var != null && f0Var.d()) {
                if (f0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f43443a.f43441c.r(this.f43443a, 0L);
                Context context2 = this.f43444b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f43443a = null;
            }
        }
    }

    public f0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f43441c = firebaseMessaging;
        this.f43439a = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f43440b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    Context b() {
        return this.f43441c.s();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() throws IOException {
        try {
            if (this.f43441c.o() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (!H.i(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (b0.b().e(b())) {
            this.f43440b.acquire();
        }
        try {
            try {
                this.f43441c.J(true);
                if (!this.f43441c.D()) {
                    this.f43441c.J(false);
                    if (!b0.b().e(b())) {
                        return;
                    }
                } else if (!b0.b().d(b()) || d()) {
                    if (e()) {
                        this.f43441c.J(false);
                    } else {
                        this.f43441c.O(this.f43439a);
                    }
                    if (!b0.b().e(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!b0.b().e(b())) {
                        return;
                    }
                }
                this.f43440b.release();
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f43441c.J(false);
                if (b0.b().e(b())) {
                    this.f43440b.release();
                }
            }
        } catch (Throwable th2) {
            if (b0.b().e(b())) {
                this.f43440b.release();
            }
            throw th2;
        }
    }
}
