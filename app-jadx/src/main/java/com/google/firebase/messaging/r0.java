package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.r0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n9.InterfaceC5760d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class r0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final Context f43508a;

    /* JADX INFO: renamed from: b */
    private final Intent f43509b;

    /* JADX INFO: renamed from: c */
    private final ScheduledExecutorService f43510c;

    /* JADX INFO: renamed from: d */
    private final Queue f43511d;

    /* JADX INFO: renamed from: e */
    private o0 f43512e;

    /* JADX INFO: renamed from: f */
    private boolean f43513f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a */
        final Intent f43514a;

        /* JADX INFO: renamed from: b */
        private final n9.j f43515b = new n9.j();

        a(Intent intent) {
            this.f43514a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f43514a.getAction() + " finishing.");
            aVar.d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.p0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.a.b(this.f43505a);
                }
            }, 20L, TimeUnit.SECONDS);
            e().b(scheduledExecutorService, new InterfaceC5760d() { // from class: com.google.firebase.messaging.q0
                @Override // n9.InterfaceC5760d
                public final void a(n9.i iVar) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        public void d() {
            this.f43515b.e(null);
        }

        n9.i e() {
            return this.f43515b.a();
        }
    }

    r0(Context context, String str) {
        this(context, str, a());
    }

    private static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new W8.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    private void b() {
        while (!this.f43511d.isEmpty()) {
            ((a) this.f43511d.poll()).d();
        }
    }

    private synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f43511d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                o0 o0Var = this.f43512e;
                if (o0Var == null || !o0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f43512e.b((a) this.f43511d.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f43513f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f43513f) {
            return;
        }
        this.f43513f = true;
        try {
            if (V8.a.b().a(this.f43508a, this.f43509b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        this.f43513f = false;
        b();
    }

    synchronized n9.i d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f43510c);
            this.f43511d.add(aVar);
            c();
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f43513f = false;
            if (iBinder instanceof o0) {
                this.f43512e = (o0) iBinder;
                c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    r0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f43511d = new ArrayDeque();
        this.f43513f = false;
        Context applicationContext = context.getApplicationContext();
        this.f43508a = applicationContext;
        this.f43509b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f43510c = scheduledExecutorService;
    }
}
